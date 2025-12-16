package com.avito.android.version_conflict;

import android.content.Context;
import com.avito.android.S;
import com.avito.android.di.module.C30102l3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VersionConflictIntentFactory_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/version_conflict/f;", "Ldagger/internal/h;", "Lcom/avito/android/version_conflict/e;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f325899c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30102l3 f325900a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final S f325901b;

    /* compiled from: VersionConflictIntentFactory_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/version_conflict/f$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k C30102l3 c30102l3, @Y61.k S s5) {
        this.f325900a = c30102l3;
        this.f325901b = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f325900a.get();
        this.f325901b.get();
        f325899c.getClass();
        return new e(context);
    }
}
