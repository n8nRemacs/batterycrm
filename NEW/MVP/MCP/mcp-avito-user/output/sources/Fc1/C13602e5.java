package Fc1;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* renamed from: Fc1.e5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13602e5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final xyz.n.a.v7 f5487a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Bitmap f5488b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final byte[] f5489c;

    @kotlin.jvm.internal.s0
    /* renamed from: Fc1.e5$a */
    public static final class a {
        @Y61.k
        public static C13602e5 a(@Y61.k Bitmap bitmap) {
            xyz.n.a.v7 v7Var = xyz.n.a.v7.f442808b;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            float fMax = Math.max(bitmap.getWidth(), bitmap.getHeight()) / 1024.0f;
            (fMax > 1.0f ? Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / fMax), (int) (bitmap.getHeight() / fMax), true) : bitmap).compress(Bitmap.CompressFormat.WEBP, 100, byteArrayOutputStream);
            kotlin.G0 g02 = kotlin.G0.f406611a;
            return new C13602e5(v7Var, bitmap, byteArrayOutputStream.toByteArray());
        }
    }

    public C13602e5(@Y61.k xyz.n.a.v7 v7Var, @Y61.k Bitmap bitmap, @Y61.k byte[] bArr) {
        this.f5487a = v7Var;
        this.f5488b = bitmap;
        this.f5489c = bArr;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13602e5)) {
            return false;
        }
        C13602e5 c13602e5 = (C13602e5) obj;
        return this.f5487a == c13602e5.f5487a && kotlin.jvm.internal.L.f(this.f5488b, c13602e5.f5488b) && kotlin.jvm.internal.L.f(this.f5489c, c13602e5.f5489c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5489c) + ((this.f5488b.hashCode() + (this.f5487a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ImageData(from=" + this.f5487a + ", preview=" + this.f5488b + ", image=" + Arrays.toString(this.f5489c) + ')';
    }
}
