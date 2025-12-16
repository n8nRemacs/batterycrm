package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ld8 extends dtf implements sm6 {
    public final /* synthetic */ md8 X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ g2h Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld8(md8 md8Var, List list, g2h g2hVar, Continuation continuation) {
        super(2, continuation);
        this.X = md8Var;
        this.Y = list;
        this.Z = g2hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IllegalArgumentException {
        ld8 ld8Var = (ld8) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ld8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ld8 ld8Var = new ld8(this.X, this.Y, this.Z, continuation);
        ld8Var.o = obj;
        return ld8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IllegalArgumentException {
        Bitmap scaledFrameAtTime;
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        List<Bitmap> list = this.Y;
        yy7[] yy7VarArr = md8.i;
        for (Bitmap bitmap : list) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        ((MediaMetadataRetriever) this.X.f.getValue()).setDataSource(this.Z.a().getPath());
        try {
            String strExtractMetadata = ((MediaMetadataRetriever) this.X.f.getValue()).extractMetadata(9);
            this.X.h = strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : this.Z.getDuration();
        } catch (Exception e) {
            wqi.e(this.X.b, "Can't extract duration", e);
            this.X.h = this.Z.getDuration();
        }
        ArrayList arrayList = new ArrayList();
        int i = this.X.g;
        for (int i2 = 0; i2 < i && d7j.f(f84Var); i2++) {
            long j = this.X.h;
            md8 md8Var = this.X;
            long j2 = (j / md8Var.g) * i2 * 1000;
            if (Build.VERSION.SDK_INT >= 27) {
                MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) md8Var.f.getValue();
                rj6 rj6Var = md8Var.a;
                scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j2, 2, rj6Var.b, rj6Var.c);
            } else {
                Bitmap frameAtTime = ((MediaMetadataRetriever) md8Var.f.getValue()).getFrameAtTime(j2);
                if (frameAtTime == null) {
                    scaledFrameAtTime = null;
                } else {
                    rj6 rj6Var2 = md8Var.a;
                    Bitmap bitmapN = tfi.n(rj6Var2.b, rj6Var2.c, frameAtTime);
                    frameAtTime.recycle();
                    scaledFrameAtTime = bitmapN;
                }
            }
            if (scaledFrameAtTime != null && d7j.f(f84Var)) {
                arrayList.add(scaledFrameAtTime);
                this.X.d.m(null, arrayList);
            }
        }
        return qqgVar;
    }
}
