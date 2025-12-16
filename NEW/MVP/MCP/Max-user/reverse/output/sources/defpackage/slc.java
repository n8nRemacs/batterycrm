package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final class slc extends dtf implements sm6 {
    public final /* synthetic */ ProfileScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slc(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.X = profileScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        slc slcVar = (slc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        slcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        slc slcVar = new slc(continuation, this.X);
        slcVar.o = obj;
        return slcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        Object ipdVar;
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean z = cdaVar instanceof np7;
        qqg qqgVar = qqg.a;
        if (z) {
            kkc.c.p0().c(((oi4) ((np7) cdaVar).a).a, null);
            return qqgVar;
        }
        if (cdaVar instanceof mkc) {
            kkc kkcVar = kkc.c;
            long j = ((mkc) cdaVar).b;
            kkcVar.p0().b(":settings/folder/by-chat?id=" + j, null);
            return qqgVar;
        }
        if (cdaVar instanceof okc) {
            kkc kkcVar2 = kkc.c;
            long j2 = ((okc) cdaVar).b;
            kkcVar2.p0().b(":profile/attaches?id=" + j2, null);
            return qqgVar;
        }
        if (cdaVar instanceof vkc) {
            kkc.c.M0(((vkc) cdaVar).b);
            return qqgVar;
        }
        if (cdaVar instanceof ykc) {
            kkc kkcVar3 = kkc.c;
            long j3 = ((ykc) cdaVar).b;
            ii4 ii4VarP0 = kkcVar3.p0();
            hi4 hi4Var = new hi4();
            hi4Var.a = ":chats";
            hi4Var.c(Long.valueOf(j3), "id");
            hi4Var.c("local", "type");
            hi4Var.c("true", "open_search_field");
            ii4VarP0.c(hi4Var.a(), null);
            return qqgVar;
        }
        if (cdaVar instanceof pkc) {
            pkc pkcVar = (pkc) cdaVar;
            kkc.c.P0(pkcVar.b, pkcVar.c.a);
            return qqgVar;
        }
        boolean z2 = cdaVar instanceof ukc;
        ProfileScreen profileScreen = this.X;
        if (z2) {
            vlc vlcVar = new vlc(profileScreen);
            ukc ukcVar = (ukc) cdaVar;
            pdc pdcVar = ukcVar.c;
            String str = ukcVar.e;
            long j4 = ukcVar.b;
            boolean z3 = ukcVar.d;
            if (pdcVar == pdc.d) {
                vlcVar.invoke(Boolean.valueOf(z3), rx1.a);
                yy7[] yy7VarArr = ProfileScreen.C0;
                profileScreen.z0().l(j4, z3, new oe1(cdaVar, 2));
                return qqgVar;
            }
            rx1 rx1Var = rx1.c;
            if (str != null && str.length() != 0) {
                vlcVar.invoke(Boolean.valueOf(z3), rx1Var);
                yy7[] yy7VarArr2 = ProfileScreen.C0;
                profileScreen.z0().j(str, true, z3, false, new oe1(cdaVar, 3));
                return qqgVar;
            }
            if (ukcVar.c == pdc.c) {
                vlcVar.invoke(Boolean.valueOf(z3), rx1Var);
                yy7[] yy7VarArr3 = ProfileScreen.C0;
                profileScreen.z0().i(j4, z3, new oe1(cdaVar, 4));
                return qqgVar;
            }
        } else {
            if (cdaVar instanceof rkc) {
                rkc rkcVar = (rkc) cdaVar;
                pdc pdcVar2 = rkcVar.c;
                long j5 = rkcVar.b;
                int iOrdinal = pdcVar2.ordinal();
                if (iOrdinal == 0) {
                    kkc.c.p0().b(a9h.d(j5, ":profile/edit?id=", "&type=local_chat"), null);
                    return qqgVar;
                }
                if (iOrdinal == 1) {
                    kkc.c.p0().b(a9h.d(j5, ":profile/edit?id=", "&type=server_chat"), null);
                    return qqgVar;
                }
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                kkc.c.p0().b(a9h.d(j5, ":profile/edit?id=", "&type=contact"), null);
                return qqgVar;
            }
            if (fni.a(cdaVar, xkc.b)) {
                yy7[] yy7VarArr4 = ProfileScreen.C0;
                if (profileScreen.getRouter().a.a.size() == 1) {
                    bud budVar = (bud) ue3.I(profileScreen.getRouter().e());
                    if (fni.a(budVar != null ? budVar.a : null, profileScreen)) {
                        kkc.c.S0();
                        return qqgVar;
                    }
                }
                kkc.c.p0().b(":chat-list", null);
                return qqgVar;
            }
            if (cdaVar instanceof nkc) {
                String str2 = ap7.a;
                String str3 = ((nkc) cdaVar).b;
                Context context = profileScreen.getContext();
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(str3)));
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                    ipdVar = qqgVar;
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                Throwable thA = kpd.a(ipdVar);
                if (thA != null) {
                    wqi.e(ap7.a, "callByPhone: failed", thA);
                }
            } else {
                if (cdaVar instanceof ei4) {
                    kkc.c.s0((ei4) cdaVar);
                    return qqgVar;
                }
                if (cdaVar instanceof lkc) {
                    kkc kkcVar4 = kkc.c;
                    ((lkc) cdaVar).getClass();
                    kkcVar4.L0(0L, true);
                    return qqgVar;
                }
                if (cdaVar instanceof tkc) {
                    kkc.c.O0(((tkc) cdaVar).b);
                    return qqgVar;
                }
                if (cdaVar instanceof qkc) {
                    qkc qkcVar = (qkc) cdaVar;
                    c39.c.L0(qkcVar.b, qkcVar.c);
                    return qqgVar;
                }
                if (cdaVar instanceof wkc) {
                    e6j.c(profileScreen.getContext(), ((wkc) cdaVar).b);
                    return qqgVar;
                }
                if (cdaVar instanceof skc) {
                    kkc.c.p0().b(":external_callback", gwi.b(new imb("params", ((skc) cdaVar).b)));
                    return qqgVar;
                }
                if (cdaVar instanceof zkc) {
                    kkc.c.p0().b(":call-join-preview?link=".concat(((zkc) cdaVar).b), null);
                }
            }
        }
        return qqgVar;
    }
}
