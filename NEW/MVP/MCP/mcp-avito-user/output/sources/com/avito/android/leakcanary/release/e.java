package com.avito.android.leakcanary.release;

import android.app.Application;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReleaseLeakCanaryInitializer.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class e extends N implements Y41.a<File> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Application f175079l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Application application) {
        super(0);
        this.f175079l = application;
    }

    @Override // Y41.a
    public final File invoke() {
        return this.f175079l.getCacheDir();
    }
}
