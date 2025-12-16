package com.avito.beduin.v2.interaction.status_bar.flow;

import com.avito.android.remote.model.text.FontStyleKt;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StatusBarContentAppearance.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/status_bar/flow/StatusBarContentAppearance;", "", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StatusBarContentAppearance {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ StatusBarContentAppearance[] f337857b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f337858c;

    static {
        StatusBarContentAppearance[] statusBarContentAppearanceArr = {new StatusBarContentAppearance("auto", 0), new StatusBarContentAppearance("dark", 1), new StatusBarContentAppearance(FontStyleKt.LIGHT, 2)};
        f337857b = statusBarContentAppearanceArr;
        f337858c = kotlin.enums.c.a(statusBarContentAppearanceArr);
    }

    public StatusBarContentAppearance() {
        throw null;
    }

    public static StatusBarContentAppearance valueOf(String str) {
        return (StatusBarContentAppearance) Enum.valueOf(StatusBarContentAppearance.class, str);
    }

    public static StatusBarContentAppearance[] values() {
        return (StatusBarContentAppearance[]) f337857b.clone();
    }
}
