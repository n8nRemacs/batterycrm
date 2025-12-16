package com.fasterxml.jackson.core.util;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: BufferRecycler.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f341277c = {JosStatusCodes.RTN_CODE_COMMON_ERROR, JosStatusCodes.RTN_CODE_COMMON_ERROR, 2000, 2000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f341278d = {4000, 4000, 200, 200};

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<byte[]> f341279a = new AtomicReferenceArray<>(4);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceArray<char[]> f341280b = new AtomicReferenceArray<>(4);

    public final byte[] a(int i12) {
        int i13 = f341277c[i12];
        if (i13 <= 0) {
            i13 = 0;
        }
        byte[] andSet = this.f341279a.getAndSet(i12, null);
        return (andSet == null || andSet.length < i13) ? new byte[i13] : andSet;
    }

    public final char[] b(int i12, int i13) {
        int i14 = f341278d[i12];
        if (i13 < i14) {
            i13 = i14;
        }
        char[] andSet = this.f341280b.getAndSet(i12, null);
        return (andSet == null || andSet.length < i13) ? new char[i13] : andSet;
    }
}
