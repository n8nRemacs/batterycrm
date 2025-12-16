package com.avito.android.profile_settings_basic.adapter.basic_info;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.search.EntryPoint;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.shortcut_navigation_bar.m0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import m.C43852a;
import sK0.C48065c;

/* compiled from: BasicInfoItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/basic_info/s;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_basic/adapter/basic_info/m;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class s extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f228645k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f228646b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f228647c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f228648d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f228649e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Spinner f228650f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f228651g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageView f228652h;

    /* renamed from: i, reason: collision with root package name */
    public final int f228653i;

    /* renamed from: j, reason: collision with root package name */
    public final int f228654j;

    public s(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.basic_profile_basic_info_avatar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f228646b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.basic_profile_basic_info_name);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f228647c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.basic_profile_basic_info_name_status);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f228648d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.basic_profile_basic_info_text_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f228649e = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.basic_profile_basic_info_spinner);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f228650f = (Spinner) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.basic_profile_basic_info_spinner_background);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f228651g = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.basic_profile_basic_info_avatar_moderation_icon);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f228652h = (ImageView) viewFindViewById7;
        this.f228653i = C35835l0.d(R.attr.red600, view.getContext());
        this.f228654j = C35835l0.d(R.attr.gray54, view.getContext());
    }

    public final void B80(TextView textView, BasicInfoItem.Icon icon) {
        textView.setCompoundDrawablePadding(L.f(icon.f228597b, RequestReviewResultKt.INFO_TYPE) ? y6.b(6) : y6.b(8));
        int iC2 = C48065c.c(textView.getContext(), icon.f228598c);
        String str = icon.f228597b;
        boolean zF2 = L.f(str, "edit");
        LinearLayout linearLayout = this.f228649e;
        Drawable drawableA = zF2 ? C43852a.a(linearLayout.getContext(), R.drawable.ic_text_edit) : L.f(str, RequestReviewResultKt.INFO_TYPE) ? C43852a.a(linearLayout.getContext(), R.drawable.ic_text_info) : null;
        if (drawableA == null) {
            return;
        }
        drawableA.setTint(iC2);
        I5.d(textView, null, drawableA, 11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // com.avito.android.profile_settings_basic.adapter.basic_info.m
    public final void dD(@Y61.k BasicInfoItem basicInfoItem, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k final Y41.l<? super BasicInfoItem.TextField, G0> lVar, @Y61.k Y41.l<? super String, Boolean> lVar2, @Y61.k Y41.l<? super String, G0> lVar3) {
        BasicInfoItem.Icon icon;
        String str;
        Uri uri = basicInfoItem.f228585e;
        View view = this.f228651g;
        Spinner spinner = this.f228650f;
        if (uri != null) {
            C35949t5.c(this.f228646b, com.avito.android.image_loader.b.b(ImageKt.toImage(uri)), null, null, null, 14);
            D6.H(spinner);
            D6.H(view);
        } else {
            Image image = basicInfoItem.f228584d;
            C35949t5.c(this.f228646b, image != null ? com.avito.android.image_loader.b.b(image) : null, null, null, null, 14);
            D6.w(spinner);
            D6.w(view);
        }
        this.f228646b.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(1, aVar2));
        ModerationStatus moderationStatus = basicInfoItem.f228583c;
        boolean z12 = moderationStatus instanceof ModerationStatus.ModerationFailed;
        ImageView imageView = this.f228652h;
        if (z12) {
            imageView.setImageResource(C35835l0.j(R.attr.ic_attentionRound16, imageView.getContext()));
            imageView.setImageTintList(C35835l0.e(R.attr.red600, imageView.getContext()));
            D6.H(imageView);
        } else if (moderationStatus instanceof ModerationStatus.ModerationPending) {
            imageView.setImageResource(C35835l0.j(R.attr.ic_time16, imageView.getContext()));
            imageView.setImageTintList(C35835l0.e(R.attr.blue600, imageView.getContext()));
            D6.H(imageView);
        } else {
            D6.w(imageView);
        }
        BasicInfoItem.TextField textField = basicInfoItem.f228588h;
        String str2 = textField != null ? textField.f228603c : null;
        ?? r52 = 0;
        boolean z13 = str2 == null || C43066x.K(str2);
        TextView textView = this.f228647c;
        if (z13) {
            textView.setText(R.string.basic_profile_basic_info_empty_name_placeholder);
        } else {
            textView.setText(textField != null ? textField.f228603c : null);
        }
        if (textField == null || (icon = textField.f228606f) == null) {
            icon = new BasicInfoItem.Icon("edit", AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
        }
        B80(textView, icon);
        textView.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(7, textField, aVar));
        ModerationStatus moderationStatus2 = basicInfoItem.f228589i;
        AttributedText description = moderationStatus2 != null ? moderationStatus2.getF226771c() : null;
        TextView textView2 = this.f228648d;
        com.avito.android.util.text.j.a(textView2, description, null);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setTextColor(moderationStatus2 instanceof ModerationStatus.ModerationFailed ? this.f228653i : this.f228654j);
        LinearLayout linearLayout = this.f228649e;
        linearLayout.removeAllViews();
        for (final BasicInfoItem.TextField textField2 : basicInfoItem.f228592l) {
            LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
            linearLayout2.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(r52, y6.b(12), r52, r52);
            linearLayout2.setLayoutParams(layoutParams);
            final com.avito.android.lib.design.text_view.a aVar3 = new com.avito.android.lib.design.text_view.a(linearLayout.getContext(), null, 0, 0, 14, null);
            aVar3.setTextAppearance(C35835l0.j(R.attr.textM20, linearLayout.getContext()));
            aVar3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            I5.a(aVar3, textField2.f228603c, r52);
            BasicInfoItem.Icon icon2 = textField2.f228606f;
            if (icon2 != null) {
                B80(aVar3, icon2);
            }
            aVar3.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile_settings_basic.adapter.basic_info.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = s.f228645k;
                    ((f) lVar).invoke(textField2);
                    com.avito.android.lib.design.text_view.a aVar4 = aVar3;
                    aVar4.setEnabled(false);
                    aVar4.getHandler().postDelayed(new p(aVar4), 1000L);
                }
            });
            linearLayout2.addView(aVar3);
            String str3 = textField2.f228604d;
            if (str3 != null) {
                com.avito.android.lib.design.text_view.a aVar4 = new com.avito.android.lib.design.text_view.a(linearLayout.getContext(), null, 0, 0, 14, null);
                aVar4.setTextAppearance(C35835l0.j(R.attr.textS20, linearLayout.getContext()));
                aVar4.setTextColor(C35835l0.d(R.attr.gray54, linearLayout.getContext()));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(r52, y6.b(3), r52, r52);
                aVar4.setLayoutParams(layoutParams2);
                I5.a(aVar4, str3, r52);
                linearLayout2.addView(aVar4);
            }
            linearLayout.addView(linearLayout2);
            BasicInfoItem.Tooltip tooltip = textField2.f228608h;
            if (tooltip != null && (str = tooltip.f228613e) != null && ((Boolean) ((g) lVar2).invoke(str)).booleanValue() && linearLayout.getGlobalVisibleRect(new Rect())) {
                m0.c(m0.f283432a, linearLayout2, new EntryPoint.Onboarding(null, tooltip.f228610b, tooltip.f228611c, tooltip.f228612d, null, null, null, 113, null), q.f228642l, new r(tooltip, new o(lVar3, textField2)));
            }
            r52 = 0;
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f228647c.setOnClickListener(null);
        this.f228646b.setOnClickListener(null);
    }
}
