package Po0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbcAutoDispatchesState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LPo0/d;", "", "a", "b", "c", "d", "LPo0/d$a;", "LPo0/d$b;", "LPo0/d$c;", "LPo0/d$d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Po0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14820d {

    /* compiled from: SbcAutoDispatchesState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPo0/d$a;", "LPo0/d;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Po0.d$a */
    public static final /* data */ class a implements InterfaceC14820d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f13295a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1595171440;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: SbcAutoDispatchesState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPo0/d$b;", "LPo0/d;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Po0.d$b */
    public static final /* data */ class b implements InterfaceC14820d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f13296a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1595020725;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: SbcAutoDispatchesState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPo0/d$c;", "LPo0/d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Po0.d$c */
    public static final /* data */ class c implements InterfaceC14820d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f13297a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f13298b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f13299c;

        public c(@k ArrayList arrayList, @l Integer num, boolean z12) {
            this.f13297a = arrayList;
            this.f13298b = num;
            this.f13299c = z12;
        }

        public static c a(c cVar, boolean z12) {
            ArrayList arrayList = cVar.f13297a;
            Integer num = cVar.f13298b;
            cVar.getClass();
            return new c(arrayList, num, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f13297a.equals(cVar.f13297a) && L.f(this.f13298b, cVar.f13298b) && this.f13299c == cVar.f13299c;
        }

        public final int hashCode() {
            int iHashCode = this.f13297a.hashCode() * 31;
            Integer num = this.f13298b;
            return Boolean.hashCode(this.f13299c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(tabs=");
            sb2.append(this.f13297a);
            sb2.append(", selectedPosition=");
            sb2.append(this.f13298b);
            sb2.append(", isRefreshing=");
            return r.x(sb2, this.f13299c, ')');
        }
    }

    /* compiled from: SbcAutoDispatchesState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPo0/d$d;", "LPo0/d;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Po0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C0867d implements InterfaceC14820d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0867d f13300a = new C0867d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0867d);
        }

        public final int hashCode() {
            return -1990921025;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
