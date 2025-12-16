package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.g0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {0}, l = {891}, m = "withTimeout", n = {"job"}, s = {"L$0"})
/* loaded from: classes.dex */
final class d0<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f40205q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f40206r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0.a<Object> f40207s;

    /* renamed from: t, reason: collision with root package name */
    public int f40208t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0.a aVar, BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
        this.f40207s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f40206r = obj;
        this.f40208t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f40207s.U1(0L, null, this);
    }
}
