package hL;

import com.avito.android.iac_dialer_root.public_module.deeplink.IacLauncherIntentLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacLauncherIntentLinkModule_ProvideMappingFactory.java */
@e
@y
@x
/* renamed from: hL.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40845d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C40843b f397182a;

    public C40845d(C40843b c40843b) {
        this.f397182a = c40843b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C40843b c40843b = this.f397182a;
        C40844c.f397181a.getClass();
        return new C43834a(IacLauncherIntentLink.class, null, new C43834a.b.C11809b(c40843b));
    }
}
