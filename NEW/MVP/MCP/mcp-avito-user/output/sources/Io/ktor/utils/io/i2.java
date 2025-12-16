package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WriterSession.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.WriterSessionKt", f = "WriterSession.kt", i = {0, 0}, l = {93}, m = "writeBufferSuspend", n = {"session", "desiredSpace"}, s = {"L$0", "I$0"})
/* loaded from: classes8.dex */
final class i2 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public k2 f401010q;

    /* renamed from: r, reason: collision with root package name */
    public int f401011r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f401012s;

    /* renamed from: t, reason: collision with root package name */
    public int f401013t;

    public i2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401012s = obj;
        this.f401013t |= BeduinInputModel.MIN_TEXT_VERSION;
        return j2.d(null, 0, this);
    }
}
