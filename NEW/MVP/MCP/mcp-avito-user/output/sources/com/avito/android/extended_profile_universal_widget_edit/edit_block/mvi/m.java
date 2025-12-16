package com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi;

import android.net.Uri;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.arch.mvi.u;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockArguments;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetImageUploader;
import com.avito.android.remote.model.extended.UniversalWidget;
import javax.inject.Inject;
import kB.InterfaceC42562b;
import kB.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetEditBlockReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "LkB/b;", "LkB/d;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements u<InterfaceC42562b, kB.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_universal_widget_edit.edit_block.c f154107b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetEditBlockArguments f154108c;

    @Inject
    public m(@Y61.k com.avito.android.extended_profile_universal_widget_edit.edit_block.c cVar, @Y61.k UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments) {
        this.f154107b = cVar;
        this.f154108c = universalWidgetEditBlockArguments;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kB.d c(kB.d r26) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi.m.c(kB.d):kB.d");
    }

    public static kB.d d(kB.d dVar, Uri uri, boolean z12) {
        if (z12) {
            UniversalWidgetImageUploader.a aVar = dVar.f406178e;
            return kB.d.a(dVar, null, null, null, aVar != null ? UniversalWidgetImageUploader.a.a(aVar, uri, null, 120) : null, null, null, null, null, null, null, 1015);
        }
        UniversalWidgetImageUploader.a aVar2 = dVar.f406179f;
        return kB.d.a(dVar, null, null, null, null, aVar2 != null ? UniversalWidgetImageUploader.a.a(aVar2, uri, null, 120) : null, null, null, null, null, null, ErrorCodes.IO_EXCEPTION);
    }

    @Override // com.avito.android.arch.mvi.u
    public final kB.d a(InterfaceC42562b interfaceC42562b, kB.d dVar) {
        kB.d dVarA;
        kB.d dVarA2;
        kB.d dVarA3;
        InterfaceC42562b interfaceC42562b2 = interfaceC42562b;
        kB.d dVar2 = dVar;
        if (!(interfaceC42562b2 instanceof InterfaceC42562b.c)) {
            boolean z12 = interfaceC42562b2 instanceof InterfaceC42562b.h;
            d.a aVar = dVar2.f406184k;
            d.a aVar2 = dVar2.f406183j;
            d.a aVar3 = dVar2.f406182i;
            if (z12) {
                UniversalWidgetImageUploader.a aVar4 = dVar2.f406178e;
                UniversalWidgetImageUploader.a aVarB = aVar4 != null ? b(aVar4) : null;
                UniversalWidgetImageUploader.a aVar5 = dVar2.f406179f;
                return kB.d.a(dVar2, null, null, null, aVarB, aVar5 != null ? b(aVar5) : null, null, null, aVar3 != null ? d.a.a(aVar3, null, true, 255) : null, aVar2 != null ? d.a.a(aVar2, null, true, 255) : null, aVar != null ? d.a.a(aVar, null, true, 255) : null, 103);
            }
            if (!(interfaceC42562b2 instanceof InterfaceC42562b.d)) {
                if (interfaceC42562b2 instanceof InterfaceC42562b.C11608b) {
                    InterfaceC42562b.C11608b c11608b = (InterfaceC42562b.C11608b) interfaceC42562b2;
                    return c(d(dVar2, c11608b.f406162a, c11608b.f406163b));
                }
                if (interfaceC42562b2 instanceof InterfaceC42562b.g) {
                    return c(d(dVar2, null, ((InterfaceC42562b.g) interfaceC42562b2).f406169a));
                }
                if (interfaceC42562b2 instanceof InterfaceC42562b.i) {
                    return c(kB.d.a(dVar2, null, null, null, null, null, Boolean.valueOf(((InterfaceC42562b.i) interfaceC42562b2).f406171a), null, null, null, null, 991));
                }
                if (interfaceC42562b2 instanceof InterfaceC42562b.f ? true : interfaceC42562b2 instanceof InterfaceC42562b.e ? true : interfaceC42562b2 instanceof InterfaceC42562b.a) {
                    return dVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC42562b.d dVar3 = (InterfaceC42562b.d) interfaceC42562b2;
            int i12 = dVar3.f406165a;
            String str = dVar3.f406166b;
            if (i12 == 0) {
                dVarA = kB.d.a(dVar2, null, null, null, null, null, null, null, aVar3 != null ? d.a.a(aVar3, str, false, 253) : null, null, null, 895);
            } else if (i12 == 1) {
                dVarA = kB.d.a(dVar2, null, null, null, null, null, null, null, null, aVar2 != null ? d.a.a(aVar2, str, false, 253) : null, null, 767);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("Wrong indexOfInput in InternalAction.OnTextInput");
                }
                dVarA = kB.d.a(dVar2, null, null, null, null, null, null, null, null, null, aVar != null ? d.a.a(aVar, str, false, 253) : null, 511);
            }
            return c(dVarA);
        }
        com.avito.android.extended_profile_universal_widget_edit.edit_block.c cVar = this.f154107b;
        cVar.getClass();
        UniversalWidgetSectionModel.Block block = dVar2.f406175b;
        boolean z13 = block instanceof UniversalWidgetSectionModel.FactoidBlock;
        String blockImageSizeText43 = "";
        UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments = cVar.f154018a;
        if (z13) {
            UniversalWidgetSectionModel.FactoidBlock factoidBlock = (UniversalWidgetSectionModel.FactoidBlock) block;
            String editMultiBlockSectionTitle = universalWidgetEditBlockArguments.f153965e.getEditMultiBlockSectionTitle();
            if (editMultiBlockSectionTitle == null) {
                editMultiBlockSectionTitle = "";
            }
            String str2 = factoidBlock.f153544d;
            UniversalWidget.Config config = universalWidgetEditBlockArguments.f153965e;
            dVarA3 = kB.d.a(dVar2, null, editMultiBlockSectionTitle, null, null, null, null, null, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(str2, false, factoidBlock.f153545e, config.getSectionsConfig().getFactoid().getCommonFactoid().getBlockMainTitle()), com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(factoidBlock.f153547g, false, factoidBlock.f153548h, config.getSectionsConfig().getFactoid().getCommonFactoid().getBlockSubtitle()), com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(factoidBlock.f153550j, true, factoidBlock.f153551k, config.getSectionsConfig().getFactoid().getCommonFactoid().getBlockDescription()), 125);
        } else {
            if (block instanceof UniversalWidgetSectionModel.ImageWithTextBlock) {
                UniversalWidgetSectionModel.ImageWithTextBlock imageWithTextBlock = (UniversalWidgetSectionModel.ImageWithTextBlock) block;
                UniversalWidgetSectionModel.Section section = universalWidgetEditBlockArguments.f153962b;
                if (!(section instanceof UniversalWidgetSectionModel.ImageWithTextSection)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                boolean z14 = ((UniversalWidgetSectionModel.ImageWithTextSection) section).f153592e == UniversalWidgetSectionModel.TextPosition.f153619b;
                Boolean boolValueOf = Boolean.valueOf(imageWithTextBlock.f153583v == UniversalWidgetSectionModel.TextColor.f153616c);
                if (!z14) {
                    boolValueOf = null;
                }
                UniversalWidgetSectionModel.ImageWithTextSection imageWithTextSection = (UniversalWidgetSectionModel.ImageWithTextSection) universalWidgetEditBlockArguments.f153962b;
                int iOrdinal = imageWithTextSection.f153590c.ordinal();
                UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatio = imageWithTextSection.f153591d;
                UniversalWidget.Config config2 = universalWidgetEditBlockArguments.f153965e;
                String str3 = imageWithTextBlock.f153569h;
                String str4 = imageWithTextBlock.f153568g;
                String str5 = imageWithTextBlock.f153566e;
                String str6 = imageWithTextBlock.f153565d;
                if (iOrdinal == 0) {
                    String editMultiBlockSectionTitle2 = config2.getEditMultiBlockSectionTitle();
                    if (editMultiBlockSectionTitle2 == null) {
                        editMultiBlockSectionTitle2 = "";
                    }
                    dVarA2 = kB.d.a(dVar2, null, editMultiBlockSectionTitle2, config2.getSectionsConfig().getImageWithText().getFullWidth().getBlockImagesTitle(), new UniversalWidgetImageUploader.a(imageWithTextBlock.f153575n, imageWithTextBlock.f153578q, imageWithTextBlock.f153577p, config2.getSectionsConfig().getImageWithText().getFullWidth().getBlockDesktopImageSizeText(), z14, UniversalWidgetImageUploader.Platform.f154006c, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.b(imageWithTextImageRatio, false)), new UniversalWidgetImageUploader.a(imageWithTextBlock.f153579r, imageWithTextBlock.f153582u, imageWithTextBlock.f153581t, config2.getSectionsConfig().getImageWithText().getFullWidth().getBlockMobileImageSizeText(), z14, UniversalWidgetImageUploader.Platform.f154005b, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.b(imageWithTextImageRatio, true)), boolValueOf, config2.getSectionsConfig().getImageWithText().getFullWidth().getChangeTextColor(), com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(str6, false, str5, config2.getSectionsConfig().getImageWithText().getFullWidth().getBlockTitle()), null, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(str4, true, str3, config2.getSectionsConfig().getImageWithText().getFullWidth().getBlockDescription()), 1);
                } else if (iOrdinal == 1) {
                    String editSingleBlockSectionTitle = config2.getEditSingleBlockSectionTitle();
                    if (editSingleBlockSectionTitle == null) {
                        editSingleBlockSectionTitle = "";
                    }
                    String blockImageTitle = config2.getSectionsConfig().getImageWithText().getImgWithText().getBlockImageTitle();
                    int iOrdinal2 = imageWithTextImageRatio.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            blockImageSizeText43 = config2.getSectionsConfig().getImageWithText().getImgWithText().getBlockImageSizeText43();
                        } else if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    dVarA2 = kB.d.a(dVar2, null, editSingleBlockSectionTitle, blockImageTitle, new UniversalWidgetImageUploader.a(imageWithTextBlock.f153571j, imageWithTextBlock.f153574m, imageWithTextBlock.f153573l, blockImageSizeText43, false, UniversalWidgetImageUploader.Platform.f154007d, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.b(imageWithTextImageRatio, true)), null, null, null, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(str6, false, str5, config2.getSectionsConfig().getImageWithText().getImgWithText().getBlockTitle()), null, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(str4, true, str3, config2.getSectionsConfig().getImageWithText().getImgWithText().getBlockDescription()), 1);
                } else if (iOrdinal == 2) {
                    String editMultiBlockSectionTitle3 = config2.getEditMultiBlockSectionTitle();
                    String str7 = editMultiBlockSectionTitle3 == null ? "" : editMultiBlockSectionTitle3;
                    String blockImageTitle2 = config2.getSectionsConfig().getImageWithText().getTwoColumns().getBlockImageTitle();
                    int iOrdinal3 = imageWithTextImageRatio.ordinal();
                    if (iOrdinal3 == 0) {
                        blockImageSizeText43 = config2.getSectionsConfig().getImageWithText().getTwoColumns().getBlockImageSizeText11();
                    } else if (iOrdinal3 == 1) {
                        blockImageSizeText43 = config2.getSectionsConfig().getImageWithText().getTwoColumns().getBlockImageSizeText43();
                    } else if (iOrdinal3 == 2) {
                        blockImageSizeText43 = config2.getSectionsConfig().getImageWithText().getTwoColumns().getBlockImageSizeText34();
                    } else if (iOrdinal3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarA2 = kB.d.a(dVar2, null, str7, blockImageTitle2, new UniversalWidgetImageUploader.a(imageWithTextBlock.f153571j, imageWithTextBlock.f153574m, imageWithTextBlock.f153573l, blockImageSizeText43, z14, UniversalWidgetImageUploader.Platform.f154007d, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.b(imageWithTextImageRatio, true)), null, boolValueOf, config2.getSectionsConfig().getImageWithText().getTwoColumns().getChangeTextColor(), com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(str6, false, str5, config2.getSectionsConfig().getImageWithText().getTwoColumns().getBlockTitle()), null, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(str4, true, str3, config2.getSectionsConfig().getImageWithText().getTwoColumns().getBlockDescription()), 1);
                } else if (iOrdinal == 3) {
                    String editMultiBlockSectionTitle4 = config2.getEditMultiBlockSectionTitle();
                    String str8 = editMultiBlockSectionTitle4 == null ? "" : editMultiBlockSectionTitle4;
                    String blockImageTitle3 = config2.getSectionsConfig().getImageWithText().getThreeColumns().getBlockImageTitle();
                    int iOrdinal4 = imageWithTextImageRatio.ordinal();
                    if (iOrdinal4 == 0) {
                        blockImageSizeText43 = config2.getSectionsConfig().getImageWithText().getThreeColumns().getBlockImageSizeText11();
                    } else if (iOrdinal4 == 1) {
                        blockImageSizeText43 = config2.getSectionsConfig().getImageWithText().getThreeColumns().getBlockImageSizeText43();
                    } else if (iOrdinal4 == 2) {
                        blockImageSizeText43 = config2.getSectionsConfig().getImageWithText().getThreeColumns().getBlockImageSizeText34();
                    } else if (iOrdinal4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarA2 = kB.d.a(dVar2, null, str8, blockImageTitle3, new UniversalWidgetImageUploader.a(imageWithTextBlock.f153571j, imageWithTextBlock.f153574m, imageWithTextBlock.f153573l, blockImageSizeText43, z14, UniversalWidgetImageUploader.Platform.f154007d, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.b(imageWithTextImageRatio, true)), null, boolValueOf, config2.getSectionsConfig().getImageWithText().getThreeColumns().getChangeTextColor(), com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(str6, false, str5, config2.getSectionsConfig().getImageWithText().getThreeColumns().getBlockTitle()), null, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(str4, true, str3, config2.getSectionsConfig().getImageWithText().getThreeColumns().getBlockDescription()), 1);
                } else {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String editMultiBlockSectionTitle5 = config2.getEditMultiBlockSectionTitle();
                    if (editMultiBlockSectionTitle5 == null) {
                        editMultiBlockSectionTitle5 = "";
                    }
                    String blockImageTitle4 = config2.getSectionsConfig().getImageWithText().getFourColumns().getBlockImageTitle();
                    int iOrdinal5 = imageWithTextImageRatio.ordinal();
                    if (iOrdinal5 == 0) {
                        blockImageSizeText43 = config2.getSectionsConfig().getImageWithText().getFourColumns().getBlockImageSizeText11();
                    } else if (iOrdinal5 == 1) {
                        blockImageSizeText43 = config2.getSectionsConfig().getImageWithText().getFourColumns().getBlockImageSizeText43();
                    } else if (iOrdinal5 == 2) {
                        blockImageSizeText43 = config2.getSectionsConfig().getImageWithText().getFourColumns().getBlockImageSizeText34();
                    } else if (iOrdinal5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarA2 = kB.d.a(dVar2, null, editMultiBlockSectionTitle5, blockImageTitle4, new UniversalWidgetImageUploader.a(imageWithTextBlock.f153571j, imageWithTextBlock.f153574m, imageWithTextBlock.f153573l, blockImageSizeText43, z14, UniversalWidgetImageUploader.Platform.f154007d, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.b(imageWithTextImageRatio, true)), null, boolValueOf, config2.getSectionsConfig().getImageWithText().getFourColumns().getChangeTextColor(), com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(str6, false, str5, config2.getSectionsConfig().getImageWithText().getFourColumns().getBlockTitle()), null, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(str4, true, str3, config2.getSectionsConfig().getImageWithText().getFourColumns().getBlockDescription()), 1);
                }
            } else {
                if (!(block instanceof UniversalWidgetSectionModel.TextBlock)) {
                    throw new NoWhenBranchMatchedException();
                }
                UniversalWidgetSectionModel.TextBlock textBlock = (UniversalWidgetSectionModel.TextBlock) block;
                String editSingleBlockSectionTitle2 = universalWidgetEditBlockArguments.f153965e.getEditSingleBlockSectionTitle();
                String str9 = editSingleBlockSectionTitle2 == null ? "" : editSingleBlockSectionTitle2;
                String str10 = textBlock.f153609d;
                UniversalWidget.Config config3 = universalWidgetEditBlockArguments.f153965e;
                dVarA2 = kB.d.a(dVar2, null, str9, null, null, null, null, null, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(str10, false, textBlock.f153610e, config3.getSectionsConfig().getText().getFullWidth().getTitle()), null, com.avito.android.extended_profile_universal_widget_edit.edit_block.c.a(textBlock.f153612g, true, textBlock.f153613h, config3.getSectionsConfig().getText().getFullWidth().getText()), 125);
            }
            dVarA3 = dVarA2;
        }
        return dVarA3;
    }

    public final UniversalWidgetImageUploader.a b(UniversalWidgetImageUploader.a aVar) {
        return (aVar.f154010a == null && aVar.f154011b == null) ? UniversalWidgetImageUploader.a.a(aVar, null, this.f154108c.f153965e.getRequiredFieldMessage(), 123) : aVar;
    }
}
