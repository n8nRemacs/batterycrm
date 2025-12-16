package androidx.compose.foundation.text.input.internal.selection;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0}, l = {1311}, m = "copy", n = {"this", "cancelSelection"}, s = {"L$0", "Z$0"})
/* renamed from: androidx.compose.foundation.text.input.internal.selection.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20932q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public TextFieldSelectionState f31408q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f31409r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f31410s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31411t;

    /* renamed from: u, reason: collision with root package name */
    public int f31412u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20932q(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31411t = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f31410s = obj;
        this.f31412u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f31411t.d(false, this);
    }
}
