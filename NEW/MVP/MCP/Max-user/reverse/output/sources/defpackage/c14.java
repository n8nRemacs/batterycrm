package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.chats.search.ChatsListSearchScreen;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class c14 extends l98 {
    public final Object X;
    public final /* synthetic */ int o = 0;

    public c14(b14 b14Var) {
        super(new yf4(5));
        this.X = b14Var;
        A(true);
    }

    @Override // defpackage.phd
    public long k(int i) {
        switch (this.o) {
            case 0:
                return az1.v(((d14) C(i)).a);
            default:
                return super.k(i);
        }
    }

    @Override // defpackage.phd
    public final int l(int i) {
        switch (this.o) {
            case 0:
                int iV = az1.v(((d14) C(i)).a);
                if (iV != 0) {
                    return (iV == 2 || iV == 3) ? 2 : 1;
                }
                return 0;
            case 1:
                return i1b.t;
            default:
                return ((j6e) C(i)).getK0();
        }
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) {
        CharSequence charSequenceL;
        pb2 pb2Var;
        ku3 ku3VarN;
        String string;
        String string2;
        int i2 = 4;
        int i3 = 20;
        int i4 = 3;
        boolean z = false;
        z = false;
        z = false;
        final int i5 = 1;
        int i6 = 2;
        switch (this.o) {
            case 0:
                final d14 d14Var = (d14) C(i);
                if (!(midVar instanceof e14)) {
                    if (!(midVar instanceof x14)) {
                        if (midVar instanceof k14) {
                            final k14 k14Var = (k14) midVar;
                            final boolean z2 = j() > 1;
                            int[] iArr = k14.H0;
                            r1b r1bVar = (r1b) k14Var.a;
                            int iV = az1.v(d14Var.a);
                            if (iV == 1) {
                                r1bVar.setTitle(z7.e(r1bVar.getContext(), wxa.e));
                                r1bVar.setSubtitle(z7.e(r1bVar.getContext(), wxa.d));
                                float f = 24;
                                r1bVar.w(r34.b(r1bVar.getContext(), yud.b).mutate(), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                                jqd.a(r1bVar.Q0, k14.G0, new float[]{0.0f, 1.0f});
                            } else if (iV == 4) {
                                r1bVar.setTitle(z7.e(r1bVar.getContext(), wxa.c));
                                r1bVar.setSubtitle(z7.e(r1bVar.getContext(), wxa.i));
                                float f2 = 24;
                                r1bVar.w(r34.b(r1bVar.getContext(), yud.t1).mutate(), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                                jqd.a(r1bVar.Q0, iArr, new float[]{0.0f, 1.0f});
                            } else if (iV == 6) {
                                r1bVar.setTitle(z7.e(r1bVar.getContext(), wxa.b));
                                r1bVar.setSubtitle(z7.e(r1bVar.getContext(), wxa.a));
                                float f3 = 24;
                                r1bVar.w(r34.b(r1bVar.getContext(), yud.R0).mutate(), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
                                jqd.a(r1bVar.Q0, iArr, new float[]{0.0f, 1.0f});
                            }
                            r1bVar.setCloseButtonVisibility(false);
                            final int i7 = z ? 1 : 0;
                            r1bVar.setBannerClickListener(new View.OnClickListener() { // from class: j14
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i7) {
                                        case 0:
                                            k14 k14Var2 = (k14) k14Var;
                                            b14 b14Var = k14Var2.E0;
                                            int i8 = d14Var.a;
                                            b14Var.A(i8);
                                            k14Var2.F0.a(z5j.g(i8), 1, z2 ? 1 : 2);
                                            break;
                                        default:
                                            x14 x14Var = (x14) k14Var;
                                            b14 b14Var2 = x14Var.E0;
                                            int i9 = d14Var.a;
                                            b14Var2.A(i9);
                                            x14Var.F0.a(z5j.g(i9), 2, z2 ? 1 : 2);
                                            break;
                                    }
                                }
                            });
                            r1bVar.setCloseButtonClickListener(new j6(k14Var, d14Var, 18));
                            break;
                        }
                    } else {
                        final x14 x14Var = (x14) midVar;
                        final boolean z3 = j() > 1;
                        v7b v7bVar = (v7b) x14Var.a;
                        int iV2 = az1.v(d14Var.a);
                        if (iV2 == 2) {
                            v7bVar.setTitle(z7.e(v7bVar.getContext(), wxa.h));
                            v7bVar.setSubtitle(z7.e(v7bVar.getContext(), wxa.g));
                            float f4 = 56;
                            v7bVar.w(r34.b(v7bVar.getContext(), yud.b).mutate(), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density));
                            jqd.a(v7bVar.Q0, x14.G0, new float[]{0.0f, 1.0f});
                        } else if (iV2 == 3) {
                            v7bVar.setTitle(z7.e(v7bVar.getContext(), wxa.f));
                            v7bVar.setSubtitle(z7.e(v7bVar.getContext(), wxa.i));
                            float f5 = 56;
                            v7bVar.w(r34.b(v7bVar.getContext(), yud.t1).mutate(), kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(f5 * vw4.d().getDisplayMetrics().density));
                            jqd.a(v7bVar.Q0, x14.H0, new float[]{0.0f, 1.0f});
                        }
                        v7bVar.setCloseButtonVisibility(false);
                        v7bVar.setBannerClickListener(new View.OnClickListener() { // from class: j14
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i5) {
                                    case 0:
                                        k14 k14Var2 = (k14) x14Var;
                                        b14 b14Var = k14Var2.E0;
                                        int i8 = d14Var.a;
                                        b14Var.A(i8);
                                        k14Var2.F0.a(z5j.g(i8), 1, z3 ? 1 : 2);
                                        break;
                                    default:
                                        x14 x14Var2 = (x14) x14Var;
                                        b14 b14Var2 = x14Var2.E0;
                                        int i9 = d14Var.a;
                                        b14Var2.A(i9);
                                        x14Var2.F0.a(z5j.g(i9), 2, z3 ? 1 : 2);
                                        break;
                                }
                            }
                        });
                        v7bVar.setCloseButtonClickListener(new j6(x14Var, d14Var, i3));
                        break;
                    }
                }
                break;
            case 1:
                ((lcd) ((mcd) midVar).a).setContacts((List) C(i));
                break;
            default:
                j6e j6eVar = (j6e) C(i);
                if (!(j6eVar instanceof cy2)) {
                    if (!(j6eVar instanceof av6)) {
                        if (!(j6eVar instanceof q04)) {
                            if (!(j6eVar instanceof fv6)) {
                                if (j6eVar instanceof fm9) {
                                    fm9 fm9Var = (fm9) j6eVar;
                                    k5e k5eVar = new k5e(this, i4);
                                    uc2 uc2Var = (uc2) ((hm9) midVar).a;
                                    f8j.d(uc2Var, 300L, new kg6(k5eVar, 17, fm9Var));
                                    if (fm9Var.X != null) {
                                        uc2Var.setTitle(fm9Var.s0);
                                        Uri uri = fm9Var.c;
                                        pb2 pb2Var2 = fm9Var.X;
                                        pb2Var2.q0();
                                        uc2Var.b(uri, pb2Var2.w0, Long.valueOf(fm9Var.X.h()));
                                    }
                                    if (uc2Var.a(fm9Var.Z.a.toString())) {
                                        f7c f7cVar = fm9Var.Z;
                                        charSequenceL = uzi.l(f7cVar.a, fm9Var.b, f7cVar.b);
                                    } else {
                                        charSequenceL = fm9Var.Z.a;
                                    }
                                    uc2Var.d(charSequenceL, true);
                                    f7b f7bVar = (f7b) y4e.a.getAccessor().c(HttpStatus.SC_GONE);
                                    long j = fm9Var.o.b;
                                    Context context = f7bVar.a;
                                    pe8 pe8Var = f7bVar.c;
                                    uc2Var.setTime(ml6.a(context, pe8Var.u(), j, pe8Var.j(), true));
                                    pb2 pb2Var3 = fm9Var.X;
                                    if ((pb2Var3 != null && pb2Var3.b0()) || ((pb2Var = fm9Var.X) != null && (ku3VarN = pb2Var.n()) != null && ku3VarN.x())) {
                                        z = true;
                                    }
                                    uc2Var.setVerified(z);
                                    break;
                                }
                            } else {
                                fv6 fv6Var = (fv6) j6eVar;
                                k5e k5eVar2 = new k5e(this, i6);
                                List list = fv6Var.b;
                                f7c f7cVar2 = fv6Var.X;
                                v0b v0bVar = (v0b) ((gv6) midVar).a;
                                f8j.d(v0bVar, 300L, new kg6(k5eVar2, i4, fv6Var));
                                f7c f7cVar3 = fv6Var.o;
                                String string3 = f7cVar3.a.toString();
                                TextView textView = v0bVar.c;
                                v0bVar.setTitle((string3 == null || string3.length() == 0 || textView.getPaint().measureText(string3) <= ((float) textView.getMeasuredWidth())) ? f7cVar3.a : uzi.l(f7cVar3.a, list, f7cVar3.b));
                                v0bVar.setSubtitle(v0bVar.e(f7cVar2.a.toString()) ? uzi.l(f7cVar2.a, list, f7cVar2.b) : f7cVar2.a);
                                long j2 = fv6Var.c;
                                String str = fv6Var.d;
                                Uri uri2 = fv6Var.s0;
                                if (uri2 == null || (string = uri2.toString()) == null) {
                                    string = Uri.EMPTY.toString();
                                }
                                v0bVar.g(j2, str, string);
                                v0bVar.setVerified(fv6Var.Z);
                                break;
                            }
                        } else {
                            q04 q04Var = (q04) j6eVar;
                            k5e k5eVar3 = new k5e(this, i5);
                            l5e l5eVar = new l5e(this, i5);
                            v0b v0bVar2 = (v0b) ((s04) midVar).a;
                            f8j.d(v0bVar2, 300L, new ub(k5eVar3, i3, q04Var));
                            v0bVar2.setOnLongClickListener(new yi2(l5eVar, q04Var, v0bVar2, i2));
                            long j3 = q04Var.c;
                            CharSequence charSequence = q04Var.t0;
                            Uri uri3 = q04Var.s0;
                            if (uri3 == null || (string2 = uri3.toString()) == null) {
                                string2 = Uri.EMPTY.toString();
                            }
                            v0bVar2.g(j3, charSequence, string2);
                            v0bVar2.setTitle(q04Var.d);
                            v0bVar2.setSubtitle(q04Var.o);
                            v0bVar2.setVerified(q04Var.Y);
                            break;
                        }
                    } else {
                        av6 av6Var = (av6) j6eVar;
                        a7c a7cVar = new a7c(this, i4, (av6) j6eVar);
                        hwd hwdVar = new hwd(2);
                        f7c f7cVar4 = av6Var.Y;
                        List list2 = av6Var.b;
                        uc2 uc2Var2 = (uc2) ((bv6) midVar).a;
                        f8j.d(uc2Var2, 300L, new kg6(a7cVar, i5, av6Var));
                        uc2Var2.setOnLongClickListener(new df1(hwdVar, av6Var, uc2Var2));
                        long j4 = av6Var.c;
                        uc2Var2.setId(Long.hashCode(j4));
                        f7c f7cVar5 = av6Var.X;
                        String string4 = f7cVar5.a.toString();
                        TextView textView2 = uc2Var2.b;
                        uc2Var2.setTitle((string4 == null || string4.length() == 0 || textView2.getPaint().measureText(string4) <= ((float) textView2.getMeasuredWidth())) ? f7cVar5.a : uzi.l(f7cVar5.a, list2, f7cVar5.b));
                        CharSequence charSequenceL2 = f7cVar4.a;
                        if (uc2Var2.a(charSequenceL2.toString())) {
                            charSequenceL2 = uzi.l(charSequenceL2, list2, f7cVar4.b);
                        }
                        uc2Var2.d(charSequenceL2, true);
                        uc2Var2.b(av6Var.o, av6Var.t0, Long.valueOf(j4));
                        uc2Var2.setTime(av6Var.d);
                        uc2Var2.setVerified(av6Var.u0);
                        break;
                    }
                } else {
                    cy2 cy2Var = (cy2) j6eVar;
                    k5e k5eVar4 = new k5e(this, z ? 1 : 0);
                    l5e l5eVar2 = new l5e(this, z ? 1 : 0);
                    uc2 uc2Var3 = (uc2) ((dy2) midVar).a;
                    f8j.d(uc2Var3, 300L, new ub(k5eVar4, 15, cy2Var));
                    uc2Var3.setOnLongClickListener(new yi2(l5eVar2, cy2Var, uc2Var3, i6));
                    int id = uc2Var3.getId();
                    uc2Var3.setId(Long.hashCode(cy2Var.c));
                    f7c f7cVar6 = cy2Var.w0;
                    String string5 = f7cVar6.a.toString();
                    TextView textView3 = uc2Var3.b;
                    uc2Var3.setTitle((string5 == null || string5.length() == 0 || textView3.getPaint().measureText(string5) <= ((float) textView3.getMeasuredWidth())) ? f7cVar6.a : uzi.l(f7cVar6.a, cy2Var.b, f7cVar6.b));
                    uc2Var3.d(cy2Var.x0, true);
                    uc2Var3.b(cy2Var.u0, cy2Var.D0, Long.valueOf(cy2Var.v0));
                    uc2Var3.setPinned(cy2Var.d);
                    uc2Var3.setMuted(cy2Var.o);
                    uc2Var3.setMention(cy2Var.X);
                    uc2Var3.setReaction(cy2Var.Y);
                    uc2Var3.setTime(cy2Var.Z);
                    uc2Var3.j(cy2Var.s0, id == uc2Var3.getId());
                    uc2Var3.setStatus(cy2Var.t0);
                    uc2Var3.setVerified(cy2Var.E0);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.phd
    public void s(mid midVar, int i, List list) {
        switch (this.o) {
            case 2:
                r(midVar, i);
                break;
            default:
                super.s(midVar, i, list);
                break;
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                b14 b14Var = (b14) this.X;
                return i != 0 ? (i == 2 || i == 3) ? new x14(viewGroup.getContext(), b14Var) : new k14(viewGroup.getContext(), b14Var) : new e14(viewGroup.getContext(), b14Var);
            case 1:
                return new mcd(new lcd(viewGroup.getContext(), (h23) this.X));
            default:
                if (i == i1b.l) {
                    return new dy2(new uc2(viewGroup.getContext()));
                }
                if (i == i1b.o) {
                    return new bv6(new uc2(viewGroup.getContext()));
                }
                if (i == i1b.m) {
                    return new s04(new v0b(viewGroup.getContext(), false));
                }
                if (i == i1b.p) {
                    return new gv6(new v0b(viewGroup.getContext(), false));
                }
                if (i == i1b.r) {
                    return new hm9(new uc2(viewGroup.getContext()));
                }
                throw new IllegalArgumentException(ho7.f(i, "Unsupported view type: "));
        }
    }

    public c14(h23 h23Var, ExecutorService executorService) {
        super(new xt4(executorService, 4, new yf4(7)));
        this.X = h23Var;
    }

    public c14(ChatsListSearchScreen chatsListSearchScreen, ExecutorService executorService) {
        super(new xt4(executorService, 4, new yf4(8)));
        this.X = chatsListSearchScreen;
    }
}
