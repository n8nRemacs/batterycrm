package com.avito.android.profile_settings_extended.adapter.universal.section;

import androidx.compose.runtime.internal.P;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetCarouselPreviewView;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetTwoBlocksView;
import com.avito.android.util.y6;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UniversalWidgetSectionItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/universal/section/d;", "Lcom/avito/android/profile_settings_extended/adapter/universal/section/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.universal_widget.a f229931b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<yc0.k, G0> f229932c;

    /* compiled from: UniversalWidgetSectionItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[UniversalWidgetSectionModel.FactoidItemsCountType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UniversalWidgetSectionModel.FactoidItemsCountType factoidItemsCountType = UniversalWidgetSectionModel.FactoidItemsCountType.f153553b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[UniversalWidgetSectionModel.ImageWithTextType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType2 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType3 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType4 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@Y61.k com.avito.android.extended_profile_ui_components.universal_widget.a aVar, @Y61.k Y41.l<? super yc0.k, G0> lVar) {
        this.f229931b = aVar;
        this.f229932c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        boolean z12;
        j jVar = (j) eVar;
        UniversalWidgetSectionItem universalWidgetSectionItem = (UniversalWidgetSectionItem) aVar;
        jVar.MH(universalWidgetSectionItem, new e(this, universalWidgetSectionItem), new f(this, universalWidgetSectionItem), new g(this, universalWidgetSectionItem), new h(this, universalWidgetSectionItem));
        UniversalWidgetSectionModel.Section section = universalWidgetSectionItem.f229919g;
        boolean z13 = section instanceof UniversalWidgetSectionModel.FactoidSection;
        if (z13) {
            z12 = ((UniversalWidgetSectionModel.FactoidSection) section).f153561g;
        } else if (section instanceof UniversalWidgetSectionModel.TextSection) {
            z12 = ((UniversalWidgetSectionModel.TextSection) section).f153628d;
        } else {
            if (!(section instanceof UniversalWidgetSectionModel.ImageWithTextSection)) {
                throw new NoWhenBranchMatchedException();
            }
            z12 = ((UniversalWidgetSectionModel.ImageWithTextSection) section).f153597j;
        }
        if (z12) {
            jVar.XA(universalWidgetSectionItem.f229918f);
            return;
        }
        com.avito.android.extended_profile_ui_components.universal_widget.a aVar2 = this.f229931b;
        if (z13) {
            UniversalWidgetSectionModel.FactoidSection factoidSection = (UniversalWidgetSectionModel.FactoidSection) section;
            int iOrdinal = factoidSection.f153557c.ordinal();
            if (iOrdinal == 0) {
                List<UniversalWidgetSectionModel.FactoidBlock> list = factoidSection.f153562h;
                jVar.DT(new UniversalWidgetCarouselPreviewView.UniversalWidgetCarouselPreviewState(aVar2.a(section, list.get(0)), aVar2.a(section, list.get(1)), aVar2.a(section, list.get(2))));
                return;
            } else {
                if (iOrdinal != 1) {
                    return;
                }
                jVar.gM(aVar2.b(section));
                return;
            }
        }
        if (section instanceof UniversalWidgetSectionModel.TextSection) {
            jVar.Nx(aVar2.a(section, ((UniversalWidgetSectionModel.TextSection) section).f153629e.get(0)));
            return;
        }
        if (section instanceof UniversalWidgetSectionModel.ImageWithTextSection) {
            UniversalWidgetSectionModel.ImageWithTextSection imageWithTextSection = (UniversalWidgetSectionModel.ImageWithTextSection) section;
            int iOrdinal2 = imageWithTextSection.f153590c.ordinal();
            List<UniversalWidgetSectionModel.ImageWithTextBlock> list2 = imageWithTextSection.f153598k;
            if (iOrdinal2 == 0) {
                jVar.Nx(aVar2.a(section, list2.get(0)));
                return;
            }
            if (iOrdinal2 == 1) {
                jVar.Nx(aVar2.a(section, list2.get(0)));
                return;
            }
            if (iOrdinal2 == 2) {
                jVar.wz(new UniversalWidgetTwoBlocksView.UniversalWidgetTwoBlocksState(aVar2.a(section, list2.get(0)), aVar2.a(section, list2.get(1)), y6.b(imageWithTextSection.f153592e == UniversalWidgetSectionModel.TextPosition.f153619b ? 12 : 24)));
            } else if (iOrdinal2 == 3) {
                jVar.DT(new UniversalWidgetCarouselPreviewView.UniversalWidgetCarouselPreviewState(aVar2.a(section, list2.get(0)), aVar2.a(section, list2.get(1)), aVar2.a(section, list2.get(2))));
            } else {
                if (iOrdinal2 != 4) {
                    return;
                }
                jVar.gM(aVar2.b(section));
            }
        }
    }
}
