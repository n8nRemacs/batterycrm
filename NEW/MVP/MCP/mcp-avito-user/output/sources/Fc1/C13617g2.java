package Fc1;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: Fc1.g2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13617g2 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E3 f5528l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13617g2(E3 e32) {
        super(0);
        this.f5528l = e32;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        E3 e32 = this.f5528l;
        Bitmap bitmapA = e32.f4906i.a();
        xyz.n.a.v7 v7Var = xyz.n.a.v7.f442809c;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        float fMax = Math.max(bitmapA.getWidth(), bitmapA.getHeight()) / 1024.0f;
        (fMax > 1.0f ? Bitmap.createScaledBitmap(bitmapA, (int) (bitmapA.getWidth() / fMax), (int) (bitmapA.getHeight() / fMax), true) : bitmapA).compress(Bitmap.CompressFormat.WEBP, 100, byteArrayOutputStream);
        kotlin.G0 g02 = kotlin.G0.f406611a;
        e32.f4907j.invoke(new C13602e5(v7Var, bitmapA, byteArrayOutputStream.toByteArray()));
        return kotlin.G0.f406611a;
    }
}
