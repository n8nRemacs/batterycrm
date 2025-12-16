package com.avito.android.profile.edit;

import com.avito.android.profile.edit.refactoring.adapter.item.AvatarItem;
import com.avito.android.profile.edit.refactoring.adapter.item.InputItem;
import com.avito.android.profile.edit.refactoring.adapter.item.LocationItem;
import com.avito.android.profile.edit.refactoring.adapter.item.PhoneInputItem;
import com.avito.android.profile.edit.refactoring.adapter.item.SubLocationItem;
import com.avito.android.profile.edit.refactoring.adapter.item.TextItem;
import com.avito.android.profile.edit.refactoring.avatar.ProfileAvatar;
import com.avito.android.remote.model.Profile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.C42745f0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.profile.edit.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C33324e implements l41.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33339t f222203b;

    public /* synthetic */ C33324e(C33339t c33339t) {
        this.f222203b = c33339t;
    }

    @Override // l41.c
    public final Object apply(Object obj, Object obj2) {
        Profile profile = (Profile) obj;
        org.funktionale.option.a aVar = (org.funktionale.option.a) obj2;
        C33339t c33339t = this.f222203b;
        c33339t.getClass();
        LocationItem locationItem = new LocationItem(1L, c33339t.f222293a.getF222072f(), false, 4, null);
        SubLocationItem subLocationItemI = c33339t.i();
        if (subLocationItemI == null) {
            subLocationItemI = null;
        }
        ArrayList arrayListC = C42745f0.C(C42745f0.U(locationItem, subLocationItemI));
        List listSingletonList = Collections.singletonList(new AvatarItem(3L, (ProfileAvatar) aVar.c(), false, 4, null));
        ArrayList arrayList = new ArrayList();
        boolean zIsCompany = profile.getType().isCompany();
        M m12 = c33339t.f222296d;
        if (zIsCompany) {
            String strC = m12.c();
            String manager = profile.getManager();
            arrayList.add(new InputItem(6L, strC, manager == null ? "" : manager, false, 8, null));
        } else if (profile.isIncomplete()) {
            String phone = profile.getPhone();
            arrayList.add(new PhoneInputItem(4L, m12.a(), phone == null ? "" : phone, false, 8, null));
            String strB = m12.b();
            String email = profile.getEmail();
            arrayList.add(new InputItem(7L, strB, email == null ? "" : email, false, 8, null));
        }
        return C42745f0.i0(new TextItem(8L, m12.d()), C42745f0.h0(arrayListC, C42745f0.h0(arrayList, listSingletonList)));
    }
}
