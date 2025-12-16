package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public final class fye {
    public final LatLng a;
    public final float b;
    public final Bitmap c;

    public fye(LatLng latLng, float f, Bitmap bitmap) {
        this.a = latLng;
        this.b = f;
        this.c = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fye)) {
            return false;
        }
        fye fyeVar = (fye) obj;
        return fni.a(this.a, fyeVar.a) && Float.compare(this.b, fyeVar.b) == 0 && fni.a(this.c, fyeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + hf3.b(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "MarkerModel(latLng=" + this.a + ", zoom=" + this.b + ", icon=" + this.c + ")";
    }
}
