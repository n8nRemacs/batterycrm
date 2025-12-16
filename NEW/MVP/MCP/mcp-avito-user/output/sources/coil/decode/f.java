package coil.decode;

import android.graphics.drawable.BitmapDrawable;
import kotlin.Metadata;

/* compiled from: DecodeResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/decode/f;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BitmapDrawable f58290a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58291b;

    public f(@Y61.k BitmapDrawable bitmapDrawable, boolean z12) {
        this.f58290a = bitmapDrawable;
        this.f58291b = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f58290a.equals(fVar.f58290a) && this.f58291b == fVar.f58291b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58291b) + (this.f58290a.hashCode() * 31);
    }
}
