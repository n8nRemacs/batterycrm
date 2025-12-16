package com.avito.android.deeplink_factory.di;

import Y61.k;
import com.avito.android.remote.parse.adapter.C34382z;
import com.google.gson.r;
import dagger.internal.h;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: DeepLinkFactoryModule_ProvideTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deeplink_factory/di/e;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f134188a = new e();

    @Override // javax.inject.Provider
    public final Object get() {
        a.f134166a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        new C34382z();
        linkedHashSet.add(C34382z.a());
        return linkedHashSet;
    }
}
