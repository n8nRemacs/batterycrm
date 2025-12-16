package iQ0;

import com.avito.android.work_profile.profile.applies.mvi.i;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: AppliesToVacancyViewModel_Factory.java */
@e
@y
@x
/* renamed from: iQ0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41335c implements h<C41334b> {

    /* renamed from: a, reason: collision with root package name */
    public final i f398521a;

    public C41335c(i iVar) {
        this.f398521a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.work_profile.profile.applies.mvi.h hVar = (com.avito.android.work_profile.profile.applies.mvi.h) this.f398521a.get();
        i2.f411430a.getClass();
        return new C41334b(hVar, i2.a.f411433c);
    }
}
