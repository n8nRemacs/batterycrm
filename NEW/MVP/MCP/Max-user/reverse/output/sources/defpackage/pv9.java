package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes2.dex */
public final class pv9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        pv9 pv9Var = (pv9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pv9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pv9 pv9Var = new pv9(continuation, this.X);
        pv9Var.o = obj;
        return pv9Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        MessagesListWidget messagesListWidget = this.X;
        ?? r1 = messagesListWidget.w0;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        if (cdaVar instanceof ei4) {
            qr9.c.s0((ei4) cdaVar);
        } else {
            int i = 1;
            if (cdaVar instanceof lib) {
                kj1 kj1Var = (kj1) r1.getValue();
                lib libVar = (lib) cdaVar;
                kj1Var.l(libVar.b, libVar.c, new li9(cdaVar, i));
            } else if (cdaVar instanceof zhb) {
                kj1 kj1Var2 = (kj1) r1.getValue();
                zhb zhbVar = (zhb) cdaVar;
                kj1Var2.j(zhbVar.d, true, zhbVar.c, false, new li9(cdaVar, 2));
            } else if (cdaVar instanceof mib) {
                Intent intent = new Intent("android.intent.action.INSERT");
                intent.setType("vnd.android.cursor.dir/raw_contact");
                mib mibVar = (mib) cdaVar;
                intent.putExtra(SdkMetricStatEvent.NAME_KEY, mibVar.c);
                intent.putExtra("phone", mibVar.d);
                try {
                    messagesListWidget.getContext().startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    wqi.e(MessagesListWidget.class.getName(), a9h.d(mibVar.b, "error creating a new contact #", " in phonebook"), null);
                }
            } else if (cdaVar instanceof cib) {
                e6j.c(messagesListWidget.getContext(), ((cib) cdaVar).b);
            } else if (cdaVar instanceof dib) {
                jr6 jr6Var = ((dib) cdaVar).b;
                String str = ap7.a;
                Context context = messagesListWidget.getContext();
                double d = jr6Var.d;
                double d2 = jr6Var.e;
                int i2 = (int) jr6Var.f;
                Uri uriJ = ap7.j(context, Uri.parse("yandexmaps://maps.yandex.ru").buildUpon().appendQueryParameter("pt", d2 + "," + d).appendQueryParameter("z", String.valueOf(i2)).appendQueryParameter("l", "map").build());
                Intent intent2 = new Intent("android.intent.action.VIEW", uriJ).setPackage("ru.yandex.yandexmaps");
                if (intent2.resolveActivity(context.getPackageManager()) == null) {
                    intent2 = new Intent("android.intent.action.VIEW", uriJ.buildUpon().scheme("https").authority("yandex.ru").path("maps").build());
                    if (intent2.resolveActivity(context.getPackageManager()) == null) {
                        intent2 = null;
                    }
                }
                if (intent2 == null) {
                    n5g n5gVar = new n5g(mvd.I0);
                    int i3 = yud.J;
                    CharSequence charSequenceB = n5gVar.b(messagesListWidget.getContext());
                    if (charSequenceB != null) {
                        bcb bcbVar = messagesListWidget.B0;
                        if (bcbVar != null) {
                            bcbVar.a();
                        }
                        ccb ccbVar = new ccb(messagesListWidget);
                        ccbVar.h(charSequenceB);
                        ccbVar.a(null);
                        ccbVar.e(new qcb(i3));
                        ccbVar.c(new kcb(0, 0, messagesListWidget.B0(), 3));
                        messagesListWidget.B0 = ccbVar.i();
                    }
                } else {
                    messagesListWidget.getContext().startActivity(intent2);
                }
            } else if (cdaVar instanceof eib) {
                eib eibVar = (eib) cdaVar;
                Intent intent3 = eibVar.b;
                Uri uri = eibVar.c;
                try {
                    messagesListWidget.getContext().startActivity(intent3);
                } catch (Exception unused2) {
                    intent3.setDataAndType(uri, "*/*");
                    messagesListWidget.getContext().startActivity(intent3);
                }
            } else if (cdaVar instanceof mp7) {
                ((ii4) gq9.a.getAccessor().c(116)).c(((oi4) ((mp7) cdaVar).a).a, null);
            } else if (cdaVar instanceof rib) {
                qr9 qr9Var = qr9.c;
                rib ribVar = (rib) cdaVar;
                long j = ribVar.b;
                String str2 = ribVar.d;
                long j2 = ribVar.c;
                qr9Var.getClass();
                Bundle bundleB = gwi.b(new imb("video_url", str2));
                ii4 ii4VarP0 = qr9Var.p0();
                StringBuilder sbL = az1.l(j, ":videoweb/full?chat_id=", "&msg_id=");
                sbL.append(j2);
                ii4VarP0.b(sbL.toString(), bundleB);
            } else if (cdaVar instanceof eo5) {
                qr9.c.p0().b(":external_callback", gwi.b(new imb("params", ((eo5) cdaVar).b)));
            } else if (cdaVar instanceof pxe) {
                qr9 qr9Var2 = qr9.c;
                pxe pxeVar = (pxe) cdaVar;
                long j3 = pxeVar.b;
                long j4 = pxeVar.c;
                String str3 = pxeVar.d;
                long j5 = pxeVar.e;
                String str4 = pxeVar.f;
                String str5 = pxeVar.h;
                long j6 = pxeVar.g;
                qr9Var2.getClass();
                Uri uri2 = Uri.parse(str5);
                ii4 ii4VarP02 = qr9Var2.p0();
                Bundle bundleB2 = gwi.b(new imb("file_url", uri2));
                hi4 hi4Var = new hi4();
                hi4Var.a = ":dialogs/file-download-warning";
                hi4Var.c(Long.valueOf(j3), "chat_id");
                hi4Var.c(Long.valueOf(j4), "message_id");
                if (str3 != null) {
                    hi4Var.c(str3, "attach_id");
                }
                hi4Var.c(Long.valueOf(j5), "file_id");
                hi4Var.c(str4, "file_name");
                hi4Var.c(Long.valueOf(j6), "file_size");
                ii4VarP02.c(hi4Var.a(), bundleB2);
            } else if (fni.a(cdaVar, qv6.b)) {
                Activity activity = messagesListWidget.getActivity();
                if (activity != null) {
                    ((vq) ((tq) fq9.a.getValue())).a(activity);
                }
            } else if (cdaVar instanceof ind) {
                ((qsb) messagesListWidget.t0.getValue()).l(new s2i(messagesListWidget, 1));
            } else {
                wqi.e(messagesListWidget.a, "Unknown navigation event " + cdaVar, null);
            }
        }
        return qqg.a;
    }
}
