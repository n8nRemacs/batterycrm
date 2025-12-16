package com.avito.android.messenger.map.viewing.view;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.avito_map.AvitoMapCameraUpdate;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.messenger.map.MapBottomSheet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: PlatformMapView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/map/viewing/view/d;", "Lcom/avito/android/mvi/e;", "Lcom/avito/android/messenger/map/viewing/view/d$b;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d extends com.avito.android.mvi.e<b> {

    /* compiled from: PlatformMapView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: PlatformMapView.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/view/d$b;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: i, reason: collision with root package name */
        @k
        public static final a f196868i = new a(null);

        /* renamed from: j, reason: collision with root package name */
        @k
        public static final b f196869j = new b(B0.f406639b, MapBottomSheet.State.a.f196436a, null, null, false, false, false, false);

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Set<com.avito.android.messenger.map.viewing.view.a> f196870a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MapBottomSheet.State f196871b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AvitoMapCameraUpdate f196872c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AvitoMapPoint f196873d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f196874e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f196875f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f196876g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f196877h;

        /* compiled from: PlatformMapView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/map/viewing/view/d$b$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public b(@k Set<com.avito.android.messenger.map.viewing.view.a> set, @k MapBottomSheet.State state, @l AvitoMapCameraUpdate avitoMapCameraUpdate, @l AvitoMapPoint avitoMapPoint, boolean z12, boolean z13, boolean z14, boolean z15) {
            this.f196870a = set;
            this.f196871b = state;
            this.f196872c = avitoMapCameraUpdate;
            this.f196873d = avitoMapPoint;
            this.f196874e = z12;
            this.f196875f = z13;
            this.f196876g = z14;
            this.f196877h = z15;
        }

        public static b a(b bVar, Set set, MapBottomSheet.State state, AvitoMapCameraUpdate avitoMapCameraUpdate, AvitoMapPoint avitoMapPoint, boolean z12, boolean z13, boolean z14, boolean z15, int i12) {
            Set set2 = (i12 & 1) != 0 ? bVar.f196870a : set;
            MapBottomSheet.State state2 = (i12 & 2) != 0 ? bVar.f196871b : state;
            AvitoMapCameraUpdate avitoMapCameraUpdate2 = (i12 & 4) != 0 ? bVar.f196872c : avitoMapCameraUpdate;
            AvitoMapPoint avitoMapPoint2 = (i12 & 8) != 0 ? bVar.f196873d : avitoMapPoint;
            boolean z16 = (i12 & 16) != 0 ? bVar.f196874e : z12;
            boolean z17 = (i12 & 32) != 0 ? bVar.f196875f : z13;
            boolean z18 = (i12 & 64) != 0 ? bVar.f196876g : z14;
            boolean z19 = (i12 & 128) != 0 ? bVar.f196877h : z15;
            bVar.getClass();
            return new b(set2, state2, avitoMapCameraUpdate2, avitoMapPoint2, z16, z17, z18, z19);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f196870a, bVar.f196870a) && L.f(this.f196871b, bVar.f196871b) && L.f(this.f196872c, bVar.f196872c) && L.f(this.f196873d, bVar.f196873d) && this.f196874e == bVar.f196874e && this.f196875f == bVar.f196875f && this.f196876g == bVar.f196876g && this.f196877h == bVar.f196877h;
        }

        public final int hashCode() {
            int iHashCode = (this.f196871b.hashCode() + (this.f196870a.hashCode() * 31)) * 31;
            AvitoMapCameraUpdate avitoMapCameraUpdate = this.f196872c;
            int iHashCode2 = (iHashCode + (avitoMapCameraUpdate == null ? 0 : avitoMapCameraUpdate.hashCode())) * 31;
            AvitoMapPoint avitoMapPoint = this.f196873d;
            return Boolean.hashCode(this.f196877h) + r.i(r.i(r.i((iHashCode2 + (avitoMapPoint != null ? avitoMapPoint.hashCode() : 0)) * 31, 31, this.f196874e), 31, this.f196875f), 31, this.f196876g);
        }

        @k
        public final String toString() {
            return C43066x.F0("State(\n                |   pins=" + this.f196870a + ",\n                |   bottomSheetState=" + this.f196871b + ",\n                |   cameraUpdate=" + this.f196872c + ",\n                |   isDragging=" + this.f196875f + ",\n                |   awaitingNewUserLocation=" + this.f196876g + ",\n                |   forceMoveCamera=" + this.f196877h + "\n                |)");
        }
    }
}
