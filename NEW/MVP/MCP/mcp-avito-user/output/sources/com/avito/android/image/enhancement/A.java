package com.avito.android.image.enhancement;

import com.avito.android.photo_cache.PhotoUpload;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImageEnhanceViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "updatedPhotos", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class A<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30979j f169329b;

    public A(C30979j c30979j) {
        this.f169329b = c30979j;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str;
        Y41.a<G0> aVar;
        List list = (List) obj;
        C30979j c30979j = this.f169329b;
        C30977h c30977h = c30979j.f169385h;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            str = c30979j.f169379b;
            if (!zHasNext) {
                break;
            } else {
                c30979j.f169381d.h(str, (PhotoUpload) it.next());
            }
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((PhotoUpload) it2.next()).f216311m.f216292b) {
                    if (c30977h != null) {
                        c30979j.f169380c.f(str, new z(c30977h));
                    }
                }
            }
        }
        if (list.isEmpty() || (aVar = c30979j.f169382e) == null) {
            return;
        }
        aVar.invoke();
    }
}
