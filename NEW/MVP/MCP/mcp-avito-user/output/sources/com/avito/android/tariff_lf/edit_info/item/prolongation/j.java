package com.avito.android.tariff_lf.edit_info.item.prolongation;

import Y61.l;
import android.os.Bundle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TariffProlongationPayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/prolongation/j;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "a", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements com.avito.android.recycler.data_aware.a {

    /* compiled from: TariffProlongationPayloadCreator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/prolongation/j$a;", "", "<init>", "()V", "", "PAYLOAD", "Ljava/lang/String;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public j() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        Bundle bundle = new Bundle();
        if ((aVar2 instanceof com.avito.android.tariff_lf.edit_info.item.prolongation.a) && (aVar instanceof com.avito.android.tariff_lf.edit_info.item.prolongation.a)) {
            com.avito.android.tariff_lf.edit_info.item.prolongation.a aVar3 = (com.avito.android.tariff_lf.edit_info.item.prolongation.a) aVar2;
            boolean z12 = aVar3.f299039f;
            com.avito.android.tariff_lf.edit_info.item.prolongation.a aVar4 = (com.avito.android.tariff_lf.edit_info.item.prolongation.a) aVar;
            Boolean boolValueOf = z12 != aVar4.f299039f ? Boolean.valueOf(z12) : null;
            boolean z13 = aVar3.f299040g;
            bundle.putParcelable("payload", new TariffProlongationPayload(z13 != aVar4.f299040g ? Boolean.valueOf(z13) : null, boolValueOf));
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }
}
