package Fc1;

import Fc1.C13602e5;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class R0 extends kotlin.jvm.internal.N implements Y41.l<Uri, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H3 f5160l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C13615g0 f5161m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(C13615g0 c13615g0, H3 h32) {
        super(1);
        this.f5160l = h32;
        this.f5161m = c13615g0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Uri uri) {
        Bitmap bitmapDecodeStream;
        Uri uri2 = uri;
        if (uri2 != null) {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(this.f5160l.b().getContentResolver().openInputStream(uri2));
            } catch (FileNotFoundException unused) {
                bitmapDecodeStream = null;
            }
            if (bitmapDecodeStream != null) {
                C13602e5 c13602e5A = C13602e5.a.a(bitmapDecodeStream);
                int i12 = C13615g0.f5512s;
                C13615g0 c13615g0 = this.f5161m;
                c13615g0.d().add(c13602e5A);
                c13615g0.f5784b.a(c13615g0.d());
                InterfaceC13642j0 interfaceC13642j0 = c13615g0.f5792j;
                (interfaceC13642j0 != null ? interfaceC13642j0 : null).a(c13615g0);
            }
        }
        return kotlin.G0.f406611a;
    }
}
