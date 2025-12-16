package com.avito.android.cart_snippet_actions.utils;

import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rU.C47595a;

/* compiled from: ItemQuantityChanges.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Response", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.subjects.e<Object> f116288l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f116289m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f116290n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.beduin_v2.repository.domain.cart_items.h f116291o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(io.reactivex.rxjava3.subjects.e eVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar) {
        super(0);
        this.f116288l = eVar;
        this.f116289m = linkedHashMap;
        this.f116290n = linkedHashMap2;
        this.f116291o = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f116288l.e();
        this.f116289m.clear();
        LinkedHashMap linkedHashMap = this.f116290n;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new CartItem((String) entry.getKey(), ((Change) entry.getValue()).f116278c));
        }
        this.f116291o.c(new C47595a(arrayList));
        return G0.f406611a;
    }
}
