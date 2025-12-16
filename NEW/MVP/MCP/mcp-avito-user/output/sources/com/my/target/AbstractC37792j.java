package com.my.target;

import com.my.target.common.MyTargetActivity;
import com.my.target.k1;
import e11.C39848C;
import e11.C39884l0;
import e11.p2;

/* renamed from: com.my.target.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37792j implements k1, MyTargetActivity.a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final k1.a f364875a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f364876b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public k1.b f364877c;

    public AbstractC37792j(@j.N k1.a aVar) {
        this.f364875a = aVar;
    }

    @j.P
    public static AbstractC37792j a(@j.N p2 p2Var, @j.N e11.W0 w02, boolean z12, @j.N k1.a aVar) {
        if (p2Var instanceof C39884l0) {
            return new X((C39884l0) p2Var, w02, z12, aVar);
        }
        if (p2Var instanceof C39848C) {
            return new C37823z((C39848C) p2Var, w02, aVar);
        }
        if (p2Var instanceof e11.P) {
            return new O((e11.P) p2Var, aVar);
        }
        return null;
    }

    @Override // com.my.target.k1
    public final void destroy() {
        b();
    }

    public final void b() {
    }
}
