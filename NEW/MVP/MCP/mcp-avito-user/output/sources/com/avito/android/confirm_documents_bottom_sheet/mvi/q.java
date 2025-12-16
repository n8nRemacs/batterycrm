package com.avito.android.confirm_documents_bottom_sheet.mvi;

import com.avito.android.confirm_documents_bottom_sheet.models.ConfirmDocumentsInternalAction;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentButtonItem;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentStatus;
import com.avito.android.job.confirm_documents_bottom_sheet_public.generated.api.shift_documents_status_v_1.ShiftDocumentsStatusV1ItemsItem;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import wr.AbstractC49674b;
import wr.C49675c;

/* compiled from: ConfirmDocumentsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction;", "Lwr/b;", "<init>", "()V", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q implements com.avito.android.arch.mvi.u<ConfirmDocumentsInternalAction, AbstractC49674b> {
    @Inject
    public q() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final AbstractC49674b a(ConfirmDocumentsInternalAction confirmDocumentsInternalAction, AbstractC49674b abstractC49674b) {
        ConfirmDocumentsInternalAction confirmDocumentsInternalAction2 = confirmDocumentsInternalAction;
        AbstractC49674b abstractC49674b2 = abstractC49674b;
        if (confirmDocumentsInternalAction2 instanceof ConfirmDocumentsInternalAction.ShowLoading) {
            return AbstractC49674b.c.f441820a;
        }
        if (!(confirmDocumentsInternalAction2 instanceof ConfirmDocumentsInternalAction.ShowContent)) {
            if (confirmDocumentsInternalAction2 instanceof ConfirmDocumentsInternalAction.ShowError) {
                return AbstractC49674b.C12833b.f441819a;
            }
            if (confirmDocumentsInternalAction2 instanceof ConfirmDocumentsInternalAction.a) {
                return abstractC49674b2;
            }
            throw new NoWhenBranchMatchedException();
        }
        ConfirmDocumentsInternalAction.ShowContent showContent = (ConfirmDocumentsInternalAction.ShowContent) confirmDocumentsInternalAction2;
        ArrayList<C49675c> arrayList = showContent.f125585d;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (C49675c c49675c : arrayList) {
            arrayList2.add(new DocumentButtonItem(c49675c.f441821a, c49675c.f441822b, c49675c.f441823c, c49675c.f441824d, c49675c.f441825e, null, 32, null));
        }
        Iterator it = arrayList.iterator();
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            if (!it.hasNext()) {
                z12 = z13;
                break;
            }
            C49675c c49675c2 = (C49675c) it.next();
            ShiftDocumentsStatusV1ItemsItem.Type type = c49675c2.f441826f;
            ShiftDocumentsStatusV1ItemsItem.Type type2 = ShiftDocumentsStatusV1ItemsItem.Type.Gosuslugi;
            DocumentStatus documentStatus = c49675c2.f441823c;
            if (type == type2 && documentStatus != DocumentStatus.f125597d) {
                break;
            }
            if (type == ShiftDocumentsStatusV1ItemsItem.Type.Medcard) {
                if (documentStatus != DocumentStatus.f125595b) {
                    break;
                }
                z13 = true;
            }
        }
        return new AbstractC49674b.a(showContent.f125583b, showContent.f125584c, arrayList2, z12);
    }
}
