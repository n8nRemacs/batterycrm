package one.me.android;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LruCache;
import com.jakewharton.processphoenix.ProcessPhoenix;
import defpackage.a7c;
import defpackage.af6;
import defpackage.am8;
import defpackage.arb;
import defpackage.axa;
import defpackage.bwf;
import defpackage.c7c;
import defpackage.cm6;
import defpackage.co3;
import defpackage.cq;
import defpackage.d7j;
import defpackage.da1;
import defpackage.df6;
import defpackage.di8;
import defpackage.es9;
import defpackage.fr7;
import defpackage.fzf;
import defpackage.g4b;
import defpackage.gmf;
import defpackage.gq5;
import defpackage.h2f;
import defpackage.hd5;
import defpackage.he7;
import defpackage.ipi;
import defpackage.iqa;
import defpackage.k18;
import defpackage.l6b;
import defpackage.l8g;
import defpackage.lg8;
import defpackage.lj5;
import defpackage.mwa;
import defpackage.ni;
import defpackage.nwa;
import defpackage.oo3;
import defpackage.qn3;
import defpackage.qo3;
import defpackage.qv3;
import defpackage.r1g;
import defpackage.rw4;
import defpackage.rwa;
import defpackage.t1b;
import defpackage.t64;
import defpackage.ue3;
import defpackage.uve;
import defpackage.ve2;
import defpackage.ve3;
import defpackage.w07;
import defpackage.w86;
import defpackage.wd5;
import defpackage.wqi;
import defpackage.wv4;
import defpackage.wy1;
import defpackage.x07;
import defpackage.x6g;
import defpackage.yq9;
import defpackage.yy7;
import defpackage.zdi;
import defpackage.zqb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lone/me/android/OneMeApplication;", "Landroid/app/Application;", "Loo3;", "Lfzf;", "", "Lw07;", "Lx07;", "<init>", "()V", "rwa", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OneMeApplication extends Application implements oo3, fzf, w07, x07 {
    public static final rwa s0 = new rwa();
    public final bwf Z;
    public final Object a;
    public final l6b d;
    public final bwf o;
    public final cq b = cq.a;
    public final ArrayList c = new ArrayList();
    public final long X = SystemClock.elapsedRealtime();
    public final String Y = OneMeApplication.class.getName();

    public OneMeApplication() {
        int i = 17;
        this.a = ipi.b(3, new yq9(i));
        int i2 = 18;
        this.o = new bwf(new yq9(i2));
        Looper.getMainLooper();
        new am8();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        arb arbVar = arb.APP_INIT;
        cq.b.m(arbVar, new zqb(arbVar, jElapsedRealtime));
        di8.g.r(Long.valueOf(jElapsedRealtime));
        g4b g4bVar = (g4b) qn3.g.getValue();
        yy7[] yy7VarArr = g4b.q;
        l6b l6bVar = new l6b(new mwa(this, 16), new mwa(this, i), new mwa(this, i2), d7j.a(new lj5(g4bVar.h(g4bVar.f(1, "logs", 1, 5, false), "logs"))));
        this.d = l6bVar;
        wqi.a = l6bVar;
        zdi.a = new iqa(3);
        gmf gmfVar = gmf.a;
        this.Z = new bwf(new mwa(this, 6));
    }

    @Override // defpackage.oo3
    public final qo3 a() {
        return (qo3) t1b.a.getAccessor().c(655);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!l8g.c("ru")) {
            Locale locale = new Locale("ru");
            Locale.setDefault(locale);
            Configuration configuration = new Configuration();
            configuration.fontScale = 0.0f;
            configuration.setLocale(locale);
            configuration.setLayoutDirection(locale);
            context = context.createConfigurationContext(configuration);
        }
        super.attachBaseContext(context);
        if (ProcessPhoenix.a(this)) {
            return;
        }
        axa axaVar = new axa(context, this);
        h2f.a = h2f.b(axaVar);
        df6 df6VarC = c();
        es9 es9Var = new es9(axaVar, 26, this);
        hd5 hd5Var = hd5.a;
        af6 af6VarA = df6VarC.a("Tracer", hd5Var, es9Var);
        ArrayList arrayList = this.c;
        arrayList.add(af6VarA);
        df6 df6VarC2 = c();
        List listSingletonList = Collections.singletonList(af6VarA);
        l6b l6bVar = this.d;
        if (l6bVar == null) {
            l6bVar = null;
        }
        int i = 0;
        af6 af6VarA2 = df6VarC2.a("Scout", listSingletonList, new wv4(this, axaVar, l6bVar, i));
        arrayList.add(af6VarA2);
        arrayList.add(c().a("Protobuf", Collections.singletonList(af6VarA), new yq9(12)));
        arrayList.add(c().a("FrescoStartup", Collections.singletonList(af6VarA2), new mwa(this, i)));
        int i2 = 1;
        b(c(), "LibraryUpgrade", hd5Var, new mwa(this, i2));
        c().a("Account", Collections.singletonList(af6VarA2), new yq9(14));
        b(c(), "AnrWatcher", hd5Var, new mwa(this, 3));
        int i3 = 15;
        c().a("SetupRx", hd5.a, new yq9(i3));
        c().a("RxJavaPlugins.setErrorHandler", hd5.a, new mwa(this, 4));
        af6 af6VarA3 = c().a("Chroma.init", hd5Var, new mwa(this, 5));
        b(c(), "AppTracerCrashService", hd5Var, new yq9(16));
        int i4 = 2;
        int i5 = 19;
        b(c(), "IoPoolSize", Collections.singletonList(b(c(), "Logger", hd5Var, new mwa(this, i4))), new yq9(i5));
        b(c(), "Fresco", hd5Var, new yq9(28));
        b(c(), "Theme background warmup", hd5Var, new mwa(this, i3));
        b(c(), "Chroma.dynamicChange", Collections.singletonList(af6VarA3), new mwa(this, i5));
        b(c(), "DynamicFont", hd5Var, new mwa(this, 20));
        b(c(), "NativeMedia", hd5Var, new nwa(18));
        b(c(), "EmojiProvider", hd5Var, new nwa(22));
        b(c(), "Animoji warmup", hd5Var, new nwa(23));
        b(c(), "VisibilityController", hd5Var, new yq9(11));
        b(c(), "ProxyChangeListener", hd5Var, new yq9(13));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicReference atomicReference = new AtomicReference(Boolean.FALSE);
        af6 af6VarB = b(c(), "InitialDataStorage.Banners", hd5Var, new fr7(21, atomicBoolean));
        b(c(), "LegacyChats", ve3.j(b(c(), "InitialDataStorage.Chats", hd5Var, new t64(atomicReference, i2)), b(c(), "InitialDataStorage.Folders", hd5Var, new t64(atomicReference, i4)), af6VarB), new da1(this, atomicBoolean, atomicReference, 10));
    }

    public final af6 b(df6 df6Var, String str, Iterable iterable, cm6 cm6Var) {
        ArrayList arrayList = this.c;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((af6) it.next()).a.equals(str)) {
                    throw new IllegalStateException(("Task " + str + " is root").toString());
                }
            }
        }
        return df6Var.a(str, ue3.T(arrayList, iterable), cm6Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final df6 c() {
        return (df6) this.a.getValue();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        Context applicationContext = super.getApplicationContext();
        return applicationContext == null ? this : applicationContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        uve uveVar = (uve) this.Z.getValue();
        return (SharedPreferences) ((ConcurrentHashMap) uveVar.b.getValue()).computeIfAbsent(str, new ni(27, new a7c(uveVar, 7, str)));
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        co3 co3Var = (co3) this.o.getValue();
        w86 w86Var = co3Var.a;
        k18 k18Var = (k18) w86Var.b;
        boolean z = (configuration.uiMode & 48) == 32;
        Boolean bool = co3Var.b;
        if (bool == null) {
            co3Var.b = Boolean.valueOf(z);
            co3Var.c = Float.valueOf(configuration.fontScale);
            ((r1g) k18Var.getValue()).b(true);
            return;
        }
        if (bool.booleanValue() != z) {
            wqi.c("co3", "onConfigurationChanged: system night mode changed to " + z, new Object[0]);
            co3Var.b = Boolean.valueOf(z);
            ((r1g) k18Var.getValue()).b(true);
        }
        if (co3Var.c.floatValue() != configuration.fontScale) {
            wqi.c("co3", "onConfigurationChanged: fontScale changed from " + co3Var.c + " to " + configuration.fontScale, new Object[0]);
            co3Var.c = Float.valueOf(configuration.fontScale);
            rw4.a().b();
            ((c7c) ((k18) w86Var.c).getValue()).a();
            ((qv3) ((k18) w86Var.d).getValue()).e();
            ((ve2) ((k18) w86Var.e).getValue()).C();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:28|123|29|33|(1:35)|36|(1:38)(1:39)|40|(1:44)(19:46|(1:48)|49|(1:51)(1:52)|53|(1:55)(1:56)|57|127|58|62|(1:64)|65|(1:67)(1:68)|69|(1:71)(1:72)|(1:74)(1:75)|76|(1:78)(1:79)|80)|45|49|(0)(0)|53|(0)(0)|57|127|58|62|(0)|65|(0)(0)|69|(0)(0)|(0)(0)|76|(0)(0)|80) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0506, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0507, code lost:
    
        r0 = new defpackage.ipd(r0);
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0594  */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.android.OneMeApplication.onCreate():void");
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        String str = this.Y;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, wy1.h("onTrimMemory: ", i != 5 ? i != 10 ? i != 15 ? i != 20 ? i != 40 ? i != 60 ? i != 80 ? wy1.e(i, "UNKNOWN_TRIM_MEMORY_LEVEL(", ")") : "TRIM_MEMORY_COMPLETE" : "TRIM_MEMORY_MODERATE" : "TRIM_MEMORY_BACKGROUND" : "TRIM_MEMORY_UI_HIDDEN" : "TRIM_MEMORY_RUNNING_CRITICAL" : "TRIM_MEMORY_RUNNING_LOW" : "TRIM_MEMORY_RUNNING_MODERATE"), null);
            }
        }
        if (i >= 40 && !ProcessPhoenix.a(this)) {
            he7 he7Var = (he7) t1b.a.getAccessor().c(671);
            ((g4b) he7Var.d.getValue()).a().execute(new gq5(11, he7Var));
            LruCache lruCache = x6g.a;
            wqi.c("ThemeBackgroundCache", "clear cache of themes.", new Object[0]);
            x6g.a.evictAll();
        }
        wd5.a.i(-1);
    }
}
