package com.avito.android.image.enhancement;

import android.net.Uri;
import com.avito.android.photo_cache.EnhanceState;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ImageEnhanceViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", PhotoParameter.TYPE, "Lio/reactivex/rxjava3/core/O;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class y<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f169439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C30979j f169440c;

    public y(HashMap map, C30979j c30979j) {
        this.f169439b = map;
        this.f169440c = c30979j;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        HashMap map;
        Uri uri;
        io.reactivex.rxjava3.core.O oQ2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = ((List) obj).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f169439b;
            if (!zHasNext) {
                break;
            }
            T next = it.next();
            PhotoUpload photoUpload = (PhotoUpload) next;
            Boolean bool = (Boolean) map.get(photoUpload.f216304f);
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                EnhanceState enhanceState = photoUpload.f216311m;
                if (zBooleanValue != enhanceState.f216292b && enhanceState != EnhanceState.f216289e) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            PhotoUpload photoUpload2 = (PhotoUpload) it2.next();
            String str = photoUpload2.f216304f;
            if (str == null) {
                oQ2 = io.reactivex.rxjava3.core.I.q(photoUpload2);
            } else {
                Uri uri2 = photoUpload2.f216305g;
                if (uri2 == null) {
                    uri = photoUpload2.f216308j;
                    if (uri == null) {
                        oQ2 = io.reactivex.rxjava3.core.I.q(photoUpload2);
                    }
                } else {
                    uri = uri2;
                }
                Boolean bool2 = (Boolean) map.get(str);
                if (bool2 != null) {
                    boolean zBooleanValue2 = bool2.booleanValue();
                    if (zBooleanValue2 == photoUpload2.f216311m.f216292b) {
                        oQ2 = io.reactivex.rxjava3.core.I.q(photoUpload2);
                    } else {
                        C30979j c30979j = this.f169440c;
                        if (zBooleanValue2) {
                            oQ2 = c30979j.f169380c.d(uri, str).r(new x(str, c30979j, photoUpload2));
                        } else {
                            String str2 = photoUpload2.f216309k;
                            if (str2 != null) {
                                c30979j.f169380c.b(str2, str);
                            }
                            Uri uri3 = photoUpload2.f216310l;
                            if (uri3 == null) {
                                uri3 = uri2;
                            }
                            oQ2 = io.reactivex.rxjava3.core.I.q(PhotoUpload.a(photoUpload2, str2 == null ? str : str2, uri3, null, null, null, EnhanceState.f216287c, 1999));
                        }
                    }
                } else {
                    oQ2 = io.reactivex.rxjava3.core.I.q(photoUpload2);
                }
            }
            arrayList2.add(oQ2);
        }
        return io.reactivex.rxjava3.core.I.H(arrayList2, w.f169435b);
    }
}
