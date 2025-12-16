package defpackage;

import android.content.Context;
import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.messages.location.ActLocationMap;

/* loaded from: classes2.dex */
public final class qb9 extends dtf implements sm6 {
    public final /* synthetic */ MediaTypePickerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb9(Continuation continuation, MediaTypePickerWidget mediaTypePickerWidget) {
        super(2, continuation);
        this.X = mediaTypePickerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qb9 qb9Var = (qb9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qb9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qb9 qb9Var = new qb9(continuation, this.X);
        qb9Var.o = obj;
        return qb9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean zA = fni.a(cdaVar, xa9.b);
        MediaTypePickerWidget mediaTypePickerWidget = this.X;
        if (zA) {
            yy7[] yy7VarArr = MediaTypePickerWidget.X;
            Context context = mediaTypePickerWidget.getContext();
            hs hsVar = mediaTypePickerWidget.a;
            yy7 yy7Var = MediaTypePickerWidget.X[0];
            long jLongValue = ((Number) hsVar.a(mediaTypePickerWidget)).longValue();
            int i = ActLocationMap.S0;
            Intent intent = new Intent(context, (Class<?>) ActLocationMap.class);
            intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", jLongValue);
            intent.putExtra("map:DISABLE_LIVE", false);
            intent.putExtra("map:REGULAR_SENDING", true);
            mediaTypePickerWidget.startActivityForResult(intent, 371);
        } else if (fni.a(cdaVar, ya9.b)) {
            yy7[] yy7VarArr2 = MediaTypePickerWidget.X;
            yy7[] yy7VarArr3 = BottomSheetWidget.B0;
            oq3 oq3VarE = az1.e(n1b.I, null, null, 6);
            oq3VarE.a(new pq3(1, new n5g(n1b.H), 3, 56));
            oq3VarE.a(new pq3(2, new n5g(n1b.G), 3, 56));
            oq3VarE.a(new pq3(3, new n5g(mvd.p), 1, 56));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
            confirmationBottomSheetE.setTargetController(mediaTypePickerWidget);
            c54 parentController = mediaTypePickerWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(mediaTypePickerWidget);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (cdaVar instanceof ei4) {
            wv2.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
