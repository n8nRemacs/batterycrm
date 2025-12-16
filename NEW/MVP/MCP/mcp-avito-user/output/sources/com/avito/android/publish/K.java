package com.avito.android.publish;

import Zd0.InterfaceC19543a;
import com.avito.android.publish.PhotoUploadObserver;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhotoUploadObserver.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/K;", "Lcom/avito/android/publish/PhotoUploadObserver;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class K implements PhotoUploadObserver {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.j f231918a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f231919b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19543a f231920c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f231921d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<PhotoUploadObserver.UploadStatus> f231922e = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public K(@Y61.k com.avito.android.photo_cache.j jVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC19543a interfaceC19543a) {
        this.f231918a = jVar;
        this.f231919b = interfaceC35745a5;
        this.f231920c = interfaceC19543a;
    }

    @Override // com.avito.android.publish.PhotoUploadObserver
    @Y61.k
    public final com.jakewharton.rxrelay3.c a(@Y61.k PhotoUploadObserver.b bVar, boolean z12) {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f231921d;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        C41982q1 c41982q1B = this.f231918a.b();
        InterfaceC35745a5 interfaceC35745a5 = this.f231919b;
        this.f231921d = A1.h(c41982q1B.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()), new I(z12, this), new J(this, bVar, z12), 2);
        return this.f231922e;
    }
}
