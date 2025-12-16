package com.avito.android.beduin.common.advert;

import cj.InterfaceC27206d;
import com.avito.android.beduin_models.BeduinModel;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinFavoriteAdvertManagerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin_models/BeduinModel;", "model", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin_models/BeduinModel;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k extends N implements Y41.l<BeduinModel, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f100555l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(LinkedHashMap linkedHashMap) {
        super(1);
        this.f100555l = linkedHashMap;
    }

    @Override // Y41.l
    public final G0 invoke(BeduinModel beduinModel) {
        InterfaceC27206d interfaceC27206d;
        String advertId;
        BeduinModel beduinModel2 = beduinModel;
        if ((beduinModel2 instanceof InterfaceC27206d) && (advertId = (interfaceC27206d = (InterfaceC27206d) beduinModel2).getAdvertId()) != null) {
            this.f100555l.put(advertId, Boolean.valueOf(interfaceC27206d.isFavorite()));
        }
        return G0.f406611a;
    }
}
