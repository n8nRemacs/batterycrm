package e11;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: e11.i1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39876i1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final WeakReference<ViewGroup> f394612a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final ArrayList f394613b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public WeakReference<MediaAdView> f394614c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public WeakReference<IconAdView> f394615d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final WeakReference<C39875i0> f394616e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public WeakReference<com.my.target.H> f394617f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f394618g;

    public C39876i1(@j.N ViewGroup viewGroup) {
        this.f394618g = false;
        this.f394612a = new WeakReference<>(viewGroup);
        g(viewGroup);
    }

    public static void d(@j.N ViewGroup viewGroup) {
        C39873h1 c39873h1 = new C39873h1(viewGroup);
        while (c39873h1.hasNext()) {
            View view = (View) c39873h1.next();
            if (!(view instanceof RecyclerView) && !(view instanceof MediaAdView) && !(view instanceof C39875i0)) {
                view.setOnClickListener(null);
                if (view instanceof ViewGroup) {
                    d((ViewGroup) view);
                }
            }
        }
    }

    public final void a() {
        WeakReference<MediaAdView> weakReference = this.f394614c;
        if (weakReference != null) {
            weakReference.clear();
            this.f394614c = null;
        }
        ArrayList arrayList = this.f394613b;
        if (arrayList == null) {
            ViewGroup viewGroup = this.f394612a.get();
            if (viewGroup != null) {
                d(viewGroup);
                return;
            }
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) it.next()).get();
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
    }

    public final void b(@j.N ViewGroup viewGroup, @j.P View.OnClickListener onClickListener) {
        if (c(viewGroup)) {
            return;
        }
        C39873h1 c39873h1 = new C39873h1(viewGroup);
        while (c39873h1.hasNext()) {
            View view = (View) c39873h1.next();
            if (this.f394613b == null) {
                view.setOnClickListener(onClickListener);
            }
            if (view instanceof IconAdView) {
                this.f394615d = new WeakReference<>((IconAdView) view);
            } else if (view instanceof ViewGroup) {
                b((ViewGroup) view, onClickListener);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(@j.N ViewGroup viewGroup) {
        if (viewGroup instanceof com.my.target.nativeads.views.h) {
            this.f394617f = new WeakReference<>((com.my.target.H) viewGroup);
            return true;
        }
        if (this.f394614c != null || !(viewGroup instanceof MediaAdView)) {
            return false;
        }
        this.f394614c = new WeakReference<>((MediaAdView) viewGroup);
        return true;
    }

    @j.P
    public final IconAdView e() {
        WeakReference<IconAdView> weakReference = this.f394615d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @j.P
    public final MediaAdView f() {
        WeakReference<MediaAdView> weakReference = this.f394614c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final boolean g(@j.N final ViewGroup viewGroup) {
        if (this.f394614c == null && (viewGroup instanceof MediaAdView)) {
            this.f394614c = new WeakReference<>((MediaAdView) viewGroup);
        } else if (viewGroup instanceof IconAdView) {
            this.f394615d = new WeakReference<>((IconAdView) viewGroup);
        } else {
            Iterator it = new Iterable() { // from class: e11.g1
                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    return new C39873h1(viewGroup);
                }
            }.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if ((view instanceof ViewGroup) && g((ViewGroup) view)) {
                    return true;
                }
            }
        }
        return (this.f394614c == null || this.f394615d == null) ? false : true;
    }

    @j.P
    public final ViewGroup h() {
        return this.f394612a.get();
    }

    public C39876i1(@j.N ViewGroup viewGroup, @j.P List list, @j.P View.OnClickListener onClickListener) {
        this.f394618g = false;
        this.f394612a = new WeakReference<>(viewGroup);
        if (list != null && !list.isEmpty()) {
            this.f394613b = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view != null) {
                    this.f394613b.add(new WeakReference(view));
                    if (view instanceof MediaAdView) {
                        this.f394618g = true;
                    } else {
                        view.setOnClickListener(onClickListener);
                    }
                }
            }
        }
        if (c(viewGroup)) {
            return;
        }
        if (this.f394613b == null) {
            viewGroup.setOnClickListener(onClickListener);
        }
        C39873h1 c39873h1 = new C39873h1(viewGroup);
        while (c39873h1.hasNext()) {
            View view2 = (View) c39873h1.next();
            if (view2 instanceof C39875i0) {
                this.f394616e = new WeakReference<>((C39875i0) view2);
            } else if (view2 instanceof IconAdView) {
                this.f394615d = new WeakReference<>((IconAdView) view2);
            } else {
                if (this.f394613b == null) {
                    view2.setOnClickListener(onClickListener);
                }
                if (view2 instanceof ViewGroup) {
                    b((ViewGroup) view2, onClickListener);
                }
            }
        }
    }
}
