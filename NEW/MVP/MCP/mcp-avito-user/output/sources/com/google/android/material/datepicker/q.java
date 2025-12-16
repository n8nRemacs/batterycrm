package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.J0;
import androidx.core.view.M;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes6.dex */
class q implements M {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f356548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f356549c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f356550d;

    public q(View view, int i12, int i13) {
        this.f356548b = i12;
        this.f356549c = view;
        this.f356550d = i13;
    }

    @Override // androidx.core.view.M
    public final J0 h(View view, J0 j02) {
        int i12 = j02.e(7).f44776b;
        View view2 = this.f356549c;
        int i13 = this.f356548b;
        if (i13 >= 0) {
            view2.getLayoutParams().height = i13 + i12;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f356550d + i12, view2.getPaddingRight(), view2.getPaddingBottom());
        return j02;
    }
}
