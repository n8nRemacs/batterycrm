package com.avito.android.messenger.map.search;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GeoSearchFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.search.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32534e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeoSearchFragment f196561b;

    public C32534e(GeoSearchFragment geoSearchFragment) {
        this.f196561b = geoSearchFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str = (String) obj;
        q qVar = this.f196561b.f196486n0;
        if (qVar == null) {
            qVar = null;
        }
        qVar.g4(str);
    }
}
