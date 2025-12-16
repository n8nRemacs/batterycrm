package U91;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f16236q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f16237r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f16238s;

    /* renamed from: t, reason: collision with root package name */
    public int f16239t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16238s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16237r = obj;
        this.f16239t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f16238s.b(this);
    }
}
