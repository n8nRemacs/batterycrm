package com.avito.android.user_advert.advert;

import com.avito.android.R;
import com.avito.android.deep_linking.links.DraftDeletionLink;
import com.avito.android.deep_linking.links.DraftPublicationLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.remote.model.Action;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.component.appbar.ActionMenu;

/* compiled from: MyAdvertDetailsActionMenuConverter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/z;", "Lcom/avito/android/user_advert/advert/y;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35463z implements InterfaceC35461y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f310664a;

    public C35463z(@Y61.k String str) {
        this.f310664a = str;
    }

    @InterfaceC42165v
    public static Integer b(Action action) {
        String type = action.getType();
        if (type == null) {
            type = action.getDeepLink().getPath();
        }
        com.avito.android.deep_linking.links.storage.a aVar = com.avito.android.deep_linking.links.storage.a.f134018a;
        if (kotlin.jvm.internal.L.f(type, aVar.b(MyAdvertLink.Edit.class))) {
            return Integer.valueOf(R.drawable.ic_edit_24);
        }
        if (kotlin.jvm.internal.L.f(type, aVar.b(DraftPublicationLink.class))) {
            return Integer.valueOf(R.drawable.ic_edit_24);
        }
        if (kotlin.jvm.internal.L.f(type, aVar.b(MyAdvertLink.Delete.class))) {
            return Integer.valueOf(R.drawable.ic_delete_24);
        }
        if (kotlin.jvm.internal.L.f(type, aVar.b(DraftDeletionLink.class))) {
            return Integer.valueOf(R.drawable.ic_delete_24);
        }
        return null;
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35461y
    @Y61.k
    public final ArrayList a(@Y61.k List list, boolean z12) {
        ArrayList arrayList = new ArrayList();
        if (z12) {
            arrayList.add(new ActionMenu(this.f310664a, 1, Integer.valueOf(R.drawable.ic_share_24_blue), null, null, 24, null));
        }
        List<Action> list2 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        for (Action action : list2) {
            arrayList2.add(new ActionMenu(action.getTitle(), b(action) == null ? 0 : 1, b(action), Integer.valueOf(R.attr.blue), null, 16, null));
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
