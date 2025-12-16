package com.avito.android.extended_profile_widgets.adapter.about_v2;

import Y41.p;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oB.C44616b;

/* compiled from: AboutV2ItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/remote/model/Image;", "images", "", "index", "Lkotlin/G0;", "invoke", "(Ljava/util/List;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements p<List<? extends Image>, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f154180l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar) {
        super(2);
        this.f154180l = gVar;
    }

    @Override // Y41.p
    public final G0 invoke(List<? extends Image> list, Integer num) {
        int iIntValue = num.intValue();
        g gVar = this.f154180l;
        gVar.f154186b.invoke(new C44616b(list, iIntValue));
        return G0.f406611a;
    }
}
