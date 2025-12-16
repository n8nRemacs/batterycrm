package com.google.crypto.tink.tinkkey;

import aZ0.j;
import com.google.crypto.tink.KeyTemplate;

@j
@Deprecated
/* loaded from: classes6.dex */
public interface TinkKey {
    KeyTemplate getKeyTemplate();

    boolean hasSecret();
}
