package com.google.common.base;

import com.google.common.base.b0;

/* compiled from: Splitter.java */
/* loaded from: classes6.dex */
class W extends b0.b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC37263g f358982i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(b0 b0Var, CharSequence charSequence, AbstractC37263g abstractC37263g) {
        super(b0Var, charSequence);
        this.f358982i = abstractC37263g;
    }

    @Override // com.google.common.base.b0.b
    public final int b(int i12) {
        return this.f358982i.a();
    }

    @Override // com.google.common.base.b0.b
    public final int c(int i12) {
        AbstractC37263g abstractC37263g = this.f358982i;
        if (abstractC37263g.b(i12)) {
            return abstractC37263g.c();
        }
        return -1;
    }
}
