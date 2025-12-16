package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaFormat;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.webrtc.EglBase;

/* loaded from: classes.dex */
public abstract class vui {
    public static Context a;
    public static eki b;

    public static hf6 b(MediaFormat mediaFormat) {
        String string;
        int i;
        int i2;
        float integer;
        byte[] bArr;
        ff6 ff6Var = new ff6();
        ff6Var.m = xz9.n(mediaFormat.getString("mime"));
        ff6Var.d = mediaFormat.getString("language");
        ff6Var.i = mediaFormat.containsKey("max-bitrate") ? mediaFormat.getInteger("max-bitrate") : -1;
        ff6Var.h = mediaFormat.containsKey("bitrate") ? mediaFormat.getInteger("bitrate") : -1;
        int i3 = 0;
        if (Objects.equals(mediaFormat.getString("mime"), "video/3gpp") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer2 = mediaFormat.getInteger("profile");
            int integer3 = mediaFormat.getInteger("level");
            byte[] bArr2 = ed3.a;
            String str = zxg.a;
            Locale locale = Locale.US;
            string = ho7.g("s263.", integer2, integer3, ".");
        } else if (Objects.equals(mediaFormat.getString("mime"), "video/dolby-vision") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer4 = mediaFormat.getInteger("profile");
            byte[] bArr3 = ed3.a;
            if (integer4 == 1) {
                i = 0;
            } else if (integer4 == 2) {
                i = 1;
            } else if (integer4 == 4) {
                i = 2;
            } else if (integer4 == 8) {
                i = 3;
            } else if (integer4 == 16) {
                i = 4;
            } else if (integer4 == 32) {
                i = 5;
            } else if (integer4 == 64) {
                i = 6;
            } else if (integer4 == 128) {
                i = 7;
            } else if (integer4 == 256) {
                i = 8;
            } else if (integer4 == 512) {
                i = 9;
            } else {
                if (integer4 != 1024) {
                    throw new IllegalArgumentException(ho7.f(integer4, "Unknown Dolby Vision profile: "));
                }
                i = 10;
            }
            int integer5 = mediaFormat.getInteger("level");
            if (integer5 == 1) {
                i2 = 1;
            } else if (integer5 != 2) {
                switch (integer5) {
                    case 4:
                        i2 = 3;
                        break;
                    case 8:
                        i2 = 4;
                        break;
                    case 16:
                        i2 = 5;
                        break;
                    case 32:
                        i2 = 6;
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        i2 = 7;
                        break;
                    case 128:
                        i2 = 8;
                        break;
                    case 256:
                        i2 = 9;
                        break;
                    case 512:
                        i2 = 10;
                        break;
                    case 1024:
                        i2 = 11;
                        break;
                    case 2048:
                        i2 = 12;
                        break;
                    case 4096:
                        i2 = 13;
                        break;
                    default:
                        throw new IllegalArgumentException(ho7.f(integer5, "Unknown Dolby Vision level: "));
                }
            } else {
                i2 = 2;
            }
            if (i > 9) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str2 = zxg.a;
                string = String.format(Locale.US, "dvh1.%02d.%02d", objArr);
            } else if (i > 8) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str3 = zxg.a;
                string = String.format(Locale.US, "dvav.%02d.%02d", objArr2);
            } else {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str4 = zxg.a;
                string = String.format(Locale.US, "dvhe.%02d.%02d", objArr3);
            }
        } else {
            string = mediaFormat.containsKey("codecs-string") ? mediaFormat.getString("codecs-string") : null;
        }
        ff6Var.j = string;
        if (mediaFormat.containsKey("frame-rate")) {
            try {
                integer = mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                integer = mediaFormat.getInteger("frame-rate");
            }
        } else {
            integer = -1.0f;
        }
        ff6Var.x = integer;
        ff6Var.t = mediaFormat.containsKey("width") ? mediaFormat.getInteger("width") : -1;
        ff6Var.u = mediaFormat.containsKey("height") ? mediaFormat.getInteger("height") : -1;
        ff6Var.z = (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : 1.0f;
        ff6Var.n = mediaFormat.containsKey("max-input-size") ? mediaFormat.getInteger("max-input-size") : -1;
        ff6Var.y = mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0;
        int integer6 = mediaFormat.containsKey("color-standard") ? mediaFormat.getInteger("color-standard") : -1;
        int integer7 = mediaFormat.containsKey("color-range") ? mediaFormat.getInteger("color-range") : -1;
        int integer8 = mediaFormat.containsKey("color-transfer") ? mediaFormat.getInteger("color-transfer") : -1;
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        if (byteBuffer != null) {
            byte[] bArr4 = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr4);
            bArr = bArr4;
        } else {
            bArr = null;
        }
        if (integer6 != 2 && integer6 != 1 && integer6 != 6 && integer6 != -1) {
            integer6 = -1;
        }
        if (integer7 != 2 && integer7 != 1 && integer7 != -1) {
            integer7 = -1;
        }
        if (integer8 != 1 && integer8 != 3 && integer8 != 6 && integer8 != 7 && integer8 != -1) {
            integer8 = -1;
        }
        ff6Var.C = (integer6 == -1 && integer7 == -1 && integer8 == -1 && bArr == null) ? null : new gf3(integer6, integer7, integer8, -1, -1, bArr);
        ff6Var.F = mediaFormat.containsKey("sample-rate") ? mediaFormat.getInteger("sample-rate") : -1;
        ff6Var.E = mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : -1;
        ff6Var.G = mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : -1;
        u4j.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i4 = 0;
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i3);
            if (byteBuffer2 == null) {
                ff6Var.p = wg7.h(i4, objArrCopyOf);
                if (mediaFormat.containsKey("track-id")) {
                    ff6Var.a = Integer.toString(mediaFormat.getInteger("track-id"));
                }
                return new hf6(ff6Var);
            }
            byte[] bArr5 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr5);
            byteBuffer2.rewind();
            int i5 = i4 + 1;
            int iH = mg7.h(objArrCopyOf.length, i5);
            if (iH > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iH);
            }
            objArrCopyOf[i4] = bArr5;
            i3++;
            i4 = i5;
        }
    }

    public static MediaFormat c(hf6 hf6Var) {
        int i;
        MediaFormat mediaFormat = new MediaFormat();
        g(mediaFormat, "bitrate", hf6Var.j);
        g(mediaFormat, "max-bitrate", hf6Var.i);
        g(mediaFormat, "channel-count", hf6Var.F);
        f(mediaFormat, hf6Var.D);
        String str = hf6Var.n;
        if (str != null) {
            mediaFormat.setString("mime", str);
        }
        String str2 = hf6Var.k;
        if (str2 != null) {
            mediaFormat.setString("codecs-string", str2);
        }
        float f = hf6Var.y;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        g(mediaFormat, "width", hf6Var.u);
        g(mediaFormat, "height", hf6Var.v);
        i(mediaFormat, hf6Var.q);
        int i2 = hf6Var.H;
        if (i2 != -1) {
            g(mediaFormat, "exo-pcm-encoding-int", i2);
            if (i2 == 0) {
                i = 0;
            } else if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    i = 4;
                    if (i2 != 4) {
                        i = 21;
                        if (i2 != 21) {
                            i = 22;
                            if (i2 == 22) {
                            }
                        }
                    }
                }
            } else {
                i = 2;
            }
            mediaFormat.setInteger("pcm-encoding", i);
        }
        String str3 = hf6Var.d;
        if (str3 != null) {
            mediaFormat.setString("language", str3);
        }
        g(mediaFormat, "max-input-size", hf6Var.o);
        g(mediaFormat, "sample-rate", hf6Var.G);
        g(mediaFormat, "caption-service-number", hf6Var.K);
        mediaFormat.setInteger("rotation-degrees", hf6Var.z);
        int i3 = hf6Var.e;
        int i4 = 1;
        mediaFormat.setInteger("is-autoselect", (i3 & 4) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-default", (i3 & 1) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-forced-subtitle", (i3 & 2) != 0 ? 1 : 0);
        mediaFormat.setInteger("encoder-delay", hf6Var.I);
        mediaFormat.setInteger("encoder-padding", hf6Var.J);
        float f2 = hf6Var.A;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f2);
        int i5 = 1073741824;
        if (f2 < 1.0f) {
            i4 = (int) (f2 * 1073741824);
        } else if (f2 > 1.0f) {
            i4 = 1073741824;
            i5 = (int) (1073741824 / f2);
        } else {
            i5 = 1;
        }
        mediaFormat.setInteger("sar-width", i4);
        mediaFormat.setInteger("sar-height", i5);
        String str4 = hf6Var.a;
        if (str4 != null) {
            try {
                mediaFormat.setInteger("track-id", Integer.parseInt(str4));
            } catch (NumberFormatException unused) {
            }
        }
        return mediaFormat;
    }

    public static void f(MediaFormat mediaFormat, gf3 gf3Var) {
        if (gf3Var != null) {
            g(mediaFormat, "color-transfer", gf3Var.c);
            g(mediaFormat, "color-standard", gf3Var.a);
            g(mediaFormat, "color-range", gf3Var.b);
            byte[] bArr = gf3Var.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static void g(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void i(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(ho7.f(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static eki j(Context context) throws GooglePlayServicesNotAvailableException, ClassNotFoundException {
        s5j.g(context);
        Log.d("vui", "preferredRenderer: ".concat("null"));
        eki ekiVar = b;
        if (ekiVar != null) {
            return ekiVar;
        }
        int i = lw6.e;
        int iA = lw6.a(context, 13400000);
        if (iA != 0) {
            throw new GooglePlayServicesNotAvailableException(iA);
        }
        eki ekiVarL = l(context, 0);
        b = ekiVarL;
        try {
            Parcel parcelS = ekiVarL.S(ekiVarL.T(), 9);
            int i2 = parcelS.readInt();
            parcelS.recycle();
            String packageName = context.getPackageName();
            if (i2 != 2 || packageName.equals("com.google.android.apps.photos")) {
                Log.d("vui", "not early loading native code");
            } else {
                Log.d("vui", "early loading native code");
                try {
                    eki ekiVar2 = b;
                    tqa tqaVar = new tqa(k(context, 0));
                    Parcel parcelT = ekiVar2.T();
                    mgi.d(parcelT, tqaVar);
                    ekiVar2.V(parcelT, 11);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (UnsatisfiedLinkError unused) {
                    Log.w("vui", "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    a = null;
                    b = l(context, 1);
                }
            }
            try {
                eki ekiVar3 = b;
                tqa tqaVar2 = new tqa(k(context, 0).getResources());
                Parcel parcelT2 = ekiVar3.T();
                mgi.d(parcelT2, tqaVar2);
                parcelT2.writeInt(19020000);
                ekiVar3.V(parcelT2, 6);
                return b;
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        } catch (RemoteException e3) {
            throw new RuntimeRemoteException(e3);
        }
    }

    public static Context k(Context context, int i) throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        Context context2 = a;
        if (context2 != null) {
            return context2;
        }
        String str = i == 1 ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextCreatePackageContext = d85.c(context, d85.b, str).a;
        } catch (Exception e) {
            try {
                if (str.equals("com.google.android.gms.maps_dynamite")) {
                    Log.e("vui", "Failed to load maps module, use pre-Chimera", e);
                    int i2 = lw6.e;
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        Log.d("vui", "Attempting to load maps_dynamite again.");
                        contextCreatePackageContext = d85.c(context, d85.b, "com.google.android.gms.maps_dynamite").a;
                    } catch (Exception e2) {
                        Log.e("vui", "Failed to load maps module, use pre-Chimera", e2);
                        int i3 = lw6.e;
                        contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
        }
        a = contextCreatePackageContext;
        if (contextCreatePackageContext != null) {
            return contextCreatePackageContext;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    public static eki l(Context context, int i) throws ClassNotFoundException {
        Log.i("vui", "Making Creator dynamically");
        ClassLoader classLoader = k(context, i).getClassLoader();
        try {
            s5j.g(classLoader);
            Class<?> clsLoadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                IBinder iBinder = (IBinder) clsLoadClass.newInstance();
                if (iBinder == null) {
                    throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                return iInterfaceQueryLocalInterface instanceof eki ? (eki) iInterfaceQueryLocalInterface : new eki(iBinder, "com.google.android.gms.maps.internal.ICreator", 3);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(clsLoadClass.getName()), e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(clsLoadClass.getName()), e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e3);
        }
    }

    public abstract tu5 a(hj0 hj0Var, oac oacVar);

    public abstract void d(tu5 tu5Var, i5i i5iVar);

    public abstract HashMap e(tu5 tu5Var, int i);

    public abstract void h(tu5 tu5Var);
}
