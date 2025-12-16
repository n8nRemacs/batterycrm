package androidx.core.provider;

import android.util.Base64;
import j.N;
import java.util.List;

/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f44820a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44821b;

    /* renamed from: c, reason: collision with root package name */
    public final String f44822c;

    /* renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f44823d;

    /* renamed from: e, reason: collision with root package name */
    public final String f44824e;

    public h(@N String str, @N String str2, @N String str3, @N List<List<byte[]>> list) {
        str.getClass();
        this.f44820a = str;
        str2.getClass();
        this.f44821b = str2;
        this.f44822c = str3;
        list.getClass();
        this.f44823d = list;
        this.f44824e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f44820a + ", mProviderPackage: " + this.f44821b + ", mQuery: " + this.f44822c + ", mCertificates:");
        int i12 = 0;
        while (true) {
            List<List<byte[]>> list = this.f44823d;
            if (i12 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List<byte[]> list2 = list.get(i12);
            for (int i13 = 0; i13 < list2.size(); i13++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list2.get(i13), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i12++;
        }
    }
}
