package yN;

import com.avito.android.deep_linking.links.InfoPageLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: InfoDeeplinkMappingsModule_ProvideExternalAppLinkMappingFactory.java */
@e
@y
@x
/* renamed from: yN.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50147b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C50149d f443080a;

    public C50147b(C50149d c50149d) {
        this.f443080a = c50149d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C50149d c50149d = this.f443080a;
        C50146a.f443079a.getClass();
        return new C43834a(InfoPageLink.class, null, new C43834a.b.C11809b(c50149d));
    }
}
