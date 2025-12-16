package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
import androidx.preference.s;
import androidx.preference.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import j.N;
import j.P;

/* loaded from: classes.dex */
public abstract class PreferenceFragmentCompat extends Fragment implements s.c, s.a, s.b, DialogPreference.a {

    /* renamed from: g0, reason: collision with root package name */
    public s f53377g0;

    /* renamed from: h0, reason: collision with root package name */
    public RecyclerView f53378h0;

    /* renamed from: f0, reason: collision with root package name */
    public final c f53376f0 = new c();

    /* renamed from: i0, reason: collision with root package name */
    public int f53379i0 = R.layout.preference_list_fragment;

    /* renamed from: j0, reason: collision with root package name */
    public final Handler f53380j0 = new a(Looper.getMainLooper());

    /* renamed from: k0, reason: collision with root package name */
    public final Runnable f53381k0 = new b();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragmentCompat.this.f53377g0.getClass();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = PreferenceFragmentCompat.this.f53378h0;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    public class c extends RecyclerView.l {

        /* renamed from: b, reason: collision with root package name */
        public Drawable f53384b;

        /* renamed from: c, reason: collision with root package name */
        public int f53385c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f53386d = true;

        public c() {
        }

        public final boolean c(View view, RecyclerView recyclerView) {
            RecyclerView.C cW2 = recyclerView.W(view);
            boolean z12 = false;
            if (!(cW2 instanceof u) || !((u) cW2).f53479f) {
                return false;
            }
            boolean z13 = this.f53386d;
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
                rect.bottom = this.f53385c;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void onDrawOver(@N Canvas canvas, @N RecyclerView recyclerView, @N RecyclerView.z zVar) {
            if (this.f53384b == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = recyclerView.getChildAt(i12);
                if (c(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f53384b.setBounds(0, height, width, this.f53385c + height);
                    this.f53384b.draw(canvas);
                }
            }
        }
    }

    public interface d {
    }

    public interface e {
    }

    public interface f {
    }

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

    public abstract void b5();

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i12 = typedValue.resourceId;
        if (i12 == 0) {
            i12 = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i12, false);
        this.f53377g0 = new s(requireContext());
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        b5();
    }

    @Override // androidx.fragment.app.Fragment
    @N
    public final View onCreateView(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, v.k.f53488i, R.attr.preferenceFragmentCompatStyle, 0);
        this.f53379i0 = typedArrayObtainStyledAttributes.getResourceId(0, this.f53379i0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f53379i0, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAccessibilityDelegateCompat(new t(recyclerView));
        }
        this.f53378h0 = recyclerView;
        c cVar = this.f53376f0;
        recyclerView.l(cVar, -1);
        if (drawable != null) {
            cVar.getClass();
            cVar.f53385c = drawable.getIntrinsicHeight();
        } else {
            cVar.f53385c = 0;
        }
        cVar.f53384b = drawable;
        PreferenceFragmentCompat preferenceFragmentCompat = PreferenceFragmentCompat.this;
        preferenceFragmentCompat.f53378h0.c0();
        if (dimensionPixelSize != -1) {
            cVar.f53385c = dimensionPixelSize;
            preferenceFragmentCompat.f53378h0.c0();
        }
        cVar.f53386d = z12;
        if (this.f53378h0.getParent() == null) {
            viewGroup2.addView(this.f53378h0);
        }
        this.f53380j0.post(this.f53381k0);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Handler handler = this.f53380j0;
        handler.removeCallbacks(this.f53381k0);
        handler.removeMessages(1);
        this.f53378h0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f53377g0.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        s sVar = this.f53377g0;
        sVar.f53468a = this;
        sVar.f53469b = this;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        s sVar = this.f53377g0;
        sVar.f53468a = null;
        sVar.f53469b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@N View view, @P Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null || bundle.getBundle("android:preferences") == null) {
            return;
        }
        this.f53377g0.getClass();
    }

    @Override // androidx.preference.DialogPreference.a
    @P
    public final void K4() {
    }
}
