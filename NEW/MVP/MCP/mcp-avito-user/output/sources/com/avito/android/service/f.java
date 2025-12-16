package com.avito.android.service;

import Y61.k;
import com.avito.android.service.d;
import dagger.internal.h;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceCountdownHandlerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service/f;", "Ldagger/internal/h;", "Lcom/avito/android/service/e;", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements h<e> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f274016c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f274017a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f274018b;

    /* compiled from: ServiceCountdownHandlerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service/f$a;", "", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k l lVar, @k l lVar2) {
        this.f274017a = lVar;
        this.f274018b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f274017a.f393949a;
        d.a aVar = (d.a) this.f274018b.f393949a;
        f274016c.getClass();
        return new e(str, aVar);
    }
}
