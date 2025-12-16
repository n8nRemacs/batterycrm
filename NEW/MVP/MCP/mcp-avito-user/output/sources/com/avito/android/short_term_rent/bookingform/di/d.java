package com.avito.android.short_term_rent.bookingform.di;

import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BookingFormModule.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "buttonName", "planId", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.p<String, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> f281241l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Y41.l<? super com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> lVar) {
        super(2);
        this.f281241l = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(String str, String str2) {
        this.f281241l.invoke(new a.n(str, str2));
        return G0.f406611a;
    }
}
