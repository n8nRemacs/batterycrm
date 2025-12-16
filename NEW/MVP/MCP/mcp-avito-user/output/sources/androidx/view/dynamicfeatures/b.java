package androidx.view.dynamicfeatures;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.AbstractC23301M0;
import androidx.view.C23280B0;
import androidx.view.C23317W;
import androidx.view.C23363e;
import androidx.view.C23395u;
import androidx.view.dynamicfeatures.q;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DynamicActivityNavigator.kt */
@AbstractC23301M0.b("activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/dynamicfeatures/b;", "Landroidx/navigation/e;", "a", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends C23363e {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f53044e;

    /* compiled from: DynamicActivityNavigator.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/dynamicfeatures/b$a;", "Landroidx/navigation/e$b;", "navigation-dynamic-features-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends C23363e.b {

        /* renamed from: n, reason: collision with root package name */
        @l
        public String f53045n;

        public a() {
            throw null;
        }

        @Override // androidx.view.C23363e.b, androidx.view.C23317W
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            return super.equals(obj) && L.f(this.f53045n, ((a) obj).f53045n);
        }

        @Override // androidx.view.C23363e.b, androidx.view.C23317W
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f53045n;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.view.C23363e.b, androidx.view.C23317W
        public final void l(@k Context context, @k AttributeSet attributeSet) {
            super.l(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.c.f53104a, 0, 0);
            this.f53045n = typedArrayObtainStyledAttributes.getString(0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public b(@k ActivityC22955m activityC22955m, @k j jVar) {
        super(activityC22955m);
        this.f53044e = jVar;
        activityC22955m.getPackageName();
    }

    @Override // androidx.view.C23363e, androidx.view.AbstractC23301M0
    public final C23317W a() {
        return new a(this);
    }

    @Override // androidx.view.AbstractC23301M0
    public final void d(@k List<C23395u> list, @l C23280B0 c23280b0, @l AbstractC23301M0.a aVar) {
        String str;
        for (C23395u c23395u : list) {
            C23317W c23317w = c23395u.f53182c;
            e eVar = aVar instanceof e ? (e) aVar : null;
            if ((c23317w instanceof a) && (str = ((a) c23317w).f53045n) != null) {
                j jVar = this.f53044e;
                if (jVar.a(str)) {
                    jVar.b(c23395u, eVar, str);
                }
            }
            super.d(Collections.singletonList(c23395u), c23280b0, eVar != null ? eVar.f53047b : aVar);
        }
    }

    @Override // androidx.view.C23363e
    /* renamed from: k */
    public final C23363e.b a() {
        return new a(this);
    }
}
