package com.avito.android.rating_ui.reviews.review;

import Dh0.InterfaceC13400a;
import com.avito.android.remote.model.Image;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingReviewItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/remote/model/Image;", "items", "", "index", "Lkotlin/G0;", "invoke", "(Ljava/util/List;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.p<List<? extends Image>, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f250349l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Long f250350m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f250351n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f250352o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Long l12, Long l13, Map<String, ? extends Object> map, m mVar) {
        super(2);
        this.f250349l = l12;
        this.f250350m = l13;
        this.f250351n = map;
        this.f250352o = mVar;
    }

    @Override // Y41.p
    public final G0 invoke(List<? extends Image> list, Integer num) {
        List<? extends Image> list2 = list;
        int iIntValue = num.intValue();
        Long l12 = this.f250350m;
        Long l13 = this.f250349l;
        this.f250352o.f250362b.invoke(l13 != null ? new InterfaceC13400a.c.C0185a(list2, iIntValue, l12, l13) : new InterfaceC13400a.c.b(list2, iIntValue, l12, this.f250351n));
        return G0.f406611a;
    }
}
