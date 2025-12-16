package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public final class rld extends Handler {
    public final int a;
    public final /* synthetic */ sld b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rld(sld sldVar, Looper looper) {
        super(looper);
        this.b = sldVar;
        this.a = 1;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == this.a) {
            this.b.b();
        }
    }
}
