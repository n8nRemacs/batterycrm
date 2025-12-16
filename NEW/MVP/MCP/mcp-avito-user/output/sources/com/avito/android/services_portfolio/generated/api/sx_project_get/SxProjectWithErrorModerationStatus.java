package com.avito.android.services_portfolio.generated.api.sx_project_get;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import fv0.C40486c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: SxProjectGetResponse.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/services_portfolio/generated/api/sx_project_get/SxProjectWithErrorModerationStatus;", "", "", "Lfv0/c;", "actions", "Lcom/avito/android/remote/model/text/AttributedText;", "messages", "", "title", "Lcom/avito/android/services_portfolio/generated/api/sx_project_get/SxProjectWithErrorModerationStatus$Type;", "type", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/services_portfolio/generated/api/sx_project_get/SxProjectWithErrorModerationStatus$Type;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/services_portfolio/generated/api/sx_project_get/SxProjectWithErrorModerationStatus$Type;", "d", "()Lcom/avito/android/services_portfolio/generated/api/sx_project_get/SxProjectWithErrorModerationStatus$Type;", "Type", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SxProjectWithErrorModerationStatus {

    @c("actions")
    @l
    private final List<C40486c> actions;

    @c("messages")
    @l
    private final List<AttributedText> messages;

    @c("title")
    @l
    private final String title;

    @c("type")
    @l
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SxProjectGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/services_portfolio/generated/api/sx_project_get/SxProjectWithErrorModerationStatus$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "APPROVED", "INPROGRESS", "REJECTED", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("APPROVED")
        public static final Type APPROVED;

        @c("IN_PROGRESS")
        public static final Type INPROGRESS;

        @c("REJECTED")
        public static final Type REJECTED;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f279989b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f279990c;

        static {
            Type type = new Type("APPROVED", 0, "APPROVED");
            APPROVED = type;
            Type type2 = new Type("INPROGRESS", 1, "IN_PROGRESS");
            INPROGRESS = type2;
            Type type3 = new Type("REJECTED", 2, "REJECTED");
            REJECTED = type3;
            Type[] typeArr = {type, type2, type3};
            f279989b = typeArr;
            f279990c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f279989b.clone();
        }
    }

    public SxProjectWithErrorModerationStatus(@l List<C40486c> list, @l List<AttributedText> list2, @l String str, @l Type type) {
        this.actions = list;
        this.messages = list2;
        this.title = str;
        this.type = type;
    }

    @l
    public final List<C40486c> a() {
        return this.actions;
    }

    @l
    public final List<AttributedText> b() {
        return this.messages;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
