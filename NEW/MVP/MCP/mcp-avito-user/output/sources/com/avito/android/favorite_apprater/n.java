package com.avito.android.favorite_apprater;

import android.content.SharedPreferences;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteAppRaterStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_apprater/n;", "Lcom/avito/android/favorite_apprater/j;", "_avito_favorite-apprater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f155282a;

    @Inject
    public n(@Y61.k AK0.l lVar) {
        this.f155282a = lVar;
    }

    @Override // com.avito.android.favorite_apprater.j
    public final void a(long j12) {
        SharedPreferences.Editor editorEdit = this.f155282a.getF316a().edit();
        a.f155262a.getClass();
        editorEdit.putLong(a.f155263b, j12).apply();
    }

    @Override // com.avito.android.favorite_apprater.j
    public final long b() {
        SharedPreferences f316a = this.f155282a.getF316a();
        a.f155262a.getClass();
        return f316a.getLong(a.f155263b, 0L);
    }
}
