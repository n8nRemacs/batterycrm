package com.avito.android.bxcontent.mvi;

import com.avito.android.avl_public.repo.BaseAvlVideoItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/e1;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* data */ class e1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f111792a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<BaseAvlVideoItem> f111793b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f111794c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f111795d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Ig.d f111796e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f111797f;

    public e1(@Y61.k String str, @Y61.l List list, @Y61.l String str2, @Y61.l String str3, @Y61.k Ig.d dVar, boolean z12) {
        this.f111792a = str;
        this.f111793b = list;
        this.f111794c = str2;
        this.f111795d = str3;
        this.f111796e = dVar;
        this.f111797f = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return kotlin.jvm.internal.L.f(this.f111792a, e1Var.f111792a) && kotlin.jvm.internal.L.f(this.f111793b, e1Var.f111793b) && kotlin.jvm.internal.L.f(this.f111794c, e1Var.f111794c) && kotlin.jvm.internal.L.f(this.f111795d, e1Var.f111795d) && kotlin.jvm.internal.L.f(this.f111796e, e1Var.f111796e) && this.f111797f == e1Var.f111797f;
    }

    public final int hashCode() {
        int iHashCode = this.f111792a.hashCode() * 31;
        List<BaseAvlVideoItem> list = this.f111793b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f111794c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f111795d;
        return Boolean.hashCode(this.f111797f) + ((this.f111796e.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShortVideoWrapper(stringId=");
        sb2.append(this.f111792a);
        sb2.append(", shortVideos=");
        sb2.append(this.f111793b);
        sb2.append(", categoryId=");
        sb2.append(this.f111794c);
        sb2.append(", xHash=");
        sb2.append(this.f111795d);
        sb2.append(", item=");
        sb2.append(this.f111796e);
        sb2.append(", isSerp=");
        return androidx.appcompat.app.r.x(sb2, this.f111797f, ')');
    }
}
