package com.avito.android.short_term_rent.bookingform.items.select;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FormSelectPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/select/k;", "Lcom/avito/android/short_term_rent/bookingform/items/select/e;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k extends e {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> f281656c;

    /* compiled from: FormSelectPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> f281657l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> lVar) {
            super(1);
            this.f281657l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            this.f281657l.invoke(new a.c(deepLink));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public k(@Y61.k Y41.l<? super com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> lVar) {
        super(new a(lVar));
        this.f281656c = lVar;
    }
}
