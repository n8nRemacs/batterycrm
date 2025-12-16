package com.google.firebase.installations;

import android.util.Base64;
import j.N;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: RandomFidGenerator.java */
/* loaded from: classes6.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f361682a = Byte.parseByte("01110000", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final byte f361683b = Byte.parseByte("00001111", 2);

    @N
    public static String a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b12 = bArrArray[0];
        bArrArray[16] = b12;
        bArrArray[0] = (byte) ((b12 & f361683b) | f361682a);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
