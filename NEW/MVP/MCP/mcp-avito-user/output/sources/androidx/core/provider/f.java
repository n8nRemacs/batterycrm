package androidx.core.provider;

import android.content.pm.ProviderInfo;
import androidx.collection.C20212g0;
import androidx.core.provider.g;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        C20212g0<g.d, ProviderInfo> c20212g0 = g.f44814a;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i12 = 0; i12 < bArr.length; i12++) {
            byte b12 = bArr[i12];
            byte b13 = bArr2[i12];
            if (b12 != b13) {
                return b12 - b13;
            }
        }
        return 0;
    }
}
