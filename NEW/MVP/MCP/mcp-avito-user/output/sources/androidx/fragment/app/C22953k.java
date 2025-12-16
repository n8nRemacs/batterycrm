package androidx.fragment.app;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.core.util.InterfaceC22791e;
import kotlinx.coroutines.channels.I0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C22953k implements InterfaceC22791e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46567c;

    public /* synthetic */ C22953k(Object obj, int i12) {
        this.f46566b = i12;
        this.f46567c = obj;
    }

    @Override // androidx.core.util.InterfaceC22791e
    public final void accept(Object obj) {
        switch (this.f46566b) {
            case 0:
                ((ActivityC22955m) this.f46567c).lambda$init$1((Configuration) obj);
                break;
            case 1:
                ((ActivityC22955m) this.f46567c).lambda$init$2((Intent) obj);
                break;
            default:
                ((I0) this.f46567c).w((androidx.window.layout.n) obj);
                break;
        }
    }
}
