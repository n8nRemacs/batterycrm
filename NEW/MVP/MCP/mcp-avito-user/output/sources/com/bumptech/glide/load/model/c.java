package com.bumptech.glide.load.model;

import android.util.Log;
import j.N;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferEncoder.java */
/* loaded from: classes5.dex */
public class c implements com.bumptech.glide.load.a<ByteBuffer> {
    @Override // com.bumptech.glide.load.a
    public final boolean a(@N ByteBuffer byteBuffer, @N File file, @N com.bumptech.glide.load.k kVar) throws Throwable {
        try {
            com.bumptech.glide.util.a.c(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
