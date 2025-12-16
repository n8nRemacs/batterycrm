package com.avito.android.advertising.loaders;

import android.graphics.Bitmap;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.T;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import io.reactivex.rxjava3.internal.operators.single.U;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BitmapBgProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/h;", "Lcom/avito/android/advertising/loaders/f;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f88385a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, com.jakewharton.rxrelay3.b<Integer>> f88386b = new HashMap<>();

    @Inject
    public h(@Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f88385a = interfaceC35745a5;
    }

    @Override // com.avito.android.advertising.loaders.f
    @Y61.k
    public final T a(@Y61.k String str) {
        HashMap<String, com.jakewharton.rxrelay3.b<Integer>> map = this.f88386b;
        com.jakewharton.rxrelay3.b<Integer> bVar = map.get(str);
        if (bVar == null) {
            bVar = new com.jakewharton.rxrelay3.b<>();
            map.put(str, bVar);
        }
        return bVar.S();
    }

    @Override // com.avito.android.advertising.loaders.f
    @Y61.k
    public final C42017o b(@Y61.k Bitmap bitmap, @Y61.k String str) {
        HashMap<String, com.jakewharton.rxrelay3.b<Integer>> map = this.f88386b;
        com.jakewharton.rxrelay3.b<Integer> bVar = map.get(str);
        if (bVar == null) {
            bVar = new com.jakewharton.rxrelay3.b<>();
            map.put(str, bVar);
        }
        U uV = new C42006d(new Ae0.c(bitmap, 20)).v(-1);
        InterfaceC35745a5 interfaceC35745a5 = this.f88385a;
        return new C42017o(uV.z(interfaceC35745a5.c()).s(interfaceC35745a5.e()).k(new g(bVar)), new GL.a(3, this, str));
    }
}
