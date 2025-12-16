package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.collection.C20199a;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.data.m;
import com.bumptech.glide.load.engine.cache.n;
import com.bumptech.glide.load.engine.cache.q;
import com.bumptech.glide.load.engine.executor.a;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.load.model.a;
import com.bumptech.glide.load.model.b;
import com.bumptech.glide.load.model.d;
import com.bumptech.glide.load.model.e;
import com.bumptech.glide.load.model.f;
import com.bumptech.glide.load.model.k;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.load.model.stream.b;
import com.bumptech.glide.load.model.stream.c;
import com.bumptech.glide.load.model.stream.d;
import com.bumptech.glide.load.model.stream.e;
import com.bumptech.glide.load.model.stream.f;
import com.bumptech.glide.load.model.stream.g;
import com.bumptech.glide.load.model.t;
import com.bumptech.glide.load.model.u;
import com.bumptech.glide.load.model.v;
import com.bumptech.glide.load.model.w;
import com.bumptech.glide.load.model.x;
import com.bumptech.glide.load.resource.bitmap.A;
import com.bumptech.glide.load.resource.bitmap.C36357a;
import com.bumptech.glide.load.resource.bitmap.C36358b;
import com.bumptech.glide.load.resource.bitmap.C36361e;
import com.bumptech.glide.load.resource.bitmap.C36366j;
import com.bumptech.glide.load.resource.bitmap.D;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.H;
import com.bumptech.glide.load.resource.bitmap.J;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.load.resource.bitmap.y;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import com.bumptech.glide.manager.l;
import hW0.C40890a;
import iW0.C41353a;
import j.B;
import j.N;
import j.P;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: Glide.java */
/* loaded from: classes5.dex */
public class b implements ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    public static volatile b f338680k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile boolean f338681l;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f338682b;

    /* renamed from: c, reason: collision with root package name */
    public final n f338683c;

    /* renamed from: d, reason: collision with root package name */
    public final e f338684d;

    /* renamed from: e, reason: collision with root package name */
    public final Registry f338685e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.j f338686f;

    /* renamed from: g, reason: collision with root package name */
    public final l f338687g;

    /* renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.manager.f f338688h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f338689i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final a f338690j;

    /* compiled from: Glide.java */
    public interface a {
    }

    public b(@N Context context, @N m mVar, @N n nVar, @N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @N com.bumptech.glide.load.engine.bitmap_recycle.j jVar, @N l lVar, @N com.bumptech.glide.manager.f fVar, int i12, @N a aVar, @N C20199a c20199a, @N List list) {
        this.f338682b = eVar;
        this.f338686f = jVar;
        this.f338683c = nVar;
        this.f338687g = lVar;
        this.f338688h = fVar;
        this.f338690j = aVar;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f338685e = registry;
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        com.bumptech.glide.provider.b bVar = registry.f338676g;
        synchronized (bVar) {
            bVar.f339523a.add(defaultImageHeaderParser);
        }
        int i13 = Build.VERSION.SDK_INT;
        r rVar = new r();
        com.bumptech.glide.provider.b bVar2 = registry.f338676g;
        synchronized (bVar2) {
            bVar2.f339523a.add(rVar);
        }
        ArrayList arrayListB = registry.b();
        com.bumptech.glide.load.resource.gif.a aVar2 = new com.bumptech.glide.load.resource.gif.a(context, arrayListB, eVar, jVar);
        J jF2 = J.f(eVar);
        o oVar = new o(registry.b(), resources.getDisplayMetrics(), eVar, jVar);
        C36366j c36366j = new C36366j(oVar);
        D d12 = new D(oVar, jVar);
        com.bumptech.glide.load.resource.drawable.e eVar2 = new com.bumptech.glide.load.resource.drawable.e(context);
        s.c cVar = new s.c(resources);
        s.d dVar = new s.d(resources);
        s.b bVar3 = new s.b(resources);
        s.a aVar3 = new s.a(resources);
        C36361e c36361e = new C36361e(jVar);
        com.bumptech.glide.load.resource.transcode.a aVar4 = new com.bumptech.glide.load.resource.transcode.a();
        com.bumptech.glide.load.resource.transcode.d dVar2 = new com.bumptech.glide.load.resource.transcode.d();
        ContentResolver contentResolver = context.getContentResolver();
        com.bumptech.glide.load.model.c cVar2 = new com.bumptech.glide.load.model.c();
        com.bumptech.glide.provider.a aVar5 = registry.f338671b;
        aVar5.a(ByteBuffer.class, cVar2);
        aVar5.a(InputStream.class, new t(jVar));
        com.bumptech.glide.provider.e eVar3 = registry.f338672c;
        eVar3.a(c36366j, ByteBuffer.class, Bitmap.class, "Bitmap");
        registry.a(d12, InputStream.class, Bitmap.class, "Bitmap");
        registry.a(new y(oVar), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        eVar3.a(jF2, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        eVar3.a(J.c(eVar), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        v.a<?> aVar6 = v.a.f339301a;
        p pVar = registry.f338670a;
        pVar.a(Bitmap.class, Bitmap.class, aVar6);
        eVar3.a(new H(), Bitmap.class, Bitmap.class, "Bitmap");
        com.bumptech.glide.provider.f fVar2 = registry.f338673d;
        fVar2.a(Bitmap.class, c36361e);
        eVar3.a(new C36357a(resources, c36366j), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        eVar3.a(new C36357a(resources, d12), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        eVar3.a(new C36357a(resources, jF2), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        fVar2.a(BitmapDrawable.class, new C36358b(eVar, c36361e));
        eVar3.a(new com.bumptech.glide.load.resource.gif.j(arrayListB, aVar2, jVar), InputStream.class, com.bumptech.glide.load.resource.gif.c.class, "Gif");
        eVar3.a(aVar2, ByteBuffer.class, com.bumptech.glide.load.resource.gif.c.class, "Gif");
        fVar2.a(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.d());
        pVar.a(com.bumptech.glide.gifdecoder.a.class, com.bumptech.glide.gifdecoder.a.class, aVar6);
        eVar3.a(new com.bumptech.glide.load.resource.gif.h(eVar), com.bumptech.glide.gifdecoder.a.class, Bitmap.class, "Bitmap");
        registry.a(eVar2, Uri.class, Drawable.class, "legacy_append");
        registry.a(new A(eVar2, eVar), Uri.class, Bitmap.class, "legacy_append");
        registry.c(new C40890a.C11262a());
        pVar.a(File.class, ByteBuffer.class, new d.b());
        pVar.a(File.class, InputStream.class, new f.e());
        registry.a(new C41353a(), File.class, File.class, "legacy_append");
        pVar.a(File.class, ParcelFileDescriptor.class, new f.b());
        pVar.a(File.class, File.class, aVar6);
        registry.c(new k.a(jVar));
        registry.c(new m.a());
        Class cls = Integer.TYPE;
        pVar.a(cls, InputStream.class, cVar);
        pVar.a(cls, ParcelFileDescriptor.class, bVar3);
        pVar.a(Integer.class, InputStream.class, cVar);
        pVar.a(Integer.class, ParcelFileDescriptor.class, bVar3);
        pVar.a(Integer.class, Uri.class, dVar);
        pVar.a(cls, AssetFileDescriptor.class, aVar3);
        pVar.a(Integer.class, AssetFileDescriptor.class, aVar3);
        pVar.a(cls, Uri.class, dVar);
        pVar.a(String.class, InputStream.class, new e.c());
        pVar.a(Uri.class, InputStream.class, new e.c());
        pVar.a(String.class, InputStream.class, new u.c());
        pVar.a(String.class, ParcelFileDescriptor.class, new u.b());
        pVar.a(String.class, AssetFileDescriptor.class, new u.a());
        pVar.a(Uri.class, InputStream.class, new c.a());
        pVar.a(Uri.class, InputStream.class, new a.c(context.getAssets()));
        pVar.a(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets()));
        pVar.a(Uri.class, InputStream.class, new d.a(context));
        registry.f338670a.a(Uri.class, InputStream.class, new e.a(context));
        if (i13 >= 29) {
            registry.f338670a.a(Uri.class, InputStream.class, new f.c(context));
            registry.f338670a.a(Uri.class, ParcelFileDescriptor.class, new f.b(context));
        }
        pVar.a(Uri.class, InputStream.class, new w.d(contentResolver));
        pVar.a(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver));
        pVar.a(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver));
        pVar.a(Uri.class, InputStream.class, new x.a());
        pVar.a(URL.class, InputStream.class, new g.a());
        pVar.a(Uri.class, File.class, new k.a(context));
        pVar.a(com.bumptech.glide.load.model.g.class, InputStream.class, new b.a());
        pVar.a(byte[].class, ByteBuffer.class, new b.a());
        pVar.a(byte[].class, InputStream.class, new b.d());
        pVar.a(Uri.class, Uri.class, aVar6);
        pVar.a(Drawable.class, Drawable.class, aVar6);
        registry.a(new com.bumptech.glide.load.resource.drawable.f(), Drawable.class, Drawable.class, "legacy_append");
        com.bumptech.glide.load.resource.transcode.b bVar4 = new com.bumptech.glide.load.resource.transcode.b(resources);
        com.bumptech.glide.load.resource.transcode.f fVar3 = registry.f338675f;
        fVar3.c(Bitmap.class, BitmapDrawable.class, bVar4);
        fVar3.c(Bitmap.class, byte[].class, aVar4);
        fVar3.c(Drawable.class, byte[].class, new com.bumptech.glide.load.resource.transcode.c(eVar, aVar4, dVar2));
        registry.f338675f.c(com.bumptech.glide.load.resource.gif.c.class, byte[].class, dVar2);
        J jD2 = J.d(eVar);
        registry.a(jD2, ByteBuffer.class, Bitmap.class, "legacy_append");
        registry.a(new C36357a(resources, jD2), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        this.f338684d = new e(context, jVar, registry, new com.bumptech.glide.request.target.l(), aVar, c20199a, list, mVar, i12);
    }

    @B
    public static void a(@N Context context, @P GeneratedAppGlideModule generatedAppGlideModule) throws PackageManager.NameNotFoundException {
        if (f338681l) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f338681l = true;
        c cVar = new c();
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                Log.isLoggable("ManifestParser", 3);
            } else {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(com.bumptech.glide.module.e.a(str));
                        Log.isLoggable("ManifestParser", 3);
                    }
                }
                Log.isLoggable("ManifestParser", 3);
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                Set<Class<?>> setC = generatedAppGlideModule.c();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.bumptech.glide.module.c cVar2 = (com.bumptech.glide.module.c) it.next();
                    if (setC.contains(cVar2.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            cVar2.toString();
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((com.bumptech.glide.module.c) it2.next()).getClass().toString();
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((com.bumptech.glide.module.c) it3.next()).b();
            }
            if (cVar.f338696f == null) {
                int i12 = com.bumptech.glide.load.engine.executor.a.f338994d;
                a.C10503a c10503a = new a.C10503a(false);
                if (com.bumptech.glide.load.engine.executor.a.f338994d == 0) {
                    com.bumptech.glide.load.engine.executor.a.f338994d = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i13 = com.bumptech.glide.load.engine.executor.a.f338994d;
                c10503a.f338997b = i13;
                c10503a.f338998c = i13;
                c10503a.f339000e = SearchParamsConverterKt.SOURCE;
                cVar.f338696f = c10503a.a();
            }
            if (cVar.f338697g == null) {
                int i14 = com.bumptech.glide.load.engine.executor.a.f338994d;
                a.C10503a c10503a2 = new a.C10503a(true);
                c10503a2.f338997b = 1;
                c10503a2.f338998c = 1;
                c10503a2.f339000e = "disk-cache";
                cVar.f338697g = c10503a2.a();
            }
            if (cVar.f338703m == null) {
                if (com.bumptech.glide.load.engine.executor.a.f338994d == 0) {
                    com.bumptech.glide.load.engine.executor.a.f338994d = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i15 = com.bumptech.glide.load.engine.executor.a.f338994d < 4 ? 1 : 2;
                a.C10503a c10503a3 = new a.C10503a(true);
                c10503a3.f338997b = i15;
                c10503a3.f338998c = i15;
                c10503a3.f339000e = "animation";
                cVar.f338703m = c10503a3.a();
            }
            if (cVar.f338699i == null) {
                cVar.f338699i = new q(new q.a(applicationContext));
            }
            if (cVar.f338700j == null) {
                cVar.f338700j = new com.bumptech.glide.manager.f();
            }
            if (cVar.f338693c == null) {
                int i16 = cVar.f338699i.f338972a;
                if (i16 > 0) {
                    cVar.f338693c = new com.bumptech.glide.load.engine.bitmap_recycle.k(i16);
                } else {
                    cVar.f338693c = new com.bumptech.glide.load.engine.bitmap_recycle.f();
                }
            }
            if (cVar.f338694d == null) {
                cVar.f338694d = new com.bumptech.glide.load.engine.bitmap_recycle.j(cVar.f338699i.f338974c);
            }
            if (cVar.f338695e == null) {
                cVar.f338695e = new n(cVar.f338699i.f338973b);
            }
            if (cVar.f338698h == null) {
                cVar.f338698h = new com.bumptech.glide.load.engine.cache.m(applicationContext);
            }
            if (cVar.f338692b == null) {
                cVar.f338692b = new com.bumptech.glide.load.engine.m(cVar.f338695e, cVar.f338698h, cVar.f338697g, cVar.f338696f, com.bumptech.glide.load.engine.executor.a.a(), cVar.f338703m);
            }
            List<com.bumptech.glide.request.f<Object>> list = cVar.f338704n;
            if (list == null) {
                cVar.f338704n = Collections.emptyList();
            } else {
                cVar.f338704n = Collections.unmodifiableList(list);
            }
            b bVar = new b(applicationContext, cVar.f338692b, cVar.f338695e, cVar.f338693c, cVar.f338694d, new l(), cVar.f338700j, cVar.f338701k, cVar.f338702l, cVar.f338691a, cVar.f338704n);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                com.bumptech.glide.module.c cVar3 = (com.bumptech.glide.module.c) it4.next();
                try {
                    cVar3.a();
                } catch (AbstractMethodError e12) {
                    throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(cVar3.getClass().getName()), e12);
                }
            }
            applicationContext.registerComponentCallbacks(bVar);
            f338680k = bVar;
            f338681l = false;
        } catch (PackageManager.NameNotFoundException e13) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e13);
        }
    }

    @N
    public static b b(@N Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f338680k == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                Log.isLoggable("Glide", 5);
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InstantiationException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e15);
            }
            synchronized (b.class) {
                try {
                    if (f338680k == null) {
                        a(context, generatedAppGlideModule);
                    }
                } finally {
                }
            }
        }
        return f338680k;
    }

    @N
    public static j c(@N View view) {
        j jVarA;
        Context context = view.getContext();
        com.bumptech.glide.util.k.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        l lVar = b(context).f338687g;
        lVar.getClass();
        if (com.bumptech.glide.util.m.h()) {
            return lVar.d(view.getContext().getApplicationContext());
        }
        com.bumptech.glide.util.k.c(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = l.a(view.getContext());
        if (activityA == null) {
            return lVar.d(view.getContext().getApplicationContext());
        }
        boolean z12 = activityA instanceof ActivityC22955m;
        l.b bVar = lVar.f339513f;
        if (z12) {
            ActivityC22955m activityC22955m = (ActivityC22955m) activityA;
            C20199a<View, Fragment> c20199a = lVar.f339514g;
            c20199a.clear();
            l.c(activityC22955m.getSupportFragmentManager().P(), c20199a);
            View viewFindViewById = activityC22955m.findViewById(R.id.content);
            Fragment fragment = null;
            while (!view.equals(viewFindViewById) && (fragment = c20199a.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            c20199a.clear();
            if (fragment != null) {
                com.bumptech.glide.util.k.c(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
                if (com.bumptech.glide.util.m.h()) {
                    return lVar.d(fragment.getContext().getApplicationContext());
                }
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                Context context2 = fragment.getContext();
                SupportRequestManagerFragment supportRequestManagerFragmentF = lVar.f(childFragmentManager, fragment, fragment.isVisible());
                jVarA = supportRequestManagerFragmentF.f339489j0;
                if (jVarA == null) {
                    jVarA = bVar.a(b(context2), supportRequestManagerFragmentF.f339485f0, supportRequestManagerFragmentF.f339486g0, context2);
                    supportRequestManagerFragmentF.f339489j0 = jVarA;
                }
            } else {
                if (com.bumptech.glide.util.m.h()) {
                    return lVar.d(activityC22955m.getApplicationContext());
                }
                if (activityC22955m.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                SupportRequestManagerFragment supportRequestManagerFragmentF2 = lVar.f(activityC22955m.getSupportFragmentManager(), null, l.g(activityC22955m));
                jVarA = supportRequestManagerFragmentF2.f339489j0;
                if (jVarA == null) {
                    jVarA = bVar.a(b(activityC22955m), supportRequestManagerFragmentF2.f339485f0, supportRequestManagerFragmentF2.f339486g0, activityC22955m);
                    supportRequestManagerFragmentF2.f339489j0 = jVarA;
                }
            }
        } else {
            C20199a<View, android.app.Fragment> c20199a2 = lVar.f339515h;
            c20199a2.clear();
            l.b(activityA.getFragmentManager(), c20199a2);
            View viewFindViewById2 = activityA.findViewById(R.id.content);
            android.app.Fragment fragment2 = null;
            while (!view.equals(viewFindViewById2) && (fragment2 = c20199a2.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            c20199a2.clear();
            if (fragment2 == null) {
                if (com.bumptech.glide.util.m.h()) {
                    return lVar.d(activityA.getApplicationContext());
                }
                if (activityA.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                com.bumptech.glide.manager.k kVarE = lVar.e(activityA.getFragmentManager(), null, l.g(activityA));
                jVarA = kVarE.f339504e;
                if (jVarA == null) {
                    jVarA = bVar.a(b(activityA), kVarE.f339501b, kVarE.f339502c, activityA);
                    kVarE.f339504e = jVarA;
                }
            } else {
                if (fragment2.getActivity() == null) {
                    throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
                }
                if (com.bumptech.glide.util.m.h()) {
                    return lVar.d(fragment2.getActivity().getApplicationContext());
                }
                android.app.FragmentManager childFragmentManager2 = fragment2.getChildFragmentManager();
                Activity activity = fragment2.getActivity();
                com.bumptech.glide.manager.k kVarE2 = lVar.e(childFragmentManager2, fragment2, fragment2.isVisible());
                jVarA = kVarE2.f339504e;
                if (jVarA == null) {
                    jVarA = bVar.a(b(activity), kVarE2.f339501b, kVarE2.f339502c, activity);
                    kVarE2.f339504e = jVarA;
                }
            }
        }
        return jVarA;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        char[] cArr = com.bumptech.glide.util.m.f339649a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        this.f338683c.a();
        this.f338682b.c();
        this.f338686f.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i12) {
        long j12;
        char[] cArr = com.bumptech.glide.util.m.f339649a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        Iterator it = this.f338689i.iterator();
        while (it.hasNext()) {
            ((j) it.next()).getClass();
        }
        n nVar = this.f338683c;
        nVar.getClass();
        if (i12 >= 40) {
            nVar.a();
        } else if (i12 >= 20 || i12 == 15) {
            synchronized (nVar) {
                j12 = nVar.f339643b;
            }
            nVar.f(j12 / 2);
        }
        this.f338682b.a(i12);
        com.bumptech.glide.load.engine.bitmap_recycle.j jVar = this.f338686f;
        synchronized (jVar) {
            try {
                if (i12 >= 40) {
                    jVar.a();
                } else if (i12 >= 20 || i12 == 15) {
                    jVar.c(jVar.f338925e / 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
