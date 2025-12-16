package com.vk.api.sdk.ui;

import Fc1.D3;
import J11.c;
import Y61.k;
import Y61.l;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.avito.android.R;
import com.vk.api.sdk.C;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import com.vk.api.sdk.utils.n;
import com.vk.api.sdk.utils.o;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VKCaptchaActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/vk/api/sdk/ui/VKCaptchaActivity;", "Landroid/app/Activity;", "<init>", "()V", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class VKCaptchaActivity extends Activity {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f366692e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @l
    public static String f366693f;

    /* renamed from: b, reason: collision with root package name */
    public EditText f366694b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f366695c;

    /* renamed from: d, reason: collision with root package name */
    public ProgressBar f366696d;

    /* compiled from: VKCaptchaActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/api/sdk/ui/VKCaptchaActivity$a;", "", "<init>", "()V", "", "KEY_URL", "Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        LinearLayout linearLayout = new LinearLayout(this);
        n.f366742a.getClass();
        int iCeil = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 12);
        int iMax = (int) (Math.max(1.0f, Resources.getSystem().getDisplayMetrics().density) * 130.0f);
        int iMax2 = (int) (Math.max(1.0f, Resources.getSystem().getDisplayMetrics().density) * 50.0f);
        linearLayout.setPadding(iCeil, iCeil, iCeil, iCeil);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMax, iMax2);
        layoutParams.bottomMargin = iCeil;
        frameLayout.setLayoutParams(layoutParams);
        this.f366696d = new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        ProgressBar progressBar = this.f366696d;
        progressBar.getClass();
        progressBar.setLayoutParams(layoutParams2);
        ProgressBar progressBar2 = this.f366696d;
        progressBar2.getClass();
        frameLayout.addView(progressBar2);
        this.f366695c = new ImageView(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        ImageView imageView = this.f366695c;
        imageView.getClass();
        imageView.setLayoutParams(layoutParams3);
        ImageView imageView2 = this.f366695c;
        imageView2.getClass();
        frameLayout.addView(imageView2);
        linearLayout.addView(frameLayout);
        EditText editText = new EditText(this);
        this.f366694b = editText;
        editText.setInputType(176);
        EditText editText2 = this.f366694b;
        editText2.getClass();
        editText2.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iMax, -2);
        EditText editText3 = this.f366694b;
        editText3.getClass();
        editText3.setLayoutParams(layoutParams4);
        View view = this.f366694b;
        view.getClass();
        linearLayout.addView(view);
        final int i12 = 0;
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this, 5).setView(linearLayout).setTitle(R.string.vk_captcha_hint).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener(this) { // from class: J11.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKCaptchaActivity f8719c;

            {
                this.f8719c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                VKCaptchaActivity vKCaptchaActivity = this.f8719c;
                switch (i12) {
                    case 0:
                        EditText editText4 = vKCaptchaActivity.f366694b;
                        editText4.getClass();
                        VKCaptchaActivity.f366693f = editText4.getText().toString();
                        o.f366748a.getClass();
                        o.b();
                        vKCaptchaActivity.finish();
                        break;
                    default:
                        VKCaptchaActivity.a aVar = VKCaptchaActivity.f366692e;
                        VKCaptchaActivity.f366693f = null;
                        o.f366748a.getClass();
                        o.b();
                        vKCaptchaActivity.setResult(0);
                        vKCaptchaActivity.finish();
                        break;
                }
            }
        });
        final int i13 = 1;
        positiveButton.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener(this) { // from class: J11.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKCaptchaActivity f8719c;

            {
                this.f8719c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i132) {
                VKCaptchaActivity vKCaptchaActivity = this.f8719c;
                switch (i13) {
                    case 0:
                        EditText editText4 = vKCaptchaActivity.f366694b;
                        editText4.getClass();
                        VKCaptchaActivity.f366693f = editText4.getText().toString();
                        o.f366748a.getClass();
                        o.b();
                        vKCaptchaActivity.finish();
                        break;
                    default:
                        VKCaptchaActivity.a aVar = VKCaptchaActivity.f366692e;
                        VKCaptchaActivity.f366693f = null;
                        o.f366748a.getClass();
                        o.b();
                        vKCaptchaActivity.setResult(0);
                        vKCaptchaActivity.finish();
                        break;
                }
            }
        }).setOnCancelListener(new D3(this, 1)).show();
        EditText editText4 = this.f366694b;
        editText4.getClass();
        editText4.requestFocus();
        String stringExtra = getIntent().getStringExtra("key_url");
        C.f366522a.getClass();
        ((ExecutorService) C.f366525d.getValue()).submit(new c(0, stringExtra, this));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        o.f366748a.getClass();
        o.b();
        super.onDestroy();
    }
}
