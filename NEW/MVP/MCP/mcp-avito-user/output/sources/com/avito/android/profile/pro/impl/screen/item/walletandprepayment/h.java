package com.avito.android.profile.pro.impl.screen.item.walletandprepayment;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.profile.pro.impl.screen.item.walletandprepayment.ProfileProWalletAndPrepaymentItem;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProWalletAndPrepaymentView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/walletandprepayment/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/walletandprepayment/f;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f223563j = 0;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f223564b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f223565c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f223566d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f223567e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f223568f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f223569g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f223570h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f223571i;

    public h(@k View view) {
        super(view);
        this.f223564b = (LinearLayout) view.findViewById(R.id.wallet);
        this.f223565c = (TextView) view.findViewById(R.id.wallet_title);
        this.f223566d = (TextView) view.findViewById(R.id.wallet_value);
        this.f223567e = (TextView) view.findViewById(R.id.wallet_subtitle);
        this.f223568f = (LinearLayout) view.findViewById(R.id.prepayment);
        this.f223569g = (TextView) view.findViewById(R.id.prepayment_title);
        this.f223570h = (TextView) view.findViewById(R.id.prepayment_value);
        this.f223571i = (TextView) view.findViewById(R.id.prepayment_subtitle);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f223564b.setOnClickListener(null);
        this.f223568f.setOnClickListener(null);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.walletandprepayment.f
    public final void jX(@k l lVar, @k ProfileProWalletAndPrepaymentItem profileProWalletAndPrepaymentItem) {
        ProfileProWalletAndPrepaymentItem.Wallet wallet = profileProWalletAndPrepaymentItem.f223544c;
        int i12 = wallet != null ? 0 : 8;
        LinearLayout linearLayout = this.f223564b;
        linearLayout.setVisibility(i12);
        I5.a(this.f223565c, wallet != null ? wallet.f223550b : null, false);
        j.a(this.f223566d, wallet != null ? wallet.f223552d : null, null);
        I5.a(this.f223567e, wallet != null ? wallet.f223551c : null, false);
        linearLayout.setOnClickListener(new g(lVar, profileProWalletAndPrepaymentItem));
        ProfileProWalletAndPrepaymentItem.Prepayment prepayment = profileProWalletAndPrepaymentItem.f223545d;
        int i13 = prepayment != null ? 0 : 8;
        LinearLayout linearLayout2 = this.f223568f;
        linearLayout2.setVisibility(i13);
        I5.a(this.f223569g, prepayment != null ? prepayment.f223546b : null, false);
        j.a(this.f223570h, prepayment != null ? prepayment.f223548d : null, null);
        I5.a(this.f223571i, prepayment != null ? prepayment.f223547c : null, false);
        linearLayout2.setOnClickListener(new g(profileProWalletAndPrepaymentItem, lVar));
    }
}
