package com.avito.android.advertising.loaders.beduin;

import com.avito.android.advertising.CommercialItem;
import com.avito.beduin.v2.engine.C36272i;
import kotlin.Metadata;

/* compiled from: CommercialBDUIBannerGetInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advertising/CommercialItem;", "commercialItem", "Lcom/avito/beduin/v2/engine/field/entity/A;", "apply", "(Lcom/avito/android/advertising/CommercialItem;)Lcom/avito/beduin/v2/engine/field/entity/A;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advertising.loaders.beduin.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28352f<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36272i f88131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C28347a f88132c;

    public C28352f(C36272i c36272i, C28347a c28347a) {
        this.f88131b = c36272i;
        this.f88132c = c28347a;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return C28355i.b((CommercialItem) obj, this.f88131b, this.f88132c.f88105j);
    }
}
