package com.avito.android.user_advert.advert;

import com.avito.android.lib.beduin_v2.beduin_item.a;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import java.util.Set;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.n2;

/* compiled from: MyAdvertBeduinViewModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_advert/advert/u;", "Lcom/avito/android/arch/mvi/android/k;", "LeT/a;", "Lcom/avito/android/lib/beduin_v2/beduin_item/a;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "Landroidx/lifecycle/M0;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35453u extends androidx.view.M0 implements com.avito.android.arch.mvi.android.k<InterfaceC40047a, com.avito.android.lib.beduin_v2.beduin_item.a, BeduinOneTimeEvent> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Set<FV0.h> f310639E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.B f310640J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final aU0.b f310641K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f310642L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f310643M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<BeduinOneTimeEvent> f310644N;

    /* compiled from: MyAdvertBeduinViewModel.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/u$a;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.advert.u$a */
    public interface a {
        @Y61.k
        C35453u create();
    }

    /* compiled from: MyAdvertBeduinViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.u$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f310645l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C35453u f310646m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n.a aVar, C35453u c35453u) {
            super(0);
            this.f310645l = aVar;
            this.f310646m = c35453u;
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f310645l.a(androidx.view.N0.a(this.f310646m));
        }
    }

    /* compiled from: MyAdvertBeduinViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/n2;", "Lcom/avito/android/lib/beduin_v2/beduin_item/a;", "invoke", "()Lkotlinx/coroutines/flow/n2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.u$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<n2<? extends com.avito.android.lib.beduin_v2.beduin_item.a>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final n2<? extends com.avito.android.lib.beduin_v2.beduin_item.a> invoke() {
            C35453u c35453u = C35453u.this;
            return C43175k.U(com.avito.android.lib.beduin_v2.beduin_item.g.a((com.avito.android.lib.beduin_v2.feature.mvi.x) c35453u.f310642L.getValue()), androidx.view.N0.a(c35453u), com.avito.android.arch.mvi.android.a.f91843a, a.b.f175438a);
        }
    }

    @i31.c
    public C35453u(@Y61.k n.a aVar, @Y61.k Set<FV0.h> set, @Y61.k com.avito.beduin.v2.engine.component.B b12, @Y61.k aU0.b bVar) {
        this.f310639E = set;
        this.f310640J = b12;
        this.f310641K = bVar;
        InterfaceC42726C interfaceC42726CC = C42727D.c(new b(aVar, this));
        this.f310642L = interfaceC42726CC;
        this.f310643M = C42727D.c(new c());
        this.f310644N = ((com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726CC.getValue()).getEvents();
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(Object obj) {
        C43259k.d(androidx.view.N0.a(this), null, null, new C35455v(this, (InterfaceC40047a) obj, null), 3);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<BeduinOneTimeEvent> getEvents() {
        return this.f310644N;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<com.avito.android.lib.beduin_v2.beduin_item.a> getState() {
        return (n2) this.f310643M.getValue();
    }
}
