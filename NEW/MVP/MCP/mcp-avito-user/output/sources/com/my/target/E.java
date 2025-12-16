package com.my.target;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.my.target.V;
import e11.C39924z;
import h11.InterfaceC40761a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class E extends FrameLayout implements V.a {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final ListView f364365b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final View f364366c;

    /* renamed from: d, reason: collision with root package name */
    public final int f364367d;

    /* renamed from: e, reason: collision with root package name */
    public final int f364368e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final ArrayList f364369f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final WeakReference<InterfaceC40761a.InterfaceC11238a> f364370g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public ImageButton f364371h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public WeakReference<V> f364372i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public h11.b f364373j;

    public static class a extends BaseAdapter {

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f364374d = 0;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final ArrayList f364375b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        public final WeakReference<InterfaceC40761a.InterfaceC11238a> f364376c;

        public a(@j.N ArrayList arrayList, @j.N WeakReference weakReference) {
            this.f364375b = arrayList;
            this.f364376c = weakReference;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.f364375b.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i12) {
            return this.f364375b.get(i12);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i12) {
            return i12;
        }

        @Override // android.widget.Adapter
        @j.P
        public final View getView(int i12, View view, ViewGroup viewGroup) {
            com.avito.android.fakedoor_dialog.a aVar = new com.avito.android.fakedoor_dialog.a(i12, 8, this);
            String str = ((h11.b) this.f364375b.get(i12)).f396977a;
            boolean z12 = i12 == 0;
            Context context = viewGroup.getContext();
            Button button = new Button(context);
            button.setOnClickListener(aVar);
            C39924z c39924z = new C39924z(context);
            int iA2 = c39924z.a(24);
            button.setPadding(iA2, button.getPaddingTop(), iA2, button.getPaddingBottom());
            button.setAllCaps(false);
            button.setStateListAnimator(null);
            button.setLines(1);
            button.setTextColor(-16777216);
            button.setEllipsize(TextUtils.TruncateAt.END);
            button.setTypeface(null, 0);
            button.setGravity(8388627);
            button.setLayoutParams(new RecyclerView.n(-1, -2));
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{-1, -1});
            GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{-3158065, -3158065});
            if (z12) {
                float fA2 = c39924z.a(8);
                float[] fArr = {fA2, fA2, fA2, fA2, 0.0f, 0.0f, 0.0f, 0.0f};
                gradientDrawable.setCornerRadii(fArr);
                gradientDrawable2.setCornerRadii(fArr);
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
            int[] iArr = StateSet.WILD_CARD;
            stateListDrawable.addState(iArr, gradientDrawable);
            button.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, iArr}, new int[]{C39924z.b(-3158065), C39924z.b(-1)}), stateListDrawable, null));
            button.setText(str);
            return button;
        }
    }

    public E(@j.N Context context, @j.N ArrayList arrayList, @j.N WeakReference weakReference) {
        super(context);
        this.f364373j = null;
        this.f364369f = new ArrayList(arrayList);
        this.f364370g = weakReference;
        C39924z c39924z = new C39924z(context);
        this.f364367d = c39924z.a(500);
        this.f364368e = c39924z.a(0.5f);
        ListView listView = new ListView(context);
        this.f364365b = listView;
        listView.setDivider(null);
        addView(listView);
        View view = new View(context);
        this.f364366c = view;
        view.setBackgroundColor(-5131855);
        addView(view);
    }

    @Override // com.my.target.V.a
    public final void d(@j.N V v12, @j.N FrameLayout frameLayout) {
        frameLayout.addView(this, -1, -1);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 512.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setFillAfter(true);
        this.f364365b.startAnimation(translateAnimation);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        ListView listView = this.f364365b;
        int iMax = Math.max((i14 - listView.getMeasuredWidth()) / 2, getPaddingLeft());
        ImageButton imageButton = this.f364371h;
        if (imageButton != null) {
            imageButton.layout(iMax, (i15 - getPaddingBottom()) - this.f364371h.getMeasuredHeight(), this.f364371h.getMeasuredWidth() + iMax, i15 - getPaddingBottom());
        }
        View view = this.f364366c;
        view.layout(iMax, this.f364371h.getTop() - view.getMeasuredHeight(), view.getMeasuredWidth() + iMax, this.f364371h.getTop());
        listView.layout(iMax, view.getTop() - listView.getMeasuredHeight(), listView.getMeasuredWidth() + iMax, view.getTop());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int iMin = (Math.min(size, this.f364367d) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        ImageButton imageButton = this.f364371h;
        if (imageButton != null) {
            imageButton.measure(iMakeMeasureSpec, paddingTop);
        }
        View view = this.f364366c;
        int i14 = this.f364368e;
        view.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
        this.f364365b.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec((paddingTop - i14) - this.f364371h.getMeasuredHeight(), BeduinInputModel.MIN_TEXT_VERSION));
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.V.a
    public final void q() {
        h11.b bVar;
        WeakReference<V> weakReference = this.f364372i;
        if (weakReference != null) {
            weakReference.clear();
            this.f364372i = null;
            InterfaceC40761a.InterfaceC11238a interfaceC11238a = this.f364370g.get();
            if (interfaceC11238a == null || (bVar = this.f364373j) == null) {
                return;
            }
            interfaceC11238a.a(bVar);
        }
    }

    @Override // com.my.target.V.a
    public final void b(boolean z12) {
    }
}
