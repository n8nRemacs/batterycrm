package com.avito.android.vas_planning_checkout.domain;

import com.avito.android.J0;
import com.avito.android.vas_planning.remote.model.Action;
import com.avito.android.vas_planning.remote.model.Balance;
import com.avito.android.vas_planning_checkout.item.header.VasPlanningHeaderItem;
import com.avito.android.vas_planning_checkout.item.result_warning.VasPlanningResultWarningItem;
import com.avito.android.vas_planning_checkout.model.VasPlanCheckoutContent;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: VasPlanResultConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning_checkout/domain/o;", "Lcom/avito/android/vas_planning_checkout/domain/n;", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f322893a;

    /* compiled from: VasPlanResultConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/vas_planning_checkout/domain/o$a;", "", "<init>", "()V", "", "HEADER_ITEM_ID", "Ljava/lang/String;", "WARNING_ITEM_ID", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public o(@Y61.k J0 j02) {
        this.f322893a = j02;
    }

    @Override // com.avito.android.vas_planning_checkout.domain.n
    @Y61.k
    public final VasPlanCheckoutContent.c a(@Y61.k bM0.e eVar) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("header_item_id_");
        J0 j02 = this.f322893a;
        arrayList.add(new VasPlanningHeaderItem(com.avito.android.bxcontent.mvi.entity.f.k(j02, sb2), eVar.getTitle(), eVar.getDescription()));
        bM0.f warning = eVar.getWarning();
        if (warning != null) {
            String strK = com.avito.android.bxcontent.mvi.entity.f.k(j02, new StringBuilder("warning_item_id_"));
            Action action = warning.getAction();
            VasPlanningResultWarningItem.Action action2 = action != null ? new VasPlanningResultWarningItem.Action(action.getTitle(), action.getUri()) : null;
            String attention = warning.getAttention();
            List<Balance> listC = warning.c();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listC, 10));
            for (Balance balance : listC) {
                arrayList2.add(new VasPlanningResultWarningItem.Balance(balance.getAmount(), balance.getText()));
            }
            arrayList.add(new VasPlanningResultWarningItem(strK, action2, attention, arrayList2, warning.getTitle()));
        }
        return new VasPlanCheckoutContent.c(arrayList, eVar.getAction(), eVar.c());
    }
}
