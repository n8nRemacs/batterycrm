package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.folders.edit.FolderEditScreen;

/* loaded from: classes2.dex */
public final class j96 extends dtf implements sm6 {
    public final /* synthetic */ FolderEditScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j96(FolderEditScreen folderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.X = folderEditScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        j96 j96Var = (j96) l((e96) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        j96Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        j96 j96Var = new j96(this.X, continuation);
        j96Var.o = obj;
        return j96Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        uh7 uh7Var;
        g8j.b(obj);
        e96 e96Var = (e96) this.o;
        boolean z = e96Var instanceof b96;
        qqg qqgVar = qqg.a;
        FolderEditScreen folderEditScreen = this.X;
        if (z) {
            yy7[] yy7VarArr = FolderEditScreen.Z;
            folderEditScreen.A0();
            folderEditScreen.getRouter().C();
            if (((b96) e96Var).a && (uh7Var = (uh7) vb6.a.getAccessor().f()) != null) {
                uh7Var.f(Collections.singleton(new th7(rh7.c, 1)), f1e.SETTINGS_FOLDERS);
                return qqgVar;
            }
        } else {
            if (!(e96Var instanceof d96)) {
                if (!(e96Var instanceof c96)) {
                    throw new NoWhenBranchMatchedException();
                }
                yy7[] yy7VarArr2 = FolderEditScreen.Z;
                t8j.b(String.valueOf(((n96) folderEditScreen.z0().y0.a.getValue()).a()), folderEditScreen);
                return qqgVar;
            }
            String str = ((bud) ue3.P(folderEditScreen.getRouter().e())).b;
            if (str != null) {
                folderEditScreen.A0();
                qa6.c.p0().b(wy1.i(":settings/folder/members-picker?tag=", str, "&members_ids=", ue3.N(((d96) e96Var).a, ",", null, null, null, 62)), null);
                return qqgVar;
            }
        }
        return qqgVar;
    }
}
