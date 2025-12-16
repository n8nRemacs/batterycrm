package RA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiSellerAddressListResponse.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\b\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"LRA0/f;", "", "LRA0/g;", "button", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "isClosable", "isShowProgressBar", "", "title", "type", "<init>", "(LRA0/g;Lcom/avito/android/remote/model/text/AttributedText;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "LRA0/g;", "a", "()LRA0/g;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Z", "e", "()Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    @com.google.gson.annotations.c("button")
    @l
    private final g button;

    @com.google.gson.annotations.c("description")
    @k
    private final AttributedText description;

    @com.google.gson.annotations.c("isClosable")
    private final boolean isClosable;

    @com.google.gson.annotations.c("isShowProgressBar")
    @l
    private final Boolean isShowProgressBar;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("type")
    @k
    private final String type;

    public f(@l g gVar, @k AttributedText attributedText, boolean z12, @l Boolean bool, @k String str, @k String str2) {
        this.button = gVar;
        this.description = attributedText;
        this.isClosable = z12;
        this.isShowProgressBar = bool;
        this.title = str;
        this.type = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final g getButton() {
        return this.button;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsClosable() {
        return this.isClosable;
    }
}
