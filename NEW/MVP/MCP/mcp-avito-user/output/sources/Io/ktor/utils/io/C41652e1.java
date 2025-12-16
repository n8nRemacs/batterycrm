package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.C41640m;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteWriteChannel.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteWriteChannelKt", f = "ByteWriteChannel.kt", i = {0}, l = {202, 202}, m = "writePacketSuspend", n = {"builder$iv"}, s = {"L$0"})
/* renamed from: io.ktor.utils.io.e1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41652e1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41640m f400944q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400945r;

    /* renamed from: s, reason: collision with root package name */
    public int f400946s;

    public C41652e1() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [int, io.ktor.utils.io.core.E] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400945r = obj;
        this.f400946s = (this.f400946s | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r02 = this.f400946s;
        try {
            if (r02 == 0) {
                C42729a0.b(obj);
                this.f400944q = new C41640m(null, 1, null);
                this.f400946s = 1;
                throw null;
            }
            if (r02 != 1) {
                if (r02 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            C41640m c41640m = this.f400944q;
            C42729a0.b(obj);
            c41640m.y();
            this.f400944q = null;
            this.f400946s = 2;
            throw null;
        } catch (Throwable th2) {
            r02.close();
            throw th2;
        }
    }
}
