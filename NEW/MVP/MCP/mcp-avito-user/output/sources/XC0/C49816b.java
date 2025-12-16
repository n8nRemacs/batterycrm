package xC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiTariffCptLevelsV4Response.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LxC0/b;", "", "LxC0/h;", "disabledIcon", "LxC0/g;", "icon", "", "LxC0/d;", "levels", "", "name", "<init>", "(LxC0/h;LxC0/g;Ljava/util/List;Ljava/lang/String;)V", "LxC0/h;", "a", "()LxC0/h;", "LxC0/g;", "b", "()LxC0/g;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xC0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49816b {

    @com.google.gson.annotations.c("disabledIcon")
    @l
    private final h disabledIcon;

    @com.google.gson.annotations.c("icon")
    @k
    private final g icon;

    @com.google.gson.annotations.c("levels")
    @k
    private final List<d> levels;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    public C49816b(@l h hVar, @k g gVar, @k List<d> list, @k String str) {
        this.disabledIcon = hVar;
        this.icon = gVar;
        this.levels = list;
        this.name = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final h getDisabledIcon() {
        return this.disabledIcon;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final g getIcon() {
        return this.icon;
    }

    @k
    public final List<d> c() {
        return this.levels;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }
}
