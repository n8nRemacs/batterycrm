package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bjf extends xfh {
    public static final /* synthetic */ yy7[] A0 = {new z8a(bjf.class, "moveFinishJob", "getMoveFinishJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, bjf.class, "menuItemJob", "getMenuItemJob()Lkotlinx/coroutines/Job;"), new z8a(bjf.class, "deleteSetJob", "getDeleteSetJob()Lkotlinx/coroutines/Job;")};
    public final hbd X;
    public final ci5 Y;
    public final ci5 Z;
    public final Context b;
    public final lzf c;
    public final k18 d;
    public final tcf o;
    public volatile Long s0;
    public volatile int t0;
    public volatile Long u0;
    public final t9f v0;
    public Long w0;
    public Long x0;
    public final t9f y0;
    public final t9f z0;

    public bjf(Context context, lzf lzfVar, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.b = context;
        this.c = lzfVar;
        this.d = k18Var3;
        tcf tcfVarA = ucf.a(hd5.a);
        this.o = tcfVarA;
        this.X = new hbd(tcfVarA);
        this.Y = new ci5(0);
        this.Z = new ci5(0);
        this.t0 = -1;
        this.v0 = c7j.c();
        this.y0 = c7j.c();
        this.z0 = c7j.c();
        wqi.c(bjf.class.getName(), "loadSections", new Object[0]);
        su1 su1VarA = s8j.a(((tef) k18Var.getValue()).a());
        su1 su1VarA2 = s8j.a(((ps5) k18Var2.getValue()).a());
        nm0 nm0Var = ((vr5) k18Var3.getValue()).Y;
        nm0Var.getClass();
        gw0.w(gw0.u(new g56(gw0.i(su1VarA, su1VarA2, s8j.a(new ora(new qra(nm0Var, 0), new er5(28), 5)), new g04(4, (Continuation) null)), new bzb(2, this, bjf.class, "processResult", "processResult(Lone/me/stickerssettings/StickersSettingsViewModel$CombinedResult;)V", 4, 20), 1), ((q2b) lzfVar).b()), this.a);
    }

    public final String t(List list) {
        int size = list != null ? list.size() : 0;
        return this.b.getResources().getQuantityString(vab.a, size, Integer.valueOf(size));
    }
}
