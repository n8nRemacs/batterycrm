package com.avito.android.app.task;

/* compiled from: ChannelWarmUpTask_Factory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* renamed from: com.avito.android.app.task.t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28594t implements dagger.internal.h<ChannelWarmUpTask> {

    /* compiled from: ChannelWarmUpTask_Factory.java */
    /* renamed from: com.avito.android.app.task.t$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C28594t f91734a = new C28594t();
    }

    public static C28594t a() {
        return a.f91734a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new ChannelWarmUpTask();
    }
}
