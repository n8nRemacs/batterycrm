package androidx.compose.foundation.text.input.internal.selection;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0}, l = {1287}, m = "cut", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class r extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public TextFieldSelectionState f31413q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f31414r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31415s;

    /* renamed from: t, reason: collision with root package name */
    public int f31416t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31415s = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f31414r = obj;
        this.f31416t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f31415s.f(this);
    }
}
