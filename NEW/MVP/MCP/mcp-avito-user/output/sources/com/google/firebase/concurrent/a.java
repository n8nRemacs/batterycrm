package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import com.google.firebase.concurrent.i;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f360804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f360805c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f360806d;

    public /* synthetic */ a(int i12, Object obj, Object obj2) {
        this.f360804b = i12;
        this.f360805c = obj;
        this.f360806d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f360804b) {
            case 0:
                b bVar = (b) this.f360805c;
                Process.setThreadPriority(bVar.f360810d);
                StrictMode.ThreadPolicy threadPolicy = bVar.f360811e;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f360806d).run();
                break;
            default:
                Callable callable = (Callable) this.f360805c;
                i.a aVar = (i.a) this.f360806d;
                try {
                    aVar.a(callable.call());
                    break;
                } catch (Exception e12) {
                    aVar.b(e12);
                }
        }
    }
}
