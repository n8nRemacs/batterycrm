package com.avito.android.advert;

import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: AdvertDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "it", "Lcom/avito/android/remote/model/Location;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28237q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C28237q<T, R> f80960b = new C28237q<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return Collections.singletonMap(SearchParamsConverterKt.LOCATION_ID, ((Location) obj).getId());
    }
}
