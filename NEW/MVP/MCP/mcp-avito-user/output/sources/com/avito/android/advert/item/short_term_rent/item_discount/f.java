package com.avito.android.advert.item.short_term_rent.item_discount;

import Ju.C14248b;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.short_term_rent.item_discount.c;
import com.avito.android.deep_linking.x;
import com.avito.android.di.module.InterfaceC30174s;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import l41.r;

/* compiled from: AdvertDetailsShortTermRentItemDiscountPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/item_discount/f;", "Lcom/avito/android/advert/item/short_term_rent/item_discount/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements com.avito.android.advert.item.short_term_rent.item_discount.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f80045b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x f80046c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f80047d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c.a f80048e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f80049f = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: g, reason: collision with root package name */
    @l
    public i f80050g;

    /* compiled from: AdvertDetailsShortTermRentItemDiscountPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f80051b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return L.f(((C43501a) obj).f413260a.f134521b, "key_advert_details_str_item_discount");
        }
    }

    /* compiled from: AdvertDetailsShortTermRentItemDiscountPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f80052b = new b<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C43501a) obj).f413261b instanceof C14248b;
        }
    }

    /* compiled from: AdvertDetailsShortTermRentItemDiscountPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            i iVar = f.this.f80050g;
            if (iVar != null) {
                iVar.hide();
            }
        }
    }

    @Inject
    public f(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k x xVar, @k @InterfaceC30174s String str, @k c.a aVar2) {
        this.f80045b = aVar;
        this.f80046c = xVar;
        this.f80047d = str;
        this.f80048e = aVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        this.f80050g = iVar;
        iVar.f10(((AdvertDetailsShortTermRentItemDiscountItem) aVar).f80035d, new d(this), new e(this));
    }

    @Override // com.avito.android.advert.item.short_term_rent.item_discount.c
    public final void i() {
        this.f80049f.b(this.f80045b.V9().N(a.f80051b).N(b.f80052b).t0(new c()));
    }

    @Override // com.avito.android.advert.item.short_term_rent.item_discount.c
    public final void t() {
        this.f80049f.e();
        this.f80050g = null;
    }
}
