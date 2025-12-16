package com.my.target;

import com.my.target.C37803o0;
import com.my.target.C37818w0;
import e11.AbstractC39895p;

/* renamed from: com.my.target.l0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37797l0 extends C37803o0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC39895p f364918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37799m0 f364919b;

    public C37797l0(C37799m0 c37799m0, AbstractC39895p abstractC39895p) {
        this.f364919b = c37799m0;
        this.f364918a = abstractC39895p;
    }

    @Override // com.my.target.C37803o0.a
    public final void a() {
        String str = this.f364918a.f394726y;
        C37799m0 c37799m0 = this.f364919b;
        p1 p1Var = c37799m0.f364938m;
        if (p1Var != null) {
            p1Var.a(p1Var.f365072d, System.currentTimeMillis() - p1Var.f365071c);
            c37799m0.f364938m.b(c37799m0.f364929d);
        }
        C37818w0.a aVar = c37799m0.f364936k;
        if (aVar != null) {
            aVar.a();
        }
    }
}
