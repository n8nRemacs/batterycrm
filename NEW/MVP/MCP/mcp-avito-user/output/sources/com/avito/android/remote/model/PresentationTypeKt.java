package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: PresentationType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u0003\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"PRESENTATION_TYPE", "", "orDefault", "Lcom/avito/android/remote/model/PresentationType;", "toParameterValue", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class PresentationTypeKt {

    @k
    public static final String PRESENTATION_TYPE = "presentationType";

    /* compiled from: PresentationType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PresentationType.values().length];
            try {
                iArr[PresentationType.FULL_MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PresentationType.SERP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PresentationType.SIMPLE_MAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PresentationType.REGULAR_MAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PresentationType.MAIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PresentationType.PUSH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @k
    public static final PresentationType orDefault(@l PresentationType presentationType) {
        return presentationType == null ? PresentationType.SERP : presentationType;
    }

    @l
    public static final String toParameterValue(@l PresentationType presentationType) {
        switch (presentationType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[presentationType.ordinal()]) {
            case 1:
                return "fullMap";
            case 2:
                return "serp";
            case 3:
                return "simpleMap";
            case 4:
                return "regularMap";
            case 5:
                return "main";
            case 6:
                return "push";
            default:
                return null;
        }
    }
}
