package com.vk.push.core.ipc;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BaseIPCClient.kt */
@Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
@DebugMetadata(c = "com.vk.push.core.ipc.BaseIPCClient", f = "BaseIPCClient.kt", i = {0, 0, 1, 1, 1}, l = {156, 178}, m = "makeSimpleRequest", n = {"this", "transformErrorResult", "this", "transformErrorResult", "e"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
final class m<V> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f367075q;

    /* renamed from: r, reason: collision with root package name */
    public int f367076r;

    public m() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f367075q = obj;
        this.f367076r |= BeduinInputModel.MIN_TEXT_VERSION;
        throw null;
    }
}
