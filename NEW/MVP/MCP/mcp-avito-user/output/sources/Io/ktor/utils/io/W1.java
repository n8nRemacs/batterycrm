package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReadSession.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ReadSessionKt", f = "ReadSession.kt", i = {0}, l = {133}, m = "requestBufferFallback", n = {"chunk"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class W1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public io.ktor.utils.io.core.internal.b f400799q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400800r;

    /* renamed from: s, reason: collision with root package name */
    public int f400801s;

    public W1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400800r = obj;
        this.f400801s |= BeduinInputModel.MIN_TEXT_VERSION;
        return Y1.c(null, 0, this);
    }
}
