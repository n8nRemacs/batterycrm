package Ix0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.module.InterfaceC30235x5;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.stories.StoriesWidget;
import com.avito.android.remote.model.stories.Story;
import com.avito.android.remote.model.stories.StoryBanner;
import com.avito.android.remote.model.stories.StoryBannerStyle;
import com.avito.android.stories.adapter.StoriesItem;
import com.avito.android.stories.model.BannerType;
import com.avito.android.stories.model.StoryBannerItem;
import com.avito.android.stories.model.StoryCarouselItem;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StoriesWidgetConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIx0/b;", "LIx0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ix0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14172b implements InterfaceC14171a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8645a;

    @Inject
    public C14172b(@InterfaceC30235x5 boolean z12) {
        this.f8645a = z12;
    }

    @Override // Ix0.InterfaceC14171a
    @l
    public final StoriesItem a(@k StoriesWidget storiesWidget, @l String str, boolean z12) {
        StoryBannerItem storyBannerItem;
        if (this.f8645a) {
            return null;
        }
        if (!O2.a(storiesWidget.getStories()) && storiesWidget.getBanner() == null) {
            return null;
        }
        List<Story> stories = storiesWidget.getStories();
        if (stories == null) {
            stories = C42784z0.f406748b;
        }
        List<Story> list = stories;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zBooleanValue = false;
            if (!it.hasNext()) {
                break;
            }
            Story story = (Story) it.next();
            String id2 = story.getId();
            if (id2 == null) {
                id2 = "0";
            }
            String str2 = id2;
            DeepLink deeplink = story.getDeeplink();
            Image image = story.getImage();
            Color backgroundColor = story.getBackgroundColor();
            String title = story.getTitle();
            Boolean boolIsViewed = story.isViewed();
            if (boolIsViewed != null) {
                zBooleanValue = boolIsViewed.booleanValue();
            }
            arrayList.add(new StoryCarouselItem(str2, null, deeplink, null, image, backgroundColor, title, zBooleanValue, story.getBadgeText(), 2, null));
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((StoryCarouselItem) it2.next()).f285163b);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((StoryCarouselItem) it3.next()).f285166e = arrayList2;
        }
        StoryBanner banner = storiesWidget.getBanner();
        if (banner != null) {
            String analyticsTitle = banner.getAnalyticsTitle();
            String title2 = banner.getTitle();
            String subtitle = banner.getSubtitle();
            StoryBannerStyle style = banner.getStyle();
            UniversalColor titleColor = style != null ? style.getTitleColor() : null;
            StoryBannerStyle style2 = banner.getStyle();
            UniversalColor subtitleColor = style2 != null ? style2.getSubtitleColor() : null;
            DeepLink uri = banner.getUri();
            UniversalImage image2 = banner.getImage();
            StoryBannerStyle style3 = banner.getStyle();
            UniversalColor backgroundColor2 = style3 != null ? style3.getBackgroundColor() : null;
            BannerType.a aVar = BannerType.f285148b;
            StoryBannerStyle style4 = banner.getStyle();
            String type = style4 != null ? style4.getType() : null;
            aVar.getClass();
            storyBannerItem = new StoryBannerItem("stories_banner", analyticsTitle, title2, subtitle, titleColor, subtitleColor, uri, image2, backgroundColor2, L.f(type, "onTop") ? BannerType.f285149c : BannerType.f285150d);
        } else {
            storyBannerItem = null;
        }
        return new StoriesItem(null, 6, storyBannerItem, arrayList, 0, false, z12 ? 24 : 16, 13, storiesWidget.getAnalytics(), storiesWidget.getSettings(), str != null ? Collections.singletonMap("mid", str) : null, storiesWidget.getTitle(), 33, null);
    }
}
