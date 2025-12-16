package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.C22808a;
import androidx.core.view.accessibility.f;

/* compiled from: ClickActionDelegate.java */
/* loaded from: classes6.dex */
class a extends C22808a {

    /* renamed from: d, reason: collision with root package name */
    public final f.a f357658d;

    public a(Context context, int i12) {
        this.f357658d = new f.a(16, context.getString(i12));
    }

    @Override // androidx.core.view.C22808a
    public void d(View view, androidx.core.view.accessibility.f fVar) {
        this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
        fVar.b(this.f357658d);
    }
}
