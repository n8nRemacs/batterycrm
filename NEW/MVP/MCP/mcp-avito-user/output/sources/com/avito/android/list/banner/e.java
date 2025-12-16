package com.avito.android.list.banner;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.search.suggest.PaddingInfo;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BannerItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/banner/e;", "LTV0/e;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface e extends TV0.e {

    /* compiled from: BannerItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void N4(@l AttributedText attributedText, @l AttributedText attributedText2);

    void c(@k Y41.a<G0> aVar);

    void i(@l UniversalImage universalImage);

    void qv(@l PaddingInfo paddingInfo);

    void v(@l UniversalColor universalColor);

    @l
    /* renamed from: vJ */
    PaddingInfo getF181548c();
}
