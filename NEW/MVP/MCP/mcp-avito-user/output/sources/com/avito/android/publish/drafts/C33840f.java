package com.avito.android.publish.drafts;

import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DraftPhotosWiper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/drafts/f;", "Lcom/avito/android/publish/drafts/a;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.drafts.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33840f implements InterfaceC33835a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f235369a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_storage.i f235370b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f235371c;

    @Inject
    public C33840f(@Y61.k com.avito.android.photo_cache.b bVar, @Y61.k com.avito.android.photo_storage.i iVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f235369a = bVar;
        this.f235370b = iVar;
        this.f235371c = interfaceC35745a5;
    }

    @Override // com.avito.android.publish.drafts.InterfaceC33835a
    public final void a() {
        C42022u c42022uK = this.f235369a.e("publish").S().r(C33836b.f235336b).k(new C33837c(this));
        InterfaceC35745a5 interfaceC35745a5 = this.f235371c;
        c42022uK.z(interfaceC35745a5.a()).s(interfaceC35745a5.a()).x(C33838d.f235338b, C33839e.f235368b);
    }
}
