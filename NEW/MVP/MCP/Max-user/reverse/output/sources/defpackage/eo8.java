package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class eo8 extends l4 {
    public static final Parcelable.Creator<eo8> CREATOR = new k3j(0);
    public final String a;

    public eo8(String str) {
        s5j.h(str, "json must not be null");
        this.a = str;
    }

    public static eo8 b(Context context, int i) throws Resources.NotFoundException {
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int i2 = inputStreamOpenRawResource.read(bArr, 0, 1024);
                    if (i2 == -1) {
                        efi.a(inputStreamOpenRawResource);
                        efi.a(byteArrayOutputStream);
                        return new eo8(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                } catch (Throwable th) {
                    efi.a(inputStreamOpenRawResource);
                    efi.a(byteArrayOutputStream);
                    throw th;
                }
            }
        } catch (IOException e) {
            throw new Resources.NotFoundException("Failed to read resource " + i + ": " + e.toString());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.g(parcel, 2, this.a);
        a9j.l(parcel, iK);
    }
}
