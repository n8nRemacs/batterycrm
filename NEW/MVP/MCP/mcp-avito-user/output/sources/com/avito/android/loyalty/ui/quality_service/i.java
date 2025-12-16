package com.avito.android.loyalty.ui.quality_service;

import androidx.compose.runtime.internal.P;
import com.avito.android.loyalty.remote.model.quality_service.QualityServiceGradeInfo;
import com.avito.android.loyalty.remote.model.quality_service.QualityServiceWidget;
import com.avito.android.loyalty.ui.quality_service.items.Content;
import com.avito.android.loyalty.ui.quality_service.items.plate.PlateItem;
import com.avito.android.loyalty.ui.quality_service.items.text.TextItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: QualityServiceConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/i;", "", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {

    /* compiled from: QualityServiceConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f183806a;

        static {
            int[] iArr = new int[QualityServiceGradeInfo.GradeAdvices.AdviceItem.Color.values().length];
            try {
                iArr[QualityServiceGradeInfo.GradeAdvices.AdviceItem.Color.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f183806a = iArr;
        }
    }

    @Inject
    public i() {
    }

    public static Content a(dX.j jVar) {
        ArrayList arrayList;
        Iterable iterableSingletonList;
        String title = jVar.getTitle();
        List<QualityServiceWidget> listB = jVar.b();
        ArrayList arrayList2 = null;
        if (listB != null) {
            ArrayList arrayList3 = new ArrayList();
            for (QualityServiceWidget qualityServiceWidget : listB) {
                if (qualityServiceWidget instanceof QualityServiceWidget.b) {
                    String string = UUID.randomUUID().toString();
                    AttributedText content = ((QualityServiceWidget.b) qualityServiceWidget).getContent();
                    QualityServiceWidget.a style = ((QualityServiceWidget.b) qualityServiceWidget).getStyle();
                    iterableSingletonList = Collections.singletonList(new TextItem(string, style != null ? Integer.valueOf(style.getMarginBottom()) : null, content, 0, 8, null));
                } else {
                    if (!(qualityServiceWidget instanceof QualityServiceWidget.PlatesItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    QualityServiceWidget.PlatesItem platesItem = (QualityServiceWidget.PlatesItem) qualityServiceWidget;
                    QualityServiceWidget.a style2 = ((QualityServiceWidget.PlatesItem) qualityServiceWidget).getStyle();
                    Integer numValueOf = style2 != null ? Integer.valueOf(style2.getMarginBottom()) : null;
                    List<QualityServiceWidget.PlatesItem.PlateItem> listA = platesItem.a();
                    if (listA != null) {
                        List<QualityServiceWidget.PlatesItem.PlateItem> list = listA;
                        arrayList = new ArrayList(C42745f0.q(list, 10));
                        int i12 = 0;
                        for (Object obj : list) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                C42745f0.H0();
                                throw null;
                            }
                            QualityServiceWidget.PlatesItem.PlateItem plateItem = (QualityServiceWidget.PlatesItem.PlateItem) obj;
                            String string2 = UUID.randomUUID().toString();
                            String title2 = plateItem.getTitle();
                            if (title2 == null) {
                                title2 = "";
                            }
                            String str = title2;
                            AttributedText subtitle = plateItem.getSubtitle();
                            QualityServiceWidget.PlatesItem.PlateItem.Color color = plateItem.getColor();
                            if (color == null) {
                                color = QualityServiceWidget.PlatesItem.PlateItem.Color.DEFAULT;
                            }
                            QualityServiceWidget.PlatesItem.PlateItem.Color color2 = color;
                            List<QualityServiceWidget.PlatesItem.PlateItem> listA2 = platesItem.a();
                            arrayList.add(new PlateItem(string2, (listA2 == null || i12 != listA2.size() + (-1)) ? null : numValueOf, str, color2, subtitle));
                            i12 = i13;
                        }
                    } else {
                        arrayList = null;
                    }
                    iterableSingletonList = arrayList == null ? C42784z0.f406748b : arrayList;
                }
                C42745f0.h(iterableSingletonList, arrayList3);
            }
            arrayList2 = arrayList3;
        }
        return new Content(title, arrayList2);
    }

    public static com.avito.android.loyalty.ui.quality_service.items.effect.a b(dX.l lVar) {
        String id2 = lVar.getId();
        if (id2 == null) {
            id2 = UUID.randomUUID().toString();
        }
        String str = id2;
        String title = lVar.getTitle();
        String str2 = title == null ? "" : title;
        AttributedText description = lVar.getDescription();
        Boolean disabled = lVar.getDisabled();
        boolean zBooleanValue = disabled != null ? disabled.booleanValue() : false;
        String hint = lVar.getHint();
        String str3 = hint == null ? "" : hint;
        UniversalImage image = lVar.getImage();
        dX.j content = lVar.getContent();
        return new com.avito.android.loyalty.ui.quality_service.items.effect.a(str, str2, description, str3, image, zBooleanValue, content != null ? a(content) : null);
    }
}
