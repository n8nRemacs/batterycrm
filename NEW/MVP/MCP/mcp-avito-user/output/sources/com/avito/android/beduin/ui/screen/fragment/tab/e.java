package com.avito.android.beduin.ui.screen.fragment.tab;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.ui.screen.fragment.tab.BeduinTabFragment;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinTabFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f104302l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BeduinTabFragment f104303m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f104304n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RecyclerView recyclerView, BeduinTabFragment beduinTabFragment, RecyclerView recyclerView2) {
        super(0);
        this.f104302l = recyclerView;
        this.f104303m = beduinTabFragment;
        this.f104304n = recyclerView2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        BeduinTabFragment.a aVar = BeduinTabFragment.f104278z0;
        D6.f(this.f104302l, 0, 0, 0, this.f104304n.getMeasuredHeight() + ((Number) this.f104303m.f104285t0.getValue()).intValue(), 7);
        return G0.f406611a;
    }
}
