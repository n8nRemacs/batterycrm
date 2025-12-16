package Ba1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.camera.core.C20056e0;
import androidx.camera.core.InterfaceC20120j0;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class m extends C20056e0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f1506a;

    public m(o oVar) {
        this.f1506a = oVar;
    }

    @Override // androidx.camera.core.C20056e0.j
    public final void a(InterfaceC20120j0 interfaceC20120j0) throws Exception {
        Bitmap bitmapCreateBitmap;
        o oVar = this.f1506a;
        G g12 = oVar.f1521i;
        oVar.f1520h.getClass();
        ByteBuffer byteBufferV = interfaceC20120j0.e4()[0].v();
        int iRemaining = byteBufferV.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBufferV.get(bArr);
        int iD2 = interfaceC20120j0.r1().d();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
        if (bitmapDecodeByteArray == null) {
            bitmapCreateBitmap = null;
        } else {
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f, 1.0f, bitmapDecodeByteArray.getWidth() / 2.0f, bitmapDecodeByteArray.getHeight() / 2.0f);
            matrix.postRotate(iD2);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
        }
        g12.postValue(bitmapCreateBitmap);
        interfaceC20120j0.close();
    }
}
