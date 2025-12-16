package com.avito.android.realty_agency.inline_filters_public.generated.api.api_2_nd_trx_developments_suggest_post;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api2NdTrxDevelopmentsSuggestPostResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters_public/generated/api/api_2_nd_trx_developments_suggest_post/DevelopmentSuggestV1Suggest;", "", "", "id", "", "name", "Lcom/avito/android/realty_agency/inline_filters_public/generated/api/api_2_nd_trx_developments_suggest_post/DevelopmentSuggestV1Suggest$Type;", "type", "<init>", "(JLjava/lang/String;Lcom/avito/android/realty_agency/inline_filters_public/generated/api/api_2_nd_trx_developments_suggest_post/DevelopmentSuggestV1Suggest$Type;)V", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/realty_agency/inline_filters_public/generated/api/api_2_nd_trx_developments_suggest_post/DevelopmentSuggestV1Suggest$Type;", "c", "()Lcom/avito/android/realty_agency/inline_filters_public/generated/api/api_2_nd_trx_developments_suggest_post/DevelopmentSuggestV1Suggest$Type;", "Type", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DevelopmentSuggestV1Suggest {

    @c("id")
    private final long id;

    @c("name")
    @k
    private final String name;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api2NdTrxDevelopmentsSuggestPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters_public/generated/api/api_2_nd_trx_developments_suggest_post/DevelopmentSuggestV1Suggest$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Developer", "Development", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("developer")
        public static final Type Developer;

        @c("development")
        public static final Type Development;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f251747b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f251748c;

        static {
            Type type = new Type("Developer", 0, "developer");
            Developer = type;
            Type type2 = new Type("Development", 1, "development");
            Development = type2;
            Type[] typeArr = {type, type2};
            f251747b = typeArr;
            f251748c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f251747b.clone();
        }
    }

    public DevelopmentSuggestV1Suggest(long j12, @k String str, @k Type type) {
        this.id = j12;
        this.name = str;
        this.type = type;
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
