package XB0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DetailsSheetButton;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DetailsSheetResult.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LXB0/a;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/deep_linking/links/DetailsSheetButton;", "button", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DetailsSheetButton;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/DetailsSheetButton;", "a", "()Lcom/avito/android/deep_linking/links/DetailsSheetButton;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    @com.google.gson.annotations.c("button")
    @l
    private final DetailsSheetButton button;

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DetailsSheetButton getButton() {
        return this.button;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    public a(@l AttributedText attributedText, @l DetailsSheetButton detailsSheetButton) {
        this.description = attributedText;
        this.button = detailsSheetButton;
    }

    public /* synthetic */ a(AttributedText attributedText, DetailsSheetButton detailsSheetButton, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : attributedText, (i12 & 2) != 0 ? null : detailsSheetButton);
    }
}
