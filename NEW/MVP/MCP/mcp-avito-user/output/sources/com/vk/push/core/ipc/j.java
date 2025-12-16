package com.vk.push.core.ipc;

import android.os.IInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseIPCClient.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/IInterface;", "T", "LT11/f;", "invoke", "()LT11/f;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
/* loaded from: classes7.dex */
final class j extends N implements Y41.a<T11.f> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T11.f f367059l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b<IInterface> f367060m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(T11.f fVar, b<IInterface> bVar) {
        super(0);
        this.f367059l = fVar;
        this.f367060m = bVar;
    }

    @Override // Y41.a
    public final T11.f invoke() {
        return this.f367059l.b(this.f367060m.h());
    }
}
