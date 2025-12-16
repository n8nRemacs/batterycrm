package com.avito.android.profile.edit;

import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import com.avito.android.profile.edit.refactoring.adapter.item.InputItem;
import com.avito.android.profile.edit.refactoring.adapter.item.SubLocationItem;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.remote.model.Session;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SaveProfileInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/Session;", "session", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/AuthResult;", "apply", "(Lcom/avito/android/remote/model/Session;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class l0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f222223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<Long, EditProfileItem> f222224c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f222225d;

    public l0(t0 t0Var, Map map, String str) {
        this.f222223b = t0Var;
        this.f222224c = map;
        this.f222225d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        NameIdEntity nameIdEntity;
        NameIdEntity nameIdEntity2;
        InterfaceC34401z0 interfaceC34401z0 = this.f222223b.f222299a;
        String accessToken = ((Session) obj).getAccessToken();
        Map<Long, EditProfileItem> map = this.f222224c;
        EditProfileItem editProfileItem = map.get(7L);
        String id2 = null;
        InputItem inputItem = editProfileItem instanceof InputItem ? (InputItem) editProfileItem : null;
        String str = inputItem != null ? inputItem.f222253d : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Boolean bool = Boolean.TRUE;
        String strB = t0.b(map);
        EditProfileItem editProfileItem2 = map.get(2L);
        SubLocationItem subLocationItem = editProfileItem2 instanceof SubLocationItem ? (SubLocationItem) editProfileItem2 : null;
        String id3 = (subLocationItem == null || subLocationItem.f222264d != 1 || (nameIdEntity = subLocationItem.f222265e) == null) ? null : nameIdEntity.getId();
        EditProfileItem editProfileItem3 = map.get(2L);
        SubLocationItem subLocationItem2 = editProfileItem3 instanceof SubLocationItem ? (SubLocationItem) editProfileItem3 : null;
        if (subLocationItem2 != null && subLocationItem2.f222264d == 4 && (nameIdEntity2 = subLocationItem2.f222265e) != null) {
            id2 = nameIdEntity2.getId();
        }
        return interfaceC34401z0.D(accessToken, str2, this.f222225d, null, bool, strB, id3, id2);
    }
}
