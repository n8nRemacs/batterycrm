package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: ContextMenu.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "Landroidx/compose/foundation/text/TextContextMenuItems;", "item", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/TextContextMenuItems;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20987r0 extends kotlin.jvm.internal.N implements Y41.p<TextFieldSelectionState, TextContextMenuItems, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f31810l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20987r0(kotlinx.coroutines.T t12) {
        super(2);
        this.f31810l = t12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(TextFieldSelectionState textFieldSelectionState, TextContextMenuItems textContextMenuItems) {
        C43259k.d(this.f31810l, null, CoroutineStart.f410683e, new C20984q0(textContextMenuItems, textFieldSelectionState, null), 1);
        return kotlin.G0.f406611a;
    }
}
