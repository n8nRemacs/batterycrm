package com.my.target;

import android.view.View;
import e11.C39875i0;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class C0 extends C37798m {

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public a f364356g;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            WeakReference<C39875i0> weakReference = C0.this.f364925f;
            C39875i0 c39875i0 = weakReference != null ? weakReference.get() : null;
            if (c39875i0 == null) {
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            view.getMeasuredHeight();
            c39875i0.layout((measuredWidth - c39875i0.getMeasuredWidth()) - view.getPaddingLeft(), view.getPaddingTop(), measuredWidth - view.getPaddingRight(), view.getPaddingTop() + c39875i0.getMeasuredHeight());
        }
    }
}
