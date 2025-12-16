package com.avito.android.bxcontent.beduin_v2.wrapper;

import com.avito.android.remote.model.SerpBannerContainer;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.i;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import ob.C44744h;

/* compiled from: BxWrapperSerpItemConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/i;", "Lcom/avito/android/bxcontent/beduin_v2/wrapper/h;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f109608a;

    /* compiled from: BxWrapperSerpItemConverter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/serp/i;", "invoke", "()Lcom/avito/android/serp/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.android.serp.i> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<com.avito.android.serp.i> f109609l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<? extends com.avito.android.serp.i> aVar) {
            super(0);
            this.f109609l = aVar;
        }

        @Override // Y41.a
        public final com.avito.android.serp.i invoke() {
            return this.f109609l.invoke();
        }
    }

    @Inject
    public i(@Y61.k Y41.a<? extends com.avito.android.serp.i> aVar) {
        this.f109608a = C42727D.c(new a(aVar));
    }

    @Override // com.avito.android.bxcontent.beduin_v2.wrapper.h
    @Y61.l
    public final l1 a(@Y61.k k kVar) {
        Object objB = kVar.f109612b;
        if (objB == null) {
            return null;
        }
        com.avito.android.serp.i iVar = (com.avito.android.serp.i) this.f109608a.getValue();
        if (objB instanceof SerpBannerContainer) {
            objB = C44744h.b((SerpBannerContainer) objB);
        }
        List listA = i.a.a(iVar, Collections.singletonList(objB), SerpDisplayType.Grid, null, null, false, null, 124);
        if (listA.isEmpty()) {
            return null;
        }
        return (l1) C42745f0.E(listA);
    }
}
