package com.avito.android.beduin.ui.screen.fragment.tabs;

import androidx.view.C23038g0;
import androidx.view.InterfaceC23040h0;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin.network.model.BeduinFormImpl;
import com.avito.android.beduin.ui.screen.fragment.BeduinScreenOpenParams;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;

/* compiled from: TabsScreenViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/s;", "Lcom/avito/android/beduin/ui/screen/fragment/k;", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s extends com.avito.android.beduin.ui.screen.fragment.k<TabsScreenModel, TabsScreenModel> {

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.ui.screen.fragment.l f104364R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f104365S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final I0 f104366T;

    /* compiled from: TabsScreenViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel;", "kotlin.jvm.PlatformType", "tabsScreenModel", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<TabsScreenModel, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(TabsScreenModel tabsScreenModel) {
            TabsScreenModel tabsScreenModel2 = tabsScreenModel;
            TabsScreenModel.b bVarF = tabsScreenModel2.f();
            if (bVarF != null) {
                List<NavigationBarItem> listD = bVarF.d();
                if (listD == null) {
                    listD = C42784z0.f406748b;
                }
                List<NavigationBarItem> list = listD;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (NavigationBarItem navigationBarItem : list) {
                    TabsScreenModel.NavigationBarSettings navigationBarSettings = tabsScreenModel2.getNavigationBarSettings();
                    arrayList.add(navigationBarItem.toBeduinModel(navigationBarSettings != null ? navigationBarSettings.getTintColor() : null));
                }
                com.avito.android.beduin_shared.model.utils.m.b(s.this.f104365S, new BeduinFormImpl("unknown", arrayList));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TabsScreenViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "tabId", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            TabsScreenModel tabsScreenModelA;
            String str = (String) obj;
            s sVar = s.this;
            com.avito.android.beduin.ui.screen.fragment.i iVar = (com.avito.android.beduin.ui.screen.fragment.i) sVar.f104253K.getValue();
            if (iVar != null) {
                tabsScreenModelA = (TabsScreenModel) iVar;
                List<TabsScreenModel.b> listI = tabsScreenModelA.i();
                ArrayList arrayList = new ArrayList(C42745f0.q(listI, 10));
                Iterator<T> it = listI.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TabsScreenModel.b) it.next()).getId());
                }
                if (arrayList.contains(str)) {
                    tabsScreenModelA = TabsScreenModel.a(tabsScreenModelA, str);
                }
            } else {
                tabsScreenModelA = null;
            }
            sVar.f104253K.setValue(tabsScreenModelA);
        }
    }

    /* compiled from: TabsScreenViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f104369b;

        public c(Y41.l lVar) {
            this.f104369b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f104369b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f104369b;
        }

        public final int hashCode() {
            return this.f104369b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f104369b.invoke(obj);
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/architecture_components/y", "Landroidx/lifecycle/h0;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC23040h0<TabsScreenModel> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C23038g0 f104370b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s f104371c;

        public d(C23038g0 c23038g0, s sVar) {
            this.f104370b = c23038g0;
            this.f104371c = sVar;
        }

        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(TabsScreenModel tabsScreenModel) {
            com.avito.android.beduin_shared.model.utils.a.a(this.f104371c.f104364R.f104269d, tabsScreenModel.e());
            this.f104370b.removeObserver(this);
        }
    }

    public s(@Y61.k com.avito.android.beduin.ui.screen.fragment.l lVar, @Y61.k com.avito.android.beduin.ui.screen.fragment.j<? super TabsScreenModel, TabsScreenModel> jVar, @Y61.k BeduinScreenOpenParams beduinScreenOpenParams) {
        super(lVar, jVar, beduinScreenOpenParams);
        this.f104364R = lVar;
        InterfaceC43779a interfaceC43779aJ = lVar.f104269d.j();
        this.f104365S = interfaceC43779aJ;
        this.f104366T = interfaceC43779aJ.getF103348p().j0(lVar.f104268c.e());
        this.f104253K.observeForever(new c(new a()));
        C23038g0<State> c23038g0 = this.f104253K;
        c23038g0.observeForever(new d(c23038g0, this));
        this.f104259Q.b(lVar.f104270e.f19040b.t0(new b()));
    }
}
