package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import bZ0.InterfaceC25600a;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.util.DynamiteApi;
import com.huawei.hms.framework.common.ExceptionCode;
import j.N;
import j.P;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public final class DynamiteModule {

    /* renamed from: d, reason: collision with root package name */
    @N
    @RX0.a
    public static final a f349663d;

    /* renamed from: e, reason: collision with root package name */
    @N
    @RX0.a
    public static final a f349664e;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC25600a
    @P
    public static Boolean f349665f = null;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC25600a
    @P
    public static String f349666g = null;

    /* renamed from: h, reason: collision with root package name */
    @InterfaceC25600a
    public static boolean f349667h = false;

    /* renamed from: i, reason: collision with root package name */
    @InterfaceC25600a
    public static int f349668i = -1;

    /* renamed from: j, reason: collision with root package name */
    @InterfaceC25600a
    @P
    public static Boolean f349669j;

    /* renamed from: n, reason: collision with root package name */
    @InterfaceC25600a
    @P
    public static q f349673n;

    /* renamed from: o, reason: collision with root package name */
    @InterfaceC25600a
    @P
    public static r f349674o;

    /* renamed from: a, reason: collision with root package name */
    public final Context f349675a;

    /* renamed from: k, reason: collision with root package name */
    public static final ThreadLocal f349670k = new ThreadLocal();

    /* renamed from: l, reason: collision with root package name */
    public static final ThreadLocal f349671l = new d();

    /* renamed from: m, reason: collision with root package name */
    public static final a.InterfaceC10624a f349672m = new e();

    /* renamed from: b, reason: collision with root package name */
    @N
    @RX0.a
    public static final a f349661b = new f();

    /* renamed from: c, reason: collision with root package name */
    @N
    @RX0.a
    public static final a f349662c = new g();

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @InterfaceC25600a
        @P
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @RX0.a
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, p pVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th2, p pVar) {
            super(str, th2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public interface a {

        /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        @RX0.a
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a, reason: collision with other inner class name */
        public interface InterfaceC10624a {
            int a(@N Context context, @N String str);

            int b(@N Context context, @N String str, boolean z12);
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        @RX0.a
        public static class b {

            /* renamed from: a, reason: collision with root package name */
            @RX0.a
            public int f349676a = 0;

            /* renamed from: b, reason: collision with root package name */
            @RX0.a
            public int f349677b = 0;

            /* renamed from: c, reason: collision with root package name */
            @RX0.a
            public int f349678c = 0;
        }

        @N
        @RX0.a
        b a(@N Context context, @N String str, @N InterfaceC10624a interfaceC10624a);
    }

    static {
        new h();
        f349663d = new i();
        f349664e = new j();
        new k();
        new l();
    }

    public DynamiteModule(Context context) {
        this.f349675a = context;
    }

    @RX0.a
    public static int a(@N Context context, @N String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (C36727t.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e12) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e12.getMessage()));
            return 0;
        }
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x01c2: MOVE (r8 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]) (LINE:451), block:B:116:0x01c2 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0215: MOVE (r8 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]) (LINE:534), block:B:137:0x0215 */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @j.N
    @RX0.a
    public static com.google.android.gms.dynamite.DynamiteModule c(@j.N android.content.Context r20, @j.N com.google.android.gms.dynamite.DynamiteModule.a r21, @j.N java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$a, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0164 A[Catch: all -> 0x00d2, TRY_ENTER, TryCatch #11 {all -> 0x00d2, blocks: (B:3:0x0002, B:63:0x00c7, B:65:0x00cd, B:72:0x00da, B:104:0x0164, B:113:0x0173, B:128:0x01c6, B:129:0x01c9, B:124:0x01bf, B:70:0x00d6, B:131:0x01cb, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:61:0x00c4, B:21:0x004a, B:44:0x009e, B:47:0x00a1, B:54:0x00b9, B:62:0x00c6, B:60:0x00bf), top: B:145:0x0002, inners: #3, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c6 A[Catch: all -> 0x00d2, TryCatch #11 {all -> 0x00d2, blocks: (B:3:0x0002, B:63:0x00c7, B:65:0x00cd, B:72:0x00da, B:104:0x0164, B:113:0x0173, B:128:0x01c6, B:129:0x01c9, B:124:0x01bf, B:70:0x00d6, B:131:0x01cb, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:61:0x00c4, B:21:0x004a, B:44:0x009e, B:47:0x00a1, B:54:0x00b9, B:62:0x00c6, B:60:0x00bf), top: B:145:0x0002, inners: #3, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad A[Catch: all -> 0x0037, TryCatch #13 {, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b6, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x004f, B:27:0x0053, B:30:0x005c, B:32:0x0064, B:35:0x006b, B:42:0x0095, B:43:0x009d, B:38:0x0072, B:40:0x0078, B:41:0x0087, B:46:0x00a0, B:49:0x00a3, B:50:0x00ad, B:17:0x003f), top: B:146:0x0027, inners: #14 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(@j.N android.content.Context r11, @j.N java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(boolean r8, boolean r9, java.lang.String r10, android.content.Context r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(boolean, boolean, java.lang.String, android.content.Context):int");
    }

    @InterfaceC25600a
    public static void f(ClassLoader classLoader) throws LoadingException {
        r rVar;
        p pVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                rVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                rVar = iInterfaceQueryLocalInterface instanceof r ? (r) iInterfaceQueryLocalInterface : new r(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f349674o = rVar;
        } catch (ClassNotFoundException e12) {
            e = e12;
            throw new LoadingException("Failed to instantiate dynamite loader", e, pVar);
        } catch (IllegalAccessException e13) {
            e = e13;
            throw new LoadingException("Failed to instantiate dynamite loader", e, pVar);
        } catch (InstantiationException e14) {
            e = e14;
            throw new LoadingException("Failed to instantiate dynamite loader", e, pVar);
        } catch (NoSuchMethodException e15) {
            e = e15;
            throw new LoadingException("Failed to instantiate dynamite loader", e, pVar);
        } catch (InvocationTargetException e16) {
            e = e16;
            throw new LoadingException("Failed to instantiate dynamite loader", e, pVar);
        }
    }

    @InterfaceC25600a
    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f349669j)) {
            return true;
        }
        boolean z12 = false;
        if (f349669j == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C36688g.f349289b.c(ExceptionCode.CRASH_EXCEPTION, context) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z12 = true;
            }
            f349669j = Boolean.valueOf(z12);
            if (z12 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f349667h = true;
            }
        }
        return z12;
    }

    @P
    public static q h(Context context) {
        q qVar;
        synchronized (DynamiteModule.class) {
            q qVar2 = f349673n;
            if (qVar2 != null) {
                return qVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    qVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    qVar = iInterfaceQueryLocalInterface instanceof q ? (q) iInterfaceQueryLocalInterface : new q(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (qVar != null) {
                    f349673n = qVar;
                    return qVar;
                }
            } catch (Exception e12) {
                e12.getMessage();
            }
            return null;
        }
    }

    @N
    @RX0.a
    public final IBinder b(@N String str) throws LoadingException {
        try {
            return (IBinder) this.f349675a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e12) {
            throw new LoadingException("Failed to instantiate module class: ".concat(str), e12, null);
        }
    }
}
