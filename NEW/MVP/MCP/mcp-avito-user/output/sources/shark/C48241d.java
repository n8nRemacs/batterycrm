package shark;

import kotlin.Metadata;
import shark.M1;

/* compiled from: AndroidMetadataExtractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$c;", "instance", "", "invoke", "(Lshark/M1$c;)I", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48241d extends kotlin.jvm.internal.N implements Y41.l<M1.c, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public static final C48241d f438266l = new C48241d();

    public C48241d() {
        super(1);
    }

    @Override // Y41.l
    public final Integer invoke(M1.c cVar) {
        X1 x12;
        Integer numB;
        X1 x13;
        Integer numB2;
        M1.c cVar2 = cVar;
        K1 k1J = cVar2.j("android.util.DisplayMetrics", "widthPixels");
        int iIntValue = 0;
        int iIntValue2 = (k1J == null || (x13 = k1J.f438095c) == null || (numB2 = x13.b()) == null) ? 0 : numB2.intValue();
        K1 k1J2 = cVar2.j("android.util.DisplayMetrics", "heightPixels");
        if (k1J2 != null && (x12 = k1J2.f438095c) != null && (numB = x12.b()) != null) {
            iIntValue = numB.intValue();
        }
        return Integer.valueOf(iIntValue2 * iIntValue);
    }
}
