package com.google.android.play.core.splitcompat;

import java.io.File;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class i implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f358663a;

    public i(j jVar) {
        this.f358663a = jVar;
    }

    @Override // com.google.android.play.core.splitcompat.n
    public final void a(o oVar, File file, boolean z12) {
        j jVar = this.f358663a;
        jVar.f358665b.add(file);
        if (z12) {
            return;
        }
        jVar.f358666c.set(false);
    }
}
