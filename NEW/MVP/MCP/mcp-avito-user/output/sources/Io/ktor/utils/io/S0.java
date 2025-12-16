package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequentialJVM.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialJVM", f = "ByteChannelSequentialJVM.kt", i = {0, 0, 0}, l = {234}, m = "write", n = {"this", "block", "min"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes8.dex */
final class S0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public N0 f400751q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.l f400752r;

    /* renamed from: s, reason: collision with root package name */
    public int f400753s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f400754t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ N0 f400755u;

    /* renamed from: v, reason: collision with root package name */
    public int f400756v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(N0 n02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400755u = n02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400754t = obj;
        this.f400756v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f400755u.G(0, null, this);
    }
}
