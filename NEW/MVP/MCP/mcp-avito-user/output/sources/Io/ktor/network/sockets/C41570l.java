package io.ktor.network.sockets;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: CIOReader.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.CIOReaderKt", f = "CIOReader.kt", i = {0}, l = {133}, m = "readFrom", n = {"count"}, s = {"L$0"})
/* renamed from: io.ktor.network.sockets.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41570l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.f f400252q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400253r;

    /* renamed from: s, reason: collision with root package name */
    public int f400254s;

    public C41570l() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C41570l c41570l;
        this.f400253r = obj;
        int i12 = this.f400254s | BeduinInputModel.MIN_TEXT_VERSION;
        this.f400254s = i12;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f400254s = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            c41570l = this;
        } else {
            c41570l = new C41570l(this);
        }
        Object obj2 = c41570l.f400253r;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c41570l.f400254s;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l0.f fVar = c41570l.f400252q;
            C42729a0.b(obj2);
            return Boxing.boxInt(fVar.f406840b);
        }
        C42729a0.b(obj2);
        l0.f fVar2 = new l0.f();
        new C41571m(fVar2, null);
        c41570l.f400252q = fVar2;
        c41570l.f400254s = 1;
        throw null;
    }
}
