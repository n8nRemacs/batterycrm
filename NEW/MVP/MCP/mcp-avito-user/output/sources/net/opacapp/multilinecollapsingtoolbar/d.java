package net.opacapp.multilinecollapsingtoolbar;

import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.core.view.M;
import java.util.WeakHashMap;
import net.opacapp.multilinecollapsingtoolbar.s;

/* compiled from: CollapsingToolbarLayout.java */
/* loaded from: classes7.dex */
class d implements M {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f419086b;

    public d(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f419086b = collapsingToolbarLayout;
    }

    @Override // androidx.core.view.M
    public final J0 h(View view, J0 j02) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f419086b;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        J0 j03 = collapsingToolbarLayout.getFitsSystemWindows() ? j02 : null;
        J0 j04 = collapsingToolbarLayout.f419031y;
        s.a aVar = s.f419107a;
        if (j04 != j03 && (j04 == null || !j04.equals(j03))) {
            collapsingToolbarLayout.f419031y = j03;
            collapsingToolbarLayout.requestLayout();
        }
        return j02.c();
    }
}
