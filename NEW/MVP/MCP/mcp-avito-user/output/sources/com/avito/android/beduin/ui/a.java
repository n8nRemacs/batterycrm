package com.avito.android.beduin.ui;

import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.beduin.ui.universal.h;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.BottomSheetContentPaddings;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.disposables.c;
import java.io.Serializable;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: BeduinUniversalPageLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/ui/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/BeduinUniversalPageLink;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40161a<BeduinUniversalPageLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f104059f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final h f104060g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f104061h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final c f104062i = new c();

    /* compiled from: BeduinUniversalPageLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin.ui.a$a, reason: collision with other inner class name */
    public static final class C3117a<T> implements r {
        public C3117a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    @Inject
    public a(@k a.b bVar, @k h hVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f104059f = bVar;
        this.f104060g = hVar;
        this.f104061h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        BeduinUniversalPageLink beduinUniversalPageLink = (BeduinUniversalPageLink) deepLink;
        BottomSheetContentPaddings bottomSheetContentPaddings = beduinUniversalPageLink.f133044h;
        String str2 = bottomSheetContentPaddings != null ? bottomSheetContentPaddings.f133059b : null;
        this.f104061h.J(this.f104060g.a(beduinUniversalPageLink.f133038b, beduinUniversalPageLink.f133041e, beduinUniversalPageLink.f133039c, beduinUniversalPageLink.f133040d, beduinUniversalPageLink.f133042f, beduinUniversalPageLink.f133043g, str2), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f104062i.b(this.f104059f.Q().N(new C3117a()).t0(new g() { // from class: com.avito.android.beduin.ui.a.b
            @Override // l41.g
            public final void accept(Object obj) {
                a aVar = a.this;
                Intent intent = ((C47918a) obj).f437157c;
                if (intent == null || !intent.hasExtra("beduin_result_params_key")) {
                    aVar.j(BeduinUniversalPageLink.b.a.f133045b);
                    return;
                }
                Serializable serializableExtra = intent.getSerializableExtra("beduin_result_params_key");
                Map mapC = serializableExtra instanceof Map ? (Map) serializableExtra : null;
                if (mapC == null) {
                    mapC = P0.c();
                }
                aVar.j(new BeduinUniversalPageLink.b.C3987b(mapC));
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f104062i.e();
    }
}
