package androidx.view.dynamicfeatures.fragment;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentManager;
import androidx.view.AbstractC23301M0;
import androidx.view.C23280B0;
import androidx.view.C23317W;
import androidx.view.C23395u;
import androidx.view.dynamicfeatures.e;
import androidx.view.dynamicfeatures.fragment.d;
import androidx.view.dynamicfeatures.j;
import androidx.view.fragment.i;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DynamicFragmentNavigator.kt */
@AbstractC23301M0.b("fragment")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/a;", "Landroidx/navigation/fragment/i;", "a", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: k, reason: collision with root package name */
    @k
    public final j f53058k;

    /* compiled from: DynamicFragmentNavigator.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/dynamicfeatures/fragment/a$a;", "Landroidx/navigation/fragment/i$c;", "navigation-dynamic-features-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.dynamicfeatures.fragment.a$a, reason: collision with other inner class name */
    public static final class C1871a extends i.c {

        /* renamed from: m, reason: collision with root package name */
        @l
        public String f53059m;

        public C1871a() {
            throw null;
        }

        @Override // androidx.navigation.fragment.i.c, androidx.view.C23317W
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C1871a)) {
                return false;
            }
            return super.equals(obj) && L.f(this.f53059m, ((C1871a) obj).f53059m);
        }

        @Override // androidx.navigation.fragment.i.c, androidx.view.C23317W
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f53059m;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.fragment.i.c, androidx.view.C23317W
        public final void l(@k Context context, @k AttributeSet attributeSet) {
            super.l(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.e.f53060a, 0, 0);
            this.f53059m = typedArrayObtainStyledAttributes.getString(0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public a(@k Context context, @k FragmentManager fragmentManager, int i12, @k j jVar) {
        super(context, fragmentManager, i12);
        this.f53058k = jVar;
    }

    @Override // androidx.view.fragment.i, androidx.view.AbstractC23301M0
    public final C23317W a() {
        return new C1871a(this);
    }

    @Override // androidx.view.fragment.i, androidx.view.AbstractC23301M0
    public final void d(@k List<C23395u> list, @l C23280B0 c23280b0, @l AbstractC23301M0.a aVar) {
        String str;
        for (C23395u c23395u : list) {
            C23317W c23317w = c23395u.f53182c;
            e eVar = aVar instanceof e ? (e) aVar : null;
            if ((c23317w instanceof C1871a) && (str = ((C1871a) c23317w).f53059m) != null) {
                j jVar = this.f53058k;
                if (jVar.a(str)) {
                    jVar.b(c23395u, eVar, str);
                }
            }
            super.d(Collections.singletonList(c23395u), c23280b0, eVar != null ? eVar.f53047b : aVar);
        }
    }

    @Override // androidx.view.fragment.i
    /* renamed from: m */
    public final i.c a() {
        return new C1871a(this);
    }
}
