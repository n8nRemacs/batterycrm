package com.avito.android.beduin.common.advert;

import cj.InterfaceC27206d;
import com.avito.android.beduin.common.form.transforms.IsFavoriteTransform;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: BeduinFavoriteAdvertManagerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin_models/BeduinModel;", "model", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin_models/BeduinModel;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.l<BeduinModel, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Set<String> f100540l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f100541m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f100542n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Set set, Y41.l lVar, LinkedHashMap linkedHashMap) {
        super(1);
        this.f100540l = set;
        this.f100541m = (N) lVar;
        this.f100542n = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(BeduinModel beduinModel) {
        String advertId;
        boolean zBooleanValue;
        BeduinModel beduinModel2 = beduinModel;
        String f102944b = beduinModel2.getId();
        if (beduinModel2 instanceof InterfaceC27206d) {
            InterfaceC27206d interfaceC27206d = (InterfaceC27206d) beduinModel2;
            if (C42745f0.r(this.f100540l, interfaceC27206d.getAdvertId()) && (advertId = interfaceC27206d.getAdvertId()) != null && (zBooleanValue = ((Boolean) this.f100541m.invoke(advertId)).booleanValue()) != interfaceC27206d.getIsFavorite()) {
                this.f100542n.put(f102944b, Collections.singletonList(new IsFavoriteTransform(zBooleanValue)));
            }
        }
        return G0.f406611a;
    }
}
