package com.avito.android.remote.error;

import dagger.internal.A;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CommonErrorsParser_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/error/m;", "Ldagger/internal/h;", "Lcom/avito/android/remote/error/k;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253435b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A f253436a;

    /* compiled from: CommonErrorsParser_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/error/m$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public m(@Y61.k A a12) {
        this.f253436a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f253436a.get();
        f253435b.getClass();
        return new k(set);
    }
}
