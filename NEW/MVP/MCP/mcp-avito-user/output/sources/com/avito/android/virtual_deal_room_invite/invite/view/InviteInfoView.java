package com.avito.android.virtual_deal_room_invite.invite.view;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.n;
import com.avito.android.remote.model.Image;
import dO0.C39608a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: InviteInfoView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/view/InviteInfoView;", "Landroid/widget/LinearLayout;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InviteInfoView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f327098b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f327099c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f327100d;

    @j
    public InviteInfoView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(@l C39608a c39608a, @k String str, @k String str2) {
        Image image;
        Image image2;
        if (c39608a != null) {
            boolean zB2 = com.avito.android.lib.util.darkTheme.c.b(getContext());
            image = c39608a.f393852a;
            if (!zB2 && (image2 = c39608a.f393853b) != null) {
                image = image2;
            }
        } else {
            image = null;
        }
        com.avito.android.image_loader.glide.utils.b.d(this.f327098b, n.a(image));
        this.f327099c.setText(str);
        this.f327100d.setText(str2);
    }

    public InviteInfoView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        LayoutInflater.from(context).inflate(R.layout.virtual_deal_room_invite_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.image_invite);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f327098b = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.title_invite);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f327099c = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.description_invite);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f327100d = (TextView) viewFindViewById3;
    }
}
