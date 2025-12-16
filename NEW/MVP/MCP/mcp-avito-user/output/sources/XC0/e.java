package xC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiTariffCptLevelsV4Response.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LxC0/e;", "", "LxC0/a;", "button", "Lcom/avito/android/remote/model/text/AttributedText;", "extraInfo", "", "id", "", "isSelected", "", "name", "<init>", "(LxC0/a;Lcom/avito/android/remote/model/text/AttributedText;JZLjava/lang/String;)V", "LxC0/a;", "a", "()LxC0/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "J", "c", "()J", "Z", "e", "()Z", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    @com.google.gson.annotations.c("button")
    @k
    private final C49815a button;

    @com.google.gson.annotations.c("extraInfo")
    @l
    private final AttributedText extraInfo;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("isSelected")
    private final boolean isSelected;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    public e(@k C49815a c49815a, @l AttributedText attributedText, long j12, boolean z12, @k String str) {
        this.button = c49815a;
        this.extraInfo = attributedText;
        this.id = j12;
        this.isSelected = z12;
        this.name = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C49815a getButton() {
        return this.button;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getExtraInfo() {
        return this.extraInfo;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }
}
