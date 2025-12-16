package com.avito.android.photo_list_view_group_selection;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhotoItemGroupSelectionIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/d;", "Lcom/avito/android/photo_list_view_group_selection/c;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f218385a;

    @Inject
    public d(@k Application application) {
        this.f218385a = application;
    }

    @Override // com.avito.android.photo_list_view_group_selection.c
    @k
    public final Intent a(@k PhotoItemGroupSelectionParams photoItemGroupSelectionParams) {
        Intent intent = new Intent(this.f218385a, (Class<?>) PhotoItemGroupSelectionActivity.class);
        intent.putExtra("key_selection_params", photoItemGroupSelectionParams);
        return intent;
    }
}
