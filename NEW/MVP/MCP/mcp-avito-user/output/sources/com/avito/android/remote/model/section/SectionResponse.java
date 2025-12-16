package com.avito.android.remote.model.section;

import Y61.k;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SectionResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/section/SectionResponse;", "", "sections", "", "Lcom/avito/android/remote/model/section/SectionTypeElement;", "(Ljava/util/List;)V", "getSections", "()Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SectionResponse {

    @c("list")
    @k
    private final List<SectionTypeElement> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public SectionResponse(@k List<? extends SectionTypeElement> list) {
        this.sections = list;
    }

    @k
    public final List<SectionTypeElement> getSections() {
        return this.sections;
    }
}
