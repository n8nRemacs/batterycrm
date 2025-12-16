package Ro0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.sbc.autodispatcheslist.adapter.f;
import com.avito.android.sbc.autodispatcheslist.adapter.o;
import com.avito.android.sbc.autodispatcheslist.adapter.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SbcAutoDispatchesListState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LRo0/d;", "", "b", "c", "d", "e", "LRo0/d$b;", "LRo0/d$c;", "LRo0/d$d;", "LRo0/d$e;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d {

    /* compiled from: SbcAutoDispatchesListState.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @k
        public static ArrayList a(@k d dVar) {
            ArrayList arrayList = new ArrayList(dVar.a());
            TV0.a aVarC = dVar.c();
            if (aVarC != null) {
                arrayList.add(aVarC);
            }
            return arrayList;
        }
    }

    /* compiled from: SbcAutoDispatchesListState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRo0/d$b;", "LRo0/d;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f14647a = new b();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C42784z0 f14648b = C42784z0.f406748b;

        @Override // Ro0.d
        @k
        public final List<f> a() {
            return f14648b;
        }

        @Override // Ro0.d
        @k
        public final ArrayList b() {
            return a.a(this);
        }

        @Override // Ro0.d
        public final /* bridge */ /* synthetic */ TV0.a c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1673118640;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: SbcAutoDispatchesListState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo0/d$c;", "LRo0/d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<f> f14649a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14650b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final r f14651c;

        public c(@k List<f> list, boolean z12) {
            this.f14649a = list;
            this.f14650b = z12;
            this.f14651c = z12 ? r.f259092b : null;
        }

        @Override // Ro0.d
        @k
        public final List<f> a() {
            return this.f14649a;
        }

        @Override // Ro0.d
        @k
        public final ArrayList b() {
            return a.a(this);
        }

        @Override // Ro0.d
        public final TV0.a c() {
            return this.f14651c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f14649a, cVar.f14649a) && this.f14650b == cVar.f14650b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14650b) + (this.f14649a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FullyLoaded(dispatchItems=");
            sb2.append(this.f14649a);
            sb2.append(", needToShowBottomItem=");
            return androidx.appcompat.app.r.x(sb2, this.f14650b, ')');
        }
    }

    /* compiled from: SbcAutoDispatchesListState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo0/d$d;", "LRo0/d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ro0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C0983d implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<f> f14652a;

        public C0983d(@k List<f> list) {
            this.f14652a = list;
        }

        @Override // Ro0.d
        @k
        public final List<f> a() {
            return this.f14652a;
        }

        @Override // Ro0.d
        @k
        public final ArrayList b() {
            return a.a(this);
        }

        @Override // Ro0.d
        @l
        public final TV0.a c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0983d) && L.f(this.f14652a, ((C0983d) obj).f14652a);
        }

        public final int hashCode() {
            return this.f14652a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Loaded(dispatchItems="), this.f14652a, ')');
        }
    }

    /* compiled from: SbcAutoDispatchesListState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo0/d$e;", "LRo0/d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<f> f14653a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final o f14654b = o.f259086b;

        public e(@k List<f> list) {
            this.f14653a = list;
        }

        @Override // Ro0.d
        @k
        public final List<f> a() {
            return this.f14653a;
        }

        @Override // Ro0.d
        @k
        public final ArrayList b() {
            return a.a(this);
        }

        @Override // Ro0.d
        public final TV0.a c() {
            return this.f14654b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f14653a, ((e) obj).f14653a);
        }

        public final int hashCode() {
            return this.f14653a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("PaginationInProgress(dispatchItems="), this.f14653a, ')');
        }
    }

    @k
    List<f> a();

    @k
    ArrayList b();

    @l
    TV0.a c();
}
