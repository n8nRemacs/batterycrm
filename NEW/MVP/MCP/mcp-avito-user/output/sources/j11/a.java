package J11;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VKBaseAuthActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LJ11/a;", "Landroid/app/Activity;", "<init>", "()V", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public boolean f8716b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8717c;

    /* compiled from: VKBaseAuthActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LJ11/a$a;", "", "<init>", "()V", "", "KEY_WAITING_FOR_AUTH_RESULT", "Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: J11.a$a, reason: collision with other inner class name */
    public static final class C0502a {
        public /* synthetic */ C0502a(C42822w c42822w) {
            this();
        }

        public C0502a() {
        }
    }

    static {
        new C0502a(null);
    }

    @k
    public abstract Intent a();

    public abstract boolean b();

    public abstract boolean c();

    public final void d(Intent intent, boolean z12) {
        Uri data = intent == null ? null : intent.getData();
        if (this.f8717c || !c() || data == null) {
            if (z12) {
                setResult(-1, a());
                finish();
                this.f8717c = false;
                return;
            }
            return;
        }
        if (!b()) {
            finish();
        } else {
            this.f8717c = true;
            this.f8716b = true;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        this.f8717c = bundle == null ? false : bundle.getBoolean("VK_waitingForAuthResult", false);
        d(getIntent(), false);
    }

    @Override // android.app.Activity
    public final void onNewIntent(@l Intent intent) {
        super.onNewIntent(intent);
        d(intent, true);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f8716b = false;
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.f8717c || this.f8716b) {
            return;
        }
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("VK_waitingForAuthResult", this.f8717c);
    }
}
