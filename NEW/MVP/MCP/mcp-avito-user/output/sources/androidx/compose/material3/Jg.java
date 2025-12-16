package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0}, l = {135, 140}, m = "longSnap", n = {"this", "$this$longSnap"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class Jg extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Lg f34959q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.compose.foundation.gestures.G1 f34960r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f34961s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Lg f34962t;

    /* renamed from: u, reason: collision with root package name */
    public int f34963u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jg(Lg lg2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f34962t = lg2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f34961s = obj;
        this.f34963u |= BeduinInputModel.MIN_TEXT_VERSION;
        return Lg.c(this.f34962t, null, 0.0f, this);
    }
}
