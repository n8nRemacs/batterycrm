package ru.ok.messages.location;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import defpackage.cf8;
import defpackage.cn8;
import defpackage.d6;
import defpackage.n1d;
import defpackage.ol6;
import defpackage.q0d;

/* loaded from: classes2.dex */
public class ActLocationMap extends d6 implements ol6 {
    public static final /* synthetic */ int S0 = 0;

    @Override // defpackage.d6
    public final String G() {
        return null;
    }

    @Override // defpackage.d6
    public final void H(int i, int i2, Intent intent) {
        a aVarD = z().D("ru.ok.messages.location.FrgLocationMap");
        if (aVarD instanceof FrgLocationMap) {
            ((FrgLocationMap) aVarD).w0(i, i2, intent);
        }
    }

    @Override // defpackage.ol6
    public final void b() {
        a aVarD = z().D("ru.ok.messages.location.FrgLocationMap");
        if (aVarD instanceof FrgLocationMap) {
            ((FrgLocationMap) aVarD).b();
        }
    }

    @Override // defpackage.ol6
    public final void g() {
        a aVarD = z().D("ru.ok.messages.location.FrgLocationMap");
        if (aVarD instanceof FrgLocationMap) {
            ((FrgLocationMap) aVarD).getClass();
        }
    }

    @Override // defpackage.ol6
    public final void i() {
        a aVarD = z().D("ru.ok.messages.location.FrgLocationMap");
        if (aVarD instanceof FrgLocationMap) {
            ((FrgLocationMap) aVarD).getClass();
        }
    }

    @Override // defpackage.d6, androidx.fragment.app.b, defpackage.nl3, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(n1d.act_single_fragment);
        K(this.M0.L);
        if (bundle != null) {
            return;
        }
        Intent intent = getIntent();
        long longExtra = intent.getLongExtra("ru.ok.tamtam.extra.CHAT_ID", 0L);
        long longExtra2 = intent.getLongExtra("ru.ok.tamtam.extra.MESSAGE_ID", 0L);
        long longExtra3 = intent.getLongExtra("ru.ok.tamtam.extra.CONTACT_ID", 0L);
        cf8 cf8Var = (cf8) intent.getSerializableExtra("ru.ok.tamtam.extra.LOCATION");
        if (cf8Var == null) {
            cf8Var = cf8.Y;
        }
        float floatExtra = intent.getFloatExtra("ru.ok.tamtam.extra.ZOOM", 14.0f);
        boolean booleanExtra = intent.getBooleanExtra("ru.ok.tamtam.extra.LIVE", false);
        long longExtra4 = intent.getLongExtra("ru.ok.tamtam.extra.DATE", 0L);
        long longExtra5 = intent.getLongExtra("map:REQUEST_MESSAGE_ID", 0L);
        boolean booleanExtra2 = intent.getBooleanExtra("ru.ok.tamtam.extra.ACTIVE", false);
        String stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.DEVICE_ID");
        boolean booleanExtra3 = intent.getBooleanExtra("map:DISABLE_LIVE", false);
        boolean booleanExtra4 = intent.getBooleanExtra("map:REGULAR_SENDING", true);
        FrgLocationMap frgLocationMap = new FrgLocationMap();
        Bundle bundle2 = new Bundle();
        bundle2.putLong("ru.ok.tamtam.extra.CHAT_ID", longExtra);
        bundle2.putLong("ru.ok.tamtam.extra.MESSAGE_ID", longExtra2);
        bundle2.putLong("ru.ok.tamtam.extra.CONTACT_ID", longExtra3);
        bundle2.putSerializable("ru.ok.tamtam.extra.LOCATION", cf8Var);
        bundle2.putFloat("ru.ok.tamtam.extra.ZOOM", floatExtra);
        bundle2.putBoolean("ru.ok.tamtam.extra.LIVE", booleanExtra);
        bundle2.putLong("ru.ok.tamtam.extra.DATE", longExtra4);
        bundle2.putLong("ru.ok.tamtam.extra.REQUEST_MESSAGE_ID", longExtra5);
        bundle2.putBoolean("ru.ok.tamtam.extra.ACTIVE", booleanExtra2);
        bundle2.putString("ru.ok.tamtam.extra.DEVICE_ID", stringExtra);
        bundle2.putBoolean("ru.ok.tamtam.extra.DISABLE_LIVE", booleanExtra3);
        bundle2.putBoolean("ru.ok.tamtam.extra.REGULAR_SENDING", booleanExtra4);
        frgLocationMap.n0(bundle2);
        cn8.a(z(), q0d.act_single_fragment__container, frgLocationMap, "ru.ok.messages.location.FrgLocationMap");
    }
}
