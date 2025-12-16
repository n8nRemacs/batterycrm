package com.avito.android.verification.verification_status_list.mvi;

import YM0.b;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.VerificationStatusListResult;
import com.avito.android.remote.model.common.VerificationAction;
import com.avito.android.remote.model.common.items.VerificationListItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.y6;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.verification_status_list.a;
import com.avito.android.verification.verification_status_list.mvi.entity.StatusListInternalAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: StatusListReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_status_list/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction;", "LYM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements u<StatusListInternalAction, YM0.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_status_list.a f325819b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f325820c;

    @Inject
    public l(@Y61.k com.avito.android.verification.verification_status_list.a aVar, @Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f325819b = aVar;
        this.f325820c = interfaceC35741a1;
    }

    @Override // com.avito.android.arch.mvi.u
    public final YM0.b a(StatusListInternalAction statusListInternalAction, YM0.b bVar) {
        ButtonItem.Style style;
        int i12;
        StatusListInternalAction statusListInternalAction2 = statusListInternalAction;
        if (statusListInternalAction2 instanceof StatusListInternalAction.Error) {
            return new b.a(InterfaceC35741a1.a.a(this.f325820c, ((StatusListInternalAction.Error) statusListInternalAction2).f325800b, null, null, 6));
        }
        if (!(statusListInternalAction2 instanceof StatusListInternalAction.Loaded)) {
            if (statusListInternalAction2 instanceof StatusListInternalAction.Loading) {
                return b.c.f19459b;
            }
            throw new NoWhenBranchMatchedException();
        }
        com.avito.android.verification.verification_status_list.a aVar = this.f325819b;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        VerificationStatusListResult verificationStatusListResult = ((StatusListInternalAction.Loaded) statusListInternalAction2).f325802b;
        String title = verificationStatusListResult.getTitle();
        if (title != null && title.length() > 0) {
            arrayList.add(new com.avito.android.verification.list_items.attributed_text.a("TITLE", new AttributedText(title, C42784z0.f406748b, 1), Integer.valueOf(R.attr.textH20), false, 8, null));
            arrayList.add(new com.avito.android.verification.common.list.space.a(null, y6.b(12), 1, null));
        }
        AttributedText subtitle = verificationStatusListResult.getSubtitle();
        if (subtitle != null && subtitle.getText().length() > 0) {
            arrayList.add(new com.avito.android.verification.list_items.attributed_text.a("SUBTITLE", subtitle, Integer.valueOf(R.attr.textM10), false, 8, null));
            arrayList.add(new com.avito.android.verification.common.list.space.a(null, y6.b(20), 1, null));
        }
        List<VerificationListItem> items = verificationStatusListResult.getItems();
        if (items != null) {
            List<VerificationListItem> list = items;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (VerificationListItem verificationListItem : list) {
                aVar.f325759a.getClass();
                arrayList2.add(com.avito.android.verification.common.a.a(verificationListItem));
            }
            arrayList.addAll(arrayList2);
        }
        VerificationAction action = verificationStatusListResult.getAction();
        if (action != null) {
            String title2 = action.getTitle();
            DeepLink uri = action.getUri();
            Boolean isDisabled = action.getIsDisabled();
            boolean zBooleanValue = isDisabled != null ? isDisabled.booleanValue() : false;
            VerificationAction.Style style2 = action.getStyle();
            if (style2 == null || (i12 = a.C10067a.f325760a[style2.ordinal()]) == 1) {
                style = ButtonItem.Style.f323911c;
            } else if (i12 == 2) {
                style = ButtonItem.Style.f323912d;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                style = ButtonItem.Style.f323913e;
            }
            arrayList.add(new ButtonItem("ACTION", title2, uri, zBooleanValue, false, style, null, null, 0, 0, 976, null));
        }
        com.avito.android.verification.verification_status_list.m mVar = new com.avito.android.verification.verification_status_list.m(arrayList, verificationStatusListResult.getFooter(), L.f(verificationStatusListResult.getIsClosable(), Boolean.TRUE));
        Map<String, String> meta = verificationStatusListResult.getMeta();
        if (meta == null) {
            meta = P0.c();
        }
        return new b.C1377b(mVar, meta);
    }
}
