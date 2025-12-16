package uh;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bbl.generated.api.api_3_bbl_configure.BblConfigureConfig;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3BblConfigureResponse.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Luh/a;", "", "", "Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfig;", "bblConfigureConfigs", "Luh/e;", "bblFooter", "Luh/j;", "image", "Luh/h;", "navbar", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Ljava/util/List;Luh/e;Luh/j;Luh/h;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Luh/e;", "b", "()Luh/e;", "Luh/j;", "c", "()Luh/j;", "Luh/h;", "d", "()Luh/h;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49058a {

    @com.google.gson.annotations.c("bblConfigureConfigs")
    @k
    private final List<BblConfigureConfig> bblConfigureConfigs;

    @com.google.gson.annotations.c("bblFooter")
    @k
    private final e bblFooter;

    @com.google.gson.annotations.c("image")
    @l
    private final j image;

    @com.google.gson.annotations.c("navbar")
    @l
    private final h navbar;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public C49058a(@k List<BblConfigureConfig> list, @k e eVar, @l j jVar, @l h hVar, @k AttributedText attributedText) {
        this.bblConfigureConfigs = list;
        this.bblFooter = eVar;
        this.image = jVar;
        this.navbar = hVar;
        this.title = attributedText;
    }

    @k
    public final List<BblConfigureConfig> a() {
        return this.bblConfigureConfigs;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final e getBblFooter() {
        return this.bblFooter;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final j getImage() {
        return this.image;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final h getNavbar() {
        return this.navbar;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
