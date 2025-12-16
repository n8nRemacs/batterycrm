package com.avito.android.model_card.routing;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ModelCardLink;
import com.avito.android.deeplink_handler.view.a;
import com.google.gson.Gson;
import ev.AbstractC40161a;
import ix.InterfaceC42124a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kx.C43507a;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ModelCardDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/model_card/routing/b;", "Lev/a;", "Lcom/avito/android/deep_linking/links/ModelCardLink;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends AbstractC40161a<ModelCardLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f198032f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final h f198033g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f198034h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.b f198035i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f198036j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final u3.f<SimpleTestGroupWithNone> f198037k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final C43507a f198038l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final h31.e<Gson> f198039m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f198040n = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: o, reason: collision with root package name */
    @l
    public ModelCardLink.FromTab f198041o;

    /* compiled from: ModelCardDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    /* compiled from: ModelCardDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.model_card.routing.b$b, reason: collision with other inner class name */
    public static final class C5834b<T> implements l41.g {
        public C5834b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b bVar;
            ModelCardLink.FromTab fromTab;
            if (((C47918a) obj).f437156b != 0 || (fromTab = (bVar = b.this).f198041o) == null) {
                return;
            }
            bVar.i(new ModelCardLink.a(fromTab), bVar.f198036j, new DeepLink[0]);
        }
    }

    @Inject
    public b(@k Context context, @k h hVar, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @InterfaceC42124a @k u3.f<SimpleTestGroupWithNone> fVar, @k C43507a c43507a, @k h31.e<Gson> eVar) {
        this.f198032f = context;
        this.f198033g = hVar;
        this.f198034h = interfaceC4053a;
        this.f198035i = bVar;
        this.f198036j = aVar;
        this.f198037k = fVar;
        this.f198038l = c43507a;
        this.f198039m = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    @Override // ev.AbstractC40161a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.os.Bundle r17, com.avito.android.deep_linking.links.DeepLink r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.model_card.routing.b.a(android.os.Bundle, com.avito.android.deep_linking.links.DeepLink, java.lang.String):void");
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f198040n.b(this.f198035i.Q().N(new a()).t0(new C5834b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f198040n.e();
    }
}
