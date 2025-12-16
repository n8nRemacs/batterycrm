package com.avito.android.di.module;

import com.avito.android.C36135w2;
import com.avito.android.C36168y2;
import com.avito.android.remote.parse.adapter.SerpElementTypeAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ur.InterfaceC49101b;

/* compiled from: SearchJsonModule_ProvideSerpTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/y7;", "Ldagger/internal/h;", "Lcom/avito/android/remote/parse/adapter/SerpElementTypeAdapter;", "a", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.y7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30248y7 implements dagger.internal.h<SerpElementTypeAdapter> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f144723f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36168y2 f144724a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.p f144725b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.p f144726c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ur.e f144727d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.parse.adapter.U f144728e;

    /* compiled from: SearchJsonModule_ProvideSerpTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/y7$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.y7$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30248y7(@Y61.k C36168y2 c36168y2, @Y61.k dagger.internal.p pVar, @Y61.k dagger.internal.p pVar2, @Y61.k ur.e eVar, @Y61.k com.avito.android.remote.parse.adapter.U u12) {
        this.f144724a = c36168y2;
        this.f144725b = pVar;
        this.f144726c = pVar2;
        this.f144727d = eVar;
        this.f144728e = u12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C36135w2 c36135w2 = (C36135w2) this.f144724a.get();
        Map map = (Map) this.f144725b.get();
        Map map2 = (Map) this.f144726c.get();
        InterfaceC49101b interfaceC49101b = (InterfaceC49101b) this.f144727d.get();
        com.avito.android.remote.parse.adapter.T t12 = (com.avito.android.remote.parse.adapter.T) this.f144728e.get();
        f144723f.getClass();
        int i12 = C30226w7.f144694a;
        if (!interfaceC49101b.d()) {
            map = map2;
        }
        return new SerpElementTypeAdapter(c36135w2, map, t12);
    }
}
