package com.avito.android.location.perf_location;

import android.location.Address;
import android.location.Geocoder;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.remote.model.Coordinates;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidGeocoderRegionProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location/perf_location/b;", "Lcom/avito/android/location/perf_location/a;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.location.perf_location.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f181813b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f181814a;

    /* compiled from: AndroidGeocoderRegionProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/location/perf_location/b$a;", "", "<init>", "()V", "", "CREATE_FAILED", "Ljava/lang/String;", "FAILED_AFTER_TIRAMISU", "FAILED_BEFORE_TIRAMISU", "SUCCESS_AFTER_TIRAMISU", "SUCCESS_BEFORE_TIRAMISU", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static final String a(a aVar, String str) {
            aVar.getClass();
            return "performance.geocoding.".concat(str);
        }

        public a() {
        }
    }

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f181814a = interfaceC28373a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[Catch: Exception -> 0x007a, TRY_LEAVE, TryCatch #1 {Exception -> 0x007a, blocks: (B:11:0x0026, B:24:0x006d, B:27:0x0076, B:17:0x003c, B:19:0x0042, B:21:0x0067, B:25:0x0070), top: B:34:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.location.perf_location.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k android.content.Context r12, @Y61.k com.avito.android.remote.model.Coordinates r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.avito.android.location.perf_location.d
            if (r0 == 0) goto L13
            r0 = r14
            com.avito.android.location.perf_location.d r0 = (com.avito.android.location.perf_location.d) r0
            int r1 = r0.f181819s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181819s = r1
            goto L18
        L13:
            com.avito.android.location.perf_location.d r0 = new com.avito.android.location.perf_location.d
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f181817q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f181819s
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.C42729a0.b(r14)     // Catch: java.lang.Exception -> L7a
            goto L6d
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            kotlin.C42729a0.b(r14)
            android.location.Geocoder r5 = new android.location.Geocoder     // Catch: java.lang.Exception -> L7b
            java.util.Locale r14 = java.util.Locale.US     // Catch: java.lang.Exception -> L7b
            r5.<init>(r12, r14)     // Catch: java.lang.Exception -> L7b
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L7a
            r14 = 33
            if (r12 <= r14) goto L70
            r0.f181819s = r3     // Catch: java.lang.Exception -> L7a
            kotlin.coroutines.SafeContinuation r12 = new kotlin.coroutines.SafeContinuation     // Catch: java.lang.Exception -> L7a
            kotlin.coroutines.Continuation r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Exception -> L7a
            r12.<init>(r14)     // Catch: java.lang.Exception -> L7a
            double r6 = r13.getLatitude()     // Catch: java.lang.Exception -> L7a
            double r8 = r13.getLongitude()     // Catch: java.lang.Exception -> L7a
            com.avito.android.location.perf_location.c r10 = new com.avito.android.location.perf_location.c     // Catch: java.lang.Exception -> L7a
            r10.<init>(r11, r12)     // Catch: java.lang.Exception -> L7a
            com.avito.android.inline_filters.dialog.group.a.f(r5, r6, r8, r10)     // Catch: java.lang.Exception -> L7a
            java.lang.Object r14 = r12.getOrThrow()     // Catch: java.lang.Exception -> L7a
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Exception -> L7a
            if (r14 != r12) goto L6a
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Exception -> L7a
        L6a:
            if (r14 != r1) goto L6d
            return r1
        L6d:
            android.location.Address r14 = (android.location.Address) r14     // Catch: java.lang.Exception -> L7a
            goto L74
        L70:
            android.location.Address r14 = r11.b(r5, r13)     // Catch: java.lang.Exception -> L7a
        L74:
            if (r14 == 0) goto L7a
            java.lang.String r4 = r14.getAdminArea()     // Catch: java.lang.Exception -> L7a
        L7a:
            return r4
        L7b:
            com.avito.android.analytics.statsd.y$a r12 = new com.avito.android.analytics.statsd.y$a
            com.avito.android.location.perf_location.b$a r13 = com.avito.android.location.perf_location.b.f181813b
            java.lang.String r14 = "create-failed"
            java.lang.String r6 = com.avito.android.location.perf_location.b.a.a(r13, r14)
            r10 = 0
            r7 = 0
            r9 = 2
            r5 = r12
            r5.<init>(r6, r7, r9, r10)
            com.avito.android.analytics.a r13 = r11.f181814a
            r13.c(r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.location.perf_location.b.a(android.content.Context, com.avito.android.remote.model.Coordinates, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Address b(Geocoder geocoder, Coordinates coordinates) throws Exception {
        a aVar = f181813b;
        InterfaceC28373a interfaceC28373a = this.f181814a;
        try {
            List<Address> fromLocation = geocoder.getFromLocation(coordinates.getLatitude(), coordinates.getLongitude(), 1);
            Address address = fromLocation != null ? (Address) C42745f0.G(fromLocation) : null;
            interfaceC28373a.c(new y.a(a.a(aVar, "success-before-13"), 0L, 2, null));
            return address;
        } catch (Exception e12) {
            interfaceC28373a.c(new y.a(a.a(aVar, "location-failed-before-13"), 0L, 2, null));
            throw e12;
        }
    }
}
