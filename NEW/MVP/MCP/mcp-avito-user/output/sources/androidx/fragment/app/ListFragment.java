package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ListFragment extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    public final Handler f46478f0 = new Handler();

    /* renamed from: g0, reason: collision with root package name */
    public final Runnable f46479g0 = new a();

    /* renamed from: h0, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f46480h0 = new b();

    /* renamed from: i0, reason: collision with root package name */
    public ListView f46481i0;

    /* renamed from: j0, reason: collision with root package name */
    public View f46482j0;

    /* renamed from: k0, reason: collision with root package name */
    public View f46483k0;

    /* renamed from: l0, reason: collision with root package name */
    public View f46484l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f46485m0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListView listView = ListFragment.this.f46481i0;
            listView.focusableViewAvailable(listView);
        }
    }

    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i12, long j12) {
            ListFragment.this.getClass();
        }
    }

    public final void b5() {
        if (this.f46481i0 != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f46481i0 = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            if (textView == null) {
                this.f46482j0 = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f46483k0 = view.findViewById(16711682);
            this.f46484l0 = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f46481i0 = listView;
            View view2 = this.f46482j0;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.f46485m0 = true;
        this.f46481i0.setOnItemClickListener(this.f46480h0);
        if (this.f46483k0 != null) {
            b5();
            View view3 = this.f46483k0;
            if (view3 == null) {
                throw new IllegalStateException("Can't be used with a custom content view");
            }
            if (this.f46485m0) {
                this.f46485m0 = false;
                view3.clearAnimation();
                this.f46484l0.clearAnimation();
                this.f46483k0.setVisibility(0);
                this.f46484l0.setVisibility(8);
            }
        }
        this.f46478f0.post(this.f46479g0);
    }

    @Override // androidx.fragment.app.Fragment
    @j.P
    public final View onCreateView(@j.N LayoutInflater layoutInflater, @j.P ViewGroup viewGroup, @j.P Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f46478f0.removeCallbacks(this.f46479g0);
        this.f46481i0 = null;
        this.f46485m0 = false;
        this.f46484l0 = null;
        this.f46483k0 = null;
        this.f46482j0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@j.N View view, @j.P Bundle bundle) {
        super.onViewCreated(view, bundle);
        b5();
    }
}
