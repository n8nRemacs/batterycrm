package com.avito.android.location_list;

import com.avito.android.remote.model.Location;
import com.avito.android.util.V2;
import java.util.List;
import kotlin.Metadata;
import tF.C48547d;

/* compiled from: LocationListInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LtF/d;", "it", "Lkotlin/G0;", "accept", "(LtF/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class L<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f181873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f181874c;

    public L(P p12, String str) {
        this.f181873b = p12;
        this.f181874c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List<Location> listA = ((C48547d) obj).a();
        String str = this.f181874c;
        if (listA != null) {
            this.f181873b.f181893f.put(str, listA);
        }
        V2.f318762a.c("LocationListInteractor", "search put query: " + str, null);
    }
}
