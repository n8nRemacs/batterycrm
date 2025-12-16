package com.geetest.captcha;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* loaded from: classes4.dex */
public final class e implements DialogInterface.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f342708a;

    public e(z zVar) {
        this.f342708a = zVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(@Y61.l DialogInterface dialogInterface, int i12, @Y61.l KeyEvent keyEvent) {
        if (i12 != 4 || keyEvent == null || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1) {
            return false;
        }
        this.f342708a.b();
        return false;
    }
}
