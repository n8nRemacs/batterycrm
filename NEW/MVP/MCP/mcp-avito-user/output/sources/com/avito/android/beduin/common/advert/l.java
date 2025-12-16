package com.avito.android.beduin.common.advert;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinFavoriteAdvertManagerImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class l extends N implements Y41.l<String, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map<String, Boolean> f100556l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f100557m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Map map, LinkedHashMap linkedHashMap) {
        super(1);
        this.f100556l = map;
        this.f100557m = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final Boolean invoke(String str) {
        String str2 = str;
        return (Boolean) this.f100556l.getOrDefault(str2, this.f100557m.getOrDefault(str2, Boolean.FALSE));
    }
}
