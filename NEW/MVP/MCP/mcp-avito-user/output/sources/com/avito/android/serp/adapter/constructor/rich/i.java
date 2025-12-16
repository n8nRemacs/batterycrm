package com.avito.android.serp.adapter.constructor.rich;

import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import kotlin.Metadata;
import y80.C50082a;
import y80.C50083b;

/* compiled from: ConstructorAdvertItemRichPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/constructor/rich/i;", "Lz80/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements z80.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f269677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f269678b;

    public i(SerpConstructorAdvertItem serpConstructorAdvertItem, z zVar) {
        this.f269677a = zVar;
        this.f269678b = serpConstructorAdvertItem;
    }

    @Override // z80.e
    public final void a(@Y61.l Integer num) {
        z zVar = this.f269677a;
        String strA = zVar.f269717f.a();
        SerpConstructorAdvertItem serpConstructorAdvertItem = this.f269678b;
        Integer categoryId = serpConstructorAdvertItem.getCategoryId();
        zVar.f269716e.c(new C50082a(strA, categoryId != null ? categoryId.toString() : null, serpConstructorAdvertItem.getF80719f(), num, null, PinchToZoomSource.f219964c));
    }

    @Override // z80.e
    public final void b() {
        z zVar = this.f269677a;
        String strA = zVar.f269717f.a();
        SerpConstructorAdvertItem serpConstructorAdvertItem = this.f269678b;
        Integer categoryId = serpConstructorAdvertItem.getCategoryId();
        zVar.f269716e.c(new C50083b(strA, categoryId != null ? categoryId.toString() : null, serpConstructorAdvertItem.getF80719f(), null, PinchToZoomSource.f219964c));
    }
}
