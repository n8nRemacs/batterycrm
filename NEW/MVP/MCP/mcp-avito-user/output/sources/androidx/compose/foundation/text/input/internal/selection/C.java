package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import kotlin.Metadata;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class C extends kotlin.jvm.internal.N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31221l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Handle f31222m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(TextFieldSelectionState textFieldSelectionState, Handle handle) {
        super(0);
        this.f31221l = textFieldSelectionState;
        this.f31222m = handle;
    }

    @Override // Y41.a
    public final String invoke() {
        return "Selection Handle drag cancelled for draggingHandle: " + this.f31221l.m() + " definedOn: " + this.f31222m;
    }
}
