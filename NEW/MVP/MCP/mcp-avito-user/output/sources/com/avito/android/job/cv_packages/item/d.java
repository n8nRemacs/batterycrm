package com.avito.android.job.cv_packages.item;

import Y61.k;
import kotlin.Metadata;

/* compiled from: PackageItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_packages/item/d;", "Lcom/avito/conveyor_item/a;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174400b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f174401c;

    public d(@k String str, @k a aVar) {
        this.f174400b = str;
        this.f174401c = aVar;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124056b() {
        return getF174400b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF174400b() {
        return this.f174400b;
    }
}
