package defpackage;

import kotlin.coroutines.Continuation;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieDrawableUtils;

/* loaded from: classes2.dex */
public final class mk extends dtf implements sm6 {
    public final /* synthetic */ ok X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(ok okVar, Continuation continuation) {
        super(2, continuation);
        this.X = okVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mk mkVar = (mk) l((cjg) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mkVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mk mkVar = new mk(this.X, continuation);
        mkVar.o = obj;
        return mkVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cjg cjgVar = (cjg) this.o;
        long jLongValue = ((Number) cjgVar.a).longValue();
        String str = (String) cjgVar.b;
        String str2 = (String) cjgVar.c;
        ok okVar = this.X;
        String str3 = okVar.s0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str3, ho7.l(ho7.n("handleAnimoji #", jLongValue, ", ", str), ", ", str2), null);
            }
        }
        if (str != null && str.length() != 0) {
            pi piVar = okVar.d;
            int i = okVar.a;
            piVar.getClass();
            oi oiVar = new oi(jLongValue, str, i);
            RLottieDrawable rLottieDrawable = (RLottieDrawable) piVar.a.computeIfAbsent(oiVar, new ni(0, new p8(str, i, 1)));
            rLottieDrawable.scaleByCanvas = true;
            if (rLottieDrawable.isLoadingFailed()) {
                RLottieDrawableUtils.restartDownloadFromUrl(rLottieDrawable, true);
            }
            lk lkVar = okVar.y0;
            if (lkVar != null) {
                rLottieDrawable.removeDrawableLoadListener(lkVar);
            }
            lk lkVar2 = new lk(okVar, str2);
            okVar.y0 = lkVar2;
            rLottieDrawable.addDrawableLoadListener(lkVar2);
        } else if (str2 != null && str2.length() != 0) {
            okVar.g(str2);
        }
        return qqg.a;
    }
}
