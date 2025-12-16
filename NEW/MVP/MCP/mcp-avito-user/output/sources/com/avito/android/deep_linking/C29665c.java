package com.avito.android.deep_linking;

import com.avito.android.location.C31497a;
import com.avito.android.location.LocationSource;
import kotlin.Metadata;

/* compiled from: AppLinkDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/location/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/location/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.deep_linking.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29665c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C29667e f132897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f132898c;

    public C29665c(C29667e c29667e, String str) {
        this.f132897b = c29667e;
        this.f132898c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f132897b.f132902c.b(((C31497a) obj).f181722a, LocationSource.f181716h, this.f132898c);
    }
}
