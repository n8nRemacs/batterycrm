package Ol0;

import Y61.l;
import kotlin.Metadata;

/* compiled from: GetPartCompatibilitiesApiV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LOl0/d;", "", "LOl0/b;", "carCompatibility", "LOl0/c;", "otherCompatibility", "<init>", "(LOl0/b;LOl0/c;)V", "LOl0/b;", "a", "()LOl0/b;", "LOl0/c;", "b", "()LOl0/c;", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {

    @com.google.gson.annotations.c("carCompatibility")
    @l
    private final b carCompatibility;

    @com.google.gson.annotations.c("otherCompatibility")
    @l
    private final c otherCompatibility;

    public d(@l b bVar, @l c cVar) {
        this.carCompatibility = bVar;
        this.otherCompatibility = cVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final b getCarCompatibility() {
        return this.carCompatibility;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final c getOtherCompatibility() {
        return this.otherCompatibility;
    }
}
