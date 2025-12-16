package com.facebook.common.util;

import java.io.ByteArrayOutputStream;

/* compiled from: StreamUtil.java */
/* loaded from: classes5.dex */
final class e extends ByteArrayOutputStream {
    @Override // java.io.ByteArrayOutputStream
    public final byte[] toByteArray() {
        int i12 = ((ByteArrayOutputStream) this).count;
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        return i12 == bArr.length ? bArr : super.toByteArray();
    }
}
