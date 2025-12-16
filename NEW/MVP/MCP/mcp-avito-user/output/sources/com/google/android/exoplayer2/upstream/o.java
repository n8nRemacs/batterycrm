package com.google.android.exoplayer2.upstream;

import j.P;
import java.io.IOException;

/* compiled from: DataSourceUtil.java */
/* loaded from: classes6.dex */
public final class o {
    public static void a(@P InterfaceC36583m interfaceC36583m) {
        if (interfaceC36583m != null) {
            try {
                interfaceC36583m.close();
            } catch (IOException unused) {
            }
        }
    }
}
