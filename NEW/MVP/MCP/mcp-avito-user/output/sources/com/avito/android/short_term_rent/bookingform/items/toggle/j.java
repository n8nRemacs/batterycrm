package com.avito.android.short_term_rent.bookingform.items.toggle;

import Y41.r;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToggleOptionsPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/toggle/j;", "Lcom/avito/android/short_term_rent/bookingform/items/toggle/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> f281717c;

    /* compiled from: ToggleOptionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "parameterId", "selectedOptionParameterId", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$r$a;", "value", "", "needFormReload", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$r$a;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements r<String, String, a.r.InterfaceC8403a, Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> f281718l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> lVar) {
            super(4);
            this.f281718l = lVar;
        }

        @Override // Y41.r
        public final G0 invoke(String str, String str2, a.r.InterfaceC8403a interfaceC8403a, Boolean bool) {
            this.f281718l.invoke(new a.r(str, str2, interfaceC8403a, bool.booleanValue()));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k Y41.l<? super com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> lVar) {
        super(new a(lVar));
        this.f281717c = lVar;
    }
}
