package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import j.N;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamAssetPathFetcher.java */
/* loaded from: classes5.dex */
public class n extends b<InputStream> {
    @Override // com.bumptech.glide.load.data.d
    @N
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.b
    public final void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.b
    public final InputStream f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
