package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.C41628a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0}, l = {486}, m = "readAvailable$ktor_io", n = {"this", "dst"}, s = {"L$0", "L$1"})
/* renamed from: io.ktor.utils.io.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41672l0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f401192q;

    /* renamed from: r, reason: collision with root package name */
    public C41628a f401193r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f401194s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f401195t;

    /* renamed from: u, reason: collision with root package name */
    public int f401196u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41672l0(AbstractC41660h0 abstractC41660h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401195t = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401194s = obj;
        this.f401196u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f401195t.Y(null, this);
    }
}
