package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.C41661h1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChannelLittleEndian.kt */
@kotlin.jvm.internal.s0
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.utils.io.ChannelLittleEndianKt", f = "ChannelLittleEndian.kt", i = {0}, l = {19}, m = "readFloat", n = {"byteOrder"}, s = {"L$0"})
/* renamed from: io.ktor.utils.io.k1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41670k1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f401185q;

    /* renamed from: r, reason: collision with root package name */
    public int f401186r;

    public C41670k1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401185q = obj;
        this.f401186r = (this.f401186r | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f401186r;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f401186r = 1;
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        int i13 = C41661h1.a.f400994a;
        throw null;
    }
}
