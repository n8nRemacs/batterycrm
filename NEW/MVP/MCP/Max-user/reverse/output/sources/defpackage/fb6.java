package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import one.me.chats.list.ChatsListWidget;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.members.list.MembersListWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class fb6 extends y0f {
    public Object X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb6(Object obj, ExecutorService executorService, int i) {
        super(executorService);
        this.o = i;
        this.X = obj;
    }

    @Override // defpackage.y0f
    /* renamed from: H */
    public void r(d2f d2fVar, int i) {
        switch (this.o) {
            case 0:
                d2fVar.z((t98) C(i));
                return;
            case 1:
            default:
                super.r(d2fVar, i);
                return;
            case 2:
                l94 l94Var = (l94) d2fVar;
                k94 k94Var = (k94) ((t98) C(i));
                d92 d92Var = new d92(17, this);
                l94Var.z(k94Var);
                ((LinearLayout) l94Var.a).setOnClickListener(new ub(d92Var, 26, k94Var));
                return;
            case 3:
                int k0 = ((bq5) ((t98) C(i))).getK0();
                int i2 = i1b.u;
                iv ivVar = this.d;
                if (k0 == i2) {
                    zp5 zp5Var = (zp5) d2fVar;
                    bq5 bq5Var = (bq5) ivVar.f.get(i);
                    jx0 jx0Var = new jx0(1, (ChatsListWidget) this.X, eq5.class, "onFakeChatItemClick", "onFakeChatItemClick(J)V", 0, 13);
                    rw rwVar = new rw(2, (ChatsListWidget) this.X, eq5.class, "onFakeChatItemLongTap", "onFakeChatItemLongTap(JLandroid/view/View;)V", 0, 19);
                    jx0 jx0Var2 = new jx0(1, (ChatsListWidget) this.X, eq5.class, "onFakeChatItemButtonClick", "onFakeChatItemButtonClick(J)V", 0, 14);
                    zp5Var.z(bq5Var);
                    uc2 uc2Var = (uc2) zp5Var.a;
                    f8j.d(uc2Var, 300L, new w01(bq5Var, jx0Var, jx0Var2, 1));
                    uc2Var.setOnLongClickListener(new yi2(rwVar, bq5Var, zp5Var, 5));
                    return;
                }
                if (k0 == i1b.v) {
                    dq5 dq5Var = (dq5) d2fVar;
                    bq5 bq5Var2 = (bq5) ivVar.f.get(i);
                    jx0 jx0Var3 = new jx0(1, (ChatsListWidget) this.X, eq5.class, "onFakeChatItemClick", "onFakeChatItemClick(J)V", 0, 15);
                    rw rwVar2 = new rw(2, (ChatsListWidget) this.X, eq5.class, "onFakeChatItemLongTap", "onFakeChatItemLongTap(JLandroid/view/View;)V", 0, 20);
                    jx0 jx0Var4 = new jx0(1, (ChatsListWidget) this.X, eq5.class, "onFakeChatItemButtonClick", "onFakeChatItemButtonClick(J)V", 0, 16);
                    dq5Var.z(bq5Var2);
                    v0b v0bVar = (v0b) dq5Var.a;
                    dq5Var.E0 = jx0Var3;
                    dq5Var.F0 = jx0Var4;
                    if (bq5Var2.Y) {
                        f8j.d(v0bVar, 300L, new cq5(dq5Var, bq5Var2, 0));
                        v0bVar.f();
                    } else {
                        f8j.d(v0bVar, 300L, new cq5(dq5Var, bq5Var2, 1));
                        CharSequence charSequence = bq5Var2.X;
                        if (charSequence == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        v0bVar.h(charSequence, new qn2(jx0Var4, 12, bq5Var2));
                    }
                    v0bVar.setOnLongClickListener(new yi2(rwVar2, bq5Var2, dq5Var, 6));
                    return;
                }
                return;
            case 4:
                J((mc9) d2fVar, i);
                return;
            case 5:
                K((ugc) d2fVar, i);
                return;
            case 6:
                K((ugc) d2fVar, i);
                return;
        }
    }

    public void J(mc9 mc9Var, int i) {
        rw rwVar;
        lc9 lc9Var = (lc9) ((t98) C(i));
        if (lc9Var.Z || lc9Var.s0) {
            rwVar = null;
        } else {
            rwVar = new rw(2, (MembersListWidget) this.X, gd9.class, "onMemberLongClick", "onMemberLongClick(JLandroid/view/View;)V", 0, 27);
        }
        ia iaVar = new ia(lc9Var, 19, this);
        mc9Var.z(lc9Var);
        v0b v0bVar = (v0b) mc9Var.a;
        f8j.d(v0bVar, 300L, new kg6(iaVar, 15, lc9Var));
        if (rwVar != null) {
            v0bVar.setOnLongClickListener(new d72(rwVar, 4, lc9Var));
        } else {
            v0bVar.setOnLongClickListener(null);
            v0bVar.setLongClickable(false);
        }
        v0bVar.f();
    }

    public void K(ugc ugcVar, int i) {
        switch (this.o) {
            case 5:
                qfc qfcVar = (qfc) ((t98) C(i));
                ugcVar.z(qfcVar);
                if (!(qfcVar instanceof qbe)) {
                    if (!(qfcVar instanceof vwe)) {
                        if (qfcVar instanceof a7) {
                            y6 y6Var = ugcVar instanceof y6 ? (y6) ugcVar : null;
                            if (y6Var != null) {
                                f8j.d(y6Var.a, 300L, new x6(0, new l3b(this, 7, qfcVar)));
                                break;
                            }
                        }
                    } else {
                        xwe xweVar = ugcVar instanceof xwe ? (xwe) ugcVar : null;
                        if (xweVar != null) {
                            xweVar.G0.addTextChangedListener(new li1(xweVar, 7, new ncc(this, 1)));
                            f8j.d(xweVar.K0, 300L, new pcc(13, new occ(this, 0)));
                            f8j.d(xweVar.H0, 300L, new pcc(14, new occ(this, 1)));
                            f8j.d(xweVar.I0, 300L, new wfe(xweVar, 8, new occ(this, 2)));
                            break;
                        }
                    }
                } else {
                    rbe rbeVar = ugcVar instanceof rbe ? (rbe) ugcVar : null;
                    if (rbeVar != null) {
                        f8j.d(rbeVar.a, 300L, new kg6(rbeVar, 29, new ncc(this, 0)));
                        break;
                    }
                }
                break;
            default:
                qfc qfcVar2 = (qfc) ((t98) C(i));
                ugcVar.z(qfcVar2);
                if (!(qfcVar2 instanceof x06)) {
                    if (!(qfcVar2 instanceof a18)) {
                        if (!(qfcVar2 instanceof ms2)) {
                            if (!(qfcVar2 instanceof du4)) {
                                if (!(qfcVar2 instanceof dj7)) {
                                    if (!(qfcVar2 instanceof mt4)) {
                                        if (!(qfcVar2 instanceof w32)) {
                                            if (!(qfcVar2 instanceof a7)) {
                                                if (qfcVar2 instanceof ti8) {
                                                    vi8 vi8Var = ugcVar instanceof vi8 ? (vi8) ugcVar : null;
                                                    if (vi8Var != null) {
                                                        f8j.d(vi8Var.a, 300L, new ye6(11, new sgc(this, 3)));
                                                        break;
                                                    }
                                                }
                                            } else {
                                                y6 y6Var2 = ugcVar instanceof y6 ? (y6) ugcVar : null;
                                                if (y6Var2 != null) {
                                                    f8j.d(y6Var2.a, 300L, new x6(0, new l3b(this, 11, qfcVar2)));
                                                    break;
                                                }
                                            }
                                        } else {
                                            x32 x32Var = ugcVar instanceof x32 ? (x32) ugcVar : null;
                                            if (x32Var != null) {
                                                f8j.d(x32Var.E0, 300L, new j6(9, new sgc(this, 2)));
                                                break;
                                            }
                                        }
                                    } else {
                                        lt4 lt4Var = ugcVar instanceof lt4 ? (lt4) ugcVar : null;
                                        if (lt4Var != null) {
                                            f8j.d(lt4Var.a, 300L, new x6(3, new sgc(this, 1)));
                                            break;
                                        }
                                    }
                                } else {
                                    ej7 ej7Var = ugcVar instanceof ej7 ? (ej7) ugcVar : null;
                                    if (ej7Var != null) {
                                        f8j.d(ej7Var.a, 300L, new ye6(4, new sgc(this, 0)));
                                        break;
                                    }
                                }
                            } else {
                                iu4 iu4Var = ugcVar instanceof iu4 ? (iu4) ugcVar : null;
                                if (iu4Var != null) {
                                    rgc rgcVar = new rgc(this, 3);
                                    gu4 gu4Var = (gu4) iu4Var.a;
                                    d92 d92Var = new d92(18, rgcVar);
                                    w3b w3bVar = gu4Var.s0;
                                    li1 li1Var = new li1(d92Var, 1, gu4Var);
                                    w3bVar.addTextChangedListener(li1Var);
                                    eu4 eu4Var = new eu4(gu4Var, li1Var);
                                    c9a c9aVar = iu4Var.E0;
                                    eu4 eu4Var2 = (eu4) c9aVar.f("after_text_changed_releasable_id");
                                    if (eu4Var2 != null) {
                                        eu4Var2.a();
                                    }
                                    c9aVar.i("after_text_changed_releasable_id", eu4Var);
                                    break;
                                }
                            }
                        } else {
                            os2 os2Var = ugcVar instanceof os2 ? (os2) ugcVar : null;
                            if (os2Var != null) {
                                os2Var.E0.f(new ia(new rgc(this, 2), 5, os2Var));
                                break;
                            }
                        }
                    } else {
                        b18 b18Var = ugcVar instanceof b18 ? (b18) ugcVar : null;
                        if (b18Var != null) {
                            b18Var.E0.addTextChangedListener(new li1(new rgc(this, 1), 5, b18Var));
                            break;
                        }
                    }
                } else {
                    y06 y06Var = ugcVar instanceof y06 ? (y06) ugcVar : null;
                    if (y06Var != null) {
                        y06Var.E0.addTextChangedListener(new li1(new rgc(this, 0), 2, y06Var));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public int l(int i) {
        switch (this.o) {
            case 1:
                return ((t98) C(i)).getK0();
            case 2:
                return ndb.n;
            case 3:
                return ((bq5) ((t98) C(i))).getK0();
            case 4:
                return 1;
            case 5:
                return ((qfc) ((t98) C(i))).getK0();
            case 6:
                return ((qfc) ((t98) C(i))).getK0();
            case 7:
                return fdd.b;
            case 8:
                return ((t98) C(i)).getK0();
            default:
                return super.l(i);
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public void r(mid midVar, int i) {
        switch (this.o) {
            case 0:
                r((d2f) midVar, i);
                break;
            case 1:
            default:
                super.r(midVar, i);
                break;
            case 2:
                l94 l94Var = (l94) midVar;
                k94 k94Var = (k94) ((t98) C(i));
                d92 d92Var = new d92(17, this);
                l94Var.z(k94Var);
                ((LinearLayout) l94Var.a).setOnClickListener(new ub(d92Var, 26, k94Var));
                break;
            case 3:
                r((d2f) midVar, i);
                break;
            case 4:
                J((mc9) midVar, i);
                break;
            case 5:
                K((ugc) midVar, i);
                break;
            case 6:
                K((ugc) midVar, i);
                break;
        }
    }

    @Override // defpackage.phd
    public void s(mid midVar, int i, List list) {
        switch (this.o) {
            case 3:
                d2f d2fVar = (d2f) midVar;
                if (list.isEmpty()) {
                    r(d2fVar, i);
                    break;
                } else {
                    aq5 aq5Var = new aq5(9);
                    for (Object obj : list) {
                        i3 i3Var = obj instanceof aq5 ? (aq5) obj : null;
                        if (i3Var != null) {
                            aq5Var.c0(i3Var);
                        }
                    }
                    d2fVar.A((t98) this.d.f.get(i), aq5Var);
                    break;
                }
            case 4:
            case 7:
            default:
                super.s(midVar, i, list);
                break;
            case 5:
                ugc ugcVar = (ugc) midVar;
                if (list.isEmpty()) {
                    K(ugcVar, i);
                }
                for (Object obj2 : list) {
                    if ((obj2 instanceof igc) && (((igc) obj2) instanceof hgc)) {
                        xwe xweVar = ugcVar instanceof xwe ? (xwe) ugcVar : null;
                        if (xweVar != null) {
                            xweVar.F(((hgc) obj2).a);
                        }
                    }
                }
                break;
            case 6:
                ugc ugcVar2 = (ugc) midVar;
                if (list.isEmpty()) {
                    K(ugcVar2, i);
                }
                for (Object obj3 : list) {
                    if (obj3 instanceof igc) {
                        igc igcVar = (igc) obj3;
                        if (igcVar instanceof fgc) {
                            y06 y06Var = ugcVar2 instanceof y06 ? (y06) ugcVar2 : null;
                            if (y06Var != null) {
                                y06Var.F(((fgc) obj3).a);
                            }
                        } else if (igcVar instanceof ggc) {
                            b18 b18Var = ugcVar2 instanceof b18 ? (b18) ugcVar2 : null;
                            if (b18Var != null) {
                                b18Var.F(((ggc) obj3).a);
                            }
                        } else if (igcVar instanceof egc) {
                            os2 os2Var = ugcVar2 instanceof os2 ? (os2) ugcVar2 : null;
                            if (os2Var != null) {
                                os2Var.F(((egc) obj3).a);
                            }
                        }
                    }
                }
                break;
            case 8:
                d2f d2fVar2 = (d2f) midVar;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() instanceof eff) {
                            d2fVar2.A((t98) this.d.f.get(i), ue3.G(list));
                            break;
                        }
                    }
                }
                r(d2fVar2, i);
                break;
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                if (i == hyc.oneme_folder_widget_view_type) {
                    return new en0(viewGroup.getContext(), new eb6(this, 0));
                }
                if (i == hyc.oneme_big_folder_widget_view_type) {
                    return new en0(viewGroup.getContext(), new eb6(this, 1), (byte) 0);
                }
                throw new IllegalStateException(("Not supported viewType " + i + " for " + fb6.class.getName()).toString());
            case 1:
                kce kceVar = (kce) this.X;
                if (i == vxc.about_app_simple_cell_view_type) {
                    return new kh1(viewGroup.getContext(), kceVar, 1);
                }
                if (i == vxc.send_report_view_type) {
                    return new kh1(viewGroup.getContext(), kceVar, 2);
                }
                throw new IllegalArgumentException("Not supported viewType for AboutAppAdapter");
            case 2:
                return new l94(viewGroup);
            case 3:
                if (i == i1b.u) {
                    return new zp5(new uc2(viewGroup.getContext()));
                }
                if (i == i1b.v) {
                    return new dq5(new v0b(viewGroup.getContext(), false));
                }
                throw new IllegalArgumentException(wy1.e(i, "Unknown viewType '", "'"));
            case 4:
                return new mc9(new v0b(viewGroup.getContext(), true));
            case 5:
                int i2 = 536870911 & i;
                if (i2 == 8192) {
                    return new rbe(viewGroup.getContext());
                }
                if (i2 == 8) {
                    roe roeVar = new roe(viewGroup.getContext(), 0);
                    d2c d2cVar = new d2c(roeVar, 2);
                    roeVar.setModelItem(new toe(8, 0, new n5g(u8b.y0), null, new n5g(u8b.v0), null, null, null, null, 360));
                    return d2cVar;
                }
                if (i2 == 16) {
                    return new xwe(viewGroup.getContext());
                }
                if (i2 == 2048) {
                    return new d2c(viewGroup.getContext());
                }
                if (i2 != 65536) {
                    if (i2 == 1024) {
                        return new y6(viewGroup.getContext());
                    }
                    throw new IllegalStateException(("unknown item viewType: " + i).toString());
                }
                TextView textView = new TextView(viewGroup.getContext());
                d2c d2cVar2 = new d2c(textView, 0);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                textView.setGravity(17);
                float f = 12;
                float f2 = 28;
                textView.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                dpg.j.b(textView, t75.b);
                return d2cVar2;
            case 6:
                int i3 = 536870911 & i;
                if (i3 == 1) {
                    return new y06(viewGroup.getContext());
                }
                if (i3 == 2) {
                    return new b18(viewGroup.getContext());
                }
                if (i3 == 131072) {
                    return new os2(viewGroup.getContext());
                }
                if (i3 == 4) {
                    return new iu4(viewGroup.getContext());
                }
                if (i3 == 64) {
                    return new ej7(viewGroup.getContext());
                }
                if (i3 == 128) {
                    return new lt4(viewGroup.getContext());
                }
                if (i3 == 256) {
                    return new x32(viewGroup.getContext());
                }
                if (i3 != 512) {
                    if (i3 == 1024) {
                        return new y6(viewGroup.getContext());
                    }
                    if (i3 == 2048) {
                        return new d2c(viewGroup.getContext());
                    }
                    throw new IllegalStateException(("unknown item viewType: " + i).toString());
                }
                OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), null);
                vi8 vi8Var = new vi8(oneMeButton);
                oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                oneMeButton.setSize(jza.c);
                oneMeButton.setMode(iza.b);
                oneMeButton.setAppearance(gza.c);
                oneMeButton.setText(u8b.q0);
                return vi8Var;
            case 7:
                return new v01(new gdd(new sxa(0, (t23) this.X, t23.class, "onClearClick", "onClearClick()V", 0, 2), viewGroup.getContext()), 15);
            case 8:
                return ulc.m((ulc) this.X, viewGroup.getContext(), i);
            default:
                return new d44(((ThreadsStateViewerScreen) this.X).getContext());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb6(Executor executor) {
        super(executor);
        this.o = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb6(ExecutorService executorService, Object obj, int i) {
        super(executorService);
        this.o = i;
        this.X = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb6(Executor executor, cff cffVar) {
        super(executor);
        this.o = 8;
        this.X = new ulc(6, cffVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb6(ThreadsStateViewerScreen threadsStateViewerScreen, ExecutorService executorService) {
        super(executorService);
        this.o = 9;
        this.X = threadsStateViewerScreen;
    }
}
