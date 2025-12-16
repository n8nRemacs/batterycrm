package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {819}, m = "peekTo-lBXzO7A", n = {"bytesCopied"}, s = {"L$0"})
/* renamed from: io.ktor.utils.io.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41666j0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.g f401090q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401091r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f401092s;

    /* renamed from: t, reason: collision with root package name */
    public int f401093t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41666j0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401092s = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401091r = obj;
        this.f401093t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f401092s.s(null, 0L, 0L, 0L, this);
    }
}
