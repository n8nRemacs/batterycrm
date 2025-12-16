package com.avito.android.deep_linking.universal_deeplink;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.deep_linking.C29667e;
import com.avito.android.deep_linking.C29668f;
import com.avito.android.deep_linking.C29672j;
import com.avito.android.deep_linking.InterfaceC29669g;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UniversalDeepLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/universal_deeplink/f;", "Ldagger/internal/h;", "Lcom/avito/android/deep_linking/universal_deeplink/e;", "a", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements h<e> {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f134054j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C29672j f134055a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<InterfaceC35745a5> f134056b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dagger.internal.f f134057c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C29668f f134058d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final dv.b f134059e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final dv.b f134060f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final dv.b f134061g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C35868p2 f134062h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Xu.c f134063i;

    /* compiled from: UniversalDeepLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/universal_deeplink/f$a;", "", "<init>", "()V", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k C29672j c29672j, @k Provider provider, @k dagger.internal.f fVar, @k C29668f c29668f, @k dv.b bVar, @k dv.b bVar2, @k dv.b bVar3, @k C35868p2 c35868p2, @k Xu.c cVar) {
        this.f134055a = c29672j;
        this.f134056b = provider;
        this.f134057c = fVar;
        this.f134058d = c29668f;
        this.f134059e = bVar;
        this.f134060f = bVar2;
        this.f134061g = bVar3;
        this.f134062h = c35868p2;
        this.f134063i = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29669g interfaceC29669g = (InterfaceC29669g) this.f134055a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f134056b.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f134057c.get();
        C29667e c29667e = (C29667e) this.f134058d.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f134059e.get();
        a.g gVar = (a.g) this.f134060f.get();
        a.i iVar = (a.i) this.f134061g.get();
        InterfaceC35845m2 interfaceC35845m2 = (InterfaceC35845m2) this.f134062h.get();
        Resources resources = (Resources) this.f134063i.get();
        f134054j.getClass();
        return new e(interfaceC29669g, interfaceC35745a5, aVar, c29667e, interfaceC4053a, gVar, iVar, interfaceC35845m2, resources);
    }
}
