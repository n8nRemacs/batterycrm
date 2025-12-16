package com.avito.android.tariff_lf_constructor.configure.deeplink;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConstructorTariffBottomSheetLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/deeplink/ConstructorTariffBottomSheetLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "a", "_avito_tariff-lf-constructor_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ConstructorTariffBottomSheetLink extends DeepLink {

    /* compiled from: ConstructorTariffBottomSheetLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/deeplink/ConstructorTariffBottomSheetLink$a;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/tariff_lf_constructor/configure/deeplink/ConstructorTariffBottomSheetLink$a$a;", "Lcom/avito/android/tariff_lf_constructor/configure/deeplink/ConstructorTariffBottomSheetLink$a$b;", "_avito_tariff-lf-constructor_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a implements InterfaceC14249c.b {

        /* compiled from: ConstructorTariffBottomSheetLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/deeplink/ConstructorTariffBottomSheetLink$a$a;", "Lcom/avito/android/tariff_lf_constructor/configure/deeplink/ConstructorTariffBottomSheetLink$a;", "LJu/a$a;", "<init>", "()V", "_avito_tariff-lf-constructor_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff_lf_constructor.configure.deeplink.ConstructorTariffBottomSheetLink$a$a, reason: collision with other inner class name */
        public static final class C9163a extends a implements InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C9163a f299610b = new C9163a();

            public C9163a() {
                super(null);
            }
        }

        /* compiled from: ConstructorTariffBottomSheetLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/deeplink/ConstructorTariffBottomSheetLink$a$b;", "Lcom/avito/android/tariff_lf_constructor/configure/deeplink/ConstructorTariffBottomSheetLink$a;", "LJu/a$b;", "_avito_tariff-lf-constructor_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f299611b;

            public b(@l String str) {
                super(null);
                this.f299611b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f299611b, ((b) obj).f299611b);
            }

            public final int hashCode() {
                String str = this.f299611b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Success(context="), this.f299611b, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }
}
