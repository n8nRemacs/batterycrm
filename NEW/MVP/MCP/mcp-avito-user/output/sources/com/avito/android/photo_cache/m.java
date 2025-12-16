package com.avito.android.photo_cache;

import com.avito.android.photo_cache.q;
import com.avito.android.remote.model.CloseableDataSource;
import com.avito.android.remote.model.ErrorType;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageUploadPending;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.util.Y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UploadingProgressInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/CloseableDataSource;", "Lcom/avito/android/photo_cache/PhotoUpload;", "images", "Lcom/avito/android/photo_cache/q;", "apply", "(Lcom/avito/android/remote/model/CloseableDataSource;)Lcom/avito/android/photo_cache/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final m<T, R> f216333b = new m<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        boolean z12;
        List listB0 = C42745f0.B0(Y.a((CloseableDataSource) obj), new l());
        List<PhotoUpload> list = listB0;
        boolean z13 = list instanceof Collection;
        boolean z14 = false;
        if (z13 && list.isEmpty()) {
            z12 = true;
        } else {
            for (PhotoUpload photoUpload : list) {
                String str = photoUpload.f216304f;
                if (str == null || str.length() == 0) {
                    if (L.f(photoUpload.f216307i, ErrorType.NoError.INSTANCE)) {
                        z12 = false;
                        break;
                    }
                }
            }
            z12 = true;
        }
        if (!z13 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!L.f(((PhotoUpload) it.next()).f216307i, ErrorType.NoError.INSTANCE)) {
                    z14 = true;
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (T t12 : list) {
            PhotoUpload photoUpload2 = (PhotoUpload) t12;
            String str2 = photoUpload2.f216304f;
            if (str2 != null && str2.length() != 0) {
                if (L.f(photoUpload2.f216307i, ErrorType.NoError.INSTANCE)) {
                    arrayList.add(t12);
                }
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (T t13 : list) {
            if (L.f(((PhotoUpload) t13).f216307i, ErrorType.NoError.INSTANCE)) {
                arrayList2.add(t13);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            PhotoUpload photoUpload3 = (PhotoUpload) it2.next();
            String str3 = photoUpload3.f216304f;
            long j12 = photoUpload3.f216300b;
            arrayList3.add(str3 == null ? new ImageUploadPending(j12) : new ImageUploadResult(str3, new Image(P0.c()), String.valueOf(j12)));
        }
        return !z12 ? new q.d(size, listB0.size(), arrayList3) : z14 ? new q.a(com.avito.android.remote.error.j.a(1, null, new Exception())) : new q.c(arrayList3);
    }
}
