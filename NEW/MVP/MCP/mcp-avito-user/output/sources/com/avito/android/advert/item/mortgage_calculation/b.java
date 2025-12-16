package com.avito.android.advert.item.mortgage_calculation;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import c6.InterfaceC26946a;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert_core.advert.b;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.mortgage.deeplink.MortgageLandingLink;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import l41.r;

/* compiled from: MortgageCalculationPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/mortgage_calculation/b;", "Lcom/avito/android/advert/item/mortgage_calculation/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.advert.item.mortgage_calculation.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f77647a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC26946a f77648b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28265d f77649c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage_calculator.data.b f77650d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public y f77651e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Z0 f77652f;

    /* compiled from: MortgageCalculationPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f77653b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((ContactBar.Button.Target) obj).f125081i == ContactBar.Button.Target.Type.f125092i;
        }
    }

    /* compiled from: MortgageCalculationPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.mortgage_calculation.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C2293b extends H implements Y41.l<Throwable, G0> {
        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            ((V2) this.receiver).f(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageCalculationPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<ContactBar.Button.Target, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ContactBar.Button.Target target) {
            ContactBar.Button.Target target2 = target;
            DeepLink deepLinkA = target2.f125076d;
            boolean z12 = deepLinkA instanceof NoMatchLink;
            b bVar = b.this;
            if (z12 && (deepLinkA = bVar.f77650d.c(bVar.f77647a)) == null) {
                deepLinkA = new NoMatchLink();
            }
            if (deepLinkA instanceof MortgageLandingLink) {
                deepLinkA = MortgageLandingLink.a((MortgageLandingLink) deepLinkA, null, null, null, null, null, null, bVar.f77647a, "avito_item_main", null, null, null, 16728063);
            }
            Z0 z02 = bVar.f77652f;
            if (z02 != null) {
                b.a.a(z02, deepLinkA, null, 6);
            }
            bVar.f77648b.C(target2.f125074b);
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k @InterfaceC30174s String str, @k InterfaceC26946a interfaceC26946a, @k InterfaceC28265d interfaceC28265d, @k com.avito.android.mortgage_calculator.data.b bVar) {
        this.f77647a = str;
        this.f77648b = interfaceC26946a;
        this.f77649c = interfaceC28265d;
        this.f77650d = bVar;
    }

    @Override // com.avito.android.advert.item.mortgage_calculation.a
    public final void a() {
        y yVar = this.f77651e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f77651e = null;
    }

    @Override // com.avito.android.advert.item.mortgage_calculation.a
    public final void b() {
        y yVar = this.f77651e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f77651e = A1.h(this.f77649c.getF83157A().N(a.f77653b), new C2293b(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new c(), 2);
    }

    @Override // com.avito.android.advert.item.mortgage_calculation.a
    public final void c0() {
        this.f77652f = null;
    }

    @Override // com.avito.android.advert.item.mortgage_calculation.a
    public final void j0(@k Z0 z02) {
        this.f77652f = z02;
    }
}
