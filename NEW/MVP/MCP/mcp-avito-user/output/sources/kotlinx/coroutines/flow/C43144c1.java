package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Reduce.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {53}, m = "single", n = {"result"}, s = {"L$0"})
/* renamed from: kotlinx.coroutines.flow.c1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43144c1<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f411345q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411346r;

    /* renamed from: s, reason: collision with root package name */
    public int f411347s;

    public C43144c1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411346r = obj;
        this.f411347s |= BeduinInputModel.MIN_TEXT_VERSION;
        return C43175k.T(null, this);
    }
}
