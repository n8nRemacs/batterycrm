package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Scrollable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0, 0}, l = {782}, m = "doFlingAnimation-QWom1Mo", n = {"this", "result"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class Y1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C20433a2 f27529q;

    /* renamed from: r, reason: collision with root package name */
    public l0.g f27530r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27531s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C20433a2 f27532t;

    /* renamed from: u, reason: collision with root package name */
    public int f27533u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(C20433a2 c20433a2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27532t = c20433a2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27531s = obj;
        this.f27533u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f27532t.b(0L, this);
    }
}
