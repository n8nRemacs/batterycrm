package ru.rustore.sdk.activitylauncher;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.rustore.sdk.activitylauncher.c;

/* compiled from: RuStoreActivityLauncher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/rustore/sdk/activitylauncher/RuStoreActivityLauncher;", "Landroid/app/Activity;", "<init>", "()V", "a", "sdk-public-activitylauncher_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RuStoreActivityLauncher extends Activity {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f436748d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public ResultReceiver f436749b;

    /* renamed from: c, reason: collision with root package name */
    public ru.rustore.sdk.activitylauncher.a f436750c;

    /* compiled from: RuStoreActivityLauncher.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/rustore/sdk/activitylauncher/RuStoreActivityLauncher$a;", "", "<init>", "()V", "", "KEY_CONFIRMATION_PENDING_INTENT", "Ljava/lang/String;", "KEY_RESULT_RECEIVER", "", "RC_CONFIRM", "I", "sdk-public-activitylauncher_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public final void a(int i12, Bundle bundle) {
        ResultReceiver resultReceiver = this.f436749b;
        if (resultReceiver == null) {
            resultReceiver = null;
        }
        resultReceiver.send(i12, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i12, int i13, @l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 == 0) {
            a(i13, intent != null ? intent.getExtras() : null);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(@l Bundle bundle) throws IntentSender.SendIntentException {
        Object parcelableExtra;
        Object parcelableExtra2;
        super.onCreate(bundle);
        this.f436750c = new ru.rustore.sdk.activitylauncher.a(getApplicationContext());
        Intent intent = getIntent();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            parcelableExtra = intent.getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, ResultReceiver.class);
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            parcelableExtra = intent.getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.f436749b = (ResultReceiver) parcelableExtra;
        if (bundle == null) {
            Intent intent2 = getIntent();
            if (i12 >= 33) {
                parcelableExtra2 = intent2.getParcelableExtra("CONFIRMATION_PENDING_INTENT", PendingIntent.class);
                if (parcelableExtra2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                parcelableExtra2 = intent2.getParcelableExtra("CONFIRMATION_PENDING_INTENT");
                if (parcelableExtra2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            try {
                startIntentSenderForResult(((PendingIntent) parcelableExtra2).getIntentSender(), 0, null, 0, 0, 0);
            } catch (ActivityNotFoundException e12) {
                ru.rustore.sdk.activitylauncher.a aVar = this.f436750c;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.a(e12);
                a(c.a.f436756b.f436755a, null);
            } catch (IntentSender.SendIntentException e13) {
                ru.rustore.sdk.activitylauncher.a aVar2 = this.f436750c;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.a(e13);
                a(c.e.f436759b.f436755a, null);
            } catch (Exception e14) {
                ru.rustore.sdk.activitylauncher.a aVar3 = this.f436750c;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                aVar3.a(e14);
                a(c.f.f436760b.f436755a, null);
            }
        }
    }
}
