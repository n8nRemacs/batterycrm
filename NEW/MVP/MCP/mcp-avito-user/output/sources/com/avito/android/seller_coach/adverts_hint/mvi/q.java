package com.avito.android.seller_coach.adverts_hint.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.Advice;
import com.avito.android.remote.model.AdviceHeader;
import com.avito.android.remote.model.Advices;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import com.avito.android.seller_coach.adverts_hint.mvi.entity.ShortAdvicesState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;
import yq0.InterfaceC50283c;

/* compiled from: ShortAdvicesReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "Lyq0/c;", "Lcom/avito/android/seller_coach/adverts_hint/mvi/entity/ShortAdvicesState;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q implements u<InterfaceC50283c, ShortAdvicesState> {
    @Inject
    public q() {
    }

    public static List b(Advices advices) {
        Object obj;
        Object next;
        if (advices == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        List<Advice> advices2 = advices.getAdvices();
        if (advices2 == null) {
            advices2 = C42784z0.f406748b;
        }
        for (Advice advice : advices2) {
            String adviceId = advice.getAdviceId();
            String title = advice.getTitle();
            String description = advice.getDescription();
            String headerText = advice.getHeaderText();
            UserAdvertsHintItem.Type.a aVar = UserAdvertsHintItem.Type.f267225c;
            String type = advice.getType();
            aVar.getClass();
            Iterator it = ((AbstractC42738c) UserAdvertsHintItem.Type.f267230h).iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((UserAdvertsHintItem.Type) next).f267231b.equals(type)) {
                    break;
                }
            }
            UserAdvertsHintItem.Type type2 = (UserAdvertsHintItem.Type) next;
            UserAdvertsHintItem.Type type3 = type2 == null ? UserAdvertsHintItem.Type.f267228f : type2;
            String slug = advice.getSlug();
            UserAdvertsHintItem.BackgroundColor.a aVar2 = UserAdvertsHintItem.BackgroundColor.f267217c;
            String color = advice.getColor();
            aVar2.getClass();
            Iterator it2 = ((AbstractC42738c) UserAdvertsHintItem.BackgroundColor.f267223i).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((UserAdvertsHintItem.BackgroundColor) next2).f267224b.equals(color)) {
                    obj = next2;
                    break;
                }
            }
            UserAdvertsHintItem.BackgroundColor backgroundColor = (UserAdvertsHintItem.BackgroundColor) obj;
            if (backgroundColor == null) {
                backgroundColor = UserAdvertsHintItem.BackgroundColor.f267220f;
            }
            arrayList.add(new UserAdvertsHintItem(adviceId, title, description, headerText, type3, slug, backgroundColor, advice.getItemsIds()));
        }
        return arrayList;
    }

    @Override // com.avito.android.arch.mvi.u
    public final ShortAdvicesState a(InterfaceC50283c interfaceC50283c, ShortAdvicesState shortAdvicesState) {
        ArrayList arrayList;
        Advices advicesCopy$default;
        InterfaceC50283c interfaceC50283c2 = interfaceC50283c;
        ShortAdvicesState shortAdvicesState2 = shortAdvicesState;
        if (interfaceC50283c2 instanceof InterfaceC50283c.a) {
            return ShortAdvicesState.a(shortAdvicesState2, null, null, C42784z0.f406748b, ShortAdvicesState.Type.f267280d, 49);
        }
        UserAdvertsHintItem userAdvertsHintItem = null;
        if (interfaceC50283c2 instanceof InterfaceC50283c.b) {
            InterfaceC50283c.b bVar = (InterfaceC50283c.b) interfaceC50283c2;
            ShortAdvicesState.Type type = ShortAdvicesState.Type.f267281e;
            Advices advices = bVar.f443514a;
            List listB = b(advices);
            AdviceHeader header = bVar.f443514a.getHeader();
            if (header != null) {
                UserAdvertsHintItem.Type type2 = UserAdvertsHintItem.Type.f267228f;
                String title = header.getTitle();
                String count = header.getCount();
                if (count == null) {
                    count = "";
                }
                userAdvertsHintItem = new UserAdvertsHintItem("common", title, "", count, type2, "", UserAdvertsHintItem.BackgroundColor.f267218d, C42784z0.f406748b);
            }
            return ShortAdvicesState.a(shortAdvicesState2, advices, userAdvertsHintItem, listB, type, 49);
        }
        if (interfaceC50283c2 instanceof InterfaceC50283c.C12921c) {
            return ShortAdvicesState.a(shortAdvicesState2, null, null, null, ShortAdvicesState.Type.f267279c, 63);
        }
        if (!(interfaceC50283c2 instanceof InterfaceC50283c.d)) {
            if (interfaceC50283c2 instanceof InterfaceC50283c.h) {
                return new ShortAdvicesState(shortAdvicesState2.f267271a, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
            }
            if (interfaceC50283c2 instanceof InterfaceC50283c.f ? true : interfaceC50283c2 instanceof InterfaceC50283c.g ? true : interfaceC50283c2 instanceof InterfaceC50283c.e) {
                return shortAdvicesState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC50283c.d dVar = (InterfaceC50283c.d) interfaceC50283c2;
        Advices advices2 = shortAdvicesState2.f267272b;
        if (advices2 == null) {
            advicesCopy$default = null;
        } else {
            List<Advice> advices3 = advices2.getAdvices();
            if (advices3 != null) {
                arrayList = new ArrayList();
                for (Object obj : advices3) {
                    if (!L.f(((Advice) obj).getAdviceId(), dVar.f443516a)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            advicesCopy$default = Advices.copy$default(advices2, null, arrayList, 1, null);
        }
        return ShortAdvicesState.a(shortAdvicesState2, advicesCopy$default, null, b(advicesCopy$default), null, 117);
    }
}
