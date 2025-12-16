package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper;

import Ov.C14739b;
import Ov.C14740c;
import Ov.p;
import android.content.Context;
import com.avito.android.R;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CustomTariffsItemMapper.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/mapper/f;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/mapper/e;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Sv.h
/* loaded from: classes12.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f135686a;

    @Inject
    public f(@Y61.k Context context) {
        this.f135686a = context;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper.e
    @Y61.l
    public final com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d a(@Y61.k p pVar) {
        Context context;
        List<C14739b> list = pVar.f12706c;
        com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.onboarding.c cVar = null;
        boolean z12 = pVar.f12707d;
        if (!z12 && list.isEmpty()) {
            return null;
        }
        List<C14739b> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            context = this.f135686a;
            if (!zHasNext) {
                break;
            }
            C14739b c14739b = (C14739b) it.next();
            arrayList.add(new com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.c(String.valueOf(c14739b.f12676i), c14739b.f12676i, c14739b.f12669b.k0(context), c14739b.f12670c, c14739b.f12673f && z12, false, 32, null));
        }
        String string = context.getString(R.string.custom_tariffs_title);
        String string2 = arrayList.isEmpty() ? context.getString(R.string.custom_tariffs_description) : null;
        C14740c c14740c = pVar.f12708e;
        if (c14740c != null) {
            cVar = new com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.onboarding.c("onboarding-card-" + c14740c.f12677a.getText(), c14740c);
        }
        return new com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.d("seller-custom-tariffs", C42745f0.h0(arrayList, C42745f0.V(cVar)), string, null, string2, pVar.f12707d, false, 64, null);
    }
}
