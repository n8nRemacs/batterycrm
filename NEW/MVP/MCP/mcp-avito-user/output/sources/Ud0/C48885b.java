package uD0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qD0.C47283a;
import vD0.C49197a;

/* compiled from: ConfigureLocationsResult.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LuD0/b;", "", "LuD0/a;", "badges", "Lcom/avito/android/remote/model/ButtonAction;", "button", "", "LvD0/a;", "list", "", "title", "LqD0/a;", "alertInfo", "<init>", "(LuD0/a;Lcom/avito/android/remote/model/ButtonAction;Ljava/util/List;Ljava/lang/String;LqD0/a;)V", "LuD0/a;", "b", "()LuD0/a;", "Lcom/avito/android/remote/model/ButtonAction;", "c", "()Lcom/avito/android/remote/model/ButtonAction;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "LqD0/a;", "a", "()LqD0/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uD0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48885b {

    @c("alertInfo")
    @k
    private final C47283a alertInfo;

    @c("badges")
    @k
    private final C48884a badges;

    @c("button")
    @k
    private final ButtonAction button;

    @c("list")
    @k
    private final List<C49197a> list;

    @c("title")
    @k
    private final String title;

    public C48885b(@k C48884a c48884a, @k ButtonAction buttonAction, @k List<C49197a> list, @k String str, @k C47283a c47283a) {
        this.badges = c48884a;
        this.button = buttonAction;
        this.list = list;
        this.title = str;
        this.alertInfo = c47283a;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C47283a getAlertInfo() {
        return this.alertInfo;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C48884a getBadges() {
        return this.badges;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @k
    public final List<C49197a> d() {
        return this.list;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48885b)) {
            return false;
        }
        C48885b c48885b = (C48885b) obj;
        return L.f(this.badges, c48885b.badges) && L.f(this.button, c48885b.button) && L.f(this.list, c48885b.list) && L.f(this.title, c48885b.title) && L.f(this.alertInfo, c48885b.alertInfo);
    }

    public final int hashCode() {
        return this.alertInfo.hashCode() + H.d(H.e((this.button.hashCode() + (this.badges.hashCode() * 31)) * 31, 31, this.list), 31, this.title);
    }

    @k
    public final String toString() {
        return "ConfigureLocationsResult(badges=" + this.badges + ", button=" + this.button + ", list=" + this.list + ", title=" + this.title + ", alertInfo=" + this.alertInfo + ')';
    }
}
