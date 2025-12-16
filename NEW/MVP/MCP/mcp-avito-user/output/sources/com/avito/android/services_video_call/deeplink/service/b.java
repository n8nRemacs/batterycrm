package com.avito.android.services_video_call.deeplink.service;

import AK0.l;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import h31.e;
import j$.time.DesugarLocalDate;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServicesVideoCallService.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_video_call/deeplink/service/b;", "Lcom/avito/android/services_video_call/deeplink/service/a;", "a", "_avito_services-video-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.services_video_call.deeplink.service.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<l> f280692a;

    /* compiled from: ServicesVideoCallService.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/services_video_call/deeplink/service/b$a;", "", "<init>", "()V", "", "INFO_LAST_SHOWN_DATE_KEY", "Ljava/lang/String;", "INFO_SHOWN_COUNTER_KEY", "", "INFO_SHOWN_INTERVAL_IN_DAYS", "I", "INFO_SHOW_LIMIT", "_avito_services-video-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public b(@k e<l> eVar) {
        this.f280692a = eVar;
    }

    @Override // com.avito.android.services_video_call.deeplink.service.a
    public final void a() {
        e<l> eVar = this.f280692a;
        int i12 = eVar.get().getInt("infoShownCounter", 0);
        l lVar = eVar.get();
        lVar.putLong("infoLastShownDate", LocalDate.now().toEpochDay());
        lVar.a(i12 + 1, "infoShownCounter");
    }

    @Override // com.avito.android.services_video_call.deeplink.service.a
    public final boolean b() {
        int i12 = this.f280692a.get().getInt("infoShownCounter", 0);
        long j12 = this.f280692a.get().getLong("infoLastShownDate", 0L);
        return LocalDate.now().compareTo((ChronoLocalDate) ((j12 > 0L ? 1 : (j12 == 0L ? 0 : -1)) == 0 ? DesugarLocalDate.EPOCH : LocalDate.ofEpochDay(j12)).plusDays(7L)) > 0 && i12 < 2;
    }
}
