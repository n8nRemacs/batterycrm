package com.vk.push.core.ipc;

import android.os.IInterface;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseIPCClient.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/IInterface;", "T", "Lcom/vk/push/core/ipc/q;", "", "it", "Lkotlin/G0;", "invoke", "(Lcom/vk/push/core/ipc/q;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
/* loaded from: classes7.dex */
final class g extends N implements Y41.l<q<IInterface, ? extends Object>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b<IInterface> f367054l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b<IInterface> bVar) {
        super(1);
        this.f367054l = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<IInterface, ? extends Object> qVar) {
        this.f367054l.f367043k.remove(qVar);
        return G0.f406611a;
    }
}
