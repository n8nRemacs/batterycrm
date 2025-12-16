package com.avito.android.rating_form.api.remote.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RatingFormButtonStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", "", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ButtonStyle {

    @c("primary")
    public static final ButtonStyle PRIMARY;

    @c("secondary")
    public static final ButtonStyle SECONDARY;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ButtonStyle[] f247975b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f247976c;

    static {
        ButtonStyle buttonStyle = new ButtonStyle("PRIMARY", 0);
        PRIMARY = buttonStyle;
        ButtonStyle buttonStyle2 = new ButtonStyle("SECONDARY", 1);
        SECONDARY = buttonStyle2;
        ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
        f247975b = buttonStyleArr;
        f247976c = kotlin.enums.c.a(buttonStyleArr);
    }

    private ButtonStyle(String str, int i12) {
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) f247975b.clone();
    }
}
