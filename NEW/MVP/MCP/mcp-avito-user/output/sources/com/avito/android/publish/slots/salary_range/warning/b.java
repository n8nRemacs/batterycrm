package com.avito.android.publish.slots.salary_range.warning;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: WarningItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/salary_range/warning/b;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f244837b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f244838c;

    public b(@k String str, @k String str2) {
        this.f244837b = str;
        this.f244838c = str2;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207385b() {
        return getF245148b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF245148b() {
        return this.f244837b;
    }
}
