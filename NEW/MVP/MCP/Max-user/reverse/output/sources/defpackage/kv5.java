package defpackage;

import androidx.work.WorkRequest;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* loaded from: classes2.dex */
public final class kv5 extends dtf implements sm6 {
    public final /* synthetic */ lv5 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ String Z;
    public int o;
    public final /* synthetic */ String s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ String v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv5(lv5 lv5Var, long j, String str, String str2, long j2, long j3, String str3, Continuation continuation) {
        super(2, continuation);
        this.X = lv5Var;
        this.Y = j;
        this.Z = str;
        this.s0 = str2;
        this.t0 = j2;
        this.u0 = j3;
        this.v0 = str3;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kv5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kv5(this.X, this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        g5i g5iVar = this.X.a;
        long j = this.Y;
        String str = this.Z;
        String str2 = this.s0;
        long j2 = this.t0;
        long j3 = this.u0;
        String str3 = this.v0;
        String str4 = "ru.ok.tamtam.upload.workers.UploadExternalGifWorker/" + new lug(j, str, str2, j2, j3, str3);
        ngb ngbVar = (ngb) ((ngb) ((ngb) new ngb(UploadExternalGifWorker.class).setConstraints(new bu3(2, false, false, false, false, -1L, -1L, ue3.h0(new LinkedHashSet())))).setExpedited(ujb.a)).setBackoffCriteria(eg0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        imb[] imbVarArr = {new imb("taskName", str4), new imb("requestId", Long.valueOf(j)), new imb("externalUrl", str), new imb("attachLocalId", str2), new imb("messageId", Long.valueOf(j2)), new imb(ApiProtocol.PARAM_CHAT_ID, Long.valueOf(j3)), new imb("stickerId", str3)};
        r5j r5jVar = new r5j(14);
        for (int i2 = 0; i2 < 7; i2++) {
            imb imbVar = imbVarArr[i2];
            r5jVar.C(imbVar.b, (String) imbVar.a);
        }
        q48 q48VarB = g5iVar.b(str4, uk5.b, (ogb) ((ngb) ngbVar.setInputData(r5jVar.g())).build());
        q48VarB.c();
        m11 m11Var = new m11(8, new xnb(lc4.b(q48VarB.b.d()), 11));
        this.o = 1;
        Object objP = gw0.p(m11Var, this);
        g84 g84Var = g84.a;
        return objP == g84Var ? g84Var : objP;
    }
}
