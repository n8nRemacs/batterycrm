package com.avito.android.publish.slots.job_warning_toast.item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.component.toast.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: JobToastSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/job_warning_toast/item/a;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f244465b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f244466c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.component.toast.f f244467d;

    /* renamed from: e, reason: collision with root package name */
    public final int f244468e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final List<c.a> f244469f;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String str, @k String str2, @k com.avito.android.component.toast.f fVar, int i12, @l List<? extends c.a> list) {
        this.f244465b = str;
        this.f244466c = str2;
        this.f244467d = fVar;
        this.f244468e = i12;
        this.f244469f = list;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF244339b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF244339b() {
        return this.f244465b;
    }
}
