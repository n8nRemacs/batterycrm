package com.avito.android.tariff_lf_constructor.configure.size;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.tariff_lf_constructor.configure.size.ConstructorConfigureSizeFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;

/* compiled from: ConstructorConfigureSizeFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConstructorConfigureSizeFragment f300302l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ConstructorConfigureSizeFragment constructorConfigureSizeFragment) {
        super(1);
        this.f300302l = constructorConfigureSizeFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        Integer num2 = num;
        ConstructorConfigureSizeFragment.a aVar = ConstructorConfigureSizeFragment.f300239G0;
        ConstructorConfigureSizeFragment constructorConfigureSizeFragment = this.f300302l;
        n<Object> nVar = ConstructorConfigureSizeFragment.f300240H0[0];
        RecyclerView.m layoutManager = ((RecyclerView) constructorConfigureSizeFragment.f300253t0.a()).getLayoutManager();
        if (layoutManager != null) {
            layoutManager.l1(num2.intValue());
        }
        return G0.f406611a;
    }
}
