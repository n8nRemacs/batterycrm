package com.avito.android.wallet.page.history.mvi.component;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PaymentHistoryActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/component/a;", "Lcom/avito/android/arch/mvi/a;", "LVO0/a;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "LVO0/d;", "a", "b", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<VO0.a, PaymentHistoryInternalAction, VO0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f328001a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet.page.c f328002b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f328003c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentHistoryActor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/component/a$a;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.page.history.mvi.component.a$a, reason: collision with other inner class name */
    public static final class EnumC10172a {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC10172a f328004b;

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC10172a f328005c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ EnumC10172a[] f328006d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f328007e;

        static {
            EnumC10172a enumC10172a = new EnumC10172a("CLICKS", 0);
            f328004b = enumC10172a;
            EnumC10172a enumC10172a2 = new EnumC10172a("DEFAULT", 1);
            f328005c = enumC10172a2;
            EnumC10172a[] enumC10172aArr = {enumC10172a, enumC10172a2};
            f328006d = enumC10172aArr;
            f328007e = kotlin.enums.c.a(enumC10172aArr);
        }

        public EnumC10172a() {
            throw null;
        }

        public static EnumC10172a valueOf(String str) {
            return (EnumC10172a) Enum.valueOf(EnumC10172a.class, str);
        }

        public static EnumC10172a[] values() {
            return (EnumC10172a[]) f328006d.clone();
        }
    }

    /* compiled from: PaymentHistoryActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/component/a$b;", "", "<init>", "()V", "", "CLICKS_THROTTLE_MS", "J", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    @Inject
    public a(@Y61.k m mVar, @Y61.k com.avito.android.wallet.page.c cVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f328001a = mVar;
        this.f328002b = cVar;
        this.f328003c = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new c(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, com.avito.android.wallet.page.history.mvi.component.b.f328008l));
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PaymentHistoryInternalAction> b(VO0.a aVar, VO0.d dVar) {
        return C43175k.G(new d(aVar, this, dVar, null));
    }
}
