package com.avito.android.developments_agency_search.screen.location_group;

import Iw.InterfaceC14163a;
import com.avito.android.developments_agency_search.screen.location_group.LocationGroupDialogFragment;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LocationGroupDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "districtIds", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements Y41.l<List<? extends String>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LocationGroupDialogFragment f138117l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LocationGroupDialogFragment locationGroupDialogFragment) {
        super(1);
        this.f138117l = locationGroupDialogFragment;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends String> list) {
        LocationGroupDialogFragment.a aVar = LocationGroupDialogFragment.f138049q0;
        this.f138117l.f5().accept(new InterfaceC14163a.c(list));
        return G0.f406611a;
    }
}
