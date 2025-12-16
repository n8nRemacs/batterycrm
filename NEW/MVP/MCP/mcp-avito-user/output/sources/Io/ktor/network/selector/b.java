package io.ktor.network.selector;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.channels.Selector;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ActorSelectorManager.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {69, 73, 89}, m = "process", n = {"this", "mb", "selector", "this", "mb", "selector", "this", "mb", "selector"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes8.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f400152q;

    /* renamed from: r, reason: collision with root package name */
    public f f400153r;

    /* renamed from: s, reason: collision with root package name */
    public Selector f400154s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f400155t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f400156u;

    /* renamed from: v, reason: collision with root package name */
    public int f400157v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400156u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400155t = obj;
        this.f400157v |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.i(this.f400156u, null, null, this);
    }
}
