package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.internal.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37227u implements InterfaceC37221n {
    @Override // com.google.android.play.core.splitinstall.internal.InterfaceC37221n
    public final void a(ClassLoader classLoader, HashSet hashSet) {
        C37226t.c(classLoader, hashSet);
    }

    @Override // com.google.android.play.core.splitinstall.internal.InterfaceC37221n
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z12) {
        return C37226t.d(classLoader, file, file2, z12, new C37223p(), "zip", new C37224q());
    }
}
