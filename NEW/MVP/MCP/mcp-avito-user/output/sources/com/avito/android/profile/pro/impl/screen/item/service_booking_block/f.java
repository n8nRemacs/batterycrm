package com.avito.android.profile.pro.impl.screen.item.service_booking_block;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.service_booking_user_profile.view.item.ServiceBookingBlockActionItem;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import i31.InterfaceC41220a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProSbBlockActionItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/f;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f223489m = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f223490b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f223491c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f223492d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f223493e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f223494f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f223495g;

    /* renamed from: h, reason: collision with root package name */
    public final int f223496h;

    /* renamed from: i, reason: collision with root package name */
    public final int f223497i;

    /* renamed from: j, reason: collision with root package name */
    public final int f223498j;

    /* renamed from: k, reason: collision with root package name */
    public final int f223499k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Drawable f223500l;

    /* compiled from: ProfileProSbBlockActionItem.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/f$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        f a(@Y61.k View view);
    }

    /* compiled from: ProfileProSbBlockActionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ServiceBookingBlockActionItem.ActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ServiceBookingBlockActionItem.ActionType actionType = ServiceBookingBlockActionItem.ActionType.f278169b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @i31.c
    public f(@InterfaceC41220a @Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f223490b = aVar;
        Context context = view.getContext();
        this.f223491c = context;
        this.f223492d = (SimpleDraweeView) view.findViewById(R.id.sb_item_action_image);
        this.f223493e = (TextView) view.findViewById(R.id.sb_item_action_title);
        this.f223494f = (TextView) view.findViewById(R.id.sb_item_action_subtitle);
        this.f223495g = (TextView) view.findViewById(R.id.sb_item_action_additional_text);
        this.f223496h = y6.b(64);
        this.f223497i = y6.b(58);
        this.f223498j = y6.b(76);
        this.f223499k = y6.b(58);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        this.f223500l = resources.getDrawable(R.drawable.ic_profile_pro_sb_action_placeholder, theme);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.itemView.setOnClickListener(null);
    }
}
