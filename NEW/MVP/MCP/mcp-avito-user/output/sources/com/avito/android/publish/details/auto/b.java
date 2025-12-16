package com.avito.android.publish.details.auto;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RollbackValuesInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/auto/b;", "Lcom/avito/android/publish/details/auto/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.details.auto.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.details.a f233493a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.publish.details.auto.storage.factory.a f233494b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f233495c = C42727D.c(new a());

    /* compiled from: RollbackValuesInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "LTd0/c;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<Set<? extends Td0.c>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Set<? extends Td0.c> invoke() {
            b bVar = b.this;
            com.avito.android.publish.details.auto.storage.factory.a aVar = bVar.f233494b;
            com.avito.android.details.a aVar2 = bVar.f233493a;
            return aVar.a(aVar2.wa(), aVar2.C0());
        }
    }

    @Inject
    public b(@k com.avito.android.details.a aVar, @k com.avito.android.publish.details.auto.storage.factory.a aVar2) {
        this.f233493a = aVar;
        this.f233494b = aVar2;
    }

    @Override // com.avito.android.publish.details.auto.a
    public final void a() {
        Iterator it = ((Set) this.f233495c.getValue()).iterator();
        while (it.hasNext()) {
            ((Td0.c) it.next()).b();
        }
    }

    @Override // com.avito.android.publish.details.auto.a
    public final void b() {
        Iterator it = ((Set) this.f233495c.getValue()).iterator();
        while (it.hasNext()) {
            ((Td0.c) it.next()).a();
        }
    }
}
