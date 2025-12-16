package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C21011f1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContextMenu.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt", f = "ContextMenu.android.kt", i = {0, 0, 0}, l = {167}, m = "getContextMenuItemsAvailability", n = {"$this$getContextMenuItemsAvailability", "isPassword", "hasSelection"}, s = {"L$0", "I$0", "I$1"})
/* renamed from: androidx.compose.foundation.text.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21060v0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C21011f1 f32254q;

    /* renamed from: r, reason: collision with root package name */
    public int f32255r;

    /* renamed from: s, reason: collision with root package name */
    public int f32256s;

    /* renamed from: t, reason: collision with root package name */
    public int f32257t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f32258u;

    /* renamed from: v, reason: collision with root package name */
    public int f32259v;

    public C21060v0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f32258u = obj;
        this.f32259v |= BeduinInputModel.MIN_TEXT_VERSION;
        return C21064w0.c(null, this);
    }
}
