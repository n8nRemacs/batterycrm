package com.vk.push.core.ipc;

import android.os.IInterface;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseIPCClient.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/os/IInterface;", "T", "Lcom/vk/push/core/ipc/p;", "Lkotlin/G0;", "invoke", "()Lcom/vk/push/core/ipc/p;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
/* loaded from: classes7.dex */
final class f extends N implements Y41.a<p<G0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b<IInterface> f367053l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b<IInterface> bVar) {
        super(0);
        this.f367053l = bVar;
    }

    @Override // Y41.a
    public final p<G0> invoke() {
        b<IInterface> bVar = this.f367053l;
        return new p<>(null, new d(bVar), new e(bVar), 1, null);
    }
}
