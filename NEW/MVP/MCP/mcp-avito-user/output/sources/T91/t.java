package T91;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public z f15474q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f15475r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f15476s;

    /* renamed from: t, reason: collision with root package name */
    public int f15477t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15476s = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15475r = obj;
        this.f15477t |= BeduinInputModel.MIN_TEXT_VERSION;
        return z.ke(this.f15476s, null, this);
    }
}
