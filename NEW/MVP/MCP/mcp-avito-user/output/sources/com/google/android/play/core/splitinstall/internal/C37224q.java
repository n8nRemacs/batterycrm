package com.google.android.play.core.splitinstall.internal;

import java.io.File;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.internal.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37224q implements r {
    @Override // com.google.android.play.core.splitinstall.internal.r
    public final boolean a(Object obj, File file, File file2) {
        Class<?> cls = obj.getClass();
        try {
            return new File((String) String.class.cast(K.e(cls, "optimizedPathFor", File.class, File.class).invoke(null, file, file2))).exists();
        } catch (Exception e12) {
            throw new zzbl(androidx.compose.ui.graphics.colorspace.e.k(cls, "Failed to invoke static method optimizedPathFor on type "), e12);
        }
    }
}
