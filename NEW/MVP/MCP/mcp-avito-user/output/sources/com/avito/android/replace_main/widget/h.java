package com.avito.android.replace_main.widget;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import com.avito.android.replace_main.onboarding.widget.ReplaceMainItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.n2;

/* compiled from: ReplaceMainWidgetViewImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f254696l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar) {
        super(2);
        this.f254696l = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            g gVar = this.f254696l;
            ReplaceMainItem replaceMainItem = (ReplaceMainItem) C22126m3.b((n2) gVar.f254691c.getValue(), a13).getF42167b();
            if (replaceMainItem != null) {
                boolean z12 = replaceMainItem instanceof ReplaceMainItem.ReplaceMain;
                Y41.a<G0> aVar = gVar.f254689a.f4226b;
                if (z12) {
                    a13.C(735482871);
                    com.avito.android.replace_main.widget.compose.j.a((ReplaceMainItem.ReplaceMain) replaceMainItem, aVar, a13, 8);
                    a13.h();
                } else if (replaceMainItem instanceof ReplaceMainItem.ShowAvito) {
                    a13.C(735489013);
                    com.avito.android.replace_main.widget.compose.j.b((ReplaceMainItem.ShowAvito) replaceMainItem, aVar, a13, 8);
                    a13.h();
                } else {
                    a13.C(1325471601);
                    a13.h();
                }
            }
        }
        return G0.f406611a;
    }
}
