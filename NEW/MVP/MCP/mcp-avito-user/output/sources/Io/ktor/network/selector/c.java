package io.ktor.network.selector;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ActorSelectorManager.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0, 0}, l = {162}, m = "receiveOrNullSuspend", n = {"this", "$this$receiveOrNullSuspend"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f400158q;

    /* renamed from: r, reason: collision with root package name */
    public f f400159r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400160s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f400161t;

    /* renamed from: u, reason: collision with root package name */
    public int f400162u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400161t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400160s = obj;
        this.f400162u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f400161t.n(null, this);
    }
}
