package com.avito.android.edit_address.adapter.add_schedule;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import dy.InterfaceC39826b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddScheduleItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/adapter/add_schedule/a;", "Ldy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements InterfaceC39826b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145767b;

    public a() {
        this(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f145767b, ((a) obj).f145767b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270234b() {
        return this.f145767b;
    }

    public final int hashCode() {
        return this.f145767b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("AddScheduleItem(stringId="), this.f145767b, ')');
    }

    public a(String str, int i12, C42822w c42822w) {
        this.f145767b = (i12 & 1) != 0 ? "add_schedule_item" : str;
    }
}
