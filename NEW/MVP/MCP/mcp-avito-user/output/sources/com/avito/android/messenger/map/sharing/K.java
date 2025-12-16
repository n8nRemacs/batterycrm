package com.avito.android.messenger.map.sharing;

import KY.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.messenger.map.MapBottomSheet;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: SharingMapView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K;", "Lcom/avito/android/mvi/e;", "Lcom/avito/android/messenger/map/sharing/K$d;", "a", "b", "d", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface K extends com.avito.android.mvi.e<d> {

    /* compiled from: SharingMapView.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final double f196650a;

        /* renamed from: b, reason: collision with root package name */
        public final double f196651b;

        /* renamed from: c, reason: collision with root package name */
        public final float f196652c;

        public a(double d12, double d13, float f12) {
            this.f196650a = d12;
            this.f196651b = d13;
            this.f196652c = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.f196650a, aVar.f196650a) == 0 && Double.compare(this.f196651b, aVar.f196651b) == 0 && Float.compare(this.f196652c, aVar.f196652c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f196652c) + androidx.compose.ui.graphics.colorspace.e.d(Double.hashCode(this.f196650a) * 31, 31, this.f196651b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CameraState(lat=");
            sb2.append(this.f196650a);
            sb2.append(", lon=");
            sb2.append(this.f196651b);
            sb2.append(", zoom=");
            return androidx.appcompat.app.r.k(')', this.f196652c, sb2);
        }
    }

    /* compiled from: SharingMapView.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$b;", "", "a", "b", "c", "Lcom/avito/android/messenger/map/sharing/K$b$a;", "Lcom/avito/android/messenger/map/sharing/K$b$b;", "Lcom/avito/android/messenger/map/sharing/K$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a.c f196653a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final MapBottomSheet.State f196654b;

        /* compiled from: SharingMapView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$b$a;", "Lcom/avito/android/messenger/map/sharing/K$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public static final a f196655c = new a();

            public a() {
                super(a.c.C0577a.f9512a, MapBottomSheet.State.a.f196436a, null);
            }
        }

        /* compiled from: SharingMapView.kt */
        @P
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$b$b;", "Lcom/avito/android/messenger/map/sharing/K$b;", "a", "b", "c", "Lcom/avito/android/messenger/map/sharing/K$b$b$a;", "Lcom/avito/android/messenger/map/sharing/K$b$b$b;", "Lcom/avito/android/messenger/map/sharing/K$b$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.map.sharing.K$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC5784b extends b {

            /* compiled from: SharingMapView.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$b$b$a;", "Lcom/avito/android/messenger/map/sharing/K$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.map.sharing.K$b$b$a */
            public static final class a extends AbstractC5784b {
            }

            /* compiled from: SharingMapView.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$b$b$b;", "Lcom/avito/android/messenger/map/sharing/K$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.map.sharing.K$b$b$b, reason: collision with other inner class name */
            public static final class C5785b extends AbstractC5784b {
            }

            /* compiled from: SharingMapView.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$b$b$c;", "Lcom/avito/android/messenger/map/sharing/K$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.map.sharing.K$b$b$c */
            public static final class c extends AbstractC5784b {
            }

            public AbstractC5784b(MapBottomSheet.State.b bVar, C42822w c42822w) {
                super(a.c.C0577a.f9512a, bVar, null);
            }
        }

        /* compiled from: SharingMapView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$b$c;", "Lcom/avito/android/messenger/map/sharing/K$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b {
        }

        public b(a.c cVar, MapBottomSheet.State state, C42822w c42822w) {
            this.f196653a = cVar;
            this.f196654b = state;
        }

        @Y61.k
        public final String toString() {
            return "ControlsState(connectionErrorIndicatorState=" + this.f196653a + ", bottomSheetState=" + this.f196654b + ')';
        }
    }

    /* compiled from: SharingMapView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c {
    }

    /* compiled from: SharingMapView.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$d;", "", "a", "b", "c", "Lcom/avito/android/messenger/map/sharing/K$d$a;", "Lcom/avito/android/messenger/map/sharing/K$d$b;", "Lcom/avito/android/messenger/map/sharing/K$d$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AvitoMapPoint f196656a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f196657b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final b f196658c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f196659d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f196660e;

        /* compiled from: SharingMapView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$d$a;", "Lcom/avito/android/messenger/map/sharing/K$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends d {

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final a f196661f;

            public a(@Y61.l AvitoMapPoint avitoMapPoint, boolean z12, @Y61.k String str, boolean z13, @Y61.l a aVar) {
                super(avitoMapPoint, z12, new b.AbstractC5784b.a(new MapBottomSheet.State.b("", Collections.singletonList(str), false, MapBottomSheet.State.ActionButtonState.f196432c, true, false, 32, null), null), str, z13, null);
                this.f196661f = aVar;
            }

            @Override // com.avito.android.messenger.map.sharing.K.d
            @Y61.k
            public final d a(boolean z12) {
                return new a(this.f196656a, this.f196657b, this.f196659d, z12, this.f196661f);
            }

            @Override // com.avito.android.messenger.map.sharing.K.d
            public final d b(AvitoMapPoint avitoMapPoint) {
                return new a(avitoMapPoint, this.f196657b, this.f196659d, this.f196660e, this.f196661f);
            }

            @Y61.k
            public final String toString() {
                return C43066x.F0("State.Dragging(\n                    |   userPoint=" + this.f196656a + ",\n                    |   isApproximate=" + this.f196657b + ",\n                    |   controlsState=" + this.f196658c + ",\n                    |   bottomSheetTitle=" + this.f196659d + ",\n                    |   awaitingNewUserLocation=" + this.f196660e + ",\n                    |   prevCameraState=" + this.f196661f + "\n                    |)");
            }
        }

        /* compiled from: SharingMapView.kt */
        @P
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$d$c;", "Lcom/avito/android/messenger/map/sharing/K$d;", "a", "b", "c", "Lcom/avito/android/messenger/map/sharing/K$d$c$a;", "Lcom/avito/android/messenger/map/sharing/K$d$c$b;", "Lcom/avito/android/messenger/map/sharing/K$d$c$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class c extends d {

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final MessageBody.Location f196663f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final a f196664g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f196665h;

            /* compiled from: SharingMapView.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$d$c$a;", "Lcom/avito/android/messenger/map/sharing/K$d$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a extends c {
                public a(@Y61.k MessageBody.Location location, @Y61.k a aVar, @Y61.l AvitoMapPoint avitoMapPoint, boolean z12, @Y61.k a.c.b.C0578a c0578a, @Y61.k String str, boolean z13, boolean z14) {
                    super(location, aVar, avitoMapPoint, z12, new b.c(c0578a, MapBottomSheet.State.a.f196436a, null), str, z13, z14, null);
                }

                @Override // com.avito.android.messenger.map.sharing.K.d
                @Y61.k
                public final d a(boolean z12) {
                    return new a(this.f196663f, this.f196664g, this.f196656a, this.f196657b, (a.c.b.C0578a) this.f196658c.f196653a, this.f196659d, z12, this.f196665h);
                }

                @Override // com.avito.android.messenger.map.sharing.K.d
                public final d b(AvitoMapPoint avitoMapPoint) {
                    boolean z12 = this.f196657b;
                    a.c.b.C0578a c0578a = (a.c.b.C0578a) this.f196658c.f196653a;
                    return new a(this.f196663f, this.f196664g, avitoMapPoint, z12, c0578a, this.f196659d, this.f196660e, this.f196665h);
                }

                @Override // com.avito.android.messenger.map.sharing.K.d.c
                @Y61.k
                public final d c() {
                    return new a(this.f196663f, this.f196664g, this.f196656a, this.f196657b, (a.c.b.C0578a) this.f196658c.f196653a, this.f196659d, this.f196660e, false);
                }
            }

            /* compiled from: SharingMapView.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$d$c$b;", "Lcom/avito/android/messenger/map/sharing/K$d$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class b extends c {
                public b(@Y61.k MessageBody.Location location, @Y61.k a aVar, @Y61.l AvitoMapPoint avitoMapPoint, boolean z12, @Y61.k String str, boolean z13, boolean z14) {
                    super(location, aVar, avitoMapPoint, z12, new b.AbstractC5784b.C5785b(new MapBottomSheet.State.b("", Collections.singletonList(str), false, MapBottomSheet.State.ActionButtonState.f196431b, true, false, 32, null), null), str, z13, z14, null);
                }

                @Override // com.avito.android.messenger.map.sharing.K.d
                @Y61.k
                public final d a(boolean z12) {
                    return new b(this.f196663f, this.f196664g, this.f196656a, this.f196657b, this.f196659d, z12, this.f196665h);
                }

                @Override // com.avito.android.messenger.map.sharing.K.d
                public final d b(AvitoMapPoint avitoMapPoint) {
                    boolean z12 = this.f196657b;
                    return new b(this.f196663f, this.f196664g, avitoMapPoint, z12, this.f196659d, this.f196660e, this.f196665h);
                }

                @Override // com.avito.android.messenger.map.sharing.K.d.c
                @Y61.k
                public final d c() {
                    return new b(this.f196663f, this.f196664g, this.f196656a, this.f196657b, this.f196659d, this.f196660e, false);
                }

                @Override // com.avito.android.messenger.map.sharing.K.d.c
                @Y61.k
                public final String toString() {
                    return C43066x.F0("State.Static.Loaded(\n                    |geoPosition=" + this.f196663f + ",\n                    |cameraState=" + this.f196664g + ",\n                    |controlsState=" + this.f196658c + ",\n                    |bottomSheetTitle=" + this.f196659d + ",\n                    |awaitingNewUserLocation=" + this.f196660e + ",\n                    |forceMoveCamera=" + this.f196665h + "\n                    |)");
                }
            }

            /* compiled from: SharingMapView.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$d$c$c;", "Lcom/avito/android/messenger/map/sharing/K$d$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.map.sharing.K$d$c$c, reason: collision with other inner class name */
            public static final class C5786c extends c {
                public C5786c(@Y61.k MessageBody.Location location, @Y61.k a aVar, @Y61.l AvitoMapPoint avitoMapPoint, boolean z12, @Y61.k String str, boolean z13, boolean z14) {
                    super(location, aVar, avitoMapPoint, z12, new b.AbstractC5784b.c(new MapBottomSheet.State.b("", Collections.singletonList(str), false, MapBottomSheet.State.ActionButtonState.f196433d, true, false, 32, null), null), str, z13, z14, null);
                }

                @Override // com.avito.android.messenger.map.sharing.K.d
                @Y61.k
                public final d a(boolean z12) {
                    return new C5786c(this.f196663f, this.f196664g, this.f196656a, this.f196657b, this.f196659d, z12, this.f196665h);
                }

                @Override // com.avito.android.messenger.map.sharing.K.d
                public final d b(AvitoMapPoint avitoMapPoint) {
                    boolean z12 = this.f196657b;
                    return new C5786c(this.f196663f, this.f196664g, avitoMapPoint, z12, this.f196659d, this.f196660e, this.f196665h);
                }

                @Override // com.avito.android.messenger.map.sharing.K.d.c
                @Y61.k
                public final d c() {
                    return new C5786c(this.f196663f, this.f196664g, this.f196656a, this.f196657b, this.f196659d, this.f196660e, false);
                }

                @Override // com.avito.android.messenger.map.sharing.K.d.c
                @Y61.k
                public final String toString() {
                    return C43066x.F0("State.Static.Loading(\n                    |geoPosition=" + this.f196663f + ",\n                    |cameraState=" + this.f196664g + ",\n                    |controlsState=" + this.f196658c + ",\n                    |bottomSheetTitle=" + this.f196659d + ",\n                    |awaitingNewUserLocation=" + this.f196660e + ",\n                    |forceMoveCamera=" + this.f196665h + "\n                    |)");
                }
            }

            public c(MessageBody.Location location, a aVar, AvitoMapPoint avitoMapPoint, boolean z12, b bVar, String str, boolean z13, boolean z14, C42822w c42822w) {
                super(avitoMapPoint, z12, bVar, str, z13, null);
                this.f196663f = location;
                this.f196664g = aVar;
                this.f196665h = z14;
            }

            @Y61.k
            public abstract d c();

            @Y61.k
            public String toString() {
                return C43066x.F0("State.Static.Error(\n                    |geoPosition=" + this.f196663f + ",\n                    |cameraState=" + this.f196664g + ",\n                    |controlsState=" + this.f196658c + ",\n                    |bottomSheetTitle=" + this.f196659d + ",\n                    |awaitingNewUserLocation=" + this.f196660e + "\n                    |)");
            }
        }

        public d(AvitoMapPoint avitoMapPoint, boolean z12, b bVar, String str, boolean z13, C42822w c42822w) {
            this.f196656a = avitoMapPoint;
            this.f196657b = z12;
            this.f196658c = bVar;
            this.f196659d = str;
            this.f196660e = z13;
        }

        @Y61.k
        public abstract d a(boolean z12);

        @Y61.k
        public abstract d b(@Y61.l AvitoMapPoint avitoMapPoint);

        /* compiled from: SharingMapView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$d$b;", "Lcom/avito/android/messenger/map/sharing/K$d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends d {

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public static final b f196662f = new b();

            public b() {
                super(null, false, b.a.f196655c, "", false, null);
            }

            @Y61.k
            public final String toString() {
                return C43066x.F0("State.Empty(\n                    |userPoint=" + this.f196656a + ",\n                    |isApproximate=" + this.f196657b + ",\n                    |controlsState=" + this.f196658c + ",\n                    |bottomSheetTitle=" + this.f196659d + ",\n                    |awaitingNewUserLocation=" + this.f196660e + "\n                    |)");
            }

            @Override // com.avito.android.messenger.map.sharing.K.d
            @Y61.k
            public final d a(boolean z12) {
                return this;
            }

            @Override // com.avito.android.messenger.map.sharing.K.d
            @Y61.k
            public final d b(@Y61.l AvitoMapPoint avitoMapPoint) {
                return this;
            }
        }
    }
}
