package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Delimited.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.DelimitedKt", f = "Delimited.kt", i = {0, 0, 0}, l = {81, 113}, m = "readUntilDelimiterSuspend", n = {"$this$readUntilDelimiterSuspend", "dst", "endFound"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes8.dex */
final class B1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f400566q;

    /* renamed from: r, reason: collision with root package name */
    public int f400567r;

    public B1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        int iIntValue;
        this.f400566q = obj;
        this.f400567r = (this.f400567r | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f400567r;
        if (i12 == 0) {
            C42729a0.b(obj);
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 == 1) {
            C42729a0.b(obj);
            iIntValue = ((Number) obj).intValue();
            if (iIntValue > 0 || iIntValue == 0) {
                throw null;
            }
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            int iIntValue2 = ((Number) obj).intValue();
            if (iIntValue2 < 0) {
                iIntValue2 = 0;
            }
            iIntValue = 0 + iIntValue2;
        }
        return Boxing.boxInt(iIntValue);
    }
}
