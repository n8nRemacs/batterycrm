package androidx.view.dynamicfeatures;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.view.AbstractC23301M0;
import androidx.view.C23280B0;
import androidx.view.C23303N0;
import androidx.view.C23317W;
import androidx.view.C23324b0;
import androidx.view.C23366f0;
import androidx.view.C23395u;
import androidx.view.dynamicfeatures.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DynamicGraphNavigator.kt */
@AbstractC23301M0.b("navigation")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/dynamicfeatures/f;", "Landroidx/navigation/f0;", "a", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f extends C23366f0 {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C23303N0 f53048d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f53049e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.a<? extends C23317W> f53050f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayList f53051g;

    /* compiled from: DynamicGraphNavigator.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/dynamicfeatures/f$a;", "Landroidx/navigation/b0;", "a", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends C23324b0 {

        /* renamed from: u, reason: collision with root package name */
        @k
        public static final C1870a f53052u = new C1870a(null);

        /* renamed from: q, reason: collision with root package name */
        @k
        public final f f53053q;

        /* renamed from: r, reason: collision with root package name */
        @k
        public final C23303N0 f53054r;

        /* renamed from: s, reason: collision with root package name */
        @l
        public String f53055s;

        /* renamed from: t, reason: collision with root package name */
        public int f53056t;

        /* compiled from: DynamicGraphNavigator.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/dynamicfeatures/f$a$a;", "", "<init>", "()V", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.navigation.dynamicfeatures.f$a$a, reason: collision with other inner class name */
        public static final class C1870a {
            public /* synthetic */ C1870a(C42822w c42822w) {
                this();
            }

            public C1870a() {
            }
        }

        public a(@k f fVar, @k C23303N0 c23303n0) {
            super(fVar);
            this.f53053q = fVar;
            this.f53054r = c23303n0;
        }

        @Override // androidx.view.C23324b0, androidx.view.C23317W
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            if (super.equals(obj)) {
                a aVar = (a) obj;
                if (L.f(this.f53055s, aVar.f53055s) && this.f53056t == aVar.f53056t) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.view.C23324b0, androidx.view.C23317W
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f53055s;
            return Integer.hashCode(this.f53056t) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Override // androidx.view.C23324b0, androidx.view.C23317W
        public final void l(@k Context context, @k AttributeSet attributeSet) {
            super.l(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.c.f53105b, 0, 0);
            this.f53055s = typedArrayObtainStyledAttributes.getString(0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            this.f53056t = resourceId;
            if (resourceId == 0) {
                this.f53053q.f53051g.add(this);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public f(@k C23303N0 c23303n0, @k j jVar) {
        super(c23303n0);
        this.f53048d = c23303n0;
        this.f53049e = jVar;
        this.f53051g = new ArrayList();
    }

    @Override // androidx.view.C23366f0, androidx.view.AbstractC23301M0
    public final C23317W a() {
        return new a(this, this.f53048d);
    }

    @Override // androidx.view.C23366f0, androidx.view.AbstractC23301M0
    public final void d(@k List<C23395u> list, @l C23280B0 c23280b0, @l AbstractC23301M0.a aVar) {
        String str;
        for (C23395u c23395u : list) {
            C23317W c23317w = c23395u.f53182c;
            e eVar = aVar instanceof e ? (e) aVar : null;
            if ((c23317w instanceof a) && (str = ((a) c23317w).f53055s) != null) {
                j jVar = this.f53049e;
                if (jVar.a(str)) {
                    jVar.b(c23395u, eVar, str);
                }
            }
            super.d(Collections.singletonList(c23395u), c23280b0, eVar != null ? eVar.f53047b : aVar);
        }
    }

    @Override // androidx.view.AbstractC23301M0
    public final void g(@k Bundle bundle) {
        Iterator it = this.f53051g.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            Y41.a<? extends C23317W> aVar2 = this.f53050f;
            if (aVar2 == null) {
                throw new IllegalStateException("You must set a default progress destination using DynamicNavGraphNavigator.installDefaultProgressDestination or pass in an DynamicInstallMonitor in the DynamicExtras.\nAlternatively, when using NavHostFragment make sure to swap it with DynamicNavHostFragment. This will take care of setting the default progress destination for you.");
            }
            C23317W c23317wInvoke = aVar2.invoke();
            aVar.w(c23317wInvoke);
            aVar.f53056t = c23317wInvoke.f52886i;
            it.remove();
        }
    }

    @Override // androidx.view.AbstractC23301M0
    @l
    public final Bundle h() {
        return Bundle.EMPTY;
    }

    @Override // androidx.view.C23366f0
    /* renamed from: k */
    public final C23324b0 a() {
        return new a(this, this.f53048d);
    }
}
