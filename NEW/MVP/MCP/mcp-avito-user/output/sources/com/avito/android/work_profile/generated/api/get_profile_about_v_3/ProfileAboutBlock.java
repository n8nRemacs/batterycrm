package com.avito.android.work_profile.generated.api.get_profile_about_v_3;

import Y61.k;
import Y61.l;
import cQ0.C27085a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetProfileAboutV3Response.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u0015B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/ProfileAboutBlock;", "", "LcQ0/a;", "action", "", "subtitle", "title", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/ProfileAboutBlock$Type;", "type", "<init>", "(LcQ0/a;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/ProfileAboutBlock$Type;)V", "LcQ0/a;", "a", "()LcQ0/a;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/ProfileAboutBlock$Type;", "d", "()Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/ProfileAboutBlock$Type;", "Type", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProfileAboutBlock {

    @c("action")
    @l
    private final C27085a action;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetProfileAboutV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/ProfileAboutBlock$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Payment", "Personal", "Slots", "Motivations", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("motivations")
        public static final Type Motivations;

        @c("payment")
        public static final Type Payment;

        @c("personal")
        public static final Type Personal;

        @c("slots")
        public static final Type Slots;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f330679b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f330680c;

        static {
            Type type = new Type("Payment", 0, "payment");
            Payment = type;
            Type type2 = new Type("Personal", 1, "personal");
            Personal = type2;
            Type type3 = new Type("Slots", 2, "slots");
            Slots = type3;
            Type type4 = new Type("Motivations", 3, "motivations");
            Motivations = type4;
            Type[] typeArr = {type, type2, type3, type4};
            f330679b = typeArr;
            f330680c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f330679b.clone();
        }
    }

    public ProfileAboutBlock(@l C27085a c27085a, @l String str, @k String str2, @k Type type) {
        this.action = c27085a;
        this.subtitle = str;
        this.title = str2;
        this.type = type;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C27085a getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
