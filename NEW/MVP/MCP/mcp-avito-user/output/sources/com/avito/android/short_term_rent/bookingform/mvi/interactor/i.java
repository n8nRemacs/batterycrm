package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import aw0.C24186b;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.short_term_rent.bookingform.BookingFormOpenParams;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import iw0.InterfaceC42121a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: BookingFormApiInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/i;", "Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/d;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BookingFormOpenParams f281903a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.bookingform.domain.g f281904b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Gson f281905c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42121a f281906d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final m f281907e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f281908f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a f281909g;

    @Inject
    public i(@Y61.k BookingFormOpenParams bookingFormOpenParams, @Y61.k com.avito.android.short_term_rent.bookingform.domain.g gVar, @Y61.k Gson gson, @Y61.k InterfaceC42121a interfaceC42121a, @Y61.k m mVar, @Y61.k R0 r02, @Y61.k a aVar) {
        this.f281903a = bookingFormOpenParams;
        this.f281904b = gVar;
        this.f281905c = gson;
        this.f281906d = interfaceC42121a;
        this.f281907e = mVar;
        this.f281908f = r02;
        this.f281909g = aVar;
    }

    public static final BookingFormInternalAction c(i iVar, boolean z12, PrintableText printableText, ApiError apiError) {
        iVar.getClass();
        return z12 ? new BookingFormInternalAction.ShowErrorInSnackbar(printableText, apiError) : new BookingFormInternalAction.ContentError(apiError);
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.d
    @Y61.k
    public final X a(@Y61.k C24186b c24186b) {
        InterfaceC43160i interfaceC43160iG = C43175k.G(new h(c24186b, this, false, true, null));
        R0 r02 = this.f281908f;
        return new X(new C43137a0(new f(2, null), C43175k.I(r02.a(), C43175k.I(r02.a(), interfaceC43160iG))), new g(3, null));
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.d
    @Y61.k
    public final C43137a0 b(@Y61.k C24186b c24186b) {
        InterfaceC43160i interfaceC43160iG = C43175k.G(new h(c24186b, this, true, false, null));
        R0 r02 = this.f281908f;
        return new C43137a0(new e(2, null), C43175k.I(r02.a(), C43175k.I(r02.a(), interfaceC43160iG)));
    }
}
