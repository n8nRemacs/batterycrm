package com.google.crypto.tink;

import I41.h;
import aZ0.j;
import com.google.crypto.tink.annotations.Alpha;

@Alpha
@j
/* loaded from: classes6.dex */
public abstract class Key {
    public abstract boolean equalsKey(Key key);

    @h
    public abstract Integer getIdRequirementOrNull();

    public abstract Parameters getParameters();
}
