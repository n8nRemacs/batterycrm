package androidx.compose.foundation.pager;

import androidx.compose.animation.core.InterfaceC20307p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PagerState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 0}, l = {610, 617}, m = "animateScrollToPage", n = {"this", "animationSpec", "page", "pageOffsetFraction"}, s = {"L$0", "L$1", "I$0", "F$0"})
/* loaded from: classes.dex */
final class k0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m0 f29940q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC20307p f29941r;

    /* renamed from: s, reason: collision with root package name */
    public int f29942s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f29943t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m0 f29944u;

    /* renamed from: v, reason: collision with root package name */
    public int f29945v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29944u = m0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f29943t = obj;
        this.f29945v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f29944u.f(0, null, this);
    }
}
