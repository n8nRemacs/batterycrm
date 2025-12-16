package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.LruCache;
import j.N;
import j.P;

/* compiled from: LruCache.java */
/* loaded from: classes7.dex */
public final class r implements InterfaceC37868e {

    /* renamed from: a, reason: collision with root package name */
    public final LruCache<String, a> f366450a;

    /* compiled from: LruCache.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f366451a;

        /* renamed from: b, reason: collision with root package name */
        public final int f366452b;

        public a(Bitmap bitmap, int i12) {
            this.f366451a = bitmap;
            this.f366452b = i12;
        }
    }

    public r(@N Context context) {
        StringBuilder sb2 = K.f366360a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f366450a = new q((int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 7));
    }

    @P
    public final Bitmap a(@N String str) {
        a aVar = this.f366450a.get(str);
        if (aVar != null) {
            return aVar.f366451a;
        }
        return null;
    }
}
