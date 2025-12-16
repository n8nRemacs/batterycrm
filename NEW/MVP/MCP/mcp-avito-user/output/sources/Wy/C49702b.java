package wy;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import cb0.C27157a;
import cb0.C27158b;
import cb0.C27159c;
import cb0.h;
import com.avito.android.deep_linking.x;
import com.avito.android.edit_seller_type.di.d;
import com.avito.android.edit_seller_type.mvi.entity.c;
import com.avito.android.edit_seller_type.mvi.entity.d;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: EditSellerTypeResponseConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwy/b;", "Lwy/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wy.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49702b implements InterfaceC49701a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final c.f f441891a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f441892b;

    @Inject
    public C49702b(@l @d c.f fVar, @k x xVar) {
        this.f441891a = fVar;
        this.f441892b = xVar;
    }

    @Override // wy.InterfaceC49701a
    @k
    public final c.g a(@k h hVar) {
        com.avito.android.edit_seller_type.mvi.entity.d bVar;
        if (O2.a(hVar.c())) {
            String badgeTitle = hVar.getBadgeTitle();
            List<C27157a> listC = hVar.c();
            if (listC == null) {
                listC = C42784z0.f406748b;
            }
            List<C27158b> listD = hVar.d();
            List<C27157a> list = listC;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (C27157a c27157a : list) {
                int id2 = (int) c27157a.getId();
                String title = c27157a.getTitle();
                AttributedText subtitle = c27157a.getSubtitle();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listD) {
                    Long groupId = ((C27158b) obj).getGroupId();
                    long id3 = c27157a.getId();
                    if (groupId != null && groupId.longValue() == id3) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(b(badgeTitle, (C27158b) it.next()));
                }
                arrayList.add(new c.d(id2, title, subtitle, arrayList3));
            }
            bVar = new d.a(arrayList);
        } else {
            List<C27158b> listD2 = hVar.d();
            ArrayList arrayList4 = new ArrayList(C42745f0.q(listD2, 10));
            Iterator<T> it2 = listD2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(b(hVar.getBadgeTitle(), (C27158b) it2.next()));
            }
            bVar = new d.b(arrayList4);
        }
        com.avito.android.edit_seller_type.mvi.entity.d dVar = bVar;
        String title2 = hVar.getTitle();
        AttributedText subtitle2 = hVar.getSubtitle();
        String confirmButtonTitle = hVar.getConfirmButtonTitle();
        c.e eVarB = dVar.b();
        return new c.g(title2, subtitle2, confirmButtonTitle, dVar, eVarB != null ? eVarB.f146819e : null, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c.e b(String str, C27158b c27158b) {
        int sellerType = (int) c27158b.getSellerType();
        Long sellerSubtype = c27158b.getSellerSubtype();
        c.f fVar = new c.f(sellerType, sellerSubtype != null ? Integer.valueOf((int) sellerSubtype.longValue()) : null);
        c.f fVar2 = this.f441891a;
        boolean zEquals = fVar2 != null ? fVar2.equals(fVar) : c27158b.getSelected();
        String title = c27158b.getTitle();
        String subtitle = c27158b.getSubtitle();
        if (!zEquals) {
            str = null;
        }
        boolean enabled = c27158b.getEnabled();
        C27159c confirmBlock = c27158b.getConfirmBlock();
        c.a aVar = confirmBlock != null ? new c.a(confirmBlock.getTitle(), confirmBlock.getSubtitle(), confirmBlock.getButtonTitle(), confirmBlock.getCloseButtonTitle()) : null;
        String deeplink = c27158b.getDeeplink();
        if (deeplink != null) {
            Object objC = this.f441892b.c(deeplink);
            int i12 = Z.f406624c;
            deepLink = objC instanceof Z.b ? null : objC;
        }
        return new c.e(title, subtitle, str, zEquals, fVar, enabled, aVar, deepLink);
    }
}
