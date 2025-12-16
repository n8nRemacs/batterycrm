package androidx.compose.foundation.text.input.internal.selection;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0, 0}, l = {611}, m = "detectCursorHandleDragGestures", n = {"this", "cursorDragStart", "cursorDragDelta"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: androidx.compose.foundation.text.input.internal.selection.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20933s extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public TextFieldSelectionState f31417q;

    /* renamed from: r, reason: collision with root package name */
    public l0.g f31418r;

    /* renamed from: s, reason: collision with root package name */
    public l0.g f31419s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f31420t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31421u;

    /* renamed from: v, reason: collision with root package name */
    public int f31422v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20933s(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31421u = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f31420t = obj;
        this.f31422v |= BeduinInputModel.MIN_TEXT_VERSION;
        return TextFieldSelectionState.a(this.f31421u, null, this);
    }
}
