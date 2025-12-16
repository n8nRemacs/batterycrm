package androidx.media3.common.util;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class L implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47886b;

    public /* synthetic */ L(String str) {
        this.f47886b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i12 = M.f47887a;
        return new Thread(runnable, this.f47886b);
    }
}
