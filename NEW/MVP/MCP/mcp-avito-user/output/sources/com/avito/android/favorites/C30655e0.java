package com.avito.android.favorites;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteListResourceProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/e0;", "Lcom/avito/android/favorites/d0;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorites.e0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30655e0 implements InterfaceC30610d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f157363a;

    @Inject
    public C30655e0(@Y61.k Resources resources) {
        this.f157363a = resources;
    }

    @Override // com.avito.android.favorites.InterfaceC30610d0
    @Y61.k
    public final String f() {
        return this.f157363a.getString(R.string.location_not_found_error);
    }
}
