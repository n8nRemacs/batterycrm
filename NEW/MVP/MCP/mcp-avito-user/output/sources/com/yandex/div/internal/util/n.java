package com.yandex.div.internal.util;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SingleThreadExecutor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/util/n;", "", "a", "utils_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f370180a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public a f370181b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public ArrayList f370182c;

    /* compiled from: SingleThreadExecutor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/util/n$a;", "Lcom/yandex/div/internal/util/k;", "utils_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class a extends k {
        public a() {
            n.this.getClass();
        }

        @Override // com.yandex.div.internal.util.k
        public final void a() {
            ArrayList arrayList;
            n nVar = n.this;
            synchronized (nVar.f370180a) {
                if (L.f(nVar.f370181b, this) && (arrayList = nVar.f370182c) != null) {
                    nVar.f370182c = null;
                    G0 g02 = G0.f406611a;
                    boolean z12 = true;
                    while (z12) {
                        if (arrayList != null) {
                            try {
                                n nVar2 = n.this;
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((Runnable) it.next()).run();
                                    } catch (RuntimeException unused) {
                                        nVar2.getClass();
                                    }
                                }
                            } catch (Throwable th2) {
                                n nVar3 = n.this;
                                synchronized (nVar3.f370180a) {
                                    nVar3.f370181b = null;
                                    G0 g03 = G0.f406611a;
                                    throw th2;
                                }
                            }
                        }
                        n nVar4 = n.this;
                        synchronized (nVar4.f370180a) {
                            ArrayList arrayList2 = nVar4.f370182c;
                            if (arrayList2 != null) {
                                nVar4.f370182c = null;
                                arrayList = arrayList2;
                            } else {
                                nVar4.f370181b = null;
                                z12 = false;
                            }
                            G0 g04 = G0.f406611a;
                        }
                    }
                }
            }
        }
    }

    public final void a(@Y61.k com.yandex.android.beacon.j jVar) {
        a aVar;
        synchronized (this.f370180a) {
            try {
                if (this.f370182c == null) {
                    this.f370182c = new ArrayList(2);
                }
                ArrayList arrayList = this.f370182c;
                if (arrayList != null) {
                    arrayList.add(jVar);
                }
                if (this.f370181b == null) {
                    aVar = new a();
                    this.f370181b = aVar;
                } else {
                    aVar = null;
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            throw null;
        }
    }
}
