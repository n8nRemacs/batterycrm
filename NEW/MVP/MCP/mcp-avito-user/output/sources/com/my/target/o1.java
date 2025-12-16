package com.my.target;

import androidx.recyclerview.widget.RecyclerView;
import com.my.target.InterfaceC37775a0;
import e11.C39861d1;
import e11.C39883l;
import e11.X1;
import e11.k2;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class o1 implements m1, InterfaceC37775a0.a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C39883l f365064a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C37794k f365065b;

    /* renamed from: c, reason: collision with root package name */
    public int f365066c;

    public o1(@j.N C39883l c39883l, @j.N C37794k c37794k) {
        this.f365064a = c39883l;
        this.f365065b = c37794k;
    }

    @Override // com.my.target.m1
    public final void a(@j.N ViewOnTouchListenerC37781d0 viewOnTouchListenerC37781d0) {
        viewOnTouchListenerC37781d0.setBanner(null);
        viewOnTouchListenerC37781d0.setListener(null);
    }

    @Override // com.my.target.m1
    public final void b(@j.N ViewOnTouchListenerC37781d0 viewOnTouchListenerC37781d0, int i12) {
        this.f365066c = i12;
        C37794k c37794k = this.f365065b;
        ArrayList arrayList = c37794k.f364886d;
        C39883l c39883l = this.f365064a;
        if (!arrayList.contains(c39883l)) {
            b4 b4Var = c37794k.f364884b;
            ArrayList<X1> arrayListE = c39883l.f394702a.e("render");
            N0 n02 = b4Var.f364732e;
            n02.getClass();
            k2.a(n02.getContext(), arrayListE);
            arrayList.add(c39883l);
        }
        viewOnTouchListenerC37781d0.setBanner(c39883l);
        viewOnTouchListenerC37781d0.setListener(this);
    }

    @Override // com.my.target.InterfaceC37775a0.a
    public final void a(boolean z12) {
        RecyclerView.y yVarE;
        int i12 = this.f365066c;
        C37794k c37794k = this.f365065b;
        C c12 = c37794k.f364883a;
        C37805p0 c37805p0 = c12.f364353c;
        if (i12 >= c37805p0.H1() && i12 <= c37805p0.L1()) {
            if (z12) {
                c37794k.f364884b.a(this.f365064a);
                return;
            }
            return;
        }
        C39861d1 c39861d1 = c12.f364354d;
        if (i12 == -1) {
            c39861d1.getClass();
            return;
        }
        RecyclerView recyclerView = c39861d1.f394572m;
        if (recyclerView == null || recyclerView.getLayoutManager() == null || (yVarE = c39861d1.e(c39861d1.f394572m.getLayoutManager())) == null) {
            return;
        }
        yVarE.f53878a = i12;
        c39861d1.f394572m.getLayoutManager().x1(yVarE);
    }
}
