package androidx.compose.foundation.text.input.internal.selection;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0}, l = {422}, m = "startToolbarAndHandlesVisibilityObserver", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class M extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public TextFieldSelectionState f31241q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f31242r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31243s;

    /* renamed from: t, reason: collision with root package name */
    public int f31244t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31243s = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f31242r = obj;
        this.f31244t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f31243s.w(this);
    }
}
