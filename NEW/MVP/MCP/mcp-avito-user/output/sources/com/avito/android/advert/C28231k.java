package com.avito.android.advert;

import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import fa.InterfaceC40383a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: AdvertDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "params", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/AdvertDetails;", "apply", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28231k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28234n f80777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f80778c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsFastOpenParams.FromSpace f80779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f80780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f80781f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f80782g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Integer f80783h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f80784i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Integer f80785j;

    public C28231k(C28234n c28234n, Map<String, String> map, AdvertDetailsFastOpenParams.FromSpace fromSpace, String str, String str2, String str3, Integer num, String str4, Integer num2) {
        this.f80777b = c28234n;
        this.f80778c = map;
        this.f80779d = fromSpace;
        this.f80780e = str;
        this.f80781f = str2;
        this.f80782g = str3;
        this.f80783h = num;
        this.f80784i = str4;
        this.f80785j = num2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        C28234n c28234n = this.f80777b;
        InterfaceC40383a interfaceC40383a = c28234n.f80789b.get();
        String strA = ZS.d.a(c28234n.f80800m);
        Map<String, String> mapC = this.f80778c;
        if (mapC == null) {
            mapC = P0.c();
        }
        LinkedHashMap linkedHashMapK = P0.k(map, mapC);
        AdvertDetailsFastOpenParams.FromSpace fromSpace = this.f80779d;
        Map<String, String> mapC2 = fromSpace != null ? fromSpace.f71344b : null;
        if (mapC2 == null) {
            mapC2 = P0.c();
        }
        return interfaceC40383a.f(strA, "contract=Avito; platform=Android; version=26.0", this.f80780e, this.f80781f, this.f80782g, this.f80783h, this.f80784i, this.f80785j, P0.k(linkedHashMapK, mapC2));
    }
}
