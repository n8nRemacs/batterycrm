package v30;

import Y61.k;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiNewCarsFilterModelsResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lv30/b;", "", "", "id", "", "label", "", "Lv30/c;", "options", "<init>", "(JLjava/lang/String;Ljava/util/List;)V", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_new-cars-mark-model-filter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v30.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49156b {

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("label")
    @k
    private final String label;

    @com.google.gson.annotations.c("options")
    @k
    private final List<C49157c> options;

    public C49156b(long j12, @k String str, @k List<C49157c> list) {
        this.id = j12;
        this.label = str;
        this.options = list;
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @k
    public final List<C49157c> c() {
        return this.options;
    }
}
