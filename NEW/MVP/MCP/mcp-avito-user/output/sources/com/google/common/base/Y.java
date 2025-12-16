package com.google.common.base;

import com.google.common.base.b0;

/* compiled from: Splitter.java */
/* loaded from: classes6.dex */
class Y extends b0.b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z f358984i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Z z12, b0 b0Var, CharSequence charSequence) {
        super(b0Var, charSequence);
        this.f358984i = z12;
    }

    @Override // com.google.common.base.b0.b
    public final int c(int i12) {
        this.f358984i.getClass();
        if (i12 < this.f359000d.length()) {
            return i12;
        }
        return -1;
    }

    @Override // com.google.common.base.b0.b
    public final int b(int i12) {
        return i12;
    }
}
