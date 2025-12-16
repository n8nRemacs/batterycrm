package com.avito.android.messenger.channels.mvi.interactor;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.C31655k;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31700h;
import com.avito.android.messenger.channels.mvi.sync.InterfaceC31857r0;
import com.avito.android.messenger.w0;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.L;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.o0;

/* compiled from: LocallyDeletedChannelsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/interactor/H;", "Lcom/avito/android/messenger/channels/mvi/interactor/A;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class H implements A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31700h f187628a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f187629b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f187630c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f187631d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31857r0 f187632e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final L f187633f;

    /* compiled from: LocallyDeletedChannelsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RequestReviewResultKt.INFO_TYPE, "Lru/avito/messenger/MessengerUserHashInfo;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f187634b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return o0.b((MessengerUserHashInfo) obj);
        }
    }

    @Inject
    public H(@Y61.k InterfaceC31700h interfaceC31700h, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC31857r0 interfaceC31857r0, @Y61.k w0 w0Var) {
        this.f187628a = interfaceC31700h;
        this.f187629b = interfaceC35741a1;
        this.f187630c = interfaceC28373a;
        this.f187631d = interfaceC35745a5;
        this.f187632e = interfaceC31857r0;
        C41982q1 c41982q1X0 = w0Var.g().x0(interfaceC35745a5.a());
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        this.f187633f = c41982q1X0.D(oVar).N(a.f187634b).D(oVar);
    }

    @Override // com.avito.android.messenger.channels.mvi.interactor.A
    @Y61.k
    public final AbstractC41768a a(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return this.f187628a.f(str, messengerUserHashInfo);
    }

    @Override // com.avito.android.messenger.channels.mvi.interactor.A
    @Y61.k
    public final AbstractC41768a p(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        this.f187630c.c(new C31655k(str));
        return this.f187628a.b(str, messengerUserHashInfo);
    }

    @Override // com.avito.android.messenger.channels.mvi.interactor.A
    @Y61.k
    public final B0 q() {
        io.reactivex.rxjava3.core.z<Throwable> zVarQ = this.f187632e.q();
        final InterfaceC35741a1 interfaceC35741a1 = this.f187629b;
        return zVarQ.d0(new l41.o() { // from class: com.avito.android.messenger.channels.mvi.interactor.B
            @Override // l41.o
            public final Object apply(Object obj) {
                return InterfaceC35741a1.a.a(interfaceC35741a1, (Throwable) obj, null, null, 6);
            }
        });
    }

    @Override // com.avito.android.messenger.channels.mvi.interactor.A
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.G r() {
        return this.f187633f.y0(new G(this)).z(300L, TimeUnit.MILLISECONDS, this.f187631d.c());
    }

    @Override // com.avito.android.messenger.channels.mvi.interactor.A
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.G s() {
        io.reactivex.rxjava3.core.z zVarT = this.f187633f.y0(new D(this)).T(E.f187625b, Integer.MAX_VALUE);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zVarT.getClass();
        return zVarT.z(300L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b);
    }
}
