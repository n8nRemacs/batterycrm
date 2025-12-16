package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.crop.AvatarEditScreen;

/* loaded from: classes2.dex */
public final class od0 extends dtf implements sm6 {
    public final /* synthetic */ AvatarEditScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od0(Continuation continuation, AvatarEditScreen avatarEditScreen) {
        super(2, continuation);
        this.X = avatarEditScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        od0 od0Var = (od0) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        od0Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        od0 od0Var = new od0(continuation, this.X);
        od0Var.o = obj;
        return od0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [c54] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ?? r5;
        AvatarEditScreen avatarEditScreen = this.X;
        RectF rectF = avatarEditScreen.s0;
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (fni.a(cdaVar, fd0.b)) {
            n5g n5gVar = new n5g(mvd.D);
            yy7[] yy7VarArr = AvatarEditScreen.u0;
            ccb ccbVar = new ccb(avatarEditScreen);
            ccbVar.g(n5gVar);
            ccbVar.i();
            c39.c.p0().d();
        } else if (fni.a(cdaVar, hd0.b)) {
            n5g n5gVar2 = new n5g(mvd.H0);
            yy7[] yy7VarArr2 = AvatarEditScreen.u0;
            ccb ccbVar2 = new ccb(avatarEditScreen);
            ccbVar2.g(n5gVar2);
            ccbVar2.i();
        } else if (cdaVar instanceof gd0) {
            gd0 gd0Var = (gd0) cdaVar;
            long j = gd0Var.c;
            Rect rect = gd0Var.b;
            long j2 = gd0Var.c;
            if (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f || Float.intBitsToFloat((int) (j2 & 4294967295L)) <= 0.0f) {
                n5g n5gVar3 = new n5g(mvd.H0);
                yy7[] yy7VarArr3 = AvatarEditScreen.u0;
                ccb ccbVar3 = new ccb(avatarEditScreen);
                ccbVar3.g(n5gVar3);
                ccbVar3.i();
            } else {
                boolean z = gd0Var.d;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (z ? j2 & 4294967295L : j2 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (z ? j2 >> 32 : j2 & 4294967295L));
                rectF.set(rect.left / fIntBitsToFloat, rect.top / fIntBitsToFloat2, rect.right / fIntBitsToFloat, rect.bottom / fIntBitsToFloat2);
                c39.c.p0().d();
                ytd router = avatarEditScreen.getRouter();
                js jsVar = new js();
                jsVar.addLast(router);
                loop0: while (true) {
                    if (jsVar.isEmpty()) {
                        r5 = 0;
                        break;
                    }
                    ArrayList arrayListE = ((ytd) jsVar.removeLast()).e();
                    for (int i = ve3.i(arrayListE); -1 < i; i--) {
                        r5 = ((bud) arrayListE.get(i)).a;
                        if (r5 instanceof jd0) {
                            break loop0;
                        }
                        Iterator it = new fqd(r5.getChildRouters()).iterator();
                        while (true) {
                            ListIterator listIterator = ((eqd) it).b;
                            if (listIterator.hasPrevious()) {
                                jsVar.addLast((ytd) listIterator.previous());
                            }
                        }
                    }
                }
                jd0 jd0Var = (jd0) r5;
                if (jd0Var != null) {
                    hs hsVar = avatarEditScreen.c;
                    yy7 yy7Var = AvatarEditScreen.u0[1];
                    jd0Var.r((String) hsVar.a(avatarEditScreen), rectF, rect);
                }
            }
        } else if (fni.a(cdaVar, jc3.b)) {
            c39.c.p0().d();
        }
        return qqg.a;
    }
}
