package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.gb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38826gb {

    /* renamed from: a, reason: collision with root package name */
    private AbstractRunnableC38787em f380623a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f380624b;

    /* renamed from: c, reason: collision with root package name */
    private final ICommonExecutor f380625c;

    /* renamed from: com.yandex.metrica.impl.ob.gb$a */
    public static final class a extends AbstractRunnableC38787em {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f380627b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C38925kb f380628c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f380629d;

        public a(b bVar, C38925kb c38925kb, long j12) {
            this.f380627b = bVar;
            this.f380628c = c38925kb;
            this.f380629d = j12;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            if (C38826gb.this.f380624b) {
                return;
            }
            this.f380627b.a(true);
            this.f380628c.a();
            C38826gb.this.f380625c.executeDelayed(C38826gb.this.f380623a, this.f380629d, TimeUnit.SECONDS);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.gb$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f380630a;

        public b(boolean z12) {
            this.f380630a = z12;
        }

        public final boolean a() {
            return this.f380630a;
        }

        public /* synthetic */ b(boolean z12, int i12) {
            this((i12 & 1) != 0 ? false : z12);
        }

        public final void a(boolean z12) {
            this.f380630a = z12;
        }
    }

    public C38826gb(@Y61.k Uh uh2, @Y61.k b bVar, @Y61.k kotlin.random.f fVar, @Y61.k ICommonExecutor iCommonExecutor, @Y61.k C38925kb c38925kb) {
        this.f380625c = iCommonExecutor;
        this.f380623a = new a(bVar, c38925kb, uh2.b());
        if (bVar.a()) {
            this.f380623a.run();
        } else {
            iCommonExecutor.executeDelayed(this.f380623a, fVar.k(uh2.a() + 1), TimeUnit.SECONDS);
        }
    }

    public final void a() {
        this.f380624b = true;
        this.f380625c.remove(this.f380623a);
    }
}
