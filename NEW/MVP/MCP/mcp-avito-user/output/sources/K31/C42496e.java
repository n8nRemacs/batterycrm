package k31;

import com.adjust.sdk.Constants;
import de.ailis.pherialize.exceptions.UnserializeException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: Unserializer.java */
/* renamed from: k31.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42496e {

    /* renamed from: a, reason: collision with root package name */
    public int f406034a;

    /* renamed from: b, reason: collision with root package name */
    public final String f406035b;

    /* renamed from: c, reason: collision with root package name */
    public final Charset f406036c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f406037d;

    public C42496e(String str) {
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        try {
            str = new String(str.getBytes(charsetForName), "ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
        }
        this.f406035b = str;
        this.f406036c = charsetForName;
        this.f406034a = 0;
        this.f406037d = new ArrayList();
    }

    public final C42492a a() throws NumberFormatException {
        int i12 = this.f406034a + 2;
        String str = this.f406035b;
        int iIndexOf = str.indexOf(58, i12);
        int i13 = Integer.parseInt(str.substring(this.f406034a + 2, iIndexOf));
        this.f406034a = iIndexOf + 2;
        C42493b c42493b = new C42493b(i13);
        C42492a c42492a = new C42492a(c42493b);
        ArrayList arrayList = this.f406037d;
        arrayList.add(c42492a);
        for (int i14 = 0; i14 < i13; i14++) {
            C42492a c42492aB = b();
            arrayList.remove(arrayList.size() - 1);
            c42493b.put(c42492aB, b());
        }
        this.f406034a++;
        return c42492a;
    }

    public final C42492a b() throws NumberFormatException {
        C42492a c42492aA;
        C42492a c42492a;
        int i12 = this.f406034a;
        String str = this.f406035b;
        char cCharAt = str.charAt(i12);
        ArrayList arrayList = this.f406037d;
        if (cCharAt == 'N') {
            this.f406034a += 2;
            c42492aA = null;
        } else if (cCharAt != 'O') {
            if (cCharAt != 'R') {
                if (cCharAt == 'd') {
                    int iIndexOf = str.indexOf(59, this.f406034a + 2);
                    Double dValueOf = Double.valueOf(str.substring(this.f406034a + 2, iIndexOf));
                    this.f406034a = iIndexOf + 1;
                    c42492a = new C42492a(dValueOf);
                } else if (cCharAt == 'i') {
                    int iIndexOf2 = str.indexOf(59, this.f406034a + 2);
                    try {
                        Integer numValueOf = Integer.valueOf(str.substring(this.f406034a + 2, iIndexOf2));
                        this.f406034a = iIndexOf2 + 1;
                        c42492aA = new C42492a(numValueOf);
                    } catch (NumberFormatException unused) {
                        Long lValueOf = Long.valueOf(str.substring(this.f406034a + 2, iIndexOf2));
                        this.f406034a = iIndexOf2 + 1;
                        c42492a = new C42492a(lValueOf);
                    }
                } else if (cCharAt == 's') {
                    String strC = c();
                    try {
                        strC = new String(strC.getBytes("ISO-8859-1"), this.f406036c);
                    } catch (UnsupportedEncodingException unused2) {
                    }
                    c42492aA = new C42492a(strC);
                } else {
                    if (cCharAt == 'a') {
                        return a();
                    }
                    if (cCharAt != 'b') {
                        throw new UnserializeException(androidx.compose.ui.graphics.colorspace.e.l("Unable to unserialize unknown type ", cCharAt));
                    }
                    Boolean boolValueOf = Boolean.valueOf(str.charAt(this.f406034a + 2) == '1');
                    this.f406034a += 4;
                    c42492aA = new C42492a(boolValueOf);
                }
                c42492aA = c42492a;
            } else {
                int iIndexOf3 = str.indexOf(59, this.f406034a + 2);
                int i13 = Integer.parseInt(str.substring(this.f406034a + 2, iIndexOf3));
                this.f406034a = iIndexOf3 + 1;
                c42492aA = (C42492a) arrayList.get(i13 - 1);
            }
        } else {
            String strC2 = c();
            this.f406034a -= 2;
            if (!strC2.equals("stdClass")) {
                throw new RuntimeException(AK.c.k("stdClass objects only supported. `", strC2, "' received."));
            }
            c42492aA = a();
        }
        arrayList.add(c42492aA);
        return c42492aA;
    }

    public final String c() throws NumberFormatException {
        int i12 = this.f406034a + 2;
        String str = this.f406035b;
        int iIndexOf = str.indexOf(58, i12);
        int i13 = Integer.parseInt(str.substring(this.f406034a + 2, iIndexOf));
        this.f406034a = iIndexOf + i13 + 4;
        int i14 = iIndexOf + 2;
        return str.substring(i14, i13 + i14);
    }
}
