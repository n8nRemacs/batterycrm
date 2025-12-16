package com.avito.android.advert.item.comfortable_deal;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.Achievement;
import com.avito.android.remote.model.Benefit;
import com.avito.android.remote.model.ExpertBlock;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlin.text.C43066x;

/* compiled from: ExpertBlockBottomSheetDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/comfortable_deal/ExpertBlockBottomSheetDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExpertBlockBottomSheetDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f74275h0;

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f74274j0 = {m0.f406844a.e(new Y(ExpertBlockBottomSheetDialog.class, "openParams", "getOpenParams()Lcom/avito/android/advert/item/comfortable_deal/ExpertBlockBottomSheetOpenParams;", 0))};

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final a f74273i0 = new a(null);

    /* compiled from: ExpertBlockBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/comfortable_deal/ExpertBlockBottomSheetDialog$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public ExpertBlockBottomSheetDialog() {
        super(0, 1, null);
        this.f74275h0 = new C35968w3(this);
    }

    public final ExpertBlockBottomSheetOpenParams f5() {
        return (ExpertBlockBottomSheetOpenParams) this.f74275h0.getValue(this, f74274j0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        String str;
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(getContext(), R.style.Theme_DesignSystem_Re23);
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.expert_bottom_sheet, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.benefits_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.bottom_sheet_close_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById2;
        for (Benefit benefit : f5().f74277c) {
            String text = benefit.getText();
            String iconName = benefit.getIconName();
            boolean needRightIcon = benefit.getNeedRightIcon();
            View viewInflate2 = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.benefit_layout, (ViewGroup) linearLayout, false);
            linearLayout.addView(viewInflate2);
            D6.c(viewInflate2, null, Integer.valueOf(y6.b(12)), null, null, 13);
            View viewFindViewById3 = viewInflate2.findViewById(R.id.text);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById3;
            View viewFindViewById4 = viewInflate2.findViewById(R.id.end_text_icon);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView2 = (TextView) viewFindViewById4;
            View viewFindViewById5 = viewInflate2.findViewById(R.id.start_text_icon);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView3 = (TextView) viewFindViewById5;
            textView.setText(text);
            Integer numM = com.avito.android.lib.util.f.m(iconName);
            if (numM != null) {
                int iIntValue = numM.intValue();
                FV.a.f4720a.getClass();
                FV.a.c(textView3, iIntValue);
            }
            if (needRightIcon) {
                FV.a.f4720a.getClass();
                FV.a.c(textView2, R.attr.textIconChevronRight);
                textView2.setTextColor(C35835l0.d(R.attr.gray54, linearLayout.getContext()));
            } else {
                D6.w(textView2);
            }
        }
        ExpertBlockBottomSheetOpenParams expertBlockBottomSheetOpenParamsF5 = f5();
        View viewFindViewById6 = viewInflate.findViewById(R.id.expert_block_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.avatar);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(R.id.avatar_placeholder);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView4 = (TextView) viewFindViewById8;
        View viewFindViewById9 = viewInflate.findViewById(R.id.name);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView5 = (TextView) viewFindViewById9;
        View viewFindViewById10 = viewInflate.findViewById(R.id.achievements_container);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout2 = (LinearLayout) viewFindViewById10;
        View viewFindViewById11 = viewInflate.findViewById(R.id.cd_title);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView6 = (TextView) viewFindViewById11;
        View viewFindViewById12 = viewInflate.findViewById(R.id.left_image);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) viewFindViewById12;
        View viewFindViewById13 = viewInflate.findViewById(R.id.right_image);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) viewFindViewById13;
        ExpertBlock expertBlock = expertBlockBottomSheetOpenParamsF5.f74278d;
        Uri avatar = expertBlock.getAvatar();
        String name = expertBlock.getName();
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        if (avatar == null || avatar.equals(Uri.EMPTY)) {
            aVarA.b();
            D6.H(textView4);
            textView4.setText(String.valueOf(C43066x.D(name)));
        } else {
            D6.w(textView4);
            aVarA.f(avatar);
            aVarA.c();
        }
        I5.a(textView5, expertBlock.getName(), false);
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(expertBlock.getLeftImage(), com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
        ImageRequest.a aVarA2 = C35949t5.a(simpleDraweeView2);
        aVarA2.d(com.avito.android.image_loader.b.b(imageDependsOnTheme));
        aVarA2.c();
        Image imageDependsOnTheme2 = UniversalImageKt.getImageDependsOnTheme(expertBlock.getRightImage(), com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
        ImageRequest.a aVarA3 = C35949t5.a(simpleDraweeView3);
        aVarA3.d(com.avito.android.image_loader.b.b(imageDependsOnTheme2));
        aVarA3.c();
        I5.a(textView6, expertBlock.getText(), false);
        List<Achievement> achievements = expertBlock.getAchievements();
        linearLayout2.removeAllViews();
        for (Achievement achievement : achievements) {
            View viewInflate3 = LayoutInflater.from(linearLayout2.getContext()).inflate(R.layout.achievement_layout, (ViewGroup) linearLayout2, false);
            View viewFindViewById14 = viewInflate3.findViewById(R.id.icon);
            if (viewFindViewById14 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ImageView imageView2 = (ImageView) viewFindViewById14;
            ((TextView) viewInflate3.findViewById(R.id.text)).setText(achievement.getText());
            Integer numA = q.a(achievement.getIcon());
            imageView2.setImageDrawable(numA != null ? C35835l0.m(imageView2.getContext(), numA.intValue(), R.attr.black) : null);
            linearLayout2.addView(viewInflate3);
            D6.c(viewInflate3, Integer.valueOf(y6.b(10)), null, Integer.valueOf(y6.b(10)), null, 10);
        }
        D6.c(viewGroup, null, null, null, Integer.valueOf(y6.b(24)), 7);
        View viewFindViewById15 = viewInflate.findViewById(R.id.title);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById15).setText(f5().f74276b);
        imageView.setImageDrawable(C35835l0.m(imageView.getContext(), R.attr.ic_close24, R.attr.black));
        String str2 = f5().f74279e;
        if (str2 != null && str2.length() != 0 && (str = f5().f74280f) != null && str.length() != 0) {
            View viewFindViewById16 = viewInflate.findViewById(R.id.subtitle);
            if (viewFindViewById16 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView7 = (TextView) viewFindViewById16;
            D6.H(textView7);
            textView7.setText(f5().f74279e);
            View viewFindViewById17 = viewInflate.findViewById(R.id.description);
            if (viewFindViewById17 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView8 = (TextView) viewFindViewById17;
            D6.H(textView8);
            textView8.setText(f5().f74280f);
        }
        com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(dVar, R.style.Re23_BottomSheet_Default);
        dVar2.G(viewInflate, true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar2, true);
        imageView.setOnClickListener(new S7.a(dVar2, 2));
        return dVar2;
    }
}
