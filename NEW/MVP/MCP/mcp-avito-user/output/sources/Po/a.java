package PO;

import com.avito.android.job.apply_only_with_cv_impl.generated.api.applies_create_v_3.BottomSheetCvValidation3Button;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AppliesCreateV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LPO/a;", "", "a", "b", "LPO/a$a;", "LPO/a$b;", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: AppliesCreateV3Response.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LPO/a$a;", "LPO/a;", "Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/BottomSheetCvValidation3Button;", "button", "", "LPO/j;", "cvInfoArray", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "title", "", "vacancyId", "<init>", "(Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/BottomSheetCvValidation3Button;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;J)V", "Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/BottomSheetCvValidation3Button;", "a", "()Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/BottomSheetCvValidation3Button;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "J", "e", "()J", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: PO.a$a, reason: collision with other inner class name */
    public static final class C0845a implements a {

        @com.google.gson.annotations.c("button")
        @Y61.l
        private final BottomSheetCvValidation3Button button;

        @com.google.gson.annotations.c("cvInfoArray")
        @Y61.l
        private final List<j> cvInfoArray;

        @com.google.gson.annotations.c("description")
        @Y61.k
        private final AttributedText description;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        @com.google.gson.annotations.c("vacancyId")
        private final long vacancyId;

        public C0845a(@Y61.l BottomSheetCvValidation3Button bottomSheetCvValidation3Button, @Y61.l List<j> list, @Y61.k AttributedText attributedText, @Y61.k String str, long j12) {
            this.button = bottomSheetCvValidation3Button;
            this.cvInfoArray = list;
            this.description = attributedText;
            this.title = str;
            this.vacancyId = j12;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final BottomSheetCvValidation3Button getButton() {
            return this.button;
        }

        @Y61.l
        public final List<j> b() {
            return this.cvInfoArray;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: e, reason: from getter */
        public final long getVacancyId() {
            return this.vacancyId;
        }
    }

    /* compiled from: AppliesCreateV3Response.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"LPO/a$b;", "LPO/a;", "", "agreementText", "LPO/e;", "application", "LPO/g;", "button", "LPO/h;", "description", "title", "<init>", "(Ljava/lang/String;LPO/e;LPO/g;LPO/h;Ljava/lang/String;)V", "Ljava/lang/String;", "getAgreementText", "()Ljava/lang/String;", "LPO/e;", "getApplication", "()LPO/e;", "LPO/g;", "getButton", "()LPO/g;", "LPO/h;", "getDescription", "()LPO/h;", "getTitle", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        @com.google.gson.annotations.c("agreementText")
        @Y61.l
        private final String agreementText;

        @com.google.gson.annotations.c("application")
        @Y61.k
        private final e application;

        @com.google.gson.annotations.c("button")
        @Y61.k
        private final g button;

        @com.google.gson.annotations.c("description")
        @Y61.k
        private final h description;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public b(@Y61.l String str, @Y61.k e eVar, @Y61.k g gVar, @Y61.k h hVar, @Y61.k String str2) {
            this.agreementText = str;
            this.application = eVar;
            this.button = gVar;
            this.description = hVar;
            this.title = str2;
        }
    }
}
