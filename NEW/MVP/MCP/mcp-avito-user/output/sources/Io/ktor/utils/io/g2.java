package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.C41628a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WriterSession.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.WriterSessionKt", f = "WriterSession.kt", i = {0}, l = {83}, m = "completeWritingFallback", n = {"buffer"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class g2 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C41628a f400966q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400967r;

    /* renamed from: s, reason: collision with root package name */
    public int f400968s;

    public g2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400967r = obj;
        this.f400968s |= BeduinInputModel.MIN_TEXT_VERSION;
        return j2.b(null, null, this);
    }
}
