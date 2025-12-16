package com.avito.android.publish.slots.images_enhancement;

import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.r;

/* compiled from: ImagesEnhancementSlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", PhotoParameter.TYPE, "", "Lcom/avito/android/photo_cache/PhotoUpload;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class c<T> implements r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f244107b;

    public c(boolean z12) {
        this.f244107b = z12;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        List list = (List) obj;
        if (!list.isEmpty()) {
            List<PhotoUpload> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (PhotoUpload photoUpload : list2) {
                    if (photoUpload.f216309k == null || (this.f244107b && photoUpload.f216304f == null)) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
