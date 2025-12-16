package com.avito.android.advert_core.contactbar;

import com.avito.android.C29640d;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.delivery_combined_buttons_public.CombinedButtonsData;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.PriorityContactsMethodType;
import com.avito.android.remote.model.auto_select.SelectLayoutMode;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.remote.sticky_block.StickyBlock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lD.C43617a;
import ur.InterfaceC49101b;

/* compiled from: ContactBarActionsFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/contactbar/C;", "", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28262a f83110a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.safedeal.trust_factors.a f83111b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f83112c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43617a f83113d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C29640d f83114e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.installments.d f83115f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.price_with_delivery.c f83116g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f83117h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContactBarActionsFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/contactbar/C$a;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f83118b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f83119c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f83120d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f83121e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f83122f;

        static {
            a aVar = new a("STICKY_SINGLE_LINE_TRUST_FACTORS_BUTTON", 0);
            f83118b = aVar;
            a aVar2 = new a("SAFEDEAL_COMBINED_BUTTONS_FROM_STICKY_BLOCK", 1);
            f83119c = aVar2;
            a aVar3 = new a("SAFEDEAL_COMBINED_BUTTONS", 2);
            f83120d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f83121e = aVarArr;
            f83122f = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f83121e.clone();
        }
    }

    /* compiled from: ContactBarActionsFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83123a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f83124b;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a aVar = a.f83118b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a aVar2 = a.f83118b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PriorityContactsMethodType.values().length];
            try {
                iArr2[PriorityContactsMethodType.MESSENGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PriorityContactsMethodType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f83123a = iArr2;
            int[] iArr3 = new int[SelectLayoutMode.values().length];
            try {
                iArr3[SelectLayoutMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[SelectLayoutMode.PRIORITY_SCALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f83124b = iArr3;
        }
    }

    @Inject
    public C(@Y61.k InterfaceC28262a interfaceC28262a, @Y61.k com.avito.android.advert_core.safedeal.trust_factors.a aVar, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k C43617a c43617a, @Y61.k C29640d c29640d, @Y61.k com.avito.android.credits.installments.d dVar, @Y61.k com.avito.android.advert_core.price_with_delivery.c cVar, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.f83110a = interfaceC28262a;
        this.f83111b = aVar;
        this.f83112c = xVar;
        this.f83113d = c43617a;
        this.f83114e = c29640d;
        this.f83115f = dVar;
        this.f83116g = cVar;
        this.f83117h = interfaceC49101b;
    }

    public static boolean b(PriorityContactsMethodType priorityContactsMethodType, ContactBar.Button.Action.Type type) {
        ContactBar.Button.Action.Type type2;
        int i12 = b.f83123a[priorityContactsMethodType.ordinal()];
        if (i12 == 1) {
            type2 = ContactBar.Button.Action.Type.f125059c;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            type2 = ContactBar.Button.Action.Type.f125058b;
        }
        return type2 == type;
    }

    public static ContactBar.Button.Action.Type e(AdvertAction advertAction) {
        if (advertAction instanceof AdvertAction.Phone) {
            return ContactBar.Button.Action.Type.f125058b;
        }
        if (advertAction instanceof AdvertAction.Messenger) {
            return ContactBar.Button.Action.Type.f125059c;
        }
        if (advertAction instanceof AdvertAction.Access) {
            return ContactBar.Button.Action.Type.f125060d;
        }
        if (advertAction instanceof AdvertAction.Booking) {
            return ContactBar.Button.Action.Type.f125061e;
        }
        if (advertAction instanceof AdvertAction.CallOrder) {
            return ContactBar.Button.Action.Type.f125064h;
        }
        if (advertAction instanceof AdvertAction.IacVideoCallRequest) {
            return ContactBar.Button.Action.Type.f125063g;
        }
        if (advertAction instanceof AdvertAction.ServiceOrderRequest) {
            return ContactBar.Button.Action.Type.f125062f;
        }
        if (advertAction instanceof AdvertAction.RealtyLayout) {
            return ContactBar.Button.Action.Type.f125065i;
        }
        if (advertAction instanceof AdvertAction.GigApply) {
            return ContactBar.Button.Action.Type.f125066j;
        }
        if (advertAction instanceof AdvertAction.SecondaryAction) {
            return ContactBar.Button.Action.Type.f125067k;
        }
        if (advertAction instanceof AdvertAction.FindShift) {
            return ContactBar.Button.Action.Type.f125068l;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean a(a aVar, AdvertDetails advertDetails) {
        int iOrdinal = aVar.ordinal();
        com.avito.android.advert_core.safedeal.trust_factors.a aVar2 = this.f83111b;
        if (iOrdinal == 0) {
            if (advertDetails.getStickyBlock() == null) {
                return false;
            }
            List<? extends TrustFactorsComponent> list = aVar2.f84277b;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((TrustFactorsComponent) it.next()) instanceof TrustFactorsComponent.Button) {
                }
            }
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            List<? extends TrustFactorsComponent> list2 = aVar2.f84276a;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((TrustFactorsComponent) it2.next()) instanceof TrustFactorsComponent.CombinedButtons) {
                }
            }
            return false;
        }
        if (advertDetails.getStickyBlock() == null || aVar2.f84277b.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01f0  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.android.component.advert_contact_bar.ContactBar.Button> c(@Y61.k com.avito.android.remote.model.AdvertDetails r32) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_core.contactbar.C.c(com.avito.android.remote.model.AdvertDetails):java.util.List");
    }

    public final ArrayList d(AdvertDetails advertDetails) {
        StickyBlock stickyBlock = advertDetails.getStickyBlock();
        com.avito.android.advert_core.safedeal.trust_factors.a aVar = this.f83111b;
        List<? extends TrustFactorsComponent> list = (stickyBlock == null || aVar.f84277b.isEmpty()) ? aVar.f84276a : aVar.f84277b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if ((obj instanceof TrustFactorsComponent.Button) && L.f(((TrustFactorsComponent.Button) obj).f84257b.getIsFloating(), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ContactBar.Button.Target targetA = R9.b.a(((TrustFactorsComponent.Button) it.next()).f84257b);
            if (targetA != null) {
                arrayList2.add(targetA);
            }
        }
        return arrayList2;
    }

    public final CombinedButtonsData f(AdvertDetails advertDetails) {
        Object next;
        SafeDeal.Component.CombinedButtons combinedButtons;
        StickyBlock stickyBlock = advertDetails.getStickyBlock();
        com.avito.android.advert_core.safedeal.trust_factors.a aVar = this.f83111b;
        Iterator<T> it = (stickyBlock == null ? aVar.f84276a : aVar.f84277b).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof TrustFactorsComponent.CombinedButtons) {
                break;
            }
        }
        if (!(next instanceof TrustFactorsComponent.CombinedButtons)) {
            next = null;
        }
        TrustFactorsComponent.CombinedButtons combinedButtons2 = (TrustFactorsComponent.CombinedButtons) next;
        if (combinedButtons2 == null || (combinedButtons = combinedButtons2.f84259b) == null) {
            return null;
        }
        return R9.a.a(combinedButtons);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList g(@Y61.k com.avito.android.remote.model.AdvertActions r30, boolean r31, boolean r32) {
        /*
            r29 = this;
            r0 = r29
            java.util.List r1 = r30.getActions()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C42745f0.q(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Ldc
            java.lang.Object r3 = r1.next()
            com.avito.android.remote.model.AdvertAction r3 = (com.avito.android.remote.model.AdvertAction) r3
            com.avito.android.advert_core.contactbar.a r4 = r0.f83110a
            kotlin.Q r4 = r4.a(r3)
            A r5 = r4.f406619b
            r8 = r5
            java.lang.Integer r8 = (java.lang.Integer) r8
            B r4 = r4.f406620c
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Action$Type r5 = e(r3)
            com.avito.android.remote.model.PriorityContactsMethod r6 = r30.getPriorityMethod()
            r7 = 0
            if (r6 == 0) goto L4c
            com.avito.android.remote.model.PriorityContactsMethodType r6 = r6.getType()
            boolean r5 = b(r6, r5)
            r18 = r5
            goto L4e
        L4c:
            r18 = r7
        L4e:
            java.lang.String r5 = r3.getTitle()
            com.avito.android.remote.model.PriorityContactsMethod r6 = r30.getPriorityMethod()
            if (r6 == 0) goto L5b
            r4 = 2131101554(0x7f060772, float:1.781552E38)
        L5b:
            r9 = r4
            com.avito.android.deep_linking.links.DeepLink r4 = r3.getDeepLink()
            if (r4 != 0) goto L67
            com.avito.android.deep_linking.links.NoMatchLink r4 = new com.avito.android.deep_linking.links.NoMatchLink
            r4.<init>()
        L67:
            r10 = r4
            boolean r4 = r3 instanceof com.avito.android.remote.model.AdvertAction.Messenger
            r6 = 1
            if (r4 == 0) goto L93
            com.avito.android.deep_linking.links.DeepLink r4 = r3.getDeepLink()
            boolean r4 = r4 instanceof com.avito.android.deep_linking.links.auth.AuthenticateLink
            if (r4 == 0) goto L93
            com.avito.android.d r4 = r0.f83114e
            r4.getClass()
            kotlin.reflect.n<java.lang.Object>[] r11 = com.avito.android.C29640d.f132175X
            r12 = 5
            r11 = r11[r12]
            com.avito.android.A0$a r4 = r4.f132204g
            DE0.a r4 = r4.a()
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L93
            r11 = r6
            goto L94
        L93:
            r11 = r7
        L94:
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Action$Type r12 = e(r3)
            java.lang.Boolean r4 = r3.getDisabled()
            if (r4 == 0) goto La4
            boolean r4 = r4.booleanValue()
            r15 = r4
            goto La5
        La4:
            r15 = r7
        La5:
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Width r24 = com.avito.android.component.advert_contact_bar.ContactBar.Button.Width.f125098c
            if (r31 == 0) goto Lac
        La9:
            r16 = r7
            goto Lb0
        Lac:
            if (r32 != 0) goto La9
            r16 = r6
        Lb0:
            java.lang.String r19 = r3.getStyle()
            ur.b r3 = r0.f83117h
            boolean r13 = r3.c()
            boolean r23 = r3.c()
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Action r3 = new com.avito.android.component.advert_contact_bar.ContactBar$Button$Action
            r6 = r3
            r25 = 0
            r26 = 0
            r14 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r27 = 581760(0x8e080, float:8.1522E-40)
            r28 = 0
            r7 = r5
            r17 = r32
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r2.add(r3)
            goto L17
        Ldc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_core.contactbar.C.g(com.avito.android.remote.model.AdvertActions, boolean, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList h(@Y61.k com.avito.android.remote.model.AdvertActions r29) {
        /*
            r28 = this;
            r0 = r28
            java.util.List r1 = r29.getActions()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C42745f0.q(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lba
            java.lang.Object r3 = r1.next()
            com.avito.android.remote.model.AdvertAction r3 = (com.avito.android.remote.model.AdvertAction) r3
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Action$Type r10 = e(r3)
            com.avito.android.remote.model.PriorityContactsMethod r4 = r29.getPriorityMethod()
            r5 = 0
            if (r4 == 0) goto L39
            com.avito.android.remote.model.PriorityContactsMethodType r4 = r4.getType()
            boolean r4 = b(r4, r10)
            r16 = r4
            goto L3b
        L39:
            r16 = r5
        L3b:
            java.lang.String r8 = r3.getTitle()
            com.avito.android.deep_linking.links.DeepLink r4 = r3.getDeepLink()
            if (r4 != 0) goto L4a
            com.avito.android.deep_linking.links.NoMatchLink r4 = new com.avito.android.deep_linking.links.NoMatchLink
            r4.<init>()
        L4a:
            r9 = r4
            boolean r4 = r3 instanceof com.avito.android.remote.model.AdvertAction.Messenger
            if (r4 == 0) goto L76
            com.avito.android.deep_linking.links.DeepLink r4 = r3.getDeepLink()
            boolean r4 = r4 instanceof com.avito.android.deep_linking.links.auth.AuthenticateLink
            if (r4 == 0) goto L76
            com.avito.android.d r4 = r0.f83114e
            r4.getClass()
            kotlin.reflect.n<java.lang.Object>[] r6 = com.avito.android.C29640d.f132175X
            r7 = 5
            r6 = r6[r7]
            com.avito.android.A0$a r4 = r4.f132204g
            DE0.a r4 = r4.a()
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L76
            r4 = 1
            r13 = r4
            goto L77
        L76:
            r13 = r5
        L77:
            java.lang.Boolean r3 = r3.getDisabled()
            if (r3 == 0) goto L82
            boolean r3 = r3.booleanValue()
            goto L83
        L82:
            r3 = r5
        L83:
            ur.b r4 = r0.f83117h
            boolean r11 = r4.c()
            boolean r21 = r4.c()
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Action r5 = new com.avito.android.component.advert_contact_bar.ContactBar$Button$Action
            r4 = r5
            r23 = 0
            r24 = 0
            r6 = 0
            r7 = 2131101554(0x7f060772, float:1.781552E38)
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r25 = 980608(0xef680, float:1.374124E-39)
            r26 = 0
            r27 = r5
            r5 = r8
            r8 = r9
            r9 = r13
            r13 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r3 = r27
            r2.add(r3)
            goto L17
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_core.contactbar.C.h(com.avito.android.remote.model.AdvertActions):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.avito.android.component.advert_contact_bar.ContactBar$Button$Target] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.avito.android.component.advert_contact_bar.ContactBar$Button] */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.avito.android.component.advert_contact_bar.ContactBar$Button$Target] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.avito.android.component.advert_contact_bar.ContactBar$Button$Custom$DeliveryCombinedButtons] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList i(@Y61.k java.util.List r7, @Y61.k com.avito.android.remote.model.AdvertDetails r8) {
        /*
            r6 = this;
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        Lb:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lb8
            java.lang.Object r1 = r7.next()
            com.avito.android.component.advert_contact_bar.ContactBar$Button r1 = (com.avito.android.component.advert_contact_bar.ContactBar.Button) r1
            boolean r2 = r1 instanceof com.avito.android.component.advert_contact_bar.ContactBar.Button.Target
            if (r2 == 0) goto L5e
            r3 = r1
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Target r3 = (com.avito.android.component.advert_contact_bar.ContactBar.Button.Target) r3
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Target$Type r4 = r3.f125081i
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Target$Type r5 = com.avito.android.component.advert_contact_bar.ContactBar.Button.Target.Type.f125085b
            if (r4 != r5) goto L5e
            com.avito.android.remote.sticky_block.StickyBlock r1 = r8.getStickyBlock()
            com.avito.android.advert_core.safedeal.trust_factors.a r2 = r6.f83111b
            if (r1 == 0) goto L2f
            java.util.List<? extends com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent> r1 = r2.f84277b
            goto L31
        L2f:
            java.util.List<? extends com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent> r1 = r2.f84276a
        L31:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L37:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r1.next()
            com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent r2 = (com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent) r2
            java.lang.String r4 = r2.getF84275c()
            java.lang.String r5 = r3.f125084l
            boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
            if (r4 == 0) goto L37
            boolean r4 = r2 instanceof com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent.Button
            if (r4 == 0) goto L37
            com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent$Button r2 = (com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent.Button) r2
            com.avito.android.remote.safedeal.SafeDeal$Component$Button r1 = r2.f84257b
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Target r1 = R9.b.a(r1)
            goto Lb1
        L5c:
            r1 = 0
            goto Lb1
        L5e:
            r3 = 0
            if (r2 == 0) goto L91
            r2 = r1
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Target r2 = (com.avito.android.component.advert_contact_bar.ContactBar.Button.Target) r2
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Target$Type r4 = r2.f125081i
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Target$Type r5 = com.avito.android.component.advert_contact_bar.ContactBar.Button.Target.Type.f125087d
            if (r4 != r5) goto L91
            com.avito.android.remote.model.service_order.ServiceOrder r1 = r8.getServiceOrderButton()
            if (r1 == 0) goto L8f
            com.avito.android.remote.model.service_order.ServiceOrderAction r1 = r1.getPrimaryAction()
            if (r1 == 0) goto L8f
            java.lang.String r4 = r1.getTitle()
            com.avito.android.deep_linking.links.DeepLink r5 = r1.getUri()
            java.lang.Boolean r1 = r1.getIsLoading()
            if (r1 == 0) goto L88
            boolean r3 = r1.booleanValue()
        L88:
            r1 = 2034(0x7f2, float:2.85E-42)
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Target r1 = com.avito.android.component.advert_contact_bar.ContactBar.Button.Target.d(r2, r4, r5, r3, r1)
            goto Lb1
        L8f:
            r1 = r2
            goto Lb1
        L91:
            boolean r2 = r1 instanceof com.avito.android.component.advert_contact_bar.ContactBar.Button.Custom.DeliveryCombinedButtons
            if (r2 == 0) goto Lb1
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Custom$DeliveryCombinedButtons r1 = (com.avito.android.component.advert_contact_bar.ContactBar.Button.Custom.DeliveryCombinedButtons) r1
            com.avito.android.delivery_combined_buttons_public.CombinedButtonsData r2 = r6.f(r8)
            if (r2 == 0) goto La7
            int r4 = r2.f134955c
            if (r4 <= 0) goto La2
            r3 = 1
        La2:
            com.avito.android.advert_core.price_with_delivery.c r4 = r6.f83116g
            r4.c(r3)
        La7:
            if (r2 == 0) goto Lb1
            java.lang.String r1 = r1.f125072c
            com.avito.android.component.advert_contact_bar.ContactBar$Button$Custom$DeliveryCombinedButtons r3 = new com.avito.android.component.advert_contact_bar.ContactBar$Button$Custom$DeliveryCombinedButtons
            r3.<init>(r2, r1)
            r1 = r3
        Lb1:
            if (r1 == 0) goto Lb
            r0.add(r1)
            goto Lb
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_core.contactbar.C.i(java.util.List, com.avito.android.remote.model.AdvertDetails):java.util.ArrayList");
    }
}
