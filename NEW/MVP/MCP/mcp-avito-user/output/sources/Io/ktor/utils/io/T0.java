package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequentialJVM.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialJVM", f = "ByteChannelSequentialJVM.kt", i = {0, 0}, l = {54}, m = "writeFullySuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class T0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public N0 f400762q;

    /* renamed from: r, reason: collision with root package name */
    public ByteBuffer f400763r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400764s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N0 f400765t;

    /* renamed from: u, reason: collision with root package name */
    public int f400766u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(N0 n02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400765t = n02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400764s = obj;
        this.f400766u |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = N0.f400700m;
        return this.f400765t.z0(null, this);
    }
}
