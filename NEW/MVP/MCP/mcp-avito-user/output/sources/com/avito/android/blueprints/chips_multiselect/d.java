package com.avito.android.blueprints.chips_multiselect;

import Y41.l;
import android.view.View;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChipsMultiselectItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f105871l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v f105872m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, ParameterElement.v vVar) {
        super(1);
        this.f105871l = fVar;
        this.f105872m = vVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        this.f105871l.f105879f.accept(this.f105872m.f117559t.getDeepLink());
        return G0.f406611a;
    }
}
