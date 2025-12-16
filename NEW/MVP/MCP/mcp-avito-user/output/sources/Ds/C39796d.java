package ds;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api3CpaCjmCpxPromoGetDataGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lds/d;", "", "Lds/e;", "icon", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lds/e;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lds/e;", "a", "()Lds/e;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ds.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39796d {

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final C39797e icon;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final AttributedText text;

    public C39796d(@Y61.l C39797e c39797e, @Y61.k AttributedText attributedText) {
        this.icon = c39797e;
        this.text = attributedText;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C39797e getIcon() {
        return this.icon;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }
}
