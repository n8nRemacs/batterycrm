package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import j.N;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher.java */
/* loaded from: classes5.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f338872b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f338873c;

    /* renamed from: d, reason: collision with root package name */
    public T f338874d;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f338873c = contentResolver;
        this.f338872b = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t12 = this.f338874d;
        if (t12 != null) {
            try {
                c(t12);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t12);

    @Override // com.bumptech.glide.load.data.d
    @N
    public final DataSource d() {
        return DataSource.f338827b;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void e(@N Priority priority, @N d.a<? super T> aVar) {
        try {
            ?? r32 = (T) f(this.f338873c, this.f338872b);
            this.f338874d = r32;
            aVar.c(r32);
        } catch (FileNotFoundException e12) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.f(e12);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
