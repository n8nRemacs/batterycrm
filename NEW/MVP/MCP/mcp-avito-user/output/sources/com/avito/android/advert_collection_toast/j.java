package com.avito.android.advert_collection_toast;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.View;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: AdvertCollectionToastView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_toast/j;", "", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f82410a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f82411b = f2.b(0, 1, null, 5);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f82412c = f2.b(0, 1, null, 5);

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e2 f82413d = f2.b(0, 1, null, 5);

    /* renamed from: e, reason: collision with root package name */
    public final Resources f82414e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.toast_bar.k f82415f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public ToastBarState f82416g;

    public j(@k View view) {
        this.f82410a = view;
        this.f82414e = view.getContext().getApplicationContext().getResources();
    }
}
