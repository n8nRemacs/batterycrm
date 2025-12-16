package com.avito.android.work_profile.generated.api.get_profile_applies_to_vacancy_v_2;

import Y61.k;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.google.gson.annotations.c;
import dQ0.q;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetProfileAppliesToVacancyV2Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/work_profile/generated/api/get_profile_applies_to_vacancy_v_2/ProfileApplyToVacancySnippetContactBarListItem;", "", "Lcom/avito/android/work_profile/generated/api/get_profile_applies_to_vacancy_v_2/ProfileApplyToVacancySnippetContactBarListItem$Type;", "type", "LdQ0/q;", "value", "<init>", "(Lcom/avito/android/work_profile/generated/api/get_profile_applies_to_vacancy_v_2/ProfileApplyToVacancySnippetContactBarListItem$Type;LdQ0/q;)V", "Lcom/avito/android/work_profile/generated/api/get_profile_applies_to_vacancy_v_2/ProfileApplyToVacancySnippetContactBarListItem$Type;", "a", "()Lcom/avito/android/work_profile/generated/api/get_profile_applies_to_vacancy_v_2/ProfileApplyToVacancySnippetContactBarListItem$Type;", "LdQ0/q;", "b", "()LdQ0/q;", "Type", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProfileApplyToVacancySnippetContactBarListItem {

    @c("type")
    @k
    private final Type type;

    @c("value")
    @k
    private final q value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetProfileAppliesToVacancyV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/work_profile/generated/api/get_profile_applies_to_vacancy_v_2/ProfileApplyToVacancySnippetContactBarListItem$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Messenger", "Phone", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c(NotificationsSettings.Section.SECTION_MESSENGER)
        public static final Type Messenger;

        @c("phone")
        public static final Type Phone;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Type[] f330687c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f330688d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f330689b;

        static {
            Type type = new Type("Messenger", 0, NotificationsSettings.Section.SECTION_MESSENGER);
            Messenger = type;
            Type type2 = new Type("Phone", 1, "phone");
            Phone = type2;
            Type[] typeArr = {type, type2};
            f330687c = typeArr;
            f330688d = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
            this.f330689b = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f330687c.clone();
        }
    }

    public ProfileApplyToVacancySnippetContactBarListItem(@k Type type, @k q qVar) {
        this.type = type;
        this.value = qVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final q getValue() {
        return this.value;
    }
}
