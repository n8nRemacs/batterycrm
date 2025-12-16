package qp0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BbipPrivateContextData.kt */
@P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001:\u0004)*+,BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b\f\u0010&\"\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lqp0/a;", "", "", "itemId", "checkoutContext", "Lqp0/a$d;", "analyticsMetadata", "Lqp0/a$b;", "budget", "Lqp0/a$c;", "duration", "", "isPresetSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lqp0/a$d;Lqp0/a$b;Lqp0/a$c;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getItemId", "()Ljava/lang/String;", "setItemId", "(Ljava/lang/String;)V", "getCheckoutContext", "setCheckoutContext", "Lqp0/a$d;", "getAnalyticsMetadata", "()Lqp0/a$d;", "setAnalyticsMetadata", "(Lqp0/a$d;)V", "Lqp0/a$b;", "getBudget", "()Lqp0/a$b;", "setBudget", "(Lqp0/a$b;)V", "Lqp0/a$c;", "getDuration", "()Lqp0/a$c;", "setDuration", "(Lqp0/a$c;)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setPresetSelected", "(Ljava/lang/Boolean;)V", "a", "b", "c", "d", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47426a {

    @com.google.gson.annotations.c("analyticsMetadata")
    @l
    private d analyticsMetadata;

    @com.google.gson.annotations.c("budget")
    @k
    private b budget;

    @com.google.gson.annotations.c("checkoutContext")
    @l
    private String checkoutContext;

    @com.google.gson.annotations.c("duration")
    @k
    private c duration;

    @com.google.gson.annotations.c("isPresetSelected")
    @l
    private Boolean isPresetSelected;

    @com.google.gson.annotations.c("itemId")
    @k
    private String itemId;

    /* compiled from: BbipPrivateContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lqp0/a$a;", "", "", "selectedBudgetId", "", "selectedPrice", "preselectedBudgetId", "preselectedPrice", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;)V", "Ljava/lang/Integer;", "getSelectedBudgetId", "()Ljava/lang/Integer;", "setSelectedBudgetId", "(Ljava/lang/Integer;)V", "Ljava/lang/Long;", "getSelectedPrice", "()Ljava/lang/Long;", "setSelectedPrice", "(Ljava/lang/Long;)V", "getPreselectedBudgetId", "setPreselectedBudgetId", "getPreselectedPrice", "setPreselectedPrice", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qp0.a$a, reason: collision with other inner class name */
    public static final class C12336a {

        @com.google.gson.annotations.c("preselectedBudgetId")
        @l
        private Integer preselectedBudgetId;

        @com.google.gson.annotations.c("preselectedPrice")
        @l
        private Long preselectedPrice;

        @com.google.gson.annotations.c("selectedBudgetId")
        @l
        private Integer selectedBudgetId;

        @com.google.gson.annotations.c("selectedPrice")
        @l
        private Long selectedPrice;

        public C12336a() {
            this(null, null, null, null, 15, null);
        }

        public C12336a(@l Integer num, @l Long l12, @l Integer num2, @l Long l13) {
            this.selectedBudgetId = num;
            this.selectedPrice = l12;
            this.preselectedBudgetId = num2;
            this.preselectedPrice = l13;
        }

        public /* synthetic */ C12336a(Integer num, Long l12, Integer num2, Long l13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : l12, (i12 & 4) != 0 ? null : num2, (i12 & 8) != 0 ? null : l13);
        }
    }

    /* compiled from: BbipPrivateContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lqp0/a$b;", "", "", "price", "budget", "discountPct", "", "recommended", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Z)V", "Ljava/lang/Long;", "getPrice", "()Ljava/lang/Long;", "setPrice", "(Ljava/lang/Long;)V", "getBudget", "setBudget", "getDiscountPct", "setDiscountPct", "Z", "getRecommended", "()Z", "setRecommended", "(Z)V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qp0.a$b */
    public static final class b {

        @com.google.gson.annotations.c("budget")
        @l
        private Long budget;

        @com.google.gson.annotations.c("discountPct")
        @l
        private Long discountPct;

        @com.google.gson.annotations.c("price")
        @l
        private Long price;

        @com.google.gson.annotations.c("recommended")
        private boolean recommended;

        public b() {
            this(null, null, null, false, 15, null);
        }

        public b(@l Long l12, @l Long l13, @l Long l14, boolean z12) {
            this.price = l12;
            this.budget = l13;
            this.discountPct = l14;
            this.recommended = z12;
        }

        public /* synthetic */ b(Long l12, Long l13, Long l14, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : l12, (i12 & 2) != 0 ? null : l13, (i12 & 4) != 0 ? null : l14, (i12 & 8) != 0 ? true : z12);
        }
    }

    /* compiled from: BbipPrivateContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lqp0/a$c;", "", "", "value", "", "recommended", "preselected", "<init>", "(Ljava/lang/Integer;ZZ)V", "Ljava/lang/Integer;", "getValue", "()Ljava/lang/Integer;", "setValue", "(Ljava/lang/Integer;)V", "Z", "getRecommended", "()Z", "setRecommended", "(Z)V", "getPreselected", "setPreselected", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qp0.a$c */
    public static final class c {

        @com.google.gson.annotations.c("preselected")
        private boolean preselected;

        @com.google.gson.annotations.c("recommended")
        private boolean recommended;

        @com.google.gson.annotations.c("value")
        @l
        private Integer value;

        public c() {
            this(null, false, false, 7, null);
        }

        public c(@l Integer num, boolean z12, boolean z13) {
            this.value = num;
            this.recommended = z12;
            this.preselected = z13;
        }

        public /* synthetic */ c(Integer num, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? true : z13);
        }
    }

    /* compiled from: BbipPrivateContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lqp0/a$d;", "", "Lqp0/a$a;", "bbipPrivate", "<init>", "(Lqp0/a$a;)V", "Lqp0/a$a;", "getBbipPrivate", "()Lqp0/a$a;", "setBbipPrivate", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qp0.a$d */
    public static final class d {

        @com.google.gson.annotations.c("bbipPrivate")
        @l
        private C12336a bbipPrivate;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public d(@l C12336a c12336a) {
            this.bbipPrivate = c12336a;
        }

        public /* synthetic */ d(C12336a c12336a, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : c12336a);
        }
    }

    public C47426a(@k String str, @l String str2, @l d dVar, @k b bVar, @k c cVar, @l Boolean bool) {
        this.itemId = str;
        this.checkoutContext = str2;
        this.analyticsMetadata = dVar;
        this.budget = bVar;
        this.duration = cVar;
        this.isPresetSelected = bool;
    }

    public /* synthetic */ C47426a(String str, String str2, d dVar, b bVar, c cVar, Boolean bool, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : dVar, (i12 & 8) != 0 ? new b(null, null, null, false, 15, null) : bVar, (i12 & 16) != 0 ? new c(null, false, false, 7, null) : cVar, (i12 & 32) != 0 ? null : bool);
    }
}
