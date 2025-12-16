package com.avito.android.profile.user_profile.cards.service_booking;

import au0.InterfaceC24175a;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActiveServiceBookingsInteractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/c;", "Lcom/avito/android/profile/user_profile/cards/service_booking/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC24175a f225402a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.cards.service_booking.items.a f225403b;

    @Inject
    public c(@Y61.k InterfaceC24175a interfaceC24175a, @Y61.k com.avito.android.profile.user_profile.cards.service_booking.items.a aVar) {
        this.f225402a = interfaceC24175a;
        this.f225403b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.profile.user_profile.cards.service_booking.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.profile.user_profile.cards.service_booking.b
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.profile.user_profile.cards.service_booking.b r0 = (com.avito.android.profile.user_profile.cards.service_booking.b) r0
            int r1 = r0.f225401t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f225401t = r1
            goto L18
        L13:
            com.avito.android.profile.user_profile.cards.service_booking.b r0 = new com.avito.android.profile.user_profile.cards.service_booking.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f225399r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f225401t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.profile.user_profile.cards.service_booking.c r0 = r0.f225398q
            kotlin.C42729a0.b(r5)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C42729a0.b(r5)
            r0.f225398q = r4
            r0.f225401t = r3
            au0.a r5 = r4.f225402a
            r2 = 0
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            r0 = r4
        L45:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r1 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r1 == 0) goto L6f
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            Zt0.a r5 = (Zt0.C19606a) r5
            com.avito.android.profile.user_profile.cards.service_booking.ActiveServiceBookingsDto r1 = new com.avito.android.profile.user_profile.cards.service_booking.ActiveServiceBookingsDto
            com.avito.android.profile.user_profile.cards.service_booking.items.a r0 = r0.f225403b
            java.util.List r2 = r5.d()
            Zt0.c r3 = r5.getAllTransactions()
            java.util.ArrayList r0 = r0.a(r2, r3)
            java.lang.String r2 = r5.getSubtitle()
            java.lang.String r5 = r5.getBadgeTitle()
            r1.<init>(r0, r2, r5)
            return r1
        L6f:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L82
            com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
            com.avito.android.remote.error.ApiError r0 = r5.getError()
            java.lang.Throwable r5 = r5.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r0, r5)
            throw r5
        L82:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.cards.service_booking.c.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
