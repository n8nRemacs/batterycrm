package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class d01 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final s81 f384503a = new s81();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final m91 f384504b;

    public d01(@j.N n91 n91Var) {
        this.f384504b = n91Var;
    }

    public final void a(@j.N View view, long j12, long j13) {
        view.setVisibility(0);
        TextView textViewA = this.f384504b.a(view);
        if (textViewA != null) {
            this.f384503a.getClass();
            s81.a(textViewA, j12, j13);
        }
    }
}
