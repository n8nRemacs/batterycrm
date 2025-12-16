package com.yandex.div.core.timer;

import Y61.l;
import android.os.Looper;
import com.yandex.div.core.C37916k;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.internal.util.u;
import com.yandex.div2.DivAction;
import com.yandex.div2.V7;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: TimerController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/timer/i;", "", "c", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f367723k = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final V7 f367724a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C37916k f367725b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.errors.d f367726c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.e f367727d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public C38029k f367728e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f367729f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<DivAction> f367730g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final List<DivAction> f367731h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f367732i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Ticker f367733j;

    /* compiled from: TimerController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.l<Long, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Long l12) {
            l12.longValue();
            i.a(i.this);
            return G0.f406611a;
        }
    }

    /* compiled from: TimerController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends N implements Y41.l<Long, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Long l12) {
            l12.longValue();
            i.a(i.this);
            return G0.f406611a;
        }
    }

    /* compiled from: TimerController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/timer/i$c;", "", "<init>", "()V", "", "CANCEL_COMMAND", "Ljava/lang/String;", "PAUSE_COMMAND", "RESET_COMMAND", "RESUME_COMMAND", "START_COMMAND", "STOP_COMMAND", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: TimerController.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<Long, G0> {
        @Override // Y41.l
        public final G0 invoke(Long l12) {
            long jLongValue = l12.longValue();
            i iVar = (i) this.receiver;
            int i12 = i.f367723k;
            iVar.b(jLongValue);
            return G0.f406611a;
        }
    }

    /* compiled from: TimerController.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<Long, G0> {
        @Override // Y41.l
        public final G0 invoke(Long l12) {
            long jLongValue = l12.longValue();
            i iVar = (i) this.receiver;
            int i12 = i.f367723k;
            iVar.b(jLongValue);
            return G0.f406611a;
        }
    }

    /* compiled from: TimerController.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<Long, G0> {
        @Override // Y41.l
        public final G0 invoke(Long l12) {
            long jLongValue = l12.longValue();
            i iVar = (i) this.receiver;
            int i12 = i.f367723k;
            iVar.b(jLongValue);
            u uVar = u.f370187a;
            if (L.f(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                List<DivAction> list = iVar.f367730g;
                if (list != null) {
                    for (DivAction divAction : list) {
                        C38029k c38029k = iVar.f367728e;
                        if (c38029k != null) {
                            iVar.f367725b.handleAction(divAction, c38029k);
                        }
                    }
                }
            } else {
                u.f370188b.post(new j(iVar));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TimerController.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class g extends H implements Y41.l<Long, G0> {
        @Override // Y41.l
        public final G0 invoke(Long l12) {
            long jLongValue = l12.longValue();
            i iVar = (i) this.receiver;
            int i12 = i.f367723k;
            iVar.b(jLongValue);
            u uVar = u.f370187a;
            if (L.f(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                List<DivAction> list = iVar.f367731h;
                if (list != null) {
                    for (DivAction divAction : list) {
                        C38029k c38029k = iVar.f367728e;
                        if (c38029k != null) {
                            iVar.f367725b.handleAction(divAction, c38029k);
                        }
                    }
                }
            } else {
                u.f370188b.post(new k(iVar));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UiThreadHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/yandex/div/internal/util/t", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f367737c;

        public h(long j12) {
            this.f367737c = j12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i iVar = i.this;
            C38029k c38029k = iVar.f367728e;
            if (c38029k == null) {
                return;
            }
            c38029k.t(iVar.f367729f, String.valueOf(this.f367737c));
        }
    }

    static {
        new c(null);
    }

    public i(@Y61.k V7 v72, @Y61.k C37916k c37916k, @Y61.k com.yandex.div.core.view2.errors.d dVar, @Y61.k com.yandex.div.json.expressions.e eVar) {
        this.f367724a = v72;
        this.f367725b = c37916k;
        this.f367726c = dVar;
        this.f367727d = eVar;
        String str = v72.f373758c;
        this.f367729f = v72.f373761f;
        this.f367730g = v72.f373757b;
        this.f367731h = v72.f373759d;
        this.f367733j = new Ticker(str, new d(1, this, i.class, "updateTimerVariable", "updateTimerVariable(J)V", 0), new e(1, this, i.class, "updateTimerVariable", "updateTimerVariable(J)V", 0), new f(1, this, i.class, "onEnd", "onEnd(J)V", 0), new g(1, this, i.class, "onTick", "onTick(J)V", 0), dVar);
        v72.f373756a.e(eVar, new a());
        com.yandex.div.json.expressions.b<Long> bVar = v72.f373760e;
        if (bVar == null) {
            return;
        }
        bVar.e(eVar, new b());
    }

    public static final void a(i iVar) {
        Long lA2;
        V7 v72 = iVar.f367724a;
        com.yandex.div.json.expressions.b<Long> bVar = v72.f373756a;
        com.yandex.div.json.expressions.e eVar = iVar.f367727d;
        long jLongValue = bVar.a(eVar).longValue();
        com.yandex.div.json.expressions.b<Long> bVar2 = v72.f373760e;
        if (bVar2 == null || (lA2 = bVar2.a(eVar)) == null) {
            lA2 = null;
        }
        Ticker ticker = iVar.f367733j;
        ticker.f367687h = lA2;
        ticker.f367686g = jLongValue != 0 ? Long.valueOf(jLongValue) : null;
    }

    public final void b(long j12) {
        String str = this.f367729f;
        if (str != null) {
            u uVar = u.f370187a;
            if (!L.f(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                u.f370188b.post(new h(j12));
                return;
            }
            C38029k c38029k = this.f367728e;
            if (c38029k == null) {
                return;
            }
            c38029k.t(str, String.valueOf(j12));
        }
    }
}
