package com.avito.android.virtual_deal_room_client_creation.create.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.virtual_deal_room_client_creation.create.mvi.entity.CreateInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: CreateReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/h;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "LRN0/c;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements u<CreateInternalAction, RN0.c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.virtual_deal_room_client_creation.create.mvi.builder.a f326874b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.a f326875c;

    @Inject
    public h(@k com.avito.android.virtual_deal_room_client_creation.create.mvi.builder.a aVar, @k com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.a aVar2) {
        this.f326874b = aVar;
        this.f326875c = aVar2;
    }

    public static QN0.a b(QN0.a aVar, boolean z12) {
        PrintableText printableText = aVar.f13704c;
        if (z12) {
            printableText = null;
        }
        return QN0.a.a(aVar, null, printableText, 1);
    }

    @Override // com.avito.android.arch.mvi.u
    public final RN0.c a(CreateInternalAction createInternalAction, RN0.c cVar) {
        CreateInternalAction createInternalAction2 = createInternalAction;
        RN0.c cVarA = cVar;
        if (!(createInternalAction2 instanceof CreateInternalAction.ClientSelected) && !createInternalAction2.equals(CreateInternalAction.CloseClicked.f326860b)) {
            boolean z12 = createInternalAction2 instanceof CreateInternalAction.FirstNameInput;
            QN0.a aVar = cVarA.f14428c;
            QN0.a aVar2 = cVarA.f14427b;
            if (z12) {
                cVarA = RN0.c.a(cVarA, b(QN0.a.a(aVar2, ((CreateInternalAction.FirstNameInput) createInternalAction2).f326861b, null, 6), !aVar.f13703b), null, null, null, false, false, null, null, 510);
            } else if (createInternalAction2 instanceof CreateInternalAction.LastNameInput) {
                cVarA = RN0.c.a(cVarA, !aVar2.f13703b ? b(aVar2, true) : aVar2, b(QN0.a.a(aVar, ((CreateInternalAction.LastNameInput) createInternalAction2).f326863b, null, 6), true), null, null, false, false, null, null, 508);
            } else if (createInternalAction2 instanceof CreateInternalAction.LoadingSuggestError) {
                cVarA = RN0.c.a(cVarA, null, null, null, null, false, false, null, null, 367);
            } else if (createInternalAction2 instanceof CreateInternalAction.LoadingSuggestion) {
                cVarA = RN0.c.a(cVarA, null, null, null, null, true, false, null, null, 367);
            } else if (createInternalAction2 instanceof CreateInternalAction.MiddleNameInput) {
                cVarA = RN0.c.a(cVarA, null, null, QN0.a.a(cVarA.f14429d, ((CreateInternalAction.MiddleNameInput) createInternalAction2).f326866b, null, 6), null, false, false, null, null, 507);
            } else {
                boolean z13 = createInternalAction2 instanceof CreateInternalAction.PhoneInput;
                QN0.a aVar3 = cVarA.f14430e;
                if (z13) {
                    cVarA = RN0.c.a(cVarA, null, null, null, b(QN0.a.a(aVar3, ((CreateInternalAction.PhoneInput) createInternalAction2).f326867b, null, 6), aVar3.f13703b), false, false, null, null, 359);
                } else {
                    boolean zEquals = createInternalAction2.equals(CreateInternalAction.PhoneNumberInUse.f326868b);
                    com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.a aVar4 = this.f326875c;
                    if (zEquals) {
                        cVarA = RN0.c.a(cVarA, null, null, null, aVar4.e(aVar3.f13702a), false, false, null, null, 407);
                    } else if (createInternalAction2 instanceof CreateInternalAction.SubmitFailure) {
                        cVarA = RN0.c.a(cVarA, null, null, null, null, false, false, null, null, 447);
                    } else if (createInternalAction2.equals(CreateInternalAction.SubmitStarted.f326870b)) {
                        cVarA = RN0.c.a(cVarA, null, null, null, null, false, true, null, null, 447);
                    } else if (createInternalAction2 instanceof CreateInternalAction.SubmitSuccess) {
                        cVarA = RN0.c.a(cVarA, null, null, null, null, false, false, null, null, 447);
                    } else if (createInternalAction2 instanceof CreateInternalAction.SuggestedClients) {
                        cVarA = RN0.c.a(cVarA, null, null, null, null, false, false, ((CreateInternalAction.SuggestedClients) createInternalAction2).f326872b, null, 367);
                    } else {
                        if (!createInternalAction2.equals(CreateInternalAction.InvalidForm.f326862b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVarA = RN0.c.a(cVarA, aVar4.c(aVar2.f13702a, !r11.f13703b), aVar4.d(aVar.f13702a), null, aVar4.a(aVar3.f13702a), false, false, null, null, 436);
                    }
                }
            }
        }
        return this.f326874b.a(cVarA);
    }
}
