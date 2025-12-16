package defpackage;

import android.widget.EditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;

/* loaded from: classes2.dex */
public final class r3 extends dtf implements sm6 {
    public final /* synthetic */ AbstractPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(Continuation continuation, AbstractPickerScreen abstractPickerScreen) {
        super(2, continuation);
        this.X = abstractPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        r3 r3Var = (r3) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        r3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        r3 r3Var = new r3(continuation, this.X);
        r3Var.o = obj;
        return r3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        EditText editText;
        g8j.b(obj);
        mxb mxbVar = (mxb) this.o;
        boolean zA = fni.a(mxbVar, kxb.a);
        AbstractPickerScreen abstractPickerScreen = this.X;
        if (zA) {
            a2b a2bVarD0 = abstractPickerScreen.D0();
            if (a2bVarD0 != null && (editText = a2bVarD0.getEditText()) != null) {
                editText.setText((CharSequence) null);
            }
        } else {
            if (!(mxbVar instanceof lxb)) {
                throw new NoWhenBranchMatchedException();
            }
            bcb bcbVar = abstractPickerScreen.Z;
            if (bcbVar != null) {
                bcbVar.a();
            }
            ccb ccbVar = new ccb(abstractPickerScreen);
            ccbVar.g(((lxb) mxbVar).a);
            ccbVar.e(new qcb(ivd.a1));
            abstractPickerScreen.Z = ccbVar.i();
        }
        return qqg.a;
    }
}
