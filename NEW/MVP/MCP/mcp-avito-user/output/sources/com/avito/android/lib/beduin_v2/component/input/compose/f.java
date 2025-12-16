package com.avito.android.lib.beduin_v2.component.input.compose;

import androidx.compose.ui.focus.f0;
import com.avito.beduin.v2.avito.component.input.state.AvitoInputState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InnerInput.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/f0;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/focus/f0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.l<f0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AvitoInputState f175685l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AvitoInputState avitoInputState) {
        super(1);
        this.f175685l = avitoInputState;
    }

    @Override // Y41.l
    public final G0 invoke(f0 f0Var) {
        f0 f0Var2 = f0Var;
        Y41.l<Boolean, G0> lVar = this.f175685l.f334477p;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(f0Var2.a()));
        }
        return G0.f406611a;
    }
}
