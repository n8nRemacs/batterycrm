package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0}, l = {530}, m = "readAvailable$suspendImpl", n = {"$this", "dst", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* renamed from: io.ktor.utils.io.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41675m0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f401205q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f401206r;

    /* renamed from: s, reason: collision with root package name */
    public int f401207s;

    /* renamed from: t, reason: collision with root package name */
    public int f401208t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f401209u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f401210v;

    /* renamed from: w, reason: collision with root package name */
    public int f401211w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41675m0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401210v = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401209u = obj;
        this.f401211w |= BeduinInputModel.MIN_TEXT_VERSION;
        return AbstractC41660h0.Z(this.f401210v, null, 0, 0, this);
    }
}
