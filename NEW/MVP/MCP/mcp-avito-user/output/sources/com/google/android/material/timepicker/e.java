package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.shape.o;
import com.google.android.material.shape.q;
import j.InterfaceC42156l;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RadialViewGroup.java */
/* loaded from: classes6.dex */
class e extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    public final c f357663b;

    /* renamed from: c, reason: collision with root package name */
    public int f357664c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.material.shape.k f357665d;

    public e(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i12, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i12, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            c cVar = this.f357663b;
            handler.removeCallbacks(cVar);
            handler.post(cVar);
        }
    }

    public void g() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.g(this);
        HashMap map = new HashMap();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i13 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i13 == null) {
                    i13 = 1;
                }
                if (!map.containsKey(i13)) {
                    map.put(i13, new ArrayList());
                }
                ((List) map.get(i13)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f357664c * 0.66f) : this.f357664c;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id2 = ((View) it.next()).getId();
                int i14 = R.id.circle_center;
                d.b bVar = dVar.p(id2).f44269e;
                bVar.f44286A = i14;
                bVar.f44287B = iRound;
                bVar.f44288C = size;
                size += 360.0f / list.size();
            }
        }
        dVar.c(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            c cVar = this.f357663b;
            handler.removeCallbacks(cVar);
            handler.post(cVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(@InterfaceC42156l int i12) {
        this.f357665d.n(ColorStateList.valueOf(i12));
    }

    public e(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
        this.f357665d = kVar;
        o oVar = new o(0.5f);
        q.b bVarF = kVar.f357034b.f357057a.f();
        bVarF.f357097e = oVar;
        bVarF.f357098f = oVar;
        bVarF.f357099g = oVar;
        bVarF.f357100h = oVar;
        kVar.setShapeAppearanceModel(bVarF.a());
        this.f357665d.n(ColorStateList.valueOf(-1));
        com.google.android.material.shape.k kVar2 = this.f357665d;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        setBackground(kVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RadialViewGroup, i12, 0);
        this.f357664c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.f357663b = new c(this, 1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
