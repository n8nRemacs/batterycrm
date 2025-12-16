package com.avito.android.service_booking_public.generated.api.api_2_booking_form;

import Ht0.g;
import Ht0.h;
import Ht0.i;
import Ht0.j;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api2BookingFormResponse.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem;", "", "BookingImagesV3", "BookingParamCheckPriceListV3", "BookingParamCommentV3", "BookingParamDateV3", "BookingParamDaysV3", "BookingParamInputTextV3", "BookingParamOfferV3", "BookingParamPriceListV3", "BookingParamSpecialistsV3", "BookingParamTextV3", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingImagesV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCheckPriceListV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCommentV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDateV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDaysV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamInputTextV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamOfferV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamPriceListV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamSpecialistsV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamTextV3;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BookingFormResponseV3SuccessParamsItem {

    /* compiled from: Api2BookingFormResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingImagesV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem;", "LHt0/g;", "image", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingImagesV3$Type;", "type", "<init>", "(LHt0/g;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingImagesV3$Type;)V", "LHt0/g;", "a", "()LHt0/g;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingImagesV3$Type;", "getType", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingImagesV3$Type;", "Type", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingImagesV3 implements BookingFormResponseV3SuccessParamsItem {

        @c("image")
        @k
        private final g image;

        @c("type")
        @k
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingImagesV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Logo", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("logo")
            public static final Type Logo;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f277487b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f277488c;

            static {
                Type type = new Type("Logo", 0, "logo");
                Logo = type;
                Type[] typeArr = {type};
                f277487b = typeArr;
                f277488c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f277487b.clone();
            }
        }

        public BookingImagesV3(@k g gVar, @k Type type) {
            this.image = gVar;
            this.type = type;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final g getImage() {
            return this.image;
        }
    }

    /* compiled from: Api2BookingFormResponse.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0002\u001f BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016¨\u0006!"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCheckPriceListV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem;", "", "areGroupsCollapsible", "", "LHt0/h;", "groups", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCheckPriceListV3$Id;", "id", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCheckPriceListV3$Type;", "type", "", "value", "LHt0/i;", "values", "<init>", "(ZLjava/util/List;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCheckPriceListV3$Id;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCheckPriceListV3$Type;Ljava/util/List;Ljava/util/List;)V", "Z", "getAreGroupsCollapsible", "()Z", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCheckPriceListV3$Id;", "b", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCheckPriceListV3$Id;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCheckPriceListV3$Type;", "getType", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCheckPriceListV3$Type;", "c", "d", "Id", "Type", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingParamCheckPriceListV3 implements BookingFormResponseV3SuccessParamsItem {

        @c("areGroupsCollapsible")
        private final boolean areGroupsCollapsible;

        @c("groups")
        @k
        private final List<h> groups;

        @c("id")
        @k
        private final Id id;

        @c("type")
        @k
        private final Type type;

        @c("value")
        @l
        private final List<String> value;

        @c("values")
        @k
        private final List<i> values;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCheckPriceListV3$Id;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Service", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Id {

            @c("service")
            public static final Id Service;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Id[] f277490c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ a f277491d;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f277492b;

            static {
                Id id2 = new Id("Service", 0, "service");
                Service = id2;
                Id[] idArr = {id2};
                f277490c = idArr;
                f277491d = kotlin.enums.c.a(idArr);
            }

            private Id(String str, int i12, String str2) {
                this.f277492b = str2;
            }

            public static Id valueOf(String str) {
                return (Id) Enum.valueOf(Id.class, str);
            }

            public static Id[] values() {
                return (Id[]) f277490c.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCheckPriceListV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "CheckPriceList", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("checkPriceList")
            public static final Type CheckPriceList;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f277493b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f277494c;

            static {
                Type type = new Type("CheckPriceList", 0, "checkPriceList");
                CheckPriceList = type;
                Type[] typeArr = {type};
                f277493b = typeArr;
                f277494c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f277493b.clone();
            }
        }

        public BookingParamCheckPriceListV3(boolean z12, @k List<h> list, @k Id id2, @k Type type, @l List<String> list2, @k List<i> list3) {
            this.areGroupsCollapsible = z12;
            this.groups = list;
            this.id = id2;
            this.type = type;
            this.value = list2;
            this.values = list3;
        }

        @k
        public final List<h> a() {
            return this.groups;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final Id getId() {
            return this.id;
        }

        @l
        public final List<String> c() {
            return this.value;
        }

        @k
        public final List<i> d() {
            return this.values;
        }
    }

    /* compiled from: Api2BookingFormResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCommentV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCommentV3$Id;", "id", "", "optional", "", ChannelContext.Item.PLACEHOLDER, "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCommentV3$Type;", "type", "<init>", "(Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCommentV3$Id;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCommentV3$Type;)V", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCommentV3$Id;", "a", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCommentV3$Id;", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCommentV3$Type;", "getType", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCommentV3$Type;", "Id", "Type", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingParamCommentV3 implements BookingFormResponseV3SuccessParamsItem {

        @c("id")
        @k
        private final Id id;

        @c("optional")
        @l
        private final Boolean optional;

        @c(ChannelContext.Item.PLACEHOLDER)
        @k
        private final String placeholder;

        @c("type")
        @k
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCommentV3$Id;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Comment", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Id {

            @c("comment")
            public static final Id Comment;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Id[] f277496c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ a f277497d;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f277498b;

            static {
                Id id2 = new Id("Comment", 0, "comment");
                Comment = id2;
                Id[] idArr = {id2};
                f277496c = idArr;
                f277497d = kotlin.enums.c.a(idArr);
            }

            private Id(String str, int i12, String str2) {
                this.f277498b = str2;
            }

            public static Id valueOf(String str) {
                return (Id) Enum.valueOf(Id.class, str);
            }

            public static Id[] values() {
                return (Id[]) f277496c.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamCommentV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Comment", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("comment")
            public static final Type Comment;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f277499b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f277500c;

            static {
                Type type = new Type("Comment", 0, "comment");
                Comment = type;
                Type[] typeArr = {type};
                f277499b = typeArr;
                f277500c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f277499b.clone();
            }
        }

        public BookingParamCommentV3(@k Id id2, @l Boolean bool, @k String str, @k Type type) {
            this.id = id2;
            this.optional = bool;
            this.placeholder = str;
            this.type = type;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final Id getId() {
            return this.id;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }
    }

    /* compiled from: Api2BookingFormResponse.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDateV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem;", "", "endDate", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDateV3$Id;", "id", "title", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDateV3$Type;", "type", "value", "", "values", "<init>", "(Ljava/lang/String;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDateV3$Id;Ljava/lang/String;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDateV3$Type;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDateV3$Id;", "b", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDateV3$Id;", "c", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDateV3$Type;", "getType", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDateV3$Type;", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "Id", "Type", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingParamDateV3 implements BookingFormResponseV3SuccessParamsItem {

        @c("endDate")
        @k
        private final String endDate;

        @c("id")
        @k
        private final Id id;

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final Type type;

        @c("value")
        @l
        private final String value;

        @c("values")
        @k
        private final List<String> values;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDateV3$Id;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Date", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Id {

            @c("date")
            public static final Id Date;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Id[] f277502c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ a f277503d;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f277504b;

            static {
                Id id2 = new Id("Date", 0, "date");
                Date = id2;
                Id[] idArr = {id2};
                f277502c = idArr;
                f277503d = kotlin.enums.c.a(idArr);
            }

            private Id(String str, int i12, String str2) {
                this.f277504b = str2;
            }

            public static Id valueOf(String str) {
                return (Id) Enum.valueOf(Id.class, str);
            }

            public static Id[] values() {
                return (Id[]) f277502c.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDateV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Date", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("date")
            public static final Type Date;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f277505b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f277506c;

            static {
                Type type = new Type("Date", 0, "date");
                Date = type;
                Type[] typeArr = {type};
                f277505b = typeArr;
                f277506c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f277505b.clone();
            }
        }

        public BookingParamDateV3(@k String str, @k Id id2, @k String str2, @k Type type, @l String str3, @k List<String> list) {
            this.endDate = str;
            this.id = id2;
            this.title = str2;
            this.type = type;
            this.value = str3;
            this.values = list;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getEndDate() {
            return this.endDate;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final Id getId() {
            return this.id;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @k
        public final List<String> e() {
            return this.values;
        }
    }

    /* compiled from: Api2BookingFormResponse.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0002\u001c\u001dBC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDaysV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem;", "", "", "availableDays", "endDate", "firstAvailableDayTimeSlots", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDaysV3$Id;", "id", "title", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDaysV3$Type;", "type", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDaysV3$Id;Ljava/lang/String;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDaysV3$Type;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDaysV3$Id;", "d", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDaysV3$Id;", "e", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDaysV3$Type;", "getType", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDaysV3$Type;", "Id", "Type", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingParamDaysV3 implements BookingFormResponseV3SuccessParamsItem {

        @c("availableDays")
        @k
        private final List<String> availableDays;

        @c("endDate")
        @k
        private final String endDate;

        @c("firstAvailableDayTimeSlots")
        @k
        private final List<String> firstAvailableDayTimeSlots;

        @c("id")
        @k
        private final Id id;

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDaysV3$Id;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Date", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Id {

            @c("date")
            public static final Id Date;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Id[] f277508c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ a f277509d;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f277510b;

            static {
                Id id2 = new Id("Date", 0, "date");
                Date = id2;
                Id[] idArr = {id2};
                f277508c = idArr;
                f277509d = kotlin.enums.c.a(idArr);
            }

            private Id(String str, int i12, String str2) {
                this.f277510b = str2;
            }

            public static Id valueOf(String str) {
                return (Id) Enum.valueOf(Id.class, str);
            }

            public static Id[] values() {
                return (Id[]) f277508c.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamDaysV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Days", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("days")
            public static final Type Days;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f277511b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f277512c;

            static {
                Type type = new Type("Days", 0, "days");
                Days = type;
                Type[] typeArr = {type};
                f277511b = typeArr;
                f277512c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f277511b.clone();
            }
        }

        public BookingParamDaysV3(@k List<String> list, @k String str, @k List<String> list2, @k Id id2, @k String str2, @k Type type) {
            this.availableDays = list;
            this.endDate = str;
            this.firstAvailableDayTimeSlots = list2;
            this.id = id2;
            this.title = str2;
            this.type = type;
        }

        @k
        public final List<String> a() {
            return this.availableDays;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getEndDate() {
            return this.endDate;
        }

        @k
        public final List<String> c() {
            return this.firstAvailableDayTimeSlots;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final Id getId() {
            return this.id;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api2BookingFormResponse.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0002\u001e\u001fBG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011¨\u0006 "}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamInputTextV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem;", "", "dataFormat", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamInputTextV3$Id;", "id", "", "optional", ChannelContext.Item.PLACEHOLDER, "title", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamInputTextV3$Type;", "type", "value", "<init>", "(Ljava/lang/String;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamInputTextV3$Id;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamInputTextV3$Type;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamInputTextV3$Id;", "b", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamInputTextV3$Id;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "d", "e", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamInputTextV3$Type;", "getType", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamInputTextV3$Type;", "f", "Id", "Type", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingParamInputTextV3 implements BookingFormResponseV3SuccessParamsItem {

        @c("dataFormat")
        @l
        private final String dataFormat;

        @c("id")
        @k
        private final Id id;

        @c("optional")
        @l
        private final Boolean optional;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final Type type;

        @c("value")
        @l
        private final String value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamInputTextV3$Id;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Name", "Phone", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Id {

            @c("name")
            public static final Id Name;

            @c("phone")
            public static final Id Phone;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Id[] f277514c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ a f277515d;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f277516b;

            static {
                Id id2 = new Id("Name", 0, "name");
                Name = id2;
                Id id3 = new Id("Phone", 1, "phone");
                Phone = id3;
                Id[] idArr = {id2, id3};
                f277514c = idArr;
                f277515d = kotlin.enums.c.a(idArr);
            }

            private Id(String str, int i12, String str2) {
                this.f277516b = str2;
            }

            public static Id valueOf(String str) {
                return (Id) Enum.valueOf(Id.class, str);
            }

            public static Id[] values() {
                return (Id[]) f277514c.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamInputTextV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "TextInput", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("textInput")
            public static final Type TextInput;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f277517b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f277518c;

            static {
                Type type = new Type("TextInput", 0, "textInput");
                TextInput = type;
                Type[] typeArr = {type};
                f277517b = typeArr;
                f277518c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f277517b.clone();
            }
        }

        public BookingParamInputTextV3(@l String str, @k Id id2, @l Boolean bool, @l String str2, @k String str3, @k Type type, @l String str4) {
            this.dataFormat = str;
            this.id = id2;
            this.optional = bool;
            this.placeholder = str2;
            this.title = str3;
            this.type = type;
            this.value = str4;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getDataFormat() {
            return this.dataFormat;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final Id getId() {
            return this.id;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Boolean getOptional() {
            return this.optional;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: Api2BookingFormResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamOfferV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamOfferV3$Type;", "type", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamOfferV3$Type;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamOfferV3$Type;", "getType", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamOfferV3$Type;", "Type", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingParamOfferV3 implements BookingFormResponseV3SuccessParamsItem {

        @c("text")
        @k
        private final AttributedText text;

        @c("type")
        @k
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamOfferV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Offer", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("offer")
            public static final Type Offer;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f277519b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f277520c;

            static {
                Type type = new Type("Offer", 0, "offer");
                Offer = type;
                Type[] typeArr = {type};
                f277519b = typeArr;
                f277520c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f277519b.clone();
            }
        }

        public BookingParamOfferV3(@k AttributedText attributedText, @k Type type) {
            this.text = attributedText;
            this.type = type;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }
    }

    /* compiled from: Api2BookingFormResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0014B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamPriceListV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem;", "", "title", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamPriceListV3$Type;", "type", "", "LHt0/j;", "values", "<init>", "(Ljava/lang/String;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamPriceListV3$Type;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamPriceListV3$Type;", "getType", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamPriceListV3$Type;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Type", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingParamPriceListV3 implements BookingFormResponseV3SuccessParamsItem {

        @c("title")
        @l
        private final String title;

        @c("type")
        @k
        private final Type type;

        @c("values")
        @k
        private final List<j> values;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamPriceListV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "PriceList", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("priceList")
            public static final Type PriceList;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f277521b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f277522c;

            static {
                Type type = new Type("PriceList", 0, "priceList");
                PriceList = type;
                Type[] typeArr = {type};
                f277521b = typeArr;
                f277522c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f277521b.clone();
            }
        }

        public BookingParamPriceListV3(@l String str, @k Type type, @k List<j> list) {
            this.title = str;
            this.type = type;
            this.values = list;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final List<j> b() {
            return this.values;
        }
    }

    /* compiled from: Api2BookingFormResponse.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamSpecialistsV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamSpecialistsV3$Id;", "id", "", "readOnly", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamSpecialistsV3$Type;", "type", "", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingParamSpecialistsV3ValuesItem;", "values", "<init>", "(Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamSpecialistsV3$Id;Ljava/lang/Boolean;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamSpecialistsV3$Type;Ljava/util/List;)V", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamSpecialistsV3$Id;", "a", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamSpecialistsV3$Id;", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamSpecialistsV3$Type;", "getType", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamSpecialistsV3$Type;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Id", "Type", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingParamSpecialistsV3 implements BookingFormResponseV3SuccessParamsItem {

        @c("id")
        @k
        private final Id id;

        @c("readOnly")
        @l
        private final Boolean readOnly;

        @c("type")
        @k
        private final Type type;

        @c("values")
        @k
        private final List<BookingParamSpecialistsV3ValuesItem> values;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamSpecialistsV3$Id;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Specialists", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Id {

            @c("specialists")
            public static final Id Specialists;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Id[] f277524c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ a f277525d;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f277526b;

            static {
                Id id2 = new Id("Specialists", 0, "specialists");
                Specialists = id2;
                Id[] idArr = {id2};
                f277524c = idArr;
                f277525d = kotlin.enums.c.a(idArr);
            }

            private Id(String str, int i12, String str2) {
                this.f277526b = str2;
            }

            public static Id valueOf(String str) {
                return (Id) Enum.valueOf(Id.class, str);
            }

            public static Id[] values() {
                return (Id[]) f277524c.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamSpecialistsV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Specialists", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("specialists")
            public static final Type Specialists;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f277527b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f277528c;

            static {
                Type type = new Type("Specialists", 0, "specialists");
                Specialists = type;
                Type[] typeArr = {type};
                f277527b = typeArr;
                f277528c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f277527b.clone();
            }
        }

        public BookingParamSpecialistsV3(@k Id id2, @l Boolean bool, @k Type type, @k List<BookingParamSpecialistsV3ValuesItem> list) {
            this.id = id2;
            this.readOnly = bool;
            this.type = type;
            this.values = list;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final Id getId() {
            return this.id;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final Boolean getReadOnly() {
            return this.readOnly;
        }

        @k
        public final List<BookingParamSpecialistsV3ValuesItem> c() {
            return this.values;
        }
    }

    /* compiled from: Api2BookingFormResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0010B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamTextV3;", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem;", "", "text", "title", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamTextV3$Type;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamTextV3$Type;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamTextV3$Type;", "getType", "()Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamTextV3$Type;", "Type", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingParamTextV3 implements BookingFormResponseV3SuccessParamsItem {

        @c("text")
        @l
        private final String text;

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Api2BookingFormResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem$BookingParamTextV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Text", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("text")
            public static final Type Text;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f277529b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f277530c;

            static {
                Type type = new Type("Text", 0, "text");
                Text = type;
                Type[] typeArr = {type};
                f277529b = typeArr;
                f277530c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f277529b.clone();
            }
        }

        public BookingParamTextV3(@l String str, @k String str2, @k Type type) {
            this.text = str;
            this.title = str2;
            this.type = type;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }
}
