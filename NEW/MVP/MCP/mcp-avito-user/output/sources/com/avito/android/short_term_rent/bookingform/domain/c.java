package com.avito.android.short_term_rent.bookingform.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CreateBookingRequestUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.domain.CreateBookingRequestUseCase", f = "CreateBookingRequestUseCase.kt", i = {1, 1, 1, 1}, l = {137, 175, 182, 184, 189, 198}, m = "createBookingRequest", n = {"this", "$this$createBookingRequest", "promoCode", "trackBookingCreated"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f281338q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f281339r;

    /* renamed from: s, reason: collision with root package name */
    public String f281340s;

    /* renamed from: t, reason: collision with root package name */
    public p f281341t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f281342u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f281343v;

    /* renamed from: w, reason: collision with root package name */
    public int f281344w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f281343v = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f281342u = obj;
        this.f281344w |= BeduinInputModel.MIN_TEXT_VERSION;
        return b.a(this.f281343v, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, false, this);
    }
}
