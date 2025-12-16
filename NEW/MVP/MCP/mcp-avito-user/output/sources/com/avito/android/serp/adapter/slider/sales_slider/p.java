package com.avito.android.serp.adapter.slider.sales_slider;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SalesSliderState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/slider/sales_slider/p;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final AttributedText f272334a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final UniversalImage f272335b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.slider.l f272336c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f272337d;

    public p(@Y61.l AttributedText attributedText, @Y61.k UniversalImage universalImage, @Y61.k com.avito.android.serp.adapter.slider.l lVar, boolean z12) {
        this.f272334a = attributedText;
        this.f272335b = universalImage;
        this.f272336c = lVar;
        this.f272337d = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f272334a, pVar.f272334a) && L.f(this.f272335b, pVar.f272335b) && this.f272336c.equals(pVar.f272336c) && this.f272337d == pVar.f272337d;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f272334a;
        return Boolean.hashCode(this.f272337d) + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f272336c.hashCode() + com.avito.android.actions_sheet.a.a((attributedText == null ? 0 : attributedText.hashCode()) * 31, 31, this.f272335b)) * 31, 31, false), 31, false);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SalesSliderState(title=");
        sb2.append(this.f272334a);
        sb2.append(", image=");
        sb2.append(this.f272335b);
        sb2.append(", salesSliderListener=");
        sb2.append(this.f272336c);
        sb2.append(", isReleased=false, isStartedSwipe=false, isVibrationEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f272337d, ')');
    }
}
