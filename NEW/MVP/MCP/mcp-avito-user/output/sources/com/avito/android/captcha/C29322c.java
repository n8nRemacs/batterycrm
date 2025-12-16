package com.avito.android.captcha;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.akita.view.component.fieldset.Fieldset;
import com.avito.android.R;
import com.avito.android.captcha.q;
import com.avito.android.captcha.z;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.captcha.model.CaptchaType;
import g3.C40524a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AvitoCaptchaHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.captcha.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29322c extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f114971l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C29327h f114972m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Activity f114973n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29322c(View view, C29327h c29327h, Activity activity) {
        super(2);
        this.f114971l = view;
        this.f114972m = c29327h;
        this.f114973n = activity;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        BitmapDrawable bitmapDrawable;
        a.b bVar2 = bVar;
        View view = this.f114971l;
        bVar2.setCustomView(view);
        bVar2.G3();
        ImageView imageView = (ImageView) view.findViewById(R.id.avito_captcha_image);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.avito_captcha_image_placeholder);
        final C29327h c29327h = this.f114972m;
        String strM0 = c29327h.f115041c;
        if (strM0 == null) {
            bitmapDrawable = null;
        } else {
            try {
                if (C43066x.h0(strM0, "data:image/png;base64,", false)) {
                    strM0 = C43066x.m0(strM0, "data:image/png;base64,", strM0);
                }
                byte[] bArrDecode = Base64.decode(strM0, 0);
                bitmapDrawable = new BitmapDrawable(imageView.getContext().getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            } catch (Exception unused) {
            }
        }
        frameLayout.setVisibility(bitmapDrawable == null ? 0 : 8);
        if (bitmapDrawable != null) {
            ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
            aVar.f169484b = new ImageRequest.d.a(bitmapDrawable, null);
            aVar.f169485c = 0;
            aVar.e(12);
            aVar.c();
        }
        Fieldset fieldset = (Fieldset) view.findViewById(R.id.avito_captcha_error_fieldset);
        String string = c29327h.f115042d;
        fieldset.setVisibility(string == null ? 8 : 0);
        Activity activity = this.f114973n;
        if (string != null) {
            if (string.equals("SERVER_ERROR_MESSAGE")) {
                string = activity.getString(R.string.avito_libs_captcha_server_error);
            }
            fieldset.setState(new C40524a(null, new C40524a.AbstractC11185a.C11186a(string), C42784z0.f406748b, 1, null));
        }
        final int i12 = 0;
        ((Button) view.findViewById(R.id.avito_captcha_button_update)).setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.captcha.a
            /* JADX WARN: Type inference failed for: r5v3, types: [Y41.a, kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r5v5, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        ?? r52 = c29327h.f115050l;
                        if (r52 != 0) {
                            r52.invoke();
                            break;
                        }
                        break;
                    default:
                        C29327h c29327h2 = c29327h;
                        c29327h2.destroy();
                        ?? r53 = c29327h2.f115049k;
                        if (r53 != 0) {
                            r53.invoke(new z.d(new q.b("User cancelled", CaptchaType.AVITO_CAPTCHA)));
                            break;
                        }
                        break;
                }
            }
        });
        Input input = (Input) view.findViewById(R.id.avito_captcha_input);
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.avito_captcha_input_container);
        componentContainer.setComponentsResetListener(new C29321b(c29327h, input));
        ((Button) view.findViewById(R.id.avito_captcha_button_send)).setOnClickListener(new com.avito.android.advert_core.advert.f(c29327h, input, componentContainer, activity, 5));
        final int i13 = 1;
        ((Button) view.findViewById(R.id.avito_captcha_button_cancel)).setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.captcha.a
            /* JADX WARN: Type inference failed for: r5v3, types: [Y41.a, kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r5v5, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        ?? r52 = c29327h.f115050l;
                        if (r52 != 0) {
                            r52.invoke();
                            break;
                        }
                        break;
                    default:
                        C29327h c29327h2 = c29327h;
                        c29327h2.destroy();
                        ?? r53 = c29327h2.f115049k;
                        if (r53 != 0) {
                            r53.invoke(new z.d(new q.b("User cancelled", CaptchaType.AVITO_CAPTCHA)));
                            break;
                        }
                        break;
                }
            }
        });
        return G0.f406611a;
    }
}
