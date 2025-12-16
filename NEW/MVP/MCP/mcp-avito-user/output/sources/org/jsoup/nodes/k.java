package org.jsoup.nodes;

import a71.C19692b;
import a71.C19693c;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.SerializationException;
import org.jsoup.nodes.Document;

/* compiled from: Node.java */
/* loaded from: classes7.dex */
public abstract class k implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public k f421096b;

    /* renamed from: c, reason: collision with root package name */
    public int f421097c;

    /* compiled from: Node.java */
    public static class a implements org.jsoup.select.f {

        /* renamed from: a, reason: collision with root package name */
        public StringBuilder f421098a;

        /* renamed from: b, reason: collision with root package name */
        public Document.OutputSettings f421099b;

        @Override // org.jsoup.select.f
        public final void a(k kVar, int i12) {
            if (kVar.v().equals("#text")) {
                return;
            }
            try {
                kVar.y(this.f421098a, i12, this.f421099b);
            } catch (IOException e12) {
                throw new SerializationException(e12);
            }
        }

        @Override // org.jsoup.select.f
        public final void b(k kVar, int i12) {
            try {
                kVar.x(this.f421098a, i12, this.f421099b);
            } catch (IOException e12) {
                throw new SerializationException(e12);
            }
        }
    }

    public static void t(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) {
        String strValueOf;
        Appendable appendableAppend = sb2.append('\n');
        int i13 = i12 * outputSettings.f421046g;
        String[] strArr = C19693c.f20746a;
        if (i13 < 0) {
            throw new IllegalArgumentException("width must be > 0");
        }
        if (i13 < 21) {
            strValueOf = C19693c.f20746a[i13];
        } else {
            char[] cArr = new char[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                cArr[i14] = ' ';
            }
            strValueOf = String.valueOf(cArr);
        }
        appendableAppend.append(strValueOf);
    }

    public k A() {
        return this.f421096b;
    }

    public final k B() {
        k kVar = this.f421096b;
        if (kVar != null && this.f421097c > 0) {
            return kVar.q().get(this.f421097c - 1);
        }
        return null;
    }

    public final void C(int i12) {
        List<k> listQ = q();
        while (i12 < listQ.size()) {
            listQ.get(i12).f421097c = i12;
            i12++;
        }
    }

    public final void D() {
        org.jsoup.helper.d.d(this.f421096b);
        this.f421096b.F(this);
    }

    public void E() {
        b bVarI = i();
        int iV2 = bVarI.v("label");
        if (iV2 != -1) {
            bVarI.D(iV2);
        }
    }

    public void F(k kVar) {
        org.jsoup.helper.d.a(kVar.f421096b == this);
        int i12 = kVar.f421097c;
        q().remove(i12);
        C(i12);
        kVar.f421096b = null;
    }

    public final void G(g gVar) {
        org.jsoup.helper.d.d(this.f421096b);
        k kVar = this.f421096b;
        kVar.getClass();
        org.jsoup.helper.d.a(this.f421096b == kVar);
        k kVar2 = gVar.f421096b;
        if (kVar2 != null) {
            kVar2.F(gVar);
        }
        int i12 = this.f421097c;
        kVar.q().set(i12, gVar);
        gVar.f421096b = kVar;
        gVar.f421097c = i12;
        this.f421096b = null;
    }

    public k H() {
        k kVar = this;
        while (true) {
            k kVar2 = kVar.f421096b;
            if (kVar2 == null) {
                return kVar;
            }
            kVar = kVar2;
        }
    }

    public void I(org.jsoup.select.f fVar) {
        org.jsoup.select.e.a(this, fVar);
    }

    public String a(String str) {
        org.jsoup.helper.d.b(str);
        String externalForm = "";
        if (!r(str)) {
            return "";
        }
        String strJ = j();
        String strC = c(str);
        String[] strArr = C19693c.f20746a;
        try {
            try {
                externalForm = C19693c.i(new URL(strJ), strC).toExternalForm();
            } catch (MalformedURLException unused) {
                externalForm = new URL(strC).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
        }
        return externalForm;
    }

    public final void b(int i12, k... kVarArr) {
        org.jsoup.helper.d.d(kVarArr);
        if (kVarArr.length == 0) {
            return;
        }
        List<k> listQ = q();
        k kVarA = kVarArr[0].A();
        if (kVarA == null || kVarA.l() != kVarArr.length) {
            for (k kVar : kVarArr) {
                if (kVar == null) {
                    throw new IllegalArgumentException("Array must not contain any null objects");
                }
            }
            for (k kVar2 : kVarArr) {
                kVar2.getClass();
                k kVar3 = kVar2.f421096b;
                if (kVar3 != null) {
                    kVar3.F(kVar2);
                }
                kVar2.f421096b = this;
            }
            listQ.addAll(i12, Arrays.asList(kVarArr));
            C(i12);
            return;
        }
        List<k> listM = kVarA.m();
        int length = kVarArr.length;
        while (true) {
            int i13 = length - 1;
            if (length <= 0 || kVarArr[i13] != listM.get(i13)) {
                break;
            } else {
                length = i13;
            }
        }
        kVarA.p();
        listQ.addAll(i12, Arrays.asList(kVarArr));
        int length2 = kVarArr.length;
        while (true) {
            int i14 = length2 - 1;
            if (length2 <= 0) {
                C(i12);
                return;
            } else {
                kVarArr[i14].f421096b = this;
                length2 = i14;
            }
        }
    }

    public String c(String str) {
        org.jsoup.helper.d.d(str);
        if (!s()) {
            return "";
        }
        String strR = i().r(str);
        return strR.length() > 0 ? strR : str.startsWith("abs:") ? a(str.substring(4)) : "";
    }

    public void e(String str, String str2) {
        org.jsoup.parser.f fVar = l.a(this).f421227c;
        fVar.getClass();
        String strTrim = str.trim();
        if (!fVar.f421224b) {
            strTrim = C19692b.a(strTrim);
        }
        b bVarI = i();
        int iV2 = bVarI.v(strTrim);
        if (iV2 == -1) {
            bVarI.a(strTrim, str2);
            return;
        }
        bVarI.f421076d[iV2] = str2;
        if (bVarI.f421075c[iV2].equals(strTrim)) {
            return;
        }
        bVarI.f421075c[iV2] = strTrim;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract b i();

    public abstract String j();

    public final k k(int i12) {
        return q().get(i12);
    }

    public abstract int l();

    public final List<k> m() {
        return Collections.unmodifiableList(q());
    }

    @Override // 
    public k n() {
        k kVarO = o(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(kVarO);
        while (!linkedList.isEmpty()) {
            k kVar = (k) linkedList.remove();
            int iL2 = kVar.l();
            for (int i12 = 0; i12 < iL2; i12++) {
                List<k> listQ = kVar.q();
                k kVarO2 = listQ.get(i12).o(kVar);
                listQ.set(i12, kVarO2);
                linkedList.add(kVarO2);
            }
        }
        return kVarO;
    }

    public k o(k kVar) {
        try {
            k kVar2 = (k) super.clone();
            kVar2.f421096b = kVar;
            kVar2.f421097c = kVar == null ? 0 : this.f421097c;
            return kVar2;
        } catch (CloneNotSupportedException e12) {
            throw new RuntimeException(e12);
        }
    }

    public abstract k p();

    public abstract List<k> q();

    public boolean r(String str) {
        org.jsoup.helper.d.d(str);
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (i().v(strSubstring) != -1 && !a(strSubstring).equals("")) {
                return true;
            }
        }
        return i().v(str) != -1;
    }

    public abstract boolean s();

    public String toString() {
        return w();
    }

    public final k u() {
        k kVar = this.f421096b;
        if (kVar == null) {
            return null;
        }
        List<k> listQ = kVar.q();
        int i12 = this.f421097c + 1;
        if (listQ.size() > i12) {
            return listQ.get(i12);
        }
        return null;
    }

    public abstract String v();

    public String w() {
        StringBuilder sbB = C19693c.b();
        Document documentZ = z();
        if (documentZ == null) {
            documentZ = new Document("");
        }
        Document.OutputSettings outputSettings = documentZ.f421038j;
        a aVar = new a();
        aVar.f421098a = sbB;
        aVar.f421099b = outputSettings;
        outputSettings.e();
        org.jsoup.select.e.a(this, aVar);
        return C19693c.h(sbB);
    }

    public abstract void x(StringBuilder sb2, int i12, Document.OutputSettings outputSettings);

    public abstract void y(StringBuilder sb2, int i12, Document.OutputSettings outputSettings);

    public final Document z() {
        k kVarH = H();
        if (kVarH instanceof Document) {
            return (Document) kVarH;
        }
        return null;
    }
}
