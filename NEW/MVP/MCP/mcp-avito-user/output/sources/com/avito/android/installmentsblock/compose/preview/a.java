package com.avito.android.installmentsblock.compose.preview;

import Y61.k;
import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.P;
import com.avito.android.installments_block.entity.InstallmentsBlockStateData;
import com.avito.android.installments_block.entity.InstallmentsButton;
import com.avito.android.installments_block.entity.InstallmentsIcon;
import com.avito.android.installments_block.entity.InstallmentsOfferDetailsItem;
import com.avito.android.installments_block.entity.InstallmentsPriceInfo;
import com.avito.android.installments_block.entity.InstallmentsProgress;
import com.avito.android.installments_block.entity.util.InstallmentsColoredIcon;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: BlockPreviewData.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installmentsblock/compose/preview/a;", "", "<init>", "()V", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"HardcodeStringDetector"})
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f172945a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final InstallmentsBlockStateData f172946b;

    static {
        InstallmentsIcon installmentsIcon = new InstallmentsIcon(new InstallmentsColoredIcon("help24", new UniversalColor("gray54", null, null)), null, null, null);
        C42784z0 c42784z0 = C42784z0.f406748b;
        InstallmentsPriceInfo installmentsPriceInfo = new InstallmentsPriceInfo("12 321 Р", new AttributedText("Test price description", c42784z0, 0, 4, null), new InstallmentsPriceInfo.PriceBadge.RedBadge("0%", null));
        InstallmentsProgress installmentsProgress = new InstallmentsProgress(5, 6, new InstallmentsProgress.Block(new AttributedText("Left block\nSome text", c42784z0, 0, 4, null), 6, 105, 1, null, new UniversalColor("green", null, null)), new InstallmentsProgress.Block(new AttributedText("Right block\nSome long long text", c42784z0, 0, 4, null), 6, null, 4, 4, new UniversalColor("gray", null, null)));
        InstallmentsButton installmentsButton = new InstallmentsButton(null, "Test button", "primaryMedium", null);
        f172946b = new InstallmentsBlockStateData("Preview title", installmentsIcon, new AttributedText("Test subtitle", c42784z0, 0, 4, null), installmentsPriceInfo, installmentsProgress, C42745f0.U(installmentsButton, installmentsButton), C42745f0.U(new InstallmentsOfferDetailsItem(new AttributedText("Preview offer detail", c42784z0, 0, 4, null), new InstallmentsColoredIcon("box20", null)), new InstallmentsOfferDetailsItem(new AttributedText("Preview offer detail", c42784z0, 0, 4, null), new InstallmentsColoredIcon("walkingRoute20", null))));
    }
}
