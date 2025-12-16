package com.google.common.base;

import com.google.common.base.b0;
import java.util.Iterator;

/* compiled from: Splitter.java */
/* loaded from: classes6.dex */
class T implements b0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC37259e f358980a;

    public T(AbstractC37259e abstractC37259e) {
        this.f358980a = abstractC37259e;
    }

    @Override // com.google.common.base.b0.c
    public final Iterator a(b0 b0Var, CharSequence charSequence) {
        return new S(this, b0Var, charSequence);
    }
}
