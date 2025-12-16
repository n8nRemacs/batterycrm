package com.avito.android.di.module;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ur.InterfaceC49101b;

/* compiled from: CoreModule_ProvideDefaultLocaleFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/m3;", "Ldagger/internal/h;", "Ljava/util/Locale;", "a", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.m3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30113m3 implements dagger.internal.h<Locale> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f144395b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ur.e f144396a;

    /* compiled from: CoreModule_ProvideDefaultLocaleFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/m3$a;", "", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.m3$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30113m3(@Y61.k C30080j3 c30080j3, @Y61.k ur.e eVar) {
        this.f144396a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49101b interfaceC49101b = (InterfaceC49101b) this.f144396a.get();
        f144395b.getClass();
        return interfaceC49101b.d() ? new Locale("ru") : Locale.getDefault();
    }
}
