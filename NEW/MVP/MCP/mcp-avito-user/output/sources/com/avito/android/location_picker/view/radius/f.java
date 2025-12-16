package com.avito.android.location_picker.view.radius;

import Y61.k;
import Y61.l;
import com.avito.android.lib.design.chips.Chips;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RadiusListItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location_picker/view/radius/f;", "Lcom/avito/android/location_picker/view/radius/d;", "<init>", "()V", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<a> f182791a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f182792b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Integer f182793c;

    public f() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f182791a = cVar;
        this.f182792b = cVar;
    }

    public final void a(@k i iVar, @k ArrayList arrayList) {
        this.f182793c = Integer.valueOf(arrayList.size());
        for (Object obj : arrayList) {
            Boolean bool = ((a) obj).f182787d;
            if (bool != null ? bool.booleanValue() : false) {
                com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) obj;
                e eVar = new e(arrayList, this);
                Chips chips = iVar.f182795a;
                chips.setData(arrayList);
                chips.setMaxSelected(arrayList.size());
                chips.setKeepSelected(true);
                chips.j();
                if (hVar != null) {
                    chips.q(hVar, true);
                    chips.o(hVar, false);
                }
                chips.setChipsSelectedListener(new h(eVar));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
