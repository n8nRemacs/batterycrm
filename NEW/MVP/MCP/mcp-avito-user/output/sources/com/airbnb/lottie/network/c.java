package com.airbnb.lottie.network;

import j.N;
import j.P;
import java.io.Closeable;
import java.io.InputStream;

/* compiled from: LottieFetchResult.java */
/* loaded from: classes10.dex */
public interface c extends Closeable {
    @P
    String a2();

    @N
    InputStream f2();

    boolean isSuccessful();

    @P
    String v4();
}
