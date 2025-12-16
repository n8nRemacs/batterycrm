package com.avito.android.serp.adapter.slider;

import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC22983P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import rn0.InterfaceC47690b;

/* compiled from: SliderPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/slider/h;", "Lcom/avito/android/serp/adapter/slider/g;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f272266b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f272267c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public k f272268d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public String f272269e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public InterfaceC22983P f272270f;

    /* compiled from: SliderPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/adapter/slider/h$a;", "", "<init>", "()V", "", "CLICK_ON_SLIDER", "Ljava/lang/String;", "SWIPE_ON_SLIDER", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public h(@Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k h31.e eVar) {
        this.f272266b = eVar;
        this.f272267c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        SliderItem sliderItem = (SliderItem) aVar;
        this.f272269e = kVar.e(sliderItem.f272247c);
        kVar.fB(sliderItem, new i(this, i12, sliderItem));
        kVar.D20(this.f272270f);
        kVar.eI(sliderItem.f272255k);
        if (this.f272268d == null) {
            this.f272268d = kVar;
            this.f272267c.h(i12, "slider_widget", this.f272269e, null, null, (56 & 32) != 0 ? null : null, (56 & 64) != 0 ? null : sliderItem.f272256l);
        }
    }

    @Override // com.avito.android.serp.adapter.slider.g
    public final void U3(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f272270f = interfaceC22983P;
    }

    @Override // com.avito.android.serp.adapter.slider.g
    public final void f2() {
        this.f272270f = null;
    }
}
