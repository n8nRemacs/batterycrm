package com.avito.android.crm;

import Is.InterfaceC14152a;
import Y61.k;
import com.avito.android.util.R0;
import dagger.internal.f;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CrmDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm/c;", "Ldagger/internal/h;", "Lcom/avito/android/crm/b;", "a", "_avito_crm_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f129129d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC14152a> f129130a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f129131b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<R0> f129132c;

    /* compiled from: CrmDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm/c$a;", "", "<init>", "()V", "_avito_crm_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar, @k Provider provider, @k Provider provider2) {
        this.f129130a = provider;
        this.f129131b = fVar;
        this.f129132c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14152a interfaceC14152a = this.f129130a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f129131b.get();
        R0 r02 = this.f129132c.get();
        f129129d.getClass();
        return new b(interfaceC14152a, aVar, r02);
    }
}
