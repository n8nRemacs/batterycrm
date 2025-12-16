package com.avito.android.tariff.cpa.configure_advance.ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConfigureAdvanceDiffUtilCallback.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/ui/b;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends C23424o.f<TV0.a> {

    /* compiled from: ConfigureAdvanceDiffUtilCallback.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/ui/b$a;", "", "<init>", "()V", "", "PAYLOAD_IS_VALID_VALUE", "Ljava/lang/String;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        return aVar.getId() == aVar2.getId();
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        Bundle bundle = new Bundle();
        if ((aVar4 instanceof com.avito.android.tariff.cpa.configure_advance.items.advance_info.a) && (aVar3 instanceof com.avito.android.tariff.cpa.configure_advance.items.advance_info.a)) {
            boolean z12 = ((com.avito.android.tariff.cpa.configure_advance.items.advance_info.a) aVar3).f294323f;
            boolean z13 = ((com.avito.android.tariff.cpa.configure_advance.items.advance_info.a) aVar4).f294323f;
            if (z13 != z12) {
                bundle.putBoolean("isValidValue", z13);
            }
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }
}
