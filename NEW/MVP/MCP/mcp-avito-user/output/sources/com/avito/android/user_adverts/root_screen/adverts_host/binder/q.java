package com.avito.android.user_adverts.root_screen.adverts_host.binder;

import androidx.view.InterfaceC22983P;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.flow.InterfaceC43160i;
import wI0.C49518c;
import wI0.InterfaceC49516a;

/* compiled from: ShortcutsEventBinder.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/binder/q;", "LwI0/a;", "LTI0/b;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q implements InterfaceC49516a<TI0.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M f312488a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.i f312489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C49518c<TI0.b> f312490c;

    /* compiled from: ShortcutsEventBinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/binder/q$a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final e0 f312491a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final R0 f312492b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.i f312493c;

        @Inject
        public a(@Y61.k e0 e0Var, @Y61.k R0 r02, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.i iVar) {
            this.f312491a = e0Var;
            this.f312492b = r02;
            this.f312493c = iVar;
        }
    }

    public q() {
        throw null;
    }

    public q(InterfaceC43160i interfaceC43160i, InterfaceC22983P interfaceC22983P, M m12, com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.i iVar, C42822w c42822w) {
        this.f312488a = m12;
        this.f312489b = iVar;
        this.f312490c = new C49518c<>(interfaceC43160i, interfaceC22983P);
    }
}
