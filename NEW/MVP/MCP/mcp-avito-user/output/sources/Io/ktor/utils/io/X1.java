package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReadSession.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ReadSessionKt", f = "ReadSession.kt", i = {0}, l = {125}, m = "requestBufferSuspend", n = {"$this$requestBufferSuspend"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class X1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b2 f400811q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400812r;

    /* renamed from: s, reason: collision with root package name */
    public int f400813s;

    public X1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400812r = obj;
        this.f400813s |= BeduinInputModel.MIN_TEXT_VERSION;
        return Y1.d(null, 0, this);
    }
}
