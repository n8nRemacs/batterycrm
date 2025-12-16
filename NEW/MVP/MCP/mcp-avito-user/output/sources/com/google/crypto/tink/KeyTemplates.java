package com.google.crypto.tink;

import androidx.camera.camera2.internal.G;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class KeyTemplates {
    private KeyTemplates() {
    }

    public static KeyTemplate get(String str) {
        KeyTemplate keyTemplate = Registry.keyTemplateMap().get(str);
        if (keyTemplate != null) {
            return keyTemplate;
        }
        throw new GeneralSecurityException(G.f("cannot find key template: ", str));
    }
}
