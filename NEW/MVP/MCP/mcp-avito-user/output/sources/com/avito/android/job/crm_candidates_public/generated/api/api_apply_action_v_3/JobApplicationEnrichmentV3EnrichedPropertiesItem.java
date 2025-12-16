package com.avito.android.job.crm_candidates_public.generated.api.api_apply_action_v_3;

import Y61.k;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiApplyActionV3Response.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/job/crm_candidates_public/generated/api/api_apply_action_v_3/JobApplicationEnrichmentV3EnrichedPropertiesItem;", "", "", "label", "value", "Lcom/avito/android/job/crm_candidates_public/generated/api/api_apply_action_v_3/JobApplicationEnrichmentV3EnrichedPropertiesItem$ValueColor;", "valueColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/job/crm_candidates_public/generated/api/api_apply_action_v_3/JobApplicationEnrichmentV3EnrichedPropertiesItem$ValueColor;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Lcom/avito/android/job/crm_candidates_public/generated/api/api_apply_action_v_3/JobApplicationEnrichmentV3EnrichedPropertiesItem$ValueColor;", "c", "()Lcom/avito/android/job/crm_candidates_public/generated/api/api_apply_action_v_3/JobApplicationEnrichmentV3EnrichedPropertiesItem$ValueColor;", "ValueColor", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class JobApplicationEnrichmentV3EnrichedPropertiesItem {

    @c("label")
    @k
    private final String label;

    @c("value")
    @k
    private final String value;

    @c("valueColor")
    @k
    private final ValueColor valueColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiApplyActionV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/job/crm_candidates_public/generated/api/api_apply_action_v_3/JobApplicationEnrichmentV3EnrichedPropertiesItem$ValueColor;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Gray", "Red", "Blue", "Green", "Violet", "Black", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ValueColor {

        @c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
        public static final ValueColor Black;

        @c("blue")
        public static final ValueColor Blue;

        @c("gray")
        public static final ValueColor Gray;

        @c("green")
        public static final ValueColor Green;

        @c("red")
        public static final ValueColor Red;

        @c("violet")
        public static final ValueColor Violet;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ValueColor[] f173973c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f173974d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f173975b;

        static {
            ValueColor valueColor = new ValueColor("Gray", 0, "gray");
            Gray = valueColor;
            ValueColor valueColor2 = new ValueColor("Red", 1, "red");
            Red = valueColor2;
            ValueColor valueColor3 = new ValueColor("Blue", 2, "blue");
            Blue = valueColor3;
            ValueColor valueColor4 = new ValueColor("Green", 3, "green");
            Green = valueColor4;
            ValueColor valueColor5 = new ValueColor("Violet", 4, "violet");
            Violet = valueColor5;
            ValueColor valueColor6 = new ValueColor("Black", 5, AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
            Black = valueColor6;
            ValueColor[] valueColorArr = {valueColor, valueColor2, valueColor3, valueColor4, valueColor5, valueColor6};
            f173973c = valueColorArr;
            f173974d = kotlin.enums.c.a(valueColorArr);
        }

        private ValueColor(String str, int i12, String str2) {
            this.f173975b = str2;
        }

        public static ValueColor valueOf(String str) {
            return (ValueColor) Enum.valueOf(ValueColor.class, str);
        }

        public static ValueColor[] values() {
            return (ValueColor[]) f173973c.clone();
        }
    }

    public JobApplicationEnrichmentV3EnrichedPropertiesItem(@k String str, @k String str2, @k ValueColor valueColor) {
        this.label = str;
        this.value = str2;
        this.valueColor = valueColor;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final ValueColor getValueColor() {
        return this.valueColor;
    }
}
