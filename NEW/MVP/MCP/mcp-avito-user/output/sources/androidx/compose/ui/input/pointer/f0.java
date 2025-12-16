package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.g0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {}, l = {861}, m = "withTimeoutOrNull", n = {}, s = {})
/* loaded from: classes.dex */
final class f0<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f40225q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g0.a<Object> f40226r;

    /* renamed from: s, reason: collision with root package name */
    public int f40227s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0.a aVar, BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
        this.f40226r = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f40225q = obj;
        this.f40227s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f40226r.W0(0L, null, this);
    }
}
