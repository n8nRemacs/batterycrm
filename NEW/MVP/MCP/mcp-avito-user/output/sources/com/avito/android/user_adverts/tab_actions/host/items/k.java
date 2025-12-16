package com.avito.android.user_adverts.tab_actions.host.items;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertActionItemViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/items/k;", "Lcom/avito/android/user_adverts/tab_actions/host/items/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f314334g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f314335b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f314336c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Spinner f314337d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Badge f314338e;

    /* renamed from: f, reason: collision with root package name */
    public final int f314339f;

    /* compiled from: UserAdvertActionItemViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[UserAdvertActionType.Multiple.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<UserAdvertActionType.Multiple> creator = UserAdvertActionType.Multiple.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<UserAdvertActionType.Multiple> creator2 = UserAdvertActionType.Multiple.CREATOR;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Parcelable.Creator<UserAdvertActionType.Multiple> creator3 = UserAdvertActionType.Multiple.CREATOR;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Parcelable.Creator<UserAdvertActionType.Multiple> creator4 = UserAdvertActionType.Multiple.CREATOR;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public k(@Y61.k View view) {
        super(view);
        this.f314335b = view.getContext();
        this.f314336c = (TextView) view.findViewById(R.id.user_adverts_actions_item_name);
        this.f314337d = (Spinner) view.findViewById(R.id.user_adverts_action_item_loading);
        this.f314338e = (Badge) view.findViewById(R.id.user_adverts_action_item_badge);
        this.f314339f = y6.b(15);
    }

    @Override // com.avito.android.user_adverts.tab_actions.host.items.j
    public final void X(@Y61.k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(10, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.itemView.setOnClickListener(null);
    }

    @Override // com.avito.android.user_adverts.tab_actions.host.items.j
    public final void yt(@Y61.k com.avito.android.user_adverts.tab_actions.host.items.a aVar, @Y61.k Y41.a<Boolean> aVar2) {
        int i12;
        CharSequence charSequenceI = aVar.f314314b;
        boolean z12 = aVar.f314319g;
        if (!z12) {
            int iOrdinal = aVar.f314318f.ordinal();
            if (iOrdinal == 0) {
                i12 = R.attr.textIconBonus;
            } else if (iOrdinal == 1) {
                i12 = R.attr.textIconDelete;
            } else if (iOrdinal == 2) {
                i12 = R.attr.textIconCloseOutline;
            } else if (iOrdinal == 3) {
                i12 = R.attr.textIconRepeat;
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.attr.textIconAdd;
            }
            FV.a.f4720a.getClass();
            charSequenceI = FV.a.i(charSequenceI, this.f314335b, i12, this.f314339f);
        }
        this.f314336c.setText(charSequenceI);
        this.f314337d.setVisibility(z12 ? 0 : 8);
        boolean zBooleanValue = ((Boolean) ((g) aVar2).invoke()).booleanValue();
        Badge badge = this.f314338e;
        if (zBooleanValue) {
            D6.w(badge);
            return;
        }
        UserAdvertActionsInfoDomain.BadgeInfo badgeInfo = aVar.f314321i;
        if (badgeInfo != null) {
            badge.setTitleText(badgeInfo.getText());
            D6.H(badge);
        }
    }
}
