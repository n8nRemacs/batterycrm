package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import j.N;
import j.P;

/* compiled from: PagerAdapter.java */
/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final DataSetObservable f55051a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    public DataSetObserver f55052b;

    public void a(@N ViewPager viewPager, int i12, @N Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract int c();

    public int d(@N Object obj) {
        return -1;
    }

    @P
    public CharSequence e(int i12) {
        return null;
    }

    @N
    public Object f(@N ViewGroup viewGroup, int i12) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract boolean g(@N View view, @N Object obj);

    public final void h() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f55052b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f55051a.notifyChanged();
    }

    public final void i(@N DataSetObserver dataSetObserver) {
        this.f55051a.registerObserver(dataSetObserver);
    }

    @P
    public Parcelable k() {
        return null;
    }

    public final void n(@N DataSetObserver dataSetObserver) {
        this.f55051a.unregisterObserver(dataSetObserver);
    }

    public void b() {
    }

    public void m(@N ViewPager viewPager) {
    }

    public void j(@P Parcelable parcelable, @P ClassLoader classLoader) {
    }

    public void l(@N ViewPager viewPager, int i12, @N Object obj) {
    }
}
