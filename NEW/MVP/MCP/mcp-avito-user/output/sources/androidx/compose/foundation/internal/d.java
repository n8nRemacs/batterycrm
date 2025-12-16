package androidx.compose.foundation.internal;

import Y61.k;
import android.os.Parcel;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.A;
import androidx.compose.ui.unit.y;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ClipboardUtils.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/internal/d;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public Parcel f28158a = Parcel.obtain();

    public final void a(byte b12) {
        this.f28158a.writeByte(b12);
    }

    public final void b(float f12) {
        this.f28158a.writeFloat(f12);
    }

    public final void c(long j12) {
        long jC2 = y.c(j12);
        A.a aVar = A.f42832b;
        aVar.getClass();
        byte b12 = 0;
        if (!A.b(jC2, 0L)) {
            aVar.getClass();
            if (A.b(jC2, A.f42833c)) {
                b12 = 1;
            } else {
                aVar.getClass();
                if (A.b(jC2, A.f42834d)) {
                    b12 = 2;
                }
            }
        }
        a(b12);
        long jC3 = y.c(j12);
        aVar.getClass();
        if (A.b(jC3, 0L)) {
            return;
        }
        b(y.d(j12));
    }
}
