package com.avito.android.remote.parse.adapter;

import com.avito.android.C36135w2;
import com.avito.android.C36168y2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpElementEnricher_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/U;", "Ldagger/internal/h;", "Lcom/avito/android/remote/parse/adapter/T;", "a", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class U implements dagger.internal.h<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f254256b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36168y2 f254257a;

    /* compiled from: SerpElementEnricher_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/U$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public U(@Y61.k C36168y2 c36168y2) {
        this.f254257a = c36168y2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C36135w2 c36135w2 = (C36135w2) this.f254257a.get();
        f254256b.getClass();
        return new T(c36135w2);
    }
}
