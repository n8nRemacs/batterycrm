package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog;

import Y41.l;
import android.os.Bundle;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBedType;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SleepingPlacesBedTypesDialog.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a extends N implements l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f244957l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Integer f244958m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f244959n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f244960o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ArrayList f244961p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Integer num, String str, String str2, ArrayList arrayList, boolean z12) {
        super(1);
        this.f244957l = z12;
        this.f244958m = num;
        this.f244959n = str;
        this.f244960o = str2;
        this.f244961p = arrayList;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("selected_bed_type_redesigned", this.f244957l);
        Integer num = this.f244958m;
        if (num != null) {
            bundle2.putInt("selected_bed_type_id", num.intValue());
        }
        bundle2.putString("selected_bed_type_title", this.f244959n);
        bundle2.putString("selected_bed_type_subtitle", this.f244960o);
        ArrayList arrayList = this.f244961p;
        bundle2.putParcelableArray("selected_bed_type_bed_list_data", arrayList != null ? (SleepingPlacesBedType[]) arrayList.toArray(new SleepingPlacesBedType[0]) : null);
        return G0.f406611a;
    }
}
