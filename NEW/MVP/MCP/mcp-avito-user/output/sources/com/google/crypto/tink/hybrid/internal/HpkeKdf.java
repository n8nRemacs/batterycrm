package com.google.crypto.tink.hybrid.internal;

import aZ0.j;

@j
/* loaded from: classes6.dex */
interface HpkeKdf {
    byte[] extractAndExpand(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i12);

    byte[] getKdfId();

    byte[] labeledExpand(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i12);

    byte[] labeledExtract(byte[] bArr, byte[] bArr2, String str, byte[] bArr3);
}
