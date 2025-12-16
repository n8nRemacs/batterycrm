package com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7;

import Y61.k;
import Y61.l;
import YF0.b;
import YF0.h;
import YF0.i;
import YF0.j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiTrxPromoConfigureV7Response.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\u0018\u00002\u00020\u0001:\u00017Bw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b.\u0010!R\u001a\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b/\u0010!R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b6\u0010!¨\u00068"}, d2 = {"Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItem;", "", "LYF0/h;", "datePicker", "LYF0/i;", "dateRangeFormat", "", "endDate", "LYF0/b;", "icon", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItem$OptionType;", "optionType", "", "selected", "LYF0/j;", "selectedState", "startDate", "title", "LYF0/k;", "toDateOptions", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "value", "<init>", "(LYF0/h;LYF0/i;Ljava/lang/String;LYF0/b;Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItem$OptionType;ZLYF0/j;Ljava/lang/String;Ljava/lang/String;LYF0/k;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "LYF0/h;", "a", "()LYF0/h;", "LYF0/i;", "b", "()LYF0/i;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "LYF0/b;", "d", "()LYF0/b;", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItem$OptionType;", "e", "()Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItem$OptionType;", "Z", "f", "()Z", "LYF0/j;", "g", "()LYF0/j;", "h", "i", "LYF0/k;", "j", "()LYF0/k;", "Lcom/avito/android/deep_linking/links/DeepLink;", "k", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getValue", "OptionType", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApiDatesV3WithDateRangeOptionsItem {

    @c("datePicker")
    @l
    private final h datePicker;

    @c("dateRangeFormat")
    @l
    private final i dateRangeFormat;

    @c("endDate")
    @l
    private final String endDate;

    @c("icon")
    @l
    private final b icon;

    @c("optionType")
    @k
    private final OptionType optionType;

    @c("selected")
    private final boolean selected;

    @c("selectedState")
    @k
    private final j selectedState;

    @c("startDate")
    @l
    private final String startDate;

    @c("title")
    @k
    private final String title;

    @c("toDateOptions")
    @l
    private final YF0.k toDateOptions;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    @c("value")
    @l
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiTrxPromoConfigureV7Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItem$OptionType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "AllFree", "BeforeDate", "DateRange", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OptionType {

        @c("all_free")
        public static final OptionType AllFree;

        @c("before_date")
        public static final OptionType BeforeDate;

        @c("date_range")
        public static final OptionType DateRange;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ OptionType[] f304183b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f304184c;

        static {
            OptionType optionType = new OptionType("AllFree", 0, "all_free");
            AllFree = optionType;
            OptionType optionType2 = new OptionType("BeforeDate", 1, "before_date");
            BeforeDate = optionType2;
            OptionType optionType3 = new OptionType("DateRange", 2, "date_range");
            DateRange = optionType3;
            OptionType[] optionTypeArr = {optionType, optionType2, optionType3};
            f304183b = optionTypeArr;
            f304184c = kotlin.enums.c.a(optionTypeArr);
        }

        private OptionType(String str, int i12, String str2) {
        }

        public static OptionType valueOf(String str) {
            return (OptionType) Enum.valueOf(OptionType.class, str);
        }

        public static OptionType[] values() {
            return (OptionType[]) f304183b.clone();
        }
    }

    public ApiDatesV3WithDateRangeOptionsItem(@l h hVar, @l i iVar, @l String str, @l b bVar, @k OptionType optionType, boolean z12, @k j jVar, @l String str2, @k String str3, @l YF0.k kVar, @l DeepLink deepLink, @l String str4) {
        this.datePicker = hVar;
        this.dateRangeFormat = iVar;
        this.endDate = str;
        this.icon = bVar;
        this.optionType = optionType;
        this.selected = z12;
        this.selectedState = jVar;
        this.startDate = str2;
        this.title = str3;
        this.toDateOptions = kVar;
        this.uri = deepLink;
        this.value = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final h getDatePicker() {
        return this.datePicker;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final i getDateRangeFormat() {
        return this.dateRangeFormat;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final b getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final OptionType getOptionType() {
        return this.optionType;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final j getSelectedState() {
        return this.selectedState;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final YF0.k getToDateOptions() {
        return this.toDateOptions;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
