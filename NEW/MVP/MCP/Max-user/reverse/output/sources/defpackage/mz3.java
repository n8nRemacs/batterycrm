package defpackage;

import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes2.dex */
public final class mz3 extends dtf implements sm6 {
    public final /* synthetic */ ContactListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = contactListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mz3 mz3Var = (mz3) l((s5g) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mz3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mz3 mz3Var = new mz3(this.X, continuation);
        mz3Var.o = obj;
        return mz3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        s5g s5gVar = (s5g) this.o;
        ContactListWidget contactListWidget = this.X;
        CharSequence charSequenceB = s5gVar.b(contactListWidget.getContext());
        String string = charSequenceB != null ? charSequenceB.toString() : null;
        if (string == null) {
            string = "";
        }
        fbb searchView = contactListWidget.B0().getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(string);
        }
        return qqg.a;
    }
}
