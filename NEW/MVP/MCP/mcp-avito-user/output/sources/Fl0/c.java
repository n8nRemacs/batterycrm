package FL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Service.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LFL0/c;", "", "", "title", "", "selectedCount", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/Image;", "lightningIcon", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "delta", "<init>", "(Ljava/lang/String;ILcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "I", "d", "()I", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/Image;", "c", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "a", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    @com.google.gson.annotations.c("bblDelta")
    @l
    private final MnzFloatingFooterContact delta;

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("lightningIcon")
    @l
    private final Image lightningIcon;

    @com.google.gson.annotations.c("selectedCount")
    private final int selectedCount;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public c(@k String str, int i12, @l AttributedText attributedText, @l Image image, @l MnzFloatingFooterContact mnzFloatingFooterContact) {
        this.title = str;
        this.selectedCount = i12;
        this.description = attributedText;
        this.lightningIcon = image;
        this.delta = mnzFloatingFooterContact;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final MnzFloatingFooterContact getDelta() {
        return this.delta;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Image getLightningIcon() {
        return this.lightningIcon;
    }

    /* renamed from: d, reason: from getter */
    public final int getSelectedCount() {
        return this.selectedCount;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
