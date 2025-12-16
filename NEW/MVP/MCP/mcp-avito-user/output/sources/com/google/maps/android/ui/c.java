package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;

/* compiled from: IconGenerator.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f362283a;

    /* renamed from: b, reason: collision with root package name */
    public final RotationLayout f362284b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f362285c;

    public c(Context context) {
        a aVar = new a(context.getResources());
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
        this.f362283a = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.f362284b = rotationLayout;
        this.f362285c = (TextView) rotationLayout.findViewById(R.id.amu_text);
        aVar.f362282c = -1;
        a(aVar);
        TextView textView = this.f362285c;
        if (textView != null) {
            textView.setTextAppearance(context, R.style.amu_Bubble_TextAppearance_Dark);
        }
    }

    public final void a(Drawable drawable) {
        ViewGroup viewGroup = this.f362283a;
        viewGroup.setBackgroundDrawable(drawable);
        if (drawable == null) {
            viewGroup.setPadding(0, 0, 0, 0);
            return;
        }
        Rect rect = new Rect();
        drawable.getPadding(rect);
        viewGroup.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
