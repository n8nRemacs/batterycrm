package ha1;

import android.graphics.Bitmap;
import androidx.compose.runtime.C22026a;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f397258a;

    /* renamed from: b, reason: collision with root package name */
    public final String f397259b;

    public s(Bitmap bitmap, String str) {
        super(0);
        this.f397258a = bitmap;
        this.f397259b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return L.f(this.f397258a, sVar.f397258a) && L.f(this.f397259b, sVar.f397259b);
    }

    public final int hashCode() {
        int iHashCode = this.f397258a.hashCode() * 31;
        String str = this.f397259b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UploadImage(preview=");
        sb2.append(this.f397258a);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f397259b, ')');
    }
}
