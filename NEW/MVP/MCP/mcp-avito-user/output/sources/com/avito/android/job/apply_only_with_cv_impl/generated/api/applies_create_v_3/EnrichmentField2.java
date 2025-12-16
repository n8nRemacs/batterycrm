package com.avito.android.job.apply_only_with_cv_impl.generated.api.applies_create_v_3;

import PO.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: AppliesCreateV3Response.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001\"Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b \u0010\u0017R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/EnrichmentField2;", "", "", PaymentStateKt.PAYMENT_STATE_DONE, "", "id", "label", ChannelContext.Item.PLACEHOLDER, "Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/EnrichmentField2$Type;", "type", "", "LPO/l;", "validation", "value", "LPO/k;", "values", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/EnrichmentField2$Type;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/Boolean;", "getDone", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getLabel", "getPlaceholder", "Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/EnrichmentField2$Type;", "getType", "()Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/EnrichmentField2$Type;", "Ljava/util/List;", "getValidation", "()Ljava/util/List;", "getValue", "getValues", "Type", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnrichmentField2 {

    @c(PaymentStateKt.PAYMENT_STATE_DONE)
    @l
    private final Boolean done;

    @c("id")
    @l
    private final String id;

    @c("label")
    @l
    private final String label;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("type")
    @l
    private final Type type;

    @c("validation")
    @l
    private final List<PO.l> validation;

    @c("value")
    @l
    private final String value;

    @c("values")
    @l
    private final List<k> values;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppliesCreateV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/EnrichmentField2$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Text", "Date", "Tel", "Checkbox", "Chips", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("checkbox")
        public static final Type Checkbox;

        @c("chips")
        public static final Type Chips;

        @c("date")
        public static final Type Date;

        @c("tel")
        public static final Type Tel;

        @c("text")
        public static final Type Text;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f173953b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f173954c;

        static {
            Type type = new Type("Text", 0, "text");
            Text = type;
            Type type2 = new Type("Date", 1, "date");
            Date = type2;
            Type type3 = new Type("Tel", 2, "tel");
            Tel = type3;
            Type type4 = new Type("Checkbox", 3, "checkbox");
            Checkbox = type4;
            Type type5 = new Type("Chips", 4, "chips");
            Chips = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            f173953b = typeArr;
            f173954c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f173953b.clone();
        }
    }

    public EnrichmentField2(@l Boolean bool, @l String str, @l String str2, @l String str3, @l Type type, @l List<PO.l> list, @l String str4, @l List<k> list2) {
        this.done = bool;
        this.id = str;
        this.label = str2;
        this.placeholder = str3;
        this.type = type;
        this.validation = list;
        this.value = str4;
        this.values = list2;
    }
}
