package Bj0;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: GetStepOrderV4Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LBj0/a;", "", "", "isChecked", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(ZLcom/avito/android/remote/model/text/AttributedText;)V", "Z", "b", "()Z", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C13156a {

    @com.google.gson.annotations.c("isChecked")
    private final boolean isChecked;

    @com.google.gson.annotations.c("text")
    @k
    private final AttributedText text;

    public C13156a(boolean z12, @k AttributedText attributedText) {
        this.isChecked = z12;
        this.text = attributedText;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }
}
