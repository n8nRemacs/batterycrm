package com.avito.avcalls.signaling.transport.external;

import com.avito.avcalls.signaling.SignalingException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.r;

/* compiled from: ExternalMessageSender.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f333395l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Exception f333396m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, Exception exc) {
        super(0);
        this.f333395l = rVar;
        this.f333396m = exc;
    }

    @Override // Y41.a
    public final G0 invoke() {
        int i12 = Z.f406624c;
        this.f333395l.resumeWith(new Z.b(new SignalingException.ExternalTransportException(this.f333396m)));
        return G0.f406611a;
    }
}
