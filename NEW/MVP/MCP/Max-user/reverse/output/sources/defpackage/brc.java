package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class brc extends dtf implements sm6 {
    public final /* synthetic */ File X;
    public final /* synthetic */ iz5 Y;
    public final /* synthetic */ Context Z;
    public final /* synthetic */ File o;
    public final /* synthetic */ Bitmap s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brc(File file, File file2, iz5 iz5Var, Context context, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.o = file;
        this.X = file2;
        this.Y = iz5Var;
        this.Z = context;
        this.s0 = bitmap;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((brc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new brc(this.o, this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        g8j.b(obj);
        File file = this.o;
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = this.X;
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            this.s0.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            if (!file2.exists() || file2.length() == 0) {
                throw new IOException(wy1.h("Failed to create QR code file: ", file2.getAbsolutePath()));
            }
            return this.Y.f(this.Z, file2);
        } finally {
        }
    }
}
