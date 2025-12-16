package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.C23538b;
import androidx.work.C23544h;
import androidx.work.F;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.model.InterfaceC23560b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.Q0;

/* compiled from: WorkerWrapper.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/l0;", "", "a", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.work.impl.model.H f55757a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f55758b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f55759c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final WorkerParameters.a f55760d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.work.impl.utils.taskexecutor.c f55761e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C23538b f55762f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.work.X f55763g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C23588s f55764h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final WorkDatabase f55765i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final androidx.work.impl.model.I f55766j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC23560b f55767k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ArrayList f55768l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final String f55769m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final P0 f55770n;

    /* compiled from: WorkerWrapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/l0$a;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C23538b f55771a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final androidx.work.impl.utils.taskexecutor.c f55772b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C23588s f55773c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final WorkDatabase f55774d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final androidx.work.impl.model.H f55775e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ArrayList f55776f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Context f55777g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public WorkerParameters.a f55778h = new WorkerParameters.a();

        @SuppressLint({"LambdaLast"})
        public a(@Y61.k Context context, @Y61.k C23538b c23538b, @Y61.k androidx.work.impl.utils.taskexecutor.c cVar, @Y61.k C23588s c23588s, @Y61.k WorkDatabase workDatabase, @Y61.k androidx.work.impl.model.H h12, @Y61.k ArrayList arrayList) {
            this.f55771a = c23538b;
            this.f55772b = cVar;
            this.f55773c = c23588s;
            this.f55774d = workDatabase;
            this.f55775e = h12;
            this.f55776f = arrayList;
            this.f55777g = context.getApplicationContext();
        }
    }

    /* compiled from: WorkerWrapper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/work/impl/l0$b;", "", "<init>", "()V", "a", "b", "c", "Landroidx/work/impl/l0$b$a;", "Landroidx/work/impl/l0$b$b;", "Landroidx/work/impl/l0$b$c;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: WorkerWrapper.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/l0$b$a;", "Landroidx/work/impl/l0$b;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final F.a f55779a;

            public a() {
                this(null, 1, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(F.a aVar, int i12, C42822w c42822w) {
                super(null);
                aVar = (i12 & 1) != 0 ? new F.a.C1949a() : aVar;
                this.f55779a = aVar;
            }
        }

        /* compiled from: WorkerWrapper.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/l0$b$b;", "Landroidx/work/impl/l0$b;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.work.impl.l0$b$b, reason: collision with other inner class name */
        public static final class C1959b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final F.a f55780a;

            public C1959b(@Y61.k F.a aVar) {
                super(null);
                this.f55780a = aVar;
            }
        }

        /* compiled from: WorkerWrapper.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/l0$b$c;", "Landroidx/work/impl/l0$b;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public final int f55781a;

            public c() {
                this(0, 1, null);
            }

            public c(int i12) {
                super(null);
                this.f55781a = i12;
            }

            public /* synthetic */ c(int i12, int i13, C42822w c42822w) {
                this((i13 & 1) != 0 ? -256 : i12);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public l0(@Y61.k a aVar) {
        androidx.work.impl.model.H h12 = aVar.f55775e;
        this.f55757a = h12;
        this.f55758b = aVar.f55777g;
        String str = h12.f55795a;
        this.f55759c = str;
        this.f55760d = aVar.f55778h;
        this.f55761e = aVar.f55772b;
        C23538b c23538b = aVar.f55771a;
        this.f55762f = c23538b;
        this.f55763g = c23538b.f55450d;
        this.f55764h = aVar.f55773c;
        WorkDatabase workDatabase = aVar.f55774d;
        this.f55765i = workDatabase;
        this.f55766j = workDatabase.A();
        this.f55767k = workDatabase.u();
        ArrayList arrayList = aVar.f55776f;
        this.f55768l = arrayList;
        this.f55769m = AK.c.s(androidx.appcompat.app.r.A("Work [ id=", str, ", tags={ "), C42745f0.O(arrayList, ",", null, null, null, 62), " } ]");
        this.f55770n = Q0.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.work.impl.l0 r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.l0.a(androidx.work.impl.l0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(int i12) {
        WorkInfo.State state = WorkInfo.State.f55419b;
        androidx.work.impl.model.I i13 = this.f55766j;
        String str = this.f55759c;
        i13.f(state, str);
        this.f55763g.getClass();
        i13.t(System.currentTimeMillis(), str);
        i13.z(this.f55757a.f55816v, str);
        i13.x(-1L, str);
        i13.m(i12, str);
    }

    public final void c() {
        this.f55763g.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        androidx.work.impl.model.I i12 = this.f55766j;
        String str = this.f55759c;
        i12.t(jCurrentTimeMillis, str);
        i12.f(WorkInfo.State.f55419b, str);
        i12.h(str);
        i12.z(this.f55757a.f55816v, str);
        i12.w(str);
        i12.x(-1L, str);
    }

    @j.k0
    public final void d(@Y61.k F.a aVar) {
        String str = this.f55759c;
        ArrayList arrayListE0 = C42745f0.e0(str);
        while (true) {
            boolean zIsEmpty = arrayListE0.isEmpty();
            androidx.work.impl.model.I i12 = this.f55766j;
            if (zIsEmpty) {
                C23544h c23544h = ((F.a.C1949a) aVar).f55380a;
                i12.z(this.f55757a.f55816v, str);
                i12.k(c23544h, str);
                return;
            } else {
                String str2 = (String) C42745f0.n0(arrayListE0);
                if (i12.a(str2) != WorkInfo.State.f55424g) {
                    i12.f(WorkInfo.State.f55422e, str2);
                }
                arrayListE0.addAll(this.f55767k.b(str2));
            }
        }
    }
}
