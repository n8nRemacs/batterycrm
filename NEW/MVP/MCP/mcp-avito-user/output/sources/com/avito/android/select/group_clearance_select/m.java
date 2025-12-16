package com.avito.android.select.group_clearance_select;

import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.select.group_clearance_select.GroupClearanceFragment;
import cq0.InterfaceC39397a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GroupClearanceView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chip", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class m extends N implements Y41.p<com.avito.android.lib.design.chips.h, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f265507l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar) {
        super(2);
        this.f265507l = nVar;
    }

    @Override // Y41.p
    public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
        com.avito.android.lib.design.chips.h hVar2 = hVar;
        bool.getClass();
        if ((hVar2 instanceof ItemChipable ? (ItemChipable) hVar2 : null) != null) {
            ((GroupClearanceFragment.c) this.f265507l.f265532a).invoke(new InterfaceC39397a.C10991a(hVar2.getF262141c().toString()));
        }
        return G0.f406611a;
    }
}
