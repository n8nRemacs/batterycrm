package Sb;

import android.app.Application;
import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AiAssistantIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<C15168a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f15092a;

    /* renamed from: b, reason: collision with root package name */
    public final O f15093b;

    public c(l lVar, O o12) {
        this.f15092a = lVar;
        this.f15093b = o12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C15168a((Application) this.f15092a.f393949a, (L) this.f15093b.get());
    }
}
