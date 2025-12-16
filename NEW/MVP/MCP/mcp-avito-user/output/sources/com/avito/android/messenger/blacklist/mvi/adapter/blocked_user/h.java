package com.avito.android.messenger.blacklist.mvi.adapter.blocked_user;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BlockedUserView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/adapter/blocked_user/h;", "Lcom/avito/android/messenger/blacklist/mvi/adapter/blocked_user/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f186402b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f186403c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f186404d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f186405e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f186406f;

    /* renamed from: g, reason: collision with root package name */
    public final View f186407g;

    /* renamed from: h, reason: collision with root package name */
    public final View f186408h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Y41.a<G0> f186409i;

    public h(@k View view) {
        super(view);
        this.f186402b = (TextView) view.findViewById(R.id.blocked_user_date);
        this.f186403c = (TextView) view.findViewById(R.id.blocked_user_name);
        this.f186404d = (TextView) view.findViewById(R.id.blocked_user_item_title);
        this.f186405e = (TextView) view.findViewById(R.id.blocked_user_item_category);
        this.f186406f = (TextView) view.findViewById(R.id.blocked_user_item_price);
        View viewFindViewById = view.findViewById(R.id.blocked_user_unblock_button);
        this.f186407g = viewFindViewById;
        this.f186408h = view.findViewById(R.id.blocked_user_unblocking_progress);
        viewFindViewById.setOnClickListener(new com.avito.android.imv_similiar_adverts.h(this, 27));
    }

    @Override // com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.g
    public final void AJ(@k Y41.a<G0> aVar) {
        this.f186409i = aVar;
    }

    @Override // com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.g
    public final void GY(@k String str) {
        this.f186402b.setText(str);
    }

    @Override // com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.g
    public final void I70(boolean z12) {
        View view = this.f186408h;
        View view2 = this.f186407g;
        if (z12) {
            D6.w(view2);
            D6.H(view);
        } else {
            D6.w(view);
            D6.H(view2);
        }
    }

    @Override // com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.g
    public final void MG(@l String str) {
        I5.a(this.f186405e, str, false);
    }

    @Override // com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.g
    public final void cq(@l String str) {
        I5.a(this.f186406f, str, false);
    }

    @Override // com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.g
    public final void dK(@k String str) {
        this.f186403c.setText(str);
    }

    @Override // com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.g
    public final void ls(@l String str) {
        I5.a(this.f186404d, str, false);
    }
}
