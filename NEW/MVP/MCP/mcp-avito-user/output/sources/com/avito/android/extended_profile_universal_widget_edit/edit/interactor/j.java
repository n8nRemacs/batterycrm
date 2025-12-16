package com.avito.android.extended_profile_universal_widget_edit.edit.interactor;

import android.content.Context;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UniversalWidgetImageCropper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/interactor/j;", "", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f153919a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f153920b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SharedPhotosStorage f153921c;

    @Inject
    public j(@Y61.k Context context, @Y61.k R0 r02, @Y61.k SharedPhotosStorage sharedPhotosStorage) {
        this.f153919a = context;
        this.f153920b = r02;
        this.f153921c = sharedPhotosStorage;
    }
}
