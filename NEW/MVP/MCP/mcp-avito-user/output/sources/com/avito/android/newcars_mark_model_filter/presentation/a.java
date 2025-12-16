package com.avito.android.newcars_mark_model_filter.presentation;

import com.avito.android.newcars_mark_model_filter.presentation.NewCarsBrandModelFilterFragment;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import o30.InterfaceC44575a;

/* compiled from: NewCarsBrandModelFilterFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ NewCarsBrandModelFilterFragment f207304l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment) {
        super(0);
        this.f207304l = newCarsBrandModelFilterFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        NewCarsBrandModelFilterFragment.a aVar = NewCarsBrandModelFilterFragment.f207276u0;
        NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment = this.f207304l;
        if (newCarsBrandModelFilterFragment.f5().getState().getValue().f419359k) {
            newCarsBrandModelFilterFragment.f5().accept(InterfaceC44575a.d.f419341a);
        } else {
            h hVarF5 = newCarsBrandModelFilterFragment.f5();
            List<Long> list = newCarsBrandModelFilterFragment.f5().getState().getValue().f419355g;
            if (list == null) {
                throw new IllegalStateException("BrandIds can't be null");
            }
            hVarF5.accept(new InterfaceC44575a.e(list));
        }
        return G0.f406611a;
    }
}
