package com.avito.android.photo_list_view;

import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImageListPhotoInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/q;", "Lcom/avito/android/photo_list_view/n;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_list_view.q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33223q implements InterfaceC33220n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f218178a;

    @Inject
    public C33223q(@Y61.k com.avito.android.photo_cache.b bVar) {
        this.f218178a = bVar;
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33220n
    @Y61.k
    public final B0 a(@Y61.k String str) {
        return this.f218178a.a(str).d0(C33221o.f218176b).d0(new C33222p(this));
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33220n
    public final void b(@Y61.k String str) {
        this.f218178a.b(str);
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33220n
    public final void c(int i12, int i13, @Y61.k String str) {
        this.f218178a.c(i12, i13, str);
    }
}
