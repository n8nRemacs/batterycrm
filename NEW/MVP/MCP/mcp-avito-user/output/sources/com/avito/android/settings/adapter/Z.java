package com.avito.android.settings.adapter;

import Nv0.InterfaceC14616a;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.replace_main.toggle.v;
import com.avito.android.settings.adapter.i0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReplaceMainItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/settings/adapter/Z;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/settings/adapter/Y;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Z extends com.avito.konveyor.adapter.b implements Y {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.replace_main.toggle.u f280764b;

    /* compiled from: ReplaceMainItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/space/BottomNavigationSpace;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/bottom_navigation/space/BottomNavigationSpace;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<BottomNavigationSpace, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC14616a, G0> f280765l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super InterfaceC14616a, G0> lVar) {
            super(1);
            this.f280765l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(BottomNavigationSpace bottomNavigationSpace) {
            this.f280765l.invoke(new InterfaceC14616a.e(bottomNavigationSpace));
            return G0.f406611a;
        }
    }

    public Z(@Y61.k View view, @Y61.k com.avito.android.replace_main.toggle.v vVar, @Y61.k Y41.l<? super InterfaceC14616a, G0> lVar) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.replace_main_toggle_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.replace_main.toggle.A a12 = vVar.a(new v.a(view.getContext(), new v.a.C7618a(R.dimen.component_horizontal_padding, R.dimen.standard_padding), new a(lVar)));
        this.f280764b = a12;
        ((ViewGroup) viewFindViewById).addView(a12.f254608b);
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        this.f280764b.a(((i0.h) aVar).f280796b);
    }
}
