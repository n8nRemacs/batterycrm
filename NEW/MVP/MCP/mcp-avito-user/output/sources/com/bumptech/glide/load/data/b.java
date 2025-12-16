package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import j.N;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* loaded from: classes5.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final String f338849b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager f338850c;

    /* renamed from: d, reason: collision with root package name */
    public T f338851d;

    public b(AssetManager assetManager, String str) {
        this.f338850c = assetManager;
        this.f338849b = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t12 = this.f338851d;
        if (t12 == null) {
            return;
        }
        try {
            c(t12);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t12);

    @Override // com.bumptech.glide.load.data.d
    @N
    public final DataSource d() {
        return DataSource.f338827b;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(@N Priority priority, @N d.a<? super T> aVar) {
        try {
            T tF2 = f(this.f338850c, this.f338849b);
            this.f338851d = tF2;
            aVar.c(tF2);
        } catch (IOException e12) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.f(e12);
        }
    }

    public abstract T f(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
