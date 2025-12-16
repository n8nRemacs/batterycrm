package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequentialJVM.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialJVM", f = "ByteChannelSequentialJVM.kt", i = {0, 0, 0}, l = {196}, m = "read", n = {"this", "consumer", "min"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes8.dex */
final class P0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public N0 f400719q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.l f400720r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400721s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N0 f400722t;

    /* renamed from: u, reason: collision with root package name */
    public int f400723u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(N0 n02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400722t = n02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400721s = obj;
        this.f400723u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f400722t.E(0, null, this);
    }
}
