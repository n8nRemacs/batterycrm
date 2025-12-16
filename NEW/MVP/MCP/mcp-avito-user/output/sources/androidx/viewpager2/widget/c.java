package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import j.N;
import j.U;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: CompositeOnPageChangeCallback.java */
/* loaded from: classes10.dex */
final class c extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    @N
    public final ArrayList f55132d = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrollStateChanged(int i12) {
        try {
            Iterator it = this.f55132d.iterator();
            while (it.hasNext()) {
                ((ViewPager2.i) it.next()).onPageScrollStateChanged(i12);
            }
        } catch (ConcurrentModificationException e12) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e12);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrolled(int i12, float f12, @U int i13) {
        try {
            Iterator it = this.f55132d.iterator();
            while (it.hasNext()) {
                ((ViewPager2.i) it.next()).onPageScrolled(i12, f12, i13);
            }
        } catch (ConcurrentModificationException e12) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e12);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i12) {
        try {
            Iterator it = this.f55132d.iterator();
            while (it.hasNext()) {
                ((ViewPager2.i) it.next()).onPageSelected(i12);
            }
        } catch (ConcurrentModificationException e12) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e12);
        }
    }
}
