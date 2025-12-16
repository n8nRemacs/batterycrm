package io.ktor.utils.io.jvm.nio;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.InterfaceC41649d1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Reading.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.nio.ReadingKt", f = "Reading.kt", i = {0, 0, 0, 0, 0, 0}, l = {42}, m = "copyTo", n = {"ch", "copied", "eof", "copy", "limit", "needFlush"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "I$0"})
/* loaded from: classes8.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC41649d1 f401159q;

    /* renamed from: r, reason: collision with root package name */
    public l0.g f401160r;

    /* renamed from: s, reason: collision with root package name */
    public l0.a f401161s;

    /* renamed from: t, reason: collision with root package name */
    public l f401162t;

    /* renamed from: u, reason: collision with root package name */
    public int f401163u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f401164v;

    /* renamed from: w, reason: collision with root package name */
    public int f401165w;

    public a() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        this.f401164v = obj;
        this.f401165w = (this.f401165w | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f401165w;
        if (i12 == 0) {
            C42729a0.b(obj);
            new b(new l0.g(), new l0.a());
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i13 = this.f401163u;
        l lVar = this.f401162t;
        l0.a aVar = this.f401161s;
        l0.g gVar = this.f401160r;
        InterfaceC41649d1 interfaceC41649d1 = this.f401159q;
        C42729a0.b(obj);
        do {
            if (i13 != 0) {
                interfaceC41649d1.flush();
            }
            long j12 = gVar.f406841b;
            if (j12 >= 0 || aVar.f406838b) {
                return Boxing.boxLong(j12);
            }
            this.f401159q = interfaceC41649d1;
            this.f401160r = gVar;
            this.f401161s = aVar;
            this.f401162t = lVar;
            this.f401163u = i13;
            this.f401165w = 1;
        } while (interfaceC41649d1.G(1, lVar, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
