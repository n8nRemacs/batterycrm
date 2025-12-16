package com.iab.omid.library.corpmailru.b;

import android.support.annotation.Nullable;
import android.view.View;
import com.iab.omid.library.corpmailru.adsession.FriendlyObstructionPurpose;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.corpmailru.e.a f363975a;

    /* renamed from: b, reason: collision with root package name */
    private final String f363976b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f363977c;

    /* renamed from: d, reason: collision with root package name */
    private final String f363978d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f363975a = new com.iab.omid.library.corpmailru.e.a(view);
        this.f363976b = view.getClass().getCanonicalName();
        this.f363977c = friendlyObstructionPurpose;
        this.f363978d = str;
    }

    public com.iab.omid.library.corpmailru.e.a a() {
        return this.f363975a;
    }

    public String b() {
        return this.f363976b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f363977c;
    }

    public String d() {
        return this.f363978d;
    }
}
