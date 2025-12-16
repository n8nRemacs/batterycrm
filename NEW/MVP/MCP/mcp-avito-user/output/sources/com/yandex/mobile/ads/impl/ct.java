package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class ct {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f384450a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f384451b;

    public ct() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f384450a = byteArrayOutputStream;
        this.f384451b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] a(EventMessage eventMessage) throws IOException {
        this.f384450a.reset();
        try {
            DataOutputStream dataOutputStream = this.f384451b;
            dataOutputStream.writeBytes(eventMessage.f382954a);
            dataOutputStream.writeByte(0);
            String str = eventMessage.f382955b;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f384451b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            this.f384451b.writeLong(eventMessage.f382956c);
            this.f384451b.writeLong(eventMessage.f382957d);
            this.f384451b.write(eventMessage.f382958e);
            this.f384451b.flush();
            return this.f384450a.toByteArray();
        } catch (IOException e12) {
            throw new RuntimeException(e12);
        }
    }
}
