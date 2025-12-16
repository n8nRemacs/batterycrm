package org.commonmark.internal;

import Q61.AbstractC14868b;
import Q61.u;
import Q61.x;

/* compiled from: ListItemParser.java */
/* loaded from: classes7.dex */
public class q extends R61.a {

    /* renamed from: a, reason: collision with root package name */
    public final u f420357a = new u();

    /* renamed from: b, reason: collision with root package name */
    public final int f420358b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f420359c;

    public q(int i12) {
        this.f420358b = i12;
    }

    @Override // R61.a, R61.d
    public final boolean a() {
        return true;
    }

    @Override // R61.d
    public final AbstractC14868b c() {
        return this.f420357a;
    }

    @Override // R61.a, R61.d
    public final boolean e(AbstractC14868b abstractC14868b) {
        if (!this.f420359c) {
            return true;
        }
        AbstractC14868b abstractC14868b2 = (AbstractC14868b) this.f420357a.f13500a;
        if (!(abstractC14868b2 instanceof Q61.t)) {
            return true;
        }
        ((Q61.t) abstractC14868b2).f13499f = false;
        return true;
    }

    @Override // R61.d
    public final R61.c g(h hVar) {
        if (hVar.f420287h) {
            if (this.f420357a.f13501b == null) {
                return null;
            }
            AbstractC14868b abstractC14868bC = hVar.h().c();
            this.f420359c = (abstractC14868bC instanceof x) || (abstractC14868bC instanceof u);
            return R61.c.a(hVar.f420284e);
        }
        int i12 = hVar.f420286g;
        int i13 = this.f420358b;
        if (i12 >= i13) {
            return new b(-1, hVar.f420282c + i13, false);
        }
        return null;
    }
}
