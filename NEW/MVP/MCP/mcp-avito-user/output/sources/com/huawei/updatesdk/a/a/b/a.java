package com.huawei.updatesdk.a.a.b;

import java.util.ArrayDeque;
import java.util.Queue;
import shark.AndroidResourceIdNames;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f363750b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Queue<byte[]> f363751a = new ArrayDeque(0);

    private a() {
    }

    public static a b() {
        return f363750b;
    }

    public void a(byte[] bArr) {
        if (bArr.length == 65536) {
            synchronized (this.f363751a) {
                try {
                    if (this.f363751a.size() < 32 && !this.f363751a.offer(bArr)) {
                        com.huawei.updatesdk.a.a.c.a.a.a.a("ByteArrayPool", "releaseBytes false");
                    }
                } finally {
                }
            }
        }
    }

    public byte[] a() {
        byte[] bArrPoll;
        synchronized (this.f363751a) {
            bArrPoll = this.f363751a.poll();
        }
        return bArrPoll == null ? new byte[AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR] : bArrPoll;
    }
}
