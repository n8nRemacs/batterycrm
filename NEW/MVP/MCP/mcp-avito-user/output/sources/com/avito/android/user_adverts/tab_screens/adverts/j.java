package com.avito.android.user_adverts.tab_screens.adverts;

import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.lib.beduin_v2.beduin_item.a;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import java.util.Set;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.n2;

/* compiled from: UserAdvertsBeduinViewModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/j;", "Lcom/avito/android/arch/mvi/android/k;", "LeT/a;", "Lcom/avito/android/lib/beduin_v2/beduin_item/a;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "Landroidx/lifecycle/M0;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends M0 implements com.avito.android.arch.mvi.android.k<InterfaceC40047a, com.avito.android.lib.beduin_v2.beduin_item.a, BeduinOneTimeEvent> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Set<FV0.h> f315158E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.B f315159J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final aU0.b f315160K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f315161L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f315162M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<BeduinOneTimeEvent> f315163N;

    /* compiled from: UserAdvertsBeduinViewModel.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/j$a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        j create();
    }

    /* compiled from: UserAdvertsBeduinViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f315164l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ j f315165m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n.a aVar, j jVar) {
            super(0);
            this.f315164l = aVar;
            this.f315165m = jVar;
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f315164l.a(N0.a(this.f315165m));
        }
    }

    /* compiled from: UserAdvertsBeduinViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/n2;", "Lcom/avito/android/lib/beduin_v2/beduin_item/a;", "invoke", "()Lkotlinx/coroutines/flow/n2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<n2<? extends com.avito.android.lib.beduin_v2.beduin_item.a>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final n2<? extends com.avito.android.lib.beduin_v2.beduin_item.a> invoke() {
            j jVar = j.this;
            return C43175k.U(com.avito.android.lib.beduin_v2.beduin_item.g.a((com.avito.android.lib.beduin_v2.feature.mvi.x) jVar.f315161L.getValue()), N0.a(jVar), com.avito.android.arch.mvi.android.a.f91843a, a.b.f175438a);
        }
    }

    @i31.c
    public j(@Y61.k n.a aVar, @Y61.k Set<FV0.h> set, @Y61.k com.avito.beduin.v2.engine.component.B b12, @Y61.k aU0.b bVar) {
        this.f315158E = set;
        this.f315159J = b12;
        this.f315160K = bVar;
        InterfaceC42726C interfaceC42726CC = C42727D.c(new b(aVar, this));
        this.f315161L = interfaceC42726CC;
        this.f315162M = C42727D.c(new c());
        this.f315163N = ((com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726CC.getValue()).getEvents();
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(Object obj) {
        C43259k.d(N0.a(this), null, null, new k(this, (InterfaceC40047a) obj, null), 3);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<BeduinOneTimeEvent> getEvents() {
        return this.f315163N;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<com.avito.android.lib.beduin_v2.beduin_item.a> getState() {
        return (n2) this.f315162M.getValue();
    }
}
