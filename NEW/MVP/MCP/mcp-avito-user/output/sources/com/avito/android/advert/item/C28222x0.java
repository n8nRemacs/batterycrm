package com.avito.android.advert.item;

import android.os.Bundle;
import com.avito.android.advert_core.advert.b;
import com.avito.android.deep_linking.links.PhoneLink;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.x0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28222x0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f80740l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PhoneLink f80741m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f80742n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28222x0(C28136i0 c28136i0, PhoneLink phoneLink, String str) {
        super(0);
        this.f80740l = c28136i0;
        this.f80741m = phoneLink;
        this.f80742n = str;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        C28136i0 c28136i0 = this.f80740l;
        c28136i0.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("key_advert_id", this.f80742n);
        bundle.putString("key_source_name", "button");
        Z0 z02 = c28136i0.f76327Z0;
        if (z02 != null) {
            b.a.a(z02, this.f80741m, bundle, 2);
        }
        return kotlin.G0.f406611a;
    }
}
