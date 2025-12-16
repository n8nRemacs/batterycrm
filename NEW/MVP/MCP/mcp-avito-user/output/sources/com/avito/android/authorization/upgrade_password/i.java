package com.avito.android.authorization.upgrade_password;

import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class i implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f94817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f94818c;

    public /* synthetic */ i(x xVar, int i12) {
        this.f94817b = i12;
        this.f94818c = xVar;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f94817b) {
            case 0:
                x xVar = this.f94818c;
                xVar.f94851t = false;
                E e12 = xVar.f94845n;
                if (e12 != null) {
                    D6.k(e12.f94753e);
                    Button button = e12.f94752d;
                    button.setClickable(true);
                    button.setLoading(false);
                    break;
                }
                break;
            default:
                this.f94818c.h();
                break;
        }
    }
}
