package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<? super androidx.compose.ui.text.input.P, ? extends androidx.compose.ui.text.input.P> f41149a = a.f41150l;

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/text/input/P;", "it", "invoke", "(Landroidx/compose/ui/text/input/P;)Landroidx/compose/ui/text/input/P;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.text.input.P, androidx.compose.ui.text.input.P> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f41150l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final androidx.compose.ui.text.input.P invoke(androidx.compose.ui.text.input.P p12) {
            return p12;
        }
    }

    public static final float a(int i12, float[] fArr, float[] fArr2, int i13) {
        int i14 = i12 * 4;
        return (fArr[i14 + 3] * fArr2[12 + i13]) + (fArr[i14 + 2] * fArr2[8 + i13]) + (fArr[i14 + 1] * fArr2[4 + i13]) + (fArr[i14] * fArr2[i13]);
    }

    public static final void b(float[] fArr, float[] fArr2) {
        float fA2 = a(0, fArr2, fArr, 0);
        float fA3 = a(0, fArr2, fArr, 1);
        float fA4 = a(0, fArr2, fArr, 2);
        float fA5 = a(0, fArr2, fArr, 3);
        float fA6 = a(1, fArr2, fArr, 0);
        float fA7 = a(1, fArr2, fArr, 1);
        float fA8 = a(1, fArr2, fArr, 2);
        float fA9 = a(1, fArr2, fArr, 3);
        float fA10 = a(2, fArr2, fArr, 0);
        float fA11 = a(2, fArr2, fArr, 1);
        float fA12 = a(2, fArr2, fArr, 2);
        float fA13 = a(2, fArr2, fArr, 3);
        float fA14 = a(3, fArr2, fArr, 0);
        float fA15 = a(3, fArr2, fArr, 1);
        float fA16 = a(3, fArr2, fArr, 2);
        float fA17 = a(3, fArr2, fArr, 3);
        fArr[0] = fA2;
        fArr[1] = fA3;
        fArr[2] = fA4;
        fArr[3] = fA5;
        fArr[4] = fA6;
        fArr[5] = fA7;
        fArr[6] = fA8;
        fArr[7] = fA9;
        fArr[8] = fA10;
        fArr[9] = fA11;
        fArr[10] = fA12;
        fArr[11] = fA13;
        fArr[12] = fA14;
        fArr[13] = fA15;
        fArr[14] = fA16;
        fArr[15] = fA17;
    }
}
