package com.avito.android.beduin.common.actionhandler.socket_event;

import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.action.BeduinSocketEventAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import ji.InterfaceC42385a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import l41.o;
import lj.InterfaceC43780b;
import p41.AbstractC46895b;

/* compiled from: BeduinSocketEventsHandler.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/socket_event/a;", "Lji/a;", "d", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC42385a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.clientEventBus.a f100385a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100386b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC43780b f100387c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<BeduinSocketEventAction> f100388d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final y f100389e;

    /* compiled from: BeduinSocketEventsHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSocketEventAction;", "kotlin.jvm.PlatformType", "it", "Lkotlin/Q;", "", "apply", "(Lcom/avito/android/beduin/common/action/BeduinSocketEventAction;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin.common.actionhandler.socket_event.a$a, reason: collision with other inner class name */
    public static final class C3014a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final C3014a<T, R> f100390b = new C3014a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            BeduinSocketEventAction beduinSocketEventAction = (BeduinSocketEventAction) obj;
            return new Q(beduinSocketEventAction.getType(), beduinSocketEventAction.getSubType());
        }
    }

    /* compiled from: BeduinSocketEventsHandler.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062(\u0010\u0005\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lp41/b;", "Lkotlin/Q;", "", "Lcom/avito/android/beduin/common/action/BeduinSocketEventAction;", "kotlin.jvm.PlatformType", "groupedObs", "Lio/reactivex/rxjava3/core/E;", "Lmx0/a;", "apply", "(Lp41/b;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((AbstractC46895b) obj).D(io.reactivex.rxjava3.internal.functions.a.f401991a).y0(new com.avito.android.beduin.common.actionhandler.socket_event.b(a.this));
        }
    }

    /* compiled from: BeduinSocketEventsHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f100392l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.f(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinSocketEventsHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/socket_event/a$d;", "", "<init>", "()V", "", "EVENTS_THROTTLE_MS", "J", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    static {
        new d(null);
    }

    @Inject
    public a(@k com.avito.android.clientEventBus.a aVar, @k h31.e<InterfaceC15523b<BeduinAction>> eVar, @k InterfaceC43780b interfaceC43780b) {
        this.f100385a = aVar;
        this.f100386b = eVar;
        this.f100387c = interfaceC43780b;
        com.jakewharton.rxrelay3.c<BeduinSocketEventAction> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f100388d = cVar;
        this.f100389e = A1.h(cVar.Z(C3014a.f100390b).T(new b(), Integer.MAX_VALUE), c.f100392l, null, 6);
    }

    @Override // ji.InterfaceC42385a
    public final void onCleared() {
        y yVar = this.f100389e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
