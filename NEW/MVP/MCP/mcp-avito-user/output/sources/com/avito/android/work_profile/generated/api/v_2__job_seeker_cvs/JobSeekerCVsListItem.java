package com.avito.android.work_profile.generated.api.v_2__job_seeker_cvs;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: V2JobSeekerCvsResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/work_profile/generated/api/v_2__job_seeker_cvs/JobSeekerCVsListItem;", "", "Lcom/avito/android/work_profile/generated/api/v_2__job_seeker_cvs/JobSeekerCVsListItem$Type;", "type", "LeQ0/c;", "value", "<init>", "(Lcom/avito/android/work_profile/generated/api/v_2__job_seeker_cvs/JobSeekerCVsListItem$Type;LeQ0/c;)V", "Lcom/avito/android/work_profile/generated/api/v_2__job_seeker_cvs/JobSeekerCVsListItem$Type;", "a", "()Lcom/avito/android/work_profile/generated/api/v_2__job_seeker_cvs/JobSeekerCVsListItem$Type;", "LeQ0/c;", "b", "()LeQ0/c;", "Type", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JobSeekerCVsListItem {

    @c("type")
    @k
    private final Type type;

    @c("value")
    @k
    private final eQ0.c value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: V2JobSeekerCvsResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/work_profile/generated/api/v_2__job_seeker_cvs/JobSeekerCVsListItem$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Cv", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: Cv, reason: collision with root package name */
        @c("cv")
        public static final Type f330690Cv;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f330691b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f330692c;

        static {
            Type type = new Type("Cv", 0, "cv");
            f330690Cv = type;
            Type[] typeArr = {type};
            f330691b = typeArr;
            f330692c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f330691b.clone();
        }
    }

    public JobSeekerCVsListItem(@k Type type, @k eQ0.c cVar) {
        this.type = type;
        this.value = cVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final eQ0.c getValue() {
        return this.value;
    }
}
