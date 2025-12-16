package Vt;

import Xt.InterfaceC17045a;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.AbstractMap;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: GalleryPagerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVt/e;", "Landroidx/viewpager/widget/a;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public Wt.c f17471c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AbstractMap f17472d;

    public e(@k Wt.d dVar, @k AbstractMap abstractMap) {
        this.f17471c = dVar;
        this.f17472d = abstractMap;
    }

    @Override // androidx.viewpager.widget.a
    public final void a(@k ViewPager viewPager, int i12, @k Object obj) {
        viewPager.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f17471c.d();
    }

    @Override // androidx.viewpager.widget.a
    public final int d(@k Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    @k
    public final Object f(@k ViewGroup viewGroup, int i12) {
        InterfaceC17045a interfaceC17045aA = this.f17471c.a(i12);
        Yt.c cVar = (Yt.c) this.f17472d.get(interfaceC17045aA.a());
        View viewA = cVar != null ? cVar.a((ViewPager) viewGroup, interfaceC17045aA) : null;
        if (viewA != null) {
            return viewA;
        }
        throw new NoSuchElementException("Type " + interfaceC17045aA.a() + " is not supported with CircularGalleryItemViewProvider");
    }

    @Override // androidx.viewpager.widget.a
    public final boolean g(@k View view, @k Object obj) {
        return view.equals(obj);
    }
}
