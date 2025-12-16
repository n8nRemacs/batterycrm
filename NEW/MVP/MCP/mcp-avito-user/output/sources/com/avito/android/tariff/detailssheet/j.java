package com.avito.android.tariff.detailssheet;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff.deeplink.TariffDetailsSheetLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: TariffDetailsSheetLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/detailssheet/j;", "Lev/a;", "Lcom/avito/android/tariff/deeplink/TariffDetailsSheetLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends AbstractC40161a<TariffDetailsSheetLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f297425f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.b f297426g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final f f297427h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f297428i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: TariffDetailsSheetLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(j.this);
        }
    }

    /* compiled from: TariffDetailsSheetLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            j.this.j(((C47918a) obj).f437156b == -1 ? TariffDetailsSheetLink.a.b.f297394b : TariffDetailsSheetLink.a.C9081a.f297393b);
        }
    }

    @Inject
    public j(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k f fVar) {
        this.f297425f = interfaceC4053a;
        this.f297426g = bVar;
        this.f297427h = fVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f297425f.J(this.f297427h.a((TariffDetailsSheetLink) deepLink).addFlags(603979776), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f297428i.b(this.f297426g.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f297428i.e();
    }
}
