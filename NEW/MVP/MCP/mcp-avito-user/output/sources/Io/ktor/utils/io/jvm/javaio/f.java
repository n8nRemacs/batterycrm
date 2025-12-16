package io.ktor.utils.io.jvm.javaio;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Blocking.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.OutputAdapter$loop$1", f = "Blocking.kt", i = {0, 0, 1}, l = {319, 94}, m = "loop", n = {"this", "this_$iv", "this"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes8.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public g f401121q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401122r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f401123s;

    /* renamed from: t, reason: collision with root package name */
    public int f401124t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f401123s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401122r = obj;
        this.f401124t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f401123s.b(this);
    }
}
