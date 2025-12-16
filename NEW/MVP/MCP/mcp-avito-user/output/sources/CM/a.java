package CM;

import Y61.k;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.tns_gallery.p;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ranges.j;
import kotlin.ranges.s;

/* compiled from: DominantColorBackgroundPostProcessor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LCM/a;", "Lcom/facebook/imagepipeline/request/a;", "a", "b", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends com.facebook.imagepipeline.request.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p f2089c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f2090d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f2091e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f2092f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f2093g;

    /* renamed from: h, reason: collision with root package name */
    public int f2094h;

    /* compiled from: DominantColorBackgroundPostProcessor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCM/a$a;", "", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: CM.a$a, reason: collision with other inner class name */
    public static final class C0104a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public b f2095a;

        /* renamed from: b, reason: collision with root package name */
        public int f2096b;

        /* renamed from: c, reason: collision with root package name */
        public int f2097c;

        /* renamed from: d, reason: collision with root package name */
        public int f2098d;

        /* renamed from: e, reason: collision with root package name */
        public int f2099e;
    }

    /* compiled from: DominantColorBackgroundPostProcessor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCM/a$b;", "", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2100a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2101b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2102c;

        public b(int i12, int i13, int i14) {
            this.f2100a = i12;
            this.f2101b = i13;
            this.f2102c = i14;
        }
    }

    public a(@k p pVar) {
        this.f2089c = pVar;
    }

    @Override // com.facebook.imagepipeline.request.a
    public final void d(@k Bitmap bitmap) {
        int i12;
        Bitmap bitmapCreateScaledBitmap;
        b bVar;
        this.f2090d = bitmap;
        int width = bitmap.getWidth();
        Bitmap bitmap2 = this.f2090d;
        if (bitmap2 == null) {
            bitmap2 = null;
        }
        int height = bitmap2.getHeight();
        int i13 = 100;
        if (width > 100 || height > 100) {
            if (width > height) {
                i12 = height / (width / 100);
            } else {
                int i14 = width / (height / 100);
                i12 = 100;
                i13 = i14;
            }
            Bitmap bitmap3 = this.f2090d;
            if (bitmap3 == null) {
                bitmap3 = null;
            }
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap3, i13, i12, true);
        } else {
            Bitmap bitmap4 = this.f2090d;
            if (bitmap4 == null) {
                bitmap4 = null;
            }
            Bitmap.Config config = bitmap4.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmap5 = this.f2090d;
            if (bitmap5 == null) {
                bitmap5 = null;
            }
            bitmapCreateScaledBitmap = bitmap5.copy(config, false);
        }
        this.f2092f = bitmapCreateScaledBitmap;
        int width2 = bitmapCreateScaledBitmap.getWidth();
        Bitmap bitmap6 = this.f2092f;
        if (bitmap6 == null) {
            bitmap6 = null;
        }
        int height2 = bitmap6.getHeight() * width2;
        this.f2094h = height2;
        int[] iArr = new int[height2];
        this.f2093g = iArr;
        Bitmap bitmap7 = this.f2092f;
        Bitmap bitmap8 = bitmap7 == null ? null : bitmap7;
        if (bitmap7 == null) {
            bitmap7 = null;
        }
        int width3 = bitmap7.getWidth();
        Bitmap bitmap9 = this.f2092f;
        if (bitmap9 == null) {
            bitmap9 = null;
        }
        int width4 = bitmap9.getWidth();
        Bitmap bitmap10 = this.f2092f;
        if (bitmap10 == null) {
            bitmap10 = null;
        }
        bitmap8.getPixels(iArr, 0, width3, 0, 0, width4, bitmap10.getHeight());
        j jVarP = s.p(s.r(0, this.f2094h), (int) Math.ceil(this.f2094h / 12));
        ArrayList arrayList = this.f2091e;
        int i15 = jVarP.f406905b;
        int i16 = jVarP.f406906c;
        int i17 = jVarP.f406907d;
        if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
            while (true) {
                int[] iArr2 = this.f2093g;
                if (iArr2 == null) {
                    iArr2 = null;
                }
                int i18 = iArr2[i15];
                b bVar2 = new b(Color.red(i18), Color.green(i18), Color.blue(i18));
                C0104a c0104a = new C0104a();
                c0104a.f2095a = bVar2;
                arrayList.add(c0104a);
                if (i15 == i16) {
                    break;
                } else {
                    i15 += i17;
                }
            }
        }
        int i19 = 0;
        while (true) {
            if (i19 < 8) {
                try {
                    Bitmap bitmap11 = this.f2092f;
                    if (bitmap11 == null) {
                        bitmap11 = null;
                    }
                    int iFloor = (int) Math.floor(bitmap11.getWidth() * 0.2d);
                    int i22 = 10;
                    if (iFloor < 10) {
                        iFloor = 10;
                    }
                    Bitmap bitmap12 = this.f2092f;
                    if (bitmap12 == null) {
                        bitmap12 = null;
                    }
                    int height3 = bitmap12.getHeight();
                    for (int i23 = 0; i23 < height3; i23++) {
                        int i24 = 0;
                        while (i24 < iFloor) {
                            int[] iArr3 = this.f2093g;
                            if (iArr3 == null) {
                                iArr3 = null;
                            }
                            Bitmap bitmap13 = this.f2092f;
                            if (bitmap13 == null) {
                                bitmap13 = null;
                            }
                            f(iArr3[(bitmap13.getWidth() * i23) + i24]);
                            int[] iArr4 = this.f2093g;
                            if (iArr4 == null) {
                                iArr4 = null;
                            }
                            Bitmap bitmap14 = this.f2092f;
                            if (bitmap14 == null) {
                                bitmap14 = null;
                            }
                            i24++;
                            f(iArr4[(bitmap14.getWidth() * i23) - i24]);
                        }
                    }
                    Bitmap bitmap15 = this.f2092f;
                    if (bitmap15 == null) {
                        bitmap15 = null;
                    }
                    int iFloor2 = (int) Math.floor(bitmap15.getHeight() * 0.2d);
                    if (iFloor2 >= 10) {
                        i22 = iFloor2;
                    }
                    for (int i25 = 0; i25 < i22; i25++) {
                        Bitmap bitmap16 = this.f2092f;
                        if (bitmap16 == null) {
                            bitmap16 = null;
                        }
                        int width5 = bitmap16.getWidth() - iFloor;
                        int i26 = iFloor;
                        while (i26 < width5) {
                            int[] iArr5 = this.f2093g;
                            if (iArr5 == null) {
                                iArr5 = null;
                            }
                            Bitmap bitmap17 = this.f2092f;
                            if (bitmap17 == null) {
                                bitmap17 = null;
                            }
                            f(iArr5[(bitmap17.getWidth() * i25) + i26]);
                            int[] iArr6 = this.f2093g;
                            if (iArr6 == null) {
                                iArr6 = null;
                            }
                            int i27 = i25 + 1;
                            Bitmap bitmap18 = this.f2092f;
                            if (bitmap18 == null) {
                                bitmap18 = null;
                            }
                            i26++;
                            f(iArr6[(i27 * bitmap18.getWidth()) - i26]);
                        }
                    }
                } catch (Exception e12) {
                    V2.f318762a.a("DEFAULT_TAG", "DominantColorBackgroundPostProcessor", e12);
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i28 = 0; i28 < size; i28++) {
                    C0104a c0104a2 = (C0104a) arrayList.get(i28);
                    int i29 = c0104a2.f2096b;
                    if (i29 == 0) {
                        arrayList2.add(c0104a2);
                    } else {
                        c0104a2.f2095a = new b(c0104a2.f2097c / i29, c0104a2.f2098d / i29, c0104a2.f2099e / i29);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.remove((C0104a) it.next());
                }
                if (arrayList.size() == 1) {
                    bVar = ((C0104a) arrayList.get(0)).f2095a;
                    break;
                }
                i19++;
            } else {
                int size2 = arrayList.size();
                int i32 = -1;
                int i33 = 0;
                for (int i34 = 0; i34 < size2; i34++) {
                    if (((C0104a) arrayList.get(i34)).f2096b > i33) {
                        i33 = ((C0104a) arrayList.get(i34)).f2096b;
                        i32 = i34;
                    }
                }
                bVar = ((C0104a) arrayList.get(i32)).f2095a;
            }
        }
        Bitmap bitmap19 = this.f2092f;
        (bitmap19 != null ? bitmap19 : null).recycle();
        ColorDrawable colorDrawable = new ColorDrawable(Color.argb(255, bVar.f2100a, bVar.f2101b, bVar.f2102c));
        p pVar = this.f2089c;
        pVar.getClass();
        new Handler(Looper.getMainLooper()).post(new RunnableC34589p(17, pVar.f301549a, colorDrawable));
    }

    public final void f(int i12) {
        int i13;
        int i14;
        int i15;
        b bVar = new b(Color.red(i12), Color.green(i12), Color.blue(i12));
        ArrayList arrayList = this.f2091e;
        int size = arrayList.size();
        float f12 = Float.MAX_VALUE;
        int i16 = 0;
        int i17 = -1;
        while (true) {
            i13 = bVar.f2102c;
            i14 = bVar.f2101b;
            i15 = bVar.f2100a;
            if (i16 >= size) {
                break;
            }
            b bVar2 = ((C0104a) arrayList.get(i16)).f2095a;
            bVar2.getClass();
            float f13 = i15 - bVar2.f2100a;
            float f14 = i14 - bVar2.f2101b;
            float f15 = i13 - bVar2.f2102c;
            float f16 = f15 * f15;
            float fSqrt = (float) Math.sqrt(f16 + (f14 * f14) + (f13 * f13));
            if (f12 > fSqrt) {
                i17 = i16;
                f12 = fSqrt;
            }
            i16++;
        }
        if (i17 == -1) {
            throw new IllegalStateException("pixel was not been placed into buckets");
        }
        C0104a c0104a = (C0104a) arrayList.get(i17);
        c0104a.f2096b++;
        c0104a.f2097c += i15;
        c0104a.f2098d += i14;
        c0104a.f2099e += i13;
    }
}
