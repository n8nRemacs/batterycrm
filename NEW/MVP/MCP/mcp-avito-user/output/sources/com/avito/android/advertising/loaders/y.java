package com.avito.android.advertising.loaders;

import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CommercialGaidProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/y;", "Lcom/avito/android/advertising/loaders/x;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics_adjust.u f88493a;

    /* renamed from: b, reason: collision with root package name */
    public int f88494b = 2;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f88495c;

    /* compiled from: CommercialGaidProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            y.this.f88495c = (String) obj;
        }
    }

    /* compiled from: CommercialGaidProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            y yVar = y.this;
            yVar.f88494b--;
        }
    }

    @Inject
    public y(@Y61.k com.avito.android.analytics_adjust.u uVar) {
        this.f88493a = uVar;
    }

    @Override // com.avito.android.advertising.loaders.x
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getF88495c() {
        return this.f88495c;
    }

    @Override // com.avito.android.advertising.loaders.x
    @Y61.k
    public final I<String> b() {
        String str = this.f88495c;
        return str != null ? I.q(str) : this.f88494b <= 0 ? I.l(new Throwable("Too many failed attempts")) : this.f88493a.a().k(new a()).i(new b());
    }
}
