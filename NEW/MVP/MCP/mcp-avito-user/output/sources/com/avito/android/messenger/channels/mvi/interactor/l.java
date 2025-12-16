package com.avito.android.messenger.channels.mvi.interactor;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import com.avito.android.ab_tests.groups.MessengerFolderTabsTestGroup;
import com.avito.android.messenger.folders.f;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: FoldersInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/interactor/l;", "Lcom/avito/android/messenger/channels/mvi/interactor/k;", "Landroidx/lifecycle/M0;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l extends M0 implements k {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f187652E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final JY.a f187653J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f187654K = new com.jakewharton.rxrelay3.c();

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f187655L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.messenger.folders.f> f187656M;

    /* compiled from: FoldersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/interactor/l$a;", "", "<init>", "()V", "", "REFRESH_THROTTLE_TIMEOUT_MS", "J", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FoldersInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f187657b;

        public b(Y41.l lVar) {
            this.f187657b = lVar;
        }

        @Override // l41.o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f187657b.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public l(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k u3.g<MessengerFolderTabsTestGroup> gVar, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k JY.a aVar) {
        this.f187652E = interfaceC47842z;
        this.f187653J = aVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f187655L = cVar;
        this.f187656M = new com.jakewharton.rxrelay3.c<>();
        MessengerFolderTabsTestGroup messengerFolderTabsTestGroup = gVar.f439742a.f439749b;
        messengerFolderTabsTestGroup.getClass();
        if (messengerFolderTabsTestGroup == MessengerFolderTabsTestGroup.f67952d) {
            io.reactivex.rxjava3.core.H hA2 = interfaceC35745a5.a();
            cVar.b(interfaceC47842z.A().x0(hA2).j0(hA2).t0(new u(this)));
            io.reactivex.rxjava3.core.z zVarG0 = io.reactivex.rxjava3.core.z.g0(interfaceC47842z.C(ChatMessage.class).d0(m.f187658b), interfaceC47842z.C(X81.o.class).d0(n.f187659b));
            B0 b0D0 = interfaceC47842z.C(X81.t.class).d0(o.f187660b);
            zVarG0.getClass();
            io.reactivex.rxjava3.core.z zVarG02 = io.reactivex.rxjava3.core.z.g0(zVarG0, b0D0);
            B0 b0D02 = interfaceC47842z.C(X81.e.class).d0(p.f187661b);
            zVarG02.getClass();
            io.reactivex.rxjava3.core.z zVarG03 = io.reactivex.rxjava3.core.z.g0(zVarG02, b0D02);
            B0 b0D03 = interfaceC47842z.C(X81.b.class).d0(q.f187662b);
            zVarG03.getClass();
            io.reactivex.rxjava3.core.z zVarG04 = io.reactivex.rxjava3.core.z.g0(zVarG03, b0D03);
            B0 b0D04 = interfaceC47842z.C(X81.a.class).d0(r.f187663b);
            zVarG04.getClass();
            io.reactivex.rxjava3.core.z zVarG05 = io.reactivex.rxjava3.core.z.g0(zVarG04, b0D04);
            B0 b0D05 = interfaceC47842z.C(X81.g.class).d0(s.f187664b);
            zVarG05.getClass();
            cVar.b(io.reactivex.rxjava3.core.z.g0(zVarG05, b0D05).x0(hA2).t0(new t(this)));
            com.avito.android.messenger.folders.e.f196349a.getClass();
            List<com.avito.android.messenger.folders.a> list = (List) com.avito.android.messenger.folders.e.f196353e.getValue();
            int iF2 = P0.f(C42745f0.q(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 < 16 ? 16 : iF2);
            for (com.avito.android.messenger.folders.a aVar2 : list) {
                linkedHashMap.put(aVar2.f196343a, aVar2.f196347e.f215552a);
            }
            this.f187655L.b(new io.reactivex.rxjava3.internal.operators.mixed.x(this.f187654K.x0(hA2).j0(hA2).C0(500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b), new w(this, linkedHashMap)).t0(new x(this)));
            com.jakewharton.rxrelay3.c<com.avito.android.messenger.folders.f> cVar2 = this.f187656M;
            f.a aVar3 = com.avito.android.messenger.folders.f.f196355b;
            com.avito.android.messenger.folders.e.f196349a.getClass();
            List list2 = (List) com.avito.android.messenger.folders.e.f196353e.getValue();
            Map mapC = P0.c();
            aVar3.getClass();
            cVar2.accept(f.a.a(list2, mapC));
        }
    }

    @Override // com.avito.android.messenger.channels.mvi.interactor.k
    public final void Ab() {
        this.f187654K.accept(G0.f406611a);
    }

    @Override // com.avito.android.messenger.channels.mvi.interactor.k
    /* renamed from: H5, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF187656M() {
        return this.f187656M;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f187655L.e();
        super.onCleared();
    }
}
