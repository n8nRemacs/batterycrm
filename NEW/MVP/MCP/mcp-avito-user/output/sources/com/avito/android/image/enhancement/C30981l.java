package com.avito.android.image.enhancement;

import com.avito.android.photo_cache.EnhanceState;
import com.avito.android.photo_cache.PhotoUpload;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImageEnhanceViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "updatedPhotos", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.image.enhancement.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30981l extends kotlin.jvm.internal.N implements Y41.l<List<? extends PhotoUpload>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30979j f169418l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C30977h f169419m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30981l(C30977h c30977h, C30979j c30979j) {
        super(1);
        this.f169418l = c30979j;
        this.f169419m = c30977h;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends PhotoUpload> list) {
        C30979j c30979j;
        List<? extends PhotoUpload> list2 = list;
        Iterator<? extends PhotoUpload> it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c30979j = this.f169418l;
            if (!zHasNext) {
                break;
            }
            c30979j.f169381d.h(c30979j.f169379b, it.next());
        }
        List<? extends PhotoUpload> list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((PhotoUpload) it2.next()).f216311m == EnhanceState.f216288d) {
                    c30979j.f169380c.f(c30979j.f169379b, new C30980k(this.f169419m, c30979j));
                    break;
                }
            }
        }
        Y41.a<G0> aVar = c30979j.f169382e;
        if (aVar != null) {
            aVar.invoke();
        }
        return G0.f406611a;
    }
}
