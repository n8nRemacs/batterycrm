package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.sdk.lists.widgets.EmptyRecyclerView;
import ru.ok.tamtam.stickers.view.RecyclerAutofitGridView;

/* loaded from: classes2.dex */
public final class kd5 extends rhd {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ kd5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rhd
    public void a() {
        switch (this.a) {
            case 0:
                ((EmptyRecyclerView) this.b).F0();
                break;
            case 2:
                ((wo8) this.b).g(true);
                break;
            case 3:
                ((ny6) this.b).a();
                break;
            case 4:
                lda ldaVar = (lda) this.b;
                ldaVar.e = ldaVar.c.j();
                an3 an3Var = ldaVar.d;
                ((zm3) an3Var.e).m();
                an3Var.c();
                break;
            case 5:
                ((RecyclerAutofitGridView) this.b).F0();
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n(null);
                recyclerView.r1.g = true;
                recyclerView.k0(true);
                if (!recyclerView.o.u()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
            case 8:
                ((f54) this.b).f();
                break;
        }
    }

    @Override // defpackage.rhd
    public void b(int i, int i2) {
        switch (this.a) {
            case 2:
                a();
                break;
            case 3:
                ((ny6) this.b).a();
                break;
            case 4:
                lda ldaVar = (lda) this.b;
                an3 an3Var = ldaVar.d;
                ((zm3) an3Var.e).o(i + an3Var.d(ldaVar), i2, null);
                break;
            case 7:
                ((cm6) this.b).invoke();
                break;
            case 8:
                ((f54) this.b).f();
                break;
        }
    }

    @Override // defpackage.rhd
    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 2:
                a();
                break;
            case 3:
                ((ny6) this.b).a();
                break;
            case 4:
                lda ldaVar = (lda) this.b;
                an3 an3Var = ldaVar.d;
                ((zm3) an3Var.e).o(i + an3Var.d(ldaVar), i2, obj);
                break;
            case 5:
            default:
                super.c(i, i2, obj);
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n(null);
                a9 a9Var = recyclerView.o;
                ArrayList arrayList = (ArrayList) a9Var.c;
                if (i2 >= 1) {
                    arrayList.add(a9Var.x(obj, 4, i, i2));
                    a9Var.a |= 4;
                    if (arrayList.size() == 1) {
                        h();
                        break;
                    }
                }
                break;
            case 7:
                ((cm6) this.b).invoke();
                break;
            case 8:
                ((f54) this.b).f();
                break;
        }
    }

    @Override // defpackage.rhd
    public void d(int i, int i2) {
        switch (this.a) {
            case 0:
                lg8 lg8Var = lg8.d;
                String name = kd5.class.getName();
                EmptyRecyclerView emptyRecyclerView = (EmptyRecyclerView) this.b;
                l6b l6bVar = wqi.a;
                if (l6bVar != null && l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, xc0.f("onItemRangeInserted start. isComputingLayout:", emptyRecyclerView.Z()), null);
                }
                ((EmptyRecyclerView) this.b).F0();
                String name2 = kd5.class.getName();
                EmptyRecyclerView emptyRecyclerView2 = (EmptyRecyclerView) this.b;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    l6bVar2.c(lg8Var, name2, xc0.f("onItemRangeInserted end. isComputingLayout:", emptyRecyclerView2.Z()), null);
                    break;
                }
                break;
            case 1:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.b;
                yy7[] yy7VarArr = ChatsListSearchScreen.I0;
                if (((y23) chatsListSearchScreen.z0().I0.a.getValue()).d.size() == i2) {
                    chatsListSearchScreen.C0();
                }
                chatsListSearchScreen.D0(i2 > 0 && chatsListSearchScreen.z0().x());
                break;
            case 2:
                a();
                break;
            case 3:
                ((ny6) this.b).a();
                break;
            case 4:
                lda ldaVar = (lda) this.b;
                ldaVar.e += i2;
                an3 an3Var = ldaVar.d;
                ((zm3) an3Var.e).p(i + an3Var.d(ldaVar), i2);
                if (ldaVar.e > 0 && ldaVar.c.c == 2) {
                    an3Var.c();
                    break;
                }
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n(null);
                a9 a9Var = recyclerView.o;
                ArrayList arrayList = (ArrayList) a9Var.c;
                if (i2 >= 1) {
                    arrayList.add(a9Var.x(null, 1, i, i2));
                    a9Var.a |= 1;
                    if (arrayList.size() == 1) {
                        h();
                        break;
                    }
                }
                break;
            case 7:
                ((cm6) this.b).invoke();
                break;
            case 8:
                ((f54) this.b).f();
                break;
        }
    }

    @Override // defpackage.rhd
    public void e(int i, int i2) {
        switch (this.a) {
            case 2:
                a();
                break;
            case 3:
                ((ny6) this.b).a();
                break;
            case 4:
                lda ldaVar = (lda) this.b;
                an3 an3Var = ldaVar.d;
                int iD = an3Var.d(ldaVar);
                ((zm3) an3Var.e).n(i + iD, i2 + iD);
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.n(null);
                a9 a9Var = recyclerView.o;
                ArrayList arrayList = (ArrayList) a9Var.c;
                if (i != i2) {
                    arrayList.add(a9Var.x(null, 8, i, i2));
                    a9Var.a |= 8;
                    if (arrayList.size() == 1) {
                        h();
                        break;
                    }
                }
                break;
            case 7:
                ((cm6) this.b).invoke();
                break;
            case 8:
                ((f54) this.b).f();
                break;
        }
    }

    @Override // defpackage.rhd
    public void f(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((EmptyRecyclerView) obj).F0();
                break;
            case 1:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) obj;
                yy7[] yy7VarArr = ChatsListSearchScreen.I0;
                if (((y23) chatsListSearchScreen.z0().I0.a.getValue()).d.isEmpty()) {
                    chatsListSearchScreen.D0(false);
                    break;
                }
                break;
            case 2:
                a();
                break;
            case 3:
                ((ny6) obj).a();
                break;
            case 4:
                lda ldaVar = (lda) obj;
                ldaVar.e -= i2;
                an3 an3Var = ldaVar.d;
                ((zm3) an3Var.e).a.f(i + an3Var.d(ldaVar), i2);
                if (ldaVar.e < 1 && ldaVar.c.c == 2) {
                    an3Var.c();
                    break;
                }
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.n(null);
                a9 a9Var = recyclerView.o;
                ArrayList arrayList = (ArrayList) a9Var.c;
                if (i2 >= 1) {
                    arrayList.add(a9Var.x(null, 2, i, i2));
                    a9Var.a |= 2;
                    if (arrayList.size() == 1) {
                        h();
                        break;
                    }
                }
                break;
            case 7:
                ((cm6) obj).invoke();
                break;
            case 8:
                ((f54) obj).f();
                break;
        }
    }

    @Override // defpackage.rhd
    public void g() {
        phd phdVar;
        switch (this.a) {
            case 4:
                ((lda) this.b).d.c();
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.d != null && (phdVar = recyclerView.z0) != null) {
                    int iV = az1.v(phdVar.c);
                    if (iV != 1) {
                        if (iV == 2) {
                        }
                    } else if (phdVar.j() <= 0) {
                    }
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    public void h() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!RecyclerView.P1 || !recyclerView.G0 || !recyclerView.F0) {
            recyclerView.N0 = true;
            recyclerView.requestLayout();
        } else {
            ohd ohdVar = recyclerView.v0;
            WeakHashMap weakHashMap = hfh.a;
            recyclerView.postOnAnimation(ohdVar);
        }
    }
}
