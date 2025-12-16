package com.avito.android.deep_linking;

import Ic.InterfaceC14058a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lW.C43693c;
import lW.InterfaceC43691a;

/* compiled from: AppLinkDelegate_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/f;", "Ldagger/internal/h;", "Lcom/avito/android/deep_linking/e;", "a", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deep_linking.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29668f implements dagger.internal.h<C29667e> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f132905f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f132906a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.A f132907b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43693c f132908c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Ic.d f132909d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.deeplink_handler.mapping.checker.c> f132910e;

    /* compiled from: AppLinkDelegate_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/f$a;", "", "<init>", "()V", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deep_linking.f$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C29668f(@Y61.k Provider provider, @Y61.k com.avito.android.location.A a12, @Y61.k C43693c c43693c, @Y61.k Ic.d dVar, @Y61.k Provider provider2) {
        this.f132906a = provider;
        this.f132907b = a12;
        this.f132908c = c43693c;
        this.f132909d = dVar;
        this.f132910e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f132906a.get();
        com.avito.android.location.r rVar = (com.avito.android.location.r) this.f132907b.get();
        InterfaceC43691a interfaceC43691a = (InterfaceC43691a) this.f132908c.get();
        InterfaceC14058a interfaceC14058a = (InterfaceC14058a) this.f132909d.get();
        com.avito.android.deeplink_handler.mapping.checker.c cVar = this.f132910e.get();
        f132905f.getClass();
        return new C29667e(interfaceC35745a5, rVar, interfaceC43691a, interfaceC14058a, cVar);
    }
}
