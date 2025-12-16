package com.avito.android.bxcontent.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.brand_global_snippet.BrandGlobalSnippetItem;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.LoadState;
import com.avito.android.home.appending_item.loader.AppendingLoaderItem;
import com.avito.android.home.appending_item.retry.AppendingRetryItem;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.additional_buttons.UniversalButton;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.search_bar.utils.UdfToolbarStyle;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.actions_horizontal_block.Action;
import com.avito.android.serp.adapter.actions_horizontal_block.ActionsHorizontalBlockItem;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.serp.adapter.home_section_tab.SectionTag;
import com.avito.android.serp.adapter.home_section_tab.SectionTagsItem;
import com.avito.android.serp.adapter.l1;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.shortcut_navigation_bar.adapter.SectionTagPayload;
import com.avito.android.shortcut_navigation_bar.adapter.TagShortcutItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;
import ur.InterfaceC49101b;

/* compiled from: BxContentReducer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/mvi/J0;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/bxcontent/mvi/entity/l;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class J0 implements com.avito.android.arch.mvi.u<BxContentInternalAction, com.avito.android.bxcontent.mvi.entity.l> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.J0 f111370b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.U0 f111371c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.skeleton.c f111372d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final b1 f111373e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f111374f;

    /* compiled from: BxContentReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bxcontent/mvi/J0$a;", "", "<init>", "()V", "", "RETRY_ITEM_ID", "Ljava/lang/String;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BxContentReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111375a;

        static {
            int[] iArr = new int[UniversalButton.ShowCondition.values().length];
            try {
                iArr[UniversalButton.ShowCondition.ITEMS_ARE_DISPLAYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalButton.ShowCondition.ALL_ITEMS_VIEWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f111375a = iArr;
            int[] iArr2 = new int[Action.Predefined.State.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Action.Predefined.State state = Action.Predefined.State.f268647b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        new a(null);
    }

    @Inject
    public J0(@Y61.k com.avito.android.J0 j02, @Y61.k com.avito.android.bxcontent.U0 u02, @Y61.k com.avito.android.serp.adapter.skeleton.c cVar, @Y61.k b1 b1Var, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.f111370b = j02;
        this.f111371c = u02;
        this.f111372d = cVar;
        this.f111373e = b1Var;
        this.f111374f = interfaceC49101b;
    }

    public static ArrayList b(SectionTagsItem sectionTagsItem) {
        if (sectionTagsItem == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : sectionTagsItem.f270152d) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            SectionTag sectionTag = (SectionTag) obj;
            arrayList.add(new TagShortcutItem(String.valueOf(i12), sectionTag.f270146d, null, new SectionTagPayload(sectionTag.f270145c, sectionTag.f270147e, sectionTag.f270148f, sectionTag.f270149g), null, 16, null));
            i12 = i13;
        }
        return arrayList;
    }

    public static boolean c(List list) {
        com.avito.conveyor_item.a aVar;
        Object next;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((l1) next) instanceof AdvertItem) {
                    break;
                }
            }
            aVar = (l1) next;
        } else {
            aVar = null;
        }
        AdvertItem advertItem = aVar instanceof AdvertItem ? (AdvertItem) aVar : null;
        return advertItem != null && advertItem.f268403R0;
    }

    public static AppendingLoaderItem d(J0 j02) {
        long jA2 = j02.f111370b.a();
        return new AppendingLoaderItem(jA2, String.valueOf(jA2), j02.f111371c.getF109435b(), false, false, 8, null);
    }

    public static l1 f(l1 l1Var) {
        if (!(l1Var instanceof SerpConstructorAdvertItem)) {
            return l1Var instanceof AdvertItem ? AdvertItem.b((AdvertItem) l1Var, null, false, null, null, -1, -1, -2) : l1Var;
        }
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) l1Var;
        return serpConstructorAdvertItem.copy(((-16385) & 1) != 0 ? serpConstructorAdvertItem.id : 0L, ((-16385) & 2) != 0 ? serpConstructorAdvertItem.stringId : null, ((-16385) & 4) != 0 ? serpConstructorAdvertItem.size : null, ((-16385) & 8) != 0 ? serpConstructorAdvertItem.title : null, ((-16385) & 16) != 0 ? serpConstructorAdvertItem.price : null, ((-16385) & 32) != 0 ? serpConstructorAdvertItem.deepLink : null, ((-16385) & 64) != 0 ? serpConstructorAdvertItem.imageList : null, ((-16385) & 128) != 0 ? serpConstructorAdvertItem.galleryItemsList : null, ((-16385) & 256) != 0 ? serpConstructorAdvertItem.badgeBar : null, ((-16385) & 512) != 0 ? serpConstructorAdvertItem.badgeSticker : null, ((-16385) & 1024) != 0 ? serpConstructorAdvertItem.isDelivery : false, ((-16385) & 2048) != 0 ? serpConstructorAdvertItem.hasDiscount : false, ((-16385) & 4096) != 0 ? serpConstructorAdvertItem.nativeVideoABCategory : null, ((-16385) & 8192) != 0 ? serpConstructorAdvertItem.exposureParams : null, ((-16385) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? serpConstructorAdvertItem.freeForm : null, ((-16385) & 32768) != 0 ? serpConstructorAdvertItem.reserved : null, ((-16385) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? serpConstructorAdvertItem.isViewed : false, ((-16385) & 131072) != 0 ? serpConstructorAdvertItem.isFavorite : false, ((-16385) & 262144) != 0 ? serpConstructorAdvertItem.canBeHidden : false, ((-16385) & 524288) != 0 ? serpConstructorAdvertItem.isHidden : true, ((-16385) & 1048576) != 0 ? serpConstructorAdvertItem.analyticsContext : null, ((-16385) & 2097152) != 0 ? serpConstructorAdvertItem.verticalAlias : null, ((-16385) & 4194304) != 0 ? serpConstructorAdvertItem.favoritesToast : null, ((-16385) & 8388608) != 0 ? serpConstructorAdvertItem.displayType : null, ((-16385) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? serpConstructorAdvertItem.analyticParams : null, ((-16385) & 33554432) != 0 ? serpConstructorAdvertItem.additionalAnalyticsParams : null, ((-16385) & 67108864) != 0 ? serpConstructorAdvertItem.isExternalAd : false, ((-16385) & 134217728) != 0 ? serpConstructorAdvertItem.hasVideo : false, ((-16385) & 268435456) != 0 ? serpConstructorAdvertItem.hasRealtyLayout : false, ((-16385) & 536870912) != 0 ? serpConstructorAdvertItem.isRedesign : false, ((-16385) & 1073741824) != 0 ? serpConstructorAdvertItem.isStrRedesign : false, ((-16385) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? serpConstructorAdvertItem.isUnavailable : false, (32767 & 1) != 0 ? serpConstructorAdvertItem.isExtendedGallery : false, (32767 & 2) != 0 ? serpConstructorAdvertItem.cvViewed : null, (32767 & 4) != 0 ? serpConstructorAdvertItem.isCvHidden : null, (32767 & 8) != 0 ? serpConstructorAdvertItem.categoryId : null, (32767 & 16) != 0 ? serpConstructorAdvertItem.sellerInfo : null, (32767 & 32) != 0 ? serpConstructorAdvertItem.sellerOnline : null, (32767 & 64) != 0 ? serpConstructorAdvertItem.newAdvertBadge : null, (32767 & 128) != 0 ? serpConstructorAdvertItem.hasStablePosition : false, (32767 & 256) != 0 ? serpConstructorAdvertItem.isFeatured : false, (32767 & 512) != 0 ? serpConstructorAdvertItem.featuredSectionTitle : null, (32767 & 1024) != 0 ? serpConstructorAdvertItem.featuredSectionPosition : 0, (32767 & 2048) != 0 ? serpConstructorAdvertItem.featuredSectionType : null, (32767 & 4096) != 0 ? serpConstructorAdvertItem.xHash : null, (32767 & 8192) != 0 ? serpConstructorAdvertItem.galleryConfig : null, (32767 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? serpConstructorAdvertItem.gigShiftId : null);
    }

    public static l1 g(l1 l1Var) {
        if (!(l1Var instanceof SerpConstructorAdvertItem)) {
            return l1Var instanceof AdvertItem ? AdvertItem.b((AdvertItem) l1Var, null, false, null, null, -1, -65, -1) : l1Var instanceof AdvertXlItem ? AdvertXlItem.b((AdvertXlItem) l1Var, -33) : l1Var instanceof BrandGlobalSnippetItem ? ((BrandGlobalSnippetItem) l1Var).V4() : l1Var;
        }
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) l1Var;
        SerpConstructorAdvertItem serpConstructorAdvertItemCopy = serpConstructorAdvertItem.copy(((-16385) & 1) != 0 ? serpConstructorAdvertItem.id : 0L, ((-16385) & 2) != 0 ? serpConstructorAdvertItem.stringId : null, ((-16385) & 4) != 0 ? serpConstructorAdvertItem.size : null, ((-16385) & 8) != 0 ? serpConstructorAdvertItem.title : null, ((-16385) & 16) != 0 ? serpConstructorAdvertItem.price : null, ((-16385) & 32) != 0 ? serpConstructorAdvertItem.deepLink : null, ((-16385) & 64) != 0 ? serpConstructorAdvertItem.imageList : null, ((-16385) & 128) != 0 ? serpConstructorAdvertItem.galleryItemsList : null, ((-16385) & 256) != 0 ? serpConstructorAdvertItem.badgeBar : null, ((-16385) & 512) != 0 ? serpConstructorAdvertItem.badgeSticker : null, ((-16385) & 1024) != 0 ? serpConstructorAdvertItem.isDelivery : false, ((-16385) & 2048) != 0 ? serpConstructorAdvertItem.hasDiscount : false, ((-16385) & 4096) != 0 ? serpConstructorAdvertItem.nativeVideoABCategory : null, ((-16385) & 8192) != 0 ? serpConstructorAdvertItem.exposureParams : null, ((-16385) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? serpConstructorAdvertItem.freeForm : null, ((-16385) & 32768) != 0 ? serpConstructorAdvertItem.reserved : null, ((-16385) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? serpConstructorAdvertItem.isViewed : true, ((-16385) & 131072) != 0 ? serpConstructorAdvertItem.isFavorite : false, ((-16385) & 262144) != 0 ? serpConstructorAdvertItem.canBeHidden : false, ((-16385) & 524288) != 0 ? serpConstructorAdvertItem.isHidden : false, ((-16385) & 1048576) != 0 ? serpConstructorAdvertItem.analyticsContext : null, ((-16385) & 2097152) != 0 ? serpConstructorAdvertItem.verticalAlias : null, ((-16385) & 4194304) != 0 ? serpConstructorAdvertItem.favoritesToast : null, ((-16385) & 8388608) != 0 ? serpConstructorAdvertItem.displayType : null, ((-16385) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? serpConstructorAdvertItem.analyticParams : null, ((-16385) & 33554432) != 0 ? serpConstructorAdvertItem.additionalAnalyticsParams : null, ((-16385) & 67108864) != 0 ? serpConstructorAdvertItem.isExternalAd : false, ((-16385) & 134217728) != 0 ? serpConstructorAdvertItem.hasVideo : false, ((-16385) & 268435456) != 0 ? serpConstructorAdvertItem.hasRealtyLayout : false, ((-16385) & 536870912) != 0 ? serpConstructorAdvertItem.isRedesign : false, ((-16385) & 1073741824) != 0 ? serpConstructorAdvertItem.isStrRedesign : false, ((-16385) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? serpConstructorAdvertItem.isUnavailable : false, (32767 & 1) != 0 ? serpConstructorAdvertItem.isExtendedGallery : false, (32767 & 2) != 0 ? serpConstructorAdvertItem.cvViewed : null, (32767 & 4) != 0 ? serpConstructorAdvertItem.isCvHidden : null, (32767 & 8) != 0 ? serpConstructorAdvertItem.categoryId : null, (32767 & 16) != 0 ? serpConstructorAdvertItem.sellerInfo : null, (32767 & 32) != 0 ? serpConstructorAdvertItem.sellerOnline : null, (32767 & 64) != 0 ? serpConstructorAdvertItem.newAdvertBadge : null, (32767 & 128) != 0 ? serpConstructorAdvertItem.hasStablePosition : false, (32767 & 256) != 0 ? serpConstructorAdvertItem.isFeatured : false, (32767 & 512) != 0 ? serpConstructorAdvertItem.featuredSectionTitle : null, (32767 & 1024) != 0 ? serpConstructorAdvertItem.featuredSectionPosition : 0, (32767 & 2048) != 0 ? serpConstructorAdvertItem.featuredSectionType : null, (32767 & 4096) != 0 ? serpConstructorAdvertItem.xHash : null, (32767 & 8192) != 0 ? serpConstructorAdvertItem.galleryConfig : null, (32767 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? serpConstructorAdvertItem.gigShiftId : null);
        serpConstructorAdvertItemCopy.setFreeFormConverted(serpConstructorAdvertItem.getFreeFormConverted());
        return serpConstructorAdvertItemCopy;
    }

    public static List i(List list, InlineAction.Predefined.State state) {
        Object objG = C42745f0.G(list);
        ActionsHorizontalBlockItem actionsHorizontalBlockItem = objG instanceof ActionsHorizontalBlockItem ? (ActionsHorizontalBlockItem) objG : null;
        if (actionsHorizontalBlockItem == null) {
            return list;
        }
        Action action = actionsHorizontalBlockItem.f268656c;
        Action actionK = action != null ? k(action, com.avito.android.serp.adapter.actions_horizontal_block.e.b(state)) : null;
        Action action2 = actionsHorizontalBlockItem.f268657d;
        ActionsHorizontalBlockItem actionsHorizontalBlockItemA = ActionsHorizontalBlockItem.a(actionsHorizontalBlockItem, actionK, action2 != null ? k(action2, com.avito.android.serp.adapter.actions_horizontal_block.e.b(state)) : null, false, 57);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((l1) obj) instanceof ActionsHorizontalBlockItem)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(0, actionsHorizontalBlockItemA);
        return arrayList2;
    }

    public static UdfToolbarStyle j(UdfToolbarColors udfToolbarColors, UdfToolbarStyle udfToolbarStyle) {
        UdfToolbarStyle.c cVar;
        UdfToolbarStyle.e eVarA;
        UdfToolbarStyle.b bVar;
        UdfToolbarStyle.a aVarA;
        UdfToolbarStyle.f fVar;
        UdfToolbarStyle.Color color;
        UdfToolbarStyle.Color color2;
        UdfToolbarStyle.Color color3;
        UdfToolbarStyle.Color color4;
        UdfToolbarStyle.Color color5;
        UdfToolbarStyle.Color color6;
        UdfToolbarStyle.Color color7;
        UdfToolbarStyle.Color color8;
        UdfToolbarColors.Point point;
        UdfToolbarColors.Point point2;
        UdfToolbarStyle.Color color9;
        UdfToolbarStyle.Color color10;
        UdfToolbarStyle.Color color11;
        UdfToolbarStyle.Color color12;
        UdfToolbarColors.Point point3;
        UdfToolbarColors.Point point4;
        UdfToolbarStyle.Color color13;
        UdfToolbarStyle.Color color14;
        UdfToolbarStyle.Color color15;
        UdfToolbarStyle.Color color16;
        UdfToolbarStyle.Color color17;
        UdfToolbarStyle.Color color18;
        UdfToolbarStyle.Color color19 = udfToolbarColors.f264030b;
        if (color19 == null) {
            color19 = udfToolbarStyle.f264054a;
        }
        UdfToolbarStyle.Color color20 = color19;
        UdfToolbarStyle.c cVar2 = udfToolbarStyle.f264055b;
        if (cVar2 != null) {
            UdfToolbarColors.NavigationIcon navigationIcon = udfToolbarColors.f264031c;
            if (navigationIcon == null || (color16 = navigationIcon.f264043b) == null) {
                color16 = cVar2.f264090a;
            }
            if (navigationIcon == null || (color17 = navigationIcon.f264044c) == null) {
                color17 = cVar2.f264091b;
            }
            if (navigationIcon == null || (color18 = navigationIcon.f264045d) == null) {
                color18 = cVar2.f264092c;
            }
            cVar = new UdfToolbarStyle.c(color16, color17, color18);
        } else {
            cVar = null;
        }
        UdfToolbarStyle.e eVar = udfToolbarStyle.f264056c;
        if (eVar != null) {
            UdfToolbarColors.SearchInput searchInput = udfToolbarColors.f264032d;
            if (searchInput == null || (color13 = searchInput.f264048b) == null) {
                color13 = eVar.f264095a;
            }
            if (searchInput == null || (color14 = searchInput.f264050d) == null) {
                color14 = eVar.f264097c;
            }
            UdfToolbarStyle.Color color21 = color14;
            if (searchInput == null || (color15 = searchInput.f264049c) == null) {
                color15 = eVar.f264096b;
            }
            eVarA = UdfToolbarStyle.e.a(eVar, color13, color15, color21, 0.0f, null, null, 56);
        } else {
            eVarA = null;
        }
        UdfToolbarStyle.b bVar2 = udfToolbarStyle.f264057d;
        if (bVar2 != null) {
            UdfToolbarColors.FilterIcon filterIcon = udfToolbarColors.f264033e;
            if (filterIcon == null || (color9 = filterIcon.f264040b) == null) {
                color9 = bVar2.f264087a;
            }
            if (filterIcon == null || (color10 = filterIcon.f264041c) == null) {
                color10 = bVar2.f264088b;
            }
            UdfToolbarStyle.d dVar = bVar2.f264089c;
            if (filterIcon == null || (point4 = filterIcon.f264042d) == null || (color11 = point4.f264046b) == null) {
                color11 = dVar.f264093a;
            }
            if (filterIcon == null || (point3 = filterIcon.f264042d) == null || (color12 = point3.f264047c) == null) {
                color12 = dVar.f264094b;
            }
            bVar = new UdfToolbarStyle.b(color9, color10, new UdfToolbarStyle.d(color11, color12));
        } else {
            bVar = null;
        }
        UdfToolbarStyle.a aVar = udfToolbarStyle.f264058e;
        if (aVar != null) {
            UdfToolbarColors.CartIcon cartIcon = udfToolbarColors.f264034f;
            if (cartIcon == null || (color4 = cartIcon.f264036b) == null) {
                color4 = aVar.f264081a;
            }
            if (cartIcon == null || (color5 = cartIcon.f264037c) == null) {
                color5 = aVar.f264082b;
            }
            if (cartIcon == null || (color6 = cartIcon.f264038d) == null) {
                color6 = aVar.f264083c;
            }
            UdfToolbarStyle.d dVar2 = aVar.f264085e;
            if (cartIcon == null || (point2 = cartIcon.f264039e) == null || (color7 = point2.f264046b) == null) {
                color7 = dVar2.f264093a;
            }
            if (cartIcon == null || (point = cartIcon.f264039e) == null || (color8 = point.f264047c) == null) {
                color8 = dVar2.f264094b;
            }
            dVar2.getClass();
            aVarA = UdfToolbarStyle.a.a(aVar, color4, color5, color6, 0.0f, new UdfToolbarStyle.d(color7, color8), null, 40);
        } else {
            aVarA = null;
        }
        UdfToolbarStyle.f fVar2 = udfToolbarStyle.f264059f;
        if (fVar2 != null) {
            UdfToolbarColors.ShareIcon shareIcon = udfToolbarColors.f264035g;
            if (shareIcon == null || (color = shareIcon.f264051b) == null) {
                color = fVar2.f264101a;
            }
            if (shareIcon == null || (color2 = shareIcon.f264052c) == null) {
                color2 = fVar2.f264102b;
            }
            if (shareIcon == null || (color3 = shareIcon.f264053d) == null) {
                color3 = fVar2.f264103c;
            }
            fVar = new UdfToolbarStyle.f(color, color2, color3);
        } else {
            fVar = null;
        }
        return UdfToolbarStyle.a(udfToolbarStyle, color20, cVar, eVarA, bVar, aVarA, fVar, null, 64);
    }

    public static Action k(Action action, Action.Predefined.State state) {
        Action.Predefined predefined = action instanceof Action.Predefined ? (Action.Predefined) action : null;
        if (predefined == null) {
            return action;
        }
        if (predefined.f268645h != Action.Predefined.Type.f268652b) {
            return action;
        }
        return new Action.Predefined(predefined.f268639b, predefined.f268640c, predefined.f268641d, predefined.f268642e, state == Action.Predefined.State.f268649d ? predefined.f268646i.ordinal() != 0 ? predefined.f268641d : predefined.f268642e : predefined.f268643f, predefined.f268644g, predefined.f268645h, state);
    }

    public static com.avito.android.bxcontent.mvi.entity.l l(com.avito.android.bxcontent.mvi.entity.l lVar, PresentationType presentationType, Filter filter, InlineAction.Predefined.State state) {
        ActionsHorizontalBlockItem actionsHorizontalBlockItem;
        List<Filter> filters;
        Filter filter2;
        List<Filter> filters2;
        Filter filter3;
        if (!presentationType.isFullMap()) {
            return lVar;
        }
        Action actionA = (filter == null || (filters2 = filter.getFilters()) == null || (filter3 = (Filter) C42745f0.K(0, filters2)) == null) ? null : com.avito.android.serp.adapter.actions_horizontal_block.e.a(filter3);
        Action actionA2 = (filter == null || (filters = filter.getFilters()) == null || (filter2 = (Filter) C42745f0.K(1, filters)) == null) ? null : com.avito.android.serp.adapter.actions_horizontal_block.e.a(filter2);
        Object objG = C42745f0.G(lVar.f().f112428e);
        ActionsHorizontalBlockItem actionsHorizontalBlockItem2 = objG instanceof ActionsHorizontalBlockItem ? (ActionsHorizontalBlockItem) objG : null;
        if (actionA == null && actionA2 == null) {
            actionsHorizontalBlockItem = null;
        } else {
            actionsHorizontalBlockItem = new ActionsHorizontalBlockItem(null, actionA != null ? k(actionA, com.avito.android.serp.adapter.actions_horizontal_block.e.b(state)) : null, actionA2 != null ? k(actionA2, com.avito.android.serp.adapter.actions_horizontal_block.e.b(state)) : null, null, actionsHorizontalBlockItem2 != null ? actionsHorizontalBlockItem2.f268659f : true, 0, 33, null);
        }
        ArrayList arrayList = new ArrayList(lVar.f().f112428e);
        if (actionsHorizontalBlockItem2 != null) {
            arrayList.remove(actionsHorizontalBlockItem2);
        }
        if (actionsHorizontalBlockItem != null) {
            arrayList.add(0, actionsHorizontalBlockItem);
        }
        return com.avito.android.bxcontent.mvi.entity.l.a(lVar, null, null, null, null, null, null, com.avito.android.bxcontent.mvi.entity.o.d(lVar.f112337h, lVar.f112333f, com.avito.android.bxcontent.mvi.entity.t.a(lVar.f(), null, 0, arrayList, 15)), null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, -1, 1);
    }

    public final com.avito.android.bxcontent.mvi.entity.l e(com.avito.android.bxcontent.mvi.entity.l lVar, int i12) {
        LoadState loadState = lVar.f112306I.isFullMap() ? LoadState.f112046e : LoadState.f112045d;
        ArrayList arrayListH = lVar.h();
        LinkedHashMap linkedHashMapD = com.avito.android.bxcontent.mvi.entity.o.d(lVar.f112337h, lVar.f112333f, com.avito.android.bxcontent.mvi.entity.t.a(lVar.f(), loadState, i12, C42745f0.h0(Collections.singletonList(new AppendingRetryItem(-1007190565, "retryItem", this.f111371c.getF109435b(), false, i12 == 1 && arrayListH.isEmpty(), 8, null)), arrayListH), 1));
        com.avito.android.bxcontent.mvi.entity.C.f112030c.getClass();
        return com.avito.android.bxcontent.mvi.entity.l.a(lVar, null, loadState, null, null, null, null, linkedHashMapD, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, com.avito.android.bxcontent.mvi.entity.C.f112031d, null, null, false, null, null, false, null, null, -67, -16777217, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:884:0x05f0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v145 */
    /* JADX WARN: Type inference failed for: r3v146 */
    /* JADX WARN: Type inference failed for: r3v148, types: [java.lang.Object] */
    @Override // com.avito.android.arch.mvi.u
    @Y61.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.bxcontent.mvi.entity.l a(@Y61.k com.avito.android.bxcontent.mvi.entity.BxContentInternalAction r173, @Y61.k com.avito.android.bxcontent.mvi.entity.l r174) {
        /*
            Method dump skipped, instructions count: 9907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.J0.a(com.avito.android.bxcontent.mvi.entity.BxContentInternalAction, com.avito.android.bxcontent.mvi.entity.l):com.avito.android.bxcontent.mvi.entity.l");
    }
}
