package com.yandex.mobile.ads.impl;

import com.adjust.sdk.network.ErrorCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes8.dex */
public class e10 extends hn {

    /* renamed from: c, reason: collision with root package name */
    public final int f384725c;

    public e10(int i12) {
        super(a(i12, 1));
        this.f384725c = 1;
    }

    private static int a(int i12, int i13) {
        if (i12 == 2000 && i13 == 1) {
            return 2001;
        }
        return i12;
    }

    public static e10 a(IOException iOException, int i12) {
        String message = iOException.getMessage();
        int i13 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? ErrorCodes.PROTOCOL_EXCEPTION : (message == null || !bb.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i13 == 2007 ? new d10(iOException) : new e10(iOException, i13, i12);
    }

    public e10(String str, int i12) {
        super(a(i12, 1), str);
        this.f384725c = 1;
    }

    public e10(IOException iOException, int i12, int i13) {
        super(iOException, a(i12, i13));
        this.f384725c = i13;
    }

    public e10(String str, @j.P IOException iOException, int i12) {
        super(a(i12, 1), str, iOException);
        this.f384725c = 1;
    }
}
