package com.avito.android.service_booking_persistence;

import AK0.l;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceBookingBannersStorageImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_persistence/c;", "Lcom/avito/android/service_booking_persistence/b;", "a", "_avito_service-booking-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f277484a;

    /* compiled from: ServiceBookingBannersStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_persistence/c$a;", "", "<init>", "()V", "", "FOREVER", "Ljava/lang/String;", "_avito_service-booking-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@k l lVar) {
        this.f277484a = lVar;
    }

    @Override // com.avito.android.service_booking_persistence.b
    public final boolean a(@k String str) {
        return this.f277484a.c(str.concat("_forever"));
    }

    @Override // com.avito.android.service_booking_persistence.b
    public final void b(long j12, @k String str) {
        this.f277484a.putLong(str, j12);
    }

    @Override // com.avito.android.service_booking_persistence.b
    public final long c(@k String str) {
        return this.f277484a.getLong(str, 0L);
    }

    @Override // com.avito.android.service_booking_persistence.b
    public final void d(@k String str, boolean z12) {
        this.f277484a.putBoolean(str.concat("_forever"), z12);
    }
}
