package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class ql2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql2(Continuation continuation, ChatMediaListWidget chatMediaListWidget) {
        super(2, continuation);
        this.X = chatMediaListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        ql2 ql2Var = (ql2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ql2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ql2 ql2Var = new ql2(continuation, this.X);
        ql2Var.o = obj;
        return ql2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof op7) {
            kkc.c.p0().c(((oi4) ((op7) cdaVar).a).a, null);
        } else if (cdaVar instanceof ei4) {
            kkc.c.s0((ei4) cdaVar);
        } else if (cdaVar instanceof em2) {
            kkc kkcVar = kkc.c;
            em2 em2Var = (em2) cdaVar;
            long j = em2Var.b;
            String str = em2Var.d;
            long j2 = em2Var.c;
            boolean z = em2Var.e;
            ii4 ii4VarP0 = kkcVar.p0();
            StringBuilder sbN = ho7.n(":attach/viewer?chat_id=", j, "&attach_id=", str);
            az1.r(j2, "&msg_id=", "&single=", sbN);
            sbN.append(z);
            sbN.append("&desc=true");
            ii4VarP0.b(sbN.toString(), null);
        } else {
            boolean z2 = cdaVar instanceof fm2;
            ChatMediaListWidget chatMediaListWidget = this.X;
            if (z2) {
                yy7[] yy7VarArr = ChatMediaListWidget.t0;
                jo2 jo2VarZ0 = chatMediaListWidget.z0();
                jo2VarZ0.K0.O(jo2VarZ0, jo2.W0[3], svi.d(jo2VarZ0.a, ((q2b) jo2VarZ0.A()).b(), i84.b, new tn2(jo2VarZ0, ((fm2) cdaVar).b, null)));
            } else if (cdaVar instanceof gm2) {
                kkc kkcVar2 = kkc.c;
                gm2 gm2Var = (gm2) cdaVar;
                long j3 = gm2Var.b;
                long j4 = gm2Var.c;
                ii4 ii4VarP02 = kkcVar2.p0();
                StringBuilder sbL = az1.l(j3, ":chats?id=", "&type=local&message_id=");
                sbL.append(j4);
                ii4VarP02.b(sbL.toString(), null);
            } else if (cdaVar instanceof jm2) {
                Context context = chatMediaListWidget.getContext();
                String str2 = ((jm2) cdaVar).b;
                try {
                    gge ggeVar = new gge(context);
                    Intent intent = (Intent) ggeVar.d;
                    intent.setType(HTTP.PLAIN_TEXT_TYPE);
                    intent.putExtra("android.intent.extra.TEXT", (CharSequence) str2);
                    ggeVar.k();
                } catch (Exception e) {
                    wqi.e("tmi", "shareText error", e);
                }
            } else if (cdaVar instanceof bm2) {
                xb3.a(chatMediaListWidget.getContext(), ((bm2) cdaVar).b);
            } else if (cdaVar instanceof im2) {
                kkc kkcVar3 = kkc.c;
                im2 im2Var = (im2) cdaVar;
                Long l = im2Var.b;
                List listSingletonList = Collections.singletonList(new Long(im2Var.c));
                boolean z3 = im2Var.d;
                kkcVar3.p0().b(":chats/forward?messages_ids=" + ue3.N(listSingletonList, ",", null, null, null, 62) + "&attach_id=" + l + "&is_forward_attach=" + z3, null);
            } else if (cdaVar instanceof dm2) {
                try {
                    chatMediaListWidget.getContext().startActivity(((dm2) cdaVar).b);
                } catch (Exception unused) {
                    dm2 dm2Var = (dm2) cdaVar;
                    dm2Var.b.setDataAndType(dm2Var.c, "*/*");
                    chatMediaListWidget.getContext().startActivity(dm2Var.b);
                }
            } else if (cdaVar instanceof km2) {
                yy7[] yy7VarArr2 = BottomSheetWidget.B0;
                km2 km2Var = (km2) cdaVar;
                s5g s5gVar = km2Var.c;
                yb9 yb9Var = km2Var.b;
                oq3 oq3VarA = j5j.a(s5gVar, gwi.b(new imb("selected_message_id", new Long(yb9Var.j())), new imb("selected_attach_id", new Long(yb9Var.i()))), null, 4);
                oq3VarA.f(km2Var.d);
                Iterator it = km2Var.e.iterator();
                while (it.hasNext()) {
                    oq3VarA.a((pq3) it.next());
                }
                ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
                confirmationBottomSheetE.setTargetController(chatMediaListWidget);
                c54 parentController = chatMediaListWidget;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                confirmationBottomSheetE.N0(chatMediaListWidget);
                if (ytdVarE0 != null) {
                    bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                    az1.u(false, budVar, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar);
                }
            } else if (cdaVar instanceof lm2) {
                kkc kkcVar4 = kkc.c;
                lm2 lm2Var = (lm2) cdaVar;
                long j5 = lm2Var.b;
                long j6 = lm2Var.c;
                String str3 = lm2Var.d;
                long j7 = lm2Var.e;
                String str4 = lm2Var.h;
                String str5 = lm2Var.f;
                long j8 = lm2Var.g;
                kkcVar4.getClass();
                Uri uri = Uri.parse(str4);
                ii4 ii4VarP03 = kkcVar4.p0();
                Bundle bundleB = gwi.b(new imb("file_url", uri));
                hi4 hi4Var = new hi4();
                hi4Var.a = ":dialogs/file-download-warning";
                hi4Var.c(Long.valueOf(j5), "chat_id");
                hi4Var.c(Long.valueOf(j6), "message_id");
                if (str3 != null) {
                    hi4Var.c(str3, "attach_id");
                }
                hi4Var.c(Long.valueOf(j7), "file_id");
                hi4Var.c(str5, "file_name");
                hi4Var.c(Long.valueOf(j8), "file_size");
                ii4VarP03.c(hi4Var.a(), bundleB);
            } else if (cdaVar instanceof nm2) {
                ccb ccbVar = new ccb(chatMediaListWidget);
                nm2 nm2Var = (nm2) cdaVar;
                Integer num = nm2Var.c;
                if (num != null) {
                    ccbVar.e(new qcb(num.intValue()));
                }
                ccbVar.g(nm2Var.b);
                ccbVar.a(nm2Var.d);
                ccbVar.i();
            } else if (cdaVar instanceof cm2) {
                e6j.c(chatMediaListWidget.getContext(), ((cm2) cdaVar).b);
            } else if (cdaVar instanceof mm2) {
                kkc.c.p0().b(":call-join-preview?link=".concat(((mm2) cdaVar).b), null);
            } else if (fni.a(cdaVar, hm2.b)) {
                yy7[] yy7VarArr3 = ChatMediaListWidget.t0;
                ((qsb) chatMediaListWidget.Z.getValue()).l(new s2i(chatMediaListWidget, 1));
            }
        }
        return qqg.a;
    }
}
