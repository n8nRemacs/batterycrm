package androidx.compose.ui.text.input;

import android.view.inputmethod.BaseInputConnection;
import kotlin.Metadata;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/inputmethod/BaseInputConnection;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class b0 extends kotlin.jvm.internal.N implements Y41.a<BaseInputConnection> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0 f42415l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a0 a0Var) {
        super(0);
        this.f42415l = a0Var;
    }

    @Override // Y41.a
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.f42415l.f42391a, false);
    }
}
