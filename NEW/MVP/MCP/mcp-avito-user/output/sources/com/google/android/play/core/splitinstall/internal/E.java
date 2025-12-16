package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class E implements InterfaceC37221n {
    @Override // com.google.android.play.core.splitinstall.internal.InterfaceC37221n
    public final void a(ClassLoader classLoader, HashSet hashSet) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C37231y.c(classLoader, hashSet, new C());
    }

    @Override // com.google.android.play.core.splitinstall.internal.InterfaceC37221n
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z12) {
        return C37226t.d(classLoader, file, file2, z12, new C37228v(), "path", new D());
    }
}
