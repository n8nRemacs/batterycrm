package Pl0;

import Y61.l;
import com.avito.android.remote.spare_parts.generated.api.get_part_compatibilities_api_v_4.Car;
import kotlin.Metadata;

/* compiled from: GetPartCompatibilitiesApiV4Response.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"LPl0/c;", "", "Lcom/avito/android/remote/spare_parts/generated/api/get_part_compatibilities_api_v_4/Car;", "car", "LPl0/b;", "primaryButton", "secondaryButton", "", "subtitle", "title", "<init>", "(Lcom/avito/android/remote/spare_parts/generated/api/get_part_compatibilities_api_v_4/Car;LPl0/b;LPl0/b;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/spare_parts/generated/api/get_part_compatibilities_api_v_4/Car;", "a", "()Lcom/avito/android/remote/spare_parts/generated/api/get_part_compatibilities_api_v_4/Car;", "LPl0/b;", "b", "()LPl0/b;", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pl0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14805c {

    @com.google.gson.annotations.c("car")
    @l
    private final Car car;

    @com.google.gson.annotations.c("primaryButton")
    @l
    private final C14804b primaryButton;

    @com.google.gson.annotations.c("secondaryButton")
    @l
    private final C14804b secondaryButton;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public C14805c(@l Car car, @l C14804b c14804b, @l C14804b c14804b2, @l String str, @l String str2) {
        this.car = car;
        this.primaryButton = c14804b;
        this.secondaryButton = c14804b2;
        this.subtitle = str;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Car getCar() {
        return this.car;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C14804b getPrimaryButton() {
        return this.primaryButton;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C14804b getSecondaryButton() {
        return this.secondaryButton;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
