package com.esiasdk.android;

import androidx.view.M0;
import androidx.view.N0;
import com.esiasdk.android.esiaLoginClient.TokenParameters;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.channels.A;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: EsiaAuthVm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/esiasdk/android/n;", "Landroidx/lifecycle/M0;", "<init>", "()V", "esiasdk-1.1.3(6)_nonPguRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.esiasdk.android.domain.a f339722E = com.esiasdk.android.domain.a.f339689a;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Z1<Boolean> f339723J = p2.a(Boolean.TRUE);

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final Z1<Boolean> f339724K = p2.a(Boolean.FALSE);

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C43108m f339725L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<String> f339726M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C43108m f339727N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<TokenParameters> f339728O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C43108m f339729P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<EsiaErrorResponse> f339730Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C43108m f339731R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<EsiaErrorResponse> f339732S;

    public n() {
        C43108m c43108mA = A.a(0, null, null, 7);
        this.f339725L = c43108mA;
        this.f339726M = C43175k.Q(c43108mA);
        C43108m c43108mA2 = A.a(0, null, null, 7);
        this.f339727N = c43108mA2;
        this.f339728O = C43175k.Q(c43108mA2);
        C43108m c43108mA3 = A.a(0, null, null, 7);
        this.f339729P = c43108mA3;
        this.f339730Q = C43175k.Q(c43108mA3);
        C43108m c43108mA4 = A.a(0, null, null, 7);
        this.f339731R = c43108mA4;
        this.f339732S = C43175k.Q(c43108mA4);
    }

    public static void le(n nVar, Y41.l lVar, Y41.l lVar2, Y41.l lVar3) {
        C43259k.d(N0.a(nVar), null, null, new m(C43262l0.f411947c, lVar2, lVar3, lVar, null), 3);
    }

    public final void ke(Exception exc) {
        boolean z12 = exc instanceof EsiaErrorResponse;
        C43108m c43108m = this.f339729P;
        if (z12) {
            c43108m.w(exc);
            return;
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        c43108m.w(new EsiaErrorResponse(null, null, message, 3, null));
    }
}
