package com.bumptech.glide.load.model.stream;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import j.N;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: HttpUriLoader.java */
/* loaded from: classes5.dex */
public class c implements n<Uri, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f339274b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Constants.SCHEME)));

    /* renamed from: a, reason: collision with root package name */
    public final n<com.bumptech.glide.load.model.g, InputStream> f339275a;

    /* compiled from: HttpUriLoader.java */
    public static class a implements o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Uri, InputStream> b(r rVar) {
            return new c(rVar.b(com.bumptech.glide.load.model.g.class, InputStream.class));
        }
    }

    public c(n<com.bumptech.glide.load.model.g, InputStream> nVar) {
        this.f339275a = nVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public final n.a<InputStream> a(@N Uri uri, int i12, int i13, @N k kVar) {
        return this.f339275a.a(new com.bumptech.glide.load.model.g(uri.toString()), i12, i13, kVar);
    }

    @Override // com.bumptech.glide.load.model.n
    public final boolean b(@N Uri uri) {
        return f339274b.contains(uri.getScheme());
    }
}
