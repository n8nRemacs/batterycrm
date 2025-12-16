package com.avito.android.legal_request.mvi;

import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LegalRequestActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/legal_request/mvi/e;", "Ldagger/internal/h;", "Lcom/avito/android/legal_request/mvi/d;", "a", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f175267c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f175268a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C31151u0 f175269b;

    /* compiled from: LegalRequestActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/legal_request/mvi/e$a;", "", "<init>", "()V", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k dagger.internal.l lVar, @Y61.k C31151u0 c31151u0) {
        this.f175268a = lVar;
        this.f175269b = c31151u0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f175268a.f393949a;
        ZS.b bVar = (ZS.b) this.f175269b.get();
        f175267c.getClass();
        return new d(str, bVar);
    }
}
