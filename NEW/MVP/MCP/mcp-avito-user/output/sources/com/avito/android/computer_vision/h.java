package com.avito.android.computer_vision;

import android.net.Uri;
import com.avito.android.remote.model.PublishSuggestsUploadPhotoResponse;
import kotlin.Metadata;
import kotlin.Q;
import l41.o;

/* compiled from: MultiUploadComputerVisionInteractor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/remote/model/PublishSuggestsUploadPhotoResponse;", "response", "Lkotlin/Q;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "", "apply", "(Lcom/avito/android/remote/model/PublishSuggestsUploadPhotoResponse;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f125473b;

    public h(Uri uri) {
        this.f125473b = uri;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new Q(this.f125473b, ((PublishSuggestsUploadPhotoResponse) obj).getId());
    }
}
