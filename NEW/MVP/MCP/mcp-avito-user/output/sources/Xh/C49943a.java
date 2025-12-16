package xh;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bbl.remote.model.BblConfigureConfigWidth;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: BblConfigureResult.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lxh/a;", "", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/bbl/remote/model/BblConfigureConfigWidth;", "width", "", "isSelected", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "delta", "<init>", "(JLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/bbl/remote/model/BblConfigureConfigWidth;ZLcom/avito/android/mnz_common/data/MnzFloatingFooterContact;)V", "J", "b", "()J", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/bbl/remote/model/BblConfigureConfigWidth;", "getWidth", "()Lcom/avito/android/bbl/remote/model/BblConfigureConfigWidth;", "Z", "d", "()Z", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "a", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49943a {

    @c("bblDelta")
    @k
    private final MnzFloatingFooterContact delta;

    @c("id")
    private final long id;

    @c("image")
    @l
    private final UniversalImage image;

    @c("isSelected")
    private final boolean isSelected;

    @c("text")
    @k
    private final AttributedText text;

    @c("width")
    @l
    private final BblConfigureConfigWidth width;

    public C49943a(long j12, @k AttributedText attributedText, @l UniversalImage universalImage, @l BblConfigureConfigWidth bblConfigureConfigWidth, boolean z12, @k MnzFloatingFooterContact mnzFloatingFooterContact) {
        this.id = j12;
        this.text = attributedText;
        this.image = universalImage;
        this.width = bblConfigureConfigWidth;
        this.isSelected = z12;
        this.delta = mnzFloatingFooterContact;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final MnzFloatingFooterContact getDelta() {
        return this.delta;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }
}
