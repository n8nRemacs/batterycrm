package com.avito.android.iac_dialer_watcher.impl_module.watcher;

import BL.a;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.L;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacWatcherImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/watcher/a;", "LBL/a;", "a", "b", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class a implements BL.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.iac_dialer_watcher.impl_module.watcher.d> f168148a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f168149b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<a.b> f168150c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public Object f168151d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final L f168152e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f168153f;

    /* compiled from: IacWatcherImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/watcher/a$a;", "", "<init>", "()V", "", "RELEASING_TIMEOUT", "J", "", "TAG_IMPL", "Ljava/lang/String;", "WATCHDOG_TIMEOUT", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer_watcher.impl_module.watcher.a$a, reason: collision with other inner class name */
    public static final class C4973a {
        public /* synthetic */ C4973a(C42822w c42822w) {
            this();
        }

        public C4973a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IacWatcherImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/watcher/a$b;", "", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f168154b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f168155c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f168156d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ b[] f168157e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f168158f;

        static {
            b bVar = new b("WATCH_DOGGING", 0);
            f168154b = bVar;
            b bVar2 = new b("ACTIVE_IN_IAC_STATE", 1);
            f168155c = bVar2;
            b bVar3 = new b("RELEASING", 2);
            f168156d = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            f168157e = bVarArr;
            f168158f = kotlin.enums.c.a(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f168157e.clone();
        }
    }

    /* compiled from: IacWatcherImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a.C0053a f168160m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a.C0053a c0053a) {
            super(0);
            this.f168160m = c0053a;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.a(a.this, this.f168160m, b.f168154b);
            return G0.f406611a;
        }
    }

    /* compiled from: IacWatcherImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a.C0053a f168162m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a.C0053a c0053a) {
            super(0);
            this.f168162m = c0053a;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.a(a.this, this.f168162m, b.f168156d);
            return G0.f406611a;
        }
    }

    static {
        new C4973a(null);
    }

    @Inject
    public a(@Y61.k h31.e<com.avito.android.iac_dialer_watcher.impl_module.watcher.d> eVar, @Y61.k m mVar) {
        this.f168148a = eVar;
        this.f168149b = mVar;
        com.jakewharton.rxrelay3.d dVarM0 = com.jakewharton.rxrelay3.b.N0(new a.b(B0.f406639b)).M0();
        this.f168150c = dVarM0;
        this.f168151d = P0.c();
        this.f168152e = dVarM0.D(io.reactivex.rxjava3.internal.functions.a.f401991a);
        this.f168153f = new AtomicBoolean(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public static final void a(a aVar, a.C0053a c0053a, b bVar) {
        synchronized (aVar) {
            if (aVar.f168151d.get(c0053a) == bVar) {
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) aVar.f168151d);
                linkedHashMap.remove(c0053a);
                aVar.b(linkedHashMap);
            }
        }
    }

    @Override // BL.a
    @Y61.k
    /* renamed from: M0, reason: from getter */
    public final L getF168152e() {
        return this.f168152e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    @Override // BL.a
    public final synchronized void N0(@Y61.k String str) {
        Object next;
        try {
            c();
            Iterator it = this.f168151d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (kotlin.jvm.internal.L.f(((a.C0053a) next).f1351a, str)) {
                        break;
                    }
                }
            }
            a.C0053a c0053a = (a.C0053a) next;
            if (c0053a == null) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) this.f168151d);
            linkedHashMap.put(c0053a, b.f168156d);
            b(linkedHashMap);
            this.f168149b.a(new d(c0053a));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // BL.a
    public final synchronized void O0(@Y61.k String str, @Y61.k String str2) {
        c();
        a.C0053a c0053a = new a.C0053a(str, str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) this.f168151d);
        linkedHashMap.put(c0053a, b.f168155c);
        b(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    @Override // BL.a
    public final synchronized void P0(@Y61.k String str, @Y61.k String str2) {
        c();
        a.C0053a c0053a = new a.C0053a(str, str2);
        if (this.f168151d.get(c0053a) == b.f168155c) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) this.f168151d);
        linkedHashMap.put(c0053a, b.f168154b);
        b(linkedHashMap);
        this.f168149b.a(new c(c0053a));
    }

    public final void b(LinkedHashMap linkedHashMap) {
        if (!kotlin.jvm.internal.L.f(this.f168151d, linkedHashMap)) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacWatcherImpl", "New WatcherImpl state: " + linkedHashMap, null);
        }
        this.f168150c.accept(new a.b(linkedHashMap.keySet()));
        this.f168151d = linkedHashMap;
    }

    public final void c() {
        if (this.f168153f.getAndSet(true)) {
            return;
        }
        this.f168148a.get().a(this);
    }
}
