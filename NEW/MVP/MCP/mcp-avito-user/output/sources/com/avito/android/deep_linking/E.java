package com.avito.android.deep_linking;

import Ag.CallableC13028a;
import Ic.InterfaceC14058a;
import Iu.C14159a;
import android.net.Uri;
import android.os.Bundle;
import com.avito.android.CalledFrom;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import lW.InterfaceC43691a;
import uc.InterfaceC49033h;

/* compiled from: DeepLinkingPresenter.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/E;", "Lcom/avito/android/deep_linking/D;", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes12.dex */
public final class E implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f132818a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f132819b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f132820c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43691a f132821d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f132822e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14058a f132823f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f132824g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f132825h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P f132826i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49033h f132827j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f132828k = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f132829l = new com.avito.android.util.architecture_components.D<>();

    /* compiled from: DeepLinkingPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f132830b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return kotlin.jvm.internal.L.f(((C43501a) obj).f413260a.f134521b, "deep_linking_activity");
        }
    }

    /* compiled from: DeepLinkingPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f132829l.postValue(G0.f406611a);
        }
    }

    @Inject
    public E(@Y61.k com.avito.android.util.C c12, @Y61.k x xVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC43691a interfaceC43691a, @Y61.k com.avito.android.location.r rVar, @Y61.k InterfaceC14058a interfaceC14058a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a52, @Y61.k com.avito.android.P p12, @Y61.k InterfaceC49033h interfaceC49033h) {
        this.f132818a = c12;
        this.f132819b = xVar;
        this.f132820c = interfaceC35745a5;
        this.f132821d = interfaceC43691a;
        this.f132822e = rVar;
        this.f132823f = interfaceC14058a;
        this.f132824g = aVar;
        this.f132825h = interfaceC35745a52;
        this.f132826i = p12;
        this.f132827j = interfaceC49033h;
        aVar.d9().N(a.f132830b).t0(new b());
    }

    @Override // com.avito.android.deep_linking.D
    public final void E(@Y61.k Uri uri) {
        com.avito.android.P p12 = this.f132826i;
        p12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[61];
        if (!((Boolean) p12.f67391U.a().invoke()).booleanValue()) {
            a(uri);
        } else {
            this.f132828k.b(io.reactivex.rxjava3.core.z.W(new CallableC13028a(11, this, uri)).x0(this.f132825h.a()).s0());
        }
    }

    @Override // com.avito.android.deep_linking.D
    /* renamed from: Z0, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF132829l() {
        return this.f132829l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Uri uri) {
        String locationId;
        final V2 v22 = V2.f318762a;
        v22.g("DeepLinkingPresenter", "started processing " + uri + " deeplink");
        DeepLink deepLinkE = this.f132819b.e(uri);
        boolean z12 = deepLinkE instanceof NoMatchLink;
        com.avito.android.util.architecture_components.D<G0> d12 = this.f132829l;
        if (z12) {
            v22.d("DeepLinkingPresenter", "finishing - found no matching deeplink for " + uri);
            d12.postValue(G0.f406611a);
            return;
        }
        com.avito.android.deep_linking.links.storage.a aVar = com.avito.android.deep_linking.links.storage.a.f134018a;
        Class<?> cls = deepLinkE.getClass();
        C14159a c14159a = aVar.getClassesToMetaInfo().get(cls);
        if (c14159a == null) {
            throw new IllegalStateException(("Can't find isPublic for " + cls.getCanonicalName() + ". You must annotate it with @DeepLinkMeta and add `convention.deeplinks-generator` to a gradle module, which contains this link.").toString());
        }
        if (!c14159a.f8596c) {
            if (com.avito.android.util.E.a(this.f132818a.getF125491k())) {
                throw new RuntimeException("Failed to launch the deeplink: " + deepLinkE.getClass().getSimpleName().concat(" is not declared as public deeplink. ") + "\nMost likely you want to launch a screen for performance testing - in this case, make deeplink public for `benchmark` build type, or use Intent directly instead.");
            }
            v22.d("DeepLinkingPresenter", "finishing - deeplink " + deepLinkE.getClass().getSimpleName() + " is not public");
            d12.postValue(G0.f406611a);
            return;
        }
        CalledFrom.AppLinking appLinking = new CalledFrom.AppLinking(deepLinkE.getPath());
        com.avito.android.deep_linking.links.s sVar = deepLinkE instanceof com.avito.android.deep_linking.links.s ? (com.avito.android.deep_linking.links.s) deepLinkE : null;
        if (sVar != null && (locationId = sVar.getLocationId()) != null) {
            B0 b0D = this.f132822e.d();
            InterfaceC35745a5 interfaceC35745a5 = this.f132820c;
            b0D.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).u0(new F(this, locationId), new l41.g() { // from class: com.avito.android.deep_linking.G
                @Override // l41.g
                public final void accept(Object obj) {
                    v22.f((Throwable) obj);
                }
            });
        }
        this.f132823f.a(uri);
        this.f132827j.a(uri);
        Bundle bundle = new Bundle();
        com.avito.android.util.H.c(bundle, appLinking);
        this.f132824g.r6(bundle, deepLinkE, "deep_linking_activity");
    }

    @Override // com.avito.android.deep_linking.D
    public final void stop() {
        this.f132828k.e();
    }
}
