package com.avito.android.pinch_to_zoom.data;

import AK0.l;
import Y61.k;
import androidx.appcompat.app.r;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.pinch_to_zoom.d;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PinchToZoomStorage.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/pinch_to_zoom/data/a;", "Lcom/avito/android/pinch_to_zoom/d;", "a", "b", "_avito_pinch-to-zoom_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f220000a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final HashMap<PinchToZoomSource, b> f220001b = new HashMap<>();

    /* compiled from: PinchToZoomStorage.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/pinch_to_zoom/data/a$a;", "", "<init>", "()V", "", "MAX_ONBOARDING_SHOWS", "I", "", "MIN_ONBOARDING_INTERVAL", "J", "_avito_pinch-to-zoom_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.pinch_to_zoom.data.a$a, reason: collision with other inner class name */
    public static final class C6613a {
        public /* synthetic */ C6613a(C42822w c42822w) {
            this();
        }

        public C6613a() {
        }
    }

    static {
        new C6613a(null);
    }

    @Inject
    public a(@k l lVar) {
        this.f220000a = lVar;
    }

    @Override // com.avito.android.pinch_to_zoom.d
    public final void a(@k PinchToZoomSource pinchToZoomSource) {
        if (d(pinchToZoomSource).f220002a >= 3) {
            return;
        }
        b bVar = new b(3, 0L, 2, null);
        this.f220001b.put(pinchToZoomSource, bVar);
        String str = "pinch_to_zoom_count_onboarding_shows_v2_" + pinchToZoomSource.name();
        int i12 = bVar.f220002a;
        l lVar = this.f220000a;
        lVar.a(i12, str);
        lVar.putLong("pinch_to_zoom_last_onboarding_display_time_v2_" + pinchToZoomSource.name(), bVar.f220003b);
    }

    @Override // com.avito.android.pinch_to_zoom.d
    public final boolean b(@k PinchToZoomSource pinchToZoomSource) {
        b bVarD = d(pinchToZoomSource);
        return bVarD.f220002a < 3 && System.currentTimeMillis() - bVarD.f220003b > 86400000;
    }

    @Override // com.avito.android.pinch_to_zoom.d
    public final void c(@k PinchToZoomSource pinchToZoomSource) {
        b bVarD = d(pinchToZoomSource);
        int i12 = bVarD.f220002a;
        if (i12 >= 3 || System.currentTimeMillis() - bVarD.f220003b <= 86400000) {
            return;
        }
        b bVar = new b(i12 + 1, 0L, 2, null);
        this.f220001b.put(pinchToZoomSource, bVar);
        String str = "pinch_to_zoom_count_onboarding_shows_v2_" + pinchToZoomSource.name();
        int i13 = bVar.f220002a;
        l lVar = this.f220000a;
        lVar.a(i13, str);
        lVar.putLong("pinch_to_zoom_last_onboarding_display_time_v2_" + pinchToZoomSource.name(), bVar.f220003b);
    }

    public final b d(PinchToZoomSource pinchToZoomSource) {
        HashMap<PinchToZoomSource, b> map = this.f220001b;
        b bVar = map.get(pinchToZoomSource);
        if (bVar != null) {
            return bVar;
        }
        String str = "pinch_to_zoom_count_onboarding_shows_v2_" + pinchToZoomSource.name();
        l lVar = this.f220000a;
        b bVar2 = new b(lVar.getInt(str, 0), lVar.getLong("pinch_to_zoom_last_onboarding_display_time_v2_" + pinchToZoomSource.name(), -1L));
        map.put(pinchToZoomSource, bVar2);
        return bVar2;
    }

    /* compiled from: PinchToZoomStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/pinch_to_zoom/data/a$b;", "", "_avito_pinch-to-zoom_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f220002a;

        /* renamed from: b, reason: collision with root package name */
        public final long f220003b;

        public b(int i12, long j12) {
            this.f220002a = i12;
            this.f220003b = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f220002a == bVar.f220002a && this.f220003b == bVar.f220003b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f220003b) + (Integer.hashCode(this.f220002a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnboardingData(showCount=");
            sb2.append(this.f220002a);
            sb2.append(", lastDisplayTime=");
            return r.u(sb2, this.f220003b, ')');
        }

        public /* synthetic */ b(int i12, long j12, int i13, C42822w c42822w) {
            this(i12, (i13 & 2) != 0 ? System.currentTimeMillis() : j12);
        }
    }
}
