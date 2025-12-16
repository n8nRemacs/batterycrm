package androidx.compose.ui.contentcapture;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AndroidContentCaptureManager.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/contentcapture/e;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f38977a;

    /* renamed from: b, reason: collision with root package name */
    public final long f38978b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f38979c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final androidx.compose.ui.platform.coreshims.d f38980d;

    public e(int i12, long j12, @k f fVar, @l androidx.compose.ui.platform.coreshims.d dVar) {
        this.f38977a = i12;
        this.f38978b = j12;
        this.f38979c = fVar;
        this.f38980d = dVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f38977a == eVar.f38977a && this.f38978b == eVar.f38978b && this.f38979c == eVar.f38979c && L.f(this.f38980d, eVar.f38980d);
    }

    public final int hashCode() {
        int iHashCode = (this.f38979c.hashCode() + r.g(Integer.hashCode(this.f38977a) * 31, 31, this.f38978b)) * 31;
        androidx.compose.ui.platform.coreshims.d dVar = this.f38980d;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @k
    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f38977a + ", timestamp=" + this.f38978b + ", type=" + this.f38979c + ", structureCompat=" + this.f38980d + ')';
    }
}
