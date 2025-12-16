package com.avito.android.services_portfolio.project.seller.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import com.avito.android.services_portfolio.project.seller.mvi.entity.PortfolioProjectSellerInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv0.InterfaceC43503b;

/* compiled from: PortfolioProjectSellerActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lkv0/b;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction;", "Lkv0/d;", "a", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC43503b, PortfolioProjectSellerInternalAction, kv0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.services_portfolio.project.seller.domain.a f280227a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PortfolioProjectArguments.SellerArgs f280228b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f280229c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PortfolioProjectSellerActor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/mvi/a$a;", "", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.services_portfolio.project.seller.mvi.a$a, reason: collision with other inner class name */
    public static final class EnumC8339a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ EnumC8339a[] f280230b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f280231c;

        static {
            EnumC8339a[] enumC8339aArr = {new EnumC8339a("DELETE", 0), new EnumC8339a("EDIT", 1)};
            f280230b = enumC8339aArr;
            f280231c = kotlin.enums.c.a(enumC8339aArr);
        }

        public static EnumC8339a valueOf(String str) {
            return (EnumC8339a) Enum.valueOf(EnumC8339a.class, str);
        }

        public static EnumC8339a[] values() {
            return (EnumC8339a[]) f280230b.clone();
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.services_portfolio.project.seller.domain.a aVar, @Y61.k PortfolioProjectArguments.SellerArgs sellerArgs, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f280227a = aVar;
        this.f280228b = sellerArgs;
        this.f280229c = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PortfolioProjectSellerInternalAction> b(InterfaceC43503b interfaceC43503b, kv0.d dVar) {
        return new C43152f0(C43175k.G(new b(interfaceC43503b, this, null)), new c(3, null));
    }
}
