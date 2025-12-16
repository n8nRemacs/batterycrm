package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: VerificationOptionsListResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/model/VerificationOptionsListResult;", "", "title", "", "description", "optionsList", "", "Lcom/avito/android/remote/model/VerificationOption;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getOptionsList", "()Ljava/util/List;", "getTitle", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VerificationOptionsListResult {

    @c("description")
    @l
    private final String description;

    @c("options_list")
    @k
    private final List<VerificationOption> optionsList;

    @c("title")
    @l
    private final String title;

    public VerificationOptionsListResult(@l String str, @l String str2, @k List<VerificationOption> list) {
        this.title = str;
        this.description = str2;
        this.optionsList = list;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @k
    public final List<VerificationOption> getOptionsList() {
        return this.optionsList;
    }

    @l
    public final String getTitle() {
        return this.title;
    }
}
