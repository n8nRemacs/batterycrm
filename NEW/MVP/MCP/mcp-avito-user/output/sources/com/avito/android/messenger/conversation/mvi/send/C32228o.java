package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.remote.model.CloseableDataSource;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import io.reactivex.rxjava3.internal.operators.observable.H1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: PhotoPickerResultHandler.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/o;", "Lcom/avito/android/messenger/conversation/mvi/send/j;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.send.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32228o implements InterfaceC32218j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f194534a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32200a f194535b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SharedPhotosStorage f194536c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f194537d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f194538e;

    @Inject
    public C32228o(@Y61.k com.avito.android.photo_cache.b bVar, @Y61.k InterfaceC32200a interfaceC32200a, @Y61.k SharedPhotosStorage sharedPhotosStorage, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f194534a = bVar;
        this.f194535b = interfaceC32200a;
        this.f194536c = sharedPhotosStorage;
        this.f194537d = interfaceC35745a5;
        this.f194538e = interfaceC28373a;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32218j
    @Y61.k
    public final H1 a(@Y61.k String str) {
        io.reactivex.rxjava3.core.z<CloseableDataSource<? extends PhotoUpload>> zVarA = this.f194534a.a(str);
        InterfaceC35745a5 interfaceC35745a5 = this.f194537d;
        return com.avito.android.util.rx3.arrow.b.a(new C41936b0(zVarA.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.c()).d0(C32220k.f194525b).P(C42784z0.f406748b).k(new C32222l(this)).p(C32224m.f194529b), new C32226n(this, str)).j0(interfaceC35745a5.c())).H0();
    }
}
