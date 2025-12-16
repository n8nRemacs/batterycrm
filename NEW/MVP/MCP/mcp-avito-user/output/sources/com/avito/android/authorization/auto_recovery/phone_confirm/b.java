package com.avito.android.authorization.auto_recovery.phone_confirm;

import Ui.InterfaceC15522a;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22983P;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.authorization.AuthSource;
import com.avito.android.avito_map.yandex.AvitoYandexMap;
import com.avito.android.beduin.ui.screen.fragment.tabs.TabsScreenFragment;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmptyDeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.avito.android.util.L5;
import com.avito.android.util.y6;
import com.google.gson.stream.JsonToken;
import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.Map;
import java.util.ArrayList;
import java.util.List;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import qK0.C47313c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class b implements com.avito.android.code_check_public.c, Callback, Map.CameraCallback, InterfaceC15522a.InterfaceC1136a, C47313c.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93207b;

    public /* synthetic */ b(int i12) {
        this.f93207b = i12;
    }

    public static float b(View view, int i12) {
        return view.getContext().getResources().getDimension(i12);
    }

    public static int c(com.google.gson.g gVar, com.google.gson.k kVar, Class cls, ArrayList arrayList, int i12, int i13) {
        arrayList.add(gVar.b(kVar, cls));
        return i12 + i13;
    }

    public static RuntimeTypeAdapterFactory d(RuntimeTypeAdapterFactory.a aVar, Class cls) {
        aVar.getClass();
        return new RuntimeTypeAdapterFactory(cls);
    }

    public static String e(com.google.gson.stream.a aVar, StringBuilder sb2, String str, com.google.gson.stream.a aVar2) {
        sb2.append(aVar.F());
        sb2.append(str);
        sb2.append(aVar2);
        return sb2.toString();
    }

    public static String f(StringBuilder sb2, Settings settings, char c12) {
        sb2.append(settings);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String h(StringBuilder sb2, Double d12, char c12) {
        sb2.append(d12);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String i(StringBuilder sb2, Q q12, char c12) {
        sb2.append(q12);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String j(n0 n0Var, Class cls, StringBuilder sb2) {
        sb2.append(n0Var.b(cls));
        return sb2.toString();
    }

    public static StringBuilder k(String str, JsonToken jsonToken, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(jsonToken);
        sb2.append(str2);
        return sb2;
    }

    public static java.util.Map l(String str, String str2, java.util.Map map) {
        return P0.l(map, new Q(str, str2));
    }

    public static void m(A a12) {
        a12.h();
        a12.h();
        a12.h();
    }

    public static void n(InterfaceC22983P interfaceC22983P, C43197r1 c43197r1) {
        C43175k.K(c43197r1, C22981N.a(interfaceC22983P.getLifecycle()));
    }

    public static void o(BxContentFragment bxContentFragment, C43197r1 c43197r1) {
        C43175k.K(c43197r1, C22984Q.a(bxContentFragment.getViewLifecycleOwner()));
    }

    public static void p(com.avito.konveyor.adapter.a aVar, List list) {
        aVar.c(new UV0.c(list));
    }

    @Override // qK0.C47313c.a
    public void a(Object obj) {
        TabsScreenFragment.a aVar = TabsScreenFragment.f104306N0;
        ((ViewPager2) obj).setAdapter(null);
    }

    @Override // Ui.InterfaceC15522a.InterfaceC1136a
    public void g(ActivityC22955m activityC22955m) {
        L5.a(activityC22955m, R.string.update_app_error, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.code_check_public.c
    public Object k0(Context context) {
        switch (this.f93207b) {
            case 0:
                return new AttributedText("{{title}}{{subtitle}}", C42745f0.U(new FontAttribute("title", context.getString(R.string.auto_recovery_code_check_phone_subtitle_title), C42745f0.U(new FontParameter.TextStyleParameter(null, "h3"), new FontParameter.ParagraphSpacingParameter(6.0f))), new FontAttribute("subtitle", context.getString(R.string.auto_recovery_code_check_phone_subtitle_text), com.avito.android.advert.item.delivery_suggests.l.u(null, "m20"))), 1);
            case 1:
                boolean z12 = true;
                DeepLink deepLink = null;
                String str = null;
                String str2 = null;
                Integer num = null;
                String str3 = null;
                Integer num2 = null;
                Integer num3 = null;
                Action.TitleWithSalary titleWithSalary = null;
                Boolean bool = null;
                return new UserDialog(context.getString(R.string.auto_recovery_code_check_phone_no_phone_title), context.getString(R.string.auto_recovery_code_check_phone_no_phone_message), C42745f0.U(new Action(context.getString(R.string.auto_recovery_code_check_phone_no_phone_action), new AuthenticateLink(AuthSource.f92687V, z12, deepLink, 4, (C42822w) null), null, null, null, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, str, str2, num, str3, num2, num3, titleWithSalary, bool, 65532, null), new Action(context.getString(R.string.auto_recovery_code_check_phone_dialog_back), new EmptyDeepLink(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532, null)), false, 8, 0 == true ? 1 : 0);
            case 2:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.social_reg_code_check_code_input_margin_top));
            case 3:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.social_reg_code_check_phone_subtitle_margin_top));
            case 4:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.registration_code_check_code_input_margin_top));
            case 5:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.registration_code_check_code_input_margin_top));
            case 6:
                return Integer.valueOf(y6.b(6));
            case 7:
                return Integer.valueOf(y6.b(16));
            case 8:
                return Integer.valueOf(y6.b(6));
            case 9:
                return Integer.valueOf(y6.b(16));
            case 10:
                return new AttributedText(context.getString(R.string.tfa_code_check_confirm_sms_list_ah), C42784z0.f406748b, 0);
            default:
                return new AttributedText(context.getString(R.string.tfa_code_check_confirm_sms_list_tfa), C42784z0.f406748b, 0);
        }
    }

    @Override // com.yandex.mapkit.map.Map.CameraCallback
    public void onMoveFinished(boolean z12) {
        AvitoYandexMap.zoomTo$lambda$30(z12);
    }

    @Override // com.yandex.mapkit.map.Callback
    public void onTaskFinished() {
        AvitoYandexMap.addMarker$lambda$29$lambda$27();
    }
}
