package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import android.util.LruCache;
import com.avito.android.beduin.common.action.BeduinThrottleAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinThrottleActionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/t1;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinThrottleAction;", "d", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class t1 implements InterfaceC15523b<BeduinThrottleAction> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f100414d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100415a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<BeduinThrottleAction> f100416b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LruCache<String, Long> f100417c;

    /* compiled from: BeduinThrottleActionHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/beduin/common/action/BeduinThrottleAction;", "kotlin.jvm.PlatformType", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            BeduinThrottleAction beduinThrottleAction = (BeduinThrottleAction) obj;
            int i12 = t1.f100414d;
            t1 t1Var = t1.this;
            t1Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String id2 = beduinThrottleAction.getId();
            if (id2 == null) {
                id2 = "beduin_throttle_default_action_id";
            }
            LruCache<String, Long> lruCache = t1Var.f100417c;
            Long l12 = lruCache.get(id2);
            boolean z12 = ((float) (jCurrentTimeMillis - (l12 == null ? 0L : l12.longValue()))) > beduinThrottleAction.getDuration() * ((float) 1000);
            if (z12) {
                lruCache.put(id2, Long.valueOf(jCurrentTimeMillis));
            }
            return z12;
        }
    }

    /* compiled from: BeduinThrottleActionHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.l<Throwable, kotlin.G0> {
        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            ((V2) this.receiver).f(th2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BeduinThrottleActionHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinThrottleAction;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/action/BeduinThrottleAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<BeduinThrottleAction, kotlin.G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(BeduinThrottleAction beduinThrottleAction) {
            com.avito.android.beduin_shared.model.utils.a.a(t1.this.f100415a.get(), beduinThrottleAction.getActions());
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BeduinThrottleActionHandler.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/t1$d;", "", "<init>", "()V", "", "CACHE_SIZE", "I", "", "DEFAULT_ACTION_ID", "Ljava/lang/String;", "", "ONE_SECOND_IN_MILLIS", "J", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public t1(@Y61.k h31.e<InterfaceC15523b<BeduinAction>> eVar, @Y61.k io.reactivex.rxjava3.disposables.c cVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f100415a = eVar;
        com.jakewharton.rxrelay3.c<BeduinThrottleAction> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f100416b = cVar2;
        this.f100417c = new LruCache<>(100);
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(cVar2.j0(interfaceC35745a5.c()).N(new a()).j0(interfaceC35745a5.e()), new b(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new c(), 2));
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100416b.accept((BeduinThrottleAction) beduinAction);
    }
}
