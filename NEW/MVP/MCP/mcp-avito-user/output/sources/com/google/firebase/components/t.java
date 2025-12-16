package com.google.firebase.components;

import aZ0.InterfaceC19845a;

/* compiled from: Preconditions.java */
/* loaded from: classes13.dex */
public final class t {
    @InterfaceC19845a
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
