package com.avito.android.advert.item.compatibility.v3;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.spare_parts.data.CarCompatibility;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GarageCompatibilityV3Analytics.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/f;", "Lcom/avito/android/advert/item/compatibility/v3/e;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f74408a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f74409b;

    /* compiled from: GarageCompatibilityV3Analytics.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/f$a;", "", "<init>", "()V", "", "NULL_INT_PLACEHOLDER", "I", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public f(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k @InterfaceC30174s String str) {
        this.f74408a = interfaceC28373a;
        this.f74409b = str;
    }

    @Override // com.avito.android.advert.item.compatibility.v3.e
    public final void a(@Y61.l String str, @Y61.l String str2, @Y61.l CarCompatibility.Car.Status status, @Y61.l String str3, @Y61.l String str4, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, boolean z12) {
        String str5 = str == null ? "" : str;
        String str6 = str2 == null ? "" : str2;
        String str7 = status != null ? status.f80422b : null;
        this.f74408a.c(new p(this.f74409b, str5, str6, str7 == null ? "" : str7, str3 == null ? "" : str3, str4 == null ? "" : str4, num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1, num3 != null ? num3.intValue() : -1, num4 != null ? num4.intValue() : -1, z12));
    }

    @Override // com.avito.android.advert.item.compatibility.v3.e
    public final void b() {
        this.f74408a.c(new o(this.f74409b));
    }

    @Override // com.avito.android.advert.item.compatibility.v3.e
    public final void c(@Y61.k String str) {
        this.f74408a.c(new j(this.f74409b, str));
    }
}
