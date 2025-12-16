package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.internal.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37226t implements InterfaceC37221n {
    public static void c(ClassLoader classLoader, HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            "Adding native library parent directory: ".concat(String.valueOf(file.getParentFile().getAbsolutePath()));
            hashSet2.add(file.getParentFile());
        }
        I iA2 = K.a(new J(classLoader, K.d(classLoader, "pathList"), Object.class).a(), File.class, "nativeLibraryDirectories");
        hashSet2.removeAll(Arrays.asList((File[]) iA2.a()));
        synchronized (com.google.android.play.core.splitinstall.c0.class) {
            hashSet2.size();
            iA2.d(hashSet2);
        }
    }

    public static boolean d(ClassLoader classLoader, File file, File file2, boolean z12, InterfaceC37225s interfaceC37225s, String str, r rVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        Object objA = new J(classLoader, K.d(classLoader, "pathList"), Object.class).a();
        I iA2 = K.a(objA, Object.class, "dexElements");
        List listAsList = Arrays.asList((Object[]) iA2.a());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listAsList) {
            arrayList2.add((File) new J(obj, K.d(obj, str), File.class).a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z12 && !rVar.a(objA, file2, file)) {
            "Should be optimized ".concat(String.valueOf(file2.getPath()));
            return false;
        }
        iA2.c(Arrays.asList(interfaceC37225s.a(objA, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList.get(i12));
            } catch (Exception unused) {
            }
        }
        K.a(objA, IOException.class, "dexElementsSuppressedExceptions").c(arrayList);
        throw zzbhVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.InterfaceC37221n
    public final void a(ClassLoader classLoader, HashSet hashSet) {
        c(classLoader, hashSet);
    }

    @Override // com.google.android.play.core.splitinstall.internal.InterfaceC37221n
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z12) {
        return d(classLoader, file, file2, z12, new C37223p(), "zip", new C37224q());
    }
}
