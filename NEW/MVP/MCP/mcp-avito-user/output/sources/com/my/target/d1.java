package com.my.target;

import android.content.Context;
import com.my.target.C37798m;
import com.my.target.G;
import e11.C39848C;

/* loaded from: classes7.dex */
public class d1 implements C37798m.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C39848C f364798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f364799c;

    public d1(e1 e1Var, C39848C c39848c) {
        this.f364799c = e1Var;
        this.f364798b = c39848c;
    }

    @Override // com.my.target.C37798m.a
    public final void a(@j.N Context context) {
        G.a aVar = this.f364799c.f364824n;
        if (aVar != null) {
            aVar.d(this.f364798b, context);
        }
    }
}
