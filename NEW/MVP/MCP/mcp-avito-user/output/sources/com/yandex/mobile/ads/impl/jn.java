package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes8.dex */
public final class jn {
    public static void a(@j.P gn gnVar) {
        if (gnVar != null) {
            try {
                gnVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
