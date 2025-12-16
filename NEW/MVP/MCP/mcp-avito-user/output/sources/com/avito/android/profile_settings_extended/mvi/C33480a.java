package com.avito.android.profile_settings_extended.mvi;

import Hb0.InterfaceC13947a;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.action_select_link.ActionSelectLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import com.avito.android.edit_carousel.entity.CarouselEditorData;
import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.extended_profile_serp.deep_linking.ExtendedProfileSerpLink;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_settings_extended.InterfaceC33467a;
import com.avito.android.profile_settings_extended.InterfaceC33475i;
import com.avito.android.profile_settings_extended.InterfaceC33507u;
import com.avito.android.profile_settings_extended.adapter.carousel.ExtendedSettingsCarouselItem;
import com.avito.android.profile_settings_extended.adapter.gallery.image.GalleryImageItem;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.SelectionsConfig;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.create.CreateSelectionItem;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.SelectionItem;
import com.avito.android.profile_settings_extended.adapter.link_edit.LinkEditItem;
import com.avito.android.profile_settings_extended.adapter.phones.ExtendedSettingsPhonesItem;
import com.avito.android.profile_settings_extended.adapter.phones.PhoneValue;
import com.avito.android.profile_settings_extended.adapter.toggle.RegularToggleItem;
import com.avito.android.profile_settings_extended.adapter.toggle.ToggleItem;
import com.avito.android.profile_settings_extended.adapter.universal.section.UniversalWidgetSectionItem;
import com.avito.android.profile_settings_extended.analytics.ExtendedProfileAddCarouselEvent;
import com.avito.android.profile_settings_extended.analytics.ExtendedProfileSelectionActionEvent;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import com.avito.android.profile_settings_extended.mvi.entity.CommonValueBottomMenuAction;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import com.avito.android.remote.model.Image;
import com.avito.android.util.R0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;
import vc0.C49302a;
import vc0.C49303b;
import yc0.C50214A;
import yc0.C50215B;
import yc0.C50218b;
import yc0.InterfaceC50216C;
import yc0.InterfaceC50217a;
import yc0.InterfaceC50219c;
import yc0.InterfaceC50220d;
import yc0.g;
import yc0.k;
import yc0.n;
import yc0.o;
import yc0.q;
import yc0.r;
import yc0.s;
import yc0.t;
import yc0.z;

