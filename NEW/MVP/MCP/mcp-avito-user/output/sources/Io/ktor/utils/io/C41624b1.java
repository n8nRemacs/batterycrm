package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.EOFException;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteReadChannel.kt */
@kotlin.jvm.internal.s0
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelKt", f = "ByteReadChannel.kt", i = {0}, l = {232}, m = "discardExact", n = {"n"}, s = {"J$0"})
/* renamed from: io.ktor.utils.io.b1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41624b1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f400850q;

    /* renamed from: r, reason: collision with root package name */
    public int f400851r;

    public C41624b1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws EOFException {
        this.f400850q = obj;
        this.f400851r = (this.f400851r | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f400851r;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f400851r = 1;
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        if (((Number) obj).longValue() == 0) {
            return kotlin.G0.f406611a;
        }
        throw new EOFException("Unable to discard 0 bytes");
    }
}
