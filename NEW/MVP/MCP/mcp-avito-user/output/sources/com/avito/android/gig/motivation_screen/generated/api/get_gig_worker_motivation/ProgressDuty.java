package com.avito.android.gig.motivation_screen.generated.api.get_gig_worker_motivation;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetGigWorkerMotivationResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/gig/motivation_screen/generated/api/get_gig_worker_motivation/ProgressDuty;", "", "", "title", "Lcom/avito/android/gig/motivation_screen/generated/api/get_gig_worker_motivation/ProgressDuty$Type;", "type", "<init>", "(Ljava/lang/String;Lcom/avito/android/gig/motivation_screen/generated/api/get_gig_worker_motivation/ProgressDuty$Type;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/gig/motivation_screen/generated/api/get_gig_worker_motivation/ProgressDuty$Type;", "b", "()Lcom/avito/android/gig/motivation_screen/generated/api/get_gig_worker_motivation/ProgressDuty$Type;", "Type", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProgressDuty {

    @c("title")
    @l
    private final String title;

    @c("type")
    @l
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetGigWorkerMotivationResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/gig/motivation_screen/generated/api/get_gig_worker_motivation/ProgressDuty$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Locked", "InProgress", "Completed", "Finished", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("completed")
        public static final Type Completed;

        @c("finished")
        public static final Type Finished;

        @c("inProgress")
        public static final Type InProgress;

        @c("locked")
        public static final Type Locked;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f159433b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f159434c;

        static {
            Type type = new Type("Locked", 0, "locked");
            Locked = type;
            Type type2 = new Type("InProgress", 1, "inProgress");
            InProgress = type2;
            Type type3 = new Type("Completed", 2, "completed");
            Completed = type3;
            Type type4 = new Type("Finished", 3, "finished");
            Finished = type4;
            Type[] typeArr = {type, type2, type3, type4};
            f159433b = typeArr;
            f159434c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f159433b.clone();
        }
    }

    public ProgressDuty(@l String str, @l Type type) {
        this.title = str;
        this.type = type;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
