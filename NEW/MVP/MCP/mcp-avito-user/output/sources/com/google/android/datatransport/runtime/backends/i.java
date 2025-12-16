package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import javax.inject.Inject;

/* compiled from: CreationContextFactory.java */
/* loaded from: classes10.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f343100a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.a f343101b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.a f343102c;

    @Inject
    public i(Context context, @com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2) {
        this.f343100a = context;
        this.f343101b = aVar;
        this.f343102c = aVar2;
    }
}
