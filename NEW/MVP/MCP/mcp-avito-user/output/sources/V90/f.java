package v90;

import Y61.k;
import Y61.l;
import com.avito.android.profile.pro.impl.network.response.ProDashboardResponse;
import com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSeverity;
import com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug;
import com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ProfileOtherDashboardItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProDashboardItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lv90/f;", "Lv90/e;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* compiled from: ProfileProDashboardItemConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv90/f$a;", "", "<init>", "()V", "", "PROFILE_PRO_DASHBOARD_OTHER_ITEM", "Ljava/lang/String;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d A[PHI: r3
  0x002d: PHI (r3v10 com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug) = 
  (r3v3 com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug)
  (r3v4 com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug)
  (r3v5 com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug)
  (r3v6 com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug)
  (r3v7 com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug)
  (r3v8 com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug)
  (r3v9 com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug)
 binds: [B:6:0x002b, B:9:0x0037, B:12:0x0042, B:15:0x004d, B:18:0x0058, B:21:0x0063, B:24:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ProfileOtherDashboardItem d(com.avito.android.profile.pro.impl.network.response.ProDashboardResponse.ItemWidgetAttrText r17, boolean r18, boolean r19) {
        /*
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ProfileOtherDashboardItem r16 = new com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ProfileOtherDashboardItem
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "dashboard_other_item"
            r0.<init>(r1)
            java.lang.String r1 = r17.getSlug()
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = r17.getSlug()
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug r2 = com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug.f223103d
            java.lang.String r3 = "sellerItemsStatuses"
            boolean r3 = kotlin.jvm.internal.L.f(r0, r3)
            if (r3 == 0) goto L23
            goto L71
        L23:
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug r3 = com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug.f223104e
            java.lang.String r4 = "sellingCoachPromo"
            boolean r4 = kotlin.jvm.internal.L.f(r0, r4)
            if (r4 == 0) goto L2f
        L2d:
            r2 = r3
            goto L71
        L2f:
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug r3 = com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug.f223105f
            java.lang.String r4 = "serviceQualityCalls"
            boolean r4 = kotlin.jvm.internal.L.f(r0, r4)
            if (r4 == 0) goto L3a
            goto L2d
        L3a:
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug r3 = com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug.f223106g
            java.lang.String r4 = "serviceQualityChats"
            boolean r4 = kotlin.jvm.internal.L.f(r0, r4)
            if (r4 == 0) goto L45
            goto L2d
        L45:
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug r3 = com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug.f223109j
            java.lang.String r4 = "market"
            boolean r4 = kotlin.jvm.internal.L.f(r0, r4)
            if (r4 == 0) goto L50
            goto L2d
        L50:
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug r3 = com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug.f223107h
            java.lang.String r4 = "serviceQualityDelivery"
            boolean r4 = kotlin.jvm.internal.L.f(r0, r4)
            if (r4 == 0) goto L5b
            goto L2d
        L5b:
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug r3 = com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug.f223108i
            java.lang.String r4 = "serviceQualityGrade"
            boolean r4 = kotlin.jvm.internal.L.f(r0, r4)
            if (r4 == 0) goto L66
            goto L2d
        L66:
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug r3 = com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug.f223110k
            java.lang.String r4 = "promote"
            boolean r0 = kotlin.jvm.internal.L.f(r0, r4)
            if (r0 == 0) goto L71
            goto L2d
        L71:
            java.lang.String r0 = r17.getSeverity()
            if (r0 != 0) goto L79
            java.lang.String r0 = ""
        L79:
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSeverity r3 = e(r0)
            com.avito.android.remote.model.text.AttributedText r5 = r17.getTitle()
            com.avito.android.remote.model.text.AttributedText r7 = r17.getDescription()
            com.avito.android.remote.model.text.AttributedText r9 = r17.getValue()
            com.avito.android.remote.model.text.AttributedText r10 = r17.getValueType()
            java.lang.String r13 = r17.getAction()
            com.avito.android.deep_linking.links.DeepLink r14 = r17.getDeeplinkAction()
            com.avito.android.remote.model.UniversalImage r15 = r17.getIcon()
            r6 = 0
            r8 = 0
            r4 = 0
            r0 = r16
            r11 = r18
            r12 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: v90.f.d(com.avito.android.profile.pro.impl.network.response.ProDashboardResponse$ItemWidgetAttrText, boolean, boolean):com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ProfileOtherDashboardItem");
    }

    public static ItemSeverity e(String str) {
        ItemSeverity itemSeverity = ItemSeverity.f223095b;
        if (str.equals("attention")) {
            return itemSeverity;
        }
        ItemSeverity itemSeverity2 = ItemSeverity.f223096c;
        if (!str.equals("good")) {
            itemSeverity2 = ItemSeverity.f223097d;
            if (!str.equals("gray")) {
                itemSeverity2 = ItemSeverity.f223098e;
                if (!str.equals("red")) {
                    itemSeverity2 = ItemSeverity.f223099f;
                    if (!str.equals("green")) {
                        itemSeverity2 = ItemSeverity.f223100g;
                        if (!str.equals("yellow")) {
                            return itemSeverity;
                        }
                    }
                }
            }
        }
        return itemSeverity2;
    }

    @Override // v90.e
    @l
    public final ProfileOtherDashboardItem a(@k ProDashboardResponse proDashboardResponse) {
        ProDashboardResponse.ItemWidgetAttrText itemWidgetAttrText;
        Object next;
        List<ProDashboardResponse.ItemWidgetAttrText> listD = proDashboardResponse.getWidgets().d();
        if (listD != null) {
            Iterator<T> it = listD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String slug = ((ProDashboardResponse.ItemWidgetAttrText) next).getSlug();
                ItemSlug itemSlug = ItemSlug.f223103d;
                if (L.f(slug, "serviceQualityGrade")) {
                    break;
                }
            }
            itemWidgetAttrText = (ProDashboardResponse.ItemWidgetAttrText) next;
        } else {
            itemWidgetAttrText = null;
        }
        if (itemWidgetAttrText != null) {
            return d(itemWidgetAttrText, false, false);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    @Override // v90.e
    @k
    public final ArrayList b(@k D90.d dVar) {
        ?? arrayList;
        ProDashboardResponse.Widgets widgets;
        ArrayList arrayList2 = new ArrayList(dVar.f3066f);
        Iterator it = arrayList2.iterator();
        int i12 = 0;
        int i13 = -1;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) next;
            if ((aVar instanceof ProfileOtherDashboardItem) && ((ProfileOtherDashboardItem) aVar).f223126m) {
                i13 = i12;
            }
            i12 = i14;
        }
        if (i13 != -1) {
            arrayList2.remove(i13);
            ProDashboardResponse proDashboardResponse = dVar.f3067g;
            if (((proDashboardResponse == null || (widgets = proDashboardResponse.getWidgets()) == null) ? null : widgets.d()) != null) {
                List<ProDashboardResponse.ItemWidgetAttrText> listD = proDashboardResponse.getWidgets().d();
                arrayList = new ArrayList();
                int i15 = 0;
                for (Object obj : listD) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    ProDashboardResponse.ItemWidgetAttrText itemWidgetAttrText = (ProDashboardResponse.ItemWidgetAttrText) obj;
                    String severity = itemWidgetAttrText.getSeverity();
                    if (severity == null) {
                        severity = "";
                    }
                    if (e(severity) == ItemSeverity.f223096c) {
                        String slug = itemWidgetAttrText.getSlug();
                        ItemSlug itemSlug = ItemSlug.f223103d;
                        if (!L.f(slug, "serviceQualityGrade")) {
                            arrayList.add(d(itemWidgetAttrText, arrayList.isEmpty(), false));
                        }
                    }
                    i15 = i16;
                }
            } else {
                arrayList = C42784z0.f406748b;
            }
            arrayList2.addAll(i13, (Collection) arrayList);
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    @Override // v90.e
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList c(@Y61.k com.avito.android.profile.pro.impl.network.response.ProDashboardResponse r22) {
        /*
            r21 = this;
            r0 = 1
            com.avito.android.profile.pro.impl.network.response.ProDashboardResponse$Widgets r1 = r22.getWidgets()
            java.util.List r1 = r1.d()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r1 == 0) goto La6
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r5 = r4
        L19:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto La6
            java.lang.Object r6 = r3.next()
            int r7 = r5 + 1
            if (r5 < 0) goto La1
            com.avito.android.profile.pro.impl.network.response.ProDashboardResponse$ItemWidgetAttrText r6 = (com.avito.android.profile.pro.impl.network.response.ProDashboardResponse.ItemWidgetAttrText) r6
            java.lang.String r8 = r6.getSlug()
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug r9 = com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSlug.f223103d
            java.lang.String r9 = "serviceQualityGrade"
            boolean r8 = kotlin.jvm.internal.L.f(r8, r9)
            if (r8 != 0) goto L9e
            java.lang.String r8 = r6.getSeverity()
            java.lang.String r9 = ""
            if (r8 != 0) goto L40
            r8 = r9
        L40:
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSeverity r8 = e(r8)
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSeverity r10 = com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSeverity.f223096c
            if (r8 == r10) goto L4a
            r8 = r0
            goto L4b
        L4a:
            r8 = r4
        L4b:
            if (r8 == 0) goto L59
            if (r5 != 0) goto L51
            r11 = r0
            goto L52
        L51:
            r11 = r4
        L52:
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ProfileOtherDashboardItem r6 = d(r6, r11, r4)
            r2.add(r6)
        L59:
            int r6 = r1.size()
            int r6 = r6 - r0
            if (r6 == r5) goto L7c
            java.lang.Object r6 = r1.get(r7)
            com.avito.android.profile.pro.impl.network.response.ProDashboardResponse$ItemWidgetAttrText r6 = (com.avito.android.profile.pro.impl.network.response.ProDashboardResponse.ItemWidgetAttrText) r6
            java.lang.String r6 = r6.getSeverity()
            if (r6 != 0) goto L6d
            goto L6e
        L6d:
            r9 = r6
        L6e:
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ItemSeverity r6 = e(r9)
            if (r6 != r10) goto L76
            r6 = r0
            goto L77
        L76:
            r6 = r4
        L77:
            if (r8 == 0) goto L7c
            if (r6 == 0) goto L7c
            goto L80
        L7c:
            if (r5 != 0) goto L9e
            if (r8 != 0) goto L9e
        L80:
            com.avito.android.profile.pro.impl.network.response.ProDashboardResponse$ItemWidgetAttrText r5 = new com.avito.android.profile.pro.impl.network.response.ProDashboardResponse$ItemWidgetAttrText
            r17 = 0
            r18 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r15 = "emptyWidget"
            r16 = 0
            r19 = 479(0x1df, float:6.71E-43)
            r20 = 0
            r9 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ProfileOtherDashboardItem r5 = d(r5, r4, r0)
            r2.add(r5)
        L9e:
            r5 = r7
            goto L19
        La1:
            kotlin.collections.C42745f0.H0()
            r0 = 0
            throw r0
        La6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v90.f.c(com.avito.android.profile.pro.impl.network.response.ProDashboardResponse):java.util.ArrayList");
    }
}
