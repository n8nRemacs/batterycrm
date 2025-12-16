package androidx.work;

import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: WorkQuery.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/b0;", "", "a", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<UUID> f55466a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f55467b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<String> f55468c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<WorkInfo.State> f55469d;

    /* compiled from: WorkQuery.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/work/b0$a;", "", "<init>", "()V", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final C1952a f55470e = new C1952a(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f55471a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f55472b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f55473c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f55474d;

        /* compiled from: WorkQuery.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/b0$a$a;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.work.b0$a$a, reason: collision with other inner class name */
        public static final class C1952a {
            public /* synthetic */ C1952a(C42822w c42822w) {
                this();
            }

            public C1952a() {
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
            this.f55471a = new ArrayList();
            this.f55472b = new ArrayList();
            this.f55473c = new ArrayList();
            this.f55474d = new ArrayList();
        }
    }

    /* compiled from: WorkQuery.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/b0$b;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    public b0() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(@Y61.k List<UUID> list, @Y61.k List<String> list2, @Y61.k List<String> list3, @Y61.k List<? extends WorkInfo.State> list4) {
        this.f55466a = list;
        this.f55467b = list2;
        this.f55468c = list3;
        this.f55469d = list4;
    }

    public b0(List list, List list2, List list3, List list4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? C42784z0.f406748b : list2, (i12 & 4) != 0 ? C42784z0.f406748b : list3, (i12 & 8) != 0 ? C42784z0.f406748b : list4);
    }
}
