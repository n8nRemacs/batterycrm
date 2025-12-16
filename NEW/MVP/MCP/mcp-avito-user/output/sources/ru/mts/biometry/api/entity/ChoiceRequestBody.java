package ru.mts.biometry.api.entity;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ChoiceRequestBody.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/mts/biometry/api/entity/ChoiceRequestBody;", "", "", "identificationType", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getIdentificationType", "()Ljava/lang/String;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ChoiceRequestBody {

    @c("identificationType")
    @k
    private final String identificationType;

    public ChoiceRequestBody(@k String str) {
        this.identificationType = str;
    }
}
