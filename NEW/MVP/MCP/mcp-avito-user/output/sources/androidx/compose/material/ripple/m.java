package androidx.compose.material.ripple;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RippleAnimation.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", i = {0, 1}, l = {77, 79, 80}, m = "animate", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public p f34101q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f34102r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f34103s;

    /* renamed from: t, reason: collision with root package name */
    public int f34104t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f34103s = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f34102r = obj;
        this.f34104t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f34103s.a(this);
    }
}
