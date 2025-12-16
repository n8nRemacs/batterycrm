package com.avito.android.installmentsblock.mapper;

import aO.InterfaceC19797c;
import androidx.compose.runtime.internal.P;
import com.avito.android.installments_block.entity.InstallmentsBlockStateData;
import com.avito.android.installments_block.entity.InstallmentsButton;
import com.avito.android.installments_block.entity.InstallmentsIcon;
import com.avito.android.installments_block.entity.InstallmentsOfferDetailsItem;
import com.avito.android.installments_block.entity.InstallmentsPriceInfo;
import com.avito.android.installments_block.entity.InstallmentsProgress;
import com.avito.android.installments_block.entity.util.InstallmentsColoredIcon;
import com.avito.android.installments_block.entity.util.InstallmentsSize;
import com.avito.android.remote.model.ColoredIcon;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.credit_broker.CreditProgress;
import com.avito.android.remote.model.credit_broker.Icon;
import com.avito.android.remote.model.credit_broker.LoanTerms;
import com.avito.android.remote.model.credit_broker.OfferDetailsItem;
import com.avito.android.remote.model.credit_broker.Size;
import com.avito.android.remote.model.credit_broker.installments_block.InstallmentsBlockStateDto;
import com.avito.android.remote.model.credit_broker.installments_block.InstallmentsButtonDto;
import com.avito.android.remote.model.credit_broker.installments_block.InstallmentsIconDto;
import com.avito.android.remote.model.text.AttributedText;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsBlockMapperImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installmentsblock/mapper/a;", "LaO/c;", "<init>", "()V", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements InterfaceC19797c {

    /* compiled from: InstallmentsBlockMapperImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.installmentsblock.mapper.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5099a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172977a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f172978b;

        static {
            int[] iArr = new int[LoanTerms.ChipBadge.Type.values().length];
            try {
                iArr[LoanTerms.ChipBadge.Type.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoanTerms.ChipBadge.Type.ELLIPSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f172977a = iArr;
            int[] iArr2 = new int[LoanTerms.PriceInfo.PriceBadge.Type.values().length];
            try {
                iArr2[LoanTerms.PriceInfo.PriceBadge.Type.RED_BADGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LoanTerms.PriceInfo.PriceBadge.Type.QUESTION_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f172978b = iArr2;
        }
    }

    @Inject
    public a() {
    }

    public static InstallmentsBlockStateData b(InstallmentsBlockStateDto installmentsBlockStateDto) {
        InstallmentsIcon installmentsIcon;
        InstallmentsPriceInfo installmentsPriceInfo;
        InstallmentsProgress installmentsProgress;
        InstallmentsColoredIcon installmentsColoredIcon;
        InstallmentsPriceInfo.PriceBadge redBadge;
        LoanTerms.PriceInfo.PriceBadge.Type type;
        InstallmentsColoredIcon installmentsColoredIcon2;
        String title = installmentsBlockStateDto.getTitle();
        InstallmentsIconDto icon = installmentsBlockStateDto.getIcon();
        if (icon != null) {
            ColoredIcon localIcon = icon.getLocalIcon();
            if (localIcon != null) {
                String name = localIcon.getName();
                if (name == null) {
                    name = "";
                }
                installmentsColoredIcon2 = new InstallmentsColoredIcon(name, localIcon.getColor());
            } else {
                installmentsColoredIcon2 = null;
            }
            UniversalImage remoteIcon = icon.getRemoteIcon();
            Size size = icon.getSize();
            installmentsIcon = new InstallmentsIcon(installmentsColoredIcon2, remoteIcon, size != null ? new InstallmentsSize(size.getWidth(), size.getHeight()) : null, icon.getDeepLink());
        } else {
            installmentsIcon = null;
        }
        AttributedText subtitle = installmentsBlockStateDto.getSubtitle();
        LoanTerms.PriceInfo priceInfo = installmentsBlockStateDto.getPriceInfo();
        if (priceInfo != null) {
            String price = priceInfo.getPrice();
            AttributedText priceDescription = priceInfo.getPriceDescription();
            LoanTerms.PriceInfo.PriceBadge badge = priceInfo.getBadge();
            if (badge == null || (type = badge.getType()) == null) {
                redBadge = null;
            } else {
                int i12 = C5099a.f172978b[type.ordinal()];
                if (i12 == 1) {
                    redBadge = new InstallmentsPriceInfo.PriceBadge.RedBadge(badge.getText(), badge.getDeeplink());
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    redBadge = new InstallmentsPriceInfo.PriceBadge.QuestionIcon(badge.getDeeplink());
                }
            }
            installmentsPriceInfo = new InstallmentsPriceInfo(price, priceDescription, redBadge);
        } else {
            installmentsPriceInfo = null;
        }
        CreditProgress progress = installmentsBlockStateDto.getProgress();
        if (progress != null) {
            Integer blockSpacing = progress.getBlockSpacing();
            int iIntValue = blockSpacing != null ? blockSpacing.intValue() : 0;
            Integer dashHeight = progress.getDashHeight();
            int iIntValue2 = dashHeight != null ? dashHeight.intValue() : 0;
            CreditProgress.Block leftBlock = progress.getLeftBlock();
            InstallmentsProgress.Block blockC = leftBlock != null ? c(leftBlock) : null;
            CreditProgress.Block rightBlock = progress.getRightBlock();
            installmentsProgress = new InstallmentsProgress(iIntValue, iIntValue2, blockC, rightBlock != null ? c(rightBlock) : null);
        } else {
            installmentsProgress = null;
        }
        List<InstallmentsButtonDto> buttons = installmentsBlockStateDto.getButtons();
        if (buttons == null) {
            buttons = C42784z0.f406748b;
        }
        List<InstallmentsButtonDto> list = buttons;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (InstallmentsButtonDto installmentsButtonDto : list) {
            Integer id2 = installmentsButtonDto.getId();
            String title2 = installmentsButtonDto.getTitle();
            if (title2 == null) {
                title2 = "";
            }
            String style = installmentsButtonDto.getStyle();
            if (style == null) {
                style = "";
            }
            arrayList.add(new InstallmentsButton(id2, title2, style, installmentsButtonDto.getDeepLink()));
        }
        List<OfferDetailsItem> creditOfferDetailsItems = installmentsBlockStateDto.getCreditOfferDetailsItems();
        if (creditOfferDetailsItems == null) {
            creditOfferDetailsItems = C42784z0.f406748b;
        }
        ArrayList arrayListC = C42745f0.C(creditOfferDetailsItems);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListC, 10));
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            OfferDetailsItem offerDetailsItem = (OfferDetailsItem) it.next();
            AttributedText attributedText = offerDetailsItem.getAttributedText();
            Icon icon2 = offerDetailsItem.getIcon();
            if (icon2 != null) {
                String name2 = icon2.getName();
                if (name2 == null) {
                    name2 = "";
                }
                installmentsColoredIcon = new InstallmentsColoredIcon(name2, icon2.getDynamicColor());
            } else {
                installmentsColoredIcon = null;
            }
            arrayList2.add(new InstallmentsOfferDetailsItem(attributedText, installmentsColoredIcon));
        }
        return new InstallmentsBlockStateData(title, installmentsIcon, subtitle, installmentsPriceInfo, installmentsProgress, arrayList, arrayList2);
    }

    public static InstallmentsProgress.Block c(CreditProgress.Block block) {
        AttributedText attributedText = block.getAttributedText();
        Integer textMarginTop = block.getTextMarginTop();
        Integer blockWidth = block.getBlockWidth();
        Integer dashCount = block.getDashCount();
        return new InstallmentsProgress.Block(attributedText, textMarginTop, blockWidth, dashCount != null ? dashCount.intValue() : 0, block.getDashSpacing(), block.getDashColor());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    @Override // aO.InterfaceC19797c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.installments_block.entity.InstallmentsBlock a(@Y61.k com.avito.android.remote.model.credit_broker.installments_block.InstallmentsBlockDto r12) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.installmentsblock.mapper.a.a(com.avito.android.remote.model.credit_broker.installments_block.InstallmentsBlockDto):com.avito.android.installments_block.entity.InstallmentsBlock");
    }
}
