package di0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1NdTrxDevelopmentsByDevelopmentIdBuildingsGetResponse.kt */
@P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b!\u0010\u0014R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Ldi0/b;", "", "", "completedDate", "Ldi0/c;", "genPlanCenter", "", "id", "", "isCheckerboardAvailable", "Ldi0/d;", "mapCoords", "name", "", "Ldi0/e;", "sections", "<init>", "(Ljava/lang/String;Ldi0/c;JZLdi0/d;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ldi0/c;", "b", "()Ldi0/c;", "J", "c", "()J", "Z", "g", "()Z", "Ldi0/d;", "d", "()Ldi0/d;", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: di0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C39732b {

    @com.google.gson.annotations.c("completedDate")
    @k
    private final String completedDate;

    @com.google.gson.annotations.c("genPlanCenter")
    @l
    private final C39733c genPlanCenter;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("isCheckerboardAvailable")
    private final boolean isCheckerboardAvailable;

    @com.google.gson.annotations.c("mapCoords")
    @k
    private final C39734d mapCoords;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("sections")
    @k
    private final List<C39735e> sections;

    public C39732b(@k String str, @l C39733c c39733c, long j12, boolean z12, @k C39734d c39734d, @k String str2, @k List<C39735e> list) {
        this.completedDate = str;
        this.genPlanCenter = c39733c;
        this.id = j12;
        this.isCheckerboardAvailable = z12;
        this.mapCoords = c39734d;
        this.name = str2;
        this.sections = list;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getCompletedDate() {
        return this.completedDate;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C39733c getGenPlanCenter() {
        return this.genPlanCenter;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final C39734d getMapCoords() {
        return this.mapCoords;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    public final List<C39735e> f() {
        return this.sections;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsCheckerboardAvailable() {
        return this.isCheckerboardAvailable;
    }
}
