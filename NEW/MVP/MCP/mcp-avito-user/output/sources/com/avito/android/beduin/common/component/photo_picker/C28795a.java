package com.avito.android.beduin.common.component.photo_picker;

import Ui.InterfaceC15523b;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.beduin.common.component.photo_picker.p;
import com.avito.android.beduin.common.component.photo_picker.w;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinPhotoPickerComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel;", "Lcom/avito/android/beduin/common/component/photo_picker/j;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.component.photo_picker.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28795a extends com.avito.android.beduin.common.component.h<BeduinPhotoPickerModel, j> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f101945e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final BeduinPhotoPickerModel f101946f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final lj.e f101947g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final w f101948h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final s f101949i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final p f101950j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final BeduinPhotoPickerModel f101951k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public androidx.view.result.h<w.a> f101952l;

    /* compiled from: BeduinPhotoPickerComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.photo_picker.a$a, reason: collision with other inner class name */
    public static final class C3056a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C3056a f101953a = new C3056a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final List<String> f101954b = Collections.singletonList("photoPicker");

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final Class<BeduinPhotoPickerModel> f101955c = BeduinPhotoPickerModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<BeduinPhotoPickerModel> S() {
            return f101955c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return f101954b;
        }
    }

    public C28795a(@Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k BeduinPhotoPickerModel beduinPhotoPickerModel, @Y61.k lj.e eVar, @Y61.k w wVar, @Y61.k s sVar, @Y61.k p pVar) {
        this.f101945e = interfaceC15523b;
        this.f101946f = beduinPhotoPickerModel;
        this.f101947g = eVar;
        this.f101948h = wVar;
        this.f101949i = sVar;
        this.f101950j = pVar;
        this.f101951k = beduinPhotoPickerModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101946f;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinPhotoPickerModel beduinPhotoPickerModel = (BeduinPhotoPickerModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        PhotoPickerChange[] photoPickerChangeArrValues = PhotoPickerChange.values();
        if (photoPickerChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, PhotoPickerChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(photoPickerChangeArrValues));
        BeduinPhotoPickerModel beduinPhotoPickerModel2 = this.f101946f;
        if (!L.f(fVar.invoke(beduinPhotoPickerModel2), fVar.invoke(beduinPhotoPickerModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (PhotoPickerChange photoPickerChange : photoPickerChangeArrValues) {
            if (!L.f(photoPickerChange.b().invoke(beduinPhotoPickerModel2), photoPickerChange.b().invoke(beduinPhotoPickerModel))) {
                arrayList.add(photoPickerChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        j jVar = new j(viewGroup.getContext(), null, 0, 6, null);
        jVar.setId(R.id.beduin_photo_picker);
        jVar.setLayoutParams(layoutParams);
        return jVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        j jVar = (j) view;
        u(jVar);
        jVar.setTag(this.f101951k.getF100853b());
        BeduinPhotoPickerModel beduinPhotoPickerModel = this.f101946f;
        jVar.setNumberOfColumns(beduinPhotoPickerModel.getLayoutSettings().c());
        jVar.setImages(beduinPhotoPickerModel);
        jVar.setItemClickListener(new C28796b(this));
        jVar.setItemRetryClickListener(new C28797c(this));
        jVar.setItemButtonClickListener(new C28798d(this));
        String f103350r = this.f101947g.getF103350r();
        p pVar = this.f101950j;
        pVar.getClass();
        String str = beduinPhotoPickerModel.f101913c;
        if (str == null) {
            return;
        }
        p.a aVar = new p.a(f103350r, beduinPhotoPickerModel.getF100853b());
        LinkedHashMap linkedHashMap = pVar.f102041f;
        if (str.equals(linkedHashMap.get(aVar))) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) pVar.f102042g.remove(aVar);
        if (cVar != null) {
            cVar.e();
        }
        Iterator it = pVar.f102043h.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            if (((p.b) key).f102046a.equals(aVar)) {
                it.remove();
            }
        }
        linkedHashMap.put(aVar, str);
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        j jVar = (j) view;
        u(jVar);
        jVar.setItemClickListener(new C28796b(this));
        jVar.setItemRetryClickListener(new C28797c(this));
        jVar.setItemButtonClickListener(new C28798d(this));
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        C28799e c28799e = new C28799e(jVar, this);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(c28799e, list);
    }

    public final void u(j jVar) {
        androidx.appcompat.app.m mVarC = C35835l0.c(jVar.getContext());
        if (mVarC == null) {
            return;
        }
        androidx.view.result.h<w.a> hVar = this.f101952l;
        if (hVar != null) {
            hVar.c();
        }
        this.f101952l = mVarC.getActivityResultRegistry().e("BeduinPhotoPicker_" + this.f101947g.getF103350r() + '_' + this.f101951k.getF100853b(), this.f101948h, new L91.o(this, 14));
    }

    public final void v(com.avito.android.beduin.common.component.photo_picker.items.Photo.a aVar) {
        w.a aVar2;
        BeduinPhotoPickerModel.PhotoPickerConstraints.MaxCountConstraint maxCount;
        int size;
        BeduinPhotoPickerModel beduinPhotoPickerModel = this.f101951k;
        String f100853b = beduinPhotoPickerModel.getF100853b();
        this.f101949i.getClass();
        String strConcat = "beduin photo picker_".concat(f100853b);
        Long l12 = aVar.f101986b.f101921c;
        String string = l12 != null ? l12.toString() : null;
        boolean z12 = aVar.f101987c;
        BeduinPhotoPickerModel beduinPhotoPickerModel2 = this.f101946f;
        if (z12) {
            List<BeduinPhotoPickerModel.PhotoPickerImage> listK = beduinPhotoPickerModel2.k();
            if (listK != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listK) {
                    if (((BeduinPhotoPickerModel.PhotoPickerImage) obj).g() == null) {
                        arrayList.add(obj);
                    }
                }
                size = arrayList.size();
            } else {
                size = 0;
            }
            aVar2 = new w.a("beduin_photo_picker_static_".concat(beduinPhotoPickerModel.getF100853b()), strConcat, 0, size, string, null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeView(size > 1), 36, null);
        } else {
            String strConcat2 = "beduin_photo_picker_user_".concat(beduinPhotoPickerModel.getF100853b());
            BeduinPhotoPickerModel.PhotoPickerConstraints constraints = beduinPhotoPickerModel2.getConstraints();
            aVar2 = new w.a(strConcat2, strConcat, 0, (constraints == null || (maxCount = constraints.getMaxCount()) == null) ? 1 : maxCount.getValue(), string, null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit(false, false, true), 36, null);
        }
        androidx.view.result.h<w.a> hVar = this.f101952l;
        if (hVar != null) {
            hVar.b(aVar2);
        }
    }
}
