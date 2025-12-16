package wA0;

import com.avito.android.support_bottom_sheet.SupportDialogDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SupportDialogDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: wA0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49478d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C49476b f441311a;

    public C49478d(C49476b c49476b) {
        this.f441311a = c49476b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C49476b c49476b = this.f441311a;
        C49477c.f441310a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SupportDialogDeeplink.class, new C49479e(), new C43834a.b.C11809b(c49476b));
    }
}
