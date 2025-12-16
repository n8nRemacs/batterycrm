package xQ0;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.avcalls.android.call.models.CallDirection;
import com.avito.avcalls.android.call.models.CallMetaInfo;
import com.avito.avcalls.android.video.CameraPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CallState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LxQ0/b;", "", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f442468a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f442469b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CallDirection f442470c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final f f442471d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h f442472e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final j f442473f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f442474g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f442475h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final CameraPosition f442476i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f442477j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final CallMetaInfo f442478k;

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxQ0/b$a;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xQ0.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    public b(@Y61.k String str, @Y61.k String str2, @Y61.k CallDirection callDirection, @Y61.k f fVar, @Y61.k h hVar, @Y61.k j jVar, boolean z12, boolean z13, @Y61.k CameraPosition cameraPosition, boolean z14, @Y61.k CallMetaInfo callMetaInfo) {
        this.f442468a = str;
        this.f442469b = str2;
        this.f442470c = callDirection;
        this.f442471d = fVar;
        this.f442472e = hVar;
        this.f442473f = jVar;
        this.f442474g = z12;
        this.f442475h = z13;
        this.f442476i = cameraPosition;
        this.f442477j = z14;
        this.f442478k = callMetaInfo;
    }

    public static b a(b bVar, f fVar, h hVar, j jVar, boolean z12, CameraPosition cameraPosition, boolean z13, CallMetaInfo callMetaInfo, int i12) {
        String str = bVar.f442468a;
        String str2 = bVar.f442469b;
        CallDirection callDirection = bVar.f442470c;
        f fVar2 = (i12 & 8) != 0 ? bVar.f442471d : fVar;
        h hVar2 = (i12 & 16) != 0 ? bVar.f442472e : hVar;
        j jVar2 = (i12 & 32) != 0 ? bVar.f442473f : jVar;
        boolean z14 = bVar.f442474g;
        boolean z15 = (i12 & 128) != 0 ? bVar.f442475h : z12;
        CameraPosition cameraPosition2 = (i12 & 256) != 0 ? bVar.f442476i : cameraPosition;
        boolean z16 = (i12 & 512) != 0 ? bVar.f442477j : z13;
        CallMetaInfo callMetaInfo2 = (i12 & 1024) != 0 ? bVar.f442478k : callMetaInfo;
        bVar.getClass();
        return new b(str, str2, callDirection, fVar2, hVar2, jVar2, z14, z15, cameraPosition2, z16, callMetaInfo2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f442468a, bVar.f442468a) && L.f(this.f442469b, bVar.f442469b) && this.f442470c == bVar.f442470c && L.f(this.f442471d, bVar.f442471d) && L.f(this.f442472e, bVar.f442472e) && L.f(this.f442473f, bVar.f442473f) && this.f442474g == bVar.f442474g && this.f442475h == bVar.f442475h && this.f442476i == bVar.f442476i && this.f442477j == bVar.f442477j && L.f(this.f442478k, bVar.f442478k);
    }

    public final int hashCode() {
        return this.f442478k.hashCode() + r.i((this.f442476i.hashCode() + r.i(r.i((this.f442473f.hashCode() + ((this.f442472e.hashCode() + ((this.f442471d.hashCode() + ((this.f442470c.hashCode() + H.d(this.f442468a.hashCode() * 31, 31, this.f442469b)) * 31)) * 31)) * 31)) * 31, 31, this.f442474g), 31, this.f442475h)) * 31, 31, this.f442477j);
    }

    @Y61.k
    public final String toString() {
        return "CallState(callId=" + this.f442468a + ", localUserId=" + this.f442469b + ", direction=" + this.f442470c + ", invitingState=" + this.f442471d + ", localMediaStatus=" + this.f442472e + ", peerStatus=" + this.f442473f + ", isVideo=" + this.f442474g + ", videoTxAllowed=" + this.f442475h + ", defaultCamera=" + this.f442476i + ", defaultCameraEnabled=" + this.f442477j + ", callMetaInfo=" + this.f442478k + ')';
    }
}
