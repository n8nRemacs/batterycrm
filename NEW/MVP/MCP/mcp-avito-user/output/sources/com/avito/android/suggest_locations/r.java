package com.avito.android.suggest_locations;

import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SuggestLocation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import tF.C48547d;

/* compiled from: SuggestLocationsInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LtF/d;", "response", "Lcom/avito/android/suggest_locations/W;", "apply", "(LtF/d;)Lcom/avito/android/suggest_locations/W;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class r<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35154t f292354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f292355c;

    public r(C35154t c35154t, String str) {
        this.f292354b = c35154t;
        this.f292355c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ArrayList arrayList;
        InterfaceC35159y interfaceC35159y = this.f292354b.f292380c;
        List<Location> listA = ((C48547d) obj).a();
        if (listA != null) {
            List<Location> list = listA;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (Location location : list) {
                arrayList.add(new SuggestLocation(location.getId(), location.getNames(), null, null, null));
            }
        } else {
            arrayList = null;
        }
        return interfaceC35159y.a(this.f292355c, arrayList);
    }
}
