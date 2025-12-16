package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.G0;
import androidx.core.view.J0;
import j.N;
import java.util.Iterator;
import java.util.List;
import lY0.C43707b;

/* compiled from: InsetsAnimationCallback.java */
/* loaded from: classes6.dex */
class k extends G0.b {

    /* renamed from: d, reason: collision with root package name */
    public final View f356064d;

    /* renamed from: e, reason: collision with root package name */
    public int f356065e;

    /* renamed from: f, reason: collision with root package name */
    public int f356066f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f356067g;

    public k(View view) {
        super(0);
        this.f356067g = new int[2];
        this.f356064d = view;
    }

    @Override // androidx.core.view.G0.b
    public final void b(@N G0 g02) {
        this.f356064d.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.G0.b
    public final void c(@N G0 g02) {
        View view = this.f356064d;
        int[] iArr = this.f356067g;
        view.getLocationOnScreen(iArr);
        this.f356065e = iArr[1];
    }

    @Override // androidx.core.view.G0.b
    @N
    public final J0 d(@N J0 j02, @N List<G0> list) {
        Iterator<G0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().c() & 8) != 0) {
                this.f356064d.setTranslationY(C43707b.c(r0.b(), this.f356066f, 0));
                break;
            }
        }
        return j02;
    }

    @Override // androidx.core.view.G0.b
    @N
    public final G0.a e(@N G0 g02, @N G0.a aVar) {
        View view = this.f356064d;
        int[] iArr = this.f356067g;
        view.getLocationOnScreen(iArr);
        int i12 = this.f356065e - iArr[1];
        this.f356066f = i12;
        view.setTranslationY(i12);
        return aVar;
    }
}
