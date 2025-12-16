package com.avito.android.extended_profile.deep_linking;

import Ju.AbstractC14250d;
import Y41.l;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.avito.android.Z0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PublicProfileLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.extended_profile.InterfaceC30476n;
import com.avito.android.remote.model.FloatingBuyBlock;
import com.avito.android.util.H;
import com.google.gson.Gson;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.kotlin.A1;
import java.net.URLDecoder;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PublicProfileLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile/deep_linking/b;", "Lev/a;", "Lcom/avito/android/deep_linking/links/PublicProfileLink;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends AbstractC40161a<PublicProfileLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC30476n f149501f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f149502g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f149503h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Z0 f149504i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Gson f149505j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final x f149506k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f149507l = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PublicProfileLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    /* compiled from: PublicProfileLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "invoke", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile.deep_linking.b$b, reason: collision with other inner class name */
    public static final class C4386b extends N implements l<C47918a, G0> {
        public C4386b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C47918a c47918a) {
            b.this.j(AbstractC14250d.c.f9171c);
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k InterfaceC30476n interfaceC30476n, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k Z0 z02, @k Gson gson, @k x xVar) {
        this.f149501f = interfaceC30476n;
        this.f149502g = interfaceC4053a;
        this.f149503h = bVar;
        this.f149504i = z02;
        this.f149505j = gson;
        this.f149506k = xVar;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        Object bVar;
        FloatingBuyBlock floatingBuyBlock;
        String str2;
        String str3;
        String str4;
        PublicProfileLink publicProfileLink = (PublicProfileLink) deepLink;
        String str5 = (String) publicProfileLink.f133625e.get("floatingBuyBlock");
        if (str5 != null) {
            try {
                int i12 = Z.f406624c;
                Map map = (Map) this.f149505j.e(URLDecoder.decode(str5, Constants.ENCODING), new com.avito.android.extended_profile.deep_linking.a().getType());
                String str6 = (String) map.get("title");
                bVar = (str6 == null || (str2 = (String) map.get("price")) == null || (str3 = (String) map.get("imagePreviewUrl")) == null || (str4 = (String) map.get("buyButtonDeepLink")) == null) ? null : new FloatingBuyBlock(str6, str2, str3, this.f149506k.b(str4));
            } catch (Throwable th2) {
                int i13 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            if (bVar instanceof Z.b) {
                bVar = null;
            }
            floatingBuyBlock = (FloatingBuyBlock) bVar;
        } else {
            floatingBuyBlock = null;
        }
        Intent intentA = this.f149501f.a(publicProfileLink.f133622b, publicProfileLink.f133623c, publicProfileLink.f133624d, bundle != null ? H.b(bundle) : null, floatingBuyBlock);
        Z0 z02 = this.f149504i;
        z02.getClass();
        n<Object> nVar = Z0.f67595D[8];
        boolean zBooleanValue = ((Boolean) z02.f67608k.a().invoke()).booleanValue();
        a.InterfaceC4053a interfaceC4053a = this.f149502g;
        if (zBooleanValue) {
            interfaceC4053a.J(intentA, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        } else {
            interfaceC4053a.R(intentA, com.avito.android.deeplink_handler.view.b.f134588l);
            j(AbstractC14250d.c.f9171c);
        }
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        Z0 z02 = this.f149504i;
        z02.getClass();
        n<Object> nVar = Z0.f67595D[8];
        if (((Boolean) z02.f67608k.a().invoke()).booleanValue()) {
            this.f149507l.b(A1.h(this.f149503h.Q().N(new a()), null, new C4386b(), 3));
        }
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f149507l.e();
    }
}
