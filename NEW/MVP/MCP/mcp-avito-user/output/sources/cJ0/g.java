package Cj0;

import com.avito.android.remote.autoteka.generated.api.get_step_products_v_3.GetProductsDataAnalytics;
import com.avito.android.remote.autoteka.generated.api.get_step_products_v_3.GetProductsDataExistingReport;
import kotlin.Metadata;

/* compiled from: GetStepProductsV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LCj0/g;", "", "a", "b", "LCj0/g$a;", "LCj0/g$b;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface g {

    /* compiled from: GetStepProductsV3Response.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"LCj0/g$a;", "LCj0/g;", "LCj0/b;", "activePackage", "LCj0/c;", "activeStandalonePackage", "Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataAnalytics;", "analytics", "Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataExistingReport;", "existingReport", "LCj0/d;", "productList", "LCj0/e;", "toStandalone", "<init>", "(LCj0/b;LCj0/c;Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataAnalytics;Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataExistingReport;LCj0/d;LCj0/e;)V", "LCj0/b;", "a", "()LCj0/b;", "LCj0/c;", "b", "()LCj0/c;", "Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataAnalytics;", "c", "()Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataAnalytics;", "Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataExistingReport;", "d", "()Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/GetProductsDataExistingReport;", "LCj0/d;", "e", "()LCj0/d;", "LCj0/e;", "f", "()LCj0/e;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements g {

        @com.google.gson.annotations.c("activePackage")
        @Y61.l
        private final Cj0.b activePackage;

        @com.google.gson.annotations.c("activeStandalonePackage")
        @Y61.l
        private final c activeStandalonePackage;

        @com.google.gson.annotations.c("analytics")
        @Y61.k
        private final GetProductsDataAnalytics analytics;

        @com.google.gson.annotations.c("existingReport")
        @Y61.l
        private final GetProductsDataExistingReport existingReport;

        @com.google.gson.annotations.c("productList")
        @Y61.k
        private final d productList;

        @com.google.gson.annotations.c("toStandalone")
        @Y61.l
        private final e toStandalone;

        public a(@Y61.l Cj0.b bVar, @Y61.l c cVar, @Y61.k GetProductsDataAnalytics getProductsDataAnalytics, @Y61.l GetProductsDataExistingReport getProductsDataExistingReport, @Y61.k d dVar, @Y61.l e eVar) {
            this.activePackage = bVar;
            this.activeStandalonePackage = cVar;
            this.analytics = getProductsDataAnalytics;
            this.existingReport = getProductsDataExistingReport;
            this.productList = dVar;
            this.toStandalone = eVar;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final Cj0.b getActivePackage() {
            return this.activePackage;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final c getActiveStandalonePackage() {
            return this.activeStandalonePackage;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final GetProductsDataAnalytics getAnalytics() {
            return this.analytics;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final GetProductsDataExistingReport getExistingReport() {
            return this.existingReport;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public final d getProductList() {
            return this.productList;
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final e getToStandalone() {
            return this.toStandalone;
        }
    }

    /* compiled from: GetStepProductsV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LCj0/g$b;", "LCj0/g;", "", "code", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements g {

        @com.google.gson.annotations.c("code")
        @Y61.k
        private final String code;

        public b(@Y61.k String str) {
            this.code = str;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }
    }
}
