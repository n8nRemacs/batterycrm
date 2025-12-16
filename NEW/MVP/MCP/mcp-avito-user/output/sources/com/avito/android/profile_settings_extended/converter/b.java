package com.avito.android.profile_settings_extended.converter;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.edit_carousel.w;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_management_core.images.entity.UploadImageState;
import com.avito.android.profile_settings_extended.adapter.alert.PromoBlockItem;
import com.avito.android.profile_settings_extended.adapter.badge_bar.BadgeBarItem;
import com.avito.android.profile_settings_extended.adapter.gallery.image.GalleryImageItem;
import com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner.ReAgentShortFlowCreationBannerItem;
import com.avito.android.profile_settings_extended.adapter.section_header.SectionHeaderItem;
import com.avito.android.profile_settings_extended.entity.n;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadge;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadgeStyle;
import com.avito.android.remote.model.extended.Banner;
import com.avito.android.remote.model.extended.FieldModerationStatus;
import com.avito.android.remote.model.extended.ImageFieldValue;
import com.avito.android.remote.model.extended.LinkEditWidget;
import com.avito.android.remote.model.extended.ProfileBadgesWidget;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileSettingsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/converter/b;", "Lcom/avito/android/profile_settings_extended/converter/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.profile_settings_extended.converter.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.profile_settings_extended.adapter.setting.c f230021a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.profile_settings_extended.adapter.geo.a f230022b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final w f230023c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e f230024d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f230025e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final gD.f f230026f;

    /* compiled from: ExtendedProfileSettingsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f230027a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f230028b;

        static {
            int[] iArr = new int[Banner.Type.values().length];
            try {
                iArr[Banner.Type.RE_AGENT_SHORT_FLOW_ENTRY_POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Banner.Type.RE_AGENT_EMPTY_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Banner.Type.RE_AGENT_POPUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Banner.Type.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Banner.Type.WARNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Banner.Type.INFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f230027a = iArr;
            int[] iArr2 = new int[LinkEditWidget.ActionType.values().length];
            try {
                iArr2[LinkEditWidget.ActionType.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LinkEditWidget.ActionType.COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f230028b = iArr2;
        }
    }

    @Inject
    public b(@k com.avito.android.profile_settings_extended.adapter.setting.c cVar, @k com.avito.android.profile_settings_extended.adapter.geo.a aVar, @k w wVar, @k e eVar, @k InterfaceC35863o4 interfaceC35863o4, @k gD.f fVar) {
        this.f230021a = cVar;
        this.f230022b = aVar;
        this.f230023c = wVar;
        this.f230024d = eVar;
        this.f230025e = interfaceC35863o4;
        this.f230026f = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.profile_settings_extended.entity.c b(com.avito.android.remote.model.extended.BasicInfoV2Widget r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.converter.b.b(com.avito.android.remote.model.extended.BasicInfoV2Widget, boolean):com.avito.android.profile_settings_extended.entity.c");
    }

    public static n c(ProfileBadgesWidget profileBadgesWidget) {
        ArrayList arrayList = new ArrayList();
        ProfileBadgesWidget.Config config = profileBadgesWidget.getConfig();
        String title = config.getTitle();
        String str = title == null ? "" : title;
        String description = config.getDescription();
        arrayList.add(new SectionHeaderItem(null, str, description == null ? "" : description, 1, null));
        if (O2.a(config.getBadges())) {
            List<AdvertBadge> badges = config.getBadges();
            if (badges == null) {
                badges = C42784z0.f406748b;
            }
            List<AdvertBadge> list = badges;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                UniversalImage icon = null;
                if (!it.hasNext()) {
                    break;
                }
                AdvertBadge advertBadge = (AdvertBadge) it.next();
                String strValueOf = String.valueOf(advertBadge.getId());
                int id2 = advertBadge.getId();
                String title2 = advertBadge.getTitle();
                String description2 = advertBadge.getDescription();
                String str2 = description2 == null ? "" : description2;
                AdvertBadgeStyle style = advertBadge.getStyle();
                UniversalColor backgroundColor = style != null ? style.getBackgroundColor() : null;
                AdvertBadgeStyle style2 = advertBadge.getStyle();
                UniversalColor backgroundPressedColor = style2 != null ? style2.getBackgroundPressedColor() : null;
                AdvertBadgeStyle style3 = advertBadge.getStyle();
                UniversalColor fontColor = style3 != null ? style3.getFontColor() : null;
                AdvertBadgeStyle style4 = advertBadge.getStyle();
                if (style4 != null) {
                    icon = style4.getIcon();
                }
                arrayList2.add(new BadgeItem(strValueOf, id2, title2, str2, backgroundColor, backgroundPressedColor, fontColor, 1, 1, icon, advertBadge.getUri(), false, false, null, 14336, null));
            }
            arrayList.add(new BadgeBarItem(null, arrayList2, 1, null));
        }
        String widgetName = profileBadgesWidget.getWidgetName();
        return new n(widgetName != null ? widgetName : "", arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.profile_settings_extended.entity.t d(com.avito.android.remote.model.extended.SelectionsWidget r30, boolean r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.converter.b.d(com.avito.android.remote.model.extended.SelectionsWidget, boolean, java.lang.String):com.avito.android.profile_settings_extended.entity.t");
    }

    public static GalleryImageItem e(ImageFieldValue imageFieldValue, String str, boolean z12, UploadImage.Type type, GalleryImageItem.ScaleType scaleType) {
        String valueId = imageFieldValue.getValueId();
        FieldModerationStatus status = imageFieldValue.getStatus();
        return new GalleryImageItem(null, z12, new UploadImage.ImageFromApi(valueId, status != null ? com.avito.android.profile_management_core.images.entity.c.a(com.avito.android.profile_management_core.moderation.a.a(status)) : UploadImageState.Set.f226707b, str, type, imageFieldValue.getValue()), scaleType, 1, null);
    }

    public static ReAgentShortFlowCreationBannerItem f(Banner banner) {
        DeeplinkAction action;
        DeeplinkAction action2;
        String description = banner.getDescription();
        List<Banner.Button> buttons = banner.getButtons();
        Banner.Button button = buttons != null ? (Banner.Button) C42745f0.K(0, buttons) : null;
        DeepLink deepLink = (button == null || (action2 = button.getAction()) == null) ? null : action2.getDeepLink();
        List<Banner.Button> buttons2 = banner.getButtons();
        Banner.Button button2 = buttons2 != null ? (Banner.Button) C42745f0.K(1, buttons2) : null;
        DeepLink deepLink2 = (button2 == null || (action = button2.getAction()) == null) ? null : action.getDeepLink();
        if (description == null || button == null || deepLink == null || button2 == null || deepLink2 == null) {
            return null;
        }
        return new ReAgentShortFlowCreationBannerItem(null, banner.getTitle(), description, new ReAgentShortFlowCreationBannerItem.ButtonData(button.getTitle(), deepLink), new ReAgentShortFlowCreationBannerItem.ButtonData(button2.getTitle(), deepLink2), 1, null);
    }

    public static PromoBlockItem.Button g(Banner.Button button) {
        String actionType;
        DeepLink deepLink = button.getAction().getDeepLink();
        PromoBlockItem.ButtonAnalyticParams buttonAnalyticParams = null;
        if (deepLink == null) {
            return null;
        }
        String title = button.getTitle();
        Banner.ButtonAnalyticParams analyticParams = button.getAnalyticParams();
        if (analyticParams != null && (actionType = analyticParams.getActionType()) != null) {
            buttonAnalyticParams = new PromoBlockItem.ButtonAnalyticParams(actionType);
        }
        return new PromoBlockItem.Button(title, deepLink, false, buttonAnalyticParams, 4, null);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // com.avito.android.profile_settings_extended.converter.a
    @Y61.k
    public final com.avito.android.profile_settings_extended.entity.u a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r48v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
}
