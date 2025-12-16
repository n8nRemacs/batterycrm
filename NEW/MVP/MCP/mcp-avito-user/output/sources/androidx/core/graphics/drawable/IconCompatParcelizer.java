package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

@RestrictTo
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f44738a = versionedParcel.l(iconCompat.f44738a, 1);
        byte[] bArrH = iconCompat.f44740c;
        if (versionedParcel.j(2)) {
            bArrH = versionedParcel.h();
        }
        iconCompat.f44740c = bArrH;
        Parcelable parcelableM = iconCompat.f44741d;
        if (versionedParcel.j(3)) {
            parcelableM = versionedParcel.m();
        }
        iconCompat.f44741d = parcelableM;
        iconCompat.f44742e = versionedParcel.l(iconCompat.f44742e, 4);
        iconCompat.f44743f = versionedParcel.l(iconCompat.f44743f, 5);
        Parcelable parcelableM2 = iconCompat.f44744g;
        if (versionedParcel.j(6)) {
            parcelableM2 = versionedParcel.m();
        }
        iconCompat.f44744g = (ColorStateList) parcelableM2;
        String strN = iconCompat.f44746i;
        if (versionedParcel.j(7)) {
            strN = versionedParcel.n();
        }
        iconCompat.f44746i = strN;
        String strN2 = iconCompat.f44747j;
        if (versionedParcel.j(8)) {
            strN2 = versionedParcel.n();
        }
        iconCompat.f44747j = strN2;
        iconCompat.f44745h = PorterDuff.Mode.valueOf(iconCompat.f44746i);
        switch (iconCompat.f44738a) {
            case -1:
                Parcelable parcelable = iconCompat.f44741d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f44739b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f44741d;
                if (parcelable2 != null) {
                    iconCompat.f44739b = parcelable2;
                } else {
                    byte[] bArr = iconCompat.f44740c;
                    iconCompat.f44739b = bArr;
                    iconCompat.f44738a = 3;
                    iconCompat.f44742e = 0;
                    iconCompat.f44743f = bArr.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f44740c, Charset.forName("UTF-16"));
                iconCompat.f44739b = str;
                if (iconCompat.f44738a == 2 && iconCompat.f44747j == null) {
                    iconCompat.f44747j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f44739b = iconCompat.f44740c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.q(true, true);
        boolean zF2 = versionedParcel.f();
        iconCompat.f44746i = iconCompat.f44745h.name();
        switch (iconCompat.f44738a) {
            case -1:
                if (!zF2) {
                    iconCompat.f44741d = (Parcelable) iconCompat.f44739b;
                    break;
                } else {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
            case 1:
            case 5:
                if (!zF2) {
                    iconCompat.f44741d = (Parcelable) iconCompat.f44739b;
                    break;
                } else {
                    Bitmap bitmap = (Bitmap) iconCompat.f44739b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    iconCompat.f44740c = byteArrayOutputStream.toByteArray();
                    break;
                }
            case 2:
                iconCompat.f44740c = ((String) iconCompat.f44739b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f44740c = (byte[]) iconCompat.f44739b;
                break;
            case 4:
            case 6:
                iconCompat.f44740c = iconCompat.f44739b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i12 = iconCompat.f44738a;
        if (-1 != i12) {
            versionedParcel.v(i12, 1);
        }
        byte[] bArr = iconCompat.f44740c;
        if (bArr != null) {
            versionedParcel.p(2);
            versionedParcel.s(bArr);
        }
        Parcelable parcelable = iconCompat.f44741d;
        if (parcelable != null) {
            versionedParcel.p(3);
            versionedParcel.w(parcelable);
        }
        int i13 = iconCompat.f44742e;
        if (i13 != 0) {
            versionedParcel.v(i13, 4);
        }
        int i14 = iconCompat.f44743f;
        if (i14 != 0) {
            versionedParcel.v(i14, 5);
        }
        ColorStateList colorStateList = iconCompat.f44744g;
        if (colorStateList != null) {
            versionedParcel.p(6);
            versionedParcel.w(colorStateList);
        }
        String str = iconCompat.f44746i;
        if (str != null) {
            versionedParcel.p(7);
            versionedParcel.x(str);
        }
        String str2 = iconCompat.f44747j;
        if (str2 != null) {
            versionedParcel.p(8);
            versionedParcel.x(str2);
        }
    }
}
