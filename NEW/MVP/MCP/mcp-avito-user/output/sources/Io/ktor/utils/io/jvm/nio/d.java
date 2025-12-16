package io.ktor.utils.io.jvm.nio;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.W0;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Writing.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.nio.WritingKt", f = "Writing.kt", i = {0, 0, 0, 0}, l = {50}, m = "copyTo", n = {"$this$copyTo", "copied", "copy", "limit"}, s = {"L$0", "L$1", "L$2", "J$0"})
/* loaded from: classes8.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public W0 f401167q;

    /* renamed from: r, reason: collision with root package name */
    public l0.g f401168r;

    /* renamed from: s, reason: collision with root package name */
    public l f401169s;

    /* renamed from: t, reason: collision with root package name */
    public long f401170t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f401171u;

    /* renamed from: v, reason: collision with root package name */
    public int f401172v;

    public d() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) throws Throwable {
        d dVar;
        this.f401171u = obj;
        int i12 = this.f401172v | BeduinInputModel.MIN_TEXT_VERSION;
        this.f401172v = i12;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f401172v = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            dVar = this;
        } else {
            dVar = new d(this);
        }
        Object obj2 = dVar.f401171u;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = dVar.f401172v;
        if (i13 == 0) {
            C42729a0.b(obj2);
            throw null;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j12 = dVar.f401170t;
        l lVar = dVar.f401169s;
        l0.g gVar = dVar.f401168r;
        W0 w02 = dVar.f401167q;
        C42729a0.b(obj2);
        while (!w02.x() && gVar.f406841b < j12) {
            dVar.f401167q = w02;
            dVar.f401168r = gVar;
            dVar.f401169s = lVar;
            dVar.f401170t = j12;
            dVar.f401172v = 1;
            if (w02.E(0, lVar, dVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Throwable thG = w02.g();
        if (thG == null) {
            return Boxing.boxLong(gVar.f406841b);
        }
        throw thG;
    }
}
