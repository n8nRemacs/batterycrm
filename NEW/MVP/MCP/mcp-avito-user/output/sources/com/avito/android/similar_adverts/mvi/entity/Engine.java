package com.avito.android.similar_adverts.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SimilarAdvertsState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/similar_adverts/mvi/entity/Engine;", "", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Engine {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Engine[] f283963b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f283964c;

    static {
        Engine[] engineArr = {new Engine("SIMILAR", 0), new Engine("SIMILAR_MP", 1), new Engine("SHOP_SIMILAR", 2), new Engine("MARKETPLACE", 3)};
        f283963b = engineArr;
        f283964c = c.a(engineArr);
    }

    public static Engine valueOf(String str) {
        return (Engine) Enum.valueOf(Engine.class, str);
    }

    public static Engine[] values() {
        return (Engine[]) f283963b.clone();
    }
}
