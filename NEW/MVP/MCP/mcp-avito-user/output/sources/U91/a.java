package U91;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f16233q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f16234r;

    /* renamed from: s, reason: collision with root package name */
    public int f16235s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16234r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16233q = obj;
        this.f16235s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f16234r.a(this);
    }
}
