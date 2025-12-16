package com.avito.android.barcode_encoder.qr.encoder;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.barcode_encoder.exceptions.WriterException;
import com.avito.android.barcode_encoder.qr.ErrorCorrectionLevel;
import com.avito.android.barcode_encoder.qr.Mode;
import com.avito.android.barcode_encoder.qr.b;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: MinimalEncoder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/encoder/MinimalEncoder;", "", "a", "b", "c", "VersionSize", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MinimalEncoder {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f98827e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f98828a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98829b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Pg.b f98830c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ErrorCorrectionLevel f98831d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MinimalEncoder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/encoder/MinimalEncoder$VersionSize;", "", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VersionSize {

        /* renamed from: c, reason: collision with root package name */
        public static final VersionSize f98832c;

        /* renamed from: d, reason: collision with root package name */
        public static final VersionSize f98833d;

        /* renamed from: e, reason: collision with root package name */
        public static final VersionSize f98834e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ VersionSize[] f98835f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f98836g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f98837b;

        static {
            VersionSize versionSize = new VersionSize("SMALL", 0, "version 1-9");
            f98832c = versionSize;
            VersionSize versionSize2 = new VersionSize("MEDIUM", 1, "version 10-26");
            f98833d = versionSize2;
            VersionSize versionSize3 = new VersionSize("LARGE", 2, "version 27-40");
            f98834e = versionSize3;
            VersionSize[] versionSizeArr = {versionSize, versionSize2, versionSize3};
            f98835f = versionSizeArr;
            f98836g = kotlin.enums.c.a(versionSizeArr);
        }

        public VersionSize(String str, int i12, String str2) {
            this.f98837b = str2;
        }

        public static VersionSize valueOf(String str) {
            return (VersionSize) Enum.valueOf(VersionSize.class, str);
        }

        public static VersionSize[] values() {
            return (VersionSize[]) f98835f.clone();
        }

        @Override // java.lang.Enum
        @k
        public final String toString() {
            return this.f98837b;
        }
    }

    /* compiled from: MinimalEncoder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/encoder/MinimalEncoder$a;", "", "<init>", "()V", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: MinimalEncoder.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.barcode_encoder.qr.encoder.MinimalEncoder$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2976a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f98838a;

            static {
                int[] iArr = new int[VersionSize.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    VersionSize versionSize = VersionSize.f98832c;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    VersionSize versionSize2 = VersionSize.f98832c;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f98838a = iArr;
                int[] iArr2 = new int[Mode.values().length];
                try {
                    iArr2[6] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    Mode mode = Mode.f98806d;
                    iArr2[2] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    Mode mode2 = Mode.f98806d;
                    iArr2[1] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    Mode mode3 = Mode.f98806d;
                    iArr2[4] = 4;
                } catch (NoSuchFieldError unused7) {
                }
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static com.avito.android.barcode_encoder.qr.b a(@l VersionSize versionSize) {
            int i12 = C2976a.f98838a[versionSize.ordinal()];
            if (i12 == 1) {
                com.avito.android.barcode_encoder.qr.b.f98818d.getClass();
                return b.a.a(9);
            }
            if (i12 == 2) {
                com.avito.android.barcode_encoder.qr.b.f98818d.getClass();
                return b.a.a(26);
            }
            if (i12 != 3) {
                com.avito.android.barcode_encoder.qr.b.f98818d.getClass();
                return b.a.a(40);
            }
            com.avito.android.barcode_encoder.qr.b.f98818d.getClass();
            return b.a.a(40);
        }

        public a() {
        }
    }

    /* compiled from: MinimalEncoder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/encoder/MinimalEncoder$b;", "", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Mode f98839a;

        /* renamed from: b, reason: collision with root package name */
        public final int f98840b;

        /* renamed from: c, reason: collision with root package name */
        public final int f98841c;

        /* renamed from: d, reason: collision with root package name */
        public final int f98842d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final b f98843e;

        /* renamed from: f, reason: collision with root package name */
        public final int f98844f;

        /* compiled from: MinimalEncoder.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    iArr[6] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Mode mode = Mode.f98806d;
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    Mode mode2 = Mode.f98806d;
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    Mode mode3 = Mode.f98806d;
                    iArr[4] = 4;
                } catch (NoSuchFieldError unused4) {
                }
            }
        }

        public b(@k MinimalEncoder minimalEncoder, Mode mode, int i12, int i13, @l int i14, @l b bVar, com.avito.android.barcode_encoder.qr.b bVar2) {
            this.f98839a = mode;
            this.f98840b = i12;
            Mode mode2 = Mode.f98808f;
            int i15 = (mode == mode2 || bVar == null) ? i13 : bVar.f98841c;
            this.f98841c = i15;
            this.f98842d = i14;
            this.f98843e = bVar;
            boolean z12 = false;
            int iA2 = bVar != null ? bVar.f98844f : 0;
            if ((mode == mode2 && bVar == null && i15 != 0) || (bVar != null && i15 != bVar.f98841c)) {
                z12 = true;
            }
            iA2 = (bVar == null || mode != bVar.f98839a || z12) ? iA2 + mode.a(bVar2) + 4 : iA2;
            int iOrdinal = mode.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    iA2 += i14 != 1 ? 11 : 6;
                } else if (iOrdinal == 4) {
                    Pg.b bVar3 = minimalEncoder.f98830c;
                    String strSubstring = minimalEncoder.f98828a.substring(i12, i14 + i12);
                    CharsetEncoder[] charsetEncoderArr = bVar3.f13227a;
                    int length = charsetEncoderArr.length;
                    iA2 += strSubstring.getBytes(charsetEncoderArr[i13].charset()).length * 8;
                    if (z12) {
                        iA2 += 12;
                    }
                } else if (iOrdinal == 6) {
                    iA2 += 13;
                }
            } else {
                iA2 += i14 != 1 ? i14 != 2 ? 10 : 7 : 4;
            }
            this.f98844f = iA2;
        }
    }

    /* compiled from: MinimalEncoder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/encoder/MinimalEncoder$c;", "", "a", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f98845a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.barcode_encoder.qr.b f98846b;

        /* compiled from: MinimalEncoder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/encoder/MinimalEncoder$c$a;", "", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public final class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Mode f98848a;

            /* renamed from: b, reason: collision with root package name */
            public final int f98849b;

            /* renamed from: c, reason: collision with root package name */
            public final int f98850c;

            /* renamed from: d, reason: collision with root package name */
            public final int f98851d;

            /* compiled from: MinimalEncoder.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.barcode_encoder.qr.encoder.MinimalEncoder$c$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C2977a {
                static {
                    int[] iArr = new int[Mode.values().length];
                    try {
                        iArr[6] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        Mode mode = Mode.f98806d;
                        iArr[2] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        Mode mode2 = Mode.f98806d;
                        iArr[1] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        Mode mode3 = Mode.f98806d;
                        iArr[4] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        Mode mode4 = Mode.f98806d;
                        iArr[5] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                }
            }

            public a(@k Mode mode, int i12, int i13, int i14) {
                this.f98848a = mode;
                this.f98849b = i12;
                this.f98850c = i13;
                this.f98851d = i14;
            }

            public final int a() {
                Mode mode = Mode.f98808f;
                Mode mode2 = this.f98848a;
                int i12 = this.f98851d;
                if (mode2 != mode) {
                    return i12;
                }
                MinimalEncoder minimalEncoder = MinimalEncoder.this;
                Pg.b bVar = minimalEncoder.f98830c;
                int i13 = this.f98849b;
                String strSubstring = minimalEncoder.f98828a.substring(i13, i12 + i13);
                CharsetEncoder[] charsetEncoderArr = bVar.f13227a;
                int length = charsetEncoderArr.length;
                return strSubstring.getBytes(charsetEncoderArr[this.f98850c].charset()).length;
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder();
                Mode mode = this.f98848a;
                sb2.append(mode);
                sb2.append('(');
                Mode mode2 = Mode.f98809g;
                c cVar = c.this;
                if (mode == mode2) {
                    CharsetEncoder[] charsetEncoderArr = MinimalEncoder.this.f98830c.f13227a;
                    int length = charsetEncoderArr.length;
                    sb2.append(charsetEncoderArr[this.f98850c].charset().displayName());
                } else {
                    String str = MinimalEncoder.this.f98828a;
                    int i12 = this.f98849b;
                    String strSubstring = str.substring(i12, this.f98851d + i12);
                    StringBuilder sb3 = new StringBuilder();
                    int length2 = strSubstring.length();
                    for (int i13 = 0; i13 < length2; i13++) {
                        if (strSubstring.charAt(i13) < ' ' || strSubstring.charAt(i13) > '~') {
                            sb3.append('.');
                        } else {
                            sb3.append(strSubstring.charAt(i13));
                        }
                    }
                    sb2.append(sb3.toString());
                }
                sb2.append(')');
                return sb2.toString();
            }
        }

        /* compiled from: MinimalEncoder.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class b {
            static {
                int[] iArr = new int[VersionSize.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    VersionSize versionSize = VersionSize.f98832c;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    VersionSize versionSize2 = VersionSize.f98832c;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public c(@k com.avito.android.barcode_encoder.qr.b bVar, @l b bVar2) {
            int i12;
            int i13;
            b bVar3 = bVar2;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (bVar3 == null) {
                    break;
                }
                int i16 = i14 + bVar3.f98842d;
                Mode mode = Mode.f98808f;
                Mode mode2 = bVar3.f98839a;
                int i17 = bVar3.f98841c;
                b bVar4 = bVar3.f98843e;
                boolean z12 = (mode2 == mode && bVar4 == null && i17 != 0) || !(bVar4 == null || i17 == bVar4.f98841c);
                i12 = z12 ? 1 : i15;
                if (bVar4 == null || bVar4.f98839a != mode2 || z12) {
                    this.f98845a.add(0, new a(mode2, bVar3.f98840b, i17, i16));
                    i13 = 0;
                } else {
                    i13 = i16;
                }
                if (z12) {
                    this.f98845a.add(0, new a(Mode.f98809g, bVar3.f98840b, bVar3.f98841c, 0));
                }
                i15 = i12;
                bVar3 = bVar4;
                i14 = i13;
            }
            if (MinimalEncoder.this.f98829b) {
                Mode mode3 = ((a) this.f98845a.get(0)).f98848a;
                Mode mode4 = Mode.f98809g;
                if (mode3 != mode4 && i15 != 0) {
                    this.f98845a.add(0, new a(mode4, 0, 0, 0));
                }
                this.f98845a.add(((a) this.f98845a.get(0)).f98848a == mode4 ? 1 : 0, new a(Mode.f98811i, 0, 0, 0));
            }
            MinimalEncoder.f98827e.getClass();
            int i18 = bVar.f98820a;
            int i19 = 26;
            int iOrdinal = (i18 <= 9 ? VersionSize.f98832c : i18 <= 26 ? VersionSize.f98833d : VersionSize.f98834e).ordinal();
            if (iOrdinal == 0) {
                i19 = 9;
            } else if (iOrdinal == 1) {
                i12 = 10;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = 27;
                i19 = 40;
            }
            int iA2 = a(bVar);
            int i22 = bVar.f98820a;
            while (i22 < i19) {
                com.avito.android.barcode_encoder.qr.encoder.a aVar = com.avito.android.barcode_encoder.qr.encoder.a.f98854a;
                com.avito.android.barcode_encoder.qr.b.f98818d.getClass();
                com.avito.android.barcode_encoder.qr.b bVarA = b.a.a(i22);
                ErrorCorrectionLevel errorCorrectionLevel = MinimalEncoder.this.f98831d;
                aVar.getClass();
                if (com.avito.android.barcode_encoder.qr.encoder.a.d(iA2, bVarA, errorCorrectionLevel)) {
                    break;
                } else {
                    i22++;
                }
            }
            while (i22 > i12) {
                com.avito.android.barcode_encoder.qr.encoder.a aVar2 = com.avito.android.barcode_encoder.qr.encoder.a.f98854a;
                com.avito.android.barcode_encoder.qr.b.f98818d.getClass();
                com.avito.android.barcode_encoder.qr.b bVarA2 = b.a.a(i22 - 1);
                ErrorCorrectionLevel errorCorrectionLevel2 = MinimalEncoder.this.f98831d;
                aVar2.getClass();
                if (!com.avito.android.barcode_encoder.qr.encoder.a.d(iA2, bVarA2, errorCorrectionLevel2)) {
                    break;
                } else {
                    i22--;
                }
            }
            com.avito.android.barcode_encoder.qr.b.f98818d.getClass();
            this.f98846b = b.a.a(i22);
        }

        public final int a(com.avito.android.barcode_encoder.qr.b bVar) {
            Iterator it = this.f98845a.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                a aVar = (a) it.next();
                Mode mode = aVar.f98848a;
                int iA2 = mode.a(bVar);
                int iX2 = iA2 + 4;
                int iOrdinal = mode.ordinal();
                int i13 = aVar.f98851d;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        iX2 = e.x(i13, 2, 11, iX2) + (i13 % 2 != 1 ? 0 : 6);
                    } else if (iOrdinal == 4) {
                        iX2 += aVar.a() * 8;
                    } else if (iOrdinal == 5) {
                        iX2 = iA2 + 12;
                    } else if (iOrdinal == 6) {
                        iX2 += i13 * 13;
                    }
                } else {
                    int iX3 = e.x(i13, 3, 10, iX2);
                    int i14 = i13 % 3;
                    iX2 = iX3 + (i14 != 1 ? i14 != 2 ? 0 : 7 : 4);
                }
                i12 += iX2;
            }
            return i12;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f98845a.iterator();
            a aVar = null;
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar != null) {
                    sb2.append(",");
                }
                sb2.append(aVar2.toString());
                aVar = aVar2;
            }
            return sb2.toString();
        }
    }

    /* compiled from: MinimalEncoder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98853a;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                Mode mode = Mode.f98806d;
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Mode mode2 = Mode.f98806d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Mode mode3 = Mode.f98806d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Mode mode4 = Mode.f98806d;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f98853a = iArr;
        }
    }

    public MinimalEncoder(@k String str, @l Charset charset, boolean z12, @k ErrorCorrectionLevel errorCorrectionLevel) {
        this.f98828a = str;
        this.f98829b = z12;
        this.f98830c = new Pg.b(str, charset);
        this.f98831d = errorCorrectionLevel;
    }

    public static void a(b[][][] bVarArr, int i12, b bVar) {
        b[] bVarArr2 = bVarArr[i12 + bVar.f98842d][bVar.f98841c];
        f98827e.getClass();
        Mode mode = bVar.f98839a;
        int iOrdinal = mode.ordinal();
        char c12 = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                c12 = 1;
            } else if (iOrdinal == 4) {
                c12 = 3;
            } else {
                if (iOrdinal != 6) {
                    throw new IllegalStateException("Illegal mode " + mode);
                }
                c12 = 0;
            }
        }
        b bVar2 = bVarArr2[c12];
        if (bVar2 == null || bVar2.f98844f > bVar.f98844f) {
            bVarArr2[c12] = bVar;
        }
    }

    public static boolean c(Mode mode, char c12) {
        int i12 = d.f98853a[mode.ordinal()];
        a aVar = f98827e;
        if (i12 == 1) {
            aVar.getClass();
            com.avito.android.barcode_encoder.qr.encoder.a aVar2 = com.avito.android.barcode_encoder.qr.encoder.a.f98854a;
            String strValueOf = String.valueOf(c12);
            aVar2.getClass();
            return com.avito.android.barcode_encoder.qr.encoder.a.c(strValueOf);
        }
        if (i12 == 2) {
            aVar.getClass();
            com.avito.android.barcode_encoder.qr.encoder.a.f98854a.getClass();
            int[] iArr = com.avito.android.barcode_encoder.qr.encoder.a.f98856c;
            if ((c12 < iArr.length ? iArr[c12] : -1) != -1) {
                return true;
            }
        } else if (i12 == 3) {
            aVar.getClass();
            if ('0' <= c12 && c12 < ':') {
                return true;
            }
        } else if (i12 == 4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.avito.android.barcode_encoder.qr.b r17, com.avito.android.barcode_encoder.qr.encoder.MinimalEncoder.b[][][] r18, int r19, com.avito.android.barcode_encoder.qr.encoder.MinimalEncoder.b r20) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.barcode_encoder.qr.encoder.MinimalEncoder.b(com.avito.android.barcode_encoder.qr.b, com.avito.android.barcode_encoder.qr.encoder.MinimalEncoder$b[][][], int, com.avito.android.barcode_encoder.qr.encoder.MinimalEncoder$b):void");
    }

    @k
    public final c d(@k com.avito.android.barcode_encoder.qr.b bVar) throws WriterException {
        Pg.b bVar2;
        int i12;
        String str = this.f98828a;
        int length = str.length();
        int i13 = length + 1;
        b[][][] bVarArr = new b[i13][][];
        int i14 = 0;
        while (true) {
            bVar2 = this.f98830c;
            if (i14 >= i13) {
                break;
            }
            int length2 = bVar2.f13227a.length;
            b[][] bVarArr2 = new b[length2][];
            for (int i15 = 0; i15 < length2; i15++) {
                bVarArr2[i15] = new b[4];
            }
            bVarArr[i14] = bVarArr2;
            i14++;
        }
        b(bVar, bVarArr, 0, null);
        int i16 = 1;
        if (1 <= length) {
            while (true) {
                int length3 = bVar2.f13227a.length;
                for (int i17 = 0; i17 < length3; i17++) {
                    for (int i18 = 0; i18 < 4; i18++) {
                        b bVar3 = bVarArr[i16][i17][i18];
                        if (bVar3 != null && i16 < length) {
                            b(bVar, bVarArr, i16, bVar3);
                        }
                    }
                }
                if (i16 == length) {
                    break;
                }
                i16++;
            }
        }
        int length4 = bVar2.f13227a.length;
        int i19 = -1;
        int i22 = Integer.MAX_VALUE;
        int i23 = -1;
        for (int i24 = 0; i24 < length4; i24++) {
            for (int i25 = 0; i25 < 4; i25++) {
                b bVar4 = bVarArr[length][i24][i25];
                if (bVar4 != null && (i12 = bVar4.f98844f) < i22) {
                    i19 = i24;
                    i23 = i25;
                    i22 = i12;
                }
            }
        }
        if (i19 >= 0) {
            return new c(bVar, bVarArr[length][i19][i23]);
        }
        throw new WriterException(C22491k0.a('\"', "Internal error: failed to encode \"", str));
    }
}
