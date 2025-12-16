package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: ContextMenu.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20968m0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f31572l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<F1> f31573m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31574n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20968m0(kotlinx.coroutines.T t12, InterfaceC22204y1<F1> interfaceC22204y1, TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.f31572l = t12;
        this.f31573m = interfaceC22204y1;
        this.f31574n = textFieldSelectionState;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        C43259k.d(this.f31572l, null, CoroutineStart.f410683e, new C20964l0(this.f31573m, this.f31574n, null), 1);
        return kotlin.G0.f406611a;
    }
}
