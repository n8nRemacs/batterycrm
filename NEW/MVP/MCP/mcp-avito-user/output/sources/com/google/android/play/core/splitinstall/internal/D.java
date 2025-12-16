package com.google.android.play.core.splitinstall.internal;

import java.io.File;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class D implements r {
    @Override // com.google.android.play.core.splitinstall.internal.r
    public final boolean a(Object obj, File file, File file2) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("dalvik.system.DexFile");
            try {
                return !((Boolean) Boolean.class.cast(K.e(cls, "isDexOptNeeded", String.class).invoke(null, file.getPath()))).booleanValue();
            } catch (Exception e12) {
                throw new zzbl("Failed to invoke static method isDexOptNeeded on type " + cls, e12);
            }
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
