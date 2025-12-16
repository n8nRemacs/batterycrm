package com.avito.android.verification.verification_confirm_requisites.mvi;

import LM0.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.common.VerificationAction;
import com.avito.android.remote.model.inn.VerificationConfirmRequisitesResult;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.inn.list.select.SelectItem;
import com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ConfirmRequisitesReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "LLM0/c;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o implements u<ConfirmRequisitesInternalAction, LM0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.inn.p f325014b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.inn.a f325015c;

    /* compiled from: ConfirmRequisitesReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/o$a;", "", "<init>", "()V", "", "ACTION_BUTTON_ID", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public o(@Y61.k com.avito.android.verification.inn.p pVar, @Y61.k com.avito.android.verification.inn.a aVar) {
        this.f325014b = pVar;
        this.f325015c = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final LM0.c a(ConfirmRequisitesInternalAction confirmRequisitesInternalAction, LM0.c cVar) {
        Object next;
        ConfirmRequisitesInternalAction confirmRequisitesInternalAction2 = confirmRequisitesInternalAction;
        LM0.c cVar2 = cVar;
        if (confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.Loading) {
            return c.C0613c.f9938b;
        }
        boolean z12 = confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.Loaded;
        com.avito.android.verification.inn.a aVar = this.f325015c;
        int i12 = 0;
        if (z12) {
            VerificationConfirmRequisitesResult verificationConfirmRequisitesResult = ((ConfirmRequisitesInternalAction.Loaded) confirmRequisitesInternalAction2).f324976b;
            List<VerificationInnItem> fields = verificationConfirmRequisitesResult.getFields();
            String title = verificationConfirmRequisitesResult.getTitle();
            AttributedText subtitle = verificationConfirmRequisitesResult.getSubtitle();
            VerificationAction action = verificationConfirmRequisitesResult.getAction();
            ArrayList arrayListA = this.f325014b.a(fields, title, subtitle, action != null ? new Q("ACTION_BUTTON_ID", action) : null, verificationConfirmRequisitesResult.getFooter());
            Boolean boolIsClosable = verificationConfirmRequisitesResult.isClosable();
            return new c.b(boolIsClosable != null ? boolIsClosable.booleanValue() : false, com.avito.android.verification.inn.a.b(aVar, arrayListA));
        }
        if (confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.Error) {
            return new c.a(z.k(((ConfirmRequisitesInternalAction.Error) confirmRequisitesInternalAction2).f324973b));
        }
        if (confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.InputValidationFailed) {
            if (!(cVar2 instanceof c.b)) {
                return cVar2;
            }
            c.b bVar = (c.b) cVar2;
            ArrayList arrayList = bVar.f9937c.f323872a;
            Map<String, AttributedText> map = ((ConfirmRequisitesInternalAction.InputValidationFailed) confirmRequisitesInternalAction2).f324975b;
            aVar.getClass();
            return c.b.a(bVar, com.avito.android.verification.inn.a.a(arrayList, map));
        }
        if (confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.UpdateListState) {
            if (!(cVar2 instanceof c.b)) {
                return cVar2;
            }
            c.b bVar2 = (c.b) cVar2;
            return c.b.a(bVar2, com.avito.android.verification.inn.a.b(aVar, bVar2.f9937c.f323872a));
        }
        if (confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.BottomSheetItemSelect) {
            if (!(cVar2 instanceof c.b)) {
                return cVar2;
            }
            c.b bVar3 = (c.b) cVar2;
            ArrayList arrayList2 = bVar3.f9937c.f323872a;
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) it.next();
                if ((aVar2 instanceof SelectItem) && L.f(((SelectItem) aVar2).f324058b, ((ConfirmRequisitesInternalAction.BottomSheetItemSelect) confirmRequisitesInternalAction2).f324971b)) {
                    break;
                }
                i12++;
            }
            SelectItem selectItemL = SelectItem.L((SelectItem) arrayList2.get(i12), null, null, (ParcelableEntity) C42745f0.E(((ConfirmRequisitesInternalAction.BottomSheetItemSelect) confirmRequisitesInternalAction2).f324972c), 32503);
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.set(i12, selectItemL);
            return c.b.a(bVar3, com.avito.android.verification.inn.a.b(aVar, arrayList3));
        }
        if (!(confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.SetButtonLoading)) {
            if (confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.ShowErrorToast ? true : confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.OpenBottomSheet ? true : confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.NavigateBack ? true : confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.FinishActivity ? true : confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.DoNothing) {
                return cVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(cVar2 instanceof c.b)) {
            return cVar2;
        }
        c.b bVar4 = (c.b) cVar2;
        ArrayList arrayList4 = bVar4.f9937c.f323872a;
        Iterator it2 = arrayList4.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (L.f((com.avito.conveyor_item.a) next, ((ConfirmRequisitesInternalAction.SetButtonLoading) confirmRequisitesInternalAction2).f324978b)) {
                break;
            }
        }
        com.avito.conveyor_item.a aVar3 = (com.avito.conveyor_item.a) next;
        Integer numValueOf = aVar3 != null ? Integer.valueOf(arrayList4.indexOf(aVar3)) : null;
        if (numValueOf == null) {
            return bVar4;
        }
        ConfirmRequisitesInternalAction.SetButtonLoading setButtonLoading = (ConfirmRequisitesInternalAction.SetButtonLoading) confirmRequisitesInternalAction2;
        ButtonItem buttonItemA = ButtonItem.a(setButtonLoading.f324978b, setButtonLoading.f324979c);
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList5.set(numValueOf.intValue(), buttonItemA);
        return c.b.a(bVar4, com.avito.android.verification.inn.a.b(aVar, arrayList5));
    }
}
