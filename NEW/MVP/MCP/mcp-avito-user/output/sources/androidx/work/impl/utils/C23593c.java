package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.C23588s;
import androidx.work.impl.C23612w;
import androidx.work.impl.InterfaceC23590u;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.Y;
import androidx.work.impl.l0;
import androidx.work.impl.model.InterfaceC23560b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CancelWorkRunnable.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@X41.i
/* renamed from: androidx.work.impl.utils.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23593c {

    /* compiled from: CancelWorkRunnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.work.impl.utils.c$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y f55981l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y y12) {
            super(0);
            this.f55981l = y12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y y12 = this.f55981l;
            WorkDatabase workDatabase = y12.f55559d;
            workDatabase.r(new J11.c(20, workDatabase, y12));
            return G0.f406611a;
        }
    }

    /* compiled from: CancelWorkRunnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.work.impl.utils.c$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y f55982l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ UUID f55983m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y y12, UUID uuid) {
            super(0);
            this.f55982l = y12;
            this.f55983m = uuid;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y y12 = this.f55982l;
            y12.f55559d.r(new J11.c(21, y12, this.f55983m));
            C23612w.b(y12.f55558c, y12.f55559d, y12.f55561f);
            return G0.f406611a;
        }
    }

    /* compiled from: CancelWorkRunnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.work.impl.utils.c$c, reason: collision with other inner class name */
    public static final class C1962c extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f55984l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y f55985m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1962c(Y y12, String str) {
            super(0);
            this.f55984l = str;
            this.f55985m = y12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y y12 = this.f55985m;
            WorkDatabase workDatabase = y12.f55559d;
            workDatabase.r(new RunnableC23592b(workDatabase, this.f55984l, y12, 0));
            C23612w.b(y12.f55558c, y12.f55559d, y12.f55561f);
            return G0.f406611a;
        }
    }

    /* compiled from: CancelWorkRunnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.work.impl.utils.c$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y f55986l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f55987m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y y12, String str) {
            super(0);
            this.f55986l = y12;
            this.f55987m = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y y12 = this.f55986l;
            WorkDatabase workDatabase = y12.f55559d;
            workDatabase.r(new RunnableC23592b(workDatabase, this.f55987m, y12, 1));
            C23612w.b(y12.f55558c, y12.f55559d, y12.f55561f);
            return G0.f406611a;
        }
    }

    public static final void a(Y y12, String str) {
        l0 l0VarB;
        WorkDatabase workDatabase = y12.f55559d;
        androidx.work.impl.model.I iA2 = workDatabase.A();
        InterfaceC23560b interfaceC23560bU = workDatabase.u();
        ArrayList arrayListE0 = C42745f0.e0(str);
        while (!arrayListE0.isEmpty()) {
            String str2 = (String) C42745f0.n0(arrayListE0);
            WorkInfo.State stateA = iA2.a(str2);
            if (stateA != WorkInfo.State.f55421d && stateA != WorkInfo.State.f55422e) {
                iA2.d(str2);
            }
            arrayListE0.addAll(interfaceC23560bU.b(str2));
        }
        C23588s c23588s = y12.f55562g;
        synchronized (c23588s.f55931k) {
            androidx.work.G gA2 = androidx.work.G.a();
            int i12 = C23588s.f55920l;
            gA2.getClass();
            c23588s.f55929i.add(str);
            l0VarB = c23588s.b(str);
        }
        C23588s.d(str, l0VarB, 1);
        Iterator<InterfaceC23590u> it = y12.f55561f.iterator();
        while (it.hasNext()) {
            it.next().h(str);
        }
    }

    @Y61.k
    public static final androidx.work.L b(@Y61.k Y y12) {
        return androidx.work.P.a(y12.f55558c.f55462p, "CancelAllWork", y12.f55560e.f56028a, new a(y12));
    }

    @Y61.k
    public static final androidx.work.L c(@Y61.k Y y12, @Y61.k UUID uuid) {
        return androidx.work.P.a(y12.f55558c.f55462p, "CancelWorkById", y12.f55560e.f56028a, new b(y12, uuid));
    }

    @Y61.k
    public static final androidx.work.L d(@Y61.k Y y12, @Y61.k String str) {
        return androidx.work.P.a(y12.f55558c.f55462p, "CancelWorkByName_".concat(str), y12.f55560e.f56028a, new C1962c(y12, str));
    }

    @Y61.k
    public static final androidx.work.L e(@Y61.k Y y12, @Y61.k String str) {
        return androidx.work.P.a(y12.f55558c.f55462p, "CancelWorkByTag_".concat(str), y12.f55560e.f56028a, new d(y12, str));
    }
}
