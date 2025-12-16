package com.avito.android.advert.item;

import android.view.View;
import androidx.view.InterfaceC22983P;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsCollectionToastManager.kt */
@com.avito.android.di.B
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/l;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28144l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.a f77246a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f77247b = new ArrayList();

    /* compiled from: AdvertDetailsCollectionToastManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/l$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.l$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC22983P f77248a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f77249b;

        public a(@Y61.k View view, @Y61.k InterfaceC22983P interfaceC22983P) {
            this.f77248a = interfaceC22983P;
            this.f77249b = view;
        }
    }

    @Inject
    public C28144l(@Y61.k com.avito.android.advert_collection_toast.a aVar) {
        this.f77246a = aVar;
    }

    public final void a(@Y61.k View view, @Y61.k InterfaceC22983P interfaceC22983P) {
        ArrayList arrayList = this.f77247b;
        boolean zIsEmpty = arrayList.isEmpty();
        com.avito.android.advert_collection_toast.a aVar = this.f77246a;
        if (!zIsEmpty) {
            aVar.a();
        }
        arrayList.add(new a(view, interfaceC22983P));
        aVar.d(view, interfaceC22983P);
    }
}
