package defpackage;

import kotlin.coroutines.Continuation;
import one.me.devmenu.DevMenuGeneralPageScreen;

/* loaded from: classes2.dex */
public final class zu4 implements x26 {
    public final /* synthetic */ x26 a;
    public final /* synthetic */ DevMenuGeneralPageScreen b;
    public final /* synthetic */ int c;

    public zu4(mcf mcfVar, DevMenuGeneralPageScreen devMenuGeneralPageScreen, int i) {
        this.a = mcfVar;
        this.b = devMenuGeneralPageScreen;
        this.c = i;
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        Object objD = this.a.d(new ld2(z26Var, this.b, this.c), continuation);
        return objD == g84.a ? objD : qqg.a;
    }
}
