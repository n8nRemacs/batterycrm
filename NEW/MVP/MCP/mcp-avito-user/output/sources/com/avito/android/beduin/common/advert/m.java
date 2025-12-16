package com.avito.android.beduin.common.advert;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BeduinFavoriteAdvertManagerImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "idToIsFavorite", "Lkotlin/G0;", "accept", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f100558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f100559c;

    public m(f fVar, LinkedHashMap linkedHashMap) {
        this.f100558b = fVar;
        this.f100559c = linkedHashMap;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        LinkedHashMap linkedHashMap = this.f100559c;
        f.c(this.f100558b, linkedHashMap.keySet(), new l((Map) obj, linkedHashMap));
    }
}
