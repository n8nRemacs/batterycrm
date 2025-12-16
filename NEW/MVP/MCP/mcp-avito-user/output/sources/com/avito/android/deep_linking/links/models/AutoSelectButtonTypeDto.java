package com.avito.android.deep_linking.links.models;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoSelectButtonTypeDto.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/models/AutoSelectButtonTypeDto;", "", "(Ljava/lang/String;I)V", "URL", "BACK", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AutoSelectButtonTypeDto {

    @c("back")
    public static final AutoSelectButtonTypeDto BACK;

    @c(ContextActionHandler.Link.URL)
    public static final AutoSelectButtonTypeDto URL;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AutoSelectButtonTypeDto[] f134013b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f134014c;

    static {
        AutoSelectButtonTypeDto autoSelectButtonTypeDto = new AutoSelectButtonTypeDto("URL", 0);
        URL = autoSelectButtonTypeDto;
        AutoSelectButtonTypeDto autoSelectButtonTypeDto2 = new AutoSelectButtonTypeDto("BACK", 1);
        BACK = autoSelectButtonTypeDto2;
        AutoSelectButtonTypeDto[] autoSelectButtonTypeDtoArr = {autoSelectButtonTypeDto, autoSelectButtonTypeDto2};
        f134013b = autoSelectButtonTypeDtoArr;
        f134014c = kotlin.enums.c.a(autoSelectButtonTypeDtoArr);
    }

    private AutoSelectButtonTypeDto(String str, int i12) {
    }

    public static AutoSelectButtonTypeDto valueOf(String str) {
        return (AutoSelectButtonTypeDto) Enum.valueOf(AutoSelectButtonTypeDto.class, str);
    }

    public static AutoSelectButtonTypeDto[] values() {
        return (AutoSelectButtonTypeDto[]) f134013b.clone();
    }
}
