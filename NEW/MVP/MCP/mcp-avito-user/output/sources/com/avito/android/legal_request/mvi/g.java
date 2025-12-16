package com.avito.android.legal_request.mvi;

import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LegalRequestBootstrap_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/legal_request/mvi/g;", "Ldagger/internal/h;", "Lcom/avito/android/legal_request/mvi/f;", "a", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f175275c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f175276a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C31151u0 f175277b;

    /* compiled from: LegalRequestBootstrap_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/legal_request/mvi/g$a;", "", "<init>", "()V", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k dagger.internal.l lVar, @Y61.k C31151u0 c31151u0) {
        this.f175276a = lVar;
        this.f175277b = c31151u0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f175276a.f393949a;
        ZS.b bVar = (ZS.b) this.f175277b.get();
        f175275c.getClass();
        return new f(str, bVar);
    }
}
