package e11;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.my.target.common.MyTargetActivity;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class J1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public static final WeakHashMap<AbstractC39895p, Boolean> f394379a = new WeakHashMap<>();

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final AbstractC39895p f394380a;

        public b(@j.N AbstractC39895p abstractC39895p) {
            this.f394380a = abstractC39895p;
        }
    }

    public static class c extends b {
        public c(AbstractC39895p abstractC39895p, a aVar) {
            super(abstractC39895p);
        }
    }

    public static class d extends e {
        public d(String str, AbstractC39895p abstractC39895p, a aVar) {
            super(str, abstractC39895p, null);
        }

        @Override // e11.J1.e
        public final boolean a(@j.N Context context) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f394381b));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return super.a(context);
            }
        }
    }

    public static class e extends b {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final String f394381b;

        public e(String str, AbstractC39895p abstractC39895p, a aVar) {
            super(abstractC39895p);
            this.f394381b = str;
        }

        public static boolean b(@j.N Context context, @j.N String str) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
        
            if ((android.text.TextUtils.isEmpty(r5) ? false : r5.startsWith(com.adjust.sdk.Constants.SCHEME)) == false) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(@j.N android.content.Context r10) {
            /*
                r9 = this;
                java.lang.String r0 = r10.getPackageName()
                java.lang.String r1 = "ru.mail.browser"
                boolean r0 = r0.equals(r1)
                java.lang.String r2 = "android.intent.action.VIEW"
                r3 = 1
                r4 = 268435456(0x10000000, float:2.524355E-29)
                java.lang.String r5 = r9.f394381b
                if (r0 != 0) goto L14
                goto L36
            L14:
                android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L2d
                android.net.Uri r6 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L2d
                r0.<init>(r2, r6)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r6 = "com.android.browser.application_id"
                r0.putExtra(r6, r1)     // Catch: java.lang.Throwable -> L2d
                r0.setPackage(r1)     // Catch: java.lang.Throwable -> L2d
                boolean r1 = r10 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L2d
                if (r1 != 0) goto L2f
                r0.addFlags(r4)     // Catch: java.lang.Throwable -> L2d
                goto L2f
            L2d:
                r0 = move-exception
                goto L33
            L2f:
                r10.startActivity(r0)     // Catch: java.lang.Throwable -> L2d
                return r3
            L33:
                r0.getMessage()
            L36:
                e11.p r0 = r9.f394380a
                boolean r1 = r0.f394719r
                if (r1 == 0) goto L41
                boolean r10 = b(r10, r5)
                return r10
            L41:
                int r1 = android.os.Build.VERSION.SDK_INT
                android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Throwable -> L6a
                android.net.Uri r7 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L6a
                r6.<init>(r2, r7)     // Catch: java.lang.Throwable -> L6a
                android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L6a
                r2.<init>()     // Catch: java.lang.Throwable -> L6a
                java.lang.String r7 = "android.support.customtabs.extra.SESSION"
                r8 = 0
                r2.putBinder(r7, r8)     // Catch: java.lang.Throwable -> L6a
                boolean r7 = r10 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L6a
                if (r7 != 0) goto L5e
                r6.addFlags(r4)     // Catch: java.lang.Throwable -> L6a
            L5e:
                java.lang.String r7 = "com.android.chrome"
                r6.setPackage(r7)     // Catch: java.lang.Throwable -> L6a
                r6.putExtras(r2)     // Catch: java.lang.Throwable -> L6a
                r10.startActivity(r6)     // Catch: java.lang.Throwable -> L6a
                return r3
            L6a:
                java.lang.String r0 = r0.f394714m
                java.lang.String r2 = "store"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto La2
                r0 = 28
                if (r1 < r0) goto L89
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 == 0) goto L80
                r0 = 0
                goto L86
            L80:
                java.lang.String r0 = "https"
                boolean r0 = r5.startsWith(r0)
            L86:
                if (r0 != 0) goto L89
                goto La2
            L89:
                e11.J1$f r0 = new e11.J1$f
                r0.<init>(r5)
                com.my.target.common.MyTargetActivity.f364771d = r0
                android.content.Intent r0 = new android.content.Intent
                java.lang.Class<com.my.target.common.MyTargetActivity> r1 = com.my.target.common.MyTargetActivity.class
                r0.<init>(r10, r1)
                boolean r1 = r10 instanceof android.app.Activity
                if (r1 != 0) goto L9e
                r0.addFlags(r4)
            L9e:
                r10.startActivity(r0)
                return r3
            La2:
                boolean r10 = b(r10, r5)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: e11.J1.e.a(android.content.Context):boolean");
        }
    }

    public static class f implements MyTargetActivity.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final String f394382a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public C39920x1 f394383b;

        public f(@j.N String str) {
            this.f394382a = str;
        }
    }

    public final void a(@j.N AbstractC39895p abstractC39895p, @j.P String str, @j.N Context context) {
        String str2;
        Intent launchIntentForPackage;
        String str3;
        WeakHashMap<AbstractC39895p, Boolean> weakHashMap = f394379a;
        if (weakHashMap.containsKey(abstractC39895p)) {
            return;
        }
        AbstractC39895p abstractC39895p2 = new c(abstractC39895p, null).f394380a;
        if ("store".equals(abstractC39895p2.f394714m)) {
            if (Build.VERSION.SDK_INT < 30 || abstractC39895p2.f394721t) {
                str2 = abstractC39895p2.f394695A;
                if (str2 != null && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str2)) != null) {
                }
            } else {
                str2 = null;
                launchIntentForPackage = null;
            }
            String str4 = abstractC39895p2.f394696B;
            e2 e2Var = abstractC39895p2.f394702a;
            if (str4 != null) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str4));
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    if (str2 != null) {
                        intent.setPackage(str2);
                    }
                    context.startActivity(intent);
                    k2.a(context, e2Var.e("deeplinkClick"));
                    return;
                } catch (Throwable unused) {
                }
            }
            String str5 = abstractC39895p2.f394727z;
            if (str5 != null) {
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str5));
                    if (!(context instanceof Activity)) {
                        intent2.addFlags(268435456);
                    }
                    if (str2 != null) {
                        intent2.setPackage(str2);
                    }
                    context.startActivity(intent2);
                } catch (Throwable unused2) {
                }
                k2.a(context, e2Var.e("click"));
                str3 = abstractC39895p2.f394697C;
                if (str3 != null || F.b(str3)) {
                    return;
                }
                m2.c(new com.vk.id.captcha.web.h(12, new F(str3), context.getApplicationContext()));
                return;
            }
            if (launchIntentForPackage != null) {
                try {
                    if (!(context instanceof Activity)) {
                        launchIntentForPackage.addFlags(268435456);
                    }
                    context.startActivity(launchIntentForPackage);
                    k2.a(context, e2Var.e("click"));
                    str3 = abstractC39895p2.f394697C;
                    if (str3 != null) {
                        return;
                    } else {
                        return;
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        if (str != null) {
            if (abstractC39895p.f394720s || F.b(str)) {
                (F.b(str) ? new d(str, abstractC39895p, null) : new e(str, abstractC39895p, null)).a(context);
            } else {
                weakHashMap.put(abstractC39895p, Boolean.TRUE);
                F f12 = new F(str);
                f12.f394349b = new FX0.b(this, abstractC39895p, context, 19);
                m2.c(new com.vk.id.captcha.web.h(12, f12, context.getApplicationContext()));
            }
        }
        k2.a(context, abstractC39895p.f394702a.e("click"));
    }
}
