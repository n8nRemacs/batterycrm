package com.avito.android.phone_confirmation;

import com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import javax.inject.Inject;
import kotlin.Metadata;
import s70.InterfaceC48008b;

/* compiled from: PhoneConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_confirmation/X;", "Lcom/avito/android/phone_confirmation/a;", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class X extends AbstractC33145a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.r f215888d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f215889e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48008b f215890f;

    @Inject
    public X(@Y61.k com.avito.android.remote.r rVar, @Y61.k com.avito.android.server_time.f fVar, @Y61.k InterfaceC48008b interfaceC48008b, @Y61.k PhoneConfirmationScreenState phoneConfirmationScreenState, @N3.c @Y61.k InterfaceC35945t1<String> interfaceC35945t1) {
        super(fVar, interfaceC48008b, phoneConfirmationScreenState, interfaceC35945t1);
        this.f215888d = rVar;
        this.f215889e = fVar;
        this.f215890f = interfaceC48008b;
    }

    @Override // com.avito.android.phone_confirmation.U
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.O b(@Y61.k String str, boolean z12) {
        return this.f215888d.d(str, z12, true).d0(new V(this, str)).K(new W(this));
    }

    @Override // com.avito.android.phone_confirmation.AbstractC33145a, com.avito.android.phone_confirmation.U
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final com.avito.android.server_time.f getF215889e() {
        return this.f215889e;
    }

    @Override // com.avito.android.phone_confirmation.U
    @Y61.k
    public final io.reactivex.rxjava3.core.z<SuccessResult> d(@Y61.k String str, @Y61.k String str2, boolean z12) {
        return this.f215888d.i(str, str2, z12, true);
    }
}
