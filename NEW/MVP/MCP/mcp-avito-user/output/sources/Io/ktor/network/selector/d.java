package io.ktor.network.selector;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.nio.channels.Selector;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ActorSelectorManager.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0, 0}, l = {202}, m = "select", n = {"this", "selector"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f400163q;

    /* renamed from: r, reason: collision with root package name */
    public Selector f400164r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400165s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f400166t;

    /* renamed from: u, reason: collision with root package name */
    public int f400167u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f400166t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400165s = obj;
        this.f400167u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f400166t.o(null, this);
    }
}
