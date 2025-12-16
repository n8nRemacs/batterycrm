package com.avito.android.publish.slots.images_enhancement;

import com.avito.android.photo_cache.PhotoUpload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ImagesEnhancementSlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "photosInDb", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f244108b;

    public d(e eVar) {
        this.f244108b = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (T t12 : list) {
            PhotoUpload photoUpload = (PhotoUpload) t12;
            if (L.f(photoUpload.f216304f, photoUpload.f216309k)) {
                arrayList.add(t12);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((PhotoUpload) it.next()).f216304f;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (T t13 : list) {
            PhotoUpload photoUpload2 = (PhotoUpload) t13;
            if (!L.f(photoUpload2.f216304f, photoUpload2.f216309k)) {
                arrayList3.add(t13);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            String str2 = ((PhotoUpload) it2.next()).f216304f;
            if (str2 != null) {
                arrayList4.add(str2);
            }
        }
        e eVar = this.f244108b;
        eVar.f244116i = arrayList4;
        eVar.f244117j = arrayList2;
    }
}
