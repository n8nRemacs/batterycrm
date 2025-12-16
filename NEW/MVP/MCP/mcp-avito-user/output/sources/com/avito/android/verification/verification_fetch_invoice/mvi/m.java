package com.avito.android.verification.verification_fetch_invoice.mvi;

import OM0.d;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.common.VerificationAction;
import com.avito.android.remote.model.inn.VerificationFetchInvoiceResult;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.verification.inn.a;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.inn.p;
import com.avito.android.verification.verification_fetch_invoice.mvi.entity.FetchInvoiceInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FetchInvoiceReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "LOM0/d;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements u<FetchInvoiceInternalAction, OM0.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f325223b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.inn.a f325224c;

    @Inject
    public m(@Y61.k p pVar, @Y61.k com.avito.android.verification.inn.a aVar) {
        this.f325223b = pVar;
        this.f325224c = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final OM0.d a(FetchInvoiceInternalAction fetchInvoiceInternalAction, OM0.d dVar) {
        Object next;
        OM0.a aVar;
        FetchInvoiceInternalAction fetchInvoiceInternalAction2 = fetchInvoiceInternalAction;
        OM0.d dVar2 = dVar;
        if (fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.Loading) {
            return d.c.f12220b;
        }
        boolean z12 = fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.Loaded;
        com.avito.android.verification.inn.a aVar2 = this.f325224c;
        if (z12) {
            VerificationFetchInvoiceResult verificationFetchInvoiceResult = ((FetchInvoiceInternalAction.Loaded) fetchInvoiceInternalAction2).f325205b;
            List<VerificationInnItem> fields = verificationFetchInvoiceResult.getFields();
            if (fields == null) {
                fields = C42784z0.f406748b;
            }
            List listB = p.b(this.f325223b, fields, verificationFetchInvoiceResult.getTitle(), verificationFetchInvoiceResult.getSubtitle(), 24);
            Boolean boolIsClosable = verificationFetchInvoiceResult.isClosable();
            boolean zBooleanValue = boolIsClosable != null ? boolIsClosable.booleanValue() : true;
            a.C10030a c10030aB = com.avito.android.verification.inn.a.b(aVar2, listB);
            VerificationAction action = verificationFetchInvoiceResult.getAction();
            if (action != null) {
                UU.a aVar3 = new UU.a(action.getTitle(), null, !(action.getIsDisabled() != null ? r7.booleanValue() : false), false, false, null, null, null, null, false, 1018, null);
                DeepLink uri = action.getUri();
                VerificationAction.Style style = action.getStyle();
                if (style == null) {
                    style = VerificationAction.Style.DEFAULT;
                }
                aVar = new OM0.a(aVar3, uri, style);
            } else {
                aVar = new OM0.a(new UU.a(null, null, false, false, false, null, null, null, null, false, 1019, null), new NoMatchLink(), VerificationAction.Style.DEFAULT);
            }
            return new d.b(zBooleanValue, c10030aB, aVar);
        }
        if (fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.Error) {
            return new d.a(((FetchInvoiceInternalAction.Error) fetchInvoiceInternalAction2).f325203b.getF244063c());
        }
        if (!(fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.SetButtonItemLoading)) {
            if (!(fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.UpdateListState)) {
                if (fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.ShowErrorToast ? true : fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.NavigateBack ? true : fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.FinishActivity ? true : fetchInvoiceInternalAction2 instanceof FetchInvoiceInternalAction.DoNothing) {
                    return dVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(dVar2 instanceof d.b)) {
                return dVar2;
            }
            d.b bVar = (d.b) dVar2;
            return d.b.a(bVar, com.avito.android.verification.inn.a.b(aVar2, bVar.f12218c.f323872a));
        }
        if (!(dVar2 instanceof d.b)) {
            return dVar2;
        }
        d.b bVar2 = (d.b) dVar2;
        ArrayList arrayList = bVar2.f12218c.f323872a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f((com.avito.conveyor_item.a) next, ((FetchInvoiceInternalAction.SetButtonItemLoading) fetchInvoiceInternalAction2).f325206b)) {
                break;
            }
        }
        com.avito.conveyor_item.a aVar4 = (com.avito.conveyor_item.a) next;
        Integer numValueOf = aVar4 != null ? Integer.valueOf(arrayList.indexOf(aVar4)) : null;
        if (numValueOf == null) {
            return bVar2;
        }
        FetchInvoiceInternalAction.SetButtonItemLoading setButtonItemLoading = (FetchInvoiceInternalAction.SetButtonItemLoading) fetchInvoiceInternalAction2;
        ButtonItem buttonItemA = ButtonItem.a(setButtonItemLoading.f325206b, setButtonItemLoading.f325207c);
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.set(numValueOf.intValue(), buttonItemA);
        return d.b.a(bVar2, com.avito.android.verification.inn.a.b(aVar2, arrayList2));
    }
}
