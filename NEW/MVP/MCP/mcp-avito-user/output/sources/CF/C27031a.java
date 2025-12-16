package cF;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: Api1FreemiumRulesResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LcF/a;", "", "", "buttonTitle", "LcF/b;", "contactCounter", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "title", "<init>", "(Ljava/lang/String;LcF/b;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LcF/b;", "b", "()LcF/b;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cF.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C27031a {

    @c("buttonTitle")
    @k
    private final String buttonTitle;

    @c("contactCounter")
    @k
    private final b contactCounter;

    @c("description")
    @k
    private final AttributedText description;

    @c("title")
    @k
    private final AttributedText title;

    public C27031a(@k String str, @k b bVar, @k AttributedText attributedText, @k AttributedText attributedText2) {
        this.buttonTitle = str;
        this.contactCounter = bVar;
        this.description = attributedText;
        this.title = attributedText2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final b getContactCounter() {
        return this.contactCounter;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
