package com.avito.android.profile.pro.impl.screen.item.service_booking_block;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProfileProSbBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/ProfileProSbBlockActionsLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileProSbBlockActionsLayoutManager extends LinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    public final int f223478G;

    /* renamed from: H, reason: collision with root package name */
    public final int f223479H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileProSbBlockActionsLayoutManager(Context context, int i12, int i13, int i14, C42822w c42822w) {
        super(0, false);
        i12 = (i14 & 2) != 0 ? y6.b(274) : i12;
        i13 = (i14 & 4) != 0 ? -1 : i13;
        this.f223478G = i12;
        this.f223479H = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean K(@Y61.l RecyclerView.n nVar) {
        if (this.f53690r != 0 || nVar == null) {
            return nVar != null;
        }
        return ((ViewGroup.MarginLayoutParams) nVar).width == (o0() == 1 ? this.f223479H : this.f223478G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n a0() {
        RecyclerView.n nVarA0 = super.a0();
        if (this.f53690r == 0) {
            ((ViewGroup.MarginLayoutParams) nVarA0).width = o0() == 1 ? this.f223479H : this.f223478G;
        }
        return nVarA0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n b0(@Y61.k Context context, @Y61.k AttributeSet attributeSet) {
        RecyclerView.n nVar = new RecyclerView.n(context, attributeSet);
        if (this.f53690r == 0) {
            ((ViewGroup.MarginLayoutParams) nVar).width = o0() == 1 ? this.f223479H : this.f223478G;
        }
        return nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n c0(@Y61.k ViewGroup.LayoutParams layoutParams) {
        RecyclerView.n nVarC0 = super.c0(layoutParams);
        if (this.f53690r == 0) {
            ((ViewGroup.MarginLayoutParams) nVarC0).width = o0() == 1 ? this.f223479H : this.f223478G;
        }
        return nVarC0;
    }
}
