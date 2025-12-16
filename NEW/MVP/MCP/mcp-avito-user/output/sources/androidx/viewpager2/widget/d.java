package androidx.viewpager2.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import j.N;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CompositePageTransformer.java */
/* loaded from: classes10.dex */
public final class d implements ViewPager2.l {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f55133a = new ArrayList();

    @Override // androidx.viewpager2.widget.ViewPager2.l
    public final void a(@N View view, float f12) {
        Iterator it = this.f55133a.iterator();
        while (it.hasNext()) {
            ((ViewPager2.l) it.next()).a(view, f12);
        }
    }
}
