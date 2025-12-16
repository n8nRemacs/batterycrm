package uG0;

import Y61.l;
import com.avito.android.beduin_models.BeduinModel;
import java.util.List;
import kotlin.Metadata;

/* compiled from: UniversalMapPointInfo.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"LuG0/c;", "", "", "topFormId", "mainFormId", "bottomFormId", "", "Lcom/avito/android/beduin_models/BeduinModel;", "topComponents", "mainComponents", "bottomComponents", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "d", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "a", "_avito-discouraged_avito-api_universal-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uG0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48897c {

    @com.google.gson.annotations.c("bottomComponents")
    @l
    private final List<BeduinModel> bottomComponents;

    @com.google.gson.annotations.c("bottomFormId")
    @l
    private final String bottomFormId;

    @com.google.gson.annotations.c("mainComponents")
    @l
    private final List<BeduinModel> mainComponents;

    @com.google.gson.annotations.c("mainFormId")
    @l
    private final String mainFormId;

    @com.google.gson.annotations.c("topComponents")
    @l
    private final List<BeduinModel> topComponents;

    @com.google.gson.annotations.c("topFormId")
    @l
    private final String topFormId;

    /* JADX WARN: Multi-variable type inference failed */
    public C48897c(@l String str, @l String str2, @l String str3, @l List<? extends BeduinModel> list, @l List<? extends BeduinModel> list2, @l List<? extends BeduinModel> list3) {
        this.topFormId = str;
        this.mainFormId = str2;
        this.bottomFormId = str3;
        this.topComponents = list;
        this.mainComponents = list2;
        this.bottomComponents = list3;
    }

    @l
    public final List<BeduinModel> a() {
        return this.bottomComponents;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    @l
    public final List<BeduinModel> c() {
        return this.mainComponents;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getMainFormId() {
        return this.mainFormId;
    }

    @l
    public final List<BeduinModel> e() {
        return this.topComponents;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getTopFormId() {
        return this.topFormId;
    }
}
