package com.avito.android.tariff.cpx.levels.deeplink;

import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff.cpx.CpxLevelsLink;
import com.avito.android.tariff.cpx.levels.CpxLevelsFragment;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;
import rv.C47919b;

/* compiled from: CpxLevelsDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/deeplink/b;", "Lev/a;", "Lcom/avito/android/tariff/cpx/CpxLevelsLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends AbstractC40161a<CpxLevelsLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f297043f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f297044g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f297045h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f297046i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: CpxLevelsDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "result", "Lkotlin/G0;", "accept", "(Lrv/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Bundle bundle = ((C47919b) obj).f437159b;
            DeepLink deepLink = (DeepLink) (bundle == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("tariff_cpx_info_advance_key_deeplink", DeepLink.class) : bundle.getParcelable("tariff_cpx_info_advance_key_deeplink"));
            b bVar = b.this;
            if (deepLink == null) {
                bVar.j(CpxLevelsLink.b.a.f295528b);
            } else {
                bVar.i(CpxLevelsLink.b.C8990b.f295529b, bVar.f297045h, deepLink);
            }
        }
    }

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.d dVar, @k a.f fVar) {
        this.f297043f = dVar;
        this.f297044g = fVar;
        this.f297045h = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        CpxLevelsFragment.a aVar = CpxLevelsFragment.f297006w0;
        String str2 = ((CpxLevelsLink) deepLink).f295527b;
        aVar.getClass();
        this.f297043f.w1(CpxLevelsFragment.a.a(str2), "TariffCpxLevelsDeeplinkHandler_" + this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f297046i.b(this.f297044g.l1("TariffCpxLevelsDeeplinkHandler_" + this.f395444b).t0(new a()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f297046i.e();
    }
}
