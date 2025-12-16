package Pg;

import Y61.k;
import Y61.l;
import com.avito.android.barcode_encoder.common.CharacterSetECI;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: ECIEncoderSet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LPg/b;", "", "a", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final ArrayList f13226c;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharsetEncoder[] f13227a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13228b;

    /* compiled from: ECIEncoderSet.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LPg/b$a;", "", "<init>", "()V", "", "Ljava/nio/charset/CharsetEncoder;", "ENCODERS", "Ljava/util/List;", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f13226c = new ArrayList();
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i12 = 0; i12 < 20; i12++) {
            String str = strArr[i12];
            CharacterSetECI.f98793d.getClass();
            if (((CharacterSetECI) CharacterSetECI.f98795f.get(str)) != null) {
                try {
                    f13226c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k String str, @l Charset charset) {
        int i12;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        boolean z13 = charset != null && C43066x.h0(charset.name(), "UTF", false);
        int length = str.length();
        int i13 = 0;
        while (true) {
            i12 = -1;
            if (i13 >= length) {
                break;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CharsetEncoder charsetEncoder = (CharsetEncoder) it.next();
                char cCharAt = str.charAt(i13);
                if (cCharAt == 65535 || charsetEncoder.canEncode(cCharAt)) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
            if (!z12) {
                Iterator it2 = f13226c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    CharsetEncoder charsetEncoder2 = (CharsetEncoder) it2.next();
                    if (charsetEncoder2.canEncode(str.charAt(i13))) {
                        arrayList.add(charsetEncoder2);
                        z12 = true;
                        break;
                    }
                }
            }
            if (!z12) {
                z13 = true;
            }
            i13++;
        }
        if (arrayList.size() != 1 || z13) {
            this.f13227a = new CharsetEncoder[arrayList.size() + 2];
            Iterator it3 = arrayList.iterator();
            int i14 = 0;
            while (it3.hasNext()) {
                this.f13227a[i14] = (CharsetEncoder) it3.next();
                i14++;
            }
            this.f13227a[i14] = StandardCharsets.UTF_8.newEncoder();
            this.f13227a[i14 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.f13227a = new CharsetEncoder[]{arrayList.get(0)};
        }
        if (charset != null) {
            int length2 = this.f13227a.length;
            int i15 = 0;
            while (true) {
                if (i15 < length2) {
                    if (this.f13227a[i15] != null && charset.name().equals(this.f13227a[i15].charset().name())) {
                        i12 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
        }
        this.f13228b = i12;
        this.f13227a[0].charset().equals(StandardCharsets.ISO_8859_1);
    }
}
