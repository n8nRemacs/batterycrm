package com.avito.android.beduin.v2.page;

import com.avito.android.remote.model.text.FontStyleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseBeduinV2PageActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/v2/page/ForcedTheme;", "", "a", "_design-modules_beduin-v2-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ForcedTheme {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f104800c;

    /* renamed from: d, reason: collision with root package name */
    public static final ForcedTheme f104801d;

    /* renamed from: e, reason: collision with root package name */
    public static final ForcedTheme f104802e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ForcedTheme[] f104803f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f104804g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f104805b;

    /* compiled from: BaseBeduinV2PageActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/ForcedTheme$a;", "", "<init>", "()V", "_design-modules_beduin-v2-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.l
        public static ForcedTheme a(@Y61.l String str) {
            ForcedTheme forcedTheme = ForcedTheme.f104801d;
            if (L.f(str, FontStyleKt.LIGHT)) {
                return forcedTheme;
            }
            ForcedTheme forcedTheme2 = ForcedTheme.f104802e;
            if (L.f(str, "dark")) {
                return forcedTheme2;
            }
            return null;
        }

        public a() {
        }
    }

    static {
        ForcedTheme forcedTheme = new ForcedTheme("LIGHT", 0, FontStyleKt.LIGHT);
        f104801d = forcedTheme;
        ForcedTheme forcedTheme2 = new ForcedTheme("DARK", 1, "dark");
        f104802e = forcedTheme2;
        ForcedTheme[] forcedThemeArr = {forcedTheme, forcedTheme2};
        f104803f = forcedThemeArr;
        f104804g = kotlin.enums.c.a(forcedThemeArr);
        f104800c = new a(null);
    }

    public ForcedTheme(String str, int i12, String str2) {
        this.f104805b = str2;
    }

    public static ForcedTheme valueOf(String str) {
        return (ForcedTheme) Enum.valueOf(ForcedTheme.class, str);
    }

    public static ForcedTheme[] values() {
        return (ForcedTheme[]) f104803f.clone();
    }
}
