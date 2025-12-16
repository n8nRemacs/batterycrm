package com.google.crypto.tink.subtle.prf;

import aZ0.j;
import com.google.crypto.tink.prf.Prf;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

@j
/* loaded from: classes6.dex */
public class PrfImpl implements Prf {
    private final StreamingPrf prfStreamer;

    private PrfImpl(StreamingPrf streamingPrf) {
        this.prfStreamer = streamingPrf;
    }

    private static byte[] readBytesFromStream(InputStream inputStream, int i12) throws GeneralSecurityException, IOException {
        try {
            byte[] bArr = new byte[i12];
            int i13 = 0;
            while (i13 < i12) {
                int i14 = inputStream.read(bArr, i13, i12 - i13);
                if (i14 <= 0) {
                    throw new GeneralSecurityException("Provided StreamingPrf terminated before providing requested number of bytes.");
                }
                i13 += i14;
            }
            return bArr;
        } catch (IOException e12) {
            throw new GeneralSecurityException(e12);
        }
    }

    public static PrfImpl wrap(StreamingPrf streamingPrf) {
        return new PrfImpl(streamingPrf);
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] bArr, int i12) throws GeneralSecurityException {
        if (bArr == null) {
            throw new GeneralSecurityException("Invalid input provided.");
        }
        if (i12 > 0) {
            return readBytesFromStream(this.prfStreamer.computePrf(bArr), i12);
        }
        throw new GeneralSecurityException("Invalid outputLength specified.");
    }
}
