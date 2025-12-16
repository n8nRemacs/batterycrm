package com.avito.android.gsm_call_starter.impl_module.screen;

import A91.p;
import Y61.l;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FakeSystemDialerActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gsm_call_starter/impl_module/screen/FakeSystemDialerActivity;", "Landroid/app/Activity;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_gsm-call-starter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FakeSystemDialerActivity extends Activity implements InterfaceC28477j.a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f161248b = 0;

    /* compiled from: FakeSystemDialerActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/gsm_call_starter/impl_module/screen/FakeSystemDialerActivity$a;", "", "<init>", "()V", "", "ACTION", "Ljava/lang/String;", "TEL", "_avito_gsm-call-starter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.system_dialer_fake_activity);
        findViewById(R.id.fake_dialer_close_button).setOnClickListener(new p(this, 14));
        TextView textView = (TextView) findViewById(R.id.fake_dialer_activity_action);
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("activity_action") : null;
        if (string == null) {
            string = "";
        }
        textView.setText(string);
        TextView textView2 = (TextView) findViewById(R.id.fake_dialer_activity_tel);
        Bundle extras2 = getIntent().getExtras();
        String string2 = extras2 != null ? extras2.getString("activity_tel") : null;
        textView2.setText(string2 != null ? string2 : "");
    }
}
