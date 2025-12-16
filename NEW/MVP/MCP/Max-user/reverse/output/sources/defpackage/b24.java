package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.ContactsPickerScreen;

/* loaded from: classes2.dex */
public final class b24 extends dtf implements sm6 {
    public final /* synthetic */ ContactsPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b24(Continuation continuation, ContactsPickerScreen contactsPickerScreen) {
        super(2, continuation);
        this.X = contactsPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        b24 b24Var = (b24) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        b24Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        b24 b24Var = new b24(continuation, this.X);
        b24Var.o = obj;
        return b24Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objPrevious;
        g8j.b(obj);
        z14 z14Var = (z14) this.o;
        if (z14Var == null) {
            throw new NoWhenBranchMatchedException();
        }
        ContactsPickerScreen contactsPickerScreen = this.X;
        hs hsVar = contactsPickerScreen.t0;
        b04 b04Var = z14Var.a;
        yy7[] yy7VarArr = ContactsPickerScreen.v0;
        ArrayList arrayListE = contactsPickerScreen.getRouter().e();
        ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((bud) objPrevious).a instanceof dj6) {
                break;
            }
        }
        bud budVar = (bud) objPrevious;
        Object obj2 = budVar != null ? budVar.a : null;
        dj6 dj6Var = obj2 instanceof dj6 ? (dj6) obj2 : null;
        if (dj6Var != null) {
            yy7[] yy7VarArr2 = ContactsPickerScreen.v0;
            yy7 yy7Var = yy7VarArr2[0];
            if (((Number) hsVar.a(contactsPickerScreen)).intValue() != 0) {
                Intent intent = new Intent();
                intent.putExtra("contacts.picker.result.key", b04Var);
                yy7 yy7Var2 = yy7VarArr2[0];
                dj6Var.X(((Number) hsVar.a(contactsPickerScreen)).intValue(), -1, intent);
                jva onBackPressedDispatcher = contactsPickerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                api.c(contactsPickerScreen);
            }
        }
        return qqg.a;
    }
}
