package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Errors.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {152}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
/* renamed from: kotlinx.coroutines.flow.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43155g0<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f411403q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411404r;

    /* renamed from: s, reason: collision with root package name */
    public int f411405s;

    public C43155g0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411404r = obj;
        this.f411405s |= BeduinInputModel.MIN_TEXT_VERSION;
        return C43175k.g(null, null, this);
    }
}
