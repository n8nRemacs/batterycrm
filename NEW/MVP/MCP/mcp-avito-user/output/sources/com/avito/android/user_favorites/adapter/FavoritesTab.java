package com.avito.android.user_favorites.adapter;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoritesTab.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_favorites/adapter/FavoritesTab;", "Lcom/avito/android/lib/deprecated_design/tab/a;", "Landroid/os/Parcelable;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class FavoritesTab implements com.avito.android.lib.deprecated_design.tab.a, Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final int f316829b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f316830c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f316831d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f316832e;

    public FavoritesTab(int i12, @k String str, @l String str2, @l String str3) {
        this.f316829b = i12;
        this.f316830c = str;
        this.f316831d = str2;
        this.f316832e = str3;
    }

    @l
    /* renamed from: c, reason: from getter */
    public String getF316832e() {
        return this.f316832e;
    }

    /* renamed from: d, reason: from getter */
    public int getF316829b() {
        return this.f316829b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @l
    /* renamed from: getLabel, reason: from getter */
    public String getF316831d() {
        return this.f316831d;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public String getF316830c() {
        return this.f316830c;
    }

    public /* synthetic */ FavoritesTab(int i12, String str, String str2, String str3, int i13, C42822w c42822w) {
        this(i12, str, str2, (i13 & 8) != 0 ? null : str3);
    }
}
