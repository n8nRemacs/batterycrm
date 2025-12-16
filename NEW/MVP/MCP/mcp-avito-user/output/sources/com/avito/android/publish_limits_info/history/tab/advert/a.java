package com.avito.android.publish_limits_info.history.tab.advert;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: HistoryAdvertItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish_limits_info/history/tab/advert/a;", "Lcom/avito/conveyor_item/a;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245886b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f245887c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f245888d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f245889e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f245890f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Boolean f245891g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f245892h;

    public a(@k String str, @k String str2, @k String str3, @k String str4, @l Image image, @l Boolean bool, @l String str5) {
        this.f245886b = str;
        this.f245887c = str2;
        this.f245888d = str3;
        this.f245889e = str4;
        this.f245890f = image;
        this.f245891g = bool;
        this.f245892h = str5;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF245314f().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF245314f() {
        return this.f245886b;
    }
}
