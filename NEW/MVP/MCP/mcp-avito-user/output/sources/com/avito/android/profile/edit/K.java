package com.avito.android.profile.edit;

import com.avito.android.profile.edit.InterfaceC33315d;
import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import com.avito.android.profile.edit.refactoring.adapter.item.SubLocationItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.v0;
import p90.InterfaceC46923a;

/* compiled from: EditProfilePresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<List<EditProfileItem>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33315d.b f221988l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(InterfaceC33315d.b bVar) {
        super(1);
        this.f221988l = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(List<EditProfileItem> list) {
        List<EditProfileItem> list2 = list;
        EditProfileItem editProfileItemA = com.avito.android.profile.edit.refactoring.adapter.e.a(2L, list2);
        EditProfileItem editProfileItemA2 = com.avito.android.profile.edit.refactoring.adapter.e.a(1L, list2);
        if (editProfileItemA2 != null && (editProfileItemA2 instanceof InterfaceC46923a)) {
            com.avito.android.profile.edit.refactoring.adapter.e.c(list2, com.avito.android.profile.edit.refactoring.adapter.e.d(editProfileItemA2, false));
            com.avito.android.profile.edit.refactoring.adapter.e.b(list2, editProfileItemA2);
        }
        v0.a(list2).remove(editProfileItemA);
        InterfaceC33315d.b bVar = this.f221988l;
        int iC2 = com.avito.android.profile.edit.refactoring.adapter.e.c(list2, bVar.f222078a);
        SubLocationItem subLocationItem = bVar.f222079b;
        if (subLocationItem != null) {
            list2.add(iC2 + 1, subLocationItem);
        }
        return G0.f406611a;
    }
}
