package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.C41628a;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0}, l = {519, 520}, m = "readFullySuspend", n = {"this", "dst", "n"}, s = {"L$0", "L$1", "I$0"})
/* renamed from: io.ktor.utils.io.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41689r0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f401271q;

    /* renamed from: r, reason: collision with root package name */
    public C41628a f401272r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f401273s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f401274t;

    /* renamed from: u, reason: collision with root package name */
    public int f401275u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41689r0(AbstractC41660h0 abstractC41660h0, Continuation<? super C41689r0> continuation) {
        super(continuation);
        this.f401274t = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401273s = obj;
        this.f401275u |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicLongFieldUpdater atomicLongFieldUpdater = AbstractC41660h0.f400973h;
        return this.f401274t.d0(null, this);
    }
}
