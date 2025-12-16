package Op;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: AgentRoomGetSoldFormApiResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LOp/a;", "", "LOp/h;", "layout", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(LOp/h;Lcom/avito/android/remote/model/text/AttributedText;)V", "LOp/h;", "a", "()LOp/h;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Op.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14722a {

    @com.google.gson.annotations.c("layout")
    @k
    private final h layout;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public C14722a(@k h hVar, @k AttributedText attributedText) {
        this.layout = hVar;
        this.title = attributedText;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final h getLayout() {
        return this.layout;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
