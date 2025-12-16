package com.bumptech.glide.load.model;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.bumptech.glide.load.model.n;
import j.N;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UrlUriLoader.java */
/* loaded from: classes5.dex */
public class x<Data> implements n<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f339308b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Constants.SCHEME)));

    /* renamed from: a, reason: collision with root package name */
    public final n<g, Data> f339309a;

    /* compiled from: UrlUriLoader.java */
    public static class a implements o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Uri, InputStream> b(r rVar) {
            return new x(rVar.b(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.f339309a = nVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a a(@N Uri uri, int i12, int i13, @N com.bumptech.glide.load.k kVar) {
        return this.f339309a.a(new g(uri.toString()), i12, i13, kVar);
    }

    @Override // com.bumptech.glide.load.model.n
    public final boolean b(@N Uri uri) {
        return f339308b.contains(uri.getScheme());
    }
}
