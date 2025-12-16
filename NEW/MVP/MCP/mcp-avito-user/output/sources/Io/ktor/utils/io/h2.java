package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.ktor.utils.io.core.C41628a;
import java.io.Serializable;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WriterSession.kt */
@kotlin.jvm.internal.s0
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.utils.io.WriterSessionKt", f = "WriterSession.kt", i = {0, 0}, l = {22, AvailableCode.HMS_IS_SPOOF, AvailableCode.HMS_IS_SPOOF}, m = "write", n = {"$this$write", "block"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class h2 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Serializable f400995q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400996r;

    /* renamed from: s, reason: collision with root package name */
    public int f400997s;

    public h2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        InterfaceC41649d1 interfaceC41649d1;
        this.f400996r = obj;
        this.f400997s = (this.f400997s | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f400997s;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f400995q = null;
            this.f400997s = 1;
            obj = j2.c(null, 0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41649d1 = null;
        } else {
            if (i12 != 1) {
                if (i12 == 2) {
                    Integer num = (Integer) this.f400995q;
                    C42729a0.b(obj);
                    return num;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.f400995q;
                C42729a0.b(obj);
                throw th2;
            }
            interfaceC41649d1 = (InterfaceC41649d1) this.f400995q;
            C42729a0.b(obj);
        }
        C41628a c41628aA = (C41628a) obj;
        if (c41628aA == null) {
            C41628a.f400873g.getClass();
            c41628aA = C41628a.C11424a.a();
        }
        try {
            V31.e.a(c41628aA.f400874a);
            Boxing.boxLong(c41628aA.f400876c);
            Boxing.boxLong(c41628aA.f400878e);
            throw null;
        } catch (Throwable th3) {
            this.f400995q = th3;
            this.f400997s = 3;
            if (j2.a(interfaceC41649d1, c41628aA, 0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th3;
        }
    }
}
