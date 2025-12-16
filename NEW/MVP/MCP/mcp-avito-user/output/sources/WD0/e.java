package wD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SettingResult.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"LwD0/e;", "", "", "headerTitle", "title", "description", "Lcom/avito/android/remote/model/ButtonAction;", "button", "", "LwD0/c;", "packages", "LwD0/d;", "totalInfo", "configureContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ButtonAction;Ljava/util/List;LwD0/d;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "f", "c", "Lcom/avito/android/remote/model/ButtonAction;", "a", "()Lcom/avito/android/remote/model/ButtonAction;", "Ljava/util/List;", "e", "()Ljava/util/List;", "LwD0/d;", "g", "()LwD0/d;", "b", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    @com.google.gson.annotations.c("button")
    @l
    private final ButtonAction button;

    @com.google.gson.annotations.c("context")
    @l
    private final String configureContext;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("headerTitle")
    @k
    private final String headerTitle;

    @com.google.gson.annotations.c("lfs")
    @l
    private final List<C49489c> packages;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("totalInfo")
    @l
    private final d totalInfo;

    public e(@k String str, @k String str2, @l String str3, @l ButtonAction buttonAction, @l List<C49489c> list, @l d dVar, @l String str4) {
        this.headerTitle = str;
        this.title = str2;
        this.description = str3;
        this.button = buttonAction;
        this.packages = list;
        this.totalInfo = dVar;
        this.configureContext = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getConfigureContext() {
        return this.configureContext;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    @l
    public final List<C49489c> e() {
        return this.packages;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final d getTotalInfo() {
        return this.totalInfo;
    }
}
