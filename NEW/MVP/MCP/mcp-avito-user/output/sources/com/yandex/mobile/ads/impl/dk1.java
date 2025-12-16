package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes8.dex */
public final class dk1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final yl1 f384628a = new yl1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final q21 f384629b = q21.b();

    @j.P
    public final Rect a(@j.N View view) {
        Rect rect = new Rect();
        Context context = view.getContext();
        if (view.getGlobalVisibleRect(rect)) {
            v11 v11VarA = this.f384629b.a(context);
            if (v11VarA == null || !v11VarA.Y()) {
                return rect;
            }
            this.f384628a.getClass();
            Rect rectA = yl1.a(view);
            Rect rect2 = new Rect(rect);
            if (rect2.intersect(rectA)) {
                return rect2;
            }
        }
        return null;
    }
}
