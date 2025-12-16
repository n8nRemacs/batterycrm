package androidx.view;

import AK.c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.AbstractC23301M0;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: NavGraphNavigator.kt */
@AbstractC23301M0.b("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/f0;", "Landroidx/navigation/M0;", "Landroidx/navigation/b0;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23366f0 extends AbstractC23301M0<C23324b0> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C23303N0 f53112c;

    public C23366f0(@k C23303N0 c23303n0) {
        this.f53112c = c23303n0;
    }

    @Override // androidx.view.AbstractC23301M0
    public void d(@k List<C23395u> list, @l C23280B0 c23280b0, @l AbstractC23301M0.a aVar) {
        for (C23395u c23395u : list) {
            C23324b0 c23324b0 = (C23324b0) c23395u.f53182c;
            Bundle bundleA = c23395u.a();
            int i12 = c23324b0.f52905m;
            String str = c23324b0.f52907o;
            if (i12 == 0 && str == null) {
                throw new IllegalStateException(("no start destination defined via app:startDestination for " + c23324b0.D()).toString());
            }
            C23317W c23317wC = str != null ? c23324b0.C(str, false) : c23324b0.y(i12, false);
            if (c23317wC == null) {
                if (c23324b0.f52906n == null) {
                    String strValueOf = c23324b0.f52907o;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(c23324b0.f52905m);
                    }
                    c23324b0.f52906n = strValueOf;
                }
                throw new IllegalArgumentException(c.k("navigation destination ", c23324b0.f52906n, " is not a direct child of this NavGraph"));
            }
            this.f53112c.b(c23317wC.f52879b).d(Collections.singletonList(b().a(c23317wC, c23317wC.b(bundleA))), c23280b0, aVar);
        }
    }

    @Override // androidx.view.AbstractC23301M0
    @k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C23324b0 a() {
        return new C23324b0(this);
    }
}
