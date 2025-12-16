package com.avito.android.photo_picker.legacy;

import android.net.Uri;
import com.avito.android.image.enhancement.InterfaceC30978i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoPickerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_picker.legacy.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33249k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33245g f219828b;

    public C33249k(C33245g c33245g) {
        this.f219828b = c33245g;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ((Boolean) obj).getClass();
        C33245g c33245g = this.f219828b;
        InterfaceC30978i interfaceC30978i = c33245g.f219805m;
        LinkedHashSet linkedHashSet = c33245g.f219816x;
        interfaceC30978i.D0(linkedHashSet);
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = c33245g.f219814v;
        if (arrayList == null) {
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t12 : arrayList) {
            com.avito.android.photo_picker.legacy.thumbnail_list.l lVar = (com.avito.android.photo_picker.legacy.thumbnail_list.l) t12;
            Uri uri = lVar.f219905e;
            if (uri == null) {
                uri = lVar.f219906f;
            }
            if (linkedHashSet.contains(uri)) {
                arrayList2.add(t12);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.avito.android.photo_picker.legacy.thumbnail_list.l lVar2 = (com.avito.android.photo_picker.legacy.thumbnail_list.l) it.next();
            Uri uri2 = lVar2.f219905e;
            if (uri2 == null) {
                uri2 = lVar2.f219906f;
            }
            arrayList3.add(uri2);
        }
        if (!c33245g.f219817y || arrayList3.isEmpty()) {
            return;
        }
        c33245g.f219805m.F0(arrayList3);
    }
}
