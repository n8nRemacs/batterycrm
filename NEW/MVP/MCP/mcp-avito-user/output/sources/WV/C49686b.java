package wv;

import Cd.D;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.delayed_ux_feedback.d;
import com.avito.android.delayed_ux_feedback.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RemoteUxFeedbackModule_Companion_ProvideDelayedFeedbackHelperFactory.java */
@e
@y
@x
/* renamed from: wv.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49686b implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<S0> f441852a;

    /* renamed from: b, reason: collision with root package name */
    public final u f441853b;

    public C49686b(u uVar, Provider provider) {
        this.f441852a = provider;
        this.f441853b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        S0 s02 = this.f441852a.get();
        D d12 = (D) this.f441853b.get();
        InterfaceC49685a.f441850a.getClass();
        return (d) new P0(s02, d12, null, 4, null).a(f.class);
    }
}
