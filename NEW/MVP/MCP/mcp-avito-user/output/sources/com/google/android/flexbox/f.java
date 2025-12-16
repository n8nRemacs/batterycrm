package com.google.android.flexbox;

import android.view.View;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;

/* compiled from: FlexLine.java */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: e, reason: collision with root package name */
    public int f348501e;

    /* renamed from: f, reason: collision with root package name */
    public int f348502f;

    /* renamed from: g, reason: collision with root package name */
    public int f348503g;

    /* renamed from: h, reason: collision with root package name */
    public int f348504h;

    /* renamed from: i, reason: collision with root package name */
    public int f348505i;

    /* renamed from: j, reason: collision with root package name */
    public float f348506j;

    /* renamed from: k, reason: collision with root package name */
    public float f348507k;

    /* renamed from: l, reason: collision with root package name */
    public int f348508l;

    /* renamed from: m, reason: collision with root package name */
    public int f348509m;

    /* renamed from: o, reason: collision with root package name */
    public int f348511o;

    /* renamed from: p, reason: collision with root package name */
    public int f348512p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f348513q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f348514r;

    /* renamed from: a, reason: collision with root package name */
    public int f348497a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public int f348498b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f348499c = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: d, reason: collision with root package name */
    public int f348500d = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f348510n = new ArrayList();

    public final int a() {
        return this.f348504h - this.f348505i;
    }

    public final void b(View view, int i12, int i13, int i14, int i15) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f348497a = Math.min(this.f348497a, (view.getLeft() - flexItem.c3()) - i12);
        this.f348498b = Math.min(this.f348498b, (view.getTop() - flexItem.G0()) - i13);
        this.f348499c = Math.max(this.f348499c, view.getRight() + flexItem.j3() + i14);
        this.f348500d = Math.max(this.f348500d, view.getBottom() + flexItem.i1() + i15);
    }
}
