package io.ktor.client.plugins.logging;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.S;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: LoggingUtils.kt */
@s0
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.client.plugins.logging.LoggingUtilsKt", f = "LoggingUtils.kt", i = {0}, l = {50}, m = "tryReadText", n = {"charset"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class v extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f399561q;

    /* renamed from: r, reason: collision with root package name */
    public int f399562r;

    public v() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f399561q = obj;
        this.f399562r = (this.f399562r | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399562r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f399562r = 1;
                throw null;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            S.c((io.ktor.utils.io.core.x) obj, null);
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
