package com.avito.android.body_condition;

import Y41.p;
import android.view.View;
import com.avito.android.deep_linking.links.PointWithPosition;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: CarBodyConditionItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "pointView", "Lcom/avito/android/deep_linking/links/PointWithPosition;", "point", "Lkotlin/G0;", "invoke", "(Landroid/view/View;Lcom/avito/android/deep_linking/links/PointWithPosition;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements p<View, PointWithPosition, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f106800l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(2);
        this.f106800l = cVar;
    }

    @Override // Y41.p
    public final G0 invoke(View view, PointWithPosition pointWithPosition) {
        this.f106800l.f106804b.accept(new Q<>(view, pointWithPosition));
        return G0.f406611a;
    }
}
