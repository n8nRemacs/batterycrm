package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {88}, m = "awaitAtLeastNBytesAvailableForRead$ktor_io", n = {"this", "count"}, s = {"L$0", "I$0"})
/* renamed from: io.ktor.utils.io.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41623b0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f400845q;

    /* renamed from: r, reason: collision with root package name */
    public int f400846r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400847s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f400848t;

    /* renamed from: u, reason: collision with root package name */
    public int f400849u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41623b0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400848t = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400847s = obj;
        this.f400849u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f400848t.O(0, this);
    }
}
