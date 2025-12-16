package kotlinx.coroutines;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Delay.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {160}, m = "awaitCancellation", n = {}, s = {})
/* renamed from: kotlinx.coroutines.d0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43128d0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f411044q;

    /* renamed from: r, reason: collision with root package name */
    public int f411045r;

    public C43128d0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f411044q = obj;
        this.f411045r |= BeduinInputModel.MIN_TEXT_VERSION;
        return C43131e0.a(this);
    }
}
