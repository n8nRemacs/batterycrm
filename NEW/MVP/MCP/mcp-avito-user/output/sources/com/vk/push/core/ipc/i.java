package com.vk.push.core.ipc;

import android.os.IInterface;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseIPCClient.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/IInterface;", "T", "Lcom/vk/push/core/ipc/q;", "request", "Lkotlin/G0;", "invoke", "(Lcom/vk/push/core/ipc/q;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
/* loaded from: classes7.dex */
final class i extends N implements Y41.l<q<IInterface, ?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b<IInterface> f367058l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b<IInterface> bVar) {
        super(1);
        this.f367058l = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<IInterface, ?> qVar) {
        q<IInterface, ?> qVar2 = qVar;
        this.f367058l.i().info("Notify caller about failed request due to binding death");
        com.vk.push.core.utils.d.a(qVar2.f367086b, qVar2.f367085a.invoke(new BindingDiedException()));
        return G0.f406611a;
    }
}
