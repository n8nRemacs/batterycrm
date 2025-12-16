package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import m31.C43873a;

/* renamed from: y2.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class HandlerC50042c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final C43873a f442863a;

    public HandlerC50042c(C43873a c43873a) {
        super(Looper.getMainLooper());
        this.f442863a = c43873a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String string = message.getData().getString("mask_name");
        Ub1.b bVar = (Ub1.b) this.f442863a.f414286a.get();
        if (bVar != null) {
            bVar.f(string);
        }
    }
}
