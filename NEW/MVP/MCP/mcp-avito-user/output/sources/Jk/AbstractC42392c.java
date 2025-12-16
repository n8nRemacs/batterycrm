package jk;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.brandspace.remote.model.Brandspace;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.InterfaceC35745a5;
import dj.InterfaceC39736a;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import lj.InterfaceC43779a;

/* compiled from: BrandspaceState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Ljk/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "Ljk/c$a;", "Ljk/c$b;", "Ljk/c$c;", "Ljk/c$d;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jk.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC42392c extends q {

    /* compiled from: BrandspaceState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljk/c$a;", "Ljk/c;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk.c$a */
    public static final /* data */ class a extends AbstractC42392c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f405788b;

        public a(@k ApiError apiError) {
            super(null);
            this.f405788b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f405788b, ((a) obj).f405788b);
        }

        public final int hashCode() {
            return this.f405788b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(message="), this.f405788b, ')');
        }
    }

    /* compiled from: BrandspaceState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljk/c$b;", "Ljk/c;", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk.c$b */
    public static final class b extends AbstractC42392c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f405789b = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: BrandspaceState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljk/c$c;", "Ljk/c;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11579c extends AbstractC42392c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC35745a5 f405790b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Brandspace f405791c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final InterfaceC43779a f405792d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final InterfaceC43779a f405793e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final InterfaceC43779a f405794f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final InterfaceC39736a f405795g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final InterfaceC39736a f405796h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final InterfaceC39736a f405797i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final I0 f405798j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final I0 f405799k;

        /* renamed from: l, reason: collision with root package name */
        @k
        public final I0 f405800l;

        public C11579c(@k InterfaceC35745a5 interfaceC35745a5, @k Brandspace brandspace, @k InterfaceC43779a interfaceC43779a, @k InterfaceC43779a interfaceC43779a2, @k InterfaceC43779a interfaceC43779a3, @k InterfaceC39736a interfaceC39736a, @k InterfaceC39736a interfaceC39736a2, @k InterfaceC39736a interfaceC39736a3) {
            super(null);
            this.f405790b = interfaceC35745a5;
            this.f405791c = brandspace;
            this.f405792d = interfaceC43779a;
            this.f405793e = interfaceC43779a2;
            this.f405794f = interfaceC43779a3;
            this.f405795g = interfaceC39736a;
            this.f405796h = interfaceC39736a2;
            this.f405797i = interfaceC39736a3;
            this.f405798j = interfaceC43779a.getF103348p().j0(interfaceC35745a5.e());
            this.f405799k = interfaceC43779a2.getF103348p().j0(interfaceC35745a5.e());
            this.f405800l = interfaceC43779a3.getF103348p().j0(interfaceC35745a5.e());
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11579c)) {
                return false;
            }
            C11579c c11579c = (C11579c) obj;
            return L.f(this.f405790b, c11579c.f405790b) && L.f(this.f405791c, c11579c.f405791c) && L.f(this.f405792d, c11579c.f405792d) && L.f(this.f405793e, c11579c.f405793e) && L.f(this.f405794f, c11579c.f405794f) && L.f(this.f405795g, c11579c.f405795g) && L.f(this.f405796h, c11579c.f405796h) && L.f(this.f405797i, c11579c.f405797i);
        }

        public final int hashCode() {
            return this.f405797i.hashCode() + ((this.f405796h.hashCode() + ((this.f405795g.hashCode() + ((this.f405794f.hashCode() + ((this.f405793e.hashCode() + ((this.f405792d.hashCode() + ((this.f405791c.hashCode() + (this.f405790b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        @k
        public final String toString() {
            return "Loaded(schedulers=" + this.f405790b + ", brandspace=" + this.f405791c + ", topComponentsForm=" + this.f405792d + ", mainComponentsForm=" + this.f405793e + ", bottomComponentsForm=" + this.f405794f + ", topPerformanceListener=" + this.f405795g + ", mainPerformanceListener=" + this.f405796h + ", bottomPerformanceListener=" + this.f405797i + ')';
        }
    }

    /* compiled from: BrandspaceState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljk/c$d;", "Ljk/c;", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jk.c$d */
    public static final class d extends AbstractC42392c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final d f405801b = new d();

        public d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC42392c(C42822w c42822w) {
        this();
    }

    public AbstractC42392c() {
    }
}
