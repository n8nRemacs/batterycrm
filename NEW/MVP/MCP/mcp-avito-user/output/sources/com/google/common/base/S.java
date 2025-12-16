package com.google.common.base;

import com.google.common.base.b0;

/* compiled from: Splitter.java */
/* loaded from: classes6.dex */
class S extends b0.b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T f358977i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t12, b0 b0Var, CharSequence charSequence) {
        super(b0Var, charSequence);
        this.f358977i = t12;
    }

    @Override // com.google.common.base.b0.b
    public final int b(int i12) {
        return i12 + 1;
    }

    @Override // com.google.common.base.b0.b
    public final int c(int i12) {
        return this.f358977i.f358980a.h(i12, this.f359000d);
    }
}
