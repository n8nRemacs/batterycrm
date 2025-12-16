package com.avito.android.tariff_lf_constructor.configure.landing.deeplink;

import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff_lf_constructor.configure.landing.ConstructorLandingFragment;
import com.avito.android.tariff_lf_constructor.configure.landing.deeplink.TariffConfigureLandingLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;
import rv.C47919b;

/* compiled from: TariffConstructorLandingLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/deeplink/a;", "Lev/a;", "Lcom/avito/android/tariff_lf_constructor/configure/landing/deeplink/TariffConfigureLandingLink;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC40161a<TariffConfigureLandingLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f299648f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f299649g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f299650h = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: TariffConstructorLandingLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "result", "Lkotlin/G0;", "accept", "(Lrv/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.tariff_lf_constructor.configure.landing.deeplink.a$a, reason: collision with other inner class name */
    public static final class C9166a<T> implements g {
        public C9166a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = a.this;
            int i12 = Build.VERSION.SDK_INT;
            Bundle bundle = ((C47919b) obj).f437159b;
            aVar.j(((ConstructorLandingFragment.Result) (i12 >= 34 ? (Parcelable) bundle.getParcelable("result_key", ConstructorLandingFragment.Result.class) : bundle.getParcelable("result_key"))) instanceof ConstructorLandingFragment.Result.Success ? TariffConfigureLandingLink.b.C9165b.f299647b : TariffConfigureLandingLink.b.a.f299646b);
        }
    }

    @Inject
    public a(@k a.d dVar, @k a.f fVar) {
        this.f299648f = dVar;
        this.f299649g = fVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ConstructorLandingFragment.f299624s0.getClass();
        this.f299648f.w1(new ConstructorLandingFragment(), "ConstructorLandingDialog" + this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f299650h.b(this.f299649g.l1("ConstructorLandingDialog" + this.f395444b).t0(new C9166a()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f299650h.e();
    }
}
