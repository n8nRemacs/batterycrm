package X91;

import android.content.Context;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class r extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Context f18751q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18752r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f18753s;

    /* renamed from: t, reason: collision with root package name */
    public int f18754t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18753s = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18752r = obj;
        this.f18754t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f18753s.ke(null, this);
    }
}
