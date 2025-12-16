package com.vk.push.core.ipc;

import android.os.IInterface;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BaseIPCClient.kt */
@Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
@DebugMetadata(c = "com.vk.push.core.ipc.BaseIPCClient", f = "BaseIPCClient.kt", i = {0, 0, 1, 1, 1}, l = {195, JfifUtil.MARKER_SOS}, m = "makeAsyncRequest", n = {"this", "transformErrorResult", "this", "transformErrorResult", "e"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
final class k<V> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f367061q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.l f367062r;

    /* renamed from: s, reason: collision with root package name */
    public NoHostsToBindException f367063s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f367064t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b<IInterface> f367065u;

    /* renamed from: v, reason: collision with root package name */
    public int f367066v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f367065u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f367064t = obj;
        this.f367066v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f367065u.j(null, null, null, null, null, 0L, this);
    }
}
