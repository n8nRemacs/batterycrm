package com.avito.android.bxcontent;

import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/inline_filters/w$b;", "invoke", "()Lcom/avito/android/inline_filters/w$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bxcontent.a0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C28961a0 extends kotlin.jvm.internal.N implements Y41.a<InterfaceC31062w.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchParams f109444l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PresentationType f109445m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f109446n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.w f109447o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28961a0(SearchParams searchParams, PresentationType presentationType, String str, com.avito.android.bxcontent.mvi.entity.w wVar) {
        super(0);
        this.f109444l = searchParams;
        this.f109445m = presentationType;
        this.f109446n = str;
        this.f109447o = wVar;
    }

    @Override // Y41.a
    public final InterfaceC31062w.b invoke() {
        Boolean bool = this.f109447o.f112439c.f271612f;
        boolean z12 = true;
        if (bool != null && bool.booleanValue()) {
            z12 = false;
        }
        return new InterfaceC31062w.b(this.f109444l, this.f109445m, this.f109446n, z12);
    }
}
