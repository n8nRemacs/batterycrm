package com.avito.android.bbl.screens.configure.v2.mvi.domain;

import Y41.p;
import com.akita.compose.component.docking_badge.m;
import com.avito.android.bbl.generated.api.api_3_bbl_configure.BblConfigureConfig;
import com.avito.android.bbl.generated.api.api_3_bbl_configure.BblConfigureConfigBblBadge;
import com.avito.android.bbl.screens.configure.v2.ui.items.cards.C28729a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import uh.C49059b;
import uh.C49060c;
import wZ.C49582f;
import wZ.k;
import wZ.l;

/* compiled from: GetBblConfigureV2UseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bbl_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* compiled from: GetBblConfigureV2UseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99347a;

        static {
            int[] iArr = new int[BblConfigureConfigBblBadge.Style.values().length];
            try {
                iArr[BblConfigureConfigBblBadge.Style.Black.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BblConfigureConfigBblBadge.Style.Red.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BblConfigureConfigBblBadge.Style.Blue.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BblConfigureConfigBblBadge.Style.Gray.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BblConfigureConfigBblBadge.Style.Green.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BblConfigureConfigBblBadge.Style.Violet.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f99347a = iArr;
        }
    }

    @Y61.k
    public static final C28729a a(@Y61.k BblConfigureConfig bblConfigureConfig) {
        l lVar;
        C28729a.C2994a c2994a;
        p pVar;
        long id2 = bblConfigureConfig.getId();
        C49582f c49582fB = b(bblConfigureConfig.getBblDelta());
        AttributedText text = bblConfigureConfig.getText();
        uh.j universalImage = bblConfigureConfig.getUniversalImage();
        if (universalImage != null) {
            Image value = universalImage.getValue();
            lVar = value != null ? new l(value, universalImage.getValueDark()) : null;
        } else {
            lVar = null;
        }
        boolean isSelected = bblConfigureConfig.getIsSelected();
        boolean z12 = bblConfigureConfig.getWidth() == BblConfigureConfig.Width.Half;
        BblConfigureConfigBblBadge bblBadge = bblConfigureConfig.getBblBadge();
        if (bblBadge != null) {
            String title = bblBadge.getTitle();
            switch (a.f99347a[bblBadge.getStyle().ordinal()]) {
                case 1:
                    pVar = f.f99348l;
                    break;
                case 2:
                    pVar = g.f99349l;
                    break;
                case 3:
                    pVar = h.f99350l;
                    break;
                case 4:
                    pVar = i.f99351l;
                    break;
                case 5:
                    pVar = j.f99352l;
                    break;
                case 6:
                    pVar = k.f99353l;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            c2994a = new C28729a.C2994a(title, c(bblBadge.getLeftEndType().f99083b), c(bblBadge.getRightEndType().f99086b), pVar);
        } else {
            c2994a = null;
        }
        return new C28729a(text, isSelected, z12, lVar, c2994a, Long.valueOf(id2), c49582fB);
    }

    @Y61.k
    public static final C49582f b(@Y61.k C49059b c49059b) {
        wZ.k kVarB;
        int count = (int) c49059b.getCount();
        float progress = (float) c49059b.getProgress();
        AttributedText text = c49059b.getText();
        String icon = c49059b.getIcon();
        C49060c progressColor = c49059b.getProgressColor();
        if (progressColor != null) {
            k.a aVar = wZ.k.f441571d;
            String valueName = progressColor.getValueName();
            String value = progressColor.getValue();
            String valueDark = progressColor.getValueDark();
            aVar.getClass();
            kVarB = k.a.b(valueName, value, valueDark);
        } else {
            kVarB = null;
        }
        return new C49582f(count, progress, text, icon, kVarB);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static final m c(String str) {
        switch (str.hashCode()) {
            case -1988810866:
                if (str.equals("antiPyramid")) {
                    return m.a.f61553b;
                }
                break;
            case -106396336:
                if (str.equals("pyramid")) {
                    return m.d.f61562b;
                }
                break;
            case 3145580:
                if (str.equals("flag")) {
                    return m.b.f61556b;
                }
                break;
            case 106673453:
                if (str.equals("pipka")) {
                    return m.c.f61559b;
                }
                break;
        }
        return m.e.f61565b;
    }
}
