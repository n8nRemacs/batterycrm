package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.internal.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37228v implements InterfaceC37225s {
    @Override // com.google.android.play.core.splitinstall.internal.InterfaceC37225s
    public final Object[] a(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
        return (Object[]) K.c(obj, "makePathElements", List.class, arrayList, file, List.class, arrayList2);
    }
}
