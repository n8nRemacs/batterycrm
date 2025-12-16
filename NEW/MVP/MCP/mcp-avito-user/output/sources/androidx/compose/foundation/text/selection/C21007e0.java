package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.W1;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SelectionGestures.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 1, 1}, l = {238, 242}, m = "touchSelectionFirstPress", n = {"$this$touchSelectionFirstPress", "observer", "firstDown", "$this$touchSelectionFirstPress", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* renamed from: androidx.compose.foundation.text.selection.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21007e0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f31971q;

    /* renamed from: r, reason: collision with root package name */
    public W1 f31972r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.compose.ui.input.pointer.C f31973s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f31974t;

    /* renamed from: u, reason: collision with root package name */
    public int f31975u;

    public C21007e0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f31974t = obj;
        this.f31975u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20998b0.e(null, null, null, this);
    }
}
