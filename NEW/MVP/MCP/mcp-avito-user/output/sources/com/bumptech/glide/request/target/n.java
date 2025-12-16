package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j.N;
import j.P;

/* compiled from: PreloadTarget.java */
/* loaded from: classes5.dex */
public final class n<Z> extends e<Z> {

    /* renamed from: e, reason: collision with root package name */
    public static final Handler f339613e = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: PreloadTarget.java */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((n) message.obj).getClass();
            throw null;
        }
    }

    @Override // com.bumptech.glide.request.target.q
    public final void c(@N Z z12, @P com.bumptech.glide.request.transition.f<? super Z> fVar) {
        f339613e.obtainMessage(1, this).sendToTarget();
    }

    @Override // com.bumptech.glide.request.target.q
    public final void b(@P Drawable drawable) {
    }
}
