package androidx.view;

import G1.a;
import X41.n;
import Y61.k;
import Y61.l;
import Z41.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.collection.q1;
import androidx.collection.r1;
import androidx.collection.t1;
import androidx.view.C23317W;
import j.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.text.C43066x;

/* compiled from: NavGraph.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/b0;", "Landroidx/navigation/W;", "", "a", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23324b0 extends C23317W implements Iterable<C23317W>, Z41.a {

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final a f52903p = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public final q1<C23317W> f52904l;

    /* renamed from: m, reason: collision with root package name */
    public int f52905m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public String f52906n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public String f52907o;

    /* compiled from: NavGraph.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/b0$a;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.b0$a */
    public static final class a {

        /* compiled from: NavGraph.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/W;", "it", "invoke", "(Landroidx/navigation/W;)Landroidx/navigation/W;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.navigation.b0$a$a, reason: collision with other inner class name */
        public static final class C1869a extends N implements Y41.l<C23317W, C23317W> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1869a f52908l = new C1869a();

            public C1869a() {
                super(1);
            }

            @Override // Y41.l
            public final C23317W invoke(C23317W c23317w) {
                C23317W c23317w2 = c23317w;
                if (!(c23317w2 instanceof C23324b0)) {
                    return null;
                }
                C23324b0 c23324b0 = (C23324b0) c23317w2;
                return c23324b0.y(c23324b0.f52905m, true);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C23317W a(@k C23324b0 c23324b0) {
            return (C23317W) C43033p.x(C43033p.u(C1869a.f52908l, c23324b0.y(c23324b0.f52905m, true)));
        }

        public a() {
        }
    }

    /* compiled from: NavGraph.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/b0$b", "", "Landroidx/navigation/W;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.b0$b */
    public static final class b implements Iterator<C23317W>, d {

        /* renamed from: b, reason: collision with root package name */
        public int f52909b = -1;

        /* renamed from: c, reason: collision with root package name */
        public boolean f52910c;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f52909b + 1 < C23324b0.this.f52904l.j();
        }

        @Override // java.util.Iterator
        public final C23317W next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f52910c = true;
            q1<C23317W> q1Var = C23324b0.this.f52904l;
            int i12 = this.f52909b + 1;
            this.f52909b = i12;
            return q1Var.k(i12);
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f52910c) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            C23324b0 c23324b0 = C23324b0.this;
            int i12 = this.f52909b;
            q1<C23317W> q1Var = c23324b0.f52904l;
            q1Var.k(i12).f52880c = null;
            int i13 = this.f52909b;
            Object[] objArr = q1Var.f25802d;
            Object obj = objArr[i13];
            Object obj2 = r1.f25805a;
            if (obj != obj2) {
                objArr[i13] = obj2;
                q1Var.f25800b = true;
            }
            this.f52909b = i13 - 1;
            this.f52910c = false;
        }
    }

    public C23324b0(@k C23366f0 c23366f0) {
        super(c23366f0);
        this.f52904l = new q1<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    @l
    @RestrictTo
    public final C23317W C(@k String str, boolean z12) {
        C23324b0 c23324b0;
        C23317W next;
        C23317W.f52878k.getClass();
        int iHashCode = C23317W.b.a(str).hashCode();
        q1<C23317W> q1Var = this.f52904l;
        C23317W c23317wF = q1Var.f(iHashCode);
        if (c23317wF == null) {
            Iterator it = C43033p.b(new t1(q1Var)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = 0;
                    break;
                }
                next = it.next();
                if (((C23317W) next).j(str) != null) {
                    break;
                }
            }
            c23317wF = next;
        }
        if (c23317wF != null) {
            return c23317wF;
        }
        if (!z12 || (c23324b0 = this.f52880c) == null || str == null || C43066x.K(str)) {
            return null;
        }
        return c23324b0.C(str, true);
    }

    @k
    @RestrictTo
    public final String D() {
        int i12 = this.f52886i;
        if (i12 == 0) {
            return "the root navigation";
        }
        String str = this.f52881d;
        return str == null ? String.valueOf(i12) : str;
    }

    @l
    @RestrictTo
    public final C23317W.c E(@k C23315U c23315u) {
        return super.h(c23315u);
    }

    public final void I(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (str.equals(this.f52887j)) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (C43066x.K(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            C23317W.f52878k.getClass();
            iHashCode = C23317W.b.a(str).hashCode();
        }
        this.f52905m = iHashCode;
        this.f52907o = str;
    }

    @Override // androidx.view.C23317W
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C23324b0)) {
            return false;
        }
        if (super.equals(obj)) {
            q1<C23317W> q1Var = this.f52904l;
            int iJ2 = q1Var.j();
            C23324b0 c23324b0 = (C23324b0) obj;
            q1<C23317W> q1Var2 = c23324b0.f52904l;
            if (iJ2 == q1Var2.j() && this.f52905m == c23324b0.f52905m) {
                Iterator it = C43033p.b(new t1(q1Var)).iterator();
                while (it.hasNext()) {
                    C23317W c23317w = (C23317W) it.next();
                    if (!c23317w.equals(q1Var2.f(c23317w.f52886i))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.view.C23317W
    @l
    @RestrictTo
    public final C23317W.c h(@k C23315U c23315u) {
        C23317W.c cVarH = super.h(c23315u);
        ArrayList arrayList = new ArrayList();
        Iterator<C23317W> it = iterator();
        while (it.hasNext()) {
            C23317W.c cVarH2 = it.next().h(c23315u);
            if (cVarH2 != null) {
                arrayList.add(cVarH2);
            }
        }
        return (C23317W.c) C42745f0.W(C42756l.B(new C23317W.c[]{cVarH, (C23317W.c) C42745f0.W(arrayList)}));
    }

    @Override // androidx.view.C23317W
    public int hashCode() {
        int iG2 = this.f52905m;
        q1<C23317W> q1Var = this.f52904l;
        int iJ2 = q1Var.j();
        for (int i12 = 0; i12 < iJ2; i12++) {
            iG2 = (((iG2 * 31) + q1Var.g(i12)) * 31) + q1Var.k(i12).hashCode();
        }
        return iG2;
    }

    @Override // java.lang.Iterable
    @k
    public final Iterator<C23317W> iterator() {
        return new b();
    }

    @Override // androidx.view.C23317W
    public void l(@k Context context, @k AttributeSet attributeSet) {
        super.l(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, a.b.f6174d);
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        if (resourceId == this.f52886i) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
        }
        if (this.f52907o != null) {
            I(null);
        }
        this.f52905m = resourceId;
        this.f52906n = null;
        int i12 = this.f52905m;
        C23317W.f52878k.getClass();
        this.f52906n = C23317W.b.b(i12, context);
        G0 g02 = G0.f406611a;
        typedArrayObtainAttributes.recycle();
    }

    @Override // androidx.view.C23317W
    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        String str = this.f52907o;
        C23317W c23317wC = (str == null || C43066x.K(str)) ? null : C(str, true);
        if (c23317wC == null) {
            c23317wC = y(this.f52905m, true);
        }
        sb2.append(" startDestination=");
        if (c23317wC == null) {
            String str2 = this.f52907o;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = this.f52906n;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.f52905m));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(c23317wC.toString());
            sb2.append("}");
        }
        return sb2.toString();
    }

    public final void w(@k C23317W c23317w) {
        int i12 = c23317w.f52886i;
        String str = c23317w.f52887j;
        if (i12 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = this.f52887j;
        if (str2 != null && L.f(str, str2)) {
            throw new IllegalArgumentException(("Destination " + c23317w + " cannot have the same route as graph " + this).toString());
        }
        if (i12 == this.f52886i) {
            throw new IllegalArgumentException(("Destination " + c23317w + " cannot have the same id as graph " + this).toString());
        }
        q1<C23317W> q1Var = this.f52904l;
        C23317W c23317wF = q1Var.f(i12);
        if (c23317wF == c23317w) {
            return;
        }
        if (c23317w.f52880c != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (c23317wF != null) {
            c23317wF.f52880c = null;
        }
        c23317w.f52880c = this;
        q1Var.i(c23317w.f52886i, c23317w);
    }

    @l
    @RestrictTo
    public final C23317W y(@D int i12, boolean z12) {
        C23324b0 c23324b0;
        C23317W c23317wF = this.f52904l.f(i12);
        if (c23317wF != null) {
            return c23317wF;
        }
        if (!z12 || (c23324b0 = this.f52880c) == null) {
            return null;
        }
        return c23324b0.y(i12, true);
    }
}
