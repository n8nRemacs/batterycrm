package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* compiled from: DrawableCrossFadeFactory.java */
/* loaded from: classes5.dex */
public class c implements g<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    public d f339623a;

    /* compiled from: DrawableCrossFadeFactory.java */
    public static class a {
    }

    @Override // com.bumptech.glide.request.transition.g
    public final f<Drawable> a(DataSource dataSource, boolean z12) {
        if (dataSource == DataSource.f338831f) {
            return e.f339624a;
        }
        if (this.f339623a == null) {
            this.f339623a = new d();
        }
        return this.f339623a;
    }
}
