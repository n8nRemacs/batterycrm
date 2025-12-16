package com.avito.android.publish.infomodel_request;

import com.avito.android.remote.model.ItemBrief;
import kotlin.Metadata;

/* compiled from: InfomodelRequestViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/Navigation;", "it", "Lcom/avito/android/remote/model/ItemBrief;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final n<T, R> f236174b = new n<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((ItemBrief) obj).getNavigation();
    }
}
