package com.vk.api.sdk.ui;

import Fc1.D3;
import Y61.k;
import Y61.l;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.vk.api.sdk.ui.VKConfirmationActivity;
import com.vk.api.sdk.utils.o;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VKConfirmationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/vk/api/sdk/ui/VKConfirmationActivity;", "Landroid/app/Activity;", "<init>", "()V", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class VKConfirmationActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f366697b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static boolean f366698c;

    /* compiled from: VKConfirmationActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/api/sdk/ui/VKConfirmationActivity$a;", "", "<init>", "()V", "", "KEY_MESSAGE", "Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
        o.f366748a.getClass();
        o.b();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        final int i12 = 0;
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this, 5).setTitle(R.string.vk_confirm).setMessage(getIntent().getStringExtra("key_message")).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener(this) { // from class: J11.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKConfirmationActivity f8727c;

            {
                this.f8727c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                switch (i12) {
                    case 0:
                        VKConfirmationActivity.f366698c = true;
                        this.f8727c.finish();
                        break;
                    default:
                        VKConfirmationActivity.f366698c = false;
                        this.f8727c.finish();
                        break;
                }
            }
        });
        final int i13 = 1;
        positiveButton.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener(this) { // from class: J11.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VKConfirmationActivity f8727c;

            {
                this.f8727c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i132) {
                switch (i13) {
                    case 0:
                        VKConfirmationActivity.f366698c = true;
                        this.f8727c.finish();
                        break;
                    default:
                        VKConfirmationActivity.f366698c = false;
                        this.f8727c.finish();
                        break;
                }
            }
        }).setOnCancelListener(new D3(this, 2)).show();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        o.f366748a.getClass();
        o.b();
    }
}