/* compiled from: ExtendedProfileSettingsActor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lyc0/k;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/a;", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_settings_extended.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33480a implements com.avito.android.arch.mvi.a<yc0.k, ExtendedProfileSettingsInternalAction, com.avito.android.profile_settings_extended.mvi.entity.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33507u f230500a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B f230501b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_extended.T f230502c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33475i f230503d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_extended.carousel.a f230504e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_extended.adapter.universal.section.n f230505f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_extended.phones.a f230506g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33467a f230507h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_extended.adapter.item_selections.a f230508i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f230509j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f230510k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_extended.P f230511l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f230512m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final R0 f230513n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.U f230514o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13947a f230515p;

    /* compiled from: ExtendedProfileSettingsActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/a$a;", "", "a", "b", "Lcom/avito/android/profile_settings_extended/mvi/a$a$a;", "Lcom/avito/android/profile_settings_extended/mvi/a$a$b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_extended.mvi.a$a, reason: collision with other inner class name */
    public interface InterfaceC7016a {

        /* compiled from: ExtendedProfileSettingsActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/a$a$a;", "Lcom/avito/android/profile_settings_extended/mvi/a$a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_settings_extended.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C7017a implements InterfaceC7016a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C7017a f230516a = new C7017a();
        }

        /* compiled from: ExtendedProfileSettingsActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/a$a$b;", "Lcom/avito/android/profile_settings_extended/mvi/a$a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_settings_extended.mvi.a$a$b */
        public static final class b implements InterfaceC7016a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f230517a = new b();
        }
    }

    /* compiled from: ExtendedProfileSettingsActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_extended.mvi.a$b */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[CommonValueBottomMenuAction.DeleteCommonValue.WidgetType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CommonValueBottomMenuAction.DeleteCommonValue.WidgetType widgetType = CommonValueBottomMenuAction.DeleteCommonValue.WidgetType.f230541b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CommonValueBottomMenuAction.DeleteCommonValue.WidgetType widgetType2 = CommonValueBottomMenuAction.DeleteCommonValue.WidgetType.f230541b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LinkEditItem.ActionType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LinkEditItem.ActionType actionType = LinkEditItem.ActionType.f229652b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Inject
    public C33480a(@Y61.k InterfaceC33507u interfaceC33507u, @Y61.k B b12, @Y61.k com.avito.android.profile_settings_extended.T t12, @Y61.k InterfaceC33475i interfaceC33475i, @Y61.k com.avito.android.profile_settings_extended.carousel.a aVar, @Y61.k com.avito.android.profile_settings_extended.adapter.universal.section.n nVar, @Y61.k com.avito.android.profile_settings_extended.phones.a aVar2, @Y61.k InterfaceC33467a interfaceC33467a, @Y61.k com.avito.android.profile_settings_extended.adapter.item_selections.a aVar3, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar4, @Y61.k com.avito.android.account.E e12, @Y61.k com.avito.android.profile_settings_extended.P p12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k R0 r02, @Y61.k com.avito.android.util.U u12, @Y61.k InterfaceC13947a interfaceC13947a) {
        this.f230500a = interfaceC33507u;
        this.f230501b = b12;
        this.f230502c = t12;
        this.f230503d = interfaceC33475i;
        this.f230504e = aVar;
        this.f230505f = nVar;
        this.f230506g = aVar2;
        this.f230507h = interfaceC33467a;
        this.f230508i = aVar3;
        this.f230509j = aVar4;
        this.f230510k = e12;
        this.f230511l = p12;
        this.f230512m = interfaceC28373a;
        this.f230513n = r02;
        this.f230514o = u12;
        this.f230515p = interfaceC13947a;
    }

    public static final C43210w c(C33480a c33480a, ExtendedSettingsCarouselItem extendedSettingsCarouselItem) {
        ExtendedProfileAddCarouselEvent extendedProfileAddCarouselEvent;
        Boolean bool;
        CommonValueId commonValueId;
        c33480a.getClass();
        if (extendedSettingsCarouselItem.f229286g == null) {
            ExtendedProfileAddCarouselEvent.f229972c.getClass();
            extendedProfileAddCarouselEvent = new ExtendedProfileAddCarouselEvent(ExtendedProfileAddCarouselEvent.Scenario.f229974c, null);
        } else {
            ExtendedProfileAddCarouselEvent.f229972c.getClass();
            extendedProfileAddCarouselEvent = new ExtendedProfileAddCarouselEvent(ExtendedProfileAddCarouselEvent.Scenario.f229975d, null);
        }
        c33480a.f230512m.c(extendedProfileAddCarouselEvent);
        ExtendedSettingsCarouselItem.Carousel carousel = extendedSettingsCarouselItem.f229286g;
        return new C43210w(new ExtendedProfileSettingsInternalAction.CarouselWidgetInternalAction.OpenCarouselEditor(new CarouselEditorData(extendedSettingsCarouselItem.f229283d, (carousel == null || (commonValueId = carousel.f229289b) == null) ? null : commonValueId.f230266c, extendedSettingsCarouselItem.f229285f, carousel != null ? carousel.f229292e : null, carousel != null ? Integer.valueOf(carousel.f229293f) : null, (carousel == null || (bool = carousel.f229295h) == null) ? true : bool.booleanValue())));
    }

    public static final InterfaceC43160i d(C33480a c33480a, yc0.k kVar, Y41.a aVar) {
        InterfaceC43160i c43210w;
        InterfaceC43160i x12;
        Object showCommonValueBottomMenu;
        com.avito.conveyor_item.a aVar2;
        List list;
        Object next;
        c33480a.getClass();
        if (kVar instanceof k.b) {
            k.b bVar = (k.b) kVar;
            return c33480a.f230500a.b(bVar.f443263b, ((com.avito.android.profile_settings_extended.mvi.entity.a) aVar.invoke()).f230664e, bVar.f443262a);
        }
        if (kVar instanceof k.a) {
            c33480a.e(null, ((k.a) kVar).f443261a, null);
            return C43175k.w();
        }
        if ((kVar instanceof yc0.i) || (kVar instanceof yc0.j)) {
            c43210w = new C43210w(ExtendedProfileSettingsInternalAction.UpdateExtendedProfileLazyColumnComponent.f230658b);
        } else {
            boolean z12 = kVar instanceof CommonValueBottomMenuAction;
            InterfaceC33467a interfaceC33467a = c33480a.f230507h;
            if (z12) {
                CommonValueBottomMenuAction commonValueBottomMenuAction = (CommonValueBottomMenuAction) kVar;
                if (commonValueBottomMenuAction instanceof CommonValueBottomMenuAction.DeleteCommonValue) {
                    CommonValueBottomMenuAction.DeleteCommonValue deleteCommonValue = (CommonValueBottomMenuAction.DeleteCommonValue) commonValueBottomMenuAction;
                    C43152f0 c43152f0B = interfaceC33467a.b(deleteCommonValue.f230538a);
                    int iOrdinal = deleteCommonValue.f230539b.ordinal();
                    if (iOrdinal == 0) {
                        return C43175k.B(new C33484e(2, null), c43152f0B);
                    }
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return C43175k.B(new C33485f(2, null), c43152f0B);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj = deleteCommonValue.f230540c;
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = "";
                    }
                    return C43175k.B(new C33486g(deleteCommonValue.f230538a, c33480a, str, null), c43152f0B);
                }
                if (!(commonValueBottomMenuAction instanceof CommonValueBottomMenuAction.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(ExtendedProfileSettingsInternalAction.CommonValueInternalAction.CloseCommonValueBottomMenu.f230562b);
            } else {
                if (kVar instanceof yc0.u) {
                    return C43175k.G(new C33497s(c33480a, ((yc0.u) kVar).f443349a, null));
                }
                if (kVar instanceof C50214A) {
                    return new C43210w(new ExtendedProfileSettingsInternalAction.ShowMoreActionsSettingItemAction(((C50214A) kVar).f443217a));
                }
                if (kVar instanceof C50215B) {
                    ToggleItem toggleItem = ((C50215B) kVar).f443218a;
                    if (toggleItem instanceof RegularToggleItem) {
                        return C43175k.I(c33480a.f230513n.a(), C43175k.G(new C33498t(c33480a, (RegularToggleItem) toggleItem, null)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                boolean z13 = kVar instanceof InterfaceC50217a;
                InterfaceC28373a interfaceC28373a = c33480a.f230512m;
                com.avito.android.account.E e12 = c33480a.f230510k;
                if (z13) {
                    InterfaceC50217a interfaceC50217a = (InterfaceC50217a) kVar;
                    if (!(interfaceC50217a instanceof InterfaceC50217a.C12908a)) {
                        if (interfaceC50217a instanceof InterfaceC50217a.b) {
                            return new C43210w(new ExtendedProfileSettingsInternalAction.AboutWidgetInternalAction.OnAboutTextExpanded(((InterfaceC50217a.b) interfaceC50217a).f443225a));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    String strA = e12.a();
                    if (strA != null) {
                        interfaceC28373a.c(new C49303b(strA, ((InterfaceC50217a.C12908a) interfaceC50217a).f443224a.f229090f));
                    }
                    return new C43210w(new ExtendedProfileSettingsInternalAction.AboutWidgetInternalAction.OpenTextFieldEditor(((InterfaceC50217a.C12908a) interfaceC50217a).f443224a));
                }
                boolean z14 = kVar instanceof InterfaceC50219c;
                B b12 = c33480a.f230501b;
                if (z14) {
                    InterfaceC50219c interfaceC50219c = (InterfaceC50219c) kVar;
                    if (interfaceC50219c instanceof InterfaceC50219c.a) {
                        return C43175k.G(new C33489j(interfaceC50219c, c33480a, null));
                    }
                    if (interfaceC50219c instanceof InterfaceC50219c.b) {
                        UploadImage uploadImage = ((InterfaceC50219c.b) interfaceC50219c).f443228a;
                        b12.getClass();
                        return C43175k.G(new G(aVar, uploadImage, b12, null));
                    }
                    if (!(interfaceC50219c instanceof InterfaceC50219c.C12909c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String strA2 = e12.a();
                    if (strA2 != null) {
                        interfaceC28373a.c(new C49302a(strA2, ((InterfaceC50219c.C12909c) interfaceC50219c).f443229a));
                    }
                    return new C43210w(new ExtendedProfileSettingsInternalAction.ImagesInternalAction.PickImages(((InterfaceC50219c.C12909c) interfaceC50219c).f443229a, 1));
                }
                if (kVar instanceof yc0.e) {
                    return C43175k.G(new C33496q((yc0.e) kVar, c33480a, null));
                }
                if (kVar instanceof yc0.o) {
                    yc0.o oVar = (yc0.o) kVar;
                    b12.getClass();
                    if (oVar instanceof o.a) {
                        return C43175k.G(new F(oVar, b12, null));
                    }
                    if (oVar instanceof o.b) {
                        return C43175k.G(new G(aVar, ((o.b) oVar).f443325a.f229421d, b12, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                boolean z15 = kVar instanceof yc0.s;
                com.avito.android.util.U u12 = c33480a.f230514o;
                if (z15) {
                    yc0.s sVar = (yc0.s) kVar;
                    if (sVar instanceof s.b) {
                        return new C43210w(new ExtendedProfileSettingsInternalAction.LinkEditWidgetInternalAction.ShowMoreActions(((s.b) sVar).f443338a));
                    }
                    if (!(sVar instanceof s.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s.a aVar3 = (s.a) sVar;
                    int iOrdinal2 = aVar3.f443336a.f229651c.ordinal();
                    LinkEditItem linkEditItem = aVar3.f443337b;
                    if (iOrdinal2 == 0) {
                        if (linkEditItem.f229646h == null) {
                            return C43175k.w();
                        }
                        String strA3 = e12.a();
                        if (strA3 != null) {
                            interfaceC28373a.c(new vc0.l(strA3));
                        }
                        return new C43210w(new ExtendedProfileSettingsInternalAction.LinkEditWidgetInternalAction.OpenPersonalLinkEditScreen(linkEditItem.f229646h));
                    }
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String strA4 = e12.a();
                    if (strA4 != null) {
                        interfaceC28373a.c(new vc0.k(strA4));
                    }
                    u12.a(linkEditItem.f229643e);
                    return C43175k.w();
                }
                if (kVar instanceof yc0.n) {
                    yc0.n nVar = (yc0.n) kVar;
                    b12.getClass();
                    if (nVar instanceof n.c) {
                        com.avito.android.profile_settings_extended.entity.u uVar = ((com.avito.android.profile_settings_extended.mvi.entity.a) aVar.invoke()).f230661b;
                        if (uVar == null || (list = (List) uVar.f230359d.getValue()) == null) {
                            aVar2 = null;
                        } else {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                QH.a aVar4 = (QH.a) next;
                                if (aVar4 instanceof GalleryImageItem) {
                                    GalleryImageItem galleryImageItem = (GalleryImageItem) aVar4;
                                    n.c cVar = (n.c) nVar;
                                    if (kotlin.jvm.internal.L.f(galleryImageItem.f229421d.getF226678d(), cVar.f443315a) && kotlin.jvm.internal.L.f(galleryImageItem.f229421d.getF226676b(), cVar.f443316b)) {
                                        break;
                                    }
                                }
                            }
                            aVar2 = (QH.a) next;
                        }
                        GalleryImageItem galleryImageItem2 = aVar2 instanceof GalleryImageItem ? (GalleryImageItem) aVar2 : null;
                        if (galleryImageItem2 == null) {
                            return C43175k.w();
                        }
                        n.c cVar2 = (n.c) nVar;
                        return new C43210w(new ExtendedProfileSettingsInternalAction.ImagesInternalAction.ShowGalleryImagePlaceholder(galleryImageItem2, cVar2.f443317c, cVar2.f443318d, cVar2.f443319e, cVar2.f443320f));
                    }
                    if (!(nVar instanceof n.a)) {
                        if (nVar instanceof n.b) {
                            return C43175k.G(new H(b12, nVar, aVar, null));
                        }
                        if (!(nVar instanceof n.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        n.d dVar = (n.d) nVar;
                        return C43175k.G(new L(((com.avito.android.profile_settings_extended.mvi.entity.a) aVar.invoke()).f230661b, dVar.f443321a, dVar.f443322b, dVar.f443323c, null));
                    }
                    c43210w = new C43210w(ExtendedProfileSettingsInternalAction.ImagesInternalAction.HideGalleryImagePlaceholder.f230574b);
                } else {
                    if (kVar instanceof yc0.q) {
                        yc0.q qVar = (yc0.q) kVar;
                        if (qVar instanceof q.b) {
                            q.b bVar2 = (q.b) qVar;
                            showCommonValueBottomMenu = new ExtendedProfileSettingsInternalAction.OpenAddressEditor(bVar2.f443328a, bVar2.f443329b);
                        } else {
                            if (!(qVar instanceof q.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            q.a aVar5 = (q.a) qVar;
                            CommonValueId commonValueId = aVar5.f443327a.f145900b;
                            boolean zA2 = interfaceC33467a.a(commonValueId);
                            ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress = aVar5.f443327a;
                            CommonValueId commonValueId2 = extendedProfilesSettingsAddress.f145900b;
                            showCommonValueBottomMenu = new ExtendedProfileSettingsInternalAction.CommonValueInternalAction.ShowCommonValueBottomMenu(commonValueId, zA2, new q.b(commonValueId2.f230265b, extendedProfilesSettingsAddress), new CommonValueBottomMenuAction.DeleteCommonValue(commonValueId2, CommonValueBottomMenuAction.DeleteCommonValue.WidgetType.f230543d, null, 4, null));
                        }
                        return new C43210w(showCommonValueBottomMenu);
                    }
                    if (kVar instanceof yc0.g) {
                        yc0.g gVar = (yc0.g) kVar;
                        b12.getClass();
                        if (gVar instanceof g.d) {
                            g.d dVar2 = (g.d) gVar;
                            yc0.r rVar = ((com.avito.android.profile_settings_extended.mvi.entity.a) aVar.invoke()).f230666g;
                            String str2 = rVar != null ? rVar.f443330a : null;
                            String str3 = dVar2.f443255a;
                            if (!str3.equals(str2)) {
                                x12 = C43175k.w();
                            } else if (rVar instanceof r.a) {
                                x12 = new X(C43175k.G(new J(aVar, b12, str3, false, null)), new K(aVar, b12, str3, null));
                            } else {
                                if (!(rVar instanceof r.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                r.b bVar3 = (r.b) rVar;
                                x12 = new C43210w(new ExtendedProfileSettingsInternalAction.ImagesInternalAction.OpenImageEditor(bVar3.f443332c, bVar3.f443333d, dVar2.f443255a, bVar3.f443334e, bVar3.f443335f));
                            }
                        } else if (gVar instanceof g.c) {
                            g.c cVar3 = (g.c) gVar;
                            yc0.r rVar2 = ((com.avito.android.profile_settings_extended.mvi.entity.a) aVar.invoke()).f230666g;
                            if (rVar2 == null) {
                                return C43175k.w();
                            }
                            int iOrdinal3 = rVar2.f443331b.ordinal();
                            String str4 = cVar3.f443254a;
                            if (iOrdinal3 != 0) {
                                if (iOrdinal3 == 1) {
                                    return C43175k.G(new I(aVar, b12, str4, null));
                                }
                                if (iOrdinal3 != 2) {
                                    if (iOrdinal3 == 3 || iOrdinal3 == 4 || iOrdinal3 == 5) {
                                        return C43175k.w();
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            x12 = new X(C43175k.G(new J(aVar, b12, str4, true, null)), new K(aVar, b12, str4, null));
                        } else {
                            if (gVar instanceof g.f) {
                                return C43175k.G(new C(b12, gVar, aVar, null));
                            }
                            if (gVar instanceof g.e) {
                                return C43175k.G(new D(aVar, b12, null));
                            }
                            if (gVar instanceof g.b) {
                                return C43175k.G(new E(aVar, b12, null));
                            }
                            if (!(gVar instanceof g.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c43210w = new C43210w(ExtendedProfileSettingsInternalAction.ImagesInternalAction.CloseImageBottomMenu.f230572b);
                        }
                        return x12;
                    }
                    if (kVar instanceof yc0.t) {
                        yc0.t tVar = (yc0.t) kVar;
                        boolean z16 = tVar instanceof t.e;
                        com.avito.android.profile_settings_extended.phones.a aVar6 = c33480a.f230506g;
                        if (z16) {
                            return aVar6.d(((t.e) tVar).f443347a.f229694b);
                        }
                        if (tVar instanceof t.f) {
                            t.f fVar = (t.f) tVar;
                            CommonValueId commonValueId3 = fVar.f443348a.f229694b.f229689b;
                            boolean zA3 = interfaceC33467a.a(commonValueId3);
                            PhoneValue phoneValue = fVar.f443348a;
                            t.b bVar4 = new t.b(phoneValue);
                            ExtendedSettingsPhonesItem.Phone phone = phoneValue.f229694b;
                            return new C43210w(new ExtendedProfileSettingsInternalAction.CommonValueInternalAction.ShowCommonValueBottomMenu(commonValueId3, zA3, bVar4, new CommonValueBottomMenuAction.DeleteCommonValue(phone.f229689b, CommonValueBottomMenuAction.DeleteCommonValue.WidgetType.f230542c, phone.f229691d)));
                        }
                        if (tVar instanceof t.b) {
                            String strA5 = e12.a();
                            if (strA5 != null) {
                                interfaceC28373a.c(new vc0.i(strA5, "edit"));
                            }
                            return aVar6.a(((t.b) tVar).f443341a);
                        }
                        if (tVar instanceof t.a) {
                            t.a aVar7 = (t.a) tVar;
                            return C43175k.B(new C33500v(c33480a, null), aVar6.c(aVar7.f443339a, aVar7.f443340b, null));
                        }
                        if (tVar instanceof t.c) {
                            t.c cVar4 = (t.c) tVar;
                            return C43175k.B(new C33500v(c33480a, null), aVar6.b(cVar4.f443342a, cVar4.f443343b, C42784z0.f406748b));
                        }
                        if (!(tVar instanceof t.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        t.d dVar3 = (t.d) tVar;
                        return C43175k.B(new C33500v(c33480a, null), aVar6.c(dVar3.f443344a, dVar3.f443345b, dVar3.f443346c));
                    }
                    boolean z17 = kVar instanceof yc0.z;
                    com.avito.android.profile_settings_extended.P p12 = c33480a.f230511l;
                    if (z17) {
                        yc0.z zVar = (yc0.z) kVar;
                        if (zVar instanceof z.f) {
                            return new C43210w(new ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.ShowSelectionBottomMenu(((z.f) zVar).f443361a));
                        }
                        if (zVar instanceof z.g) {
                            String strA6 = e12.a();
                            if (strA6 != null) {
                                interfaceC28373a.c(new vc0.m(strA6, false));
                            }
                            CreateSelectionItem createSelectionItem = ((z.g) zVar).f443362a;
                            SelectionsConfig selectionsConfig = createSelectionItem.f229538e;
                            return new C43210w(new ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.OpenSelectionCreateScreen(new ExtendedProfileSelectionCreateConfig(selectionsConfig.f229528b, createSelectionItem.f229537d, selectionsConfig.f229529c, selectionsConfig.f229530d, selectionsConfig.f229531e, selectionsConfig.f229532f, selectionsConfig.f229533g, null, null, null, null, null, null, selectionsConfig.f229534h)));
                        }
                        if (zVar instanceof z.h) {
                            String strA7 = e12.a();
                            if (strA7 != null) {
                                interfaceC28373a.c(new vc0.m(strA7, true));
                            }
                            z.h hVar = (z.h) zVar;
                            SelectionItem selectionItem = hVar.f443363a;
                            SelectionsConfig selectionsConfig2 = selectionItem.f229569o;
                            c43210w = new C43207v(new ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction[]{new ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.OpenSelectionCreateScreen(new ExtendedProfileSelectionCreateConfig(selectionsConfig2.f229528b, selectionItem.f229560f, selectionsConfig2.f229529c, selectionsConfig2.f229530d, selectionsConfig2.f229531e, selectionsConfig2.f229532f, selectionsConfig2.f229533g, selectionItem.f229561g, selectionItem.f229562h, selectionItem.f229568n, selectionItem.f229557c, (Image) C42745f0.G(selectionItem.f229558d), hVar.f443363a.f229563i, selectionsConfig2.f229534h)), ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.CloseSelectionMenu.f230627b});
                        } else {
                            if (zVar instanceof z.i) {
                                z.i iVar = (z.i) zVar;
                                return new C43210w(new ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SelectionsItemScrollStateChange(iVar.f443365b, iVar.f443364a.f229521c));
                            }
                            if (zVar instanceof z.b) {
                                c43210w = new C43210w(ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.CloseSelectionMenu.f230627b);
                            } else {
                                if (zVar instanceof z.c) {
                                    u12.a(((z.c) zVar).f443357a);
                                    String strA8 = e12.a();
                                    if (strA8 != null) {
                                        interfaceC28373a.c(new ExtendedProfileSelectionActionEvent(strA8, ExtendedProfileSelectionActionEvent.ActionType.f229989d));
                                    }
                                    return new C43207v(new ExtendedProfileSettingsInternalAction[]{ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.CloseSelectionMenu.f230627b, new ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowToastBar(p12.c(), false, 2, null)});
                                }
                                if (zVar instanceof z.j) {
                                    String strA9 = e12.a();
                                    if (strA9 != null) {
                                        interfaceC28373a.c(new ExtendedProfileSelectionActionEvent(strA9, ExtendedProfileSelectionActionEvent.ActionType.f229988c));
                                    }
                                    c33480a.e(null, ((z.j) zVar).f443366a, null);
                                    c43210w = new C43210w(ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.CloseSelectionMenu.f230627b);
                                } else {
                                    if (zVar instanceof z.e) {
                                        String strA10 = e12.a();
                                        if (strA10 != null) {
                                            interfaceC28373a.c(new ExtendedProfileSelectionActionEvent(strA10, ExtendedProfileSelectionActionEvent.ActionType.f229987b));
                                        }
                                        z.e eVar = (z.e) zVar;
                                        return c33480a.f230508i.b(eVar.f443359a, eVar.f443360b);
                                    }
                                    if (zVar instanceof z.a) {
                                        return C43175k.G(new C33499u(zVar, c33480a, null));
                                    }
                                    if (!(zVar instanceof z.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    c43210w = new C43210w(new ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowToastBar(p12.o(), false, 2, null));
                                }
                            }
                        }
                    } else {
                        if (kVar instanceof yc0.y) {
                            return new C43210w(new ExtendedProfileSettingsInternalAction.OpenSelector(((yc0.y) kVar).f443354a));
                        }
                        if (kVar instanceof yc0.h) {
                            return new C43210w(new ExtendedProfileSettingsInternalAction.OpenCountEdit(((yc0.h) kVar).f443258a));
                        }
                        if (kVar instanceof yc0.p) {
                            return C43175k.G(new r(c33480a, (yc0.p) kVar, null));
                        }
                        if (kVar instanceof C50218b) {
                            DeepLink deepLink = ((C50218b) kVar).f443226a.f124953l;
                            if (deepLink != null) {
                                c33480a.e(null, deepLink, null);
                            }
                            return C43175k.w();
                        }
                        if (kVar instanceof InterfaceC50220d) {
                            InterfaceC50220d interfaceC50220d = (InterfaceC50220d) kVar;
                            if (interfaceC50220d instanceof InterfaceC50220d.a) {
                                return C43175k.G(new C33490k(interfaceC50220d, null));
                            }
                            if (interfaceC50220d instanceof InterfaceC50220d.c) {
                                return new C43210w(new ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.OpenBasicInfoEditor(((InterfaceC50220d.c) interfaceC50220d).f443232a));
                            }
                            if (interfaceC50220d instanceof InterfaceC50220d.C12910d) {
                                return new C43210w(new ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.OpenMoreActionsMenu(((InterfaceC50220d.C12910d) interfaceC50220d).f443233a));
                            }
                            if (interfaceC50220d instanceof InterfaceC50220d.k) {
                                return C43175k.G(new C33491l(interfaceC50220d, null));
                            }
                            if (interfaceC50220d instanceof InterfaceC50220d.j) {
                                return C43175k.G(new C33492m(c33480a, null, interfaceC50220d));
                            }
                            if (interfaceC50220d instanceof InterfaceC50220d.l) {
                                return C43175k.G(new C33493n(c33480a, null, interfaceC50220d));
                            }
                            if (interfaceC50220d instanceof InterfaceC50220d.e) {
                                String strA11 = e12.a();
                                if (strA11 != null) {
                                    interfaceC28373a.c(new vc0.k(strA11));
                                }
                                u12.a(((InterfaceC50220d.e) interfaceC50220d).f443234a.f229232c);
                                return new C43207v(new ExtendedProfileSettingsInternalAction[]{new ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowToastBar(p12.h(), false, 2, null), ExtendedProfileSettingsInternalAction.CloseActionsBottomMenu.f230561b});
                            }
                            if (interfaceC50220d instanceof InterfaceC50220d.f) {
                                DeepLink deepLink2 = ((InterfaceC50220d.f) interfaceC50220d).f443235a.f229234e;
                                if (deepLink2 != null) {
                                    c33480a.e(null, deepLink2, null);
                                }
                                c43210w = new C43210w(ExtendedProfileSettingsInternalAction.CloseActionsBottomMenu.f230561b);
                            } else if (interfaceC50220d instanceof InterfaceC50220d.g) {
                                c43210w = new C43207v(new ExtendedProfileSettingsInternalAction[]{new ExtendedProfileSettingsInternalAction.OpenShareDialog(((InterfaceC50220d.g) interfaceC50220d).f443236a.f229232c), ExtendedProfileSettingsInternalAction.CloseActionsBottomMenu.f230561b});
                            } else {
                                if (!(interfaceC50220d instanceof InterfaceC50220d.b)) {
                                    if (interfaceC50220d instanceof InterfaceC50220d.i) {
                                        return C43175k.G(new C33494o(c33480a, null, interfaceC50220d));
                                    }
                                    if (interfaceC50220d instanceof InterfaceC50220d.h) {
                                        return C43175k.G(new C33495p(c33480a, null, interfaceC50220d));
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                c33480a.e(null, ((InterfaceC50220d.b) interfaceC50220d).f443231a, null);
                                c43210w = new C43210w(ExtendedProfileSettingsInternalAction.CloseActionsBottomMenu.f230561b);
                            }
                        } else if (kVar instanceof InterfaceC50216C) {
                            InterfaceC50216C interfaceC50216C = (InterfaceC50216C) kVar;
                            if (interfaceC50216C instanceof InterfaceC50216C.d) {
                                return new C43210w(new ExtendedProfileSettingsInternalAction.UniversalWidgetInternalAction.CreateSection(((InterfaceC50216C.d) interfaceC50216C).f443222a));
                            }
                            if (!(interfaceC50216C instanceof InterfaceC50216C.a)) {
                                if (interfaceC50216C instanceof InterfaceC50216C.e) {
                                    return new C43210w(new ExtendedProfileSettingsInternalAction.UniversalWidgetInternalAction.OpenStatusMenu(((InterfaceC50216C.e) interfaceC50216C).f443223a));
                                }
                                if (interfaceC50216C instanceof InterfaceC50216C.c) {
                                    UniversalWidgetSectionItem universalWidgetSectionItem = ((InterfaceC50216C.c) interfaceC50216C).f443221a;
                                    return C43175k.G(new C33481b(aVar, universalWidgetSectionItem.f229915c, true, c33480a, universalWidgetSectionItem.f229916d, null));
                                }
                                if (!(interfaceC50216C instanceof InterfaceC50216C.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                UniversalWidgetSectionItem universalWidgetSectionItem2 = ((InterfaceC50216C.b) interfaceC50216C).f443220a;
                                return C43175k.G(new C33481b(aVar, universalWidgetSectionItem2.f229915c, false, c33480a, universalWidgetSectionItem2.f229916d, null));
                            }
                            UniversalWidgetSectionItem universalWidgetSectionItem3 = ((InterfaceC50216C.a) interfaceC50216C).f443219a;
                            c43210w = new C43210w(new ExtendedProfileSettingsInternalAction.UniversalWidgetInternalAction.EditSection(new UniversalWidgetEditArguments(universalWidgetSectionItem3.f229915c, universalWidgetSectionItem3.f229916d, universalWidgetSectionItem3.f229919g, universalWidgetSectionItem3.f229922j, universalWidgetSectionItem3.f229921i, universalWidgetSectionItem3.f229923k, false)));
                        } else {
                            if (!(kVar instanceof yc0.f)) {
                                if (kVar instanceof yc0.x) {
                                    c33480a.e(null, ((yc0.x) kVar).f443353a, null);
                                    return C43175k.w();
                                }
                                if (kVar instanceof yc0.v) {
                                    return new C43210w(new ExtendedProfileSettingsInternalAction.ScrollToWidgets(((yc0.v) kVar).f443350a));
                                }
                                if (!(kVar instanceof yc0.w)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                yc0.w wVar = (yc0.w) kVar;
                                DeepLink deepLink3 = wVar.f443351a;
                                Bundle bundle = new Bundle();
                                bundle.putString("widgetsToScroll", wVar.f443352b);
                                G0 g02 = G0.f406611a;
                                c33480a.e(bundle, deepLink3, "extended_profile_re_agent_empty_info_link_key");
                                return C43175k.w();
                            }
                            c43210w = new C43210w(ExtendedProfileSettingsInternalAction.CloseActionsBottomMenu.f230561b);
                        }
                    }
                }
            }
        }
        return c43210w;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.B(new C33483d(aVar, this, null), kotlinx.coroutines.rx3.y.a(this.f230509j.V9())), C43175k.C(new C33488i(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, C33487h.f230688l)));
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ExtendedProfileSettingsInternalAction> b(yc0.k kVar, com.avito.android.profile_settings_extended.mvi.entity.a aVar) {
        return C43175k.w();
    }

    public final void e(Bundle bundle, DeepLink deepLink, String str) {
        boolean z12 = deepLink instanceof ActionSelectLink;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f230509j;
        if (z12) {
            b.a.a(aVar, deepLink, "extended_profile_settings_action_select_key", null, 4);
            return;
        }
        if (!(deepLink instanceof ExtendedProfileSerpLink)) {
            aVar.r6(bundle, deepLink, str);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("skip_back_to_profile_screen_navigate", true);
        G0 g02 = G0.f406611a;
        b.a.a(aVar, deepLink, null, bundle2, 2);
    }
}
