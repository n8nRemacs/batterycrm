package com.avito.android.profile.pro.impl.screen.item.widget_group.widget;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.profile.pro.impl.screen.item.recommendations.h;
import com.avito.android.profile.pro.impl.screen.item.widget_group.widget.ProfileProWidgetItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProWidgetView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/widget_group/widget/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/widget_group/widget/f;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f223606g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f223607b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f223608c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f223609d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f223610e;

    /* renamed from: f, reason: collision with root package name */
    public final SimpleDraweeView f223611f;

    /* compiled from: ProfileProWidgetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ProfileProWidgetItem.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProfileProWidgetItem.Type type = ProfileProWidgetItem.Type.f223594b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProfileProWidgetItem.Type type2 = ProfileProWidgetItem.Type.f223594b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProfileProWidgetItem.Type type3 = ProfileProWidgetItem.Type.f223594b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(@k View view) {
        super(view);
        this.f223607b = view.getContext();
        this.f223608c = (ConstraintLayout) view.findViewById(R.id.widget_container);
        this.f223609d = (TextView) view.findViewById(R.id.widget_title);
        this.f223610e = (TextView) view.findViewById(R.id.widget_description);
        this.f223611f = (SimpleDraweeView) view.findViewById(R.id.widget_image);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.widget_group.widget.f
    public final void fv(@k ProfileProWidgetItem profileProWidgetItem, @k l<? super D90.a, G0> lVar) {
        int i12;
        I5.a(this.f223609d, profileProWidgetItem.f223586c, false);
        int iOrdinal = profileProWidgetItem.f223591h.ordinal();
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
        ConstraintLayout constraintLayout = this.f223608c;
        constraintLayout.setBackgroundResource(i12);
        D6.c(constraintLayout, null, Integer.valueOf(profileProWidgetItem.f223590g), null, null, 13);
        constraintLayout.setOnClickListener(new h(2, lVar, profileProWidgetItem));
        I5.a(this.f223610e, profileProWidgetItem.f223587d, false);
        UniversalImage universalImage = profileProWidgetItem.f223589f;
        int i13 = universalImage == null ? 4 : 0;
        SimpleDraweeView simpleDraweeView = this.f223611f;
        simpleDraweeView.setVisibility(i13);
        if (universalImage != null) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f223607b))));
            aVarA.f169500r = false;
            aVarA.c();
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f223608c.setOnClickListener(null);
    }
}
