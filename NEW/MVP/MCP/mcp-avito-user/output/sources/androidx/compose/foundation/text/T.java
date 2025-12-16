package androidx.compose.foundation.text;

import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;

/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/o0;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class T extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.text.o0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S2 f30542l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<androidx.compose.ui.text.o0, kotlin.G0> f30543m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public T(S2 s22, Y41.l<? super androidx.compose.ui.text.o0, kotlin.G0> lVar) {
        super(1);
        this.f30542l = s22;
        this.f30543m = lVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.text.o0 o0Var) {
        androidx.compose.ui.text.o0 o0Var2 = o0Var;
        S2 s22 = this.f30542l;
        if (s22 != null) {
            ((C22082i3) s22.f30522a).setValue(o0Var2);
        }
        Y41.l<androidx.compose.ui.text.o0, kotlin.G0> lVar = this.f30543m;
        if (lVar != null) {
            lVar.invoke(o0Var2);
        }
        return kotlin.G0.f406611a;
    }
}
