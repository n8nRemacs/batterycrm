package Pl0;

import Y61.l;
import kotlin.Metadata;

/* compiled from: GetPartCompatibilitiesApiV4Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LPl0/e;", "", "LPl0/c;", "carCompatibility", "LPl0/d;", "otherCompatibility", "<init>", "(LPl0/c;LPl0/d;)V", "LPl0/c;", "a", "()LPl0/c;", "LPl0/d;", "b", "()LPl0/d;", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    @com.google.gson.annotations.c("carCompatibility")
    @l
    private final C14805c carCompatibility;

    @com.google.gson.annotations.c("otherCompatibility")
    @l
    private final d otherCompatibility;

    public e(@l C14805c c14805c, @l d dVar) {
        this.carCompatibility = c14805c;
        this.otherCompatibility = dVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C14805c getCarCompatibility() {
        return this.carCompatibility;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final d getOtherCompatibility() {
        return this.otherCompatibility;
    }
}
