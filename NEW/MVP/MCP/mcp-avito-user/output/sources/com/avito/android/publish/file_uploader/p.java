package com.avito.android.publish.file_uploader;

import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: FileUploaderProgress.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/file_uploader/p;", "Lcom/avito/android/publish/file_uploader/o;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<Q<String, Float>> f235702a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f235703b;

    @Inject
    public p() {
        io.reactivex.rxjava3.subjects.e<Q<String, Float>> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f235702a = eVar;
        this.f235703b = new C41981q0(eVar);
    }

    @Override // com.avito.android.publish.file_uploader.o
    public final void a(float f12, @Y61.k String str) {
        this.f235702a.onNext(new Q<>(str, Float.valueOf(f12)));
    }

    @Override // com.avito.android.publish.file_uploader.o
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final C41981q0 getF235703b() {
        return this.f235703b;
    }
}
