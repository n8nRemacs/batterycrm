package com.avito.android.extended_profile_universal_widget_edit;

import android.content.Context;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.extended.FieldModerationStatus;
import com.avito.android.remote.model.extended.UniversalWidget;
import com.avito.android.remote.model.extended.modification.UniversalWidgetFactoidModification;
import com.avito.android.remote.model.extended.modification.UniversalWidgetFactoidModificationBlock;
import com.avito.android.remote.model.extended.modification.UniversalWidgetImageWithTextModification;
import com.avito.android.remote.model.extended.modification.UniversalWidgetImageWithTextModificationBlock;
import com.avito.android.remote.model.extended.modification.UniversalWidgetSectionModification;
import com.avito.android.remote.model.extended.modification.UniversalWidgetTextModification;
import com.avito.android.remote.model.extended.modification.UniversalWidgetTextModificationBlock;
import com.avito.android.remote.model.text.AttributedText;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: UniversalWidgetModelConverterImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/g;", "Lcom/avito/android/extended_profile_universal_widget_edit/f;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f154127a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f154128b;

    /* compiled from: UniversalWidgetModelConverterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154129a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f154130b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f154131c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f154132d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f154133e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f154134f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f154135g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f154136h;

        static {
            int[] iArr = new int[UniversalWidget.UniversalWidgetFactoidItemsCountType.values().length];
            try {
                iArr[UniversalWidget.UniversalWidgetFactoidItemsCountType.THREE_COLUMNS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalWidget.UniversalWidgetFactoidItemsCountType.FOUR_COLUMNS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f154129a = iArr;
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
            int[] iArr3 = new int[UniversalWidget.SectionSubtype.values().length];
            try {
                iArr3[UniversalWidget.SectionSubtype.FULL_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[UniversalWidget.SectionSubtype.IMAGE_WITH_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[UniversalWidget.SectionSubtype.TWO_COLUMNS.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[UniversalWidget.SectionSubtype.THREE_COLUMNS.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[UniversalWidget.SectionSubtype.FOUR_COLUMNS.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[UniversalWidget.SectionSubtype.COMMON_FACTOID.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            f154130b = iArr3;
            int[] iArr4 = new int[UniversalWidget.UniversalWidgetTextColor.values().length];
            try {
                iArr4[UniversalWidget.UniversalWidgetTextColor.BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[UniversalWidget.UniversalWidgetTextColor.WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f154131c = iArr4;
            int[] iArr5 = new int[UniversalWidget.UniversalWidgetTextTitlePosition.values().length];
            try {
                iArr5[UniversalWidget.UniversalWidgetTextTitlePosition.f253846UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[UniversalWidget.UniversalWidgetTextTitlePosition.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[UniversalWidget.UniversalWidgetTextTitlePosition.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            f154132d = iArr5;
            int[] iArr6 = new int[UniversalWidget.UniversalWidgetTextPosition.values().length];
            try {
                iArr6[UniversalWidget.UniversalWidgetTextPosition.f253843IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[UniversalWidget.UniversalWidgetTextPosition.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            f154133e = iArr6;
            int[] iArr7 = new int[UniversalWidget.UniversalWidgetTextPositionImageWithText.values().length];
            try {
                iArr7[UniversalWidget.UniversalWidgetTextPositionImageWithText.IMAGE_FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[UniversalWidget.UniversalWidgetTextPositionImageWithText.TEXT_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            f154134f = iArr7;
            int[] iArr8 = new int[UniversalWidget.UniversalWidgetImageWithTextType.values().length];
            try {
                iArr8[UniversalWidget.UniversalWidgetImageWithTextType.FULL_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr8[UniversalWidget.UniversalWidgetImageWithTextType.IMG_WITH_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr8[UniversalWidget.UniversalWidgetImageWithTextType.TWO_COLUMNS.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr8[UniversalWidget.UniversalWidgetImageWithTextType.THREE_COLUMNS.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr8[UniversalWidget.UniversalWidgetImageWithTextType.FOUR_COLUMNS.ordinal()] = 5;
            } catch (NoSuchFieldError unused27) {
            }
            f154135g = iArr8;
            int[] iArr9 = new int[UniversalWidget.UniversalWidgetImageWithTextImageRatio.values().length];
            try {
                iArr9[UniversalWidget.UniversalWidgetImageWithTextImageRatio.ONE_TO_ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr9[UniversalWidget.UniversalWidgetImageWithTextImageRatio.FOUR_TO_THREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr9[UniversalWidget.UniversalWidgetImageWithTextImageRatio.THREE_TO_FOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr9[UniversalWidget.UniversalWidgetImageWithTextImageRatio.FIX.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            f154136h = iArr9;
        }
    }

    @Inject
    public g(@Y61.k Context context, @Y61.k com.avito.android.util.text.a aVar) {
        this.f154127a = aVar;
        this.f154128b = context;
    }

    public static Integer g(UniversalWidgetSectionModel.ImageWithTextType imageWithTextType, UniversalWidget.Config config) {
        int iOrdinal = imageWithTextType.ordinal();
        if (iOrdinal == 0) {
            return config.getSectionsConfig().getImageWithText().getFullWidth().getSectionTitleMaxLines();
        }
        if (iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            return config.getSectionsConfig().getImageWithText().getTwoColumns().getSectionTitleMaxLines();
        }
        if (iOrdinal == 3) {
            return config.getSectionsConfig().getImageWithText().getThreeColumns().getSectionTitleMaxLines();
        }
        if (iOrdinal == 4) {
            return config.getSectionsConfig().getImageWithText().getFourColumns().getSectionTitleMaxLines();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Q h(UniversalWidgetSectionModel.ImageWithTextType imageWithTextType, UniversalWidget.Config config) {
        Q q12;
        int iOrdinal = imageWithTextType.ordinal();
        if (iOrdinal == 0) {
            q12 = new Q(config.getSectionsConfig().getImageWithText().getFullWidth().getBlockTitle().getLineLimit(), config.getSectionsConfig().getImageWithText().getFullWidth().getBlockDescription().getLineLimit());
        } else if (iOrdinal == 1) {
            q12 = new Q(config.getSectionsConfig().getImageWithText().getImgWithText().getBlockTitle().getLineLimit(), config.getSectionsConfig().getImageWithText().getImgWithText().getBlockDescription().getLineLimit());
        } else if (iOrdinal == 2) {
            q12 = new Q(config.getSectionsConfig().getImageWithText().getTwoColumns().getBlockTitle().getLineLimit(), config.getSectionsConfig().getImageWithText().getTwoColumns().getBlockDescription().getLineLimit());
        } else if (iOrdinal == 3) {
            q12 = new Q(config.getSectionsConfig().getImageWithText().getThreeColumns().getBlockTitle().getLineLimit(), config.getSectionsConfig().getImageWithText().getThreeColumns().getBlockDescription().getLineLimit());
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            q12 = new Q(config.getSectionsConfig().getImageWithText().getFourColumns().getBlockTitle().getLineLimit(), config.getSectionsConfig().getImageWithText().getFourColumns().getBlockDescription().getLineLimit());
        }
        return new Q((Integer) q12.f406619b, (Integer) q12.f406620c);
    }

    public static UniversalWidgetSectionModel.ImageWithTextImageRatio i(UniversalWidget.UniversalWidgetImageWithTextImageRatio universalWidgetImageWithTextImageRatio) {
        int i12 = a.f154136h[universalWidgetImageWithTextImageRatio.ordinal()];
        if (i12 == 1) {
            return UniversalWidgetSectionModel.ImageWithTextImageRatio.f153584b;
        }
        if (i12 == 2) {
            return UniversalWidgetSectionModel.ImageWithTextImageRatio.f153585c;
        }
        if (i12 == 3) {
            return UniversalWidgetSectionModel.ImageWithTextImageRatio.f153586d;
        }
        if (i12 == 4) {
            return UniversalWidgetSectionModel.ImageWithTextImageRatio.f153587e;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static UniversalWidgetSectionModel.TextTitlePosition j(UniversalWidget.UniversalWidgetTextTitlePosition universalWidgetTextTitlePosition) {
        int i12 = a.f154132d[universalWidgetTextTitlePosition.ordinal()];
        if (i12 == 1) {
            return UniversalWidgetSectionModel.TextTitlePosition.f153630b;
        }
        if (i12 == 2) {
            return UniversalWidgetSectionModel.TextTitlePosition.f153631c;
        }
        if (i12 == 3) {
            return UniversalWidgetSectionModel.TextTitlePosition.f153632d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.f
    @Y61.k
    public final String a(@Y61.k UniversalWidgetSectionModel.Section section, @Y61.k UniversalWidget.SectionsConfig sectionsConfig) {
        if (section instanceof UniversalWidgetSectionModel.FactoidSection) {
            return sectionsConfig.getFactoid().getCommonFactoid().getName();
        }
        if (section instanceof UniversalWidgetSectionModel.TextSection) {
            return sectionsConfig.getText().getFullWidth().getName();
        }
        if (!(section instanceof UniversalWidgetSectionModel.ImageWithTextSection)) {
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal = ((UniversalWidgetSectionModel.ImageWithTextSection) section).f153590c.ordinal();
        if (iOrdinal == 0) {
            return sectionsConfig.getImageWithText().getFullWidth().getName();
        }
        if (iOrdinal == 1) {
            return sectionsConfig.getImageWithText().getImgWithText().getName();
        }
        if (iOrdinal == 2) {
            return sectionsConfig.getImageWithText().getTwoColumns().getName();
        }
        if (iOrdinal == 3) {
            return sectionsConfig.getImageWithText().getThreeColumns().getName();
        }
        if (iOrdinal == 4) {
            return sectionsConfig.getImageWithText().getFourColumns().getName();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.extended_profile_universal_widget_edit.f
    @Y61.k
    public final UniversalWidgetSectionModel.Section b(@Y61.k UniversalWidgetSectionModification universalWidgetSectionModification, @Y61.k UniversalWidget.Config config) {
        UniversalWidgetSectionModel.ImageWithTextType imageWithTextType;
        UniversalWidgetSectionModel.TextPosition textPosition;
        UniversalWidgetSectionModel.TextPositionImageWithText textPositionImageWithText;
        int i12;
        int i13;
        UniversalWidgetSectionModel.TextColor textColor;
        int i14;
        UniversalWidgetSectionModel.FactoidItemsCountType factoidItemsCountType;
        if (universalWidgetSectionModification instanceof UniversalWidgetFactoidModification) {
            UniversalWidgetFactoidModification universalWidgetFactoidModification = (UniversalWidgetFactoidModification) universalWidgetSectionModification;
            int i15 = a.f154129a[universalWidgetFactoidModification.getItemsCountType().ordinal()];
            if (i15 == 1) {
                factoidItemsCountType = UniversalWidgetSectionModel.FactoidItemsCountType.f153553b;
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                factoidItemsCountType = UniversalWidgetSectionModel.FactoidItemsCountType.f153554c;
            }
            UniversalWidgetSectionModel.FactoidItemsCountType factoidItemsCountType2 = factoidItemsCountType;
            List<UniversalWidgetFactoidModificationBlock> blocks = universalWidgetFactoidModification.getBlocks();
            ArrayList arrayList = new ArrayList(C42745f0.q(blocks, 10));
            for (UniversalWidgetFactoidModificationBlock universalWidgetFactoidModificationBlock : blocks) {
                arrayList.add(new UniversalWidgetSectionModel.FactoidBlock(true, false, universalWidgetFactoidModificationBlock.getTitle(), null, config.getSectionsConfig().getFactoid().getCommonFactoid().getBlockMainTitle().getLineLimit(), universalWidgetFactoidModificationBlock.getSubtitle(), null, config.getSectionsConfig().getFactoid().getCommonFactoid().getBlockSubtitle().getLineLimit(), universalWidgetFactoidModificationBlock.getDescription(), null, config.getSectionsConfig().getFactoid().getCommonFactoid().getBlockDescription().getLineLimit(), 586, null));
            }
            return new UniversalWidgetSectionModel.FactoidSection(factoidItemsCountType2, universalWidgetFactoidModification.getSectionTitle(), null, config.getSectionsConfig().getFactoid().getCommonFactoid().getSectionTitleMaxLines(), true, arrayList, 4, null);
        }
        if (universalWidgetSectionModification instanceof UniversalWidgetTextModification) {
            UniversalWidgetTextModification universalWidgetTextModification = (UniversalWidgetTextModification) universalWidgetSectionModification;
            List<UniversalWidgetTextModificationBlock> blocks2 = universalWidgetTextModification.getBlocks();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(blocks2, 10));
            for (UniversalWidgetTextModificationBlock universalWidgetTextModificationBlock : blocks2) {
                arrayList2.add(new UniversalWidgetSectionModel.TextBlock(true, false, universalWidgetTextModificationBlock.getTitle(), null, config.getSectionsConfig().getText().getFullWidth().getTitle().getLineLimit(), universalWidgetTextModificationBlock.getDescription(), null, config.getSectionsConfig().getText().getFullWidth().getText().getLineLimit(), 74, null));
            }
            UniversalWidget.UniversalWidgetTextTitlePosition titlePosition = universalWidgetTextModification.getTitlePosition();
            return new UniversalWidgetSectionModel.TextSection(titlePosition != null ? j(titlePosition) : UniversalWidgetSectionModel.TextTitlePosition.f153630b, true, arrayList2);
        }
        if (!(universalWidgetSectionModification instanceof UniversalWidgetImageWithTextModification)) {
            throw new NoWhenBranchMatchedException();
        }
        UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification = (UniversalWidgetImageWithTextModification) universalWidgetSectionModification;
        switch (a.f154130b[universalWidgetImageWithTextModification.getSubtype().ordinal()]) {
            case 1:
                imageWithTextType = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                break;
            case 2:
                imageWithTextType = UniversalWidgetSectionModel.ImageWithTextType.f153600c;
                break;
            case 3:
                imageWithTextType = UniversalWidgetSectionModel.ImageWithTextType.f153601d;
                break;
            case 4:
                imageWithTextType = UniversalWidgetSectionModel.ImageWithTextType.f153602e;
                break;
            case 5:
                imageWithTextType = UniversalWidgetSectionModel.ImageWithTextType.f153603f;
                break;
            case 6:
                throw new IllegalStateException("COMMON_FACTOID is wrong type for ImageWithTextSection");
            default:
                throw new NoWhenBranchMatchedException();
        }
        Q qH2 = h(imageWithTextType, config);
        Integer num = (Integer) qH2.f406619b;
        Integer num2 = (Integer) qH2.f406620c;
        List<UniversalWidgetImageWithTextModificationBlock> blocks3 = universalWidgetImageWithTextModification.getBlocks();
        ArrayList arrayList3 = new ArrayList(C42745f0.q(blocks3, 10));
        for (UniversalWidgetImageWithTextModificationBlock universalWidgetImageWithTextModificationBlock : blocks3) {
            String title = universalWidgetImageWithTextModificationBlock.getTitle();
            String description = universalWidgetImageWithTextModificationBlock.getDescription();
            UniversalWidget.UniversalWidgetTextColor textColor2 = universalWidgetImageWithTextModificationBlock.getTextColor();
            if (textColor2 == null || (i14 = a.f154131c[textColor2.ordinal()]) == 1) {
                textColor = UniversalWidgetSectionModel.TextColor.f153615b;
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textColor = UniversalWidgetSectionModel.TextColor.f153616c;
            }
            arrayList3.add(new UniversalWidgetSectionModel.ImageWithTextBlock(true, false, title, null, num, description, null, num2, null, null, null, null, null, null, null, null, null, null, null, null, textColor, 1048138, null));
        }
        String sectionTitle = universalWidgetImageWithTextModification.getSectionTitle();
        UniversalWidget.UniversalWidgetImageWithTextImageRatio imgRatio = universalWidgetImageWithTextModification.getImgRatio();
        UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatioI = imgRatio != null ? i(imgRatio) : UniversalWidgetSectionModel.ImageWithTextImageRatio.f153585c;
        UniversalWidget.UniversalWidgetTextPosition textPosition2 = universalWidgetImageWithTextModification.getTextPosition();
        if (textPosition2 == null || (i13 = a.f154133e[textPosition2.ordinal()]) == 1) {
            textPosition = UniversalWidgetSectionModel.TextPosition.f153619b;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textPosition = UniversalWidgetSectionModel.TextPosition.f153620c;
        }
        UniversalWidgetSectionModel.TextPosition textPosition3 = textPosition;
        UniversalWidget.UniversalWidgetTextPositionImageWithText textPositionImageWithText2 = universalWidgetImageWithTextModification.getTextPositionImageWithText();
        if (textPositionImageWithText2 == null || (i12 = a.f154134f[textPositionImageWithText2.ordinal()]) == 1) {
            textPositionImageWithText = UniversalWidgetSectionModel.TextPositionImageWithText.f153623b;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textPositionImageWithText = UniversalWidgetSectionModel.TextPositionImageWithText.f153624c;
        }
        return new UniversalWidgetSectionModel.ImageWithTextSection(imageWithTextType, imageWithTextImageRatioI, textPosition3, textPositionImageWithText, sectionTitle, null, g(imageWithTextType, config), true, arrayList3, 32, null);
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.f
    @Y61.k
    public final UniversalWidgetSectionModel.FactoidSection c(@Y61.k UniversalWidget.UniversalWidgetFactoidSection universalWidgetFactoidSection, @Y61.k UniversalWidget.Config config) {
        UniversalWidgetSectionModel.FactoidItemsCountType factoidItemsCountType;
        if (universalWidgetFactoidSection.getType() != UniversalWidget.UniversalWidgetFactoidType.COMMON_FACTOID) {
            throw new IllegalArgumentException("Unknown factoidSection.type");
        }
        List<UniversalWidget.UniversalWidgetFactoidSectionBlock> blocks = universalWidgetFactoidSection.getContent().getBlocks();
        if (blocks == null) {
            blocks = C42784z0.f406748b;
        }
        List<UniversalWidget.UniversalWidgetFactoidSectionBlock> list = blocks;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (UniversalWidget.UniversalWidgetFactoidSectionBlock universalWidgetFactoidSectionBlock : list) {
            boolean zIsEmpty = universalWidgetFactoidSectionBlock.isEmpty();
            String strF = f(universalWidgetFactoidSectionBlock.getBlockModerationStatus());
            arrayList.add(new UniversalWidgetSectionModel.FactoidBlock(zIsEmpty, !(strF == null || C43066x.K(strF)), universalWidgetFactoidSectionBlock.getTitle(), f(universalWidgetFactoidSectionBlock.getTitleModerationStatus()), config.getSectionsConfig().getFactoid().getCommonFactoid().getBlockMainTitle().getLineLimit(), universalWidgetFactoidSectionBlock.getSubtitle(), f(universalWidgetFactoidSectionBlock.getSubtitleModerationStatus()), config.getSectionsConfig().getFactoid().getCommonFactoid().getBlockSubtitle().getLineLimit(), universalWidgetFactoidSectionBlock.getDescription(), f(universalWidgetFactoidSectionBlock.getDescriptionModerationStatus()), config.getSectionsConfig().getFactoid().getCommonFactoid().getBlockDescription().getLineLimit()));
        }
        UniversalWidget.UniversalWidgetFactoidItemsCountType itemsCountType = universalWidgetFactoidSection.getContent().getItemsCountType();
        if (itemsCountType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i12 = a.f154129a[itemsCountType.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (arrayList.size() != 4) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            factoidItemsCountType = UniversalWidgetSectionModel.FactoidItemsCountType.f153554c;
        } else {
            if (arrayList.size() != 3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            factoidItemsCountType = UniversalWidgetSectionModel.FactoidItemsCountType.f153553b;
        }
        return new UniversalWidgetSectionModel.FactoidSection(factoidItemsCountType, universalWidgetFactoidSection.getContent().getSectionTitle(), f(universalWidgetFactoidSection.getContent().getSectionTitleModerationStatus()), config.getSectionsConfig().getFactoid().getCommonFactoid().getSectionTitleMaxLines(), universalWidgetFactoidSection.getContent().isEmpty(), arrayList);
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.f
    @Y61.k
    public final UniversalWidgetSectionModel.TextSection d(@Y61.k UniversalWidget.UniversalWidgetTextSection universalWidgetTextSection, @Y61.k UniversalWidget.Config config) {
        if (universalWidgetTextSection.getType() != UniversalWidget.UniversalWidgetTextType.FULL_WIDTH) {
            throw new IllegalArgumentException("Unknown textSection.type");
        }
        List<UniversalWidget.UniversalWidgetTextSectionBlock> blocks = universalWidgetTextSection.getContent().getBlocks();
        if (blocks == null) {
            blocks = C42784z0.f406748b;
        }
        List<UniversalWidget.UniversalWidgetTextSectionBlock> list = blocks;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (UniversalWidget.UniversalWidgetTextSectionBlock universalWidgetTextSectionBlock : list) {
            boolean zIsEmpty = universalWidgetTextSectionBlock.isEmpty();
            String strF = f(universalWidgetTextSectionBlock.getBlockModerationStatus());
            arrayList.add(new UniversalWidgetSectionModel.TextBlock(zIsEmpty, !(strF == null || C43066x.K(strF)), universalWidgetTextSectionBlock.getTitle(), f(universalWidgetTextSectionBlock.getTitleModerationStatus()), config.getSectionsConfig().getText().getFullWidth().getTitle().getLineLimit(), universalWidgetTextSectionBlock.getDescription(), f(universalWidgetTextSectionBlock.getDescriptionModerationStatus()), config.getSectionsConfig().getText().getFullWidth().getText().getLineLimit()));
        }
        if (arrayList.size() != 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        UniversalWidget.UniversalWidgetTextTitlePosition titlePosition = universalWidgetTextSection.getContent().getTitlePosition();
        if (titlePosition != null) {
            return new UniversalWidgetSectionModel.TextSection(j(titlePosition), universalWidgetTextSection.getContent().isEmpty(), arrayList);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.extended_profile_universal_widget_edit.f
    @Y61.k
    public final UniversalWidgetSectionModel.ImageWithTextSection e(@Y61.k UniversalWidget.UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection, @Y61.k UniversalWidget.Config config) {
        UniversalWidgetSectionModel.ImageWithTextType imageWithTextType;
        UniversalWidgetSectionModel.TextPosition textPosition;
        UniversalWidgetSectionModel.TextPositionImageWithText textPositionImageWithText;
        UniversalWidgetSectionModel.TextPositionImageWithText textPositionImageWithText2;
        UniversalWidgetSectionModel.TextPosition textPosition2;
        UniversalWidgetSectionModel.TextColor textColor;
        UniversalWidgetSectionModel.TextColor textColor2;
        UniversalWidgetSectionModel.ImageWithTextType imageWithTextType2;
        UniversalWidget.UniversalWidgetImageWithTextType type = universalWidgetImageWithTextSection.getType();
        if (type != null) {
            int i12 = a.f154135g[type.ordinal()];
            if (i12 == 1) {
                imageWithTextType2 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
            } else if (i12 == 2) {
                imageWithTextType2 = UniversalWidgetSectionModel.ImageWithTextType.f153600c;
            } else if (i12 == 3) {
                imageWithTextType2 = UniversalWidgetSectionModel.ImageWithTextType.f153601d;
            } else if (i12 == 4) {
                imageWithTextType2 = UniversalWidgetSectionModel.ImageWithTextType.f153602e;
            } else {
                if (i12 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                imageWithTextType2 = UniversalWidgetSectionModel.ImageWithTextType.f153603f;
            }
            imageWithTextType = imageWithTextType2;
        } else {
            imageWithTextType = null;
        }
        if (imageWithTextType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Q qH2 = h(imageWithTextType, config);
        Integer num = (Integer) qH2.f406619b;
        Integer num2 = (Integer) qH2.f406620c;
        List<UniversalWidget.UniversalWidgetImageWithTextSectionBlock> blocks = universalWidgetImageWithTextSection.getContent().getBlocks();
        if (blocks == null) {
            blocks = C42784z0.f406748b;
        }
        List<UniversalWidget.UniversalWidgetImageWithTextSectionBlock> list = blocks;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (UniversalWidget.UniversalWidgetImageWithTextSectionBlock universalWidgetImageWithTextSectionBlock : list) {
            boolean zIsEmpty = universalWidgetImageWithTextSectionBlock.isEmpty();
            String strF = f(universalWidgetImageWithTextSectionBlock.getBlockModerationStatus());
            boolean z12 = !(strF == null || C43066x.K(strF));
            Image image = universalWidgetImageWithTextSectionBlock.getImage();
            Long imageId = universalWidgetImageWithTextSectionBlock.getImageId();
            String strF2 = f(universalWidgetImageWithTextSectionBlock.getImageModerationStatus());
            Image desktopImage = universalWidgetImageWithTextSectionBlock.getDesktopImage();
            Long desktopImageId = universalWidgetImageWithTextSectionBlock.getDesktopImageId();
            String strF3 = f(universalWidgetImageWithTextSectionBlock.getDesktopImageModerationStatus());
            Image mobileImage = universalWidgetImageWithTextSectionBlock.getMobileImage();
            Long mobileImageId = universalWidgetImageWithTextSectionBlock.getMobileImageId();
            String strF4 = f(universalWidgetImageWithTextSectionBlock.getMobileImageModerationStatus());
            String title = universalWidgetImageWithTextSectionBlock.getTitle();
            String strF5 = f(universalWidgetImageWithTextSectionBlock.getTitleModerationStatus());
            String description = universalWidgetImageWithTextSectionBlock.getDescription();
            String strF6 = f(universalWidgetImageWithTextSectionBlock.getDescriptionModerationStatus());
            UniversalWidget.UniversalWidgetTextColor textColor3 = universalWidgetImageWithTextSectionBlock.getTextColor();
            if (textColor3 != null) {
                int i13 = a.f154131c[textColor3.ordinal()];
                if (i13 == 1) {
                    textColor2 = UniversalWidgetSectionModel.TextColor.f153615b;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textColor2 = UniversalWidgetSectionModel.TextColor.f153616c;
                }
                textColor = textColor2;
            } else {
                textColor = null;
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new UniversalWidgetSectionModel.ImageWithTextBlock(zIsEmpty, z12, title, strF5, num, description, strF6, num2, image, imageId, strF2, null, desktopImage, desktopImageId, strF3, null, mobileImage, mobileImageId, strF4, null, textColor, 559104, null));
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = arrayList;
        int iOrdinal = imageWithTextType.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal == 4 && arrayList3.size() != 4) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    } else if (arrayList3.size() != 3) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (arrayList3.size() != 2) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else if (arrayList3.size() != 1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else if (arrayList3.size() != 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        UniversalWidget.UniversalWidgetImageWithTextImageRatio imgRatio = universalWidgetImageWithTextSection.getContent().getImgRatio();
        UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatioI = imgRatio != null ? i(imgRatio) : null;
        if (imageWithTextImageRatioI == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        UniversalWidget.UniversalWidgetTextPosition textPosition3 = universalWidgetImageWithTextSection.getContent().getTextPosition();
        if (textPosition3 != null) {
            int i14 = a.f154133e[textPosition3.ordinal()];
            if (i14 == 1) {
                textPosition2 = UniversalWidgetSectionModel.TextPosition.f153619b;
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textPosition2 = UniversalWidgetSectionModel.TextPosition.f153620c;
            }
            textPosition = textPosition2;
        } else {
            textPosition = null;
        }
        if (textPosition == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        UniversalWidget.UniversalWidgetTextPositionImageWithText textPositionImageWithText3 = universalWidgetImageWithTextSection.getContent().getTextPositionImageWithText();
        if (textPositionImageWithText3 != null) {
            int i15 = a.f154134f[textPositionImageWithText3.ordinal()];
            if (i15 == 1) {
                textPositionImageWithText2 = UniversalWidgetSectionModel.TextPositionImageWithText.f153623b;
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textPositionImageWithText2 = UniversalWidgetSectionModel.TextPositionImageWithText.f153624c;
            }
            textPositionImageWithText = textPositionImageWithText2;
        } else {
            textPositionImageWithText = null;
        }
        return new UniversalWidgetSectionModel.ImageWithTextSection(imageWithTextType, imageWithTextImageRatioI, textPosition, textPositionImageWithText, universalWidgetImageWithTextSection.getContent().getSectionTitle(), f(universalWidgetImageWithTextSection.getContent().getSectionTitleModerationStatus()), g(imageWithTextType, config), universalWidgetImageWithTextSection.getContent().isEmpty(), arrayList3);
    }

    public final String f(FieldModerationStatus fieldModerationStatus) {
        if ((fieldModerationStatus != null ? fieldModerationStatus.getName() : null) != FieldModerationStatus.StatusName.REJECTED) {
            return null;
        }
        String title = fieldModerationStatus.getTitle();
        AttributedText subtitle = fieldModerationStatus.getSubtitle();
        return C42745f0.O(C42745f0.U(title, subtitle != null ? this.f154127a.c(this.f154128b, subtitle) : null), ". ", null, null, null, 62);
    }
}
