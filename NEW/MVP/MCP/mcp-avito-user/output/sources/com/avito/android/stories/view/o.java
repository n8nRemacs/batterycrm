package com.avito.android.stories.view;

import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StoryCarouselItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/view/o;", "LTV0/e;", "_avito_stories_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface o extends TV0.e {

    /* compiled from: StoryCarouselItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    z<G0> A();

    void Ji(@Y61.l Color color, @Y61.l Image image);

    void d(@Y61.l Y41.a<G0> aVar);

    void n4(@Y61.l String str);

    void q0(float f12);

    void setTitle(@Y61.l String str);

    void setViewed(boolean z12);
}
