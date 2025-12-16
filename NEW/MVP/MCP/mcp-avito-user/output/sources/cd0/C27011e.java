package cD0;

import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Period.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b.\u0010'R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b/\u0010$R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"LcD0/e;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "periodTitle", "", "isSelected", "hasRedBadge", "", "LcD0/b;", "infoList", "", "tariffTitle", "LcD0/g;", "description", "LcD0/o;", "prolongation", "packagesTitle", "LcD0/d;", "packagesList", "LcD0/c;", "managerCallInfo", "Lcom/avito/android/remote/model/ButtonAction;", "editButton", "LcD0/q;", "tariffUpsellInfo", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;ZZLjava/util/List;Ljava/lang/String;LcD0/g;LcD0/o;Ljava/lang/String;Ljava/util/List;LcD0/c;Lcom/avito/android/remote/model/ButtonAction;LcD0/q;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "h", "()Lcom/avito/android/remote/model/text/AttributedText;", "Z", "l", "()Z", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "LcD0/g;", "a", "()LcD0/g;", "LcD0/o;", "i", "()LcD0/o;", "g", "f", "LcD0/c;", "e", "()LcD0/c;", "Lcom/avito/android/remote/model/ButtonAction;", "b", "()Lcom/avito/android/remote/model/ButtonAction;", "LcD0/q;", "k", "()LcD0/q;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cD0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C27011e {

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final C27013g description;

    @com.google.gson.annotations.c("editButton")
    @Y61.l
    private final ButtonAction editButton;

    @com.google.gson.annotations.c("hasRedBadge")
    private final boolean hasRedBadge;

    @com.google.gson.annotations.c("infoList")
    @Y61.k
    private final List<C27008b> infoList;

    @com.google.gson.annotations.c("isSelected")
    private final boolean isSelected;

    @com.google.gson.annotations.c("managerCallInfo")
    @Y61.l
    private final C27009c managerCallInfo;

    @com.google.gson.annotations.c("packages")
    @Y61.k
    private final List<InterfaceC27010d> packagesList;

    @com.google.gson.annotations.c("packagesTitle")
    @Y61.k
    private final String packagesTitle;

    @com.google.gson.annotations.c("periodTitle")
    @Y61.k
    private final AttributedText periodTitle;

    @com.google.gson.annotations.c("prolongation")
    @Y61.l
    private final C27021o prolongation;

    @com.google.gson.annotations.c("tariffTitle")
    @Y61.l
    private final String tariffTitle;

    @com.google.gson.annotations.c("level")
    @Y61.l
    private final C27023q tariffUpsellInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public C27011e(@Y61.k AttributedText attributedText, boolean z12, boolean z13, @Y61.k List<C27008b> list, @Y61.l String str, @Y61.l C27013g c27013g, @Y61.l C27021o c27021o, @Y61.k String str2, @Y61.k List<? extends InterfaceC27010d> list2, @Y61.l C27009c c27009c, @Y61.l ButtonAction buttonAction, @Y61.l C27023q c27023q) {
        this.periodTitle = attributedText;
        this.isSelected = z12;
        this.hasRedBadge = z13;
        this.infoList = list;
        this.tariffTitle = str;
        this.description = c27013g;
        this.prolongation = c27021o;
        this.packagesTitle = str2;
        this.packagesList = list2;
        this.managerCallInfo = c27009c;
        this.editButton = buttonAction;
        this.tariffUpsellInfo = c27023q;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C27013g getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final ButtonAction getEditButton() {
        return this.editButton;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getHasRedBadge() {
        return this.hasRedBadge;
    }

    @Y61.k
    public final List<C27008b> d() {
        return this.infoList;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final C27009c getManagerCallInfo() {
        return this.managerCallInfo;
    }

    @Y61.k
    public final List<InterfaceC27010d> f() {
        return this.packagesList;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getPackagesTitle() {
        return this.packagesTitle;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final AttributedText getPeriodTitle() {
        return this.periodTitle;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final C27021o getProlongation() {
        return this.prolongation;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final String getTariffTitle() {
        return this.tariffTitle;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final C27023q getTariffUpsellInfo() {
        return this.tariffUpsellInfo;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }
}
