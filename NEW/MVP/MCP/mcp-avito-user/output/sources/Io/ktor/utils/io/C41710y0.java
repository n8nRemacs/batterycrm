package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {704}, m = "readSuspendableSession$suspendImpl", n = {"$this"}, s = {"L$0"})
/* renamed from: io.ktor.utils.io.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41710y0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f401362q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401363r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f401364s;

    /* renamed from: t, reason: collision with root package name */
    public int f401365t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41710y0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401364s = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401363r = obj;
        this.f401365t |= BeduinInputModel.MIN_TEXT_VERSION;
        return AbstractC41660h0.k0(this.f401364s, null, this);
    }
}
