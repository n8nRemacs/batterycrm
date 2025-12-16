package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.X;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f44737k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    @RestrictTo
    public int f44738a;

    /* renamed from: b, reason: collision with root package name */
    public Object f44739b;

    /* renamed from: c, reason: collision with root package name */
    @RestrictTo
    @P
    public byte[] f44740c;

    /* renamed from: d, reason: collision with root package name */
    @RestrictTo
    @P
    public Parcelable f44741d;

    /* renamed from: e, reason: collision with root package name */
    @RestrictTo
    public int f44742e;

    /* renamed from: f, reason: collision with root package name */
    @RestrictTo
    public int f44743f;

    /* renamed from: g, reason: collision with root package name */
    @RestrictTo
    @P
    public ColorStateList f44744g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f44745h;

    /* renamed from: i, reason: collision with root package name */
    @RestrictTo
    @P
    public String f44746i;

    /* renamed from: j, reason: collision with root package name */
    @RestrictTo
    @P
    public String f44747j;

    @X
    public static class a {
    }

    @X
    public static class b {
    }

    @X
    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @X
    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface e {
    }

    @RestrictTo
    public IconCompat() {
        this.f44738a = -1;
        this.f44740c = null;
        this.f44741d = null;
        this.f44742e = 0;
        this.f44743f = 0;
        this.f44744g = null;
        this.f44745h = f44737k;
        this.f44746i = null;
    }

    @N
    public static IconCompat c(@N Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f44739b = bitmap;
        return iconCompat;
    }

    @N
    public static IconCompat e(@InterfaceC42165v int i12, @N Context context) {
        context.getClass();
        return f(context.getPackageName(), context.getResources(), i12);
    }

    @N
    @RestrictTo
    public static IconCompat f(@N String str, @P Resources resources, @InterfaceC42165v int i12) {
        str.getClass();
        if (i12 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f44742e = i12;
        if (resources != null) {
            try {
                iconCompat.f44739b = resources.getResourceName(i12);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f44739b = str;
        }
        iconCompat.f44747j = str;
        return iconCompat;
    }

    @InterfaceC42165v
    public final int g() {
        int i12 = this.f44738a;
        if (i12 != -1) {
            if (i12 == 2) {
                return this.f44742e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = this.f44739b;
        if (i13 >= 28) {
            return c.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public final int h() {
        int i12 = this.f44738a;
        if (i12 != -1) {
            return i12;
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = this.f44739b;
        if (i13 >= 28) {
            return c.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            Objects.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            Objects.toString(obj);
            return -1;
        }
    }

    @N
    public final Uri i() {
        int i12 = this.f44738a;
        if (i12 == -1) {
            int i13 = Build.VERSION.SDK_INT;
            Object obj = this.f44739b;
            if (i13 >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i12 == 4 || i12 == 6) {
            return Uri.parse((String) this.f44739b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @RestrictTo
    @P
    public final InputStream j(@N Context context) {
        Uri uriI = i();
        String scheme = uriI.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriI);
            } catch (Exception unused) {
                uriI.toString();
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f44739b));
        } catch (FileNotFoundException unused2) {
            uriI.toString();
            return null;
        }
    }

    @N
    @X
    public final Icon k(@P Context context) {
        Icon iconCreateWithBitmap;
        String strB;
        int i12 = Build.VERSION.SDK_INT;
        switch (this.f44738a) {
            case -1:
                return (Icon) this.f44739b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f44739b);
                break;
            case 2:
                int i13 = this.f44738a;
                if (i13 == -1) {
                    int i14 = Build.VERSION.SDK_INT;
                    Object obj = this.f44739b;
                    if (i14 >= 28) {
                        strB = c.b(obj);
                    } else {
                        strB = null;
                        try {
                            strB = (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.f44747j;
                    strB = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f44739b).split(":", -1)[0] : this.f44747j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strB, this.f44742e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f44739b, this.f44742e, this.f44743f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f44739b);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f44739b);
                break;
            case 6:
                if (i12 >= 30) {
                    iconCreateWithBitmap = d.a(i());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + i());
                    }
                    InputStream inputStreamJ = j(context);
                    if (inputStreamJ == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + i());
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamJ));
                    break;
                }
        }
        ColorStateList colorStateList = this.f44744g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f44745h;
        if (mode == f44737k) {
            return iconCreateWithBitmap;
        }
        iconCreateWithBitmap.setTintMode(mode);
        return iconCreateWithBitmap;
    }

    @N
    public final String toString() {
        String str;
        if (this.f44738a == -1) {
            return String.valueOf(this.f44739b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f44738a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                break;
        }
        sb2.append(str);
        switch (this.f44738a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f44739b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f44739b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f44747j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(g())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f44742e);
                if (this.f44743f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f44743f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f44739b);
                break;
        }
        if (this.f44744g != null) {
            sb2.append(" tint=");
            sb2.append(this.f44744g);
        }
        if (this.f44745h != f44737k) {
            sb2.append(" mode=");
            sb2.append(this.f44745h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i12) {
        this.f44740c = null;
        this.f44741d = null;
        this.f44742e = 0;
        this.f44743f = 0;
        this.f44744g = null;
        this.f44745h = f44737k;
        this.f44746i = null;
        this.f44738a = i12;
    }
}
