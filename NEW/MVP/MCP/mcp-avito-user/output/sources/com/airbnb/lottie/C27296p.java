package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.parser.moshi.JsonReader;
import j.V;
import j.l0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.Y;
import okio.Y.a;

/* compiled from: LottieCompositionFactory.java */
/* renamed from: com.airbnb.lottie.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27296p {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f59916a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f59917b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f59918c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f59919d = {31, -117, 8};

    public static J<C27291k> a(@j.P final String str, Callable<I<C27291k>> callable, @j.P Runnable runnable) {
        C27291k c27291kA = str == null ? null : O2.f.f11944b.a(str);
        J<C27291k> j12 = c27291kA != null ? new J<>(c27291kA) : null;
        HashMap map = f59916a;
        if (str != null && map.containsKey(str)) {
            j12 = (J) map.get(str);
        }
        if (j12 != null) {
            if (runnable != null) {
                runnable.run();
            }
            return j12;
        }
        J<C27291k> j13 = new J<>(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i12 = 1;
            j13.b(new E() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.E
                public final void onResult(Object obj) {
                    switch (i12) {
                        case 0:
                            HashMap map2 = C27296p.f59916a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                C27296p.k(true);
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = C27296p.f59916a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                C27296p.k(true);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i13 = 0;
            j13.a(new E() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.E
                public final void onResult(Object obj) {
                    switch (i13) {
                        case 0:
                            HashMap map2 = C27296p.f59916a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                C27296p.k(true);
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = C27296p.f59916a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                C27296p.k(true);
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, j13);
                if (map.size() == 1) {
                    k(false);
                }
            }
        }
        return j13;
    }

    @l0
    public static I<C27291k> b(Context context, String str, @j.P String str2) {
        C27291k c27291kA = str2 == null ? null : O2.f.f11944b.a(str2);
        if (c27291kA != null) {
            return new I<>(c27291kA);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e12) {
            return new I<>(e12);
        }
    }

    @l0
    public static I<C27291k> c(@j.P Context context, InputStream inputStream, @j.P String str) {
        C27291k c27291kA = str == null ? null : O2.f.f11944b.a(str);
        if (c27291kA != null) {
            return new I<>(c27291kA);
        }
        try {
            Y y12 = new Y(okio.M.g(inputStream));
            return j(y12, f59918c).booleanValue() ? h(context, new ZipInputStream(y12.new a()), str) : j(y12, f59919d).booleanValue() ? d(new GZIPInputStream(y12.new a()), str) : e(JsonReader.m(y12), str, true);
        } catch (IOException e12) {
            return new I<>(e12);
        }
    }

    @l0
    public static I<C27291k> d(InputStream inputStream, @j.P String str) {
        return e(JsonReader.m(new Y(okio.M.g(inputStream))), str, true);
    }

    public static I<C27291k> e(JsonReader jsonReader, @j.P String str, boolean z12) throws IOException {
        C27291k c27291kA;
        try {
            if (str == null) {
                c27291kA = null;
            } else {
                try {
                    c27291kA = O2.f.f11944b.a(str);
                } catch (Exception e12) {
                    I<C27291k> i12 = new I<>(e12);
                    if (z12) {
                        com.airbnb.lottie.utils.k.b(jsonReader);
                    }
                    return i12;
                }
            }
            if (c27291kA != null) {
                I<C27291k> i13 = new I<>(c27291kA);
                if (z12) {
                    com.airbnb.lottie.utils.k.b(jsonReader);
                }
                return i13;
            }
            C27291k c27291kA2 = com.airbnb.lottie.parser.w.a(jsonReader);
            if (str != null) {
                O2.f.f11944b.f11945a.put(str, c27291kA2);
            }
            I<C27291k> i14 = new I<>(c27291kA2);
            if (z12) {
                com.airbnb.lottie.utils.k.b(jsonReader);
            }
            return i14;
        } catch (Throwable th2) {
            if (z12) {
                com.airbnb.lottie.utils.k.b(jsonReader);
            }
            throw th2;
        }
    }

    public static J<C27291k> f(Context context, @V int i12, @j.P String str) {
        return a(str, new CallableC27295o(new WeakReference(context), context.getApplicationContext(), i12, str), null);
    }

    @l0
    public static I<C27291k> g(Context context, @V int i12, @j.P String str) {
        C27291k c27291kA = str == null ? null : O2.f.f11944b.a(str);
        if (c27291kA != null) {
            return new I<>(c27291kA);
        }
        try {
            Y y12 = new Y(okio.M.g(context.getResources().openRawResource(i12)));
            if (j(y12, f59918c).booleanValue()) {
                return h(context, new ZipInputStream(y12.new a()), str);
            }
            if (!j(y12, f59919d).booleanValue()) {
                return e(JsonReader.m(y12), str, true);
            }
            try {
                return d(new GZIPInputStream(y12.new a()), str);
            } catch (IOException e12) {
                return new I<>(e12);
            }
        } catch (Resources.NotFoundException e13) {
            return new I<>(e13);
        }
    }

    @l0
    public static I<C27291k> h(@j.P Context context, ZipInputStream zipInputStream, @j.P String str) throws IOException {
        try {
            return i(context, zipInputStream, str);
        } finally {
            com.airbnb.lottie.utils.k.b(zipInputStream);
        }
    }

    @l0
    public static I<C27291k> i(@j.P Context context, ZipInputStream zipInputStream, @j.P String str) throws IOException {
        C27291k c27291kA;
        D d12;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c27291kA = null;
        } else {
            try {
                c27291kA = O2.f.f11944b.a(str);
            } catch (IOException e12) {
                return new I<>(e12);
            }
        }
        if (c27291kA != null) {
            return new I<>(c27291kA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C27291k c27291k = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                c27291k = e(JsonReader.m(new Y(okio.M.g(zipInputStream))), null, false).f59108a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new I<>(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i12 = zipInputStream.read(bArr);
                                if (i12 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i12);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } finally {
                    }
                } catch (Throwable th4) {
                    com.airbnb.lottie.utils.e.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th4);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    com.airbnb.lottie.utils.e.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c27291k == null) {
            return new I<>(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) c27291k.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    d12 = null;
                    break;
                }
                d12 = (D) it.next();
                if (d12.f59068d.equals(str4)) {
                    break;
                }
            }
            if (d12 != null) {
                d12.f59070f = com.airbnb.lottie.utils.k.d((Bitmap) entry.getValue(), d12.f59065a, d12.f59066b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z12 = false;
            for (O2.b bVar : c27291k.f59587f.values()) {
                if (bVar.f11932a.equals(entry2.getKey())) {
                    bVar.f11935d = (Typeface) entry2.getValue();
                    z12 = true;
                }
            }
            if (!z12) {
                com.airbnb.lottie.utils.e.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) c27291k.c()).entrySet().iterator();
            while (it2.hasNext()) {
                D d13 = (D) ((Map.Entry) it2.next()).getValue();
                if (d13 == null) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                String str5 = d13.f59068d;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            d13.f59070f = com.airbnb.lottie.utils.k.d(bitmapDecodeByteArray, d13.f59065a, d13.f59066b);
                        }
                    } catch (IllegalArgumentException e13) {
                        com.airbnb.lottie.utils.e.c("data URL did not have correct base64 format.", e13);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            O2.f.f11944b.f11945a.put(str, c27291k);
        }
        return new I<>(c27291k);
    }

    public static Boolean j(Y y12, byte[] bArr) {
        try {
            Y yPeek = y12.peek();
            for (byte b12 : bArr) {
                if (yPeek.readByte() != b12) {
                    return Boolean.FALSE;
                }
            }
            yPeek.close();
            return Boolean.TRUE;
        } catch (Exception e12) {
            com.airbnb.lottie.utils.e.f60101a.error("Failed to check zip file header", e12);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static void k(boolean z12) {
        ArrayList arrayList = new ArrayList(f59917b);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((K) arrayList.get(i12)).a();
        }
    }

    public static String l(@V int i12, Context context) {
        StringBuilder sb2 = new StringBuilder("rawRes");
        sb2.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb2.append(i12);
        return sb2.toString();
    }
}
