package com.avito.android.image.enhancement;

import com.avito.android.photo_cache.EnhanceState;
import com.avito.android.photo_cache.PhotoUpload;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ImageEnhanceViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "photosInDb", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class u extends kotlin.jvm.internal.N implements Y41.l<List<? extends PhotoUpload>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f169432l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C30979j f169433m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(LinkedHashSet linkedHashSet, C30979j c30979j) {
        super(1);
        this.f169432l = linkedHashSet;
        this.f169433m = c30979j;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends PhotoUpload> list) {
        for (PhotoUpload photoUpload : list) {
            if (C42745f0.r(this.f169432l, photoUpload.f216305g)) {
                PhotoUpload photoUploadA = PhotoUpload.a(photoUpload, null, null, null, null, null, EnhanceState.f216289e, 2047);
                C30979j c30979j = this.f169433m;
                c30979j.f169381d.h(c30979j.f169379b, photoUploadA);
            }
        }
        return G0.f406611a;
    }
}
