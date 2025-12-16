package Yz0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersImportantToNoteApi_Module_ProvideStrSellerOrdersImportantToNoteApiFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<InterfaceC18351a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f19755a;

    public c(f fVar) {
        this.f19755a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f19755a.get();
        b.f19754a.getClass();
        InterfaceC18351a interfaceC18351a = (InterfaceC18351a) r02.create(InterfaceC18351a.class);
        t.d(interfaceC18351a);
        return interfaceC18351a;
    }
}
