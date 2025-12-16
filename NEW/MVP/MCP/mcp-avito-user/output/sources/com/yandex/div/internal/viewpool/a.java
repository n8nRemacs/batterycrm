package com.yandex.div.internal.viewpool;

import Y61.k;
import Y61.l;
import android.os.Handler;
import android.view.View;
import androidx.collection.C20199a;
import com.yandex.div.internal.viewpool.c;
import com.yandex.div.internal.viewpool.f;
import com.yandex.div.internal.viewpool.i;
import j.InterfaceC42148d;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvanceViewPool.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/viewpool/a;", "Lcom/yandex/div/internal/viewpool/h;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final i f370190a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f370191b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C20199a f370192c = new C20199a();

    /* compiled from: AdvanceViewPool.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/internal/viewpool/a$a;", "Landroid/view/View;", "T", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.internal.viewpool.a$a, reason: collision with other inner class name */
    public static final class C10927a<T extends View> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f370193a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final i f370194b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final g<T> f370195c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final f f370196d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ArrayBlockingQueue f370197e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final AtomicBoolean f370198f = new AtomicBoolean(false);

        /* renamed from: g, reason: collision with root package name */
        public final boolean f370199g;

        /* compiled from: AdvanceViewPool.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/viewpool/a$a$a;", "", "<init>", "()V", "", "MAX_WAITING_TIME", "J", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.internal.viewpool.a$a$a, reason: collision with other inner class name */
        public static final class C10928a {
            public /* synthetic */ C10928a(C42822w c42822w) {
                this();
            }

            public C10928a() {
            }
        }

        static {
            new C10928a(null);
        }

        public C10927a(@k String str, @l i iVar, @k g<T> gVar, @k f fVar, int i12) {
            this.f370193a = str;
            this.f370194b = iVar;
            this.f370195c = gVar;
            this.f370196d = fVar;
            this.f370197e = new ArrayBlockingQueue(i12, false);
            this.f370199g = !r1.isEmpty();
            int i13 = 0;
            while (i13 < i12) {
                i13++;
                this.f370196d.f370210a.f370216c.offer(new f.b(this, 0));
            }
        }
    }

    public a(@l i iVar, @k f fVar) {
        this.f370190a = iVar;
        this.f370191b = fVar;
    }

    @Override // com.yandex.div.internal.viewpool.h
    @InterfaceC42148d
    public final <T extends View> void a(@k String str, @k g<T> gVar, int i12) {
        synchronized (this.f370192c) {
            if (this.f370192c.containsKey(str)) {
                return;
            }
            this.f370192c.put(str, new C10927a(str, this.f370190a, gVar, this.f370191b, i12));
            G0 g02 = G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.internal.viewpool.h
    @k
    @InterfaceC42148d
    public final <T extends View> T b(@k String str) {
        C10927a<?> c10927a;
        View viewA;
        synchronized (this.f370192c) {
            V v12 = this.f370192c.get(str);
            if (v12 == 0) {
                throw new NoSuchElementException("Factory is not registered");
            }
            c10927a = (C10927a) v12;
        }
        long jNanoTime = System.nanoTime();
        Object objPoll = c10927a.f370197e.poll();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (objPoll == null) {
            long jNanoTime3 = System.nanoTime();
            g<T> gVar = c10927a.f370195c;
            try {
                c10927a.f370196d.a(c10927a);
                View viewA2 = (View) c10927a.f370197e.poll(16L, TimeUnit.MILLISECONDS);
                if (viewA2 == null) {
                    viewA2 = gVar.a();
                }
                viewA = viewA2;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                viewA = gVar.a();
            }
            long jNanoTime4 = System.nanoTime() - jNanoTime3;
            i iVar = c10927a.f370194b;
            if (iVar != null) {
                String str2 = c10927a.f370193a;
                synchronized (iVar.f370219b) {
                    c cVar = iVar.f370219b;
                    c.a aVar = cVar.f370204a;
                    aVar.f370207a += jNanoTime4;
                    aVar.f370208b++;
                    C20199a<String, c.a> c20199a = cVar.f370206c;
                    c.a aVar2 = c20199a.get(str2);
                    if (aVar2 == null) {
                        aVar2 = new c.a();
                        c20199a.put(str2, aVar2);
                    }
                    c.a aVar3 = aVar2;
                    aVar3.f370207a += jNanoTime4;
                    aVar3.f370208b++;
                    i.a aVar4 = iVar.f370220c;
                    Handler handler = iVar.f370221d;
                    if (!aVar4.f370222b) {
                        handler.post(aVar4);
                        aVar4.f370222b = true;
                    }
                    G0 g02 = G0.f406611a;
                }
            }
            objPoll = viewA;
        } else {
            i iVar2 = c10927a.f370194b;
            if (iVar2 != null) {
                synchronized (iVar2.f370219b) {
                    c.a aVar5 = iVar2.f370219b.f370204a;
                    aVar5.f370207a += jNanoTime2;
                    aVar5.f370208b++;
                    i.a aVar6 = iVar2.f370220c;
                    Handler handler2 = iVar2.f370221d;
                    if (!aVar6.f370222b) {
                        handler2.post(aVar6);
                        aVar6.f370222b = true;
                    }
                    G0 g03 = G0.f406611a;
                }
            }
        }
        long jNanoTime5 = System.nanoTime();
        c10927a.f370196d.f370210a.f370216c.offer(new f.b(c10927a, c10927a.f370197e.size()));
        long jNanoTime6 = System.nanoTime() - jNanoTime5;
        i iVar3 = c10927a.f370194b;
        if (iVar3 != null) {
            synchronized (iVar3.f370219b) {
                c cVar2 = iVar3.f370219b;
                cVar2.f370204a.f370207a += jNanoTime6;
                if (jNanoTime6 >= 1000000) {
                    c.a aVar7 = cVar2.f370205b;
                    aVar7.f370207a += jNanoTime6;
                    aVar7.f370208b++;
                }
                i.a aVar8 = iVar3.f370220c;
                Handler handler3 = iVar3.f370221d;
                if (!aVar8.f370222b) {
                    handler3.post(aVar8);
                    aVar8.f370222b = true;
                }
                G0 g04 = G0.f406611a;
            }
        }
        return (T) objPoll;
    }
}
