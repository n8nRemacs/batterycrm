package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class b0i extends y0f {
    public final Object X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0i(Object obj, ExecutorService executorService, int i) {
        super(executorService);
        this.o = i;
        this.X = obj;
    }

    @Override // defpackage.y0f
    /* renamed from: H */
    public void r(d2f d2fVar, int i) {
        switch (this.o) {
            case 0:
                if (!(d2fVar instanceof zzh)) {
                    if (d2fVar instanceof a0i) {
                        a0i a0iVar = (a0i) d2fVar;
                        t98 t98Var = (t98) C(i);
                        ts9 ts9Var = new ts9(1, (yzh) this.X, yzh.class, "onItemClick", "onItemClick(Lone/me/webapp/model/WebAppsSectionItem;)V", 0, 21);
                        a0iVar.z(t98Var);
                        f8j.d(a0iVar.a, 300L, new wfe(a0iVar, 22, ts9Var));
                        break;
                    }
                } else {
                    zzh zzhVar = (zzh) d2fVar;
                    t98 t98Var2 = (t98) C(i);
                    yzh yzhVar = (yzh) this.X;
                    zzhVar.z(t98Var2);
                    View view = zzhVar.a;
                    f8j.d(view, 300L, new wfe(zzhVar, 21, yzhVar));
                    ((roe) view).setOnSwitchCheckedListener(new ox3(zzhVar, 3, yzhVar));
                    break;
                }
                break;
            case 1:
                vb vbVar = (vb) d2fVar;
                da daVar = (da) ((t98) C(i));
                k kVar = new k(6, this);
                vbVar.z(daVar);
                ((v0b) vbVar.a).setOnClickListener(new ub(kVar, 0, daVar));
                break;
            case 2:
                K((jy3) d2fVar, i);
                break;
            case 3:
                L((d94) d2fVar, i);
                break;
            case 4:
            default:
                super.r(d2fVar, i);
                break;
            case 5:
                M((va6) d2fVar, i);
                break;
            case 6:
                N((l77) d2fVar, i);
                break;
            case 7:
                O((gc9) d2fVar, i);
                break;
            case 8:
                t98 t98Var3 = (t98) this.d.f.get(i);
                if (t98Var3.getK0() != 2 || !(t98Var3 instanceof aga)) {
                    if (t98Var3.getK0() == 1 && (t98Var3 instanceof zea)) {
                        gfa gfaVar = (gfa) d2fVar;
                        zea zeaVar = (zea) t98Var3;
                        ts9 ts9Var2 = new ts9(1, (hfa) this.X, hfa.class, "selectAvatar", "selectAvatar(Lone/me/login/common/avatars/NeuroAvatarModel;)V", 0, 3);
                        gfaVar.z(zeaVar);
                        f8j.d((OneMeDraweeView) gfaVar.a, 300L, new kg6(ts9Var2, 20, zeaVar));
                        break;
                    }
                } else {
                    ((fwe) ((bga) d2fVar).a).b.c();
                    break;
                }
                break;
            case 9:
                P((ugc) d2fVar, i);
                break;
            case 10:
                Q((kcd) d2fVar, i);
                break;
            case 11:
                if (!(d2fVar instanceof dne)) {
                    d2fVar.z((t98) C(i));
                    break;
                } else {
                    dne dneVar = (dne) d2fVar;
                    t98 t98Var4 = (t98) C(i);
                    s6b s6bVar = (s6b) this.X;
                    if (t98Var4 instanceof eq0) {
                        dneVar.z(t98Var4);
                        v0b v0bVar = (v0b) dneVar.a;
                        eq0 eq0Var = (eq0) t98Var4;
                        v0bVar.i(Integer.valueOf(jbb.a), (4 & 2) != 0 ? iza.b : iza.d, gza.c, new l3b(s6bVar, 26, eq0Var));
                        f8j.d(v0bVar, 300L, new wfe(s6bVar, 1, eq0Var));
                        break;
                    }
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                R((k7g) d2fVar, i);
                break;
        }
    }

    public zea J(int i) {
        t98 t98Var = (t98) C(i);
        if (t98Var instanceof zea) {
            return (zea) t98Var;
        }
        return null;
    }

    public void K(jy3 jy3Var, int i) {
        xx3 xx3Var = (xx3) ((t98) C(i));
        d92 d92Var = new d92(12, this);
        ox3 ox3Var = new ox3(xx3Var, 0, this);
        ia iaVar = new ia(xx3Var, 10, this);
        qk qkVar = new qk(7, this);
        View view = jy3Var.a;
        jy3Var.z(xx3Var);
        f8j.d(view, 300L, new ub(iaVar, 19, xx3Var));
        v0b v0bVar = (v0b) view;
        v0bVar.setOnLongClickListener(new d72(ox3Var, 2, xx3Var));
        if (!xx3Var.x0 || xx3Var.u0) {
            CharSequence charSequence = xx3Var.X;
            if (charSequence != null) {
                v0bVar.h(charSequence, new qn2(d92Var, 6, xx3Var));
            } else {
                v0bVar.f();
            }
        } else {
            v0bVar.setCallButtons(new ia(qkVar, 11, xx3Var));
        }
        Boolean bool = xx3Var.w0;
        v0b v0bVar2 = (v0b) view;
        v0bVar2.setSelectionEnabled(bool != null);
        v0bVar2.setItemSelected(bool != null ? bool.booleanValue() : false);
    }

    public void L(d94 d94Var, int i) {
        x2b x2bVar = (x2b) ((t98) C(i));
        u4e u4eVar = (u4e) this.X;
        View view = d94Var.a;
        ((b94) view).setCountryInfo(x2bVar);
        f8j.d(view, 300L, new ub(u4eVar, 25, x2bVar));
    }

    public void M(va6 va6Var, int i) {
        View view = va6Var.a;
        fxg fxgVar = (fxg) ((t98) C(i));
        jx0 jx0Var = (jx0) this.X;
        exg exgVar = fxgVar.b;
        exg exgVar2 = exg.a;
        if (exgVar == exgVar2) {
            ((TextView) view).setOnClickListener(null);
        } else {
            f8j.d(view, 300L, new ta6(jx0Var, fxgVar, 0));
        }
        if (fxgVar.b == exgVar2) {
            ((TextView) view).setEnabled(false);
        }
        ((TextView) view).setText(fxgVar.c.a(va6Var));
    }

    public void N(l77 l77Var, int i) {
        x67 x67Var = (x67) this.d.f.get(i);
        jx0 jx0Var = new jx0(1, (mfe) this.X, mfe.class, "onSelected", "onSelected(Ljava/lang/String;)V", 0, 20);
        View view = l77Var.a;
        k77 k77Var = (k77) view;
        k77Var.F0.setText(x67Var.a);
        k77Var.setSelected(x67Var.b.booleanValue());
        f8j.d((k77) view, 300L, new kg6(jx0Var, 4, x67Var));
    }

    public void O(gc9 gc9Var, int i) {
        fc9 fc9Var = (fc9) ((t98) C(i));
        jx0 jx0Var = new jx0(1, (MembersListWidget) this.X, hc9.class, "onMemberListActionClick", "onMemberListActionClick(I)V", 0, 27);
        gc9Var.z(fc9Var);
        f8j.d(gc9Var.a, 300L, new kg6(jx0Var, 14, fc9Var));
    }

    public void P(ugc ugcVar, int i) {
        mid midVar;
        qfc qfcVar = (qfc) ((t98) C(i));
        ugcVar.z(qfcVar);
        if (qfcVar instanceof kx3) {
            midVar = ugcVar instanceof m04 ? (m04) ugcVar : null;
            if (midVar != null) {
                f8j.d(midVar.a, 300L, new pcc(1, this));
                return;
            }
            return;
        }
        if (qfcVar instanceof a7) {
            midVar = ugcVar instanceof y6 ? (y6) ugcVar : null;
            if (midVar != null) {
                View view = midVar.a;
                ((roe) view).setOnSwitchListener(new xt4(new ir9(2, (ProfileEditAdminPermissionsWidget) this.X, dec.class, "onChecked", "onChecked(JZ)V", 0, 11), new ts9(1, (ProfileEditAdminPermissionsWidget) this.X, dec.class, "onDisabledClick", "onDisabledClick(J)V", 0, 9)));
                f8j.d(view, 300L, new x6(0, new l3b(this, 9, qfcVar)));
                return;
            }
            return;
        }
        if (qfcVar instanceof mt4) {
            midVar = ugcVar instanceof lt4 ? (lt4) ugcVar : null;
            if (midVar != null) {
                f8j.d(midVar.a, 300L, new x6(3, new ffb(17, this)));
            }
        }
    }

    public void Q(kcd kcdVar, int i) {
        icd icdVar = (icd) ((t98) C(i));
        ts9 ts9Var = new ts9(1, (h23) this.X, h23.class, "onRecentContactClick", "onRecentContactClick(Lone/me/chats/search/models/RecentContactModel;)V", 0, 11);
        kcdVar.z(icdVar);
        f8j.d(kcdVar.a, 300L, new kg6(ts9Var, 28, icdVar));
    }

    public void R(k7g k7gVar, int i) {
        f7g f7gVar = (f7g) this.d.f.get(i);
        ts9 ts9Var = new ts9(1, (nr) this.X, nr.class, "onThemeSelected", "onThemeSelected(Lone/me/appearancesettings/multitheme/model/ThemeItem;)V", 0, 18);
        View view = k7gVar.a;
        h7g h7gVar = (h7g) view;
        h7gVar.setThemeName(f7gVar.b);
        Drawable drawable = f7gVar.d;
        if (drawable != null) {
            h7gVar.setBackgroundPattern(drawable);
        }
        h7gVar.setSelected(f7gVar.a);
        f8j.d((h7g) view, 300L, new wfe(ts9Var, 16, f7gVar));
    }

    @Override // defpackage.l98, defpackage.phd
    public int j() {
        switch (this.o) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return this.d.f.size();
            default:
                return super.j();
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public int l(int i) {
        switch (this.o) {
            case 4:
                return ((t98) C(i)).getK0();
            case 5:
                return rc6.$EnumSwitchMapping$0[((fxg) ((t98) C(i))).b.ordinal()] == 1 ? d5b.h : d5b.p;
            case 6:
            case 7:
            default:
                return super.l(i);
            case 8:
                return ((t98) this.d.f.get(i)).getK0();
            case 9:
                return ((qfc) ((t98) C(i))).getK0();
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public void r(mid midVar, int i) {
        switch (this.o) {
            case 0:
                r((d2f) midVar, i);
                break;
            case 1:
                vb vbVar = (vb) midVar;
                da daVar = (da) ((t98) C(i));
                k kVar = new k(6, this);
                vbVar.z(daVar);
                ((v0b) vbVar.a).setOnClickListener(new ub(kVar, 0, daVar));
                break;
            case 2:
                K((jy3) midVar, i);
                break;
            case 3:
                L((d94) midVar, i);
                break;
            case 4:
            default:
                super.r(midVar, i);
                break;
            case 5:
                M((va6) midVar, i);
                break;
            case 6:
                N((l77) midVar, i);
                break;
            case 7:
                O((gc9) midVar, i);
                break;
            case 8:
                r((d2f) midVar, i);
                break;
            case 9:
                P((ugc) midVar, i);
                break;
            case 10:
                Q((kcd) midVar, i);
                break;
            case 11:
                r((d2f) midVar, i);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                R((k7g) midVar, i);
                break;
        }
    }

    @Override // defpackage.phd
    public void s(mid midVar, int i, List list) {
        switch (this.o) {
            case 2:
                jy3 jy3Var = (jy3) midVar;
                Object objQ = ue3.Q(list);
                if (objQ != null) {
                    if (objQ instanceof wx3) {
                        Boolean bool = ((wx3) objQ).a;
                        v0b v0bVar = (v0b) jy3Var.a;
                        v0bVar.setSelectionEnabled(bool != null);
                        v0bVar.setItemSelected(bool != null ? bool.booleanValue() : false);
                        break;
                    }
                } else {
                    K(jy3Var, i);
                    break;
                }
                break;
            case 6:
                l77 l77Var = (l77) midVar;
                Object objQ2 = ue3.Q(list);
                if (objQ2 != null) {
                    if (objQ2 instanceof w67) {
                        ((k77) l77Var.a).setSelected(((w67) objQ2).a.booleanValue());
                        break;
                    }
                } else {
                    N(l77Var, i);
                    break;
                }
                break;
            case 10:
                kcd kcdVar = (kcd) midVar;
                View view = kcdVar.a;
                if (list.isEmpty()) {
                    Q(kcdVar, i);
                    break;
                } else {
                    for (Object obj : list) {
                        if (obj instanceof ecd) {
                            ((jcd) view).setAvatar(((ecd) obj).a);
                        } else if (obj instanceof dcd) {
                            ((jcd) view).setAbbreviation(fui.a(((dcd) obj).a, Long.valueOf(kcdVar.o)));
                        } else if (obj instanceof fcd) {
                            ((jcd) view).setName(((fcd) obj).a);
                        } else if (obj instanceof hcd) {
                            ((jcd) view).setVerified(((hcd) obj).a);
                        } else if (obj instanceof gcd) {
                            ((jcd) view).setOnline(((gcd) obj).a);
                        }
                    }
                    break;
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                k7g k7gVar = (k7g) midVar;
                Object objQ3 = ue3.Q(list);
                if (objQ3 != null && (objQ3 instanceof e7g)) {
                    ((h7g) k7gVar.a).setSelected(((e7g) objQ3).a);
                }
                R(k7gVar, i);
                break;
            default:
                super.s(midVar, i, list);
                break;
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        int i2 = 1;
        int i3 = 3;
        Continuation continuation = null;
        int i4 = 0;
        switch (this.o) {
            case 0:
                if (i != hgb.h) {
                    if (i == hgb.k) {
                        return new a0i(new roe(viewGroup.getContext(), 0));
                    }
                    if (i == hgb.j) {
                        return new zzh(new roe(viewGroup.getContext(), 0));
                    }
                    String name = b0i.class.getName();
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.X;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, name, ho7.f(i, "unknown item viewType: "), null);
                        }
                    }
                    return new gng(new View(viewGroup.getContext()), 3);
                }
                Context context = viewGroup.getContext();
                ViewGroup.LayoutParams xhdVar = new xhd(-1, -2);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setLayoutParams(xhdVar);
                linearLayout.setOrientation(1);
                ImageView imageView = new ImageView(context);
                imageView.setBackground(new ShapeDrawable(new OvalShape()));
                float f = 54;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                float f2 = 20;
                layoutParams.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
                layoutParams.bottomMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                layoutParams.gravity = 1;
                imageView.setLayoutParams(layoutParams);
                u45.n(15, vw4.d().getDisplayMetrics().density, imageView);
                imageView.setImageResource(yud.P1);
                tqi.c(new nd0(i3, continuation, 13), imageView);
                linearLayout.addView(imageView);
                int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
                TextView textView = new TextView(context);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.leftMargin = iD;
                layoutParams2.rightMargin = iD;
                layoutParams2.bottomMargin = iD;
                layoutParams2.gravity = 1;
                textView.setLayoutParams(layoutParams2);
                textView.setGravity(17);
                textView.setText(igb.l);
                dpg.f.b(textView, t75.b);
                tqi.c(new ipe(3, null, 14), textView);
                linearLayout.addView(textView);
                TextView textView2 = new TextView(context);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.leftMargin = iD;
                layoutParams3.rightMargin = iD;
                layoutParams3.bottomMargin = kti.d(f2 * vw4.d().getDisplayMetrics().density);
                layoutParams3.gravity = 1;
                textView2.setLayoutParams(layoutParams3);
                textView2.setGravity(17);
                textView2.setText(igb.k);
                dpg.G.b(textView2, t75.b);
                tqi.c(new ipe(3, null, 15), textView2);
                linearLayout.addView(textView2);
                return new gng(linearLayout, 2);
            case 1:
                return new vb(new v0b(viewGroup.getContext(), false));
            case 2:
                return new jy3(new v0b(viewGroup.getContext(), false));
            case 3:
                return new d94(new b94(viewGroup.getContext()));
            case 4:
                return i == w5b.q ? new c62(viewGroup.getContext(), new zfb(23)) : new ja5(viewGroup.getContext(), (x6i) this.X);
            case 5:
                exg exgVar = exg.a;
                exg exgVar2 = i == d5b.h ? exgVar : exg.b;
                Context context2 = viewGroup.getContext();
                TextView textView3 = new TextView(context2);
                textView3.setLayoutParams(new xhd(-1, -2));
                dpg.f.b(textView3, t75.b);
                tqi.c(new ua6(i3, continuation, i4), textView3);
                int iD2 = kti.d(12 * vw4.d().getDisplayMetrics().density);
                if (exgVar2 == exgVar) {
                    textView3.setAlpha(0.35f);
                    textView3.setEnabled(false);
                    EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context2, uwc.ic_check_filled_24);
                    z18.e(enhancedVectorDrawable, "circle_background", ctd.f(a93.s0, context2).k);
                    textView3.setCompoundDrawablePadding(iD2);
                    ArrayList arrayList = b6g.a;
                    textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(enhancedVectorDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                textView3.setGravity(16);
                int iD3 = kti.d(18 * vw4.d().getDisplayMetrics().density);
                textView3.setPadding(iD2, iD3, iD2, iD3);
                jgh.a(textView3);
                return new va6(textView3);
            case 6:
                return new l77(new k77(viewGroup.getContext()));
            case 7:
                return new gc9(new roe(viewGroup.getContext(), 0));
            case 8:
                if (i == 1) {
                    xea xeaVar = new xea(viewGroup.getContext());
                    float f3 = 64;
                    xeaVar.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                    return new gfa(xeaVar);
                }
                if (i != 2) {
                    throw new IllegalStateException(("Such viewType " + i + " is not supported in NeuroAvatarsAdapter").toString());
                }
                fwe fweVar = new fwe(viewGroup.getContext());
                int iD4 = kti.d(64 * vw4.d().getDisplayMetrics().density);
                fweVar.setLayoutParams(new ViewGroup.LayoutParams(iD4, iD4));
                fweVar.setOutlineProvider(new u74(iD4));
                fweVar.setBackgroundColor(a93.s0.y(viewGroup).b().l);
                tqi.c(new s83(iD4, (Continuation) null), fweVar);
                return new bga(fweVar);
            case 9:
                int i5 = 536870911 & i;
                if (i5 == 1024) {
                    return new y6(viewGroup.getContext());
                }
                if (i5 == 2048 || i5 == 4096) {
                    return new d2c(viewGroup.getContext());
                }
                if (i5 == 32768) {
                    v0b v0bVar = new v0b(viewGroup.getContext(), false);
                    m04 m04Var = new m04(v0bVar);
                    tqi.c(new zh3(i3, continuation, i2), v0bVar);
                    return m04Var;
                }
                if (i5 == 128) {
                    return new lt4(viewGroup.getContext());
                }
                throw new IllegalStateException(("unknown item viewType: " + i).toString());
            case 10:
                return new kcd(new jcd(viewGroup.getContext()));
            case 11:
                return new dne(new v0b(viewGroup.getContext(), false));
            default:
                return new k7g(new h7g(viewGroup.getContext()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0i(ExecutorService executorService, Object obj, int i) {
        super(executorService);
        this.o = i;
        this.X = obj;
    }
}
