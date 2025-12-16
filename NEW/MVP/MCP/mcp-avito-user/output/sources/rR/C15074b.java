package Rr;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateActivateBulkAppV2Response.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"LRr/b;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LRr/c;", "fbsFee", "LRr/e;", "fee", "Lcom/avito/android/remote/model/Image;", "image", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LRr/c;LRr/e;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "LRr/c;", "b", "()LRr/c;", "LRr/e;", "c", "()LRr/e;", "Lcom/avito/android/remote/model/Image;", "d", "()Lcom/avito/android/remote/model/Image;", "e", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15074b {

    @com.google.gson.annotations.c("description")
    @k
    private final AttributedText description;

    @com.google.gson.annotations.c("fbsFee")
    @l
    private final c fbsFee;

    @com.google.gson.annotations.c("fee")
    @l
    private final e fee;

    @com.google.gson.annotations.c("image")
    @k
    private final Image image;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public C15074b(@k AttributedText attributedText, @l c cVar, @l e eVar, @k Image image, @k AttributedText attributedText2) {
        this.description = attributedText;
        this.fbsFee = cVar;
        this.fee = eVar;
        this.image = image;
        this.title = attributedText2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final c getFbsFee() {
        return this.fbsFee;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final e getFee() {
        return this.fee;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
