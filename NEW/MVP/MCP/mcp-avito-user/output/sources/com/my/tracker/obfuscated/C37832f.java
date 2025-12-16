package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.internal.appset.zzr;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.my.tracker.obfuscated.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37832f {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<String> f365605a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<Integer> f365606b = new AtomicReference<>(-1);

    /* renamed from: c, reason: collision with root package name */
    boolean f365607c = false;

    /* renamed from: com.my.tracker.obfuscated.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f365608a;

        static {
            boolean z12 = false;
            try {
                if (AppSet.class.equals(AppSet.class) && NX0.a.class.equals(NX0.a.class)) {
                    if (NX0.b.class.equals(NX0.b.class)) {
                        z12 = true;
                    }
                }
            } catch (Throwable th2) {
                e2.a("AppSetIdProvider: error occurred while working with App Set library classes", th2);
            }
            f365608a = z12;
        }
    }

    public void b(Context context) {
        z0 z0VarA = z0.a(context);
        this.f365605a.set(z0VarA.d());
        if (!a.f365608a) {
            e2.a("AppSetIdProvider: app set library is not available");
            return;
        }
        try {
            new zzr(context).getAppSetIdInfo().h(C37835i.f365660c, new E(this, z0VarA));
        } catch (Throwable th2) {
            e2.a("AppSetIdProvider: error occurred while trying to access app set id info", th2);
        }
        a();
    }

    public void a() {
        try {
            String str = this.f365605a.get();
            if (!TextUtils.isEmpty(str)) {
                e2.a("AppSetIdProvider: app set id has been collected, value: " + str);
            } else {
                synchronized (this.f365605a) {
                    this.f365605a.wait(300L);
                }
                e2.a("AppSetIdProvider: timeout for collecting id has exceeded");
            }
        } catch (Throwable th2) {
            e2.a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th2);
        }
    }

    public void a(Context context) {
        if (this.f365607c) {
            return;
        }
        b(context);
        this.f365607c = true;
    }

    public void a(a1 a1Var, Context context) {
        StringBuilder sb2;
        String str;
        if (TextUtils.isEmpty(this.f365605a.get()) || this.f365606b.get().intValue() == -1) {
            sb2 = new StringBuilder("AppSetIdProvider: App Set ID ");
            sb2.append(this.f365605a.get());
            sb2.append(" and Scope ");
            sb2.append(this.f365606b.get());
            str = " were not sent due to its values";
        } else {
            a1Var.a(this.f365605a.get(), this.f365606b.get().intValue());
            sb2 = new StringBuilder("AppSetIdProvider: App Set ID ");
            sb2.append(this.f365605a.get());
            sb2.append(" and Scope ");
            sb2.append(this.f365606b.get());
            str = " set to proto builder successfully";
        }
        sb2.append(str);
        e2.a(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(z0 z0Var, NX0.b bVar) {
        int i12 = bVar.f11538b;
        if (i12 != this.f365606b.getAndSet(Integer.valueOf(i12)).intValue()) {
            z0Var.a(i12);
        }
        String str = bVar.f11537a;
        if (!str.equals(this.f365605a.getAndSet(str))) {
            z0Var.f(str);
            e2.a("AppSetIdProvider: new id value has been received: ".concat(str));
        }
        synchronized (this.f365605a) {
            this.f365605a.notify();
        }
    }

    public void c(Context context) {
    }
}
