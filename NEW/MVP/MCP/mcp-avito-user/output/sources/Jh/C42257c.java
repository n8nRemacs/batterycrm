package jH;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetMedicalUploadInfoApiResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"LjH/c;", "", "", "LjH/b;", "documents", "", "hintUri", "", "required", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "c", "()Z", "d", "_avito_gig_upload-doc_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jH.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C42257c {

    @com.google.gson.annotations.c("documents")
    @k
    private final List<C42256b> documents;

    @com.google.gson.annotations.c("hintUri")
    @l
    private final String hintUri;

    @com.google.gson.annotations.c("required")
    private final boolean required;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public C42257c(@k List<C42256b> list, @l String str, boolean z12, @l String str2) {
        this.documents = list;
        this.hintUri = str;
        this.required = z12;
        this.title = str2;
    }

    @k
    public final List<C42256b> a() {
        return this.documents;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getHintUri() {
        return this.hintUri;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
