package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class I0 implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J0 f349342b;

    public /* synthetic */ I0(J0 j02, H0 h02) {
        this.f349342b = j02;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i12 = message.what;
        if (i12 == 0) {
            synchronized (this.f349342b.f349343d) {
                try {
                    F0 f02 = (F0) message.obj;
                    G0 g02 = (G0) this.f349342b.f349343d.get(f02);
                    if (g02 != null && g02.f349319b.isEmpty()) {
                        if (g02.f349321d) {
                            g02.f349325h.f349345f.removeMessages(1, g02.f349323f);
                            J0 j02 = g02.f349325h;
                            j02.f349346g.c(j02.f349344e, g02);
                            g02.f349321d = false;
                            g02.f349320c = 2;
                        }
                        this.f349342b.f349343d.remove(f02);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i12 != 1) {
            return false;
        }
        synchronized (this.f349342b.f349343d) {
            try {
                F0 f03 = (F0) message.obj;
                G0 g03 = (G0) this.f349342b.f349343d.get(f03);
                if (g03 != null && g03.f349320c == 3) {
                    String.valueOf(f03);
                    new Exception();
                    ComponentName componentName = g03.f349324g;
                    if (componentName == null) {
                        f03.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = f03.f349317b;
                        C36729v.j(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    g03.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
