package ru.cyberity.ml.core;

import java.util.concurrent.ThreadFactory;
import ru.cyberity.ml.core.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class e implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f436196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f436197c;

    public /* synthetic */ e(b bVar, int i12) {
        this.f436196b = i12;
        this.f436197c = bVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f436196b) {
            case 0:
                return b.d.a(this.f436197c, runnable);
            default:
                return b.h.a(this.f436197c, runnable);
        }
    }
}
