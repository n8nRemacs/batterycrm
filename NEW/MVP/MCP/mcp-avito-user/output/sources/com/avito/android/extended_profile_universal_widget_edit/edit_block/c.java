package com.avito.android.extended_profile_universal_widget_edit.edit_block;

import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.remote.model.extended.UniversalWidget;
import javax.inject.Inject;
import kB.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: UniversalWidgetBlockInitStateConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/c;", "", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetEditBlockArguments f154018a;

    /* compiled from: UniversalWidgetBlockInitStateConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[UniversalWidgetSectionModel.ImageWithTextImageRatio.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatio = UniversalWidgetSectionModel.ImageWithTextImageRatio.f153584b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatio2 = UniversalWidgetSectionModel.ImageWithTextImageRatio.f153584b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatio3 = UniversalWidgetSectionModel.ImageWithTextImageRatio.f153584b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[UniversalWidgetSectionModel.ImageWithTextType.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType2 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr2[4] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType3 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr2[0] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextType imageWithTextType4 = UniversalWidgetSectionModel.ImageWithTextType.f153599b;
                iArr2[1] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Inject
    public c(@Y61.k UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments) {
        this.f154018a = universalWidgetEditBlockArguments;
    }

    public static d.a a(String str, boolean z12, String str2, UniversalWidget.TextBlockConfig textBlockConfig) {
        String title = textBlockConfig.getTitle();
        String str3 = title == null ? "" : title;
        String str4 = str == null ? "" : str;
        String hint = textBlockConfig.getHint();
        String str5 = hint == null ? "" : hint;
        Integer limit = textBlockConfig.getLimit();
        if (str2 == null || C43066x.K(str2)) {
            str = null;
        }
        String str6 = str;
        Boolean boolIsRequired = textBlockConfig.isRequired();
        return new d.a(str3, str4, str5, limit, z12, str6, str2, boolIsRequired != null ? boolIsRequired.booleanValue() : false, false);
    }

    public static float b(UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatio, boolean z12) {
        int iOrdinal = imageWithTextImageRatio.ordinal();
        if (iOrdinal == 0) {
            return 1.0f;
        }
        if (iOrdinal == 1) {
            return 1.3333334f;
        }
        if (iOrdinal == 2) {
            return 0.75f;
        }
        if (iOrdinal == 3) {
            return z12 ? 0.75f : 2.73f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
