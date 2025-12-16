package com.avito.android.publish.select;

import com.avito.android.publish.C33862g0;
import com.avito.android.publish.PublishActivity;
import com.avito.android.publish.select.SelectViewModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/publish/select/SelectViewModel$a;", "kotlin.jvm.PlatformType", "routingAction", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/select/SelectViewModel$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a extends N implements Y41.l<SelectViewModel.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectFragment f242651l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SelectFragment selectFragment) {
        super(1);
        this.f242651l = selectFragment;
    }

    @Override // Y41.l
    public final G0 invoke(SelectViewModel.a aVar) {
        SelectViewModel.a aVar2 = aVar;
        boolean z12 = aVar2 instanceof SelectViewModel.a.b;
        SelectFragment selectFragment = this.f242651l;
        if (z12) {
            C33862g0 c33862g0 = selectFragment.f242631v0;
            (c33862g0 != null ? c33862g0 : null).d(((SelectViewModel.a.b) aVar2).f242650a);
        } else if (aVar2 instanceof SelectViewModel.a.C7276a) {
            ((PublishActivity) selectFragment.requireActivity()).d2(null);
        }
        return G0.f406611a;
    }
}
