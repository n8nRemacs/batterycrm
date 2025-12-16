package com.avito.android.publish.screen.step.params;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.avito.android.photo_list_view_group_selection.PhotoItemGroupSelectionParams;
import com.avito.android.photo_list_view_group_selection.PhotoItemGroupSelectionResult;
import i.AbstractC41201a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDetailsInternalRouter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/z;", "Li/a;", "Lcom/avito/android/photo_list_view_group_selection/PhotoItemGroupSelectionParams;", "Lcom/avito/android/photo_list_view_group_selection/PhotoItemGroupSelectionResult;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z extends AbstractC41201a<PhotoItemGroupSelectionParams, PhotoItemGroupSelectionResult> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f241714b;

    public z(y yVar) {
        this.f241714b = yVar;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, PhotoItemGroupSelectionParams photoItemGroupSelectionParams) {
        PhotoItemGroupSelectionParams photoItemGroupSelectionParams2 = photoItemGroupSelectionParams;
        com.avito.android.photo_list_view_group_selection.c cVar = this.f241714b.f241702y;
        if (cVar == null) {
            cVar = null;
        }
        return cVar.a(photoItemGroupSelectionParams2);
    }

    @Override // i.AbstractC41201a
    public final PhotoItemGroupSelectionResult parseResult(int i12, Intent intent) {
        if (intent != null) {
            return (PhotoItemGroupSelectionResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_selection_result", PhotoItemGroupSelectionResult.class) : intent.getParcelableExtra("key_selection_result"));
        }
        return null;
    }
}
