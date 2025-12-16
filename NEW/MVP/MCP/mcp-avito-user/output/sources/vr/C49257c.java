package vR;

import com.avito.android.util.C35793f6;
import com.avito.android.util.C35801g6;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LfLevelsMapperImpl_Factory.java */
@e
@y
@x
/* renamed from: vR.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49257c implements h<C49256b> {

    /* renamed from: a, reason: collision with root package name */
    public final C35801g6 f440786a;

    public C49257c(C35801g6 c35801g6) {
        this.f440786a = c35801g6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f440786a.getClass();
        return new C49256b(new C35793f6());
    }
}
