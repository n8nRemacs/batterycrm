package com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs;

import com.avito.android.beduin.common.actionhandler.update_navbar_title.a;
import com.avito.android.beduin.network.model.screen.BottomSheetWithTabsScreenModel;
import com.avito.android.beduin.ui.screen.fragment.BeduinScreenOpenParams;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;

/* compiled from: BottomSheetWithTabsScreenViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet_w_tabs/j;", "Lcom/avito/android/beduin/ui/screen/fragment/k;", "Lcom/avito/android/beduin/network/model/screen/BottomSheetWithTabsScreenModel;", "Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet_w_tabs/i;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends com.avito.android.beduin.ui.screen.fragment.k<BottomSheetWithTabsScreenModel, i> {

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f104244R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final I0 f104245S;

    /* compiled from: BottomSheetWithTabsScreenViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/update_navbar_title/a$a;", "params", "Lkotlin/G0;", "accept", "(Lcom/avito/android/beduin/common/actionhandler/update_navbar_title/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a.C3018a c3018a = (a.C3018a) obj;
            j jVar = j.this;
            com.avito.android.beduin.ui.screen.fragment.i iVar = (com.avito.android.beduin.ui.screen.fragment.i) jVar.f104253K.getValue();
            i iVarA = null;
            if (iVar != null) {
                i iVar2 = (i) iVar;
                pi.e eVar = iVar2.f104240a;
                iVarA = i.a(iVar2, eVar != null ? pi.e.a(eVar, c3018a.f100503a) : new pi.e(c3018a.f100503a, null, null), null, 14);
            }
            jVar.f104253K.setValue(iVarA);
        }
    }

    public j(@Y61.k com.avito.android.beduin.ui.screen.fragment.l lVar, @Y61.k com.avito.android.beduin.ui.screen.fragment.j<? super BottomSheetWithTabsScreenModel, i> jVar, @Y61.k BeduinScreenOpenParams beduinScreenOpenParams) {
        super(lVar, jVar, beduinScreenOpenParams);
        InterfaceC43779a interfaceC43779aJ = this.f104251E.f104269d.j();
        this.f104244R = interfaceC43779aJ;
        this.f104245S = interfaceC43779aJ.getF103348p().j0(lVar.f104268c.e());
        this.f104259Q.b(lVar.f104271f.f100502b.t0(new a()));
    }
}
