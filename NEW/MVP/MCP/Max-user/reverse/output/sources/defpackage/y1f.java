package defpackage;

import android.media.MediaPlayer;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y1f extends dtf implements sm6 {
    public final /* synthetic */ float X;
    public final /* synthetic */ z1f o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1f(z1f z1fVar, float f, Continuation continuation) {
        super(2, continuation);
        this.o = z1fVar;
        this.X = f;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        y1f y1fVar = (y1f) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        y1fVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new y1f(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        MediaPlayer mediaPlayer = this.o.d;
        if (mediaPlayer != null) {
            float f = this.X;
            mediaPlayer.setVolume(f, f);
        }
        return qqg.a;
    }
}
