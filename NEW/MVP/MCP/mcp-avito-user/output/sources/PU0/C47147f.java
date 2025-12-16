package pu0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: Api1SfConditionsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lpu0/f;", "", "Lcom/avito/android/remote/model/Image;", "image", "", "mainValue", "primaryTitle", "secondaryTitle", "status", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pu0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47147f {

    @com.google.gson.annotations.c("image")
    @l
    private final Image image;

    @com.google.gson.annotations.c("mainValue")
    @k
    private final String mainValue;

    @com.google.gson.annotations.c("primaryTitle")
    @k
    private final String primaryTitle;

    @com.google.gson.annotations.c("secondaryTitle")
    @k
    private final String secondaryTitle;

    @com.google.gson.annotations.c("status")
    @k
    private final String status;

    public C47147f(@l Image image, @k String str, @k String str2, @k String str3, @k String str4) {
        this.image = image;
        this.mainValue = str;
        this.primaryTitle = str2;
        this.secondaryTitle = str3;
        this.status = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getMainValue() {
        return this.mainValue;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getPrimaryTitle() {
        return this.primaryTitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getSecondaryTitle() {
        return this.secondaryTitle;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getStatus() {
        return this.status;
    }
}
