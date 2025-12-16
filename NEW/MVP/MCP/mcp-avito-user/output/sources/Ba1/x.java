package Ba1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class x extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public W91.h f1555q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1556r;

    /* renamed from: s, reason: collision with root package name */
    public int f1557s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1556r = obj;
        this.f1557s |= BeduinInputModel.MIN_TEXT_VERSION;
        return y.a(null, 0L, this);
    }
}
