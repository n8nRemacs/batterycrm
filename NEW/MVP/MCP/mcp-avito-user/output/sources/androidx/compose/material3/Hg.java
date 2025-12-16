package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {95}, m = "fling", n = {}, s = {})
/* loaded from: classes.dex */
final class Hg extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f34858q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Lg f34859r;

    /* renamed from: s, reason: collision with root package name */
    public int f34860s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hg(Lg lg2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f34859r = lg2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f34858q = obj;
        this.f34860s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f34859r.h(null, 0.0f, this);
    }
}
