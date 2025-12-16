package yM0;

import android.app.DownloadManager;
import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideDownloadManagerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: yM0.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50139h implements dagger.internal.h<DownloadManager> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f443060a;

    public C50139h(C30102l3 c30102l3) {
        this.f443060a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f443060a.get();
        C50134c.f443050a.getClass();
        return (DownloadManager) androidx.core.content.d.getSystemService(context, DownloadManager.class);
    }
}
