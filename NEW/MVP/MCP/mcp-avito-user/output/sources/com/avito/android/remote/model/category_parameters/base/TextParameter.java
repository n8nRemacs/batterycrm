package com.avito.android.remote.model.category_parameters.base;

import Y61.l;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: TextParameter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b8&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/TextParameter;", "Lcom/avito/android/remote/model/category_parameters/base/HasConstraints;", "Lcom/avito/android/remote/model/category_parameters/base/HasPlaceholder;", "displayingOptions", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "hint", "", "getHint$annotations", "()V", "getHint", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TextParameter extends HasConstraints, HasPlaceholder {
    @l
    DisplayingOptions getDisplayingOptions();

    @l
    String getHint();

    /* compiled from: TextParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @InterfaceC42830m
        public static /* synthetic */ void getHint$annotations() {
        }
    }
}
