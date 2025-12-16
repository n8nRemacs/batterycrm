package jH;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetMedicalUploadInfoApiResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"LjH/a;", "", "", "Lcom/avito/android/remote/model/text/AttributedText;", "conditions", "", "confirmButtonText", "description", "LjH/c;", "sections", "Lcom/avito/android/deep_linking/links/DeepLink;", "supportDeeplink", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "f", "_avito_gig_upload-doc_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jH.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C42255a {

    @com.google.gson.annotations.c("conditions")
    @k
    private final List<AttributedText> conditions;

    @com.google.gson.annotations.c("confirmButtonText")
    @k
    private final String confirmButtonText;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("sections")
    @k
    private final List<C42257c> sections;

    @com.google.gson.annotations.c("supportDeeplink")
    @l
    private final DeepLink supportDeeplink;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C42255a(@k List<AttributedText> list, @k String str, @l String str2, @k List<C42257c> list2, @l DeepLink deepLink, @k String str3) {
        this.conditions = list;
        this.confirmButtonText = str;
        this.description = str2;
        this.sections = list2;
        this.supportDeeplink = deepLink;
        this.title = str3;
    }

    @k
    public final List<AttributedText> a() {
        return this.conditions;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getConfirmButtonText() {
        return this.confirmButtonText;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    public final List<C42257c> d() {
        return this.sections;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DeepLink getSupportDeeplink() {
        return this.supportDeeplink;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
