package io.noties.markwon.core;

import Q61.AbstractC14868b;
import Q61.u;
import Q61.v;
import Q61.w;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.n;
import io.noties.markwon.y;
import j.N;

/* compiled from: CorePlugin.java */
/* loaded from: classes8.dex */
class o implements n.c<u> {
    @Override // io.noties.markwon.n.c
    public final void a(@N v vVar, @N io.noties.markwon.n nVar) {
        u uVar = (u) vVar;
        int length = nVar.length();
        nVar.F(uVar);
        AbstractC14868b abstractC14868b = (AbstractC14868b) uVar.f13500a;
        boolean z12 = abstractC14868b instanceof w;
        io.noties.markwon.v<CoreProps.ListItemType> vVar2 = CoreProps.f401652a;
        if (z12) {
            w wVar = (w) abstractC14868b;
            int i12 = wVar.f13505g;
            nVar.f().a(vVar2, CoreProps.ListItemType.f401660c);
            nVar.f().a(CoreProps.f401654c, Integer.valueOf(i12));
            wVar.f13505g++;
        } else {
            nVar.f().a(vVar2, CoreProps.ListItemType.f401659b);
            io.noties.markwon.v<Integer> vVar3 = CoreProps.f401653b;
            y yVarF = nVar.f();
            int i13 = 0;
            for (v vVarC = (AbstractC14868b) uVar.f13500a; vVarC != null; vVarC = vVarC.c()) {
                if (vVarC instanceof u) {
                    i13++;
                }
            }
            yVarF.a(vVar3, Integer.valueOf(i13));
        }
        nVar.i(uVar, length);
        if (nVar.r(uVar)) {
            nVar.w();
        }
    }
}
