package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CLSUUID.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C37585g {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicLong f360972a = new AtomicLong(0);

    /* renamed from: b, reason: collision with root package name */
    public static String f360973b;

    public C37585g(Q q12) throws NoSuchAlgorithmException {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b12 = bArrArray[0];
        byte b13 = bArrArray[1];
        byte b14 = bArrArray[2];
        byte b15 = bArrArray[3];
        byte[] bArrA = a(time % 1000);
        byte b16 = bArrA[0];
        byte b17 = bArrA[1];
        byte[] bArrA2 = a(f360972a.incrementAndGet());
        byte b18 = bArrA2[0];
        byte b19 = bArrA2[1];
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {b12, b13, b14, b15, b16, b17, b18, b19, bArrA3[0], bArrA3[1]};
        String strJ = C37586h.j(q12.c());
        String strG = C37586h.g(bArr);
        Locale locale = Locale.US;
        f360973b = String.format(locale, "%s%s%s%s", strG.substring(0, 12), strG.substring(12, 16), strG.subSequence(16, 20), strJ.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j12) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j12);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return f360973b;
    }
}
