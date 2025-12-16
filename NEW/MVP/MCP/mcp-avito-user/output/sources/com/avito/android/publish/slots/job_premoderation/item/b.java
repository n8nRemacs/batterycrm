package com.avito.android.publish.slots.job_premoderation.item;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: JobPremoderationItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/job_premoderation/item/b;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f244442b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f244443c;

    public b(@Y61.k String str, @Y61.k a aVar) {
        this.f244442b = str;
        this.f244443c = aVar;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222267b() {
        return getF244442b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243440b() {
        return this.f244442b;
    }
}
