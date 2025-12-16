package com.avito.android.stories;

import androidx.compose.runtime.internal.P;
import com.avito.android.stories.model.StoryCarouselItem;
import com.avito.android.util.C35755b0;
import com.avito.android.util.Kundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: StoriesSessionViewedInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/u;", "Lcom/avito/android/stories/t;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public Kundle f285298a;

    @Override // com.avito.android.stories.t
    public final void a(@Y61.l List<StoryCarouselItem> list) {
        if (list != null) {
            Kundle kundle = this.f285298a;
            List stringArrayList = kundle != null ? kundle.f318647b.getStringArrayList("viewed_stories_key") : null;
            if (stringArrayList == null) {
                stringArrayList = C42784z0.f406748b;
            }
            for (StoryCarouselItem storyCarouselItem : list) {
                if (stringArrayList.contains(storyCarouselItem.f285163b)) {
                    storyCarouselItem.f285170i = true;
                }
            }
        }
    }

    @Override // com.avito.android.stories.t
    public final void b(@Y61.k List<String> list) {
        Kundle kundle = this.f285298a;
        Collection stringArrayList = kundle != null ? kundle.f318647b.getStringArrayList("viewed_stories_key") : null;
        if (stringArrayList == null) {
            stringArrayList = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList(stringArrayList);
        arrayList.addAll(list);
        Kundle kundle2 = this.f285298a;
        if (kundle2 != null) {
            kundle2.f318647b.putStringArrayList("viewed_stories_key", C35755b0.a(arrayList));
        }
    }

    @Override // com.avito.android.stories.t
    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Kundle getF285298a() {
        return this.f285298a;
    }

    @Override // com.avito.android.stories.t
    public final void invalidate() {
        Kundle kundle = this.f285298a;
        if (kundle != null) {
            kundle.f318647b.clear();
        }
    }
}
