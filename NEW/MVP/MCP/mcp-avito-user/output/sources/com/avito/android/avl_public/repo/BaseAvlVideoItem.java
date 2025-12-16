package com.avito.android.avl_public.repo;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: AvlRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/avl_public/repo/BaseAvlVideoItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_avl_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BaseAvlVideoItem extends com.avito.conveyor_item.a, Parcelable {

    /* compiled from: AvlRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @l
    String F5();

    @l
    String getItemId();

    @l
    String getPreviewUrl();

    @l
    Image getThumbnail();

    @l
    String getVideoUrl();

    @l
    String getXHash();

    boolean o1(@k com.avito.conveyor_item.a aVar);
}
