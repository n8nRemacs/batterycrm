package com.avito.android.sbc.create.common;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.util.darkTheme.c;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: SbcConfiguratorFastChipsOnboardingDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/create/common/SbcConfiguratorFastChipsOnboardingDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SbcConfiguratorFastChipsOnboardingDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @k
    public static final a f259173h0 = new a(null);

    /* compiled from: SbcConfiguratorFastChipsOnboardingDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/create/common/SbcConfiguratorFastChipsOnboardingDialog$a;", "", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SbcConfiguratorFastChipsOnboardingDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f259175m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(1);
            this.f259175m = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            a aVar = SbcConfiguratorFastChipsOnboardingDialog.f259173h0;
            SbcConfiguratorFastChipsOnboardingDialog sbcConfiguratorFastChipsOnboardingDialog = SbcConfiguratorFastChipsOnboardingDialog.this;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view2.findViewById(R.id.sbc_configurator_fast_chip_onboarding_image);
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(new UniversalImage(new Image(P0.g(new Q(new Size(107, 91), Uri.parse("https://avito.st/static/ims/graphic_library_icon_glass_green_42_light_107x91.png")), new Q(new Size(148, WebSocketProtocol.PAYLOAD_SHORT), Uri.parse("https://avito.st/static/ims/graphic_library_icon_glass_green_42_light_148x126.png")), new Q(new Size(220, 186), Uri.parse("https://avito.st/static/ims/graphic_library_icon_glass_green_42_light_220x186.png")), new Q(new Size(296, 251), Uri.parse("https://avito.st/static/ims/graphic_library_icon_glass_green_42_light_296x251.png")), new Q(new Size(444, 376), Uri.parse("https://avito.st/static/ims/graphic_library_icon_glass_green_42_light_444x376.png")), new Q(new Size(592, 501), Uri.parse("https://avito.st/static/ims/graphic_library_icon_glass_green_42_light_592x501.png")))), new Image(P0.g(new Q(new Size(107, 91), Uri.parse("https://avito.st/static/ims/graphic_library_icon_glass_green_42_dark_107x91.png")), new Q(new Size(148, WebSocketProtocol.PAYLOAD_SHORT), Uri.parse("https://avito.st/static/ims/graphic_library_icon_glass_green_42_dark_148x126.png")), new Q(new Size(220, 186), Uri.parse("https://avito.st/static/ims/graphic_library_icon_glass_green_42_dark_220x186.png")), new Q(new Size(296, 251), Uri.parse("https://avito.st/static/ims/graphic_library_icon_glass_green_42_dark_296x251.png")), new Q(new Size(444, 376), Uri.parse("https://avito.st/static/ims/graphic_library_icon_glass_green_42_dark_444x376.png")), new Q(new Size(592, 501), Uri.parse("https://avito.st/static/ims/graphic_library_icon_glass_green_42_dark_592x501.png"))))), c.b(sbcConfiguratorFastChipsOnboardingDialog.requireContext()))), null, null, null, 14);
            D6.H(simpleDraweeView);
            view2.findViewById(R.id.sbc_configurator_fast_chip_onboarding_gradient).setBackground(new AvitoLinearGradientDrawable(new AvitoLinearGradientDrawable.a.C5275a(sbcConfiguratorFastChipsOnboardingDialog.requireContext(), R.attr.gradientLinearMixedHorizontalBlueGreen, 0, 4, null).a()));
            Button button = (Button) view2.findViewById(R.id.close_button);
            if (button != null) {
                button.setOnClickListener(new S7.a(this.f259175m, 15));
            }
            return G0.f406611a;
        }
    }

    public SbcConfiguratorFastChipsOnboardingDialog() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        d dVar = new d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.C(R.layout.sbc_fast_chips_onboarding_layout, new b(dVar));
        j.b(dVar, true, 4);
        d.I(dVar, true);
        return dVar;
    }
}
