package xh;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import uZ.d;

/* compiled from: BblConfigureResult.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lxh/b;", "", "LuZ/d;", "navBar", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "Lxh/a;", "configs", "Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "bblFooter", "<init>", "(LuZ/d;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Lcom/avito/android/mnz_common/data/MnzFloatingFooter;)V", "LuZ/d;", "d", "()LuZ/d;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/UniversalImage;", "c", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "a", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooter;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xh.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49944b {

    @c("bblFooter")
    @k
    private final MnzFloatingFooter bblFooter;

    @c("configs")
    @k
    private final List<C49943a> configs;

    @c("image")
    @l
    private final UniversalImage image;

    @c("navbar")
    @l
    private final d navBar;

    @c("title")
    @k
    private final AttributedText title;

    public C49944b(@l d dVar, @k AttributedText attributedText, @l UniversalImage universalImage, @k List<C49943a> list, @k MnzFloatingFooter mnzFloatingFooter) {
        this.navBar = dVar;
        this.title = attributedText;
        this.image = universalImage;
        this.configs = list;
        this.bblFooter = mnzFloatingFooter;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final MnzFloatingFooter getBblFooter() {
        return this.bblFooter;
    }

    @k
    public final List<C49943a> b() {
        return this.configs;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final d getNavBar() {
        return this.navBar;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
