package com.avito.android.passport.profile_add.merge.business_vrf_duplication.recycler;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportVrfActionItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/recycler/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/recycler/h;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f212591g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f212592b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f212593c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f212594d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f212595e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f212596f;

    public i(@k View view) {
        super(view);
        this.f212592b = view;
        View viewFindViewById = view.findViewById(R.id.passport_vrf_action_list_item_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f212593c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.passport_vrf_action_list_item_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f212594d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.passport_vrf_action_list_item_left_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f212595e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.passport_vrf_action_list_item_right_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f212596f = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.passport.profile_add.merge.business_vrf_duplication.recycler.h
    public final void H4(@InterfaceC42150f int i12) {
        FV.a.f4720a.getClass();
        FV.a.c(this.f212595e, i12);
    }

    @Override // com.avito.android.passport.profile_add.merge.business_vrf_duplication.recycler.h
    public final void J4(@InterfaceC42150f int i12) {
        FV.a.f4720a.getClass();
        FV.a.c(this.f212596f, R.attr.textIconArrowForwardIos);
    }

    @Override // com.avito.android.passport.profile_add.merge.business_vrf_duplication.recycler.h
    public final void Va(@k l<? super View, G0> lVar) {
        this.f212592b.setOnClickListener(new ViewOnClickListenerC31042l(11, lVar));
    }

    @Override // com.avito.android.passport.profile_add.merge.business_vrf_duplication.recycler.h
    public final void f(@k String str) {
        this.f212594d.setText(str);
    }

    @Override // com.avito.android.passport.profile_add.merge.business_vrf_duplication.recycler.h
    public final void setTitle(@k String str) {
        this.f212593c.setText(str);
    }
}
