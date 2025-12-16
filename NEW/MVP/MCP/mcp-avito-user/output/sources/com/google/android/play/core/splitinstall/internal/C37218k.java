package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.internal.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37218k implements com.google.android.play.core.splitinstall.W {

    /* renamed from: a, reason: collision with root package name */
    public final Context f358776a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.play.core.splitcompat.g f358777b;

    /* renamed from: c, reason: collision with root package name */
    public final C37220m f358778c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f358779d;

    public C37218k(Context context, ThreadPoolExecutor threadPoolExecutor, C37220m c37220m, com.google.android.play.core.splitcompat.g gVar) {
        this.f358776a = context;
        this.f358777b = gVar;
        this.f358778c = c37220m;
        this.f358779d = threadPoolExecutor;
    }

    @Override // com.google.android.play.core.splitinstall.W
    public final void a(List list, com.google.android.play.core.splitinstall.U u12) {
        if (com.google.android.play.core.splitcompat.a.f358652e.get() == null) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f358779d.execute(new RunnableC37217j(this, list, u12));
    }
}
