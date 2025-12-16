package com.avito.android.profile.edit;

import com.avito.android.profile.edit.refactoring.adapter.item.AvatarItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EditProfileInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/profile/edit/refactoring/adapter/EditProfileItem;", "items", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile.edit.i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33328i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AvatarItem f222216b;

    public C33328i(AvatarItem avatarItem) {
        this.f222216b = avatarItem;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        AvatarItem avatarItem = this.f222216b;
        if (avatarItem == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        com.avito.android.profile.edit.refactoring.adapter.e.c(arrayList, avatarItem);
        return arrayList;
    }
}
