package yg;

import com.avito.android.avl.deeplink.AvlLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AvlDeeplinkModule_ProvideVideoUploadPromotionLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: yg.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50246d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C50245c f443441a;

    /* renamed from: b, reason: collision with root package name */
    public final C50244b f443442b;

    public C50246d(C50245c c50245c, C50244b c50244b) {
        this.f443441a = c50245c;
        this.f443442b = c50244b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C50244b c50244b = this.f443442b;
        this.f443441a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AvlLink.class, new C50247e(), new C43834a.b.C11809b(c50244b));
    }
}
