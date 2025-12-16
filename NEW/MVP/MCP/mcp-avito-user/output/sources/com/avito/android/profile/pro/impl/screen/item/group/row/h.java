package com.avito.android.profile.pro.impl.screen.item.group.row;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.profile.pro.impl.screen.item.group.row.ProfileProGroupRowItem;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ProfileProGroupRowView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/group/row/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/group/row/g;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f223314g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f223315b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f223316c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f223317d;

    /* renamed from: e, reason: collision with root package name */
    public final Badge f223318e;

    /* renamed from: f, reason: collision with root package name */
    public final Badge f223319f;

    /* compiled from: ProfileProGroupRowView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ProfileProGroupRowItem.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProfileProGroupRowItem.Type type = ProfileProGroupRowItem.Type.f223300b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProfileProGroupRowItem.Type type2 = ProfileProGroupRowItem.Type.f223300b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProfileProGroupRowItem.Type type3 = ProfileProGroupRowItem.Type.f223300b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f223315b = aVar;
        this.f223316c = (ConstraintLayout) view.findViewById(R.id.row);
        this.f223317d = (TextView) view.findViewById(R.id.title);
        this.f223318e = (Badge) view.findViewById(R.id.text_badge);
        this.f223319f = (Badge) view.findViewById(R.id.number_badge);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.group.row.g
    public final void RK(@k ProfileProGroupRowItem profileProGroupRowItem, @k l<? super D90.a, G0> lVar) {
        int i12;
        j.a(this.f223317d, profileProGroupRowItem.f223292c, this.f223315b);
        int iOrdinal = profileProGroupRowItem.f223297h.ordinal();
        if (iOrdinal == 0) {
            i12 = R.drawable.bg_profile_pro_group_row_top;
        } else if (iOrdinal == 1) {
            i12 = R.drawable.bg_profile_pro_group_row_center;
        } else if (iOrdinal == 2) {
            i12 = R.drawable.bg_profile_pro_group_row_bottom;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.drawable.bg_profile_pro_group_row_single;
        }
        ConstraintLayout constraintLayout = this.f223316c;
        constraintLayout.setBackgroundResource(i12);
        D6.c(constraintLayout, null, Integer.valueOf(profileProGroupRowItem.f223296g), null, null, 13);
        com.avito.android.profile.pro.impl.a.a(this.f223318e, profileProGroupRowItem.f223294e);
        com.avito.android.profile.pro.impl.a.a(this.f223319f, profileProGroupRowItem.f223293d);
        constraintLayout.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(26, lVar, profileProGroupRowItem));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f223316c.setOnClickListener(null);
    }
}
