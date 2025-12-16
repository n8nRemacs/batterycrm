package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.deeplink.LinkInterceptorWidget;

/* loaded from: classes.dex */
public final class x78 extends dtf implements sm6 {
    public final /* synthetic */ LinkInterceptorWidget X;
    public final /* synthetic */ Uri Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x78(LinkInterceptorWidget linkInterceptorWidget, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.X = linkInterceptorWidget;
        this.Y = uri;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        x78 x78Var = (x78) l((w68) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        x78Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        x78 x78Var = new x78(this.X, this.Y, continuation);
        x78Var.o = obj;
        return x78Var;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        String queryParameter;
        Object ipdVar;
        boolean zBooleanValue;
        rcb rcbVar = rcb.a;
        g8j.b(obj);
        w68 w68Var = (w68) this.o;
        LinkInterceptorWidget linkInterceptorWidget = this.X;
        int i = LinkInterceptorWidget.d;
        ln lnVarRequireActivity = linkInterceptorWidget.requireActivity();
        boolean z = lnVarRequireActivity instanceof ksd;
        boolean z2 = !z;
        String strN = w68Var.n();
        ia iaVar = new ia(strN, 18, lnVarRequireActivity);
        String name = LinkInterceptorWidget.class.getName();
        Uri uri = this.Y;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "Common intercept " + vmf.Z(20, String.valueOf(uri)) + "... with result - " + w68Var + ". Has external callback - " + (w68Var.n() != null), null);
            }
        }
        if (w68Var.equals(n68.a)) {
            ccb ccbVar = new ccb(this.X);
            ccbVar.b = new cdb(tcb.a, "Ждите", "ждите", new kcb(2, 0, 0, 6));
            ccbVar.i();
        } else if (w68Var instanceof e68) {
            this.X.y0(z2, lnVarRequireActivity, l7b.U0, ivd.p1);
        } else if (w68Var instanceof d68) {
            this.X.y0(z2, lnVarRequireActivity, l7b.W0, ivd.i1);
        } else if ((w68Var instanceof b68) || (w68Var instanceof c68)) {
            this.X.y0(z2, lnVarRequireActivity, mvd.j0, yud.b1);
        } else if (w68Var instanceof h68) {
            if (z) {
                ul8.c.getClass();
                ul8.M0(null, false);
            } else {
                int i2 = MainActivity.a1;
                b6a.W(lnVarRequireActivity, null, null, null, 14);
                lnVarRequireActivity.finish();
            }
        } else if (w68Var instanceof i68) {
            String str = ap7.a;
            Context context = this.X.getContext();
            String string = ((i68) w68Var).a.toString();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(string));
            intent.setFlags(268435456);
            if (context.getPackageManager().resolveActivity(intent, 131072) == null) {
                zBooleanValue = false;
            } else {
                try {
                    context.startActivity(intent);
                    ipdVar = Boolean.TRUE;
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                Object obj2 = Boolean.FALSE;
                if (ipdVar instanceof ipd) {
                    ipdVar = obj2;
                }
                zBooleanValue = ((Boolean) ipdVar).booleanValue();
            }
            if (!zBooleanValue) {
                this.X.y0(z2, lnVarRequireActivity, mvd.j0, yud.b1);
            }
        } else if (w68Var instanceof z58) {
            if (z) {
                this.X.getRouter().C();
                z58 z58Var = (z58) w68Var;
                bv7.c.p0().c(bv7.L0(z58Var.a, z58Var.b, z58Var.d, z58Var.c), null);
            } else {
                int i3 = MainActivity.a1;
                bv7 bv7Var = bv7.c;
                z58 z58Var2 = (z58) w68Var;
                long j = z58Var2.a;
                String str2 = z58Var2.b;
                boolean z3 = z58Var2.c;
                String str3 = z58Var2.d;
                bv7Var.getClass();
                b6a.W(lnVarRequireActivity, bv7.L0(j, str2, str3, z3), null, null, 12);
                lnVarRequireActivity.finish();
            }
        } else if (w68Var instanceof o68) {
            if (z) {
                a63 a63Var = a63.c;
                o68 o68Var = (o68) w68Var;
                long j2 = o68Var.a;
                Long l = new Long(o68Var.b);
                a63.N0(a63Var, j2, "local", null, (l.longValue() > 0L ? 1 : (l.longValue() == 0L ? 0 : -1)) > 0 ? l : null, null, null, 116);
            } else {
                int i4 = MainActivity.a1;
                a63 a63Var2 = a63.c;
                o68 o68Var2 = (o68) w68Var;
                long j3 = o68Var2.a;
                Long l2 = new Long(o68Var2.b);
                b6a.W(lnVarRequireActivity, a63.L0(a63Var2, j3, "local", null, (l2.longValue() > 0L ? 1 : (l2.longValue() == 0L ? 0 : -1)) > 0 ? l2 : null, null, null, 244), null, iaVar, 4);
                lnVarRequireActivity.finish();
            }
        } else if (w68Var instanceof p68) {
            if (z) {
                kkc.c.Q0(((p68) w68Var).a);
            } else {
                int i5 = MainActivity.a1;
                kkc kkcVar = kkc.c;
                long j4 = ((p68) w68Var).a;
                kkcVar.getClass();
                hi4 hi4Var = new hi4();
                hi4Var.a = ":profile";
                hi4Var.c(Long.valueOf(j4), "id");
                hi4Var.c("contact", "type");
                b6a.W(lnVarRequireActivity, hi4Var.a(), null, iaVar, 4);
                lnVarRequireActivity.finish();
            }
        } else if (w68Var instanceof q68) {
            if (z) {
                q68 q68Var = (q68) w68Var;
                a63.N0(a63.c, q68Var.a, "local", null, null, null, q68Var.b, 92);
            } else {
                int i6 = MainActivity.a1;
                q68 q68Var2 = (q68) w68Var;
                b6a.W(lnVarRequireActivity, a63.L0(a63.c, q68Var2.a, "local", null, null, null, q68Var2.b, 476), null, iaVar, 4);
                lnVarRequireActivity.finish();
            }
        } else if (w68Var instanceof t68) {
            if (z) {
                a63 a63Var3 = a63.c;
                long j5 = ((t68) w68Var).a;
                ii4 ii4VarP0 = a63Var3.p0();
                hi4 hi4Var2 = new hi4();
                hi4Var2.a = ":stickers/set";
                hi4Var2.c(Long.valueOf(j5), "set_id");
                ii4VarP0.c(hi4Var2.a(), null);
            } else {
                int i7 = MainActivity.a1;
                a63 a63Var4 = a63.c;
                long j6 = ((t68) w68Var).a;
                a63Var4.getClass();
                hi4 hi4Var3 = new hi4();
                hi4Var3.a = ":stickers/set";
                hi4Var3.c(Long.valueOf(j6), "set_id");
                b6a.W(lnVarRequireActivity, hi4Var3.a(), null, null, 12);
                lnVarRequireActivity.finish();
            }
        } else if (w68Var instanceof s68) {
            if (z) {
                ((kj1) this.X.b.getValue()).j(((s68) w68Var).a, true, false, false, new fr7(4, w68Var));
            } else {
                kj1 kj1Var = (kj1) this.X.b.getValue();
                String str4 = ((s68) w68Var).a;
                kj1Var.c();
                if (vmf.F(str4)) {
                    kj1Var.a.a();
                } else if (((hw1) kj1Var.d()).g(new jaf(str4, false, true, false))) {
                    lj1.c.getClass();
                    hi4 hi4Var4 = new hi4();
                    hi4Var4.a = ":call-join-preview";
                    hi4Var4.c(str4, "link");
                    Uri uriA = hi4Var4.a();
                    int i8 = MainActivity.a1;
                    b6a.W(lnVarRequireActivity, uriA, null, null, 12);
                } else {
                    lj1.c.getClass();
                    hi4 hi4Var5 = new hi4();
                    hi4Var5.a = ":call-active";
                    Uri uriA2 = hi4Var5.a();
                    int i9 = MainActivity.a1;
                    b6a.W(lnVarRequireActivity, uriA2, null, null, 12);
                }
                lnVarRequireActivity.finish();
            }
        } else if (w68Var.equals(g68.a)) {
            cdb cdbVar = new cdb(rcbVar, z7.e(this.X.getContext(), u2d.snackbar_self_contact_open), null, new kcb(2, 0, 0, 6));
            if (z) {
                ccb ccbVar2 = new ccb(this.X);
                ccbVar2.b = cdbVar;
                ccbVar2.i();
            } else {
                int i10 = MainActivity.a1;
                b6a.W(lnVarRequireActivity, null, cdbVar, null, 10);
                lnVarRequireActivity.finish();
            }
        } else if (w68Var instanceof f68) {
            if (z) {
                ((ii4) t1b.a.getAccessor().c(116)).c(((f68) w68Var).a, null);
            } else {
                int i11 = MainActivity.a1;
                b6a.W(lnVarRequireActivity, ((f68) w68Var).a, null, iaVar, 4);
                lnVarRequireActivity.finish();
            }
        } else if (w68Var.equals(r68.a)) {
            cdb cdbVar2 = new cdb(rcbVar, z7.e(this.X.getContext(), u2d.snackbar_contact_removed), null, new kcb(2, 0, 0, 6));
            if (z) {
                ccb ccbVar3 = new ccb(this.X);
                ccbVar3.b = cdbVar2;
                ccbVar3.i();
            } else {
                int i12 = MainActivity.a1;
                b6a.W(lnVarRequireActivity, null, cdbVar2, null, 10);
                lnVarRequireActivity.finish();
            }
        } else if (w68Var instanceof j68) {
            if (z) {
                ul8 ul8Var = ul8.c;
                String str5 = ((j68) w68Var).a;
                ul8Var.getClass();
                ul8.M0(str5, false);
            } else {
                int i13 = MainActivity.a1;
                ul8 ul8Var2 = ul8.c;
                String str6 = ((j68) w68Var).a;
                ul8Var2.getClass();
                hi4 hi4Var6 = new hi4();
                hi4Var6.a = ":chat-list";
                hi4Var6.c(Boolean.FALSE, "message_push");
                if (str6 != null) {
                    hi4Var6.c(str6, "folder_id");
                }
                b6a.W(lnVarRequireActivity, hi4Var6.a(), null, null, 12);
                lnVarRequireActivity.finish();
            }
        } else if (w68Var instanceof v68) {
            cdb cdbVar3 = new cdb(rcbVar, z7.e(this.X.getContext(), u2d.snackbar_folder_link_error_title), z7.e(this.X.getContext(), u2d.snackbar_folder_link_error_caption), new kcb(2, 0, 0, 6));
            if (z) {
                ccb ccbVar4 = new ccb(this.X);
                ccbVar4.b = cdbVar3;
                ccbVar4.i();
            } else {
                int i14 = MainActivity.a1;
                b6a.W(lnVarRequireActivity, null, cdbVar3, null, 10);
                lnVarRequireActivity.finish();
            }
        } else if (w68Var instanceof m68) {
            Uri uri2 = this.Y;
            Long lI = (uri2 == null || (queryParameter = uri2.getQueryParameter("webappChatId")) == null) ? null : cnf.i(queryParameter);
            ukh ukhVar = lI != null ? ukh.X : ukh.c;
            if (z) {
                m68 m68Var = (m68) w68Var;
                ul8.c.p0().c(ul8.Q0(m68Var.a, ukhVar, lI, m68Var.b), null);
            } else {
                int i15 = MainActivity.a1;
                ul8 ul8Var3 = ul8.c;
                m68 m68Var2 = (m68) w68Var;
                long j7 = m68Var2.a;
                String str7 = m68Var2.b;
                ul8Var3.getClass();
                b6a.W(lnVarRequireActivity, ul8.Q0(j7, ukhVar, lI, str7), null, null, 12);
                lnVarRequireActivity.finish();
            }
        } else if (w68Var.equals(a68.a)) {
            cdb cdbVar4 = new cdb(new qcb(yud.W), z7.e(this.X.getContext(), u2d.snackbar_content_level_error_title), null, new kcb(2, 0, 0, 6));
            if (z) {
                ccb ccbVar5 = new ccb(this.X);
                ccbVar5.b = cdbVar4;
                ccbVar5.i();
            } else {
                int i16 = MainActivity.a1;
                b6a.W(lnVarRequireActivity, null, cdbVar4, null, 10);
                lnVarRequireActivity.finish();
            }
        } else if (w68Var instanceof k68) {
            if (z) {
                int i17 = MainActivity.a1;
                b6a.W(lnVarRequireActivity, null, null, iaVar, 6);
            } else {
                int i18 = MainActivity.a1;
                b6a.W(lnVarRequireActivity, null, null, iaVar, 6);
                lnVarRequireActivity.finish();
            }
        } else if (!(w68Var instanceof l68)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z && strN != null) {
            ul8 ul8Var4 = ul8.c;
            Intent intent2 = lnVarRequireActivity.getIntent();
            ul8Var4.N0(strN, intent2 != null ? intent2.getExtras() : null);
        }
        return qqg.a;
    }
}
