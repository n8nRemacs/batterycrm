package com.avito.android.extended_profile.mvi;

import com.avito.android.advertising.CommercialLoadingItem;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/extended_profile/data/g;", "group", "", "invoke", "(Lcom/avito/android/extended_profile/data/g;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class m0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.extended_profile.data.g, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f150342l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String str) {
        super(1);
        this.f150342l = str;
    }

    @Override // Y41.l
    public final Boolean invoke(com.avito.android.extended_profile.data.g gVar) {
        Object next;
        Iterator<T> it = gVar.getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            QH.a aVar = (QH.a) next;
            if ((aVar instanceof CommercialLoadingItem) && kotlin.jvm.internal.L.f(((CommercialLoadingItem) aVar).f86897b.f86885b, this.f150342l)) {
                break;
            }
        }
        return Boolean.valueOf(next != null);
    }
}
