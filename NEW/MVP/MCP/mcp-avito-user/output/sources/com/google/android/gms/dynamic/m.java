package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class m implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f349657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f349658c;

    public m(Context context, Intent intent) {
        this.f349657b = context;
        this.f349658c = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f349657b.startActivity(this.f349658c);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
