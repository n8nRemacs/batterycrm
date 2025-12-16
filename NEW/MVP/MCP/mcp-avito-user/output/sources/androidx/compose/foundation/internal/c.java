package androidx.compose.foundation.internal;

import Y61.k;
import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.A;
import androidx.compose.ui.unit.y;
import androidx.compose.ui.unit.z;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ClipboardUtils.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/internal/c;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Parcel f28157a;

    public c(@k String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.f28157a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    public final long a() {
        long j12;
        Parcel parcel = this.f28157a;
        byte b12 = parcel.readByte();
        if (b12 == 1) {
            A.f42832b.getClass();
            j12 = A.f42833c;
        } else if (b12 == 2) {
            A.f42832b.getClass();
            j12 = A.f42834d;
        } else {
            A.f42832b.getClass();
            j12 = 0;
        }
        A.f42832b.getClass();
        if (!A.b(j12, 0L)) {
            return z.f(j12, parcel.readFloat());
        }
        y.f42874b.getClass();
        return y.f42876d;
    }
}
