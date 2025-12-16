package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor;

import Y41.l;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.split.SplitListDialogItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorTabFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUJ0/a;", "Lkotlin/G0;", "invoke", "(LUJ0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements l<UJ0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<SplitListDialogItem> f317896l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ConstructorTabFragment f317897m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List<SplitListDialogItem> list, ConstructorTabFragment constructorTabFragment) {
        super(1);
        this.f317896l = list;
        this.f317897m = constructorTabFragment;
    }

    @Override // Y41.l
    public final G0 invoke(UJ0.a aVar) {
        UJ0.a aVar2 = aVar;
        aVar2.f16338a = this.f317896l;
        aVar2.f16339b = new b(this.f317897m);
        return G0.f406611a;
    }
}
