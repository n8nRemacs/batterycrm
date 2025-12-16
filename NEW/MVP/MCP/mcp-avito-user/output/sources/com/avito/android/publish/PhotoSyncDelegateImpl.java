package com.avito.android.publish;

import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.InterfaceC41770c;
import io.reactivex.rxjava3.core.InterfaceC41772e;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.completable.C41816g;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: PhotoSyncDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/PhotoSyncDelegateImpl;", "Lcom/avito/android/publish/A;", "PhotoSyncException", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhotoSyncDelegateImpl implements A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_picker.c0 f231958a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final K f231959b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f231960c;

    /* compiled from: PhotoSyncDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/PhotoSyncDelegateImpl$PhotoSyncException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PhotoSyncException extends Exception {
    }

    public PhotoSyncDelegateImpl(@Y61.k com.avito.android.photo_picker.c0 c0Var, @Y61.k K k12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f231958a = c0Var;
        this.f231959b = k12;
        this.f231960c = interfaceC35745a5;
    }

    @Override // com.avito.android.publish.A
    @Y61.k
    public final C41816g a(@Y61.k final Y41.l lVar) {
        return new C41816g(new InterfaceC41772e() { // from class: com.avito.android.publish.B
            @Override // io.reactivex.rxjava3.core.InterfaceC41772e
            public final void e(InterfaceC41770c interfaceC41770c) {
                PhotoParameter photoParameter = new PhotoParameter("100004", "", null, null, Integer.MAX_VALUE, C42784z0.f406748b, null, false, false, null, null, null, null, 7108, null);
                D d12 = new D(photoParameter);
                final PhotoSyncDelegateImpl photoSyncDelegateImpl = this.f231839b;
                final io.reactivex.rxjava3.internal.observers.y yVar = (io.reactivex.rxjava3.internal.observers.y) new C41936b0(photoSyncDelegateImpl.f231959b.a(d12, true).j0(photoSyncDelegateImpl.f231960c.e()), new E(lVar, photoParameter)).y(200L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).v0(new F(interfaceC41770c, photoSyncDelegateImpl), new G(interfaceC41770c), io.reactivex.rxjava3.internal.functions.a.f401993c);
                interfaceC41770c.f(new l41.f() { // from class: com.avito.android.publish.C
                    @Override // l41.f
                    public final void cancel() {
                        io.reactivex.rxjava3.internal.observers.y yVar2 = photoSyncDelegateImpl.f231959b.f231921d;
                        if (yVar2 != null) {
                            DisposableHelper.a(yVar2);
                        }
                        DisposableHelper.a(yVar);
                    }
                });
            }
        });
    }
}
