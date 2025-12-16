package com.google.common.base;

import com.google.common.base.b0;

/* compiled from: Splitter.java */
/* loaded from: classes6.dex */
class U extends b0.b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V f358981i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v12, b0 b0Var, CharSequence charSequence) {
        super(b0Var, charSequence);
        this.f358981i = v12;
    }

    @Override // com.google.common.base.b0.b
    public final int b(int i12) {
        this.f358981i.getClass();
        return 1 + i12;
    }

    @Override // com.google.common.base.b0.b
    public final int c(int i12) {
        this.f358981i.getClass();
        CharSequence charSequence = this.f359000d;
        int length = charSequence.length() - 1;
        while (i12 <= length) {
            if (charSequence.charAt(i12) == " ".charAt(0)) {
                return i12;
            }
            i12++;
        }
        return -1;
    }
}
