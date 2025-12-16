package com.avito.android.safety.safety_settings.deeplink;

import Ju.AbstractC14250d;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.safety.deeplink.SafetySettingsLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import po0.InterfaceC47119a;
import rv.C47918a;
import sv.C48421d;

/* compiled from: SafetySettingsAsyncLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/safety_settings/deeplink/h;", "Lev/a;", "Lcom/avito/android/safety/deeplink/SafetySettingsLink;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends AbstractC40161a<SafetySettingsLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47119a f257572f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f257573g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C25719a f257574h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.b f257575i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f257576j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: SafetySettingsAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(h.this);
        }
    }

    /* compiled from: SafetySettingsAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = ((C47918a) obj).f437156b;
            h hVar = h.this;
            if (i12 == -1) {
                hVar.j(AbstractC14250d.c.f9171c);
            } else {
                hVar.j(AbstractC14250d.b.f9170c);
            }
        }
    }

    @Inject
    public h(@Y61.k InterfaceC47119a interfaceC47119a, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k C25719a c25719a, @Y61.k a.b bVar) {
        this.f257572f = interfaceC47119a;
        this.f257573g = interfaceC4053a;
        this.f257574h = c25719a;
        this.f257575i = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        g gVar = new g(bundle, this);
        this.f257574h.b((SafetySettingsLink) deepLink, this, null, gVar);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f257576j.b(this.f257575i.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f257576j.e();
    }
}
