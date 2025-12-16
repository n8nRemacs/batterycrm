package com.avito.android.advert.item.delivery_suggests;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.OnAdidReadListener;
import com.avito.android.R;
import com.avito.android.app.task.UserKeysAnalyticsTask;
import com.avito.android.arch.mvi.t;
import com.avito.android.arch.mvi.u;
import com.avito.android.di.module.C30060h5;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.util.V2;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.mobile.ads.common.InitializationListener;
import dagger.internal.A;
import dagger.internal.B;
import io.reactivex.rxjava3.core.C;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.core.M;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class l implements InitializationListener, M, C, t, u, com.avito.android.code_check_public.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75119b;

    public /* synthetic */ l(int i12) {
        this.f75119b = i12;
    }

    public static int c(int i12, int i13, CharSequence charSequence) {
        return (charSequence.hashCode() + i12) * i13;
    }

    public static int d(Parcel parcel, ArrayList arrayList, int i12, int i13) {
        arrayList.add(Integer.valueOf(parcel.readInt()));
        return i12 + i13;
    }

    public static GradientDrawable e(int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i12);
        return gradientDrawable;
    }

    public static Image g(View view, UniversalImage universalImage) {
        return UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(view.getContext()));
    }

    public static dagger.internal.u h(dagger.internal.u uVar) {
        return B.a(new com.avito.android.konveyor_adapter_module.b(uVar));
    }

    public static dagger.internal.u i(dagger.internal.u uVar, dagger.internal.u uVar2) {
        return dagger.internal.g.d(new C30060h5(uVar, uVar2));
    }

    public static dagger.internal.u k(A a12) {
        return B.a(new com.avito.android.konveyor_adapter_module.c(a12));
    }

    public static C41981q0 l(com.jakewharton.rxrelay3.c cVar, com.jakewharton.rxrelay3.c cVar2) {
        cVar.getClass();
        return new C41981q0(cVar2);
    }

    public static Float m(Number number, Size size, int i12) {
        number.intValue();
        return Float.valueOf(size.getWidth() / i12);
    }

    public static Integer n(View view, int i12) {
        return Integer.valueOf(view.getResources().getDimensionPixelSize(i12));
    }

    public static String o(StringBuilder sb2, Parcelable parcelable, char c12) {
        sb2.append(parcelable);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, ButtonAction buttonAction, char c12) {
        sb2.append(buttonAction);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String q(StringBuilder sb2, ParametrizedEvent parametrizedEvent, char c12) {
        sb2.append(parametrizedEvent);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String r(StringBuilder sb2, UniversalColor universalColor, char c12) {
        sb2.append(universalColor);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String s(StringBuilder sb2, UniversalImage universalImage, char c12) {
        sb2.append(universalImage);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String t(StringBuilder sb2, Throwable th2, char c12) {
        sb2.append(th2);
        sb2.append(c12);
        return sb2.toString();
    }

    public static List u(String str, String str2) {
        return Collections.singletonList(new FontParameter.TextStyleParameter(str, str2));
    }

    public static void v(Parcel parcel, int i12, Double d12) {
        parcel.writeInt(i12);
        parcel.writeDouble(d12.doubleValue());
    }

    public static void w(Image image, ImageRequest.a aVar) {
        aVar.d(com.avito.android.image_loader.b.b(image));
        aVar.c();
    }

    @Override // com.avito.android.arch.mvi.t
    public Object b(Object obj) {
        return null;
    }

    @Override // io.reactivex.rxjava3.core.C
    public void f(io.reactivex.rxjava3.core.B b12) {
        UserKeysAnalyticsTask.execute$lambda$0(b12);
    }

    @Override // io.reactivex.rxjava3.core.M
    public void j(final K k12) {
        Adjust.getAdid(new OnAdidReadListener() { // from class: com.avito.android.analytics_adjust.j
            @Override // com.adjust.sdk.OnAdidReadListener
            public final void onAdidRead(String str) {
                K k13 = k12;
                if (str != null) {
                    k13.onSuccess(str);
                } else {
                    k13.onSuccess("");
                }
            }
        });
    }

    @Override // com.avito.android.code_check_public.c
    public Object k0(Context context) {
        switch (this.f75119b) {
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.auto_recovery_code_check_code_subtitle_margin_top));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.auto_recovery_code_check_phone_legal_margin_top));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new AttributedText("{{text}}", Collections.singletonList(new FontAttribute("text", context.getString(R.string.auto_recovery_code_check_phone_legal), u(null, "m20"))), 1);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.auto_recovery_code_check_code_subtitle_margin_top));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.auto_recovery_code_check_phone_input_margin_top));
            default:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.auto_recovery_code_check_phone_subtitle_margin_top));
        }
    }

    @Override // com.yandex.mobile.ads.common.InitializationListener
    public void onInitializationCompleted() {
        V2.f318762a.b("Yandex Mobile Ads SDK initialized", null);
    }

    @Override // com.avito.android.arch.mvi.u
    public Object a(Object obj, Object obj2) {
        return obj2;
    }
}
