package com.my.target;

import android.view.View;
import com.my.target.i1;
import e11.B1;

/* loaded from: classes7.dex */
public class G0 implements i1 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final i1.a f364396b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final B1 f364397c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public D f364398d;

    @j.k0
    public G0(@j.N B1 b12, @j.N i1.a aVar) {
        this.f364397c = b12;
        this.f364396b = aVar;
    }

    @Override // com.my.target.i1
    @j.P
    public final View getCloseButton() {
        return this.f364397c.getCloseButton();
    }

    @Override // com.my.target.i1
    @j.N
    public final View j() {
        return this.f364397c;
    }

    @Override // com.my.target.i1
    public final void destroy() {
    }
}
