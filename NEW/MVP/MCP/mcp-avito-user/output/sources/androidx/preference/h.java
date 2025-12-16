package androidx.preference;

import android.app.Fragment;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.DialogPreference;
import androidx.preference.s;
import androidx.preference.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import j.N;
import j.P;

/* compiled from: PreferenceFragment.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class h extends Fragment implements s.c, s.a, s.b, DialogPreference.a {

    /* renamed from: c, reason: collision with root package name */
    public s f53447c;

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView f53448d;

    /* renamed from: e, reason: collision with root package name */
    public ContextThemeWrapper f53449e;

    /* renamed from: b, reason: collision with root package name */
    public final c f53446b = new c();

    /* renamed from: f, reason: collision with root package name */
    public int f53450f = R.layout.preference_list_fragment;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f53451g = new a();

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f53452h = new b();

    /* compiled from: PreferenceFragment.java */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(@N Message message) {
            if (message.what != 1) {
                return;
            }
            h.this.f53447c.getClass();
        }
    }

    /* compiled from: PreferenceFragment.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = h.this.f53448d;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* compiled from: PreferenceFragment.java */
    public class c extends RecyclerView.l {

        /* renamed from: b, reason: collision with root package name */
        public Drawable f53455b;

        /* renamed from: c, reason: collision with root package name */
        public int f53456c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f53457d = true;

        public c() {
        }

        public final boolean c(@N View view, @N RecyclerView recyclerView) {
            RecyclerView.C cW2 = recyclerView.W(view);
            boolean z12 = false;
            if (!(cW2 instanceof u) || !((u) cW2).f53479f) {
                return false;
            }
            boolean z13 = this.f53457d;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z13;
            }
            RecyclerView.C cW3 = recyclerView.W(recyclerView.getChildAt(iIndexOfChild + 1));
            if ((cW3 instanceof u) && ((u) cW3).f53478e) {
                z12 = true;
            }
            return z12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void getItemOffsets(@N Rect rect, @N View view, @N RecyclerView recyclerView, @N RecyclerView.z zVar) {
            if (c(view, recyclerView)) {
                rect.bottom = this.f53456c;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void onDrawOver(@N Canvas canvas, @N RecyclerView recyclerView, @N RecyclerView.z zVar) {
            if (this.f53455b == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = recyclerView.getChildAt(i12);
                if (c(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f53455b.setBounds(0, height, width, this.f53456c + height);
                    this.f53455b.draw(canvas);
                }
            }
        }
    }

    /* compiled from: PreferenceFragment.java */
    public interface d {
    }

    /* compiled from: PreferenceFragment.java */
    public interface e {
    }

    /* compiled from: PreferenceFragment.java */
    public interface f {
    }

    /* compiled from: PreferenceFragment.java */
    public static class g extends RecyclerView.g {
        public g() {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i12, int i13) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i12, int i13, Object obj) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i12, int i13) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i12, int i13) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i12, int i13) {
            throw null;
        }
    }

    @Deprecated
    public abstract void a();

    @Override // android.app.Fragment
    public final void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i12 = typedValue.resourceId;
        if (i12 == 0) {
            i12 = R.style.PreferenceThemeOverlay;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i12);
        this.f53449e = contextThemeWrapper;
        this.f53447c = new s(contextThemeWrapper);
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        a();
    }

    @Override // android.app.Fragment
    @N
    public final View onCreateView(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) {
        RecyclerView recyclerView;
        ContextThemeWrapper contextThemeWrapper = this.f53449e;
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, v.k.f53487h, androidx.core.content.res.l.a(contextThemeWrapper, R.attr.preferenceFragmentStyle, android.R.attr.preferenceFragmentStyle), 0);
        this.f53450f = typedArrayObtainStyledAttributes.getResourceId(0, this.f53450f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.f53449e);
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f53450f, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!this.f53449e.getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            getActivity();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAccessibilityDelegateCompat(new t(recyclerView));
        }
        this.f53448d = recyclerView;
        c cVar = this.f53446b;
        recyclerView.l(cVar, -1);
        if (drawable != null) {
            cVar.getClass();
            cVar.f53456c = drawable.getIntrinsicHeight();
        } else {
            cVar.f53456c = 0;
        }
        cVar.f53455b = drawable;
        h hVar = h.this;
        hVar.f53448d.c0();
        if (dimensionPixelSize != -1) {
            cVar.f53456c = dimensionPixelSize;
            hVar.f53448d.c0();
        }
        cVar.f53457d = z12;
        if (this.f53448d.getParent() == null) {
            viewGroup2.addView(this.f53448d);
        }
        this.f53451g.post(this.f53452h);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        Handler handler = this.f53451g;
        handler.removeCallbacks(this.f53452h);
        handler.removeMessages(1);
        this.f53448d = null;
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f53447c.getClass();
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        s sVar = this.f53447c;
        sVar.f53468a = this;
        sVar.f53469b = this;
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        s sVar = this.f53447c;
        sVar.f53468a = null;
        sVar.f53469b = null;
    }

    @Override // android.app.Fragment
    public final void onViewCreated(@N View view, @P Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null || bundle.getBundle("android:preferences") == null) {
            return;
        }
        this.f53447c.getClass();
    }

    @Override // androidx.preference.DialogPreference.a
    @Deprecated
    public final void K4() {
    }
}
