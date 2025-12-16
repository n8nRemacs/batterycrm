package com.hcaptcha.sdk.tasks;

import android.os.Handler;
import android.os.Looper;
import com.hcaptcha.sdk.HCaptchaError;
import com.hcaptcha.sdk.HCaptchaException;
import com.hcaptcha.sdk.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class e<TResult> {

    /* renamed from: f, reason: collision with root package name */
    public final Handler f363127f = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f363124c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f363125d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f363126e = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public o f363122a = null;

    /* renamed from: b, reason: collision with root package name */
    public HCaptchaException f363123b = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = e.this.f363125d.iterator();
            while (it.hasNext()) {
                ((com.hcaptcha.sdk.tasks.a) it.next()).B3(new HCaptchaException(HCaptchaError.TOKEN_TIMEOUT));
            }
        }
    }

    public final void a(long j12) {
        this.f363127f.postDelayed(new a(), TimeUnit.SECONDS.toMillis(j12));
    }

    public final void b() {
        boolean z12 = false;
        if (this.f363122a != null) {
            Iterator it = this.f363124c.iterator();
            while (it.hasNext()) {
                ((d) it.next()).onSuccess(this.f363122a);
                z12 = true;
            }
        }
        if (this.f363123b != null) {
            Iterator it2 = this.f363125d.iterator();
            while (it2.hasNext()) {
                ((com.hcaptcha.sdk.tasks.a) it2.next()).B3(this.f363123b);
                z12 = true;
            }
        }
        if (z12) {
            this.f363122a = null;
            this.f363123b = null;
        }
    }
}
