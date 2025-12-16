package androidx.compose.foundation.gestures;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Scrollable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", i = {0, 0}, l = {1023}, m = "semanticsScrollBy-d-4ec7I", n = {"$this$semanticsScrollBy_u2dd_u2d4ec7I", "previousValue"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class L1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C20433a2 f27348q;

    /* renamed from: r, reason: collision with root package name */
    public l0.e f27349r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27350s;

    /* renamed from: t, reason: collision with root package name */
    public int f27351t;

    public L1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27350s = obj;
        this.f27351t |= BeduinInputModel.MIN_TEXT_VERSION;
        return K1.a(null, 0L, this);
    }
}
