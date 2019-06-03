package levkovskiy.dev.testapp.model

data class ResizedIconsItem(val width: Int = 0,
                            val url: String = "",
                            val height: Int = 0)


data class Preview(val images: List<ImagesItem>?,
                   val enabled: Boolean = false)


data class Data(val data: Data,
                val kind: String = "")


data class Source(val width: Int = 0,
                  val url: String = "",
                  val height: Int = 0)


data class ResolutionsItem(val width: Int = 0,
                           val url: String = "",
                           val height: Int = 0)


data class Obfuscated(val resolutions: List<ResolutionsItem>?,
                      val source: Source
)


data class Variants(val nsfw: Nsfw,
                    val obfuscated: Obfuscated
)


data class ImagesItem(val resolutions: List<ResolutionsItem>?,
                      val source: Source,
                      val variants: Variants,
                      val id: String = "")


data class Nsfw(val resolutions: List<ResolutionsItem>?,
                val source: Source
)


data class ChildrenItem(val data: Data,
                        val kind: String = "")


data class AllAwardingsItem(val iconWidth: Int = 0,
                            val iconUrl: String = "",
                            val coinReward: Int = 0,
                            val daysOfDripExtension: Int = 0,
                            val iconHeight: Int = 0,
                            val count: Int = 0,
                            val description: String = "",
                            val resizedIcons: List<ResizedIconsItem>?,
                            val coinPrice: Int = 0,
                            val awardType: String = "",
                            val isEnabled: Boolean = false,
                            val name: String = "",
                            val id: String = "",
                            val daysOfPremium: Int = 0)


