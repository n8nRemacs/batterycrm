package com.avito.android.rating_form.select_item.adapter.advert;

import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/select_item/adapter/advert/a;", "Lcom/avito/conveyor_item/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f248902b;

    /* renamed from: c, reason: collision with root package name */
    public final long f248903c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f248904d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f248905e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f248906f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Image f248907g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f248908h;

    public a(@Y61.l Image image, @Y61.k String str, boolean z12, @Y61.l String str2, long j12, @Y61.l String str3, @Y61.l String str4) {
        this.f248902b = str;
        this.f248903c = j12;
        this.f248904d = str2;
        this.f248905e = str3;
        this.f248906f = str4;
        this.f248907g = image;
        this.f248908h = z12;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207394c() {
        return getF248902b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF248902b() {
        return this.f248902b;
    }

    public /* synthetic */ a(String str, long j12, String str2, String str3, String str4, String str5, Image image, boolean z12, int i12, C42822w c42822w) {
        this(image, str, (i12 & 128) != 0 ? true : z12, str2, j12, str3, str4);
    }
}
