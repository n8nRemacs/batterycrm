package com.avito.android.profile_vk_linking.group_management.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopupBanner;
import com.avito.android.profile_vk_linking.generated.api.profile_vk_groups_api.ButtonWithAction;
import com.avito.android.profile_vk_linking.generated.api.profile_vk_groups_api.ButtonWithDeeplink;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: VkGroupsModelConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_vk_linking/group_management/mvi/a;", "", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: VkGroupsModelConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_vk_linking.group_management.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C7038a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f231197a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f231198b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f231199c;

        static {
            int[] iArr = new int[ButtonWithDeeplink.Type.values().length];
            try {
                iArr[ButtonWithDeeplink.Type.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonWithDeeplink.Type.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f231197a = iArr;
            int[] iArr2 = new int[ButtonWithAction.Action.values().length];
            try {
                iArr2[ButtonWithAction.Action.Finish.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ButtonWithAction.Action.Unlink.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonWithAction.Action.Link.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ButtonWithAction.Action.Next.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ButtonWithAction.Action.Reload.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f231198b = iArr2;
            int[] iArr3 = new int[ButtonWithAction.Type.values().length];
            try {
                iArr3[ButtonWithAction.Type.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ButtonWithAction.Type.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f231199c = iArr3;
        }
    }

    @Inject
    public a() {
    }

    @Y61.k
    public static VkPopup a(@Y61.k Oc0.g gVar, @Y61.k x xVar) {
        VkPopupBanner vkPopupBanner;
        VkPopup.CommonButton.a aVar;
        VkPopup.CommonButton.ActionButton actionButton;
        VkPopup.CommonButton.ActionButton.ActionType actionType;
        VkPopup.CommonButton.Type type;
        VkPopup.CommonButton.Type type2;
        VkPopupBanner.Type type3;
        VkPopupBanner.Type type4;
        ArrayList arrayList;
        VkPopupBanner.a aVar2;
        String navigation2 = gVar.getNavigation();
        String title = gVar.getTitle();
        AttributedText text = gVar.getText();
        Oc0.h banner = gVar.getBanner();
        if (banner != null) {
            String title2 = banner.getTitle();
            String description = banner.getDescription();
            AttributedText attributedDescription = banner.getAttributedDescription();
            String type5 = banner.getType();
            int iHashCode = type5.hashCode();
            if (iHashCode == 3237038) {
                if (type5.equals(RequestReviewResultKt.INFO_TYPE)) {
                    type3 = VkPopupBanner.Type.f231036d;
                    type4 = type3;
                }
                type4 = null;
            } else if (iHashCode != 96784904) {
                if (iHashCode == 1124446108 && type5.equals(ConstraintKt.WARNING)) {
                    type3 = VkPopupBanner.Type.f231035c;
                    type4 = type3;
                }
                type4 = null;
            } else {
                if (type5.equals("error")) {
                    type3 = VkPopupBanner.Type.f231034b;
                    type4 = type3;
                }
                type4 = null;
            }
            List<Oc0.c> listB = banner.b();
            if (listB != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Oc0.c cVar : listB) {
                    Oc0.b action = cVar.getAction();
                    if (action != null) {
                        String title3 = action.getTitle();
                        String uri = action.getUri();
                        aVar2 = new VkPopupBanner.a(cVar.getTitle(), new DeeplinkAction(title3, uri != null ? xVar.b(uri) : null));
                    } else {
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        arrayList2.add(aVar2);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            vkPopupBanner = new VkPopupBanner(title2, description, attributedDescription, type4, arrayList);
        } else {
            vkPopupBanner = null;
        }
        List<Oc0.i> listC = gVar.c();
        ArrayList arrayList3 = new ArrayList(C42745f0.q(listC, 10));
        for (Oc0.i iVar : listC) {
            ButtonWithDeeplink deeplink = iVar.getDeeplink();
            if (deeplink != null) {
                String title4 = deeplink.getTitle();
                DeepLink deeplink2 = deeplink.getDeeplink();
                int i12 = C7038a.f231197a[deeplink.getType().ordinal()];
                if (i12 == 1) {
                    type2 = VkPopup.CommonButton.Type.f231022b;
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    type2 = VkPopup.CommonButton.Type.f231023c;
                }
                aVar = new VkPopup.CommonButton.a(title4, deeplink2, type2);
            } else {
                aVar = null;
            }
            ButtonWithAction action2 = iVar.getAction();
            if (action2 != null) {
                String title5 = action2.getTitle();
                int i13 = C7038a.f231198b[action2.getAction().ordinal()];
                if (i13 == 1) {
                    actionType = VkPopup.CommonButton.ActionButton.ActionType.f231015b;
                } else if (i13 == 2) {
                    actionType = VkPopup.CommonButton.ActionButton.ActionType.f231018e;
                } else if (i13 == 3) {
                    actionType = VkPopup.CommonButton.ActionButton.ActionType.f231017d;
                } else if (i13 == 4) {
                    actionType = VkPopup.CommonButton.ActionButton.ActionType.f231019f;
                } else {
                    if (i13 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    actionType = VkPopup.CommonButton.ActionButton.ActionType.f231016c;
                }
                int i14 = C7038a.f231199c[action2.getType().ordinal()];
                if (i14 == 1) {
                    type = VkPopup.CommonButton.Type.f231022b;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    type = VkPopup.CommonButton.Type.f231023c;
                }
                actionButton = new VkPopup.CommonButton.ActionButton(title5, actionType, type);
            } else {
                actionButton = null;
            }
            arrayList3.add(new VkPopup.CommonButton(aVar, actionButton, iVar.getIsMore()));
        }
        return new VkPopup(navigation2, title, text, vkPopupBanner, arrayList3, gVar.getBottomText());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Wc0.C15743a.b b(com.avito.android.profile_vk_linking.group_management.mvi.a r18, Oc0.g r19, java.util.List r20, com.avito.android.deep_linking.x r21, int r22) {
        /*
            r0 = r22 & 2
            r3 = 0
            if (r0 == 0) goto L7
            r0 = r3
            goto L9
        L7:
            r0 = r20
        L9:
            if (r0 == 0) goto L41
            r18.getClass()
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            r4 = r2
            Oc0.f r4 = (Oc0.f) r4
            java.lang.Boolean r5 = r4.getDisabled()
            if (r5 == 0) goto L34
            java.lang.Boolean r4 = r4.getDisabled()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L15
            goto L34
        L33:
            r2 = r3
        L34:
            Oc0.f r2 = (Oc0.f) r2
            if (r2 == 0) goto L41
            long r1 = r2.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L42
        L41:
            r1 = r3
        L42:
            r18.getClass()
            r2 = r19
            r4 = r21
            com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup r2 = a(r2, r4)
            if (r0 == 0) goto Lb2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C42745f0.q(r0, r5)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L60:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lb3
            java.lang.Object r5 = r0.next()
            Oc0.f r5 = (Oc0.f) r5
            com.avito.android.profile_vk_linking.group_management.adapter.group.a r15 = new com.avito.android.profile_vk_linking.group_management.adapter.group.a
            long r8 = r5.getId()
            com.avito.android.remote.model.Image r10 = r5.getImage()
            java.lang.String r11 = r5.getName()
            java.lang.String r12 = r5.getDescription()
            long r6 = r5.getId()
            r13 = 0
            if (r1 != 0) goto L86
            goto L91
        L86:
            long r16 = r1.longValue()
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r6 != 0) goto L91
            r6 = 1
            r14 = r6
            goto L92
        L91:
            r14 = r13
        L92:
            java.lang.Boolean r5 = r5.getDisabled()
            if (r5 == 0) goto L9d
            boolean r5 = r5.booleanValue()
            goto L9e
        L9d:
            r5 = r13
        L9e:
            r7 = 0
            r16 = 1
            r17 = 0
            r6 = r15
            r13 = r14
            r14 = r5
            r5 = r15
            r15 = r16
            r16 = r17
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r16)
            r4.add(r5)
            goto L60
        Lb2:
            r4 = r3
        Lb3:
            Wc0.a$b r0 = new Wc0.a$b
            r5 = 0
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_vk_linking.group_management.mvi.a.b(com.avito.android.profile_vk_linking.group_management.mvi.a, Oc0.g, java.util.List, com.avito.android.deep_linking.x, int):Wc0.a$b");
    }
}
