package com.avito.android.advert_core.analytics.modelspecs;

import Y61.k;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShowModelCardEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/modelspecs/ModelCardFrom;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ModelCardFrom {

    /* renamed from: c, reason: collision with root package name */
    public static final ModelCardFrom f82828c;

    /* renamed from: d, reason: collision with root package name */
    public static final ModelCardFrom f82829d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ModelCardFrom[] f82830e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f82831f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82832b;

    static {
        ModelCardFrom modelCardFrom = new ModelCardFrom("GALLERY", 0, AdvertDetailsBlockIdKt.GALLERY_BLOCK);
        ModelCardFrom modelCardFrom2 = new ModelCardFrom("SPECS", 1, "specs");
        f82828c = modelCardFrom2;
        ModelCardFrom modelCardFrom3 = new ModelCardFrom("PRICES", 2, "prices");
        f82829d = modelCardFrom3;
        ModelCardFrom[] modelCardFromArr = {modelCardFrom, modelCardFrom2, modelCardFrom3, new ModelCardFrom("REVIEWS", 3, "reviews")};
        f82830e = modelCardFromArr;
        f82831f = c.a(modelCardFromArr);
    }

    public ModelCardFrom(String str, int i12, String str2) {
        this.f82832b = str2;
    }

    public static ModelCardFrom valueOf(String str) {
        return (ModelCardFrom) Enum.valueOf(ModelCardFrom.class, str);
    }

    public static ModelCardFrom[] values() {
        return (ModelCardFrom[]) f82830e.clone();
    }
}
