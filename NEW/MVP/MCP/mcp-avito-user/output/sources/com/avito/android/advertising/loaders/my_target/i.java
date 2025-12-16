package com.avito.android.advertising.loaders.my_target;

import android.graphics.Bitmap;
import com.my.target.nativeads.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: MyTargetBannerLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/my_target/i;", "Lcom/my/target/nativeads/d$d;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements d.InterfaceC10789d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference<com.avito.android.advertising.loaders.f> f88421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f88422b;

    /* compiled from: MyTargetBannerLoader.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f88423b;

        public a(b bVar) {
            this.f88423b = bVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int iIntValue = ((Number) obj).intValue();
            c cVar = this.f88423b.f88398a;
            if (cVar != null) {
                cVar.f88402d.f88405d = Integer.valueOf(iIntValue);
            }
        }
    }

    public i(WeakReference<com.avito.android.advertising.loaders.f> weakReference, b bVar) {
        this.f88421a = weakReference;
        this.f88422b = bVar;
    }

    public final void a(@Y61.k com.my.target.nativeads.d dVar) {
        k11.c cVarA;
        Bitmap bitmapA;
        com.avito.android.advertising.loaders.f fVar;
        ArrayList<k11.d> arrayList;
        k11.c cVarA2 = dVar.a();
        com.my.target.common.models.b bVar = null;
        if ((cVarA2 == null || (arrayList = cVarA2.f406018o) == null || arrayList.size() <= 0) && (cVarA = dVar.a()) != null) {
            bVar = cVarA.f406017n;
        }
        if (bVar == null || (bitmapA = bVar.a()) == null || (fVar = this.f88421a.get()) == null) {
            return;
        }
        fVar.b(bitmapA, bVar.f394304a).x(new a(this.f88422b), io.reactivex.rxjava3.internal.functions.a.f401994d);
    }
}
