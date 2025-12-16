package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.File;

/* compiled from: FileSerializer.java */
/* renamed from: com.fasterxml.jackson.databind.ser.std.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36489o extends L<File> {
    public C36489o() {
        super(File.class);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        jsonGenerator.i0(((File) obj).getAbsolutePath());
    }
}
