package com.yandex.div.core.state;

import androidx.collection.C20199a;
import com.yandex.div.core.dagger.z;
import j.InterfaceC42148d;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;

/* compiled from: DivStateManager.kt */
@z
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/state/d;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@InterfaceC42148d
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.state.a f367656a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n f367657b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C20199a<q21.c, k> f367658c = new C20199a<>();

    @Inject
    public d(@Y61.k com.yandex.div.state.a aVar, @Y61.k n nVar) {
        this.f367656a = aVar;
        this.f367657b = nVar;
    }

    @Y61.l
    public final k a(@Y61.k q21.c cVar) {
        k kVar;
        synchronized (this.f367658c) {
            kVar = this.f367658c.get(cVar);
            if (kVar == null) {
                String strB = this.f367656a.b(cVar.f428995a);
                kVar = strB == null ? null : new k(Long.parseLong(strB));
                this.f367658c.put(cVar, kVar);
            }
        }
        return kVar;
    }

    public final void b(@Y61.k q21.c cVar, long j12, boolean z12) {
        if (q21.c.f428994b.equals(cVar)) {
            return;
        }
        synchronized (this.f367658c) {
            try {
                k kVarA = a(cVar);
                this.f367658c.put(cVar, kVarA == null ? new k(j12) : new k(j12, kVarA.f367667b));
                this.f367657b.a(cVar.f428995a, "/", String.valueOf(j12));
                if (!z12) {
                    this.f367656a.c(cVar.f428995a, String.valueOf(j12));
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@Y61.k String str, @Y61.k f fVar, boolean z12) {
        String strA = fVar.a();
        List<Q<String, String>> list = fVar.f367663b;
        String str2 = list.isEmpty() ? null : (String) ((Q) C42745f0.Q(list)).f406620c;
        if (strA == null || str2 == null) {
            return;
        }
        synchronized (this.f367658c) {
            try {
                this.f367657b.a(str, strA, str2);
                if (!z12) {
                    this.f367656a.a(str, strA, str2);
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
