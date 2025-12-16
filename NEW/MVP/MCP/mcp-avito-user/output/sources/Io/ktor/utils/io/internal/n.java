package io.ktor.utils.io.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SequentialCopyTo.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.internal.SequentialCopyToKt", f = "SequentialCopyTo.kt", i = {0, 0, 1, 1}, l = {60, 66}, m = "copyToTail", n = {"dst", "lastPiece", "lastPiece", "rc"}, s = {"L$0", "L$1", "L$0", "I$0"})
/* loaded from: classes8.dex */
final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f401066q;

    /* renamed from: r, reason: collision with root package name */
    public io.ktor.utils.io.core.internal.b f401067r;

    /* renamed from: s, reason: collision with root package name */
    public int f401068s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f401069t;

    /* renamed from: u, reason: collision with root package name */
    public int f401070u;

    public n() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401069t = obj;
        this.f401070u |= BeduinInputModel.MIN_TEXT_VERSION;
        return p.b(null, null, 0L, this);
    }
}
