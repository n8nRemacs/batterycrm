package yc1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f443386q;

    /* renamed from: r, reason: collision with root package name */
    public int f443387r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f443386q = obj;
        this.f443387r |= BeduinInputModel.MIN_TEXT_VERSION;
        throw null;
    }
}
