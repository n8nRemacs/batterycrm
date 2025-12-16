package com.avito.android.messenger.util;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Murmurhash3.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/util/j;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public long f197439a;

    /* renamed from: b, reason: collision with root package name */
    public long f197440b;

    /* renamed from: c, reason: collision with root package name */
    public int f197441c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public byte[] f197442d = new byte[0];

    public static long a(int i12, byte[] bArr) {
        return ((bArr[i12 + 7] & 255) << 56) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48);
    }
}
