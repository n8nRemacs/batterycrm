package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PreviewActivity.android.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/n;", "<init>", "()V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PreviewActivity extends androidx.view.n {
    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) throws ClassNotFoundException, SecurityException {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        String strR0 = C43066x.r0(stringExtra, '.');
        String strN0 = C43066x.n0('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            androidx.view.compose.j.a(this, new C22096n(-840626948, new B(strR0, strN0), true));
            return;
        }
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException unused) {
            H.f42758a.getClass();
            cls = null;
        }
        Object[] objArrA = J.a(cls, getIntent().getIntExtra("parameterProviderIndex", -1));
        if (objArrA.length > 1) {
            androidx.view.compose.j.a(this, new C22096n(-861939235, new F(strR0, strN0, objArrA), true));
        } else {
            androidx.view.compose.j.a(this, new C22096n(-1901447514, new G(strR0, strN0, objArrA), true));
        }
    }
}
