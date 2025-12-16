package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class b20 extends b41 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f383761c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f383762a = oi.f388554c.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f383763b = oi.f388553b.newDecoder();

    @Override // com.yandex.mobile.ads.impl.b41
    public final Metadata a(hg0 hg0Var, ByteBuffer byteBuffer) {
        String string;
        String str = null;
        try {
            string = this.f383762a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                string = this.f383763b.decode(byteBuffer).toString();
                this.f383763b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f383763b.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th2) {
                this.f383763b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            this.f383762a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f383761c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strB = bb.b(strGroup);
                strB.getClass();
                if (strB.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strB.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
