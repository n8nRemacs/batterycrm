package vh;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api4BblConfigureResponse.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lvh/a;", "", "", "Lvh/c;", "bblConfigureConfigs", "Lvh/h;", "bblFooter", "Lvh/l;", "navbar", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Ljava/util/List;Lvh/h;Lvh/l;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lvh/h;", "b", "()Lvh/h;", "Lvh/l;", "c", "()Lvh/l;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49328a {

    @com.google.gson.annotations.c("bblConfigureConfigs")
    @Y61.k
    private final List<C49330c> bblConfigureConfigs;

    @com.google.gson.annotations.c("bblFooter")
    @Y61.k
    private final h bblFooter;

    @com.google.gson.annotations.c("navbar")
    @Y61.l
    private final l navbar;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public C49328a(@Y61.k List<C49330c> list, @Y61.k h hVar, @Y61.l l lVar, @Y61.k AttributedText attributedText) {
        this.bblConfigureConfigs = list;
        this.bblFooter = hVar;
        this.navbar = lVar;
        this.title = attributedText;
    }

    @Y61.k
    public final List<C49330c> a() {
        return this.bblConfigureConfigs;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final h getBblFooter() {
        return this.bblFooter;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final l getNavbar() {
        return this.navbar;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
