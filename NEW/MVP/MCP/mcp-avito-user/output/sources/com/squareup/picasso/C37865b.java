package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.C;
import com.squareup.picasso.Picasso;
import okio.M;

/* compiled from: AssetRequestHandler.java */
/* renamed from: com.squareup.picasso.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C37865b extends C {

    /* renamed from: a, reason: collision with root package name */
    public final Context f366401a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f366402b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public AssetManager f366403c;

    public C37865b(Context context) {
        this.f366401a = context;
    }

    @Override // com.squareup.picasso.C
    public final boolean b(A a12) {
        Uri uri = a12.f366289a;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.C
    public final C.a e(A a12, int i12) {
        if (this.f366403c == null) {
            synchronized (this.f366402b) {
                try {
                    if (this.f366403c == null) {
                        this.f366403c = this.f366401a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new C.a(M.g(this.f366403c.open(a12.f366289a.toString().substring(22))), Picasso.LoadedFrom.DISK);
    }
}
