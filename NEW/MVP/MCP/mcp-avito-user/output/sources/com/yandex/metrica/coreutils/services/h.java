package com.yandex.metrica.coreutils.services;

import Y61.k;
import com.yandex.metrica.coreutils.services.d;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: UtilityServiceLocator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yandex/metrica/coreutils/services/h;", "", "<init>", "()V", "a", "core-utils_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static volatile h f377659c;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42726C f377660a = C42727D.c(b.f377662l);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.yandex.metrica.coreutils.services.a f377661b = new com.yandex.metrica.coreutils.services.a();

    /* compiled from: UtilityServiceLocator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/metrica/coreutils/services/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "core-utils_release"}, k = 1, mv = {1, 4, 2})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: UtilityServiceLocator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/yandex/metrica/coreutils/services/d;", "invoke", "()Lcom/yandex/metrica/coreutils/services/d;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    public static final class b extends N implements Y41.a<d> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f377662l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final d invoke() {
            return new d();
        }
    }

    static {
        new a(null);
        f377659c = new h();
    }

    @k0
    public h() {
    }

    public final void a(@k g gVar) {
        ArrayList arrayList;
        d dVar = (d) this.f377660a.getValue();
        synchronized (dVar) {
            dVar.f377648b = gVar;
            arrayList = new ArrayList(dVar.f377647a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d.b bVar = ((d.C10948d) it.next()).f377654a;
            bVar.getClass();
            bVar.f377651c = gVar.f377657a;
            bVar.f377650b = gVar.f377658b;
        }
    }
}
