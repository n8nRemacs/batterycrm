package com.avito.android.tns_gallery;

import com.avito.android.remote.model.TnsGalleryImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TnsGalleryItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f301535l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f301536m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, a aVar) {
        super(0);
        this.f301535l = hVar;
        this.f301536m = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final G0 invoke() {
        ?? r02 = this.f301535l.f301539d;
        if (r02 != 0) {
            a aVar = this.f301536m;
            List<TnsGalleryImage> list = aVar.f301523c;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TnsGalleryImage) it.next()).getImage());
            }
            r02.invoke(arrayList, Integer.valueOf((int) aVar.f301522b));
        }
        return G0.f406611a;
    }
}
