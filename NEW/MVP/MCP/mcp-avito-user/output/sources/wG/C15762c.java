package Wg;

import Y61.k;
import kotlin.Metadata;

/* compiled from: MaskUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWg/c;", "", "<init>", "()V", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wg.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15762c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C15762c f18007a = new C15762c();

    public static int a(C15761b c15761b, boolean z12) {
        int i12 = c15761b.f18004a;
        int i13 = c15761b.f18005b;
        int i14 = z12 ? i13 : i12;
        if (!z12) {
            i12 = i13;
        }
        byte[][] bArr = c15761b.f18006c;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            byte b12 = -1;
            int i17 = 0;
            for (int i18 = 0; i18 < i12; i18++) {
                byte b13 = z12 ? bArr[i16][i18] : bArr[i18][i16];
                if (b13 == b12) {
                    i17++;
                } else {
                    if (i17 >= 5) {
                        i15 += i17 - 2;
                    }
                    i17 = 1;
                    b12 = b13;
                }
            }
            if (i17 >= 5) {
                i15 = (i17 - 2) + i15;
            }
        }
        return i15;
    }
}
