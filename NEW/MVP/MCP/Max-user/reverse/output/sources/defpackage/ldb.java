package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;

/* loaded from: classes.dex */
public final class ldb extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mdb Y;
    public final /* synthetic */ StartConversationDelegate.Params Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldb(mdb mdbVar, StartConversationDelegate.Params params, Continuation continuation) {
        super(2, continuation);
        this.Y = mdbVar;
        this.Z = params;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ldb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ldb ldbVar = new ldb(this.Y, this.Z, continuation);
        ldbVar.X = obj;
        return ldbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        x1h x1hVar;
        int i = this.o;
        StartConversationDelegate.Params params = this.Z;
        try {
            if (i == 0) {
                g8j.b(obj);
                c0b c0bVar = (c0b) this.Y.a.getValue();
                String conversationId = params.getConversationId();
                List<String> calleeIds = params.getCalleeIds();
                ArrayList arrayList = new ArrayList(we3.q(calleeIds, 10));
                Iterator<T> it = calleeIds.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Long(Long.parseLong((String) it.next())));
                }
                long[] jArrE0 = ue3.e0(arrayList);
                Long chatId = params.getChatId();
                boolean zIsVideo = params.isVideo();
                String internalParams = params.getInternalParams();
                this.o = 1;
                obj = c0bVar.a(conversationId, jArrE0, chatId, zIsVideo, internalParams, this);
                g84 g84Var = g84.a;
                if (obj == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
            ipdVar = (z1h) obj;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (!(ipdVar instanceof ipd)) {
            z1h z1hVar = (z1h) ipdVar;
            List list = z1hVar.o;
            String str = (list == null || (x1hVar = (x1h) ue3.I(list)) == null) ? null : x1hVar.b;
            String str2 = z1hVar.d;
            if (str != null) {
                ipdVar = new StartConversationDelegate.Result.Error(str);
            } else if (str2 == null) {
                ipdVar = new StartConversationDelegate.Result.Error(new IllegalArgumentException("internalCallerParams must not be null"));
            } else {
                String conversationId2 = z1hVar.c;
                if (conversationId2 == null) {
                    conversationId2 = params.getConversationId();
                }
                ipdVar = new StartConversationDelegate.Result.Success(conversationId2, str2);
            }
        }
        Throwable thA = kpd.a(ipdVar);
        return thA == null ? ipdVar : new StartConversationDelegate.Result.Error(thA);
    }
}
