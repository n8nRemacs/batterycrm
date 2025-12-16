package vC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiTariffCptConfigureLevelsV2Response.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001b"}, d2 = {"LvC0/g;", "", "LvC0/a;", "button", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "LvC0/e;", "levels", "LvC0/c;", "navbar", "title", "<init>", "(LvC0/a;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;LvC0/c;Lcom/avito/android/remote/model/text/AttributedText;)V", "LvC0/a;", "a", "()LvC0/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "c", "()Ljava/util/List;", "LvC0/c;", "d", "()LvC0/c;", "e", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    @com.google.gson.annotations.c("button")
    @k
    private final C49193a button;

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("levels")
    @k
    private final List<e> levels;

    @com.google.gson.annotations.c("navbar")
    @l
    private final C49195c navbar;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public g(@k C49193a c49193a, @l AttributedText attributedText, @k List<e> list, @l C49195c c49195c, @k AttributedText attributedText2) {
        this.button = c49193a;
        this.description = attributedText;
        this.levels = list;
        this.navbar = c49195c;
        this.title = attributedText2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C49193a getButton() {
        return this.button;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final List<e> c() {
        return this.levels;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C49195c getNavbar() {
        return this.navbar;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
