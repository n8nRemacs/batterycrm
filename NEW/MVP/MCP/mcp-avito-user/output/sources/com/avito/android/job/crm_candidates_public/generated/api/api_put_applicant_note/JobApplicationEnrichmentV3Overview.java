package com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note;

import Y61.k;
import Y61.l;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiPutApplicantNoteResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/job/crm_candidates_public/generated/api/api_put_applicant_note/JobApplicationEnrichmentV3Overview;", "", "Lcom/avito/android/job/crm_candidates_public/generated/api/api_put_applicant_note/JobApplicationEnrichmentV3Overview$Color;", "color", "", "text", "<init>", "(Lcom/avito/android/job/crm_candidates_public/generated/api/api_put_applicant_note/JobApplicationEnrichmentV3Overview$Color;Ljava/lang/String;)V", "Lcom/avito/android/job/crm_candidates_public/generated/api/api_put_applicant_note/JobApplicationEnrichmentV3Overview$Color;", "a", "()Lcom/avito/android/job/crm_candidates_public/generated/api/api_put_applicant_note/JobApplicationEnrichmentV3Overview$Color;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Color", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class JobApplicationEnrichmentV3Overview {

    @c("color")
    @l
    private final Color color;

    @c("text")
    @l
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiPutApplicantNoteResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/job/crm_candidates_public/generated/api/api_put_applicant_note/JobApplicationEnrichmentV3Overview$Color;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Gray", "Red", "Blue", "Green", "Violet", "Black", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Color {

        @c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
        public static final Color Black;

        @c("blue")
        public static final Color Blue;

        @c("gray")
        public static final Color Gray;

        @c("green")
        public static final Color Green;

        @c("red")
        public static final Color Red;

        @c("violet")
        public static final Color Violet;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Color[] f174010c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f174011d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f174012b;

        static {
            Color color = new Color("Gray", 0, "gray");
            Gray = color;
            Color color2 = new Color("Red", 1, "red");
            Red = color2;
            Color color3 = new Color("Blue", 2, "blue");
            Blue = color3;
            Color color4 = new Color("Green", 3, "green");
            Green = color4;
            Color color5 = new Color("Violet", 4, "violet");
            Violet = color5;
            Color color6 = new Color("Black", 5, AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
            Black = color6;
            Color[] colorArr = {color, color2, color3, color4, color5, color6};
            f174010c = colorArr;
            f174011d = kotlin.enums.c.a(colorArr);
        }

        private Color(String str, int i12, String str2) {
            this.f174012b = str2;
        }

        public static Color valueOf(String str) {
            return (Color) Enum.valueOf(Color.class, str);
        }

        public static Color[] values() {
            return (Color[]) f174010c.clone();
        }
    }

    public JobApplicationEnrichmentV3Overview(@l Color color, @l String str) {
        this.color = color;
        this.text = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Color getColor() {
        return this.color;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
