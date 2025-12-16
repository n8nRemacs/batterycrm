package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0}, l = {731}, m = "readUTF8Line$suspendImpl", n = {"builder"}, s = {"L$0"})
/* renamed from: io.ktor.utils.io.z0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41713z0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public StringBuilder f401376q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401377r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f401378s;

    /* renamed from: t, reason: collision with root package name */
    public int f401379t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41713z0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401378s = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401377r = obj;
        this.f401379t |= BeduinInputModel.MIN_TEXT_VERSION;
        return AbstractC41660h0.l0(this.f401378s, 0, this);
    }
}
