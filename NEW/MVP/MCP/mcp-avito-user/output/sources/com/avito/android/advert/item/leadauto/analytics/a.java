package com.avito.android.advert.item.leadauto.analytics;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.leadauto.AutoNewCarsLeadFormItem;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutoNewCarsLeadFormFilter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/leadauto/analytics/a;", "LWV0/a;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f77266e;

    /* compiled from: AutoNewCarsLeadFormFilter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/leadauto/analytics/a$a;", "", "<init>", "()V", "", "AUTO_FORM_LEAD_FROM_PAGE", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.leadauto.analytics.a$a, reason: collision with other inner class name */
    public static final class C2279a {
        public /* synthetic */ C2279a(C42822w c42822w) {
            this();
        }

        public C2279a() {
        }
    }

    static {
        new C2279a(null);
    }

    @Inject
    public a(@k com.avito.android.advert_core.analytics.a aVar) {
        super(true, true, 0.0f, 1000L, 4, null);
        this.f77266e = aVar;
    }

    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof AutoNewCarsLeadFormItem;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        if (interfaceC10495b instanceof AutoNewCarsLeadFormItem) {
            this.f77266e.e5(Long.valueOf(((AutoNewCarsLeadFormItem) interfaceC10495b).f77259f));
        }
    }
}
