package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n7h extends dtf implements sm6 {
    public final /* synthetic */ Bitmap X;
    public final /* synthetic */ kue Y;
    public final /* synthetic */ File Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7h(Bitmap bitmap, kue kueVar, File file, Continuation continuation) {
        super(2, continuation);
        this.X = bitmap;
        this.Y = kueVar;
        this.Z = file;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((n7h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        n7h n7hVar = new n7h(this.X, this.Y, this.Z, continuation);
        n7hVar.o = obj;
        return n7hVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        Bitmap bitmap = this.X;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * 0.2f), (int) (bitmap.getHeight() * 0.2f), true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 25, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            bitmapCreateScaledBitmap.recycle();
            byteArrayOutputStream.close();
            String str = "data:" + uz9.d + ";base64," + Base64.encodeToString(byteArray, 2);
            svi.e(f84Var, ((q2b) ((lzf) this.Y.a.getValue())).b(), null, new m7h(this.Z, byteArray, null), 2);
            return tfi.h(Uri.parse(str).toString());
        } catch (Throwable th) {
            bitmap.recycle();
            bitmapCreateScaledBitmap.recycle();
            byteArrayOutputStream.close();
            throw th;
        }
    }
}
