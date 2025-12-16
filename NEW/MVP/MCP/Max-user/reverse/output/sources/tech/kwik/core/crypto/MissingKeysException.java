package tech.kwik.core.crypto;

import defpackage.hf5;

/* loaded from: classes.dex */
public class MissingKeysException extends Exception {
    public final int a;

    public MissingKeysException(hf5 hf5Var, boolean z) {
        super("Missing keys for encryption level " + hf5Var + (z ? " (keys discarded)" : " (keys not installed)"));
        this.a = z ? 2 : 1;
    }
}
