package net.bytebuddy.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

/* compiled from: StreamDrainer.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f418990a = new h();

    public final byte[] a(InputStream inputStream) throws IOException {
        int i12;
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[1024];
        int i13 = 0;
        do {
            i12 = inputStream.read(bArr, i13, 1024 - i13);
            int iMax = Math.max(i12, 0) + i13;
            if (iMax == 1024) {
                arrayList.add(bArr);
                bArr = new byte[1024];
                i13 = 0;
            } else {
                i13 = iMax;
            }
        } while (i12 != -1);
        byte[] bArr2 = new byte[(arrayList.size() * 1024) + i13];
        Iterator it = arrayList.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            System.arraycopy((byte[]) it.next(), 0, bArr2, i14 * 1024, 1024);
            i14++;
        }
        System.arraycopy(bArr, 0, bArr2, i14 * 1024, i13);
        return bArr2;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (getClass().hashCode() * 31) + 1024;
    }
}
