package com.avito.android.gig.registration_self_employment_redirect_screen.generated.api.get_self_employment_registration;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetSelfEmploymentRegistrationResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0012B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/avito/android/gig/registration_self_employment_redirect_screen/generated/api/get_self_employment_registration/GetSelfEmploymentRegistrationRespSuccessActionsItem;", "", "", "name", "title", "Lcom/avito/android/gig/registration_self_employment_redirect_screen/generated/api/get_self_employment_registration/GetSelfEmploymentRegistrationRespSuccessActionsItem$Type;", "type", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/gig/registration_self_employment_redirect_screen/generated/api/get_self_employment_registration/GetSelfEmploymentRegistrationRespSuccessActionsItem$Type;Ljava/lang/String;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "a", "Lcom/avito/android/gig/registration_self_employment_redirect_screen/generated/api/get_self_employment_registration/GetSelfEmploymentRegistrationRespSuccessActionsItem$Type;", "b", "()Lcom/avito/android/gig/registration_self_employment_redirect_screen/generated/api/get_self_employment_registration/GetSelfEmploymentRegistrationRespSuccessActionsItem$Type;", "c", "Type", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetSelfEmploymentRegistrationRespSuccessActionsItem {

    @c("name")
    @l
    private final String name;

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final Type type;

    @c(ContextActionHandler.Link.URL)
    @k
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetSelfEmploymentRegistrationResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/gig/registration_self_employment_redirect_screen/generated/api/get_self_employment_registration/GetSelfEmploymentRegistrationRespSuccessActionsItem$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Primary", "Secondary", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("Primary")
        public static final Type Primary;

        @c("Secondary")
        public static final Type Secondary;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f159440b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f159441c;

        static {
            Type type = new Type("Primary", 0, "Primary");
            Primary = type;
            Type type2 = new Type("Secondary", 1, "Secondary");
            Secondary = type2;
            Type[] typeArr = {type, type2};
            f159440b = typeArr;
            f159441c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f159440b.clone();
        }
    }

    public GetSelfEmploymentRegistrationRespSuccessActionsItem(@l String str, @k String str2, @k Type type, @k String str3) {
        this.name = str;
        this.title = str2;
        this.type = type;
        this.url = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
