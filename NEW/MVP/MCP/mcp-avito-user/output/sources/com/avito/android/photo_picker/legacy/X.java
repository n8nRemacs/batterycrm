package com.avito.android.photo_picker.legacy;

import com.avito.android.analytics.b0;
import com.avito.android.photo_cache.PhotoSource;
import com.avito.android.photo_picker.SelectedPhoto;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: SingleCachePhotoInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/X;", "Lcom/avito/android/photo_picker/legacy/e;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class X implements InterfaceC33243e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f219627a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SharedPhotosStorage f219628b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_picker.converter.b f219629c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final D70.a f219630d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f219631e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f219632f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final b0 f219633g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.computer_vision.a f219634h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f219635i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final N70.b f219636j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_info.b f219637k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public ArrayList f219638l;

    public X(@Y61.k com.avito.android.photo_cache.b bVar, @Y61.k SharedPhotosStorage sharedPhotosStorage, @Y61.k com.avito.android.photo_picker.converter.b bVar2, @Y61.k D70.a aVar, @Y61.k String str, @Y61.k String str2, @Y61.k b0 b0Var, @Y61.k com.avito.android.computer_vision.a aVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k N70.b bVar3, @Y61.k com.avito.android.photo_info.b bVar4, @Y61.l PhotoPickerInteractorState photoPickerInteractorState) {
        ArrayList arrayList;
        this.f219627a = bVar;
        this.f219628b = sharedPhotosStorage;
        this.f219629c = bVar2;
        this.f219630d = aVar;
        this.f219631e = str;
        this.f219632f = str2;
        this.f219633g = b0Var;
        this.f219634h = aVar2;
        this.f219635i = interfaceC35745a5;
        this.f219636j = bVar3;
        this.f219637k = bVar4;
        this.f219638l = (photoPickerInteractorState == null || (arrayList = photoPickerInteractorState.f219608b) == null) ? new ArrayList((Collection) g().e()) : new ArrayList(arrayList);
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33243e
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.M a() {
        return io.reactivex.rxjava3.core.I.q(this.f219638l);
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33243e
    @j.K
    public final void b(@Y61.k String str) {
        this.f219634h.b(str);
        Iterator it = this.f219638l.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (kotlin.jvm.internal.L.f(((PickerPhoto) it.next()).f219613b, str)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 != -1) {
            this.f219638l.remove(i12);
            this.f219633g.a(m80.h.f414348a);
            return;
        }
        V2.f318762a.e("Cannot find item with id = '" + str + '\'', null);
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33243e
    @Y61.k
    public final C41982q1 c(@Y61.k Iterable iterable) {
        C41936b0 c41936b0 = new C41936b0(io.reactivex.rxjava3.core.z.X(iterable).K(new K(this)), new M(this));
        InterfaceC35745a5 interfaceC35745a5 = this.f219635i;
        return c41936b0.j0(interfaceC35745a5.e()).K(new N(this)).j0(interfaceC35745a5.c()).K(new O(this)).x0(interfaceC35745a5.c());
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33243e
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.M commit() {
        io.reactivex.rxjava3.internal.operators.completable.I iR2 = new io.reactivex.rxjava3.internal.operators.completable.r(new G(this)).l(S.f219622b).r();
        InterfaceC35745a5 interfaceC35745a5 = this.f219635i;
        return iR2.q(interfaceC35745a5.e()).k(new InterfaceC43543a() { // from class: com.avito.android.photo_picker.legacy.J
            @Override // l41.InterfaceC43543a
            public final void run() {
                X x12 = this.f219598b;
                ArrayList arrayList = new ArrayList((Collection) x12.g().e());
                x12.f219638l = arrayList;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    PickerPhoto pickerPhoto = (PickerPhoto) it.next();
                    x12.f219634h.c(pickerPhoto.f219614c, pickerPhoto.f219613b);
                }
            }
        }).q(interfaceC35745a5.a()).x(interfaceC35745a5.a());
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33243e
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.M d(@Y61.k ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            SelectedPhoto selectedPhoto = (SelectedPhoto) obj;
            int size = this.f219638l.size() + i12;
            arrayList2.add(new PickerPhoto(selectedPhoto.f218868d, selectedPhoto.f218866b, size, selectedPhoto.f218867c == PhotoSource.f216294d ? 1 : 2, null, null, null, selectedPhoto.f218872h, 112, null));
            i12 = i13;
        }
        return io.reactivex.rxjava3.core.I.q(arrayList2);
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33243e
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.W e(@Y61.k List list) {
        return new C41936b0(io.reactivex.rxjava3.core.z.X(list), new U(this)).H0().z(this.f219635i.a());
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33243e
    @j.K
    public final void f(int i12, int i13) {
        Collections.swap(this.f219638l, i12, i13);
    }

    public final io.reactivex.rxjava3.internal.operators.single.O g() {
        return this.f219627a.a(this.f219631e).S().r(V.f219625b).r(W.f219626b);
    }

    @Override // com.avito.android.photo_picker.legacy.InterfaceC33243e
    @Y61.k
    public final PhotoPickerInteractorState getState() {
        return new PhotoPickerInteractorState(this.f219638l);
    }
}
