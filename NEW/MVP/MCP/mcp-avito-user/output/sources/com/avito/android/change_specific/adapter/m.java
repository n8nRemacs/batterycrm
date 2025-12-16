package com.avito.android.change_specific.adapter;

import com.avito.android.remote.model.Specific;
import kotlin.Metadata;

/* compiled from: Specific.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/change_specific/adapter/m;", "Lcom/avito/conveyor_item/a;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Specific f117905b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f117906c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f117907d;

    public m(@Y61.k Specific specific, boolean z12, @Y61.k String str) {
        this.f117905b = specific;
        this.f117906c = z12;
        this.f117907d = str;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF94474b() {
        return getF96818b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96818b() {
        return this.f117907d;
    }
}
