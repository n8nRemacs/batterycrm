package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.w;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.m;
import j.N;
import java.io.File;
import java.io.IOException;

/* compiled from: GifDrawableEncoder.java */
/* loaded from: classes5.dex */
public class d implements m<c> {
    @Override // com.bumptech.glide.load.a
    public final boolean a(@N Object obj, @N File file, @N k kVar) throws Throwable {
        try {
            com.bumptech.glide.util.a.c(((c) ((w) obj).get()).b(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }

    @Override // com.bumptech.glide.load.m
    @N
    public final EncodeStrategy b(@N k kVar) {
        return EncodeStrategy.f338837b;
    }
}
