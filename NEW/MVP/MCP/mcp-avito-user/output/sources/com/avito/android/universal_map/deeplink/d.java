package com.avito.android.universal_map.deeplink;

import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ToolbarSettings;
import com.avito.android.deep_linking.links.UniversalMapLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: UniversalMapDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/deeplink/d;", "Lev/a;", "Lcom/avito/android/deep_linking/links/UniversalMapLink;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC40161a<UniversalMapLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f304766f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.universal_map.e f304767g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f304768h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f304769i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: UniversalMapDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(d.this);
        }
    }

    /* compiled from: UniversalMapDeepLinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink;
            C47918a c47918a = (C47918a) obj;
            int i12 = c47918a.f437156b;
            d dVar = d.this;
            if (i12 != -1) {
                dVar.j(UniversalMapLink.b.a.f133765b);
                return;
            }
            Intent intent = c47918a.f437157c;
            if (intent != null) {
                deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extra_universal_map_result_link", DeepLink.class) : intent.getParcelableExtra("extra_universal_map_result_link"));
            } else {
                deepLink = null;
            }
            dVar.j(new UniversalMapLink.b.C4017b(deepLink));
        }
    }

    @Inject
    public d(@k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.universal_map.e eVar, @k a.b bVar) {
        this.f304766f = interfaceC4053a;
        this.f304767g = eVar;
        this.f304768h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ToolbarSettings toolbarSettings;
        UniversalMapLink universalMapLink = (UniversalMapLink) deepLink;
        ToolbarSettings toolbarSettings2 = universalMapLink.f133760f;
        if (toolbarSettings2 == null) {
            String str2 = universalMapLink.f133759e;
            if (str2 != null) {
                toolbarSettings = new ToolbarSettings(str2, true);
            } else {
                toolbarSettings2 = null;
                toolbarSettings = toolbarSettings2;
            }
        } else {
            toolbarSettings = toolbarSettings2;
        }
        this.f304766f.J(this.f304767g.a(universalMapLink.f133756b, universalMapLink.f133757c, universalMapLink.f133758d, toolbarSettings, universalMapLink.f133761g, universalMapLink.f133762h, universalMapLink.f133763i, universalMapLink.f133764j), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f304769i.b(this.f304768h.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f304769i.e();
    }
}
