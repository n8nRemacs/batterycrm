package androidx.compose.runtime;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ProduceState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", i = {0}, l = {205}, m = "awaitDispose", n = {"onDispose"}, s = {"L$0"})
/* loaded from: classes.dex */
final class V1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f38157q;

    /* renamed from: r, reason: collision with root package name */
    public int f38158r;

    public V1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f38157q = obj;
        this.f38158r |= BeduinInputModel.MIN_TEXT_VERSION;
        throw null;
    }
}
