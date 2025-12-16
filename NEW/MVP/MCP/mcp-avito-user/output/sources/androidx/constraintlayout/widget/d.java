package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.C22737c;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.h;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f44256g = {0, 4, 8};

    /* renamed from: h, reason: collision with root package name */
    public static final SparseIntArray f44257h;

    /* renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f44258i;

    /* renamed from: a, reason: collision with root package name */
    public String f44259a;

    /* renamed from: b, reason: collision with root package name */
    public String f44260b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f44261c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<String, ConstraintAttribute> f44262d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public boolean f44263e = true;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap<Integer, a> f44264f = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f44265a;

        /* renamed from: b, reason: collision with root package name */
        public String f44266b;

        /* renamed from: c, reason: collision with root package name */
        public final C1714d f44267c = new C1714d();

        /* renamed from: d, reason: collision with root package name */
        public final c f44268d = new c();

        /* renamed from: e, reason: collision with root package name */
        public final b f44269e = new b();

        /* renamed from: f, reason: collision with root package name */
        public final e f44270f = new e();

        /* renamed from: g, reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f44271g = new HashMap<>();

        /* renamed from: h, reason: collision with root package name */
        public C1713a f44272h;

        /* compiled from: ConstraintSet.java */
        /* renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        public static class C1713a {

            /* renamed from: a, reason: collision with root package name */
            public int[] f44273a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            public int[] f44274b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            public int f44275c = 0;

            /* renamed from: d, reason: collision with root package name */
            public int[] f44276d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            public float[] f44277e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            public int f44278f = 0;

            /* renamed from: g, reason: collision with root package name */
            public int[] f44279g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            public String[] f44280h = new String[5];

            /* renamed from: i, reason: collision with root package name */
            public int f44281i = 0;

            /* renamed from: j, reason: collision with root package name */
            public int[] f44282j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            public boolean[] f44283k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            public int f44284l = 0;

            public final void a(float f12, int i12) {
                int i13 = this.f44278f;
                int[] iArr = this.f44276d;
                if (i13 >= iArr.length) {
                    this.f44276d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f44277e;
                    this.f44277e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f44276d;
                int i14 = this.f44278f;
                iArr2[i14] = i12;
                float[] fArr2 = this.f44277e;
                this.f44278f = i14 + 1;
                fArr2[i14] = f12;
            }

            public final void b(int i12, int i13) {
                int i14 = this.f44275c;
                int[] iArr = this.f44273a;
                if (i14 >= iArr.length) {
                    this.f44273a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f44274b;
                    this.f44274b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f44273a;
                int i15 = this.f44275c;
                iArr3[i15] = i12;
                int[] iArr4 = this.f44274b;
                this.f44275c = i15 + 1;
                iArr4[i15] = i13;
            }

            public final void c(int i12, String str) {
                int i13 = this.f44281i;
                int[] iArr = this.f44279g;
                if (i13 >= iArr.length) {
                    this.f44279g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f44280h;
                    this.f44280h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f44279g;
                int i14 = this.f44281i;
                iArr2[i14] = i12;
                String[] strArr2 = this.f44280h;
                this.f44281i = i14 + 1;
                strArr2[i14] = str;
            }

            public final void d(int i12, boolean z12) {
                int i13 = this.f44284l;
                int[] iArr = this.f44282j;
                if (i13 >= iArr.length) {
                    this.f44282j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f44283k;
                    this.f44283k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f44282j;
                int i14 = this.f44284l;
                iArr2[i14] = i12;
                boolean[] zArr2 = this.f44283k;
                this.f44284l = i14 + 1;
                zArr2[i14] = z12;
            }

            public final void e(a aVar) {
                for (int i12 = 0; i12 < this.f44275c; i12++) {
                    int i13 = this.f44273a[i12];
                    int i14 = this.f44274b[i12];
                    int[] iArr = d.f44256g;
                    if (i13 == 6) {
                        aVar.f44269e.f44289D = i14;
                    } else if (i13 == 7) {
                        aVar.f44269e.f44290E = i14;
                    } else if (i13 == 8) {
                        aVar.f44269e.f44296K = i14;
                    } else if (i13 == 27) {
                        aVar.f44269e.f44291F = i14;
                    } else if (i13 == 28) {
                        aVar.f44269e.f44293H = i14;
                    } else if (i13 == 41) {
                        aVar.f44269e.f44308W = i14;
                    } else if (i13 == 42) {
                        aVar.f44269e.f44309X = i14;
                    } else if (i13 == 61) {
                        aVar.f44269e.f44286A = i14;
                    } else if (i13 == 62) {
                        aVar.f44269e.f44287B = i14;
                    } else if (i13 == 72) {
                        aVar.f44269e.f44325g0 = i14;
                    } else if (i13 == 73) {
                        aVar.f44269e.f44327h0 = i14;
                    } else if (i13 == 88) {
                        aVar.f44268d.f44366l = i14;
                    } else if (i13 == 89) {
                        aVar.f44268d.f44367m = i14;
                    } else if (i13 == 2) {
                        aVar.f44269e.f44295J = i14;
                    } else if (i13 == 31) {
                        aVar.f44269e.f44297L = i14;
                    } else if (i13 == 34) {
                        aVar.f44269e.f44294I = i14;
                    } else if (i13 == 38) {
                        aVar.f44265a = i14;
                    } else if (i13 == 64) {
                        aVar.f44268d.f44356b = i14;
                    } else if (i13 == 66) {
                        aVar.f44268d.f44360f = i14;
                    } else if (i13 == 76) {
                        aVar.f44268d.f44359e = i14;
                    } else if (i13 == 78) {
                        aVar.f44267c.f44370c = i14;
                    } else if (i13 == 97) {
                        aVar.f44269e.f44343p0 = i14;
                    } else if (i13 == 93) {
                        aVar.f44269e.f44298M = i14;
                    } else if (i13 != 94) {
                        switch (i13) {
                            case 11:
                                aVar.f44269e.f44302Q = i14;
                                break;
                            case 12:
                                aVar.f44269e.f44303R = i14;
                                break;
                            case 13:
                                aVar.f44269e.f44299N = i14;
                                break;
                            case 14:
                                aVar.f44269e.f44301P = i14;
                                break;
                            case 15:
                                aVar.f44269e.f44304S = i14;
                                break;
                            case 16:
                                aVar.f44269e.f44300O = i14;
                                break;
                            case 17:
                                aVar.f44269e.f44320e = i14;
                                break;
                            case 18:
                                aVar.f44269e.f44322f = i14;
                                break;
                            default:
                                switch (i13) {
                                    case 21:
                                        aVar.f44269e.f44318d = i14;
                                        break;
                                    case 22:
                                        aVar.f44267c.f44369b = i14;
                                        break;
                                    case 23:
                                        aVar.f44269e.f44316c = i14;
                                        break;
                                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                                        aVar.f44269e.f44292G = i14;
                                        break;
                                    default:
                                        switch (i13) {
                                            case 54:
                                                aVar.f44269e.f44310Y = i14;
                                                break;
                                            case 55:
                                                aVar.f44269e.f44311Z = i14;
                                                break;
                                            case 56:
                                                aVar.f44269e.f44313a0 = i14;
                                                break;
                                            case 57:
                                                aVar.f44269e.f44315b0 = i14;
                                                break;
                                            case 58:
                                                aVar.f44269e.f44317c0 = i14;
                                                break;
                                            case 59:
                                                aVar.f44269e.f44319d0 = i14;
                                                break;
                                            default:
                                                switch (i13) {
                                                    case 82:
                                                        aVar.f44268d.f44357c = i14;
                                                        break;
                                                    case 83:
                                                        aVar.f44270f.f44382i = i14;
                                                        break;
                                                    case 84:
                                                        aVar.f44268d.f44364j = i14;
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        aVar.f44269e.f44305T = i14;
                    }
                }
                for (int i15 = 0; i15 < this.f44278f; i15++) {
                    int i16 = this.f44276d[i15];
                    float f12 = this.f44277e[i15];
                    int[] iArr2 = d.f44256g;
                    if (i16 == 19) {
                        aVar.f44269e.f44324g = f12;
                    } else if (i16 == 20) {
                        aVar.f44269e.f44351x = f12;
                    } else if (i16 == 37) {
                        aVar.f44269e.f44352y = f12;
                    } else if (i16 == 60) {
                        aVar.f44270f.f44375b = f12;
                    } else if (i16 == 63) {
                        aVar.f44269e.f44288C = f12;
                    } else if (i16 == 79) {
                        aVar.f44268d.f44361g = f12;
                    } else if (i16 == 85) {
                        aVar.f44268d.f44363i = f12;
                    } else if (i16 == 39) {
                        aVar.f44269e.f44307V = f12;
                    } else if (i16 != 40) {
                        switch (i16) {
                            case 43:
                                aVar.f44267c.f44371d = f12;
                                break;
                            case 44:
                                e eVar = aVar.f44270f;
                                eVar.f44387n = f12;
                                eVar.f44386m = true;
                                break;
                            case 45:
                                aVar.f44270f.f44376c = f12;
                                break;
                            case 46:
                                aVar.f44270f.f44377d = f12;
                                break;
                            case 47:
                                aVar.f44270f.f44378e = f12;
                                break;
                            case 48:
                                aVar.f44270f.f44379f = f12;
                                break;
                            case 49:
                                aVar.f44270f.f44380g = f12;
                                break;
                            case 50:
                                aVar.f44270f.f44381h = f12;
                                break;
                            case 51:
                                aVar.f44270f.f44383j = f12;
                                break;
                            case 52:
                                aVar.f44270f.f44384k = f12;
                                break;
                            case 53:
                                aVar.f44270f.f44385l = f12;
                                break;
                            default:
                                switch (i16) {
                                    case 67:
                                        aVar.f44268d.f44362h = f12;
                                        break;
                                    case 68:
                                        aVar.f44267c.f44372e = f12;
                                        break;
                                    case 69:
                                        aVar.f44269e.f44321e0 = f12;
                                        break;
                                    case 70:
                                        aVar.f44269e.f44323f0 = f12;
                                        break;
                                }
                        }
                    } else {
                        aVar.f44269e.f44306U = f12;
                    }
                }
                for (int i17 = 0; i17 < this.f44281i; i17++) {
                    int i18 = this.f44279g[i17];
                    String str = this.f44280h[i17];
                    int[] iArr3 = d.f44256g;
                    if (i18 == 5) {
                        aVar.f44269e.f44353z = str;
                    } else if (i18 == 65) {
                        aVar.f44268d.f44358d = str;
                    } else if (i18 == 74) {
                        b bVar = aVar.f44269e;
                        bVar.f44333k0 = str;
                        bVar.f44331j0 = null;
                    } else if (i18 == 77) {
                        aVar.f44269e.f44335l0 = str;
                    } else if (i18 == 90) {
                        aVar.f44268d.f44365k = str;
                    }
                }
                for (int i19 = 0; i19 < this.f44284l; i19++) {
                    int i22 = this.f44282j[i19];
                    boolean z12 = this.f44283k[i19];
                    int[] iArr4 = d.f44256g;
                    if (i22 == 44) {
                        aVar.f44270f.f44386m = z12;
                    } else if (i22 == 75) {
                        aVar.f44269e.f44341o0 = z12;
                    } else if (i22 == 80) {
                        aVar.f44269e.f44337m0 = z12;
                    } else if (i22 == 81) {
                        aVar.f44269e.f44339n0 = z12;
                    }
                }
            }
        }

        public final void a(a aVar) {
            C1713a c1713a = this.f44272h;
            if (c1713a != null) {
                c1713a.e(aVar);
            }
        }

        public final void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f44269e;
            bVar.f44189f = bVar2.f44328i;
            bVar.f44191g = bVar2.f44330j;
            bVar.f44193h = bVar2.f44332k;
            bVar.f44195i = bVar2.f44334l;
            bVar.f44197j = bVar2.f44336m;
            bVar.f44199k = bVar2.f44338n;
            bVar.f44201l = bVar2.f44340o;
            bVar.f44203m = bVar2.f44342p;
            bVar.f44205n = bVar2.f44344q;
            bVar.f44207o = bVar2.f44345r;
            bVar.f44209p = bVar2.f44346s;
            bVar.f44216t = bVar2.f44347t;
            bVar.f44217u = bVar2.f44348u;
            bVar.f44218v = bVar2.f44349v;
            bVar.f44219w = bVar2.f44350w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f44292G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f44293H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f44294I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f44295J;
            bVar.f44155B = bVar2.f44304S;
            bVar.f44156C = bVar2.f44303R;
            bVar.f44221y = bVar2.f44300O;
            bVar.f44154A = bVar2.f44302Q;
            bVar.f44159F = bVar2.f44351x;
            bVar.f44160G = bVar2.f44352y;
            bVar.f44211q = bVar2.f44286A;
            bVar.f44213r = bVar2.f44287B;
            bVar.f44215s = bVar2.f44288C;
            bVar.f44161H = bVar2.f44353z;
            bVar.f44174U = bVar2.f44289D;
            bVar.f44175V = bVar2.f44290E;
            bVar.f44163J = bVar2.f44306U;
            bVar.f44162I = bVar2.f44307V;
            bVar.f44165L = bVar2.f44309X;
            bVar.f44164K = bVar2.f44308W;
            bVar.f44177X = bVar2.f44337m0;
            bVar.f44178Y = bVar2.f44339n0;
            bVar.f44166M = bVar2.f44310Y;
            bVar.f44167N = bVar2.f44311Z;
            bVar.f44170Q = bVar2.f44313a0;
            bVar.f44171R = bVar2.f44315b0;
            bVar.f44168O = bVar2.f44317c0;
            bVar.f44169P = bVar2.f44319d0;
            bVar.f44172S = bVar2.f44321e0;
            bVar.f44173T = bVar2.f44323f0;
            bVar.f44176W = bVar2.f44291F;
            bVar.f44185d = bVar2.f44324g;
            bVar.f44181b = bVar2.f44320e;
            bVar.f44183c = bVar2.f44322f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f44316c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f44318d;
            String str = bVar2.f44335l0;
            if (str != null) {
                bVar.f44179Z = str;
            }
            bVar.f44180a0 = bVar2.f44343p0;
            bVar.setMarginStart(bVar2.f44297L);
            bVar.setMarginEnd(bVar2.f44296K);
            bVar.b();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            a aVar = new a();
            aVar.f44269e.a(this.f44269e);
            aVar.f44268d.a(this.f44268d);
            C1714d c1714d = aVar.f44267c;
            c1714d.getClass();
            C1714d c1714d2 = this.f44267c;
            c1714d.f44368a = c1714d2.f44368a;
            c1714d.f44369b = c1714d2.f44369b;
            c1714d.f44371d = c1714d2.f44371d;
            c1714d.f44372e = c1714d2.f44372e;
            c1714d.f44370c = c1714d2.f44370c;
            aVar.f44270f.a(this.f44270f);
            aVar.f44265a = this.f44265a;
            aVar.f44272h = this.f44272h;
            return aVar;
        }

        public final void d(int i12, ConstraintLayout.b bVar) {
            this.f44265a = i12;
            int i13 = bVar.f44189f;
            b bVar2 = this.f44269e;
            bVar2.f44328i = i13;
            bVar2.f44330j = bVar.f44191g;
            bVar2.f44332k = bVar.f44193h;
            bVar2.f44334l = bVar.f44195i;
            bVar2.f44336m = bVar.f44197j;
            bVar2.f44338n = bVar.f44199k;
            bVar2.f44340o = bVar.f44201l;
            bVar2.f44342p = bVar.f44203m;
            bVar2.f44344q = bVar.f44205n;
            bVar2.f44345r = bVar.f44207o;
            bVar2.f44346s = bVar.f44209p;
            bVar2.f44347t = bVar.f44216t;
            bVar2.f44348u = bVar.f44217u;
            bVar2.f44349v = bVar.f44218v;
            bVar2.f44350w = bVar.f44219w;
            bVar2.f44351x = bVar.f44159F;
            bVar2.f44352y = bVar.f44160G;
            bVar2.f44353z = bVar.f44161H;
            bVar2.f44286A = bVar.f44211q;
            bVar2.f44287B = bVar.f44213r;
            bVar2.f44288C = bVar.f44215s;
            bVar2.f44289D = bVar.f44174U;
            bVar2.f44290E = bVar.f44175V;
            bVar2.f44291F = bVar.f44176W;
            bVar2.f44324g = bVar.f44185d;
            bVar2.f44320e = bVar.f44181b;
            bVar2.f44322f = bVar.f44183c;
            bVar2.f44316c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f44318d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f44292G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f44293H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f44294I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f44295J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f44298M = bVar.f44158E;
            bVar2.f44306U = bVar.f44163J;
            bVar2.f44307V = bVar.f44162I;
            bVar2.f44309X = bVar.f44165L;
            bVar2.f44308W = bVar.f44164K;
            bVar2.f44337m0 = bVar.f44177X;
            bVar2.f44339n0 = bVar.f44178Y;
            bVar2.f44310Y = bVar.f44166M;
            bVar2.f44311Z = bVar.f44167N;
            bVar2.f44313a0 = bVar.f44170Q;
            bVar2.f44315b0 = bVar.f44171R;
            bVar2.f44317c0 = bVar.f44168O;
            bVar2.f44319d0 = bVar.f44169P;
            bVar2.f44321e0 = bVar.f44172S;
            bVar2.f44323f0 = bVar.f44173T;
            bVar2.f44335l0 = bVar.f44179Z;
            bVar2.f44300O = bVar.f44221y;
            bVar2.f44302Q = bVar.f44154A;
            bVar2.f44299N = bVar.f44220x;
            bVar2.f44301P = bVar.f44222z;
            bVar2.f44304S = bVar.f44155B;
            bVar2.f44303R = bVar.f44156C;
            bVar2.f44305T = bVar.f44157D;
            bVar2.f44343p0 = bVar.f44180a0;
            bVar2.f44296K = bVar.getMarginEnd();
            bVar2.f44297L = bVar.getMarginStart();
        }

        public final void e(int i12, e.a aVar) {
            d(i12, aVar);
            this.f44267c.f44371d = aVar.f44393s0;
            float f12 = aVar.f44396v0;
            e eVar = this.f44270f;
            eVar.f44375b = f12;
            eVar.f44376c = aVar.f44397w0;
            eVar.f44377d = aVar.f44398x0;
            eVar.f44378e = aVar.f44399y0;
            eVar.f44379f = aVar.f44400z0;
            eVar.f44380g = aVar.f44388A0;
            eVar.f44381h = aVar.f44389B0;
            eVar.f44383j = aVar.f44390C0;
            eVar.f44384k = aVar.f44391D0;
            eVar.f44385l = aVar.f44392E0;
            eVar.f44387n = aVar.f44395u0;
            eVar.f44386m = aVar.f44394t0;
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class b {

        /* renamed from: q0, reason: collision with root package name */
        public static final SparseIntArray f44285q0;

        /* renamed from: c, reason: collision with root package name */
        public int f44316c;

        /* renamed from: d, reason: collision with root package name */
        public int f44318d;

        /* renamed from: j0, reason: collision with root package name */
        public int[] f44331j0;

        /* renamed from: k0, reason: collision with root package name */
        public String f44333k0;

        /* renamed from: l0, reason: collision with root package name */
        public String f44335l0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f44312a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f44314b = false;

        /* renamed from: e, reason: collision with root package name */
        public int f44320e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f44322f = -1;

        /* renamed from: g, reason: collision with root package name */
        public float f44324g = -1.0f;

        /* renamed from: h, reason: collision with root package name */
        public boolean f44326h = true;

        /* renamed from: i, reason: collision with root package name */
        public int f44328i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f44330j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f44332k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f44334l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f44336m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f44338n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f44340o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f44342p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f44344q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f44345r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f44346s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f44347t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f44348u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f44349v = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f44350w = -1;

        /* renamed from: x, reason: collision with root package name */
        public float f44351x = 0.5f;

        /* renamed from: y, reason: collision with root package name */
        public float f44352y = 0.5f;

        /* renamed from: z, reason: collision with root package name */
        public String f44353z = null;

        /* renamed from: A, reason: collision with root package name */
        public int f44286A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f44287B = 0;

        /* renamed from: C, reason: collision with root package name */
        public float f44288C = 0.0f;

        /* renamed from: D, reason: collision with root package name */
        public int f44289D = -1;

        /* renamed from: E, reason: collision with root package name */
        public int f44290E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f44291F = -1;

        /* renamed from: G, reason: collision with root package name */
        public int f44292G = 0;

        /* renamed from: H, reason: collision with root package name */
        public int f44293H = 0;

        /* renamed from: I, reason: collision with root package name */
        public int f44294I = 0;

        /* renamed from: J, reason: collision with root package name */
        public int f44295J = 0;

        /* renamed from: K, reason: collision with root package name */
        public int f44296K = 0;

        /* renamed from: L, reason: collision with root package name */
        public int f44297L = 0;

        /* renamed from: M, reason: collision with root package name */
        public int f44298M = 0;

        /* renamed from: N, reason: collision with root package name */
        public int f44299N = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: O, reason: collision with root package name */
        public int f44300O = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: P, reason: collision with root package name */
        public int f44301P = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: Q, reason: collision with root package name */
        public int f44302Q = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: R, reason: collision with root package name */
        public int f44303R = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: S, reason: collision with root package name */
        public int f44304S = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: T, reason: collision with root package name */
        public int f44305T = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: U, reason: collision with root package name */
        public float f44306U = -1.0f;

        /* renamed from: V, reason: collision with root package name */
        public float f44307V = -1.0f;

        /* renamed from: W, reason: collision with root package name */
        public int f44308W = 0;

        /* renamed from: X, reason: collision with root package name */
        public int f44309X = 0;

        /* renamed from: Y, reason: collision with root package name */
        public int f44310Y = 0;

        /* renamed from: Z, reason: collision with root package name */
        public int f44311Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f44313a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f44315b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f44317c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f44319d0 = 0;

        /* renamed from: e0, reason: collision with root package name */
        public float f44321e0 = 1.0f;

        /* renamed from: f0, reason: collision with root package name */
        public float f44323f0 = 1.0f;

        /* renamed from: g0, reason: collision with root package name */
        public int f44325g0 = -1;

        /* renamed from: h0, reason: collision with root package name */
        public int f44327h0 = 0;

        /* renamed from: i0, reason: collision with root package name */
        public int f44329i0 = -1;

        /* renamed from: m0, reason: collision with root package name */
        public boolean f44337m0 = false;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f44339n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f44341o0 = true;

        /* renamed from: p0, reason: collision with root package name */
        public int f44343p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f44285q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(b bVar) {
            this.f44312a = bVar.f44312a;
            this.f44316c = bVar.f44316c;
            this.f44314b = bVar.f44314b;
            this.f44318d = bVar.f44318d;
            this.f44320e = bVar.f44320e;
            this.f44322f = bVar.f44322f;
            this.f44324g = bVar.f44324g;
            this.f44326h = bVar.f44326h;
            this.f44328i = bVar.f44328i;
            this.f44330j = bVar.f44330j;
            this.f44332k = bVar.f44332k;
            this.f44334l = bVar.f44334l;
            this.f44336m = bVar.f44336m;
            this.f44338n = bVar.f44338n;
            this.f44340o = bVar.f44340o;
            this.f44342p = bVar.f44342p;
            this.f44344q = bVar.f44344q;
            this.f44345r = bVar.f44345r;
            this.f44346s = bVar.f44346s;
            this.f44347t = bVar.f44347t;
            this.f44348u = bVar.f44348u;
            this.f44349v = bVar.f44349v;
            this.f44350w = bVar.f44350w;
            this.f44351x = bVar.f44351x;
            this.f44352y = bVar.f44352y;
            this.f44353z = bVar.f44353z;
            this.f44286A = bVar.f44286A;
            this.f44287B = bVar.f44287B;
            this.f44288C = bVar.f44288C;
            this.f44289D = bVar.f44289D;
            this.f44290E = bVar.f44290E;
            this.f44291F = bVar.f44291F;
            this.f44292G = bVar.f44292G;
            this.f44293H = bVar.f44293H;
            this.f44294I = bVar.f44294I;
            this.f44295J = bVar.f44295J;
            this.f44296K = bVar.f44296K;
            this.f44297L = bVar.f44297L;
            this.f44298M = bVar.f44298M;
            this.f44299N = bVar.f44299N;
            this.f44300O = bVar.f44300O;
            this.f44301P = bVar.f44301P;
            this.f44302Q = bVar.f44302Q;
            this.f44303R = bVar.f44303R;
            this.f44304S = bVar.f44304S;
            this.f44305T = bVar.f44305T;
            this.f44306U = bVar.f44306U;
            this.f44307V = bVar.f44307V;
            this.f44308W = bVar.f44308W;
            this.f44309X = bVar.f44309X;
            this.f44310Y = bVar.f44310Y;
            this.f44311Z = bVar.f44311Z;
            this.f44313a0 = bVar.f44313a0;
            this.f44315b0 = bVar.f44315b0;
            this.f44317c0 = bVar.f44317c0;
            this.f44319d0 = bVar.f44319d0;
            this.f44321e0 = bVar.f44321e0;
            this.f44323f0 = bVar.f44323f0;
            this.f44325g0 = bVar.f44325g0;
            this.f44327h0 = bVar.f44327h0;
            this.f44329i0 = bVar.f44329i0;
            this.f44335l0 = bVar.f44335l0;
            int[] iArr = bVar.f44331j0;
            if (iArr == null || bVar.f44333k0 != null) {
                this.f44331j0 = null;
            } else {
                this.f44331j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f44333k0 = bVar.f44333k0;
            this.f44337m0 = bVar.f44337m0;
            this.f44339n0 = bVar.f44339n0;
            this.f44341o0 = bVar.f44341o0;
            this.f44343p0 = bVar.f44343p0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.f44414k);
            this.f44314b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                SparseIntArray sparseIntArray = f44285q0;
                int i13 = sparseIntArray.get(index);
                switch (i13) {
                    case 1:
                        this.f44344q = d.t(typedArrayObtainStyledAttributes, index, this.f44344q);
                        break;
                    case 2:
                        this.f44295J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44295J);
                        break;
                    case 3:
                        this.f44342p = d.t(typedArrayObtainStyledAttributes, index, this.f44342p);
                        break;
                    case 4:
                        this.f44340o = d.t(typedArrayObtainStyledAttributes, index, this.f44340o);
                        break;
                    case 5:
                        this.f44353z = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f44289D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f44289D);
                        break;
                    case 7:
                        this.f44290E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f44290E);
                        break;
                    case 8:
                        this.f44296K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44296K);
                        break;
                    case 9:
                        this.f44350w = d.t(typedArrayObtainStyledAttributes, index, this.f44350w);
                        break;
                    case 10:
                        this.f44349v = d.t(typedArrayObtainStyledAttributes, index, this.f44349v);
                        break;
                    case 11:
                        this.f44302Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44302Q);
                        break;
                    case 12:
                        this.f44303R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44303R);
                        break;
                    case 13:
                        this.f44299N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44299N);
                        break;
                    case 14:
                        this.f44301P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44301P);
                        break;
                    case 15:
                        this.f44304S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44304S);
                        break;
                    case 16:
                        this.f44300O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44300O);
                        break;
                    case 17:
                        this.f44320e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f44320e);
                        break;
                    case 18:
                        this.f44322f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f44322f);
                        break;
                    case 19:
                        this.f44324g = typedArrayObtainStyledAttributes.getFloat(index, this.f44324g);
                        break;
                    case 20:
                        this.f44351x = typedArrayObtainStyledAttributes.getFloat(index, this.f44351x);
                        break;
                    case 21:
                        this.f44318d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f44318d);
                        break;
                    case 22:
                        this.f44316c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f44316c);
                        break;
                    case 23:
                        this.f44292G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44292G);
                        break;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        this.f44328i = d.t(typedArrayObtainStyledAttributes, index, this.f44328i);
                        break;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        this.f44330j = d.t(typedArrayObtainStyledAttributes, index, this.f44330j);
                        break;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        this.f44291F = typedArrayObtainStyledAttributes.getInt(index, this.f44291F);
                        break;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        this.f44293H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44293H);
                        break;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        this.f44332k = d.t(typedArrayObtainStyledAttributes, index, this.f44332k);
                        break;
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        this.f44334l = d.t(typedArrayObtainStyledAttributes, index, this.f44334l);
                        break;
                    case 30:
                        this.f44297L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44297L);
                        break;
                    case 31:
                        this.f44347t = d.t(typedArrayObtainStyledAttributes, index, this.f44347t);
                        break;
                    case 32:
                        this.f44348u = d.t(typedArrayObtainStyledAttributes, index, this.f44348u);
                        break;
                    case 33:
                        this.f44294I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44294I);
                        break;
                    case 34:
                        this.f44338n = d.t(typedArrayObtainStyledAttributes, index, this.f44338n);
                        break;
                    case 35:
                        this.f44336m = d.t(typedArrayObtainStyledAttributes, index, this.f44336m);
                        break;
                    case 36:
                        this.f44352y = typedArrayObtainStyledAttributes.getFloat(index, this.f44352y);
                        break;
                    case 37:
                        this.f44307V = typedArrayObtainStyledAttributes.getFloat(index, this.f44307V);
                        break;
                    case 38:
                        this.f44306U = typedArrayObtainStyledAttributes.getFloat(index, this.f44306U);
                        break;
                    case 39:
                        this.f44308W = typedArrayObtainStyledAttributes.getInt(index, this.f44308W);
                        break;
                    case 40:
                        this.f44309X = typedArrayObtainStyledAttributes.getInt(index, this.f44309X);
                        break;
                    case 41:
                        d.u(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.u(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i13) {
                            case 61:
                                this.f44286A = d.t(typedArrayObtainStyledAttributes, index, this.f44286A);
                                break;
                            case 62:
                                this.f44287B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44287B);
                                break;
                            case 63:
                                this.f44288C = typedArrayObtainStyledAttributes.getFloat(index, this.f44288C);
                                break;
                            default:
                                switch (i13) {
                                    case 69:
                                        this.f44321e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f44323f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.f44325g0 = typedArrayObtainStyledAttributes.getInt(index, this.f44325g0);
                                        break;
                                    case 73:
                                        this.f44327h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44327h0);
                                        break;
                                    case 74:
                                        this.f44333k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f44341o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f44341o0);
                                        break;
                                    case 76:
                                        this.f44343p0 = typedArrayObtainStyledAttributes.getInt(index, this.f44343p0);
                                        break;
                                    case 77:
                                        this.f44345r = d.t(typedArrayObtainStyledAttributes, index, this.f44345r);
                                        break;
                                    case 78:
                                        this.f44346s = d.t(typedArrayObtainStyledAttributes, index, this.f44346s);
                                        break;
                                    case 79:
                                        this.f44305T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44305T);
                                        break;
                                    case 80:
                                        this.f44298M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44298M);
                                        break;
                                    case 81:
                                        this.f44310Y = typedArrayObtainStyledAttributes.getInt(index, this.f44310Y);
                                        break;
                                    case 82:
                                        this.f44311Z = typedArrayObtainStyledAttributes.getInt(index, this.f44311Z);
                                        break;
                                    case 83:
                                        this.f44315b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44315b0);
                                        break;
                                    case 84:
                                        this.f44313a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44313a0);
                                        break;
                                    case 85:
                                        this.f44319d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44319d0);
                                        break;
                                    case 86:
                                        this.f44317c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44317c0);
                                        break;
                                    case 87:
                                        this.f44337m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f44337m0);
                                        break;
                                    case 88:
                                        this.f44339n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f44339n0);
                                        break;
                                    case 89:
                                        this.f44335l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                                        this.f44326h = typedArrayObtainStyledAttributes.getBoolean(index, this.f44326h);
                                        break;
                                    case 91:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
                                        break;
                                    default:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class c {

        /* renamed from: n, reason: collision with root package name */
        public static final SparseIntArray f44354n;

        /* renamed from: a, reason: collision with root package name */
        public boolean f44355a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f44356b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f44357c = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f44358d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f44359e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f44360f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f44361g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f44362h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f44363i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public int f44364j = -1;

        /* renamed from: k, reason: collision with root package name */
        public String f44365k = null;

        /* renamed from: l, reason: collision with root package name */
        public int f44366l = -3;

        /* renamed from: m, reason: collision with root package name */
        public int f44367m = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f44354n = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(c cVar) {
            this.f44355a = cVar.f44355a;
            this.f44356b = cVar.f44356b;
            this.f44358d = cVar.f44358d;
            this.f44359e = cVar.f44359e;
            this.f44360f = cVar.f44360f;
            this.f44362h = cVar.f44362h;
            this.f44361g = cVar.f44361g;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.f44415l);
            this.f44355a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                switch (f44354n.get(index)) {
                    case 1:
                        this.f44362h = typedArrayObtainStyledAttributes.getFloat(index, this.f44362h);
                        break;
                    case 2:
                        this.f44359e = typedArrayObtainStyledAttributes.getInt(index, this.f44359e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f44358d = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f44358d = androidx.constraintlayout.core.motion.utils.d.f43284c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f44360f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f44356b = d.t(typedArrayObtainStyledAttributes, index, this.f44356b);
                        break;
                    case 6:
                        this.f44357c = typedArrayObtainStyledAttributes.getInteger(index, this.f44357c);
                        break;
                    case 7:
                        this.f44361g = typedArrayObtainStyledAttributes.getFloat(index, this.f44361g);
                        break;
                    case 8:
                        this.f44364j = typedArrayObtainStyledAttributes.getInteger(index, this.f44364j);
                        break;
                    case 9:
                        this.f44363i = typedArrayObtainStyledAttributes.getFloat(index, this.f44363i);
                        break;
                    case 10:
                        int i13 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i13 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f44367m = resourceId;
                            if (resourceId != -1) {
                                this.f44366l = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i13 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f44365k = string;
                            if (string.indexOf("/") > 0) {
                                this.f44367m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f44366l = -2;
                                break;
                            } else {
                                this.f44366l = -1;
                                break;
                            }
                        } else {
                            this.f44366l = typedArrayObtainStyledAttributes.getInteger(index, this.f44367m);
                            break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C1714d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f44368a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f44369b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f44370c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f44371d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f44372e = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.f44421r);
            this.f44368a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 1) {
                    this.f44371d = typedArrayObtainStyledAttributes.getFloat(index, this.f44371d);
                } else if (index == 0) {
                    int i13 = typedArrayObtainStyledAttributes.getInt(index, this.f44369b);
                    this.f44369b = i13;
                    this.f44369b = d.f44256g[i13];
                } else if (index == 4) {
                    this.f44370c = typedArrayObtainStyledAttributes.getInt(index, this.f44370c);
                } else if (index == 3) {
                    this.f44372e = typedArrayObtainStyledAttributes.getFloat(index, this.f44372e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class e {

        /* renamed from: o, reason: collision with root package name */
        public static final SparseIntArray f44373o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f44374a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f44375b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f44376c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f44377d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f44378e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f44379f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f44380g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f44381h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public int f44382i = -1;

        /* renamed from: j, reason: collision with root package name */
        public float f44383j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f44384k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f44385l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f44386m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f44387n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f44373o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(e eVar) {
            this.f44374a = eVar.f44374a;
            this.f44375b = eVar.f44375b;
            this.f44376c = eVar.f44376c;
            this.f44377d = eVar.f44377d;
            this.f44378e = eVar.f44378e;
            this.f44379f = eVar.f44379f;
            this.f44380g = eVar.f44380g;
            this.f44381h = eVar.f44381h;
            this.f44382i = eVar.f44382i;
            this.f44383j = eVar.f44383j;
            this.f44384k = eVar.f44384k;
            this.f44385l = eVar.f44385l;
            this.f44386m = eVar.f44386m;
            this.f44387n = eVar.f44387n;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.f44424u);
            this.f44374a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                switch (f44373o.get(index)) {
                    case 1:
                        this.f44375b = typedArrayObtainStyledAttributes.getFloat(index, this.f44375b);
                        break;
                    case 2:
                        this.f44376c = typedArrayObtainStyledAttributes.getFloat(index, this.f44376c);
                        break;
                    case 3:
                        this.f44377d = typedArrayObtainStyledAttributes.getFloat(index, this.f44377d);
                        break;
                    case 4:
                        this.f44378e = typedArrayObtainStyledAttributes.getFloat(index, this.f44378e);
                        break;
                    case 5:
                        this.f44379f = typedArrayObtainStyledAttributes.getFloat(index, this.f44379f);
                        break;
                    case 6:
                        this.f44380g = typedArrayObtainStyledAttributes.getDimension(index, this.f44380g);
                        break;
                    case 7:
                        this.f44381h = typedArrayObtainStyledAttributes.getDimension(index, this.f44381h);
                        break;
                    case 8:
                        this.f44383j = typedArrayObtainStyledAttributes.getDimension(index, this.f44383j);
                        break;
                    case 9:
                        this.f44384k = typedArrayObtainStyledAttributes.getDimension(index, this.f44384k);
                        break;
                    case 10:
                        this.f44385l = typedArrayObtainStyledAttributes.getDimension(index, this.f44385l);
                        break;
                    case 11:
                        this.f44386m = true;
                        this.f44387n = typedArrayObtainStyledAttributes.getDimension(index, this.f44387n);
                        break;
                    case 12:
                        this.f44382i = d.t(typedArrayObtainStyledAttributes, index, this.f44382i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public class f {
    }

    /* compiled from: ConstraintSet.java */
    public class g {
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f44257h = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f44258i = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(UpdateStatusCode.DialogButton.CONFIRM, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(UpdateStatusCode.DialogButton.CONFIRM, 86);
        sparseIntArray2.append(94, 97);
    }

    public static String A(int i12) {
        switch (i12) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public static a e(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, h.m.f44406c);
        w(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int[] m(Barrier barrier, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i12 = 0;
        int i13 = 0;
        while (i12 < strArrSplit.length) {
            String strTrim = strArrSplit[i12].trim();
            try {
                iIntValue = h.g.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i13] = iIntValue;
            i12++;
            i13++;
        }
        return i13 != strArrSplit.length ? Arrays.copyOf(iArr, i13) : iArr;
    }

    public static a o(Context context, AttributeSet attributeSet, boolean z12) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z12 ? h.m.f44406c : h.m.f44404a);
        if (z12) {
            w(aVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i12 = 0;
            while (true) {
                b bVar = aVar.f44269e;
                if (i12 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i12);
                    C1714d c1714d = aVar.f44267c;
                    e eVar = aVar.f44270f;
                    c cVar = aVar.f44268d;
                    if (index != 1 && 23 != index && 24 != index) {
                        cVar.f44355a = true;
                        bVar.f44314b = true;
                        c1714d.f44368a = true;
                        eVar.f44374a = true;
                    }
                    SparseIntArray sparseIntArray = f44257h;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            bVar.f44344q = t(typedArrayObtainStyledAttributes, index, bVar.f44344q);
                            break;
                        case 2:
                            bVar.f44295J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44295J);
                            break;
                        case 3:
                            bVar.f44342p = t(typedArrayObtainStyledAttributes, index, bVar.f44342p);
                            break;
                        case 4:
                            bVar.f44340o = t(typedArrayObtainStyledAttributes, index, bVar.f44340o);
                            break;
                        case 5:
                            bVar.f44353z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            bVar.f44289D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f44289D);
                            break;
                        case 7:
                            bVar.f44290E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f44290E);
                            break;
                        case 8:
                            bVar.f44296K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44296K);
                            break;
                        case 9:
                            bVar.f44350w = t(typedArrayObtainStyledAttributes, index, bVar.f44350w);
                            break;
                        case 10:
                            bVar.f44349v = t(typedArrayObtainStyledAttributes, index, bVar.f44349v);
                            break;
                        case 11:
                            bVar.f44302Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44302Q);
                            break;
                        case 12:
                            bVar.f44303R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44303R);
                            break;
                        case 13:
                            bVar.f44299N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44299N);
                            break;
                        case 14:
                            bVar.f44301P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44301P);
                            break;
                        case 15:
                            bVar.f44304S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44304S);
                            break;
                        case 16:
                            bVar.f44300O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44300O);
                            break;
                        case 17:
                            bVar.f44320e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f44320e);
                            break;
                        case 18:
                            bVar.f44322f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f44322f);
                            break;
                        case 19:
                            bVar.f44324g = typedArrayObtainStyledAttributes.getFloat(index, bVar.f44324g);
                            break;
                        case 20:
                            bVar.f44351x = typedArrayObtainStyledAttributes.getFloat(index, bVar.f44351x);
                            break;
                        case 21:
                            bVar.f44318d = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f44318d);
                            break;
                        case 22:
                            int i13 = typedArrayObtainStyledAttributes.getInt(index, c1714d.f44369b);
                            c1714d.f44369b = i13;
                            c1714d.f44369b = f44256g[i13];
                            break;
                        case 23:
                            bVar.f44316c = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f44316c);
                            break;
                        case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                            bVar.f44292G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44292G);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            bVar.f44328i = t(typedArrayObtainStyledAttributes, index, bVar.f44328i);
                            break;
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                            bVar.f44330j = t(typedArrayObtainStyledAttributes, index, bVar.f44330j);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                            bVar.f44291F = typedArrayObtainStyledAttributes.getInt(index, bVar.f44291F);
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            bVar.f44293H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44293H);
                            break;
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                            bVar.f44332k = t(typedArrayObtainStyledAttributes, index, bVar.f44332k);
                            break;
                        case 30:
                            bVar.f44334l = t(typedArrayObtainStyledAttributes, index, bVar.f44334l);
                            break;
                        case 31:
                            bVar.f44297L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44297L);
                            break;
                        case 32:
                            bVar.f44347t = t(typedArrayObtainStyledAttributes, index, bVar.f44347t);
                            break;
                        case 33:
                            bVar.f44348u = t(typedArrayObtainStyledAttributes, index, bVar.f44348u);
                            break;
                        case 34:
                            bVar.f44294I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44294I);
                            break;
                        case 35:
                            bVar.f44338n = t(typedArrayObtainStyledAttributes, index, bVar.f44338n);
                            break;
                        case 36:
                            bVar.f44336m = t(typedArrayObtainStyledAttributes, index, bVar.f44336m);
                            break;
                        case 37:
                            bVar.f44352y = typedArrayObtainStyledAttributes.getFloat(index, bVar.f44352y);
                            break;
                        case 38:
                            aVar.f44265a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f44265a);
                            break;
                        case 39:
                            bVar.f44307V = typedArrayObtainStyledAttributes.getFloat(index, bVar.f44307V);
                            break;
                        case 40:
                            bVar.f44306U = typedArrayObtainStyledAttributes.getFloat(index, bVar.f44306U);
                            break;
                        case 41:
                            bVar.f44308W = typedArrayObtainStyledAttributes.getInt(index, bVar.f44308W);
                            break;
                        case 42:
                            bVar.f44309X = typedArrayObtainStyledAttributes.getInt(index, bVar.f44309X);
                            break;
                        case 43:
                            c1714d.f44371d = typedArrayObtainStyledAttributes.getFloat(index, c1714d.f44371d);
                            break;
                        case 44:
                            eVar.f44386m = true;
                            eVar.f44387n = typedArrayObtainStyledAttributes.getDimension(index, eVar.f44387n);
                            break;
                        case 45:
                            eVar.f44376c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f44376c);
                            break;
                        case 46:
                            eVar.f44377d = typedArrayObtainStyledAttributes.getFloat(index, eVar.f44377d);
                            break;
                        case 47:
                            eVar.f44378e = typedArrayObtainStyledAttributes.getFloat(index, eVar.f44378e);
                            break;
                        case 48:
                            eVar.f44379f = typedArrayObtainStyledAttributes.getFloat(index, eVar.f44379f);
                            break;
                        case 49:
                            eVar.f44380g = typedArrayObtainStyledAttributes.getDimension(index, eVar.f44380g);
                            break;
                        case 50:
                            eVar.f44381h = typedArrayObtainStyledAttributes.getDimension(index, eVar.f44381h);
                            break;
                        case 51:
                            eVar.f44383j = typedArrayObtainStyledAttributes.getDimension(index, eVar.f44383j);
                            break;
                        case 52:
                            eVar.f44384k = typedArrayObtainStyledAttributes.getDimension(index, eVar.f44384k);
                            break;
                        case 53:
                            eVar.f44385l = typedArrayObtainStyledAttributes.getDimension(index, eVar.f44385l);
                            break;
                        case 54:
                            bVar.f44310Y = typedArrayObtainStyledAttributes.getInt(index, bVar.f44310Y);
                            break;
                        case 55:
                            bVar.f44311Z = typedArrayObtainStyledAttributes.getInt(index, bVar.f44311Z);
                            break;
                        case 56:
                            bVar.f44313a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44313a0);
                            break;
                        case 57:
                            bVar.f44315b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44315b0);
                            break;
                        case 58:
                            bVar.f44317c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44317c0);
                            break;
                        case 59:
                            bVar.f44319d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44319d0);
                            break;
                        case 60:
                            eVar.f44375b = typedArrayObtainStyledAttributes.getFloat(index, eVar.f44375b);
                            break;
                        case 61:
                            bVar.f44286A = t(typedArrayObtainStyledAttributes, index, bVar.f44286A);
                            break;
                        case 62:
                            bVar.f44287B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44287B);
                            break;
                        case 63:
                            bVar.f44288C = typedArrayObtainStyledAttributes.getFloat(index, bVar.f44288C);
                            break;
                        case 64:
                            cVar.f44356b = t(typedArrayObtainStyledAttributes, index, cVar.f44356b);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                cVar.f44358d = androidx.constraintlayout.core.motion.utils.d.f43284c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                                break;
                            } else {
                                cVar.f44358d = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            }
                        case 66:
                            cVar.f44360f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            cVar.f44362h = typedArrayObtainStyledAttributes.getFloat(index, cVar.f44362h);
                            break;
                        case 68:
                            c1714d.f44372e = typedArrayObtainStyledAttributes.getFloat(index, c1714d.f44372e);
                            break;
                        case 69:
                            bVar.f44321e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            bVar.f44323f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            break;
                        case 72:
                            bVar.f44325g0 = typedArrayObtainStyledAttributes.getInt(index, bVar.f44325g0);
                            break;
                        case 73:
                            bVar.f44327h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44327h0);
                            break;
                        case 74:
                            bVar.f44333k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            bVar.f44341o0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f44341o0);
                            break;
                        case 76:
                            cVar.f44359e = typedArrayObtainStyledAttributes.getInt(index, cVar.f44359e);
                            break;
                        case 77:
                            bVar.f44335l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            c1714d.f44370c = typedArrayObtainStyledAttributes.getInt(index, c1714d.f44370c);
                            break;
                        case 79:
                            cVar.f44361g = typedArrayObtainStyledAttributes.getFloat(index, cVar.f44361g);
                            break;
                        case 80:
                            bVar.f44337m0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f44337m0);
                            break;
                        case 81:
                            bVar.f44339n0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f44339n0);
                            break;
                        case 82:
                            cVar.f44357c = typedArrayObtainStyledAttributes.getInteger(index, cVar.f44357c);
                            break;
                        case 83:
                            eVar.f44382i = t(typedArrayObtainStyledAttributes, index, eVar.f44382i);
                            break;
                        case 84:
                            cVar.f44364j = typedArrayObtainStyledAttributes.getInteger(index, cVar.f44364j);
                            break;
                        case 85:
                            cVar.f44363i = typedArrayObtainStyledAttributes.getFloat(index, cVar.f44363i);
                            break;
                        case 86:
                            int i14 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i14 != 1) {
                                if (i14 != 3) {
                                    cVar.f44366l = typedArrayObtainStyledAttributes.getInteger(index, cVar.f44367m);
                                    break;
                                } else {
                                    String string = typedArrayObtainStyledAttributes.getString(index);
                                    cVar.f44365k = string;
                                    if (string.indexOf("/") <= 0) {
                                        cVar.f44366l = -1;
                                        break;
                                    } else {
                                        cVar.f44367m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        cVar.f44366l = -2;
                                        break;
                                    }
                                }
                            } else {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                cVar.f44367m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    cVar.f44366l = -2;
                                    break;
                                }
                            }
                        case 87:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 88:
                        case 89:
                        case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                        default:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 91:
                            bVar.f44345r = t(typedArrayObtainStyledAttributes, index, bVar.f44345r);
                            break;
                        case 92:
                            bVar.f44346s = t(typedArrayObtainStyledAttributes, index, bVar.f44346s);
                            break;
                        case 93:
                            bVar.f44298M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44298M);
                            break;
                        case 94:
                            bVar.f44305T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f44305T);
                            break;
                        case 95:
                            u(bVar, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            u(bVar, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            bVar.f44343p0 = typedArrayObtainStyledAttributes.getInt(index, bVar.f44343p0);
                            break;
                    }
                    i12++;
                } else if (bVar.f44333k0 != null) {
                    bVar.f44331j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int t(TypedArray typedArray, int i12, int i13) {
        int resourceId = typedArray.getResourceId(i12, i13);
        return resourceId == -1 ? typedArray.getInt(i12, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.u(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void v(ConstraintLayout.b bVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i12 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i12 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f12 = Float.parseFloat(strSubstring3);
                        float f13 = Float.parseFloat(strSubstring4);
                        if (f12 > 0.0f && f13 > 0.0f) {
                            if (i12 == 1) {
                                Math.abs(f13 / f12);
                            } else {
                                Math.abs(f12 / f13);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.f44161H = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void w(a aVar, TypedArray typedArray) {
        int i12;
        int indexCount = typedArray.getIndexCount();
        a.C1713a c1713a = new a.C1713a();
        aVar.f44272h = c1713a;
        c cVar = aVar.f44268d;
        int i13 = 0;
        cVar.f44355a = false;
        b bVar = aVar.f44269e;
        bVar.f44314b = false;
        C1714d c1714d = aVar.f44267c;
        c1714d.f44368a = false;
        e eVar = aVar.f44270f;
        eVar.f44374a = false;
        int i14 = 0;
        while (i14 < indexCount) {
            int index = typedArray.getIndex(i14);
            int i15 = f44258i.get(index);
            SparseIntArray sparseIntArray = f44257h;
            switch (i15) {
                case 2:
                    i12 = i13;
                    c1713a.b(2, typedArray.getDimensionPixelSize(index, bVar.f44295J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                case 91:
                case 92:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i12 = i13;
                    break;
                case 5:
                    i12 = i13;
                    c1713a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    i12 = i13;
                    c1713a.b(6, typedArray.getDimensionPixelOffset(index, bVar.f44289D));
                    break;
                case 7:
                    i12 = i13;
                    c1713a.b(7, typedArray.getDimensionPixelOffset(index, bVar.f44290E));
                    break;
                case 8:
                    i12 = i13;
                    c1713a.b(8, typedArray.getDimensionPixelSize(index, bVar.f44296K));
                    break;
                case 11:
                    i12 = i13;
                    c1713a.b(11, typedArray.getDimensionPixelSize(index, bVar.f44302Q));
                    break;
                case 12:
                    i12 = i13;
                    c1713a.b(12, typedArray.getDimensionPixelSize(index, bVar.f44303R));
                    break;
                case 13:
                    i12 = i13;
                    c1713a.b(13, typedArray.getDimensionPixelSize(index, bVar.f44299N));
                    break;
                case 14:
                    i12 = i13;
                    c1713a.b(14, typedArray.getDimensionPixelSize(index, bVar.f44301P));
                    break;
                case 15:
                    i12 = i13;
                    c1713a.b(15, typedArray.getDimensionPixelSize(index, bVar.f44304S));
                    break;
                case 16:
                    i12 = i13;
                    c1713a.b(16, typedArray.getDimensionPixelSize(index, bVar.f44300O));
                    break;
                case 17:
                    i12 = i13;
                    c1713a.b(17, typedArray.getDimensionPixelOffset(index, bVar.f44320e));
                    break;
                case 18:
                    i12 = i13;
                    c1713a.b(18, typedArray.getDimensionPixelOffset(index, bVar.f44322f));
                    break;
                case 19:
                    i12 = i13;
                    c1713a.a(typedArray.getFloat(index, bVar.f44324g), 19);
                    break;
                case 20:
                    i12 = i13;
                    c1713a.a(typedArray.getFloat(index, bVar.f44351x), 20);
                    break;
                case 21:
                    i12 = i13;
                    c1713a.b(21, typedArray.getLayoutDimension(index, bVar.f44318d));
                    break;
                case 22:
                    i12 = i13;
                    c1713a.b(22, f44256g[typedArray.getInt(index, c1714d.f44369b)]);
                    break;
                case 23:
                    i12 = i13;
                    c1713a.b(23, typedArray.getLayoutDimension(index, bVar.f44316c));
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    i12 = i13;
                    c1713a.b(24, typedArray.getDimensionPixelSize(index, bVar.f44292G));
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    i12 = i13;
                    c1713a.b(27, typedArray.getInt(index, bVar.f44291F));
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    i12 = i13;
                    c1713a.b(28, typedArray.getDimensionPixelSize(index, bVar.f44293H));
                    break;
                case 31:
                    i12 = i13;
                    c1713a.b(31, typedArray.getDimensionPixelSize(index, bVar.f44297L));
                    break;
                case 34:
                    i12 = i13;
                    c1713a.b(34, typedArray.getDimensionPixelSize(index, bVar.f44294I));
                    break;
                case 37:
                    i12 = i13;
                    c1713a.a(typedArray.getFloat(index, bVar.f44352y), 37);
                    break;
                case 38:
                    i12 = i13;
                    int resourceId = typedArray.getResourceId(index, aVar.f44265a);
                    aVar.f44265a = resourceId;
                    c1713a.b(38, resourceId);
                    break;
                case 39:
                    i12 = i13;
                    c1713a.a(typedArray.getFloat(index, bVar.f44307V), 39);
                    break;
                case 40:
                    i12 = i13;
                    c1713a.a(typedArray.getFloat(index, bVar.f44306U), 40);
                    break;
                case 41:
                    i12 = i13;
                    c1713a.b(41, typedArray.getInt(index, bVar.f44308W));
                    break;
                case 42:
                    i12 = i13;
                    c1713a.b(42, typedArray.getInt(index, bVar.f44309X));
                    break;
                case 43:
                    i12 = i13;
                    c1713a.a(typedArray.getFloat(index, c1714d.f44371d), 43);
                    break;
                case 44:
                    i12 = i13;
                    c1713a.d(44, true);
                    c1713a.a(typedArray.getDimension(index, eVar.f44387n), 44);
                    break;
                case 45:
                    i12 = i13;
                    c1713a.a(typedArray.getFloat(index, eVar.f44376c), 45);
                    break;
                case 46:
                    i12 = i13;
                    c1713a.a(typedArray.getFloat(index, eVar.f44377d), 46);
                    break;
                case 47:
                    i12 = i13;
                    c1713a.a(typedArray.getFloat(index, eVar.f44378e), 47);
                    break;
                case 48:
                    i12 = i13;
                    c1713a.a(typedArray.getFloat(index, eVar.f44379f), 48);
                    break;
                case 49:
                    i12 = i13;
                    c1713a.a(typedArray.getDimension(index, eVar.f44380g), 49);
                    break;
                case 50:
                    i12 = i13;
                    c1713a.a(typedArray.getDimension(index, eVar.f44381h), 50);
                    break;
                case 51:
                    i12 = i13;
                    c1713a.a(typedArray.getDimension(index, eVar.f44383j), 51);
                    break;
                case 52:
                    i12 = i13;
                    c1713a.a(typedArray.getDimension(index, eVar.f44384k), 52);
                    break;
                case 53:
                    i12 = i13;
                    c1713a.a(typedArray.getDimension(index, eVar.f44385l), 53);
                    break;
                case 54:
                    i12 = i13;
                    c1713a.b(54, typedArray.getInt(index, bVar.f44310Y));
                    break;
                case 55:
                    i12 = i13;
                    c1713a.b(55, typedArray.getInt(index, bVar.f44311Z));
                    break;
                case 56:
                    i12 = i13;
                    c1713a.b(56, typedArray.getDimensionPixelSize(index, bVar.f44313a0));
                    break;
                case 57:
                    i12 = i13;
                    c1713a.b(57, typedArray.getDimensionPixelSize(index, bVar.f44315b0));
                    break;
                case 58:
                    i12 = i13;
                    c1713a.b(58, typedArray.getDimensionPixelSize(index, bVar.f44317c0));
                    break;
                case 59:
                    i12 = i13;
                    c1713a.b(59, typedArray.getDimensionPixelSize(index, bVar.f44319d0));
                    break;
                case 60:
                    i12 = i13;
                    c1713a.a(typedArray.getFloat(index, eVar.f44375b), 60);
                    break;
                case 62:
                    i12 = i13;
                    c1713a.b(62, typedArray.getDimensionPixelSize(index, bVar.f44287B));
                    break;
                case 63:
                    i12 = i13;
                    c1713a.a(typedArray.getFloat(index, bVar.f44288C), 63);
                    break;
                case 64:
                    i12 = i13;
                    c1713a.b(64, t(typedArray, index, cVar.f44356b));
                    break;
                case 65:
                    i12 = i13;
                    if (typedArray.peekValue(index).type != 3) {
                        c1713a.c(65, androidx.constraintlayout.core.motion.utils.d.f43284c[typedArray.getInteger(index, i12)]);
                        break;
                    } else {
                        c1713a.c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    i12 = 0;
                    c1713a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c1713a.a(typedArray.getFloat(index, cVar.f44362h), 67);
                    i12 = 0;
                    break;
                case 68:
                    c1713a.a(typedArray.getFloat(index, c1714d.f44372e), 68);
                    i12 = 0;
                    break;
                case 69:
                    c1713a.a(typedArray.getFloat(index, 1.0f), 69);
                    i12 = 0;
                    break;
                case 70:
                    c1713a.a(typedArray.getFloat(index, 1.0f), 70);
                    i12 = 0;
                    break;
                case 71:
                    i12 = i13;
                    break;
                case 72:
                    c1713a.b(72, typedArray.getInt(index, bVar.f44325g0));
                    i12 = 0;
                    break;
                case 73:
                    c1713a.b(73, typedArray.getDimensionPixelSize(index, bVar.f44327h0));
                    i12 = 0;
                    break;
                case 74:
                    c1713a.c(74, typedArray.getString(index));
                    i12 = 0;
                    break;
                case 75:
                    c1713a.d(75, typedArray.getBoolean(index, bVar.f44341o0));
                    i12 = 0;
                    break;
                case 76:
                    c1713a.b(76, typedArray.getInt(index, cVar.f44359e));
                    i12 = 0;
                    break;
                case 77:
                    c1713a.c(77, typedArray.getString(index));
                    i12 = 0;
                    break;
                case 78:
                    c1713a.b(78, typedArray.getInt(index, c1714d.f44370c));
                    i12 = 0;
                    break;
                case 79:
                    c1713a.a(typedArray.getFloat(index, cVar.f44361g), 79);
                    i12 = 0;
                    break;
                case 80:
                    c1713a.d(80, typedArray.getBoolean(index, bVar.f44337m0));
                    i12 = 0;
                    break;
                case 81:
                    c1713a.d(81, typedArray.getBoolean(index, bVar.f44339n0));
                    i12 = 0;
                    break;
                case 82:
                    c1713a.b(82, typedArray.getInteger(index, cVar.f44357c));
                    i12 = 0;
                    break;
                case 83:
                    c1713a.b(83, t(typedArray, index, eVar.f44382i));
                    i12 = 0;
                    break;
                case 84:
                    c1713a.b(84, typedArray.getInteger(index, cVar.f44364j));
                    i12 = 0;
                    break;
                case 85:
                    c1713a.a(typedArray.getFloat(index, cVar.f44363i), 85);
                    i12 = 0;
                    break;
                case 86:
                    int i16 = typedArray.peekValue(index).type;
                    if (i16 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        cVar.f44367m = resourceId2;
                        c1713a.b(89, resourceId2);
                        if (cVar.f44367m != -1) {
                            cVar.f44366l = -2;
                            c1713a.b(88, -2);
                        }
                    } else if (i16 == 3) {
                        String string = typedArray.getString(index);
                        cVar.f44365k = string;
                        c1713a.c(90, string);
                        if (cVar.f44365k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            cVar.f44367m = resourceId3;
                            c1713a.b(89, resourceId3);
                            cVar.f44366l = -2;
                            c1713a.b(88, -2);
                        } else {
                            cVar.f44366l = -1;
                            c1713a.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, cVar.f44367m);
                        cVar.f44366l = integer;
                        c1713a.b(88, integer);
                    }
                    i12 = 0;
                    break;
                case 87:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i12 = i13;
                    break;
                case 93:
                    c1713a.b(93, typedArray.getDimensionPixelSize(index, bVar.f44298M));
                    i12 = i13;
                    break;
                case 94:
                    c1713a.b(94, typedArray.getDimensionPixelSize(index, bVar.f44305T));
                    i12 = i13;
                    break;
                case 95:
                    u(c1713a, typedArray, index, i13);
                    i12 = i13;
                    break;
                case 96:
                    u(c1713a, typedArray, index, 1);
                    i12 = i13;
                    break;
                case 97:
                    c1713a.b(97, typedArray.getInt(index, bVar.f44343p0));
                    i12 = i13;
                    break;
                case 98:
                    if (MotionLayout.f43782q0) {
                        int resourceId4 = typedArray.getResourceId(index, aVar.f44265a);
                        aVar.f44265a = resourceId4;
                        if (resourceId4 == -1) {
                            aVar.f44266b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f44266b = typedArray.getString(index);
                    } else {
                        aVar.f44265a = typedArray.getResourceId(index, aVar.f44265a);
                    }
                    i12 = i13;
                    break;
                case 99:
                    c1713a.d(99, typedArray.getBoolean(index, bVar.f44326h));
                    i12 = i13;
                    break;
            }
            i14++;
            i13 = i12;
        }
    }

    public final void a(MotionLayout motionLayout) {
        a aVar;
        int childCount = motionLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = motionLayout.getChildAt(i12);
            int id2 = childAt.getId();
            HashMap<Integer, a> map = this.f44264f;
            if (!map.containsKey(Integer.valueOf(id2))) {
                C22737c.d(childAt);
            } else {
                if (this.f44263e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id2)) && (aVar = map.get(Integer.valueOf(id2))) != null) {
                    ConstraintAttribute.e(childAt, aVar.f44271g);
                }
            }
        }
    }

    public final void b(d dVar) {
        for (a aVar : dVar.f44264f.values()) {
            if (aVar.f44272h != null) {
                if (aVar.f44266b != null) {
                    Iterator<Integer> it = this.f44264f.keySet().iterator();
                    while (it.hasNext()) {
                        a aVarQ = q(it.next().intValue());
                        String str = aVarQ.f44269e.f44335l0;
                        if (str != null && aVar.f44266b.matches(str)) {
                            aVar.f44272h.e(aVarQ);
                            aVarQ.f44271g.putAll((HashMap) aVar.f44271g.clone());
                        }
                    }
                } else {
                    aVar.f44272h.e(q(aVar.f44265a));
                }
            }
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        d(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void d(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map = this.f44264f;
        HashSet hashSet = new HashSet(map.keySet());
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = constraintLayout.getChildAt(i12);
            int id2 = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id2))) {
                C22737c.d(childAt);
            } else {
                if (this.f44263e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1 && map.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    a aVar = map.get(Integer.valueOf(id2));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            b bVar = aVar.f44269e;
                            bVar.f44329i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(bVar.f44325g0);
                            barrier.setMargin(bVar.f44327h0);
                            barrier.setAllowsGoneWidget(bVar.f44341o0);
                            int[] iArr = bVar.f44331j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f44333k0;
                                if (str != null) {
                                    int[] iArrM = m(barrier, str);
                                    bVar.f44331j0 = iArrM;
                                    barrier.setReferencedIds(iArrM);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.b();
                        aVar.b(bVar2);
                        ConstraintAttribute.e(childAt, aVar.f44271g);
                        childAt.setLayoutParams(bVar2);
                        C1714d c1714d = aVar.f44267c;
                        if (c1714d.f44370c == 0) {
                            childAt.setVisibility(c1714d.f44369b);
                        }
                        childAt.setAlpha(c1714d.f44371d);
                        e eVar = aVar.f44270f;
                        childAt.setRotation(eVar.f44375b);
                        childAt.setRotationX(eVar.f44376c);
                        childAt.setRotationY(eVar.f44377d);
                        childAt.setScaleX(eVar.f44378e);
                        childAt.setScaleY(eVar.f44379f);
                        if (eVar.f44382i != -1) {
                            if (((View) childAt.getParent()).findViewById(eVar.f44382i) != null) {
                                float bottom = (r7.getBottom() + r7.getTop()) / 2.0f;
                                float right = (r7.getRight() + r7.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f44380g)) {
                                childAt.setPivotX(eVar.f44380g);
                            }
                            if (!Float.isNaN(eVar.f44381h)) {
                                childAt.setPivotY(eVar.f44381h);
                            }
                        }
                        childAt.setTranslationX(eVar.f44383j);
                        childAt.setTranslationY(eVar.f44384k);
                        childAt.setTranslationZ(eVar.f44385l);
                        if (eVar.f44386m) {
                            childAt.setElevation(eVar.f44387n);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = map.get(num);
            if (aVar2 != null) {
                b bVar3 = aVar2.f44269e;
                if (bVar3.f44329i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = bVar3.f44331j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f44333k0;
                        if (str2 != null) {
                            int[] iArrM2 = m(barrier2, str2);
                            bVar3.f44331j0 = iArrM2;
                            barrier2.setReferencedIds(iArrM2);
                        }
                    }
                    barrier2.setType(bVar3.f44325g0);
                    barrier2.setMargin(bVar3.f44327h0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.r();
                    aVar2.b(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, bVarGenerateDefaultLayoutParams);
                }
                if (bVar3.f44312a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.b(bVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, bVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = constraintLayout.getChildAt(i13);
            if (childAt2 instanceof androidx.constraintlayout.widget.a) {
                ((androidx.constraintlayout.widget.a) childAt2).h(constraintLayout);
            }
        }
    }

    public final void f(int i12, int i13) {
        a aVar;
        HashMap<Integer, a> map = this.f44264f;
        if (!map.containsKey(Integer.valueOf(i12)) || (aVar = map.get(Integer.valueOf(i12))) == null) {
            return;
        }
        b bVar = aVar.f44269e;
        switch (i13) {
            case 1:
                bVar.f44330j = -1;
                bVar.f44328i = -1;
                bVar.f44292G = -1;
                bVar.f44299N = BeduinInputModel.MIN_TEXT_VERSION;
                return;
            case 2:
                bVar.f44334l = -1;
                bVar.f44332k = -1;
                bVar.f44293H = -1;
                bVar.f44301P = BeduinInputModel.MIN_TEXT_VERSION;
                return;
            case 3:
                bVar.f44338n = -1;
                bVar.f44336m = -1;
                bVar.f44294I = 0;
                bVar.f44300O = BeduinInputModel.MIN_TEXT_VERSION;
                return;
            case 4:
                bVar.f44340o = -1;
                bVar.f44342p = -1;
                bVar.f44295J = 0;
                bVar.f44302Q = BeduinInputModel.MIN_TEXT_VERSION;
                return;
            case 5:
                bVar.f44344q = -1;
                bVar.f44345r = -1;
                bVar.f44346s = -1;
                bVar.f44298M = 0;
                bVar.f44305T = BeduinInputModel.MIN_TEXT_VERSION;
                return;
            case 6:
                bVar.f44347t = -1;
                bVar.f44348u = -1;
                bVar.f44297L = 0;
                bVar.f44304S = BeduinInputModel.MIN_TEXT_VERSION;
                return;
            case 7:
                bVar.f44349v = -1;
                bVar.f44350w = -1;
                bVar.f44296K = 0;
                bVar.f44303R = BeduinInputModel.MIN_TEXT_VERSION;
                return;
            case 8:
                bVar.f44288C = -1.0f;
                bVar.f44287B = -1;
                bVar.f44286A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void g(ConstraintLayout constraintLayout) {
        int i12;
        int i13;
        d dVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map = dVar.f44264f;
        map.clear();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = constraintLayout.getChildAt(i14);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (dVar.f44263e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id2))) {
                map.put(Integer.valueOf(id2), new a());
            }
            a aVar = map.get(Integer.valueOf(id2));
            if (aVar == null) {
                i12 = childCount;
            } else {
                HashMap<String, ConstraintAttribute> map2 = dVar.f44262d;
                HashMap<String, ConstraintAttribute> map3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    ConstraintAttribute constraintAttribute = map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i13 = childCount;
                        } else {
                            i13 = childCount;
                            try {
                                map3.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e12) {
                                e = e12;
                                e.printStackTrace();
                                childCount = i13;
                            } catch (NoSuchMethodException e13) {
                                e = e13;
                                e.printStackTrace();
                                childCount = i13;
                            } catch (InvocationTargetException e14) {
                                e = e14;
                                e.printStackTrace();
                                childCount = i13;
                            }
                        }
                    } catch (IllegalAccessException e15) {
                        e = e15;
                        i13 = childCount;
                    } catch (NoSuchMethodException e16) {
                        e = e16;
                        i13 = childCount;
                    } catch (InvocationTargetException e17) {
                        e = e17;
                        i13 = childCount;
                    }
                    childCount = i13;
                }
                i12 = childCount;
                aVar.f44271g = map3;
                aVar.d(id2, bVar);
                int visibility = childAt.getVisibility();
                C1714d c1714d = aVar.f44267c;
                c1714d.f44369b = visibility;
                c1714d.f44371d = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = aVar.f44270f;
                eVar.f44375b = rotation;
                eVar.f44376c = childAt.getRotationX();
                eVar.f44377d = childAt.getRotationY();
                eVar.f44378e = childAt.getScaleX();
                eVar.f44379f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f44380g = pivotX;
                    eVar.f44381h = pivotY;
                }
                eVar.f44383j = childAt.getTranslationX();
                eVar.f44384k = childAt.getTranslationY();
                eVar.f44385l = childAt.getTranslationZ();
                if (eVar.f44386m) {
                    eVar.f44387n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    b bVar2 = aVar.f44269e;
                    bVar2.f44341o0 = allowsGoneWidget;
                    bVar2.f44331j0 = barrier.getReferencedIds();
                    bVar2.f44325g0 = barrier.getType();
                    bVar2.f44327h0 = barrier.getMargin();
                }
            }
            i14++;
            dVar = this;
            childCount = i12;
        }
    }

    public final void h(d dVar) {
        HashMap<Integer, a> map = this.f44264f;
        map.clear();
        for (Integer num : dVar.f44264f.keySet()) {
            a aVar = dVar.f44264f.get(num);
            if (aVar != null) {
                map.put(num, aVar.clone());
            }
        }
    }

    public final void i(int i12, int i13, int i14, int i15) {
        HashMap<Integer, a> map = this.f44264f;
        if (!map.containsKey(Integer.valueOf(i12))) {
            map.put(Integer.valueOf(i12), new a());
        }
        a aVar = map.get(Integer.valueOf(i12));
        if (aVar == null) {
            return;
        }
        b bVar = aVar.f44269e;
        switch (i13) {
            case 1:
                if (i15 == 1) {
                    bVar.f44328i = i14;
                    bVar.f44330j = -1;
                    return;
                } else if (i15 == 2) {
                    bVar.f44330j = i14;
                    bVar.f44328i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + A(i15) + " undefined");
                }
            case 2:
                if (i15 == 1) {
                    bVar.f44332k = i14;
                    bVar.f44334l = -1;
                    return;
                } else if (i15 == 2) {
                    bVar.f44334l = i14;
                    bVar.f44332k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + A(i15) + " undefined");
                }
            case 3:
                if (i15 == 3) {
                    bVar.f44336m = i14;
                    bVar.f44338n = -1;
                    bVar.f44344q = -1;
                    bVar.f44345r = -1;
                    bVar.f44346s = -1;
                    return;
                }
                if (i15 != 4) {
                    throw new IllegalArgumentException("right to " + A(i15) + " undefined");
                }
                bVar.f44338n = i14;
                bVar.f44336m = -1;
                bVar.f44344q = -1;
                bVar.f44345r = -1;
                bVar.f44346s = -1;
                return;
            case 4:
                if (i15 == 4) {
                    bVar.f44342p = i14;
                    bVar.f44340o = -1;
                    bVar.f44344q = -1;
                    bVar.f44345r = -1;
                    bVar.f44346s = -1;
                    return;
                }
                if (i15 != 3) {
                    throw new IllegalArgumentException("right to " + A(i15) + " undefined");
                }
                bVar.f44340o = i14;
                bVar.f44342p = -1;
                bVar.f44344q = -1;
                bVar.f44345r = -1;
                bVar.f44346s = -1;
                return;
            case 5:
                if (i15 == 5) {
                    bVar.f44344q = i14;
                    bVar.f44342p = -1;
                    bVar.f44340o = -1;
                    bVar.f44336m = -1;
                    bVar.f44338n = -1;
                    return;
                }
                if (i15 == 3) {
                    bVar.f44345r = i14;
                    bVar.f44342p = -1;
                    bVar.f44340o = -1;
                    bVar.f44336m = -1;
                    bVar.f44338n = -1;
                    return;
                }
                if (i15 != 4) {
                    throw new IllegalArgumentException("right to " + A(i15) + " undefined");
                }
                bVar.f44346s = i14;
                bVar.f44342p = -1;
                bVar.f44340o = -1;
                bVar.f44336m = -1;
                bVar.f44338n = -1;
                return;
            case 6:
                if (i15 == 6) {
                    bVar.f44348u = i14;
                    bVar.f44347t = -1;
                    return;
                } else if (i15 == 7) {
                    bVar.f44347t = i14;
                    bVar.f44348u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + A(i15) + " undefined");
                }
            case 7:
                if (i15 == 7) {
                    bVar.f44350w = i14;
                    bVar.f44349v = -1;
                    return;
                } else if (i15 == 6) {
                    bVar.f44349v = i14;
                    bVar.f44350w = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + A(i15) + " undefined");
                }
            default:
                throw new IllegalArgumentException(A(i13) + " to " + A(i15) + " unknown");
        }
    }

    public final void j(int i12, int i13, int i14, int i15, int i16) {
        HashMap<Integer, a> map = this.f44264f;
        if (!map.containsKey(Integer.valueOf(i12))) {
            map.put(Integer.valueOf(i12), new a());
        }
        a aVar = map.get(Integer.valueOf(i12));
        if (aVar == null) {
            return;
        }
        b bVar = aVar.f44269e;
        switch (i13) {
            case 1:
                if (i15 == 1) {
                    bVar.f44328i = i14;
                    bVar.f44330j = -1;
                } else {
                    if (i15 != 2) {
                        throw new IllegalArgumentException("Left to " + A(i15) + " undefined");
                    }
                    bVar.f44330j = i14;
                    bVar.f44328i = -1;
                }
                bVar.f44292G = i16;
                return;
            case 2:
                if (i15 == 1) {
                    bVar.f44332k = i14;
                    bVar.f44334l = -1;
                } else {
                    if (i15 != 2) {
                        throw new IllegalArgumentException("right to " + A(i15) + " undefined");
                    }
                    bVar.f44334l = i14;
                    bVar.f44332k = -1;
                }
                bVar.f44293H = i16;
                return;
            case 3:
                if (i15 == 3) {
                    bVar.f44336m = i14;
                    bVar.f44338n = -1;
                    bVar.f44344q = -1;
                    bVar.f44345r = -1;
                    bVar.f44346s = -1;
                } else {
                    if (i15 != 4) {
                        throw new IllegalArgumentException("right to " + A(i15) + " undefined");
                    }
                    bVar.f44338n = i14;
                    bVar.f44336m = -1;
                    bVar.f44344q = -1;
                    bVar.f44345r = -1;
                    bVar.f44346s = -1;
                }
                bVar.f44294I = i16;
                return;
            case 4:
                if (i15 == 4) {
                    bVar.f44342p = i14;
                    bVar.f44340o = -1;
                    bVar.f44344q = -1;
                    bVar.f44345r = -1;
                    bVar.f44346s = -1;
                } else {
                    if (i15 != 3) {
                        throw new IllegalArgumentException("right to " + A(i15) + " undefined");
                    }
                    bVar.f44340o = i14;
                    bVar.f44342p = -1;
                    bVar.f44344q = -1;
                    bVar.f44345r = -1;
                    bVar.f44346s = -1;
                }
                bVar.f44295J = i16;
                return;
            case 5:
                if (i15 == 5) {
                    bVar.f44344q = i14;
                    bVar.f44342p = -1;
                    bVar.f44340o = -1;
                    bVar.f44336m = -1;
                    bVar.f44338n = -1;
                    return;
                }
                if (i15 == 3) {
                    bVar.f44345r = i14;
                    bVar.f44342p = -1;
                    bVar.f44340o = -1;
                    bVar.f44336m = -1;
                    bVar.f44338n = -1;
                    return;
                }
                if (i15 != 4) {
                    throw new IllegalArgumentException("right to " + A(i15) + " undefined");
                }
                bVar.f44346s = i14;
                bVar.f44342p = -1;
                bVar.f44340o = -1;
                bVar.f44336m = -1;
                bVar.f44338n = -1;
                return;
            case 6:
                if (i15 == 6) {
                    bVar.f44348u = i14;
                    bVar.f44347t = -1;
                } else {
                    if (i15 != 7) {
                        throw new IllegalArgumentException("right to " + A(i15) + " undefined");
                    }
                    bVar.f44347t = i14;
                    bVar.f44348u = -1;
                }
                bVar.f44297L = i16;
                return;
            case 7:
                if (i15 == 7) {
                    bVar.f44350w = i14;
                    bVar.f44349v = -1;
                } else {
                    if (i15 != 6) {
                        throw new IllegalArgumentException("right to " + A(i15) + " undefined");
                    }
                    bVar.f44349v = i14;
                    bVar.f44350w = -1;
                }
                bVar.f44296K = i16;
                return;
            default:
                throw new IllegalArgumentException(A(i13) + " to " + A(i15) + " unknown");
        }
    }

    public final void k(int i12, int i13) {
        p(i12).f44269e.f44318d = i13;
    }

    public final void l(int i12, int i13) {
        p(i12).f44269e.f44316c = i13;
    }

    public final void n(int i12, float[] fArr, int[] iArr) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            p(iArr[0]).f44269e.f44307V = fArr[0];
        }
        p(iArr[0]).f44269e.f44308W = i12;
        j(iArr[0], 1, 0, 1, -1);
        for (int i13 = 1; i13 < iArr.length; i13++) {
            int i14 = i13 - 1;
            j(iArr[i13], 1, iArr[i14], 2, -1);
            j(iArr[i14], 2, iArr[i13], 1, -1);
            if (fArr != null) {
                p(iArr[i13]).f44269e.f44307V = fArr[i13];
            }
        }
        j(iArr[iArr.length - 1], 2, 0, 2, -1);
    }

    public final a p(int i12) {
        HashMap<Integer, a> map = this.f44264f;
        if (!map.containsKey(Integer.valueOf(i12))) {
            map.put(Integer.valueOf(i12), new a());
        }
        return map.get(Integer.valueOf(i12));
    }

    public final a q(int i12) {
        HashMap<Integer, a> map = this.f44264f;
        if (map.containsKey(Integer.valueOf(i12))) {
            return map.get(Integer.valueOf(i12));
        }
        return null;
    }

    public final void r(int i12, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i12);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarO = o(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarO.f44269e.f44312a = true;
                    }
                    this.f44264f.put(Integer.valueOf(aVarO.f44265a), aVarO);
                }
            }
        } catch (IOException e12) {
            e12.printStackTrace();
        } catch (XmlPullParserException e13) {
            e13.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01cf, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(android.content.Context r10, android.content.res.XmlResourceParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.s(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public final void x(int i12, int i13, int i14) {
        a aVarP = p(i12);
        switch (i13) {
            case 1:
                aVarP.f44269e.f44299N = i14;
                return;
            case 2:
                aVarP.f44269e.f44301P = i14;
                return;
            case 3:
                aVarP.f44269e.f44300O = i14;
                return;
            case 4:
                aVarP.f44269e.f44302Q = i14;
                return;
            case 5:
                aVarP.f44269e.f44305T = i14;
                return;
            case 6:
                aVarP.f44269e.f44304S = i14;
                return;
            case 7:
                aVarP.f44269e.f44303R = i14;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void y(float f12, int i12) {
        p(i12).f44269e.f44351x = f12;
    }

    public final void z(int i12, int i13, int i14) {
        a aVarP = p(i12);
        switch (i13) {
            case 1:
                aVarP.f44269e.f44292G = i14;
                return;
            case 2:
                aVarP.f44269e.f44293H = i14;
                return;
            case 3:
                aVarP.f44269e.f44294I = i14;
                return;
            case 4:
                aVarP.f44269e.f44295J = i14;
                return;
            case 5:
                aVarP.f44269e.f44298M = i14;
                return;
            case 6:
                aVarP.f44269e.f44297L = i14;
                return;
            case 7:
                aVarP.f44269e.f44296K = i14;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }
}
