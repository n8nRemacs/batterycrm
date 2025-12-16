package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0}, l = {544, 548}, m = "readFully$suspendImpl", n = {"$this", "dst", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* renamed from: io.ktor.utils.io.q0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41687q0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f401261q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f401262r;

    /* renamed from: s, reason: collision with root package name */
    public int f401263s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f401264t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f401265u;

    /* renamed from: v, reason: collision with root package name */
    public int f401266v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41687q0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401265u = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401264t = obj;
        this.f401266v |= BeduinInputModel.MIN_TEXT_VERSION;
        return AbstractC41660h0.c0(this.f401265u, null, 0, this);
    }
}
