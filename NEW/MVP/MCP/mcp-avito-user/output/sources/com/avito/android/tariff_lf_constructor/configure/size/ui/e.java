package com.avito.android.tariff_lf_constructor.configure.size.ui;

import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConfigureSizePayloadCreator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/ui/e;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements com.avito.android.recycler.data_aware.a {

    /* compiled from: ConfigureSizePayloadCreator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/ui/e$a;", "", "<init>", "()V", "", "PAYLOAD_IS_LOADING", "Ljava/lang/String;", "PAYLOAD_IS_SELECTED", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public e() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        Bundle bundle = new Bundle();
        if ((aVar2 instanceof com.avito.android.tariff_lf_constructor.configure.size.items.size.a) && (aVar instanceof com.avito.android.tariff_lf_constructor.configure.size.items.size.a)) {
            com.avito.android.tariff_lf_constructor.configure.size.items.size.a aVar3 = (com.avito.android.tariff_lf_constructor.configure.size.items.size.a) aVar2;
            boolean z12 = aVar3.f300311i;
            com.avito.android.tariff_lf_constructor.configure.size.items.size.a aVar4 = (com.avito.android.tariff_lf_constructor.configure.size.items.size.a) aVar;
            if (z12 != aVar4.f300311i) {
                bundle.putBoolean("selected", z12);
            }
            boolean z13 = aVar3.f300312j;
            if (z13 != aVar4.f300312j) {
                bundle.putBoolean("loading", z13);
            }
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }
}
