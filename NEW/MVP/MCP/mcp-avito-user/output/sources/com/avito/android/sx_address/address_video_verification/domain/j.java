package com.avito.android.sx_address.address_video_verification.domain;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import zZ.InterfaceC50529c;

/* compiled from: SxAddressVideoVerificationInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LzZ/c;", "uploadState", "Lkotlin/G0;", "invoke", "(LzZ/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class j extends N implements Y41.l<InterfaceC50529c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z1<Float> f292645l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Z1<Float> z12) {
        super(1);
        this.f292645l = z12;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC50529c interfaceC50529c) {
        Z1<Float> z12;
        Float value;
        InterfaceC50529c interfaceC50529c2 = interfaceC50529c;
        if (interfaceC50529c2 instanceof InterfaceC50529c.C12957c) {
            do {
                z12 = this.f292645l;
                value = z12.getValue();
                value.floatValue();
            } while (!z12.N3(value, Float.valueOf(((InterfaceC50529c.C12957c) interfaceC50529c2).f444073a)));
        }
        return G0.f406611a;
    }
}
