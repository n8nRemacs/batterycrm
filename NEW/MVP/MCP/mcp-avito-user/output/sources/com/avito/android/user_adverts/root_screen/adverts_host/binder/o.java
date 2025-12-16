package com.avito.android.user_adverts.root_screen.adverts_host.binder;

import androidx.view.InterfaceC22983P;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.HostViewState;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.M;
import kotlinx.coroutines.flow.B1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.n2;
import wI0.C49518c;
import wI0.InterfaceC49516a;

/* compiled from: HostViewStateBinder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/binder/o;", "LwI0/a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o implements InterfaceC49516a<HostViewState> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C49518c<HostViewState> f312480a;

    /* compiled from: HostViewStateBinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/binder/o$a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final e0 f312481a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final F f312482b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final FI0.a f312483c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final JI0.a f312484d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b f312485e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.g f312486f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final R0 f312487g;

        @Inject
        public a(@Y61.k e0 e0Var, @Y61.k F f12, @Y61.k FI0.a aVar, @Y61.k JI0.a aVar2, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b bVar, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.g gVar, @Y61.k R0 r02) {
            this.f312481a = e0Var;
            this.f312482b = f12;
            this.f312483c = aVar;
            this.f312484d = aVar2;
            this.f312485e = bVar;
            this.f312486f = gVar;
            this.f312487g = r02;
        }
    }

    public o() {
        throw null;
    }

    public o(n2 n2Var, n2 n2Var2, n2 n2Var3, n2 n2Var4, InterfaceC43160i interfaceC43160i, com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.g gVar, M m12, InterfaceC22983P interfaceC22983P, C42822w c42822w) {
        this.f312480a = new C49518c<>(C43175k.I(m12, new B1(new InterfaceC43160i[]{n2Var, n2Var2, n2Var3, n2Var4, interfaceC43160i}, new n(6, gVar, com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.g.class, "mapState", "mapState(Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsState;Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/mvi/entity/SearchState;Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/mvi/entity/PanelConfigState;Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/mvi/entity/PanelSoaState;Lcom/avito/android/user_adverts/root_screen/adverts_host/overlay/core/model/Overlay;)Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState;", 4))), interfaceC22983P);
    }
}
