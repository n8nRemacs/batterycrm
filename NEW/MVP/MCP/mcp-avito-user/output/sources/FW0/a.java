package FW0;

import I41.h;
import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.d;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: ImageLoadingTimeControllerListener.java */
@Nullsafe
/* loaded from: classes.dex */
public class a extends d {

    /* renamed from: c, reason: collision with root package name */
    public long f4723c;

    /* renamed from: d, reason: collision with root package name */
    @h
    public EW0.a f4724d;

    @Override // com.facebook.drawee.controller.d, com.facebook.drawee.controller.e
    public final void a(String str) {
        this.f4723c = System.currentTimeMillis();
    }

    @Override // com.facebook.drawee.controller.d, com.facebook.drawee.controller.e
    public final void f(String str, @h Object obj, @h Animatable animatable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        EW0.a aVar = this.f4724d;
        if (aVar != null) {
            aVar.f4057t = jCurrentTimeMillis - this.f4723c;
            aVar.invalidateSelf();
        }
    }
}
