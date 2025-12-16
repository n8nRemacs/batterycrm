package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.internal.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37231y implements InterfaceC37221n {
    public static void c(ClassLoader classLoader, HashSet hashSet, InterfaceC37230x interfaceC37230x) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (hashSet.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hashSet2.add(((File) it.next()).getParentFile());
        }
        Object objA = new J(classLoader, K.d(classLoader, "pathList"), Object.class).a();
        J j12 = new J(objA, K.d(objA, "nativeLibraryDirectories"), List.class);
        synchronized (com.google.android.play.core.splitinstall.c0.class) {
            ArrayList arrayList = new ArrayList((Collection) j12.a());
            hashSet2.removeAll(arrayList);
            arrayList.addAll(hashSet2);
            j12.b(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrA = interfaceC37230x.a(objA, new ArrayList(hashSet2), arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (com.google.android.play.core.splitinstall.c0.class) {
                K.a(objA, Object.class, "nativeLibraryPathElements").d(Arrays.asList(objArrA));
            }
            return;
        }
        zzbh zzbhVar = new zzbh("Error in makePathElements");
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList2.get(i12));
            } catch (Exception unused) {
            }
        }
        throw zzbhVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.InterfaceC37221n
    public final void a(ClassLoader classLoader, HashSet hashSet) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c(classLoader, hashSet, new C37229w());
    }

    @Override // com.google.android.play.core.splitinstall.internal.InterfaceC37221n
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z12) {
        return C37226t.d(classLoader, file, file2, z12, new C37228v(), "zip", new C37224q());
    }
}
