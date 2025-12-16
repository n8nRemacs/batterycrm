package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.my.tracker.obfuscated.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37850y {

    /* renamed from: a, reason: collision with root package name */
    boolean f365870a = false;

    /* renamed from: b, reason: collision with root package name */
    String f365871b;

    /* renamed from: com.my.tracker.obfuscated.y$a */
    public class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z0 f365872a;

        public a(z0 z0Var) {
            this.f365872a = z0Var;
        }

        @Override // com.my.tracker.obfuscated.C37850y.c
        public void a() {
            e2.a("FirebaseAppInstanceIdProvider: retrieving firebase app instance id finished unsuccessfully");
        }

        @Override // com.my.tracker.obfuscated.C37850y.c
        public void a(String str) {
            C37850y.this.f365871b = str;
            this.f365872a.j(str);
            e2.a("FirebaseAppInstanceIdProvider: retrieved firebase app instance id %" + C37850y.this.f365871b);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.y$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f365874a;

        static {
            boolean zEquals;
            try {
                zEquals = FirebaseAnalytics.class.equals(FirebaseAnalytics.class);
            } catch (Throwable th2) {
                e2.a("FirebaseHelper: error occurred while working with FirebaseAnalytics", th2);
                zEquals = false;
            }
            f365874a = zEquals;
        }

        public static void a(Context context, c cVar) {
            try {
                e2.a("FirebaseHelper: retrieving firebase app instance id");
                FirebaseAnalytics.getInstance(context).a().d(C37835i.f365659b, new G(cVar));
            } catch (Throwable th2) {
                e2.a("FirebaseHelper: retrieving firebase app instance id error", th2);
                cVar.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, Task task) {
            if (task.q() && task.r()) {
                cVar.a((String) task.n());
            } else {
                cVar.a();
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.y$c */
    public interface c {
        void a();

        void a(String str);
    }

    public void a(Context context) {
        if (this.f365870a) {
            return;
        }
        z0 z0VarA = z0.a(context);
        String strH = z0VarA.h();
        this.f365871b = strH;
        if (!TextUtils.isEmpty(strH)) {
            e2.a("FirebaseAppInstanceIdProvider: retrieved cached firebase app instance id " + this.f365871b);
        }
        if (!b.f365874a) {
            e2.a("FirebaseAppInstanceIdProvider: firebase analytics is not available");
        } else {
            b.a(context, new a(z0VarA));
            this.f365870a = true;
        }
    }

    public void a(a1 a1Var, Context context) {
        if (TextUtils.isEmpty(this.f365871b)) {
            return;
        }
        a1Var.i(this.f365871b);
    }

    public void b(Context context) {
    }
}
