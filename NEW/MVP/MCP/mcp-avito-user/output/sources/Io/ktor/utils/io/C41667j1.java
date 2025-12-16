package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChannelLittleEndian.kt */
@kotlin.jvm.internal.s0
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.utils.io.ChannelLittleEndianKt", f = "ChannelLittleEndian.kt", i = {}, l = {43}, m = "readDoubleLittleEndian", n = {}, s = {})
/* renamed from: io.ktor.utils.io.j1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41667j1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f401094q;

    /* renamed from: r, reason: collision with root package name */
    public int f401095r;

    public C41667j1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C41667j1 c41667j1;
        this.f401094q = obj;
        int i12 = this.f401095r | BeduinInputModel.MIN_TEXT_VERSION;
        this.f401095r = i12;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f401095r = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            c41667j1 = this;
        } else {
            c41667j1 = new C41667j1(this);
        }
        Object obj2 = c41667j1.f401094q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c41667j1.f401095r;
        if (i13 == 0) {
            C42729a0.b(obj2);
            c41667j1.f401095r = 1;
            throw null;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj2);
        return Boxing.boxDouble(Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(((Number) obj2).doubleValue()))));
    }
}
