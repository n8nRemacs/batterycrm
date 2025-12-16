package com.avito.android.category;

import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.category.CategoryActivity;
import com.avito.android.remote.model.Location;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/n;", "Lcom/avito/android/category/m;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f116721a;

    @Inject
    public n(@Y61.k Application application) {
        this.f116721a = application;
    }

    @Override // com.avito.android.category.m
    @Y61.k
    public final Intent a(@Y61.l Location location, @Y61.l String str) {
        new CategoryActivity.a();
        return new Intent(this.f116721a, (Class<?>) CategoryActivity.class).putExtra("arguments", new CategoryArguments(location, null, str));
    }
}
