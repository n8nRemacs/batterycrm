package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContextMenu.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt", f = "ContextMenu.android.kt", i = {0}, l = {154}, m = "getContextMenuItemsAvailability", n = {"$this$getContextMenuItemsAvailability"}, s = {"L$0"})
/* renamed from: androidx.compose.foundation.text.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21056u0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public TextFieldSelectionState f32241q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f32242r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f32243s;

    /* renamed from: t, reason: collision with root package name */
    public int f32244t;

    public C21056u0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f32243s = obj;
        this.f32244t |= BeduinInputModel.MIN_TEXT_VERSION;
        return C21064w0.b(null, this);
    }
}
