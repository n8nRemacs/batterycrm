package com.my.target.nativeads.views;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import e11.C39924z;
import j.N;
import j.P;
import java.util.ArrayList;
import k11.C42474a;

/* loaded from: classes7.dex */
public class b extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, AbsListView.OnScrollListener {

    /* renamed from: b, reason: collision with root package name */
    @P
    public a f365032b;

    public interface a {
        void a(@N ArrayList arrayList);

        void b();
    }

    /* renamed from: com.my.target.nativeads.views.b$b, reason: collision with other inner class name */
    public static class C10790b extends ArrayAdapter<C42474a> {
        public C10790b() {
            throw null;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @N
        public final View getView(int i12, View view, @N ViewGroup viewGroup) {
            C42474a item = getItem(i12);
            if (view == null) {
                view = new c(new com.my.target.nativeads.views.a(getContext()), getContext());
            }
            if (item != null) {
                ((c) view).getView().setNativeAppwallBanner(item);
            }
            return view;
        }
    }

    @SuppressLint({"ViewConstructor"})
    public static class c extends FrameLayout {

        /* renamed from: b, reason: collision with root package name */
        @N
        public final com.my.target.nativeads.views.a f365033b;

        public c(@N com.my.target.nativeads.views.a aVar, Context context) {
            super(context);
            C39924z c39924z = new C39924z(context);
            this.f365033b = aVar;
            int iA2 = c39924z.a(9);
            int iA3 = c39924z.a(4);
            int iA4 = c39924z.a(2);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(-1118482);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(iA2, iA3, iA2, iA3);
            aVar.setLayoutParams(layoutParams);
            linearLayout.addView(aVar);
            aVar.setElevation(iA4);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{-1, -1});
            GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{-1118482, -1118482});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
            stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
            aVar.setBackground(stateListDrawable);
            addView(linearLayout, -2, -2);
        }

        @N
        public com.my.target.nativeads.views.a getView() {
            return this.f365033b;
        }
    }

    public final void a() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        a();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i12, long j12) {
        throw null;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i12, int i13, int i14) {
        a();
    }

    public void setAppwallAdViewListener(@P a aVar) {
        this.f365032b = aVar;
    }

    public void setupView(@N com.my.target.nativeads.g gVar) {
        Context context = getContext();
        gVar.getClass();
        new C10790b(context, 0, null);
        throw null;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i12) {
    }
}
