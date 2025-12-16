package Ba1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public u f1539q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1540r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f1541s;

    /* renamed from: t, reason: collision with root package name */
    public int f1542t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Continuation continuation) {
        super(continuation);
        this.f1541s = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1540r = obj;
        this.f1542t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f1541s.emit(null, this);
    }
}
