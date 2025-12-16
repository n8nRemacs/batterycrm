package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.W1;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: SelectionGestures.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {281, 322}, m = "touchSelectionSubsequentPress", n = {"$this$touchSelectionSubsequentPress", "observer", "firstDown", "overSlop", "pointerId", "$this$touchSelectionSubsequentPress", "observer"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1"})
/* renamed from: androidx.compose.foundation.text.selection.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21013g0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f32016q;

    /* renamed from: r, reason: collision with root package name */
    public W1 f32017r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.compose.ui.input.pointer.C f32018s;

    /* renamed from: t, reason: collision with root package name */
    public l0.g f32019t;

    /* renamed from: u, reason: collision with root package name */
    public long f32020u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f32021v;

    /* renamed from: w, reason: collision with root package name */
    public int f32022w;

    public C21013g0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f32021v = obj;
        this.f32022w |= BeduinInputModel.MIN_TEXT_VERSION;
        return C20998b0.f(null, null, null, this);
    }
}
