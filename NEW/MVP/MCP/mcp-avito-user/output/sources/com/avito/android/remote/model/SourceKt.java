package com.avito.android.remote.model;

import Y61.l;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: Source.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0002¨\u0006\u0005"}, d2 = {"isRecommendations", "", "Lcom/avito/android/remote/model/Source;", "toParameterValue", "", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class SourceKt {

    /* compiled from: Source.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.RECOMMENDATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.FAVOURITES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.DEVELOPMENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isRecommendations(@l Source source) {
        return source == Source.RECOMMENDATIONS;
    }

    @l
    public static final String toParameterValue(@l Source source) {
        int i12 = source == null ? -1 : WhenMappings.$EnumSwitchMapping$0[source.ordinal()];
        if (i12 == 1) {
            return "recommendations";
        }
        if (i12 == 2) {
            return "favourites";
        }
        if (i12 != 3) {
            return null;
        }
        return "developments";
    }
}
