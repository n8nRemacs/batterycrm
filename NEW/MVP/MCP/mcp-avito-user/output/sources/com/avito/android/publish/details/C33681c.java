package com.avito.android.publish.details;

import android.net.Uri;
import android.os.Parcelable;
import com.avito.android.photo_cache.EnhanceState;
import com.avito.android.photo_cache.PhotoSource;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;

/* compiled from: PhotoInteractorWrapper.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/c;", "Lcom/avito/android/publish/details/d0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33681c implements InterfaceC33685d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f233578a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f233579b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.L0 f233580c;

    public C33681c(@Y61.k String str, @Y61.k com.avito.android.photo_cache.b bVar, @Y61.k com.avito.android.util.L0 l02) {
        this.f233578a = str;
        this.f233579b = bVar;
        this.f233580c = l02;
    }

    @Override // com.avito.android.publish.details.InterfaceC33685d0
    public final void a() {
        this.f233579b.d("publish");
    }

    @Override // com.avito.android.publish.details.InterfaceC33685d0
    public final void b(int i12, @Y61.k Image image, @Y61.k String str) {
        com.avito.android.util.L0 l02 = this.f233580c;
        Uri uriB = C35829k2.b(image, l02.c(), l02.d(), 10.0f, 0, 52).b();
        if (uriB == null) {
            return;
        }
        Parcelable.Creator<PhotoSource> creator = PhotoSource.CREATOR;
        this.f233579b.i("publish", this.f233578a, str, i12, 0, uriB, (384 & 64) != 0 ? null : null, (384 & 512) != 0 ? EnhanceState.f216287c : null);
    }
}
