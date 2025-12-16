package com.avito.android.image.enhancement;

import com.avito.android.photo_cache.PhotoUpload;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImageEnhanceViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "photosInDb", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class P extends kotlin.jvm.internal.N implements Y41.l<List<? extends PhotoUpload>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30979j f169349l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(C30979j c30979j) {
        super(1);
        this.f169349l = c30979j;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(java.util.List<? extends com.avito.android.photo_cache.PhotoUpload> r4) {
        /*
            r3 = this;
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 0
            com.avito.android.image.enhancement.j r2 = r3.f169349l
            if (r0 == 0) goto L15
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            goto L34
        L15:
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r4.next()
            com.avito.android.photo_cache.PhotoUpload r0 = (com.avito.android.photo_cache.PhotoUpload) r0
            com.avito.android.photo_cache.EnhanceState r0 = r0.f216311m
            boolean r0 = r0.f216292b
            if (r0 == 0) goto L19
            com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlotConfig r4 = r2.f169386i
            if (r4 == 0) goto L3c
            java.lang.String r1 = r4.getNextButtonTitle()
            goto L3c
        L34:
            com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlotConfig r4 = r2.f169386i
            if (r4 == 0) goto L3c
            java.lang.String r1 = r4.getNextButtonTitleNoEnhancement()
        L3c:
            if (r1 == 0) goto L4a
            boolean r4 = kotlin.text.C43066x.K(r1)
            if (r4 == 0) goto L45
            goto L4a
        L45:
            io.reactivex.rxjava3.subjects.b<java.lang.String> r4 = r2.f169389l
            r4.onNext(r1)
        L4a:
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.image.enhancement.P.invoke(java.lang.Object):java.lang.Object");
    }
}
