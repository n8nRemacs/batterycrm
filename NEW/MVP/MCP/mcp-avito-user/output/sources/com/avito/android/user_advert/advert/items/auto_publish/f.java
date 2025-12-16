package com.avito.android.user_advert.advert.items.auto_publish;

import Y41.l;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoPublishItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f309251l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f309252m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, a aVar) {
        super(1);
        this.f309251l = gVar;
        this.f309252m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f309251l.f309254c;
        if (myAdvertDetailsActivity != null) {
            myAdvertDetailsActivity.b2(this.f309252m, zBooleanValue);
        }
        return G0.f406611a;
    }
}
