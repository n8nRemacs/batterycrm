package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ImageGroupResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/ImageGroupResponse;", "", "imageId", "", "groupId", "(Ljava/lang/String;Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getImageId", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ImageGroupResponse {

    @c("groupId")
    @k
    private final String groupId;

    @c("imageId")
    @k
    private final String imageId;

    public ImageGroupResponse(@k String str, @k String str2) {
        this.imageId = str;
        this.groupId = str2;
    }

    @k
    public final String getGroupId() {
        return this.groupId;
    }

    @k
    public final String getImageId() {
        return this.imageId;
    }
}
