package com.yandex.div.core.view2.errors;

import com.yandex.div.core.dagger.A;
import com.yandex.div.core.dagger.B;
import com.yandex.div.core.view2.C38023e;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.e0;
import com.yandex.div.core.view2.errors.i;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ErrorVisualMonitor.kt */
@A
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/errors/p;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e0 f369097a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f369098b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i f369099c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public C38029k f369100d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public n f369101e;

    /* compiled from: ErrorVisualMonitor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div/core/view2/e;", "it", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div/core/view2/e;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.l<C38023e, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C38023e c38023e) {
            C38023e c38023e2 = c38023e;
            i iVar = p.this.f369099c;
            c cVar = iVar.f369078e;
            if (cVar != null) {
                cVar.close();
            }
            q21.c cVar2 = c38023e2.f369054a;
            d dVarA = iVar.f369074a.a(c38023e2.f369055b, cVar2);
            Y41.p<List<? extends Throwable>, List<? extends Throwable>, G0> pVar = iVar.f369079f;
            dVarA.f369066a.add(pVar);
            i.a aVar = (i.a) pVar;
            aVar.invoke(dVarA.f369069d, dVarA.f369070e);
            iVar.f369078e = new c(dVarA, aVar, 0);
            return G0.f406611a;
        }
    }

    @Inject
    public p(@Y61.k f fVar, @B boolean z12, @Y61.k e0 e0Var) {
        this.f369097a = e0Var;
        this.f369098b = z12;
        this.f369099c = new i(fVar);
        b();
    }

    public final void a(@Y61.k C38029k c38029k) {
        this.f369100d = c38029k;
        if (this.f369098b) {
            n nVar = this.f369101e;
            if (nVar != null) {
                nVar.close();
            }
            this.f369101e = new n(c38029k, this.f369099c);
        }
    }

    public final void b() {
        if (!this.f369098b) {
            n nVar = this.f369101e;
            if (nVar != null) {
                nVar.close();
            }
            this.f369101e = null;
            return;
        }
        a aVar = new a();
        e0 e0Var = this.f369097a;
        aVar.invoke(e0Var.f369056a);
        e0Var.f369057b.add(aVar);
        C38029k c38029k = this.f369100d;
        if (c38029k == null) {
            return;
        }
        a(c38029k);
    }
}
