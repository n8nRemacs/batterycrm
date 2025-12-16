package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j6h extends dtf implements sm6 {
    public final /* synthetic */ l6h X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6h(Object obj, Continuation continuation, l6h l6hVar, int i, int i2) {
        super(2, continuation);
        this.o = obj;
        this.X = l6hVar;
        this.Y = i;
        this.Z = i2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((j6h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new j6h(this.o, continuation, this.X, this.Y, this.Z);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        Uri uri = (Uri) this.o;
        l6h l6hVar = this.X;
        int i = this.Z;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource((Context) l6hVar.a.getValue(), uri);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            long j = strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : 0L;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                int i3 = this.Y;
                if (i2 >= i3) {
                    mediaMetadataRetriever.release();
                    return l6h.a(arrayList);
                }
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime((long) ((i2 / i3) * j * 1000), 2);
                if (frameAtTime != null) {
                    Bitmap bitmapB = l6h.b(frameAtTime, i);
                    if (bitmapB == null) {
                        return null;
                    }
                    arrayList.add(bitmapB);
                    if (!frameAtTime.isRecycled()) {
                        frameAtTime.recycle();
                    }
                }
                i2++;
            }
        } catch (Throwable th) {
            wqi.e(l6h.class.getName(), "extractFramesFromUri failed for Uri: " + uri, th);
            return null;
        }
    }
}
