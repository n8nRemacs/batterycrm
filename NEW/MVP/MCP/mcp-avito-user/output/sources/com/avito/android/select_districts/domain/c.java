package com.avito.android.select_districts.domain;

import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectDistrictsConverter_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/domain/c;", "Ldagger/internal/h;", "Lcom/avito/android/select_districts/domain/b;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f266919b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f266920a;

    /* compiled from: SelectDistrictsConverter_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/domain/c$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k u uVar) {
        this.f266920a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f266920a.get();
        f266919b.getClass();
        return new b(dVar);
    }
}
