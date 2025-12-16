package RX;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.file_uploader.ValidationRule;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1MandatoryVerificationPostResponse.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b \u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b\u000e\u0010'R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b.\u0010\u001aR\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b/\u0010\u001aR\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b0\u0010\u001a¨\u00061"}, d2 = {"LRX/i;", "", "", "actionDescription", "actionTitle", "LRX/f;", "button", "deletePath", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "fileErrorMessage", "fileRequiredMessage", "fileSizeExceedMessage", "", "isComplete", "", ValidationRule.MAX_FILE_SIZE_RULE, "", "mimeTypes", "title", "titleFileUploaded", "uploadPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;LRX/f;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "LRX/f;", "c", "()LRX/f;", "d", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "f", "g", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "J", "i", "()J", "Ljava/util/List;", "j", "()Ljava/util/List;", "k", "l", "m", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {

    @com.google.gson.annotations.c("actionDescription")
    @k
    private final String actionDescription;

    @com.google.gson.annotations.c("actionTitle")
    @k
    private final String actionTitle;

    @com.google.gson.annotations.c("button")
    @l
    private final f button;

    @com.google.gson.annotations.c("deletePath")
    @k
    private final String deletePath;

    @com.google.gson.annotations.c("description")
    @k
    private final AttributedText description;

    @com.google.gson.annotations.c("fileErrorMessage")
    @k
    private final String fileErrorMessage;

    @com.google.gson.annotations.c("fileRequiredMessage")
    @k
    private final String fileRequiredMessage;

    @com.google.gson.annotations.c("fileSizeExceedMessage")
    @k
    private final String fileSizeExceedMessage;

    @com.google.gson.annotations.c("isComplete")
    @l
    private final Boolean isComplete;

    @com.google.gson.annotations.c(ValidationRule.MAX_FILE_SIZE_RULE)
    private final long maxFileSize;

    @com.google.gson.annotations.c("mimeTypes")
    @l
    private final List<String> mimeTypes;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("titleFileUploaded")
    @k
    private final String titleFileUploaded;

    @com.google.gson.annotations.c("uploadPath")
    @k
    private final String uploadPath;

    public i(@k String str, @k String str2, @l f fVar, @k String str3, @k AttributedText attributedText, @k String str4, @k String str5, @k String str6, @l Boolean bool, long j12, @l List<String> list, @k String str7, @k String str8, @k String str9) {
        this.actionDescription = str;
        this.actionTitle = str2;
        this.button = fVar;
        this.deletePath = str3;
        this.description = attributedText;
        this.fileErrorMessage = str4;
        this.fileRequiredMessage = str5;
        this.fileSizeExceedMessage = str6;
        this.isComplete = bool;
        this.maxFileSize = j12;
        this.mimeTypes = list;
        this.title = str7;
        this.titleFileUploaded = str8;
        this.uploadPath = str9;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getActionDescription() {
        return this.actionDescription;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final f getButton() {
        return this.button;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getDeletePath() {
        return this.deletePath;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getFileErrorMessage() {
        return this.fileErrorMessage;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getFileRequiredMessage() {
        return this.fileRequiredMessage;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getFileSizeExceedMessage() {
        return this.fileSizeExceedMessage;
    }

    /* renamed from: i, reason: from getter */
    public final long getMaxFileSize() {
        return this.maxFileSize;
    }

    @l
    public final List<String> j() {
        return this.mimeTypes;
    }

    @k
    /* renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: l, reason: from getter */
    public final String getTitleFileUploaded() {
        return this.titleFileUploaded;
    }

    @k
    /* renamed from: m, reason: from getter */
    public final String getUploadPath() {
        return this.uploadPath;
    }
}
