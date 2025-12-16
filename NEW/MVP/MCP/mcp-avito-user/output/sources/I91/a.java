package I91;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f8023q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f8024r;

    /* renamed from: s, reason: collision with root package name */
    public int f8025s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f8024r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8023q = obj;
        this.f8025s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f8024r.a(null, this);
    }
}
