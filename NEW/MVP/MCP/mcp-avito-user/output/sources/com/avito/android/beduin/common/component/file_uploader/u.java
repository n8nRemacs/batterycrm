package com.avito.android.beduin.common.component.file_uploader;

import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.file_uploader.TextStyles;
import kotlin.Metadata;

/* compiled from: FileStylesProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/u;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BeduinComponentTheme f101328a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f101329b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f101330c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f101331d;

    public u(@Y61.k BeduinFileUploaderModel beduinFileUploaderModel) {
        String str;
        String str2;
        String str3;
        BeduinComponentTheme beduinComponentTheme;
        TextStyles.Companion companion = TextStyles.INSTANCE;
        TextStyles textStyles = beduinFileUploaderModel.getTextStyles();
        companion.getClass();
        this.f101328a = (textStyles == null || (beduinComponentTheme = textStyles._theme) == null) ? BeduinComponentTheme.AVITO_RE_23 : beduinComponentTheme;
        TextStyles textStyles2 = beduinFileUploaderModel.getTextStyles();
        companion.getClass();
        String str4 = "m2";
        this.f101329b = (textStyles2 == null || (str3 = textStyles2._fileNameStyle) == null) ? "m2" : str3;
        TextStyles textStyles3 = beduinFileUploaderModel.getTextStyles();
        companion.getClass();
        if (textStyles3 != null && (str2 = textStyles3._fileSizeStyle) != null) {
            str4 = str2;
        }
        this.f101330c = str4;
        TextStyles textStyles4 = beduinFileUploaderModel.getTextStyles();
        companion.getClass();
        this.f101331d = (textStyles4 == null || (str = textStyles4._errorStyle) == null) ? "s2" : str;
    }
}
