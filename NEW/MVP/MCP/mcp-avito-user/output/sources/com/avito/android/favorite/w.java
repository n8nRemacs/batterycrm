package com.avito.android.favorite;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import qu.C47445a;
import qu.InterfaceC47447c;

/* compiled from: FavoritesPersistentStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/w;", "Lcom/avito/android/favorite/x;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class w implements x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47447c f155238a;

    public w(@Y61.k InterfaceC47447c interfaceC47447c) {
        this.f155238a = interfaceC47447c;
    }

    @Override // com.avito.android.favorite.x
    public final boolean b(@Y61.k String str, boolean z12) {
        return this.f155238a.b(str, z12);
    }

    @Override // com.avito.android.favorite.x
    public final void c(@Y61.k List<String> list) {
        this.f155238a.c(list);
    }

    @Override // com.avito.android.favorite.x
    @Y61.k
    public final Map<String, Boolean> d(@Y61.k List<String> list) {
        return this.f155238a.d(list);
    }

    @Override // com.avito.android.favorite.x
    public final void e(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.f155238a.e(str, str2, str3);
    }

    @Override // com.avito.android.favorite.x
    public final boolean f(@Y61.k String str) {
        return this.f155238a.f(str);
    }

    @Override // com.avito.android.favorite.x
    public final void g(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.f155238a.g(str, str2, str3);
    }

    @Override // com.avito.android.favorite.x
    public final int getCount() {
        return this.f155238a.getCount();
    }

    @Override // com.avito.android.favorite.x
    @Y61.k
    public final List<String> h() {
        return this.f155238a.h();
    }

    @Override // com.avito.android.favorite.x
    @Y61.k
    public final Map<C47445a, List<String>> i() {
        return this.f155238a.i();
    }

    @Override // com.avito.android.favorite.x
    @Y61.k
    public final Map<C47445a, List<String>> j() {
        return this.f155238a.j();
    }

    @Override // com.avito.android.favorite.x
    @Y61.k
    public final List<String> l() {
        return this.f155238a.l();
    }

    @Override // com.avito.android.favorite.x
    public final void m(@Y61.k String str, @Y61.l String str2) {
        this.f155238a.m(str, str2);
    }

    @Override // com.avito.android.favorite.x
    public final void wipe() {
        this.f155238a.wipe();
    }
}
