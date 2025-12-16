package androidx.security.crypto;

import android.security.keystore.KeyGenParameterSpec;
import j.X;

/* compiled from: MasterKeys.java */
@X
@Deprecated
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f54464a;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        f54464a = new Object();
    }
}
