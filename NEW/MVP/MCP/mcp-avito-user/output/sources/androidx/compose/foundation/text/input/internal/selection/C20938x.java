package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0, 0, 0}, l = {984}, m = "detectSelectionHandleDragGestures", n = {"this", "dragBeginPosition", "dragTotalDistance", "handle"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* renamed from: androidx.compose.foundation.text.input.internal.selection.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20938x extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public TextFieldSelectionState f31435q;

    /* renamed from: r, reason: collision with root package name */
    public l0.g f31436r;

    /* renamed from: s, reason: collision with root package name */
    public l0.g f31437s;

    /* renamed from: t, reason: collision with root package name */
    public Handle f31438t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f31439u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31440v;

    /* renamed from: w, reason: collision with root package name */
    public int f31441w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20938x(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31440v = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f31439u = obj;
        this.f31441w |= BeduinInputModel.MIN_TEXT_VERSION;
        return TextFieldSelectionState.b(this.f31440v, null, false, this);
    }
}
