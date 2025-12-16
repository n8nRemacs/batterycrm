package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* loaded from: classes2.dex */
public final class p53 extends dtf implements sm6 {
    public final /* synthetic */ ChatsListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p53(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.X = chatsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        p53 p53Var = (p53) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        p53Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        p53 p53Var = new p53(continuation, this.X);
        p53Var.o = obj;
        return p53Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof aib) {
            a63 a63Var = a63.c;
            long jLongValue = ((Number) ((aib) cdaVar).a).longValue();
            a63Var.p0().b(":settings/folder/by-chat?id=" + jLongValue, null);
        } else if (cdaVar instanceof u2a) {
            a63.c.p0().b(a9h.d(((Number) ((u2a) cdaVar).a).longValue(), ":profile/change-owner?chat_id=", "&leave_chat=true"), null);
        } else if (cdaVar instanceof ei4) {
            a63.c.s0((ei4) cdaVar);
        } else if (cdaVar instanceof yhb) {
            Context context = this.X.getContext();
            Uri uri = (Uri) ((yhb) cdaVar).a;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(uri);
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                Log.e("ContextExt", "openWebLink " + uri + ": " + e.getMessage());
            }
        } else if (cdaVar instanceof lp7) {
            a63.c.p0().c(((oi4) ((lp7) cdaVar).a).a, null);
        } else if (cdaVar instanceof sxe) {
            a63.c.p0().b(":call-join-preview?link=".concat((String) ((sxe) cdaVar).a), null);
        }
        return qqg.a;
    }
}
