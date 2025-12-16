package androidx.compose.foundation.text.input.internal.selection;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {1, 1}, l = {1332, 1334, 1334}, m = "paste", n = {"this", "receiveContentConfiguration"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class K extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public TextFieldSelectionState f31232q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.compose.foundation.content.internal.c f31233r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f31234s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31235t;

    /* renamed from: u, reason: collision with root package name */
    public int f31236u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31235t = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f31234s = obj;
        this.f31236u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f31235t.q(this);
    }
}
