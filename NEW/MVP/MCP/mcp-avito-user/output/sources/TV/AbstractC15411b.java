package Tv;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TarifikatorMainState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LTv/b;", "", "<init>", "()V", "a", "b", "c", "LTv/b$a;", "LTv/b$b;", "LTv/b$c;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tv.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC15411b {

    /* compiled from: TarifikatorMainState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTv/b$a;", "LTv/b;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tv.b$a */
    public static final /* data */ class a extends AbstractC15411b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f15979a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15980b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final C15410a f15981c;

        public /* synthetic */ a(List list, boolean z12, C15410a c15410a, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : c15410a);
        }

        public static a a(a aVar, List list, boolean z12, C15410a c15410a, int i12) {
            if ((i12 & 1) != 0) {
                list = aVar.f15979a;
            }
            if ((i12 & 2) != 0) {
                z12 = aVar.f15980b;
            }
            if ((i12 & 4) != 0) {
                c15410a = aVar.f15981c;
            }
            return new a(list, z12, c15410a);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f15979a, aVar.f15979a) && this.f15980b == aVar.f15980b && L.f(this.f15981c, aVar.f15981c);
        }

        public final int hashCode() {
            int i12 = r.i(this.f15979a.hashCode() * 31, 31, this.f15980b);
            C15410a c15410a = this.f15981c;
            return i12 + (c15410a == null ? 0 : c15410a.hashCode());
        }

        @k
        public final String toString() {
            return "Content(items=" + this.f15979a + ", isRefreshing=" + this.f15980b + ", alertDialogData=" + this.f15981c + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k List<? extends com.avito.conveyor_item.a> list, boolean z12, @l C15410a c15410a) {
            super(null);
            this.f15979a = list;
            this.f15980b = z12;
            this.f15981c = c15410a;
        }
    }

    /* compiled from: TarifikatorMainState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTv/b$b;", "LTv/b;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tv.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1087b extends AbstractC15411b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1087b f15982a = new C1087b();

        public C1087b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1087b);
        }

        public final int hashCode() {
            return 727291724;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: TarifikatorMainState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTv/b$c;", "LTv/b;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tv.b$c */
    public static final /* data */ class c extends AbstractC15411b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f15983a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 663315840;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ AbstractC15411b(C42822w c42822w) {
        this();
    }

    public AbstractC15411b() {
    }
}
