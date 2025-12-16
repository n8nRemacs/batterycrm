package com.huawei.hms.support.api.push;

import android.app.Activity;
import android.os.Bundle;
import com.avito.android.R;
import z01.h;

/* loaded from: classes7.dex */
public class TransActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hwpush_trans_activity);
        getWindow().addFlags(67108864);
        h.a(this, getIntent());
        finish();
    }
}
