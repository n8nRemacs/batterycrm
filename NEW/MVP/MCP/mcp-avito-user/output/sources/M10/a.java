package M10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalApplicationPreviewGetResponse.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LM10/a;", "", "LM10/b;", "action", "LM10/c;", "archived", "LM10/d;", "header", "LM10/e;", "withCalculation", "LM10/f;", "withoutCalculation", "<init>", "(LM10/b;LM10/c;LM10/d;LM10/e;LM10/f;)V", "LM10/b;", "a", "()LM10/b;", "LM10/c;", "b", "()LM10/c;", "LM10/d;", "c", "()LM10/d;", "LM10/e;", "d", "()LM10/e;", "LM10/f;", "e", "()LM10/f;", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    @com.google.gson.annotations.c("action")
    @k
    private final b action;

    @com.google.gson.annotations.c("archived")
    @l
    private final c archived;

    @com.google.gson.annotations.c("header")
    @k
    private final d header;

    @com.google.gson.annotations.c("withCalculation")
    @l
    private final e withCalculation;

    @com.google.gson.annotations.c("withoutCalculation")
    @l
    private final f withoutCalculation;

    public a(@k b bVar, @l c cVar, @k d dVar, @l e eVar, @l f fVar) {
        this.action = bVar;
        this.archived = cVar;
        this.header = dVar;
        this.withCalculation = eVar;
        this.withoutCalculation = fVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final b getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final c getArchived() {
        return this.archived;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final d getHeader() {
        return this.header;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final e getWithCalculation() {
        return this.withCalculation;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final f getWithoutCalculation() {
        return this.withoutCalculation;
    }
}
