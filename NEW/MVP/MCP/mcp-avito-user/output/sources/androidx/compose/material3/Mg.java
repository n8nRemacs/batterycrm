package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {154}, m = "runApproach", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class Mg extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Lg f35144q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f35145r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Lg f35146s;

    /* renamed from: t, reason: collision with root package name */
    public int f35147t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mg(Lg lg2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f35146s = lg2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f35145r = obj;
        this.f35147t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f35146s.i(null, 0.0f, 0.0f, this);
    }
}
