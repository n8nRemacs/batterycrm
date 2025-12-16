package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TapGestureDetector.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {209}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
/* renamed from: androidx.compose.foundation.gestures.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20457g2 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f27724q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27725r;

    /* renamed from: s, reason: collision with root package name */
    public int f27726s;

    public C20457g2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f27725r = obj;
        this.f27726s |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20445d2.a(null, this);
    }
}
