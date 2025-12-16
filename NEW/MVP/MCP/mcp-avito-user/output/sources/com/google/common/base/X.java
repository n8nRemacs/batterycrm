package com.google.common.base;

import com.google.common.base.b0;
import java.util.Iterator;

/* compiled from: Splitter.java */
/* loaded from: classes6.dex */
class X implements b0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37280y f358983a;

    public X(C37280y c37280y) {
        this.f358983a = c37280y;
    }

    @Override // com.google.common.base.b0.c
    public final Iterator a(b0 b0Var, CharSequence charSequence) {
        return new W(b0Var, charSequence, this.f358983a.a(charSequence));
    }
}
