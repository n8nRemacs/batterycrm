package com.avito.android.lottie;

import Y61.k;
import Y61.l;
import com.airbnb.lottie.F;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import kotlin.Metadata;

/* compiled from: AvitoLottieLogger.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lottie/a;", "Lcom/airbnb/lottie/F;", "_common_lottie_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements F {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AW.a f182970a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f182971b;

    public a(@k AW.a aVar, @k InterfaceC28373a interfaceC28373a) {
        this.f182970a = aVar;
        this.f182971b = interfaceC28373a;
    }

    @Override // com.airbnb.lottie.F
    public final void a(@l String str, @l Throwable th2) {
        this.f182970a.getClass();
    }

    @Override // com.airbnb.lottie.F
    public final void b(@l String str) {
        if (str == null) {
            str = "";
        }
        this.f182970a.j("Lottie", str, null);
    }

    @Override // com.airbnb.lottie.F
    public final void debug(@l String str) {
        if (str == null) {
            str = "";
        }
        this.f182970a.c("Lottie", str, null);
    }

    @Override // com.airbnb.lottie.F
    public final void error(@l String str, @l Throwable th2) {
        this.f182970a.getClass();
        if (str == null) {
            str = "";
        }
        this.f182971b.c(new NonFatalErrorEvent(str, th2, null, null, 12, null));
    }
}
