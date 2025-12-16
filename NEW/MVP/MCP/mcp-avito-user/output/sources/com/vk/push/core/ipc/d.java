package com.vk.push.core.ipc;

import android.os.IInterface;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseIPCClient.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/IInterface;", "T", "Lkotlin/G0;", "it", "", "invoke", "(Lkotlin/G0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
/* loaded from: classes7.dex */
final class d extends N implements Y41.l<G0, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b<IInterface> f367051l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b<IInterface> bVar) {
        super(1);
        this.f367051l = bVar;
    }

    @Override // Y41.l
    public final Boolean invoke(G0 g02) {
        return Boolean.valueOf(this.f367051l.f367043k.isEmpty());
    }
}
