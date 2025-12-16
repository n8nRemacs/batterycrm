package com.avito.android.profile.edit;

import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EditProfilePresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class A extends kotlin.jvm.internal.N implements Y41.l<List<EditProfileItem>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EditProfileItem f221939l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(EditProfileItem editProfileItem) {
        super(1);
        this.f221939l = editProfileItem;
    }

    @Override // Y41.l
    public final G0 invoke(List<EditProfileItem> list) {
        com.avito.android.profile.edit.refactoring.adapter.e.b(list, this.f221939l);
        return G0.f406611a;
    }
}
