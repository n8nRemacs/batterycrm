package com.avito.android.beduin.common.advert;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BeduinViewedAdvertManagerImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "kotlin.jvm.PlatformType", "viewedIds", "Lkotlin/G0;", "accept", "(Ljava/util/Set;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class x<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f100581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f100582c;

    public x(s sVar, ArrayList arrayList) {
        this.f100581b = sVar;
        this.f100582c = arrayList;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Set set = (Set) obj;
        s sVar = this.f100581b;
        sVar.f100572f.clear();
        sVar.f100572f.addAll(set);
        sVar.d(C42745f0.P0(this.f100582c), new w(set));
    }
}
