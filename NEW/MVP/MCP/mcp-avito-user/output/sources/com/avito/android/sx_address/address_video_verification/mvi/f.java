package com.avito.android.sx_address.address_video_verification.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.SxAddressVideoVerificationParams;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;
import zA0.InterfaceC50429b;

/* compiled from: SxAddressVideoVerificationBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "LBA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.b<BA0.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SxAddressVideoVerificationParams f292705a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.address_video_verification.domain.d f292706b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50429b f292707c;

    @Inject
    public f(@Y61.k SxAddressVideoVerificationParams sxAddressVideoVerificationParams, @Y61.k com.avito.android.sx_address.address_video_verification.domain.d dVar, @Y61.k InterfaceC50429b interfaceC50429b) {
        this.f292705a = sxAddressVideoVerificationParams;
        this.f292706b = dVar;
        this.f292707c = interfaceC50429b;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<BA0.b> a() {
        SxAddressVideoVerificationParams sxAddressVideoVerificationParams = this.f292705a;
        this.f292707c.c(sxAddressVideoVerificationParams.f292545b, sxAddressVideoVerificationParams.f292546c, sxAddressVideoVerificationParams.f292547d);
        return this.f292706b.d(sxAddressVideoVerificationParams.f292545b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
